package com.google.android.filament;

import com.google.android.filament.Colors;
import com.google.android.filament.Material;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("AssetLoader.cpp")
public class MaterialInstance {
    private static final Material.CullingMode[] sCullingModeValues = Material.CullingMode.values();
    static final int[] sStencilFaceMapping = {1, 2, 3};
    private Material mMaterial;
    private String mName;
    private long mNativeMaterial;
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum BooleanElement {
        BOOL,
        BOOL2,
        BOOL3,
        BOOL4
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FloatElement {
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        MAT3,
        MAT4
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum IntElement {
        INT,
        INT2,
        INT3,
        INT4
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StencilFace {
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StencilOperation {
        KEEP,
        ZERO,
        REPLACE,
        INCR_CLAMP,
        INCR_WRAP,
        DECR_CLAMP,
        DECR_WRAP,
        INVERT
    }

    public MaterialInstance(Engine engine, long j10) {
        this.mNativeObject = j10;
        this.mNativeMaterial = nGetMaterial(j10);
    }

    public static MaterialInstance duplicate(MaterialInstance materialInstance, String str) {
        long jNDuplicate = nDuplicate(materialInstance.mNativeObject, str);
        if (jNDuplicate != 0) {
            return new MaterialInstance(materialInstance.getMaterial(), jNDuplicate);
        }
        throw new IllegalStateException("Couldn't duplicate MaterialInstance");
    }

    private static native long nDuplicate(long j10, String str);

    private static native int nGetCullingMode(long j10);

    private static native int nGetDepthFunc(long j10);

    private static native float nGetMaskThreshold(long j10);

    private static native long nGetMaterial(long j10);

    private static native String nGetName(long j10);

    private static native int nGetShadowCullingMode(long j10);

    private static native float nGetSpecularAntiAliasingThreshold(long j10);

    private static native float nGetSpecularAntiAliasingVariance(long j10);

    private static native boolean nIsColorWriteEnabled(long j10);

    private static native boolean nIsDepthCullingEnabled(long j10);

    private static native boolean nIsDepthWriteEnabled(long j10);

    private static native boolean nIsDoubleSided(long j10);

    private static native boolean nIsStencilWriteEnabled(long j10);

    private static native void nSetBooleanParameterArray(long j10, String str, int i10, boolean[] zArr, int i11, int i12);

    private static native void nSetColorWrite(long j10, boolean z10);

    private static native void nSetCullingMode(long j10, long j11);

    private static native void nSetCullingModeSeparate(long j10, long j11, long j12);

    private static native void nSetDepthCulling(long j10, boolean z10);

    private static native void nSetDepthFunc(long j10, long j11);

    private static native void nSetDepthWrite(long j10, boolean z10);

    private static native void nSetDoubleSided(long j10, boolean z10);

    private static native void nSetFloatParameterArray(long j10, String str, int i10, float[] fArr, int i11, int i12);

    private static native void nSetIntParameterArray(long j10, String str, int i10, int[] iArr, int i11, int i12);

    private static native void nSetMaskThreshold(long j10, float f10);

    private static native void nSetParameterBool(long j10, String str, boolean z10);

    private static native void nSetParameterBool2(long j10, String str, boolean z10, boolean z11);

    private static native void nSetParameterBool3(long j10, String str, boolean z10, boolean z11, boolean z12);

    private static native void nSetParameterBool4(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13);

    private static native void nSetParameterFloat(long j10, String str, float f10);

    private static native void nSetParameterFloat2(long j10, String str, float f10, float f11);

    private static native void nSetParameterFloat3(long j10, String str, float f10, float f11, float f12);

    private static native void nSetParameterFloat4(long j10, String str, float f10, float f11, float f12, float f13);

    private static native void nSetParameterInt(long j10, String str, int i10);

    private static native void nSetParameterInt2(long j10, String str, int i10, int i11);

    private static native void nSetParameterInt3(long j10, String str, int i10, int i11, int i12);

    private static native void nSetParameterInt4(long j10, String str, int i10, int i11, int i12, int i13);

    private static native void nSetParameterTexture(long j10, String str, long j11, long j12);

    private static native void nSetPolygonOffset(long j10, float f10, float f11);

    private static native void nSetScissor(long j10, int i10, int i11, int i12, int i13);

    private static native void nSetSpecularAntiAliasingThreshold(long j10, float f10);

    private static native void nSetSpecularAntiAliasingVariance(long j10, float f10);

    private static native void nSetStencilCompareFunction(long j10, long j11, long j12);

    private static native void nSetStencilOpDepthFail(long j10, long j11, long j12);

    private static native void nSetStencilOpDepthStencilPass(long j10, long j11, long j12);

    private static native void nSetStencilOpStencilFail(long j10, long j11, long j12);

    private static native void nSetStencilReadMask(long j10, int i10, long j11);

    private static native void nSetStencilReferenceValue(long j10, int i10, long j11);

    private static native void nSetStencilWrite(long j10, boolean z10);

    private static native void nSetStencilWriteMask(long j10, int i10, long j11);

    private static native void nUnsetScissor(long j10);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public Material.CullingMode getCullingMode() {
        return sCullingModeValues[nGetCullingMode(getNativeObject())];
    }

    public TextureSampler.CompareFunction getDepthFunc() {
        return TextureSampler.EnumCache.sCompareFunctionValues[nGetDepthFunc(getNativeObject())];
    }

    public float getMaskThreshold() {
        return nGetMaskThreshold(getNativeObject());
    }

    public Material getMaterial() {
        if (this.mMaterial == null) {
            this.mMaterial = new Material(this.mNativeMaterial);
        }
        return this.mMaterial;
    }

    public String getName() {
        if (this.mName == null) {
            this.mName = nGetName(getNativeObject());
        }
        return this.mName;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed MaterialInstance");
    }

    public Material.CullingMode getShadowCullingMode() {
        return sCullingModeValues[nGetShadowCullingMode(getNativeObject())];
    }

    public float getSpecularAntiAliasingThreshold() {
        return nGetSpecularAntiAliasingThreshold(getNativeObject());
    }

    public float getSpecularAntiAliasingVariance() {
        return nGetSpecularAntiAliasingVariance(getNativeObject());
    }

    public boolean isColorWriteEnabled() {
        return nIsColorWriteEnabled(getNativeObject());
    }

    public boolean isDepthCullingEnabled() {
        return nIsDepthCullingEnabled(getNativeObject());
    }

    public boolean isDepthWriteEnabled() {
        return nIsDepthWriteEnabled(getNativeObject());
    }

    public boolean isDoubleSided() {
        return nIsDoubleSided(getNativeObject());
    }

    public boolean isStencilWriteEnabled() {
        return nIsStencilWriteEnabled(getNativeObject());
    }

    public void setColorWrite(boolean z10) {
        nSetColorWrite(getNativeObject(), z10);
    }

    public void setCullingMode(Material.CullingMode cullingMode) {
        nSetCullingMode(getNativeObject(), cullingMode.ordinal());
    }

    public void setDepthCulling(boolean z10) {
        nSetDepthCulling(getNativeObject(), z10);
    }

    public void setDepthFunc(TextureSampler.CompareFunction compareFunction) {
        nSetDepthFunc(getNativeObject(), compareFunction.ordinal());
    }

    public void setDepthWrite(boolean z10) {
        nSetDepthWrite(getNativeObject(), z10);
    }

    public void setDoubleSided(boolean z10) {
        nSetDoubleSided(getNativeObject(), z10);
    }

    public void setMaskThreshold(float f10) {
        nSetMaskThreshold(getNativeObject(), f10);
    }

    public void setParameter(String str, boolean z10) {
        nSetParameterBool(getNativeObject(), str, z10);
    }

    public void setPolygonOffset(float f10, float f11) {
        nSetPolygonOffset(getNativeObject(), f10, f11);
    }

    public void setScissor(int i10, int i11, int i12, int i13) {
        nSetScissor(getNativeObject(), i10, i11, i12, i13);
    }

    public void setSpecularAntiAliasingThreshold(float f10) {
        nSetSpecularAntiAliasingThreshold(getNativeObject(), f10);
    }

    public void setSpecularAntiAliasingVariance(float f10) {
        nSetSpecularAntiAliasingVariance(getNativeObject(), f10);
    }

    public void setStencilCompareFunction(TextureSampler.CompareFunction compareFunction, StencilFace stencilFace) {
        nSetStencilCompareFunction(getNativeObject(), compareFunction.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilOpDepthFail(StencilOperation stencilOperation, StencilFace stencilFace) {
        nSetStencilOpDepthFail(getNativeObject(), stencilOperation.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilOpDepthStencilPass(StencilOperation stencilOperation, StencilFace stencilFace) {
        nSetStencilOpDepthStencilPass(getNativeObject(), stencilOperation.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilOpStencilFail(StencilOperation stencilOperation, StencilFace stencilFace) {
        nSetStencilOpStencilFail(getNativeObject(), stencilOperation.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilReadMask(int i10, StencilFace stencilFace) {
        nSetStencilReadMask(getNativeObject(), i10, sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilReferenceValue(int i10, StencilFace stencilFace) {
        nSetStencilReferenceValue(getNativeObject(), i10, sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilWrite(boolean z10) {
        nSetStencilWrite(getNativeObject(), z10);
    }

    public void setStencilWriteMask(int i10, StencilFace stencilFace) {
        nSetStencilWriteMask(getNativeObject(), i10, sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void unsetScissor() {
        nUnsetScissor(getNativeObject());
    }

    public void setCullingMode(Material.CullingMode cullingMode, Material.CullingMode cullingMode2) {
        nSetCullingModeSeparate(getNativeObject(), cullingMode.ordinal(), cullingMode2.ordinal());
    }

    public void setParameter(String str, float f10) {
        nSetParameterFloat(getNativeObject(), str, f10);
    }

    public void setStencilReadMask(int i10) {
        setStencilReadMask(i10, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilReferenceValue(int i10) {
        setStencilReferenceValue(i10, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilWriteMask(int i10) {
        setStencilWriteMask(i10, StencilFace.FRONT_AND_BACK);
    }

    public void setParameter(String str, int i10) {
        nSetParameterInt(getNativeObject(), str, i10);
    }

    public MaterialInstance(Material material, long j10) {
        this.mMaterial = material;
        this.mNativeMaterial = material.getNativeObject();
        this.mNativeObject = j10;
    }

    public void setParameter(String str, boolean z10, boolean z11) {
        nSetParameterBool2(getNativeObject(), str, z10, z11);
    }

    public void setStencilCompareFunction(TextureSampler.CompareFunction compareFunction) {
        setStencilCompareFunction(compareFunction, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilOpDepthFail(StencilOperation stencilOperation) {
        setStencilOpDepthFail(stencilOperation, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilOpDepthStencilPass(StencilOperation stencilOperation) {
        setStencilOpDepthStencilPass(stencilOperation, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilOpStencilFail(StencilOperation stencilOperation) {
        setStencilOpStencilFail(stencilOperation, StencilFace.FRONT_AND_BACK);
    }

    public void setParameter(String str, float f10, float f11) {
        nSetParameterFloat2(getNativeObject(), str, f10, f11);
    }

    public void setParameter(String str, int i10, int i11) {
        nSetParameterInt2(getNativeObject(), str, i10, i11);
    }

    public void setParameter(String str, boolean z10, boolean z11, boolean z12) {
        nSetParameterBool3(getNativeObject(), str, z10, z11, z12);
    }

    public MaterialInstance(long j10) {
        this.mNativeObject = j10;
        this.mNativeMaterial = nGetMaterial(j10);
    }

    public void setParameter(String str, float f10, float f11, float f12) {
        nSetParameterFloat3(getNativeObject(), str, f10, f11, f12);
    }

    public void setParameter(String str, int i10, int i11, int i12) {
        nSetParameterInt3(getNativeObject(), str, i10, i11, i12);
    }

    public void setParameter(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        nSetParameterBool4(getNativeObject(), str, z10, z11, z12, z13);
    }

    public void setParameter(String str, float f10, float f11, float f12, float f13) {
        nSetParameterFloat4(getNativeObject(), str, f10, f11, f12, f13);
    }

    public void setParameter(String str, int i10, int i11, int i12, int i13) {
        nSetParameterInt4(getNativeObject(), str, i10, i11, i12, i13);
    }

    public void setParameter(String str, Texture texture, TextureSampler textureSampler) {
        nSetParameterTexture(getNativeObject(), str, texture.getNativeObject(), textureSampler.mSampler);
    }

    public void setParameter(String str, BooleanElement booleanElement, boolean[] zArr, int i10, int i11) {
        nSetBooleanParameterArray(getNativeObject(), str, booleanElement.ordinal(), zArr, i10, i11);
    }

    public void setParameter(String str, IntElement intElement, int[] iArr, int i10, int i11) {
        nSetIntParameterArray(getNativeObject(), str, intElement.ordinal(), iArr, i10, i11);
    }

    public void setParameter(String str, FloatElement floatElement, float[] fArr, int i10, int i11) {
        nSetFloatParameterArray(getNativeObject(), str, floatElement.ordinal(), fArr, i10, i11);
    }

    public void setParameter(String str, Colors.RgbType rgbType, float f10, float f11, float f12) {
        float[] linear = Colors.toLinear(rgbType, f10, f11, f12);
        nSetParameterFloat3(getNativeObject(), str, linear[0], linear[1], linear[2]);
    }

    public void setParameter(String str, Colors.RgbaType rgbaType, float f10, float f11, float f12, float f13) {
        float[] linear = Colors.toLinear(rgbaType, f10, f11, f12, f13);
        nSetParameterFloat4(getNativeObject(), str, linear[0], linear[1], linear[2], linear[3]);
    }
}
