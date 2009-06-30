/*
 * MetaData.cpp
 *
 *  Created on: Jun 29, 2009
 *      Author: aclarke
 */

#include "MetaData.h"

namespace com
{

namespace xuggle
{

namespace xuggler
{

MetaData :: MetaData()
{
  mMetaData = 0;
}

MetaData :: ~MetaData()
{
  if (mMetaData)
    av_metadata_free(&mMetaData);
  mMetaData = 0;
}

int32_t
MetaData :: getNumKeys()
{
  if (!mMetaData)
    return 0;
  
  AVMetadataTag* tag=0;
  int32_t retval=0;
  do
  {
    tag = av_metadata_get(mMetaData, "", tag, AV_METADATA_IGNORE_SUFFIX);
    if (tag)
      retval++;
  } while(tag);
  return retval;
}

const char*
MetaData :: getKey(int32_t index)
{
  if (!mMetaData || index < 0)
    return 0;

  AVMetadataTag* tag=0;
  int32_t position=-1;
  do
  {
    tag = av_metadata_get(mMetaData, "", tag, AV_METADATA_IGNORE_SUFFIX);
    if (tag) {
      position++;
      if (position == index)
        return tag->key;
    }
  } while(tag);
  return 0;
}
const char*
MetaData :: getValue(const char *key, Flags flag)
{
   if (!mMetaData || !key || !*key)
     return 0;
   AVMetadataTag* tag = av_metadata_get(mMetaData, key, 0, (int)flag);
   if (tag)
     return tag->value;
   else
     return 0;
}

int32_t
MetaData :: setValue(const char* key, const char* value)
{
  if (!key || !*key)
    return -1;
  return (int32_t)av_metadata_set(&mMetaData, key, value);
}

MetaData*
MetaData :: make(AVMetadata* metaDataToCopy)
{
  MetaData* retval = make();
  if (retval && metaDataToCopy)
  {
    AVMetadataTag* tag = 0;
    do {
      tag = av_metadata_get(metaDataToCopy, "", tag, 
          AV_METADATA_IGNORE_SUFFIX);
      if (tag)
        if (av_metadata_set(&retval->mMetaData, tag->key, tag->value) < 0)
        {
          VS_REF_RELEASE(retval);
          break;
        }
    } while(tag);
  }
  return retval;
}

int32_t
MetaData :: override(AVMetadata **dest)
{
  if (!dest)
    return -1;
  if (*dest)
    av_metadata_free(dest);
  *dest = 0;
  if (!mMetaData)
    return 0;
  
  AVMetadataTag* tag = 0;
  do {
    tag = av_metadata_get(mMetaData, "", tag, 
        AV_METADATA_IGNORE_SUFFIX);
    if (tag) {
      int32_t retval = av_metadata_set(dest,
          tag->key, tag->value);
      if (retval < 0)
      {
        return retval;
      }
    }
  } while(tag);
    
  return 0;
}
}}}
