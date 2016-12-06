/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robclouth.art_nanovg.nanovg;

public class GLNVGtexture {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GLNVGtexture(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GLNVGtexture obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nanovgJNI.delete_GLNVGtexture(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    nanovgJNI.GLNVGtexture_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return nanovgJNI.GLNVGtexture_id_get(swigCPtr, this);
  }

  public void setTex(SWIGTYPE_p_GLuint value) {
    nanovgJNI.GLNVGtexture_tex_set(swigCPtr, this, SWIGTYPE_p_GLuint.getCPtr(value));
  }

  public SWIGTYPE_p_GLuint getTex() {
    return new SWIGTYPE_p_GLuint(nanovgJNI.GLNVGtexture_tex_get(swigCPtr, this), true);
  }

  public void setWidth(int value) {
    nanovgJNI.GLNVGtexture_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return nanovgJNI.GLNVGtexture_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    nanovgJNI.GLNVGtexture_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return nanovgJNI.GLNVGtexture_height_get(swigCPtr, this);
  }

  public void setType(int value) {
    nanovgJNI.GLNVGtexture_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return nanovgJNI.GLNVGtexture_type_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    nanovgJNI.GLNVGtexture_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return nanovgJNI.GLNVGtexture_flags_get(swigCPtr, this);
  }

  public GLNVGtexture() {
    this(nanovgJNI.new_GLNVGtexture(), true);
  }

}