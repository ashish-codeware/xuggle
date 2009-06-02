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
package com.xuggle.mediatool;

import java.util.Collection;

/**
 * Provides an implementation of {@link IMediaGenerator} that manages
 * {@link IMediaListener}s as a thread-safe set.
 * 
 * The is fast to iterate over -- at the expense of a copy on
 * {@link #addListener(IMediaListener)} and
 * {@link #removeListener(IMediaListener)}.
 * 
 * @author trebor
 * @author aclarke
 * 
 */
public class MediaGeneratorAdapter extends AMediaToolMixin implements
    IMediaGenerator
{
  /*
   * Implementation note: We declare and forward to our parent every method in
   * IMediaGenerator so that it shows up obviously in JavaDoc that these are the
   * main methods people might override.
   */

  /**
   * {@inheritDoc}
   */
  public boolean addListener(IMediaListener listener)
  {
    return super.addListener(listener);
  }

  /**
   * {@inheritDoc}
   */
  public Collection<IMediaListener> getListeners()
  {
    return super.getListeners();
  }

  /**
   * {@inheritDoc}
   */
  public boolean removeListener(IMediaListener listener)
  {
    return super.removeListener(listener);
  }

}