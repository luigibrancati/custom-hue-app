package com.google.android.filament;

import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("AssetLoader.cpp")
public class Material {
    private final MaterialInstance mDefaultInstance;
    private long mNativeObject;
    private Set<VertexBuffer.VertexAttribute> mRequiredAttributes;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum BlendingMode {
        OPAQUE,
        TRANSPARENT,
        ADD,
        MASKED,
        FADE,
        MULTIPLY,
        SCREEN
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private Buffer mBuffer;
        private int mSize;
        private int mShBandCount = 0;
        private ShadowSamplingQuality mShadowSamplingQuality = ShadowSamplingQuality.LOW;
        private UboBatchingMode mUboBatchingMode = UboBatchingMode.DEFAULT;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum ShadowSamplingQuality {
            HARD,
            LOW
        }

        public Material build(Engine engine) {
            long jNBuilderBuild = Material.nBuilderBuild(engine.getNativeObject(), this.mBuffer, this.mSize, this.mShBandCount, this.mShadowSamplingQuality.ordinal(), this.mUboBatchingMode.ordinal());
            if (jNBuilderBuild != 0) {
                return new Material(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Material");
        }

        public Builder payload(Buffer buffer, int i10) {
            this.mBuffer = buffer;
            this.mSize = i10;
            return this;
        }

        public Builder shadowSamplingQuality(ShadowSamplingQuality shadowSamplingQuality) {
            this.mShadowSamplingQuality = shadowSamplingQuality;
            return this;
        }

        public Builder sphericalHarmonicsBandCount(int i10) {
            this.mShBandCount = i10;
            return this;
        }

        public Builder uboBatching(UboBatchingMode uboBatchingMode) {
            this.mUboBatchingMode = uboBatchingMode;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CompilerPriorityQueue {
        CRITICAL,
        HIGH,
        LOW
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CullingMode {
        NONE,
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class EnumCache {
        static final Shading[] sShadingValues = Shading.values();
        static final Interpolation[] sInterpolationValues = Interpolation.values();
        static final BlendingMode[] sBlendingModeValues = BlendingMode.values();
        static final RefractionMode[] sRefractionModeValues = RefractionMode.values();
        static final RefractionType[] sRefractionTypeValues = RefractionType.values();
        static final ReflectionMode[] sReflectionModeValues = ReflectionMode.values();
        static final Engine.FeatureLevel[] sFeatureLevelValues = Engine.FeatureLevel.values();
        static final VertexDomain[] sVertexDomainValues = VertexDomain.values();
        static final CullingMode[] sCullingModeValues = CullingMode.values();
        static final VertexBuffer.VertexAttribute[] sVertexAttributeValues = VertexBuffer.VertexAttribute.values();

        private EnumCache() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Interpolation {
        SMOOTH,
        FLAT
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @UsedByNative("Material.cpp")
    public static class Parameter {
        public final int count;
        public final String name;
        public final Precision precision;
        public final Type type;
        private static final Type[] sTypeValues = Type.values();

        @UsedByNative("Material.cpp")
        private static final int SAMPLER_OFFSET = Type.MAT4.ordinal() + 1;

        @UsedByNative("Material.cpp")
        private static final int SUBPASS_OFFSET = Type.SAMPLER_3D.ordinal() + 1;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum Precision {
            LOW,
            MEDIUM,
            HIGH,
            DEFAULT
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum Type {
            BOOL,
            BOOL2,
            BOOL3,
            BOOL4,
            FLOAT,
            FLOAT2,
            FLOAT3,
            FLOAT4,
            INT,
            INT2,
            INT3,
            INT4,
            UINT,
            UINT2,
            UINT3,
            UINT4,
            MAT3,
            MAT4,
            SAMPLER_2D,
            SAMPLER_2D_ARRAY,
            SAMPLER_CUBEMAP,
            SAMPLER_EXTERNAL,
            SAMPLER_3D,
            SUBPASS_INPUT
        }

        private Parameter(String str, Type type, Precision precision, int i10) {
            this.name = str;
            this.type = type;
            this.precision = precision;
            this.count = i10;
        }

        @UsedByNative("Material.cpp")
        private static void add(List<Parameter> list, String str, int i10, int i11, int i12) {
            list.add(new Parameter(str, sTypeValues[i10], Precision.values()[i11], i12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ReflectionMode {
        DEFAULT,
        SCREEN_SPACE
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum RefractionMode {
        NONE,
        CUBEMAP,
        SCREEN_SPACE
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum RefractionType {
        SOLID,
        THIN
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Shading {
        UNLIT,
        LIT,
        SUBSURFACE,
        CLOTH,
        SPECULAR_GLOSSINESS
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum UboBatchingMode {
        DEFAULT,
        DISABLED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class UserVariantFilterBit {
        public static int ALL = 255;
        public static int DIRECTIONAL_LIGHTING = 1;
        public static int DYNAMIC_LIGHTING = 2;
        public static int FOG = 16;
        public static int SHADOW_RECEIVER = 4;
        public static int SKINNING = 8;
        public static int SSR = 64;
        public static int STE = 128;
        public static int VSM = 32;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum VertexDomain {
        OBJECT,
        WORLD,
        VIEW,
        DEVICE
    }

    public Material(long j10) {
        this.mNativeObject = j10;
        this.mDefaultInstance = new MaterialInstance(this, nGetDefaultInstance(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, Buffer buffer, int i10, int i11, int i12, int i13);

    private static native void nCompile(long j10, int i10, int i11, Object obj, Runnable runnable);

    private static native long nCreateInstance(long j10);

    private static native long nCreateInstanceWithName(long j10, String str);

    private static native int nGetBlendingMode(long j10);

    private static native int nGetCullingMode(long j10);

    private static native long nGetDefaultInstance(long j10);

    private static native int nGetFeatureLevel(long j10);

    private static native int nGetInterpolation(long j10);

    private static native float nGetMaskThreshold(long j10);

    private static native String nGetName(long j10);

    private static native int nGetParameterCount(long j10);

    private static native String nGetParameterTransformName(long j10, String str);

    private static native void nGetParameters(long j10, List<Parameter> list, int i10);

    private static native int nGetReflectionMode(long j10);

    private static native int nGetRefractionMode(long j10);

    private static native int nGetRefractionType(long j10);

    private static native int nGetRequiredAttributes(long j10);

    private static native int nGetShading(long j10);

    private static native float nGetSpecularAntiAliasingThreshold(long j10);

    private static native float nGetSpecularAntiAliasingVariance(long j10);

    private static native int nGetVertexDomain(long j10);

    private static native boolean nHasParameter(long j10, String str);

    private static native boolean nIsAlphaToCoverageEnabled(long j10);

    private static native boolean nIsColorWriteEnabled(long j10);

    private static native boolean nIsDepthCullingEnabled(long j10);

    private static native boolean nIsDepthWriteEnabled(long j10);

    private static native boolean nIsDoubleSided(long j10);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void compile(CompilerPriorityQueue compilerPriorityQueue, int i10, Object obj, Runnable runnable) {
        nCompile(getNativeObject(), compilerPriorityQueue.ordinal(), i10, obj, runnable);
    }

    public MaterialInstance createInstance() {
        long jNCreateInstance = nCreateInstance(getNativeObject());
        if (jNCreateInstance != 0) {
            return new MaterialInstance(this, jNCreateInstance);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    public BlendingMode getBlendingMode() {
        return EnumCache.sBlendingModeValues[nGetBlendingMode(getNativeObject())];
    }

    public CullingMode getCullingMode() {
        return EnumCache.sCullingModeValues[nGetCullingMode(getNativeObject())];
    }

    public MaterialInstance getDefaultInstance() {
        return this.mDefaultInstance;
    }

    public Engine.FeatureLevel getFeatureLevel() {
        return EnumCache.sFeatureLevelValues[nGetFeatureLevel(getNativeObject())];
    }

    public Interpolation getInterpolation() {
        return EnumCache.sInterpolationValues[nGetInterpolation(getNativeObject())];
    }

    public float getMaskThreshold() {
        return nGetMaskThreshold(getNativeObject());
    }

    public String getName() {
        return nGetName(getNativeObject());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Material");
    }

    public int getParameterCount() {
        return nGetParameterCount(getNativeObject());
    }

    public String getParameterTransformName(String str) {
        return nGetParameterTransformName(getNativeObject(), str);
    }

    public List<Parameter> getParameters() {
        int parameterCount = getParameterCount();
        ArrayList arrayList = new ArrayList(parameterCount);
        if (parameterCount > 0) {
            nGetParameters(getNativeObject(), arrayList, parameterCount);
        }
        return arrayList;
    }

    public ReflectionMode getReflectionMode() {
        return EnumCache.sReflectionModeValues[nGetReflectionMode(getNativeObject())];
    }

    public RefractionMode getRefractionMode() {
        return EnumCache.sRefractionModeValues[nGetRefractionMode(getNativeObject())];
    }

    public RefractionType getRefractionType() {
        return EnumCache.sRefractionTypeValues[nGetRefractionType(getNativeObject())];
    }

    public Set<VertexBuffer.VertexAttribute> getRequiredAttributes() {
        if (this.mRequiredAttributes == null) {
            int iNGetRequiredAttributes = nGetRequiredAttributes(getNativeObject());
            this.mRequiredAttributes = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
            VertexBuffer.VertexAttribute[] vertexAttributeArr = EnumCache.sVertexAttributeValues;
            for (int i10 = 0; i10 < vertexAttributeArr.length; i10++) {
                if (((1 << i10) & iNGetRequiredAttributes) != 0) {
                    this.mRequiredAttributes.add(vertexAttributeArr[i10]);
                }
            }
            this.mRequiredAttributes = Collections.unmodifiableSet(this.mRequiredAttributes);
        }
        return this.mRequiredAttributes;
    }

    public int getRequiredAttributesAsInt() {
        return nGetRequiredAttributes(getNativeObject());
    }

    public Shading getShading() {
        return EnumCache.sShadingValues[nGetShading(getNativeObject())];
    }

    public float getSpecularAntiAliasingThreshold() {
        return nGetSpecularAntiAliasingThreshold(getNativeObject());
    }

    public float getSpecularAntiAliasingVariance() {
        return nGetSpecularAntiAliasingVariance(getNativeObject());
    }

    public VertexDomain getVertexDomain() {
        return EnumCache.sVertexDomainValues[nGetVertexDomain(getNativeObject())];
    }

    public boolean hasParameter(String str) {
        return nHasParameter(getNativeObject(), str);
    }

    public boolean isAlphaToCoverageEnabled() {
        return nIsAlphaToCoverageEnabled(getNativeObject());
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

    public void setDefaultParameter(String str, boolean z10) {
        this.mDefaultInstance.setParameter(str, z10);
    }

    public void setDefaultParameter(String str, float f10) {
        this.mDefaultInstance.setParameter(str, f10);
    }

    public void setDefaultParameter(String str, int i10) {
        this.mDefaultInstance.setParameter(str, i10);
    }

    public MaterialInstance createInstance(String str) {
        long jNCreateInstanceWithName = nCreateInstanceWithName(getNativeObject(), str);
        if (jNCreateInstanceWithName != 0) {
            return new MaterialInstance(this, jNCreateInstanceWithName);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    public void setDefaultParameter(String str, boolean z10, boolean z11) {
        this.mDefaultInstance.setParameter(str, z10, z11);
    }

    public void setDefaultParameter(String str, float f10, float f11) {
        this.mDefaultInstance.setParameter(str, f10, f11);
    }

    public void setDefaultParameter(String str, int i10, int i11) {
        this.mDefaultInstance.setParameter(str, i10, i11);
    }

    public void setDefaultParameter(String str, boolean z10, boolean z11, boolean z12) {
        this.mDefaultInstance.setParameter(str, z10, z11, z12);
    }

    public void setDefaultParameter(String str, float f10, float f11, float f12) {
        this.mDefaultInstance.setParameter(str, f10, f11, f12);
    }

    public void setDefaultParameter(String str, int i10, int i11, int i12) {
        this.mDefaultInstance.setParameter(str, i10, i11, i12);
    }

    public void setDefaultParameter(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.mDefaultInstance.setParameter(str, z10, z11, z12, z13);
    }

    public void setDefaultParameter(String str, float f10, float f11, float f12, float f13) {
        this.mDefaultInstance.setParameter(str, f10, f11, f12, f13);
    }

    public void setDefaultParameter(String str, int i10, int i11, int i12, int i13) {
        this.mDefaultInstance.setParameter(str, i10, i11, i12, i13);
    }

    public void setDefaultParameter(String str, MaterialInstance.BooleanElement booleanElement, boolean[] zArr, int i10, int i11) {
        this.mDefaultInstance.setParameter(str, booleanElement, zArr, i10, i11);
    }

    public void setDefaultParameter(String str, MaterialInstance.IntElement intElement, int[] iArr, int i10, int i11) {
        this.mDefaultInstance.setParameter(str, intElement, iArr, i10, i11);
    }

    public void setDefaultParameter(String str, MaterialInstance.FloatElement floatElement, float[] fArr, int i10, int i11) {
        this.mDefaultInstance.setParameter(str, floatElement, fArr, i10, i11);
    }

    public void setDefaultParameter(String str, Colors.RgbType rgbType, float f10, float f11, float f12) {
        this.mDefaultInstance.setParameter(str, rgbType, f10, f11, f12);
    }

    public void setDefaultParameter(String str, Colors.RgbaType rgbaType, float f10, float f11, float f12, float f13) {
        this.mDefaultInstance.setParameter(str, rgbaType, f10, f11, f12, f13);
    }

    public void setDefaultParameter(String str, Texture texture, TextureSampler textureSampler) {
        this.mDefaultInstance.setParameter(str, texture, textureSampler);
    }
}
