/*
 * This file is part of Xuggler.
 * 
 * Xuggler is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Xuggler is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public
 * License along with Xuggler.  If not, see <http://www.gnu.org/licenses/>.
 */

#ifndef IMEDIADATA_H_
#define IMEDIADATA_H_

#include <com/xuggle/xuggler/Xuggler.h>
#include <com/xuggle/ferry/RefCounted.h>
#include <com/xuggle/ferry/IBuffer.h>
#include <com/xuggle/xuggler/IRational.h>

namespace com { namespace xuggle { namespace xuggler {

/**
 * The parent class of all media objects than can be gotten from an {@link IStream}.
 */
class VS_API_XUGGLER IMediaData: public com::xuggle::ferry::RefCounted
{
public:
  /**
   * Get the time stamp of this object in getTimeBase() units.
   * 
   * @return the time stamp
   */
  virtual int64_t getTimeStamp()=0;
  
  /**
   * Set the time stamp for this object in getTimeBase() units.
   * 
   * @param aTimeStamp The time stamp
   */
  virtual void setTimeStamp(int64_t aTimeStamp)=0;
  
  /**
   * Get the time base that time stamps of this object are represented in.
   * 
   * Caller must release the returned value.
   * 
   * @return the time base.
   */
  virtual IRational* getTimeBase()=0;
  
  /**
   * Set the time base that time stamps of this object are represented in.
   * 
   * @param aBase the new time base.  If null an exception is thrown.
   */
  virtual void setTimeBase(IRational *aBase)=0;
  
  /**
   * Get any underlying raw data available for this object.
   * 
   * @return The raw data, or null if not accessible.
   */
  virtual com::xuggle::ferry::IBuffer* getData()=0;
  
  /**
   * Get the size in bytes of the raw data available for this object.
   * 
   * @return the size in bytes, or -1 if it cannot be computed.
   */
  virtual int32_t getSize()=0;
  
  /**
   * Is this object a key object?  i.e. it can be interpreted without needing any other media objects
   * 
   * @return true if it's a key, false if not
   */
  virtual bool isKey()=0;

protected:
  IMediaData();
  virtual ~IMediaData();
};

}}}

#endif /* IMEDIADATA_H_ */