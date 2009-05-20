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

#ifndef __TIMEVALUE_TEST_H__
#define __TIMEVALUE_TEST_H__

#include <com/xuggle/testutils/TestUtils.h>
#include <com/xuggle/ferry/RefPointer.h>
#include <com/xuggle/xuggler/ITimeValue.h>
using namespace com::xuggle::ferry;
using namespace VS_CPP_NAMESPACE;

class TimeValueTest : public CxxTest::TestSuite
{
  public:
    void setUp();
    void testCreationAndDestruction();
    void testGetViaDowngrade();
    void testGetViaUpgrade();
    void testCompareTo();
  private:
    RefPointer<ITimeValue> mObj;
};


#endif // __TIMEVALUE_TEST_H__
