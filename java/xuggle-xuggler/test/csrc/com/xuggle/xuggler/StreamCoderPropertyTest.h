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

#ifndef __STREAMCODERPROPERTY_TEST_H__
#define __STREAMCODERPROPERTY_TEST_H__

#include <com/xuggle/testutils/TestUtils.h>
#include "Helper.h"
using namespace VS_CPP_NAMESPACE;

class StreamCoderPropertyTest : public CxxTest::TestSuite
{
  public:
    StreamCoderPropertyTest();
    virtual ~StreamCoderPropertyTest();
    void setUp();
    void tearDown();
    void testSetProperty();
    void testGetProperty();
    void testGetNumProperties();
    void testGetPropertyMetaData();
    void testGetNumFlagSettings();
    void testGetPropertyAsDouble();
  private:
    Helper* h;
    Helper* hw;

    RefPointer<IStreamCoder> coder;
};


#endif // __STREAMCODERPROPERTY_TEST_H__
