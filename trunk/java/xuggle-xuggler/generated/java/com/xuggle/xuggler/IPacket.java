/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Represents an encoded piece of data that can be placed in an {@link 
 * IContainer}  
 * for a given {@link IStream} of data.  
 * <p>  
 * You read this object out of {@link IContainer} objects when decoding, 
 * and  
 * pass to an {@link IStreamCoder} object to decode.  
 * </p><p>  
 * You pass this object to a {@link IStreamCoder} to encode data, and 
 * then  
 *  
 * </p><p>  
 * Lastly, the units of timestamps in an {@link IPacket} are determined 
 * by the  
 * {@link IContainer} it came from (or is going to). For example, FLV 
 * {@link IPacket}s  
 * are always in milliseconds (1/1000 of a second). You cannot assume 
 * these  
 * timestamps are in any given timeunit without getting an {@link IStream} 
 * object  
 * and finding out what Time Base that stream operates in.  
 * </p><p>  
 * For convenience, the Xuggler API always uses Microseconds for raw 
 * data  
 * ({@link IVideoPicture} and {@link IAudioSamples} objects), and will 
 * convert to  
 * the right time stamp unit when decoding or encoding data (with an 
 * {@link IStreamCoder})  
 * from or to an {@link IContainer}.  
 */
public class IPacket extends IMediaData {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  protected IPacket(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIPacketUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IPacket obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IPacket object that is actually referring to the
   * exact same underlying Native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IPacket copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IPacket retval = new IPacket(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IPacket)
      equal = (((IPacket)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }


  /**
   * info about this packet
   * @return information about this packet
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("complete:"+isComplete()+";");
    result.append("dts:"+getDts()+";");
    result.append("pts:"+getPts()+";");
    result.append("size:"+getSize()+";");
    result.append("key:"+isKey()+";");
    result.append("flags:"+getFlags()+";");
    result.append("stream index:"+getStreamIndex()+";");
    result.append("duration:"+getDuration()+";");
    result.append("position:"+getPosition()+";");
    result.append("time base:"+getTimeBase()+";");
    result.append("]");
    return result.toString();
  }


/**
 * Clear out any data in this packet, but leaves  
 * the buffer available for reuse.  
 */
  public void reset() {
    XugglerJNI.IPacket_reset(swigCPtr, this);
  }

/**
 * @return	Is this packet full and therefore has valid information. 
 *		  
 */
  public boolean isComplete() {
    return XugglerJNI.IPacket_isComplete(swigCPtr, this);
  }

/**
 * @return	Get the Presentation Timestamp for this packet.  
 */
  public long getPts() {
    return XugglerJNI.IPacket_getPts(swigCPtr, this);
  }

/**
 * @param	aPts a new PTS for this packet.  
 */
  public void setPts(long aPts) {
    XugglerJNI.IPacket_setPts(swigCPtr, this, aPts);
  }

/**
 * @return	Get the Decompression Timestamp (i.e. when this was read 
 *		 relative  
 * to the start of reading packets).  
 */
  public long getDts() {
    return XugglerJNI.IPacket_getDts(swigCPtr, this);
  }

/**
 * @param	aDts a new DTS for this packet.  
 */
  public void setDts(long aDts) {
    XugglerJNI.IPacket_setDts(swigCPtr, this, aDts);
  }

/**
 * @return	Size (in bytes) of payload currently in packet.  
 */
  public int getSize() {
    return XugglerJNI.IPacket_getSize(swigCPtr, this);
  }

/**
 * @return	Get maximum size (in bytes) of payload this packet can hold. 
 *		  
 */
  public int getMaxSize() {
    return XugglerJNI.IPacket_getMaxSize(swigCPtr, this);
  }

/**
 * @return	Stream in container that this packet has data for.  
 */
  public int getStreamIndex() {
    return XugglerJNI.IPacket_getStreamIndex(swigCPtr, this);
  }

/**
 * @return	Any flags on the packet. This is access to raw FFMPEG  
 * flags, but better to use the is* methods below.  
 */
  public int getFlags() {
    return XugglerJNI.IPacket_getFlags(swigCPtr, this);
  }

/**
 * @return	Does this packet contain Key data (i.e. data that needs no 
 *		 other  
 * frames or samples to decode).  
 */
  public boolean isKeyPacket() {
    return XugglerJNI.IPacket_isKeyPacket(swigCPtr, this);
  }

/**
 * @return	Duration of this packet, in same time-base as the PTS.  
 */
  public long getDuration() {
    return XugglerJNI.IPacket_getDuration(swigCPtr, this);
  }

/**
 * @return	The position of this packet in the stream.  
 */
  public long getPosition() {
    return XugglerJNI.IPacket_getPosition(swigCPtr, this);
  }

/**
 * @return	The raw data in this packet. The buffer size may be larger 
 *		  
 * than IPacket::getSize(), but only the bytes up to getSize()  
 * are valid.  
 */
  public IBuffer getData() {
    long cPtr = XugglerJNI.IPacket_getData(swigCPtr, this);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

/**
 * Discard the current payload and allocate a new payload.  
 * Note that if any people have access to the old payload using  
 * getData(), the memory will continue to be available to them  
 * until they release their hold of the IBuffer.  
 * @param	payloadSize The (minimum) payloadSize of this packet. The 
 *		 system  
 * may allocate a larger payloadSize.  
 * @return	>= 0 if successful. < 0 if error.  
 */
  public int allocateNewPayload(int payloadSize) {
    return XugglerJNI.IPacket_allocateNewPayload(swigCPtr, this, payloadSize);
  }

/**
 * Allocate a new packet.  
 * <p>  
 * Note that any buffers this packet needs will be  
 * lazily allocated (i.e. we won't actually grab all  
 * the memory until we need it).  
 * </p>  
 * @return	a new packet, or null on error.  
 */
  public static IPacket make() {
    long cPtr = XugglerJNI.IPacket_make__SWIG_0();
    return (cPtr == 0) ? null : new IPacket(cPtr, false);
  }

/**
 * Allocate a new packet that wraps an existing IBuffer.  
 * @param	buffer The IBuffer to wrap.  
 * @return	a new packet or null on error.  
 */
  public static IPacket make(IBuffer buffer) {
    long cPtr = XugglerJNI.IPacket_make__SWIG_1(IBuffer.getCPtr(buffer), buffer);
    return (cPtr == 0) ? null : new IPacket(cPtr, false);
  }

/**
 * Set if this is a key packet.  
 * @param	keyPacket true for yes, false for no.  
 */
  public void setKeyPacket(boolean keyPacket) {
    XugglerJNI.IPacket_setKeyPacket(swigCPtr, this, keyPacket);
  }

/**
 * Set any internal flags.  
 * @param	flags Flags to set  
 */
  public void setFlags(int flags) {
    XugglerJNI.IPacket_setFlags(swigCPtr, this, flags);
  }

/**
 * Set if this packet is complete, and what the total size of the data 
 * should be assumed to be.  
 * @param	complete True for complete, false for not.  
 * @param	size Size of data in packet.  
 */
  public void setComplete(boolean complete, int size) {
    XugglerJNI.IPacket_setComplete(swigCPtr, this, complete, size);
  }

/**
 * Set the stream index for this packet.  
 * @param	streamIndex The stream index, as determined from the {@link 
 *		 IContainer} this packet will be written to.  
 */
  public void setStreamIndex(int streamIndex) {
    XugglerJNI.IPacket_setStreamIndex(swigCPtr, this, streamIndex);
  }

/**
 * Set the duration.  
 * @param	duration new duration  
 */
  public void setDuration(long duration) {
    XugglerJNI.IPacket_setDuration(swigCPtr, this, duration);
  }

/**
 * Set the position  
 * @param	position new position  
 */
  public void setPosition(long position) {
    XugglerJNI.IPacket_setPosition(swigCPtr, this, position);
  }

/**
 * Time difference in {@link IStream#getTimeBase()} units  
 * from the presentation time stamp of this  
 * packet to the point at which the output from the decoder has converged 
 *  
 * independent from the availability of previous frames. That is, the 
 *  
 * frames are virtually identical no matter if decoding started from 
 *  
 * the very first frame or from this keyframe.  
 * Is {@link Global#NO_PTS} if unknown.  
 * This field is not the display duration of the current packet.  
 * <p>  
 * The purpose of this field is to allow seeking in streams that have 
 * no  
 * keyframes in the conventional sense. It corresponds to the  
 * recovery point SEI in H.264 and match_time_delta in NUT. It is also 
 *  
 *  
 * subtitles are correctly displayed after seeking.  
 * </p>  
 * <p>  
 * If you didn't follow that, try drinking one to two glasses  
 * of Absinthe. It won't help, but it'll be more fun.  
 * </p>  
 * @return	the convergence duration  
 */
  public long getConvergenceDuration() {
    return XugglerJNI.IPacket_getConvergenceDuration(swigCPtr, this);
  }

/**
 * Set the convergence duration.  
 * @param	duration the new duration  
 */
  public void setConvergenceDuration(long duration) {
    XugglerJNI.IPacket_setConvergenceDuration(swigCPtr, this, duration);
  }

/**
 * Allocate a new packet wrapping the existing contents of  
 * a passed in packet. Callers can then modify  
 * {@link #getPts()},  
 * {@link #getDts()} and other get/set methods without  
 * modifying the original packet.  
 * @param	packet Packet to reuse buffer from and to  
 * copy settings from.  
 * @param	copyData if true copy data from packet  
 * into our own buffer. If false, share the same  
 * data buffer that packet uses  
 * @return	a new packet or null on error.  
 */
  public static IPacket make(IPacket packet, boolean copyData) {
    long cPtr = XugglerJNI.IPacket_make__SWIG_2(IPacket.getCPtr(packet), packet, copyData);
    return (cPtr == 0) ? null : new IPacket(cPtr, false);
  }

}