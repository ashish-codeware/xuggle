/*
 * Copyright (c) 2008, 2009 by Xuggle Incorporated.  All rights reserved.
 * 
 * This file is part of Xuggler.
 * 
 * You can redistribute Xuggler and/or modify it under the terms of the GNU
 * Affero General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * Xuggler is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with Xuggler.  If not, see <http://www.gnu.org/licenses/>.
 */

#ifndef CONTAINERFORMAT_H_
#define CONTAINERFORMAT_H_

#include <com/xuggle/xuggler/IContainerFormat.h>
#include <com/xuggle/xuggler/FfmpegIncludes.h>

namespace com { namespace xuggle { namespace xuggler
{

  class ContainerFormat : public IContainerFormat
  {
    VS_JNIUTILS_REFCOUNTED_OBJECT(ContainerFormat)
  public:

    // IContainerFormat implementation
    virtual int32_t setInputFormat(const char *shortName);
    virtual int32_t setOutputFormat(const char*shortName,
        const char*url,
        const char* mimeType);
    
    virtual const char* getInputFormatShortName();
    virtual const char* getInputFormatLongName();

    virtual const char* getOutputFormatShortName();
    virtual const char* getOutputFormatLongName();
    virtual const char* getOutputFormatMimeType();

    
    AVInputFormat* getInputFormat();
    AVOutputFormat* getOutputFormat();
    void setInputFormat(AVInputFormat*);
    void setOutputFormat(AVOutputFormat*);
    
    virtual int32_t getInputFlags();
    virtual void setInputFlags(int32_t newFlags);
    virtual bool getInputFlag(Flags flag);
    virtual void setInputFlag(Flags flag, bool value);

    virtual int32_t getOutputFlags();
    virtual void setOutputFlags(int32_t newFlags);
    virtual bool getOutputFlag(Flags flag);
    virtual void setOutputFlag(Flags flag, bool value);


    virtual bool isOutput();
    virtual bool isInput();
    
  protected:
    ContainerFormat();
    virtual ~ContainerFormat();

  private:
    AVInputFormat *mInputFormat;
    AVOutputFormat *mOutputFormat;
  };

}}}

#endif /*CONTAINERFORMAT_H_*/