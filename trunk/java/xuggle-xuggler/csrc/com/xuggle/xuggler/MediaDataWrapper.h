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

#ifndef MEDIADATAWRAPPER_H_
#define MEDIADATAWRAPPER_H_

#include <com/xuggle/ferry/RefPointer.h>
#include <com/xuggle/xuggler/IMediaDataWrapper.h>

namespace com { namespace xuggle { namespace xuggler {

class MediaDataWrapper: public IMediaDataWrapper
{
  VS_JNIUTILS_REFCOUNTED_OBJECT(MediaDataWrapper);
public:
  virtual int64_t getTimeStamp();
  virtual void setTimeStamp(int64_t aTimeStamp);
  virtual IRational* getTimeBase();
  virtual void setTimeBase(IRational *aBase);
  virtual com::xuggle::ferry::IBuffer* getData();  
  virtual int32_t getSize();
  virtual bool isKey();
  virtual IMediaData* get();
  virtual void wrap(IMediaData* aObj);
  virtual void setKey(bool aIsKey);
  virtual IMediaData* unwrap();

  /**
   * Create a new IMediaDataWrapper that wraps a given object.
   * @param obj The object to wrap.  Can be null.
   * @return a new object, or null if we cannot allocate one.
   */
  static MediaDataWrapper* make(IMediaData* obj);
  
protected:
  MediaDataWrapper();
  virtual ~MediaDataWrapper();
  
private:
  int64_t mTimeStamp;
  com::xuggle::ferry::RefPointer<IRational> mTimeBase;
  com::xuggle::ferry::RefPointer<IMediaData> mWrapped;
  bool mIsKey;
};

}}}

#endif /* MEDIADATAWRAPPER_H_ */