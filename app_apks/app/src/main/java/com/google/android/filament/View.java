package com.google.android.filament;

import com.google.android.filament.proguard.UsedByNative;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class View {
    private AmbientOcclusionOptions mAmbientOcclusionOptions;
    private BlendMode mBlendMode;
    private BloomOptions mBloomOptions;
    private Camera mCamera;
    private ColorGrading mColorGrading;
    private DepthOfFieldOptions mDepthOfFieldOptions;
    private DynamicResolutionOptions mDynamicResolution;
    private FogOptions mFogOptions;
    private GuardBandOptions mGuardBandOptions;
    private MultiSampleAntiAliasingOptions mMultiSampleAntiAliasingOptions;
    private String mName;
    private long mNativeObject;
    private RenderQuality mRenderQuality;
    private RenderTarget mRenderTarget;
    private Scene mScene;
    private ScreenSpaceReflectionsOptions mScreenSpaceReflectionsOptions;
    private SoftShadowOptions mSoftShadowOptions;
    private StereoscopicOptions mStereoscopicOptions;
    private TemporalAntiAliasingOptions mTemporalAntiAliasingOptions;
    private Viewport mViewport = new Viewport(0, 0, 0, 0);
    private VignetteOptions mVignetteOptions;
    private VsmShadowOptions mVsmShadowOptions;
    private static final AntiAliasing[] sAntiAliasingValues = AntiAliasing.values();
    private static final Dithering[] sDitheringValues = Dithering.values();
    private static final AmbientOcclusion[] sAmbientOcclusionValues = AmbientOcclusion.values();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Deprecated
    public enum AmbientOcclusion {
        NONE,
        SSAO
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AmbientOcclusionOptions {
        public boolean bentNormals;
        public boolean enabled;
        public float gtaoConstThickness;
        public boolean gtaoLinearThickness;
        public int gtaoSampleSliceCount;
        public int gtaoSampleStepsPerSlice;
        public float gtaoThicknessHeuristic;
        public boolean gtaoUseVisibilityBitmasks;
        public QualityLevel lowPassFilter;
        public float minHorizonAngleRad;
        public QualityLevel quality;
        public float ssctContactDistanceMax;
        public float ssctDepthBias;
        public float ssctDepthSlopeBias;
        public boolean ssctEnabled;
        public float ssctIntensity;
        public float ssctLightConeRad;
        public float[] ssctLightDirection;
        public int ssctRayCount;
        public int ssctSampleCount;
        public float ssctShadowDistance;
        public QualityLevel upsampling;
        public AmbientOcclusionType aoType = AmbientOcclusionType.SAO;
        public float radius = 0.3f;
        public float power = 1.0f;
        public float bias = 5.0E-4f;
        public float resolution = 0.5f;
        public float intensity = 1.0f;
        public float bilateralThreshold = 0.05f;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum AmbientOcclusionType {
            SAO,
            GTAO
        }

        public AmbientOcclusionOptions() {
            QualityLevel qualityLevel = QualityLevel.LOW;
            this.quality = qualityLevel;
            this.lowPassFilter = QualityLevel.MEDIUM;
            this.upsampling = qualityLevel;
            this.enabled = false;
            this.bentNormals = false;
            this.minHorizonAngleRad = 0.0f;
            this.ssctLightConeRad = 1.0f;
            this.ssctShadowDistance = 0.3f;
            this.ssctContactDistanceMax = 1.0f;
            this.ssctIntensity = 0.8f;
            this.ssctLightDirection = new float[]{0.0f, -1.0f, 0.0f};
            this.ssctDepthBias = 0.01f;
            this.ssctDepthSlopeBias = 0.01f;
            this.ssctSampleCount = 4;
            this.ssctRayCount = 1;
            this.ssctEnabled = false;
            this.gtaoSampleSliceCount = 4;
            this.gtaoSampleStepsPerSlice = 3;
            this.gtaoThicknessHeuristic = 0.004f;
            this.gtaoUseVisibilityBitmasks = false;
            this.gtaoConstThickness = 0.5f;
            this.gtaoLinearThickness = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum AntiAliasing {
        NONE,
        FXAA
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum BlendMode {
        OPAQUE,
        TRANSLUCENT
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BloomOptions {
        public Texture dirt = null;
        public float dirtStrength = 0.2f;
        public float strength = 0.1f;
        public int resolution = 384;
        public int levels = 6;
        public BlendMode blendMode = BlendMode.ADD;
        public boolean threshold = true;
        public boolean enabled = false;
        public float highlight = 1000.0f;
        public QualityLevel quality = QualityLevel.LOW;
        public boolean lensFlare = false;
        public boolean starburst = true;
        public float chromaticAberration = 0.005f;
        public int ghostCount = 4;
        public float ghostSpacing = 0.6f;
        public float ghostThreshold = 10.0f;
        public float haloThickness = 0.1f;
        public float haloRadius = 0.4f;
        public float haloThreshold = 10.0f;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum BlendMode {
            ADD,
            INTERPOLATE
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DepthOfFieldOptions {
        public float cocScale = 1.0f;
        public float cocAspectRatio = 1.0f;
        public float maxApertureDiameter = 0.01f;
        public boolean enabled = false;
        public Filter filter = Filter.MEDIAN;
        public boolean nativeResolution = false;
        public int foregroundRingCount = 0;
        public int backgroundRingCount = 0;
        public int fastGatherRingCount = 0;
        public int maxForegroundCOC = 0;
        public int maxBackgroundCOC = 0;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum Filter {
            NONE,
            UNUSED,
            MEDIAN
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Dithering {
        NONE,
        TEMPORAL
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DynamicResolutionOptions {
        public float minScale = 0.5f;
        public float maxScale = 1.0f;
        public float sharpness = 0.9f;
        public boolean enabled = false;
        public boolean homogeneousScaling = false;
        public QualityLevel quality = QualityLevel.LOW;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FogOptions {
        public float distance = 0.0f;
        public float cutOffDistance = Float.POSITIVE_INFINITY;
        public float maximumOpacity = 1.0f;
        public float height = 0.0f;
        public float heightFalloff = 1.0f;
        public float[] color = {1.0f, 1.0f, 1.0f};
        public float density = 0.1f;
        public float inScatteringStart = 0.0f;
        public float inScatteringSize = -1.0f;
        public boolean fogColorFromIbl = false;
        public Texture skyColor = null;
        public boolean enabled = false;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class GuardBandOptions {
        public boolean enabled = false;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @UsedByNative("View.cpp")
    public static class InternalOnPickCallback implements Runnable {

        @UsedByNative("View.cpp")
        float mDepth;

        @UsedByNative("View.cpp")
        float mFragCoordsX;

        @UsedByNative("View.cpp")
        float mFragCoordsY;

        @UsedByNative("View.cpp")
        float mFragCoordsZ;
        private final PickingQueryResult mPickingQueryResult = new PickingQueryResult();

        @Entity
        @UsedByNative("View.cpp")
        int mRenderable;
        private final OnPickCallback mUserCallback;

        public InternalOnPickCallback(OnPickCallback onPickCallback) {
            this.mUserCallback = onPickCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            PickingQueryResult pickingQueryResult = this.mPickingQueryResult;
            pickingQueryResult.renderable = this.mRenderable;
            pickingQueryResult.depth = this.mDepth;
            float[] fArr = pickingQueryResult.fragCoords;
            fArr[0] = this.mFragCoordsX;
            fArr[1] = this.mFragCoordsY;
            fArr[2] = this.mFragCoordsZ;
            this.mUserCallback.onPick(pickingQueryResult);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MultiSampleAntiAliasingOptions {
        public boolean enabled = false;
        public int sampleCount = 4;
        public boolean customResolve = false;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface OnPickCallback {
        void onPick(PickingQueryResult pickingQueryResult);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PickingQueryResult {
        public float depth;
        public float[] fragCoords = new float[3];

        @Entity
        public int renderable;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum QualityLevel {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class RenderQuality {
        public QualityLevel hdrColorBuffer = QualityLevel.HIGH;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ScreenSpaceReflectionsOptions {
        public float thickness = 0.1f;
        public float bias = 0.01f;
        public float maxDistance = 3.0f;
        public float stride = 2.0f;
        public boolean enabled = false;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ShadowType {
        PCF,
        VSM,
        DPCF,
        PCSS,
        PCFd
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SoftShadowOptions {
        public float penumbraScale = 1.0f;
        public float penumbraRatioScale = 1.0f;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class StereoscopicOptions {
        public boolean enabled = false;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.google.android.filament.View$TargetBufferFlags, still in use, count: 1, list:
      (r1v1 com.google.android.filament.View$TargetBufferFlags) from 0x0050: INVOKE 
      (r0v0 com.google.android.filament.View$TargetBufferFlags)
      (r1v1 com.google.android.filament.View$TargetBufferFlags)
      (r2v2 com.google.android.filament.View$TargetBufferFlags)
      (r3v2 com.google.android.filament.View$TargetBufferFlags)
     STATIC call: java.util.EnumSet.of(java.lang.Enum, java.lang.Enum, java.lang.Enum, java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>, E extends java.lang.Enum<E>, E extends java.lang.Enum<E>, E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED] (LINE:81)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TargetBufferFlags {
        COLOR0(1),
        COLOR1(2),
        COLOR2(4),
        COLOR3(8),
        DEPTH(16),
        STENCIL(32);

        public static EnumSet<TargetBufferFlags> ALL;
        public static EnumSet<TargetBufferFlags> ALL_COLOR;
        public static EnumSet<TargetBufferFlags> DEPTH_STENCIL;
        public static EnumSet<TargetBufferFlags> NONE;
        private int mFlags;

        static {
            TargetBufferFlags targetBufferFlags = COLOR0;
            TargetBufferFlags targetBufferFlags2 = STENCIL;
            NONE = EnumSet.noneOf(TargetBufferFlags.class);
            ALL_COLOR = EnumSet.of(targetBufferFlags, targetBufferFlags, targetBufferFlags, targetBufferFlags);
            DEPTH_STENCIL = EnumSet.of(targetBufferFlags, targetBufferFlags2);
            ALL = EnumSet.range(targetBufferFlags, targetBufferFlags2);
        }

        private TargetBufferFlags(int i10) {
            this.mFlags = i10;
        }

        public static int flags(EnumSet<TargetBufferFlags> enumSet) {
            Iterator<TargetBufferFlags> it = enumSet.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 |= it.next().mFlags;
            }
            return i10;
        }

        public static TargetBufferFlags valueOf(String str) {
            return (TargetBufferFlags) Enum.valueOf(TargetBufferFlags.class, str);
        }

        public static TargetBufferFlags[] values() {
            return (TargetBufferFlags[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class TemporalAntiAliasingOptions {
        public float filterWidth = 1.0f;
        public float feedback = 0.12f;
        public float lodBias = -1.0f;
        public float sharpness = 0.0f;
        public boolean enabled = false;
        public boolean upscaling = false;
        public boolean filterHistory = true;
        public boolean filterInput = true;
        public boolean useYCoCg = false;
        public BoxType boxType = BoxType.AABB;
        public BoxClipping boxClipping = BoxClipping.ACCURATE;
        public JitterPattern jitterPattern = JitterPattern.HALTON_23_X16;
        public float varianceGamma = 1.0f;
        public boolean preventFlickering = false;
        public boolean historyReprojection = true;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum BoxClipping {
            ACCURATE,
            CLAMP,
            NONE
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum BoxType {
            AABB,
            VARIANCE,
            AABB_VARIANCE
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum JitterPattern {
            RGSS_X4,
            UNIFORM_HELIX_X4,
            HALTON_23_X8,
            HALTON_23_X16,
            HALTON_23_X32
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Deprecated
    public enum ToneMapping {
        LINEAR,
        ACES
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class VignetteOptions {
        public float midPoint = 0.5f;
        public float roundness = 0.5f;
        public float feather = 0.5f;
        public float[] color = {0.0f, 0.0f, 0.0f, 1.0f};
        public boolean enabled = false;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class VsmShadowOptions {
        public int anisotropy = 0;
        public boolean mipmapping = false;
        public int msaaSamples = 1;
        public boolean highPrecision = false;
        public float minVarianceScale = 0.5f;
        public float lightBleedReduction = 0.15f;
    }

    public View(long j10) {
        this.mNativeObject = j10;
    }

    private static native void nClearFrameHistory(long j10, long j11);

    private static native int nGetAmbientOcclusion(long j10);

    private static native int nGetAntiAliasing(long j10);

    private static native int nGetDithering(long j10);

    private static native int nGetFogEntity(long j10);

    private static native void nGetLastDynamicResolutionScale(long j10, float[] fArr);

    private static native void nGetMaterialGlobal(long j10, int i10, float[] fArr);

    private static native int nGetSampleCount(long j10);

    private static native boolean nHasCamera(long j10);

    private static native boolean nIsChannelDepthClearEnabled(long j10, int i10);

    private static native boolean nIsFrontFaceWindingInverted(long j10);

    private static native boolean nIsPostProcessingEnabled(long j10);

    private static native boolean nIsScreenSpaceRefractionEnabled(long j10);

    private static native boolean nIsShadowingEnabled(long j10);

    private static native boolean nIsStencilBufferEnabled(long j10);

    private static native boolean nIsTransparentPickingEnabled(long j10);

    private static native void nPick(long j10, int i10, int i11, Object obj, InternalOnPickCallback internalOnPickCallback);

    private static native void nSetAmbientOcclusion(long j10, int i10);

    private static native void nSetAmbientOcclusionOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, int i10, int i11, int i12, boolean z10, boolean z11, float f16);

    private static native void nSetAntiAliasing(long j10, int i10);

    private static native void nSetBlendMode(long j10, int i10);

    private static native void nSetBloomOptions(long j10, long j11, float f10, float f11, int i10, int i11, int i12, boolean z10, boolean z11, float f12, boolean z12, boolean z13, float f13, int i13, float f14, float f15, float f16, float f17, float f18);

    private static native void nSetCamera(long j10, long j11);

    private static native void nSetChannelDepthClearEnabled(long j10, int i10, boolean z10);

    private static native void nSetColorGrading(long j10, long j11);

    private static native void nSetDepthOfFieldOptions(long j10, float f10, float f11, boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15);

    private static native void nSetDithering(long j10, int i10);

    private static native void nSetDynamicLightingOptions(long j10, float f10, float f11);

    private static native void nSetDynamicResolutionOptions(long j10, boolean z10, boolean z11, float f10, float f11, float f12, int i10);

    private static native void nSetFogOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, long j11, boolean z11);

    private static native void nSetFrontFaceWindingInverted(long j10, boolean z10);

    private static native void nSetGuardBandOptions(long j10, boolean z10);

    private static native void nSetMaterialGlobal(long j10, int i10, float f10, float f11, float f12, float f13);

    private static native void nSetMultiSampleAntiAliasingOptions(long j10, boolean z10, int i10, boolean z11);

    private static native void nSetName(long j10, String str);

    private static native void nSetPostProcessingEnabled(long j10, boolean z10);

    private static native void nSetRenderQuality(long j10, int i10);

    private static native void nSetRenderTarget(long j10, long j11);

    private static native void nSetSSCTOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, int i11, boolean z10);

    private static native void nSetSampleCount(long j10, int i10);

    private static native void nSetScene(long j10, long j11);

    private static native void nSetScreenSpaceReflectionsOptions(long j10, float f10, float f11, float f12, float f13, boolean z10);

    private static native void nSetScreenSpaceRefractionEnabled(long j10, boolean z10);

    private static native void nSetShadowType(long j10, int i10);

    private static native void nSetShadowingEnabled(long j10, boolean z10);

    private static native void nSetSoftShadowOptions(long j10, float f10, float f11);

    private static native void nSetStencilBufferEnabled(long j10, boolean z10);

    private static native void nSetStereoscopicOptions(long j10, boolean z10);

    private static native void nSetTemporalAntiAliasingOptions(long j10, float f10, float f11, boolean z10);

    private static native void nSetTransparentPickingEnabled(long j10, boolean z10);

    private static native void nSetViewport(long j10, int i10, int i11, int i12, int i13);

    private static native void nSetVignetteOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10);

    private static native void nSetVisibleLayers(long j10, int i10, int i11);

    private static native void nSetVsmShadowOptions(long j10, int i10, boolean z10, boolean z11, float f10, float f11);

    public void clearFrameHistory(Engine engine) {
        nClearFrameHistory(getNativeObject(), engine.getNativeObject());
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @Deprecated
    public AmbientOcclusion getAmbientOcclusion() {
        return sAmbientOcclusionValues[nGetAmbientOcclusion(getNativeObject())];
    }

    public AmbientOcclusionOptions getAmbientOcclusionOptions() {
        if (this.mAmbientOcclusionOptions == null) {
            this.mAmbientOcclusionOptions = new AmbientOcclusionOptions();
        }
        return this.mAmbientOcclusionOptions;
    }

    public AntiAliasing getAntiAliasing() {
        return sAntiAliasingValues[nGetAntiAliasing(getNativeObject())];
    }

    public BlendMode getBlendMode() {
        return this.mBlendMode;
    }

    public BloomOptions getBloomOptions() {
        if (this.mBloomOptions == null) {
            this.mBloomOptions = new BloomOptions();
        }
        return this.mBloomOptions;
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public ColorGrading getColorGrading() {
        return this.mColorGrading;
    }

    public DepthOfFieldOptions getDepthOfFieldOptions() {
        if (this.mDepthOfFieldOptions == null) {
            this.mDepthOfFieldOptions = new DepthOfFieldOptions();
        }
        return this.mDepthOfFieldOptions;
    }

    public Dithering getDithering() {
        return sDitheringValues[nGetDithering(getNativeObject())];
    }

    public DynamicResolutionOptions getDynamicResolutionOptions() {
        if (this.mDynamicResolution == null) {
            this.mDynamicResolution = new DynamicResolutionOptions();
        }
        return this.mDynamicResolution;
    }

    @Entity
    public int getFogEntity() {
        return nGetFogEntity(getNativeObject());
    }

    public FogOptions getFogOptions() {
        if (this.mFogOptions == null) {
            this.mFogOptions = new FogOptions();
        }
        return this.mFogOptions;
    }

    public GuardBandOptions getGuardBandOptions() {
        if (this.mGuardBandOptions == null) {
            this.mGuardBandOptions = new GuardBandOptions();
        }
        return this.mGuardBandOptions;
    }

    public float[] getLastDynamicResolutionScale(float[] fArr) {
        float[] fArrAssertFloat2 = Asserts.assertFloat2(fArr);
        nGetLastDynamicResolutionScale(getNativeObject(), fArrAssertFloat2);
        return fArrAssertFloat2;
    }

    public float[] getMaterialGlobal(int i10, float[] fArr) {
        float[] fArrAssertFloat4 = Asserts.assertFloat4(fArr);
        nGetMaterialGlobal(getNativeObject(), i10, fArrAssertFloat4);
        return fArrAssertFloat4;
    }

    public MultiSampleAntiAliasingOptions getMultiSampleAntiAliasingOptions() {
        if (this.mMultiSampleAntiAliasingOptions == null) {
            this.mMultiSampleAntiAliasingOptions = new MultiSampleAntiAliasingOptions();
        }
        return this.mMultiSampleAntiAliasingOptions;
    }

    public String getName() {
        return this.mName;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed View");
    }

    public RenderQuality getRenderQuality() {
        if (this.mRenderQuality == null) {
            this.mRenderQuality = new RenderQuality();
        }
        return this.mRenderQuality;
    }

    public RenderTarget getRenderTarget() {
        return this.mRenderTarget;
    }

    @Deprecated
    public int getSampleCount() {
        return nGetSampleCount(getNativeObject());
    }

    public Scene getScene() {
        return this.mScene;
    }

    public ScreenSpaceReflectionsOptions getScreenSpaceReflectionsOptions() {
        if (this.mScreenSpaceReflectionsOptions == null) {
            this.mScreenSpaceReflectionsOptions = new ScreenSpaceReflectionsOptions();
        }
        return this.mScreenSpaceReflectionsOptions;
    }

    public SoftShadowOptions getSoftShadowOptions() {
        if (this.mSoftShadowOptions == null) {
            this.mSoftShadowOptions = new SoftShadowOptions();
        }
        return this.mSoftShadowOptions;
    }

    public StereoscopicOptions getStereoscopicOptions() {
        if (this.mStereoscopicOptions == null) {
            this.mStereoscopicOptions = new StereoscopicOptions();
        }
        return this.mStereoscopicOptions;
    }

    public TemporalAntiAliasingOptions getTemporalAntiAliasingOptions() {
        if (this.mTemporalAntiAliasingOptions == null) {
            this.mTemporalAntiAliasingOptions = new TemporalAntiAliasingOptions();
        }
        return this.mTemporalAntiAliasingOptions;
    }

    @Deprecated
    public ToneMapping getToneMapping() {
        return ToneMapping.ACES;
    }

    public Viewport getViewport() {
        return this.mViewport;
    }

    public VignetteOptions getVignetteOptions() {
        if (this.mVignetteOptions == null) {
            this.mVignetteOptions = new VignetteOptions();
        }
        return this.mVignetteOptions;
    }

    public VsmShadowOptions getVsmShadowOptions() {
        if (this.mVsmShadowOptions == null) {
            this.mVsmShadowOptions = new VsmShadowOptions();
        }
        return this.mVsmShadowOptions;
    }

    public boolean hasCamera() {
        return nHasCamera(getNativeObject());
    }

    public boolean isChannelDepthClearEnabled(int i10) {
        return nIsChannelDepthClearEnabled(getNativeObject(), i10);
    }

    public boolean isFrontFaceWindingInverted() {
        return nIsFrontFaceWindingInverted(getNativeObject());
    }

    public boolean isPostProcessingEnabled() {
        return nIsPostProcessingEnabled(getNativeObject());
    }

    public boolean isScreenSpaceRefractionEnabled() {
        return nIsScreenSpaceRefractionEnabled(getNativeObject());
    }

    public boolean isShadowingEnabled() {
        return nIsShadowingEnabled(getNativeObject());
    }

    public boolean isStencilBufferEnabled() {
        return nIsStencilBufferEnabled(getNativeObject());
    }

    public boolean isTransparentPickingEnabled() {
        return nIsTransparentPickingEnabled(getNativeObject());
    }

    public void pick(int i10, int i11, Object obj, OnPickCallback onPickCallback) {
        nPick(getNativeObject(), i10, i11, obj, new InternalOnPickCallback(onPickCallback));
    }

    @Deprecated
    public void setAmbientOcclusion(AmbientOcclusion ambientOcclusion) {
        nSetAmbientOcclusion(getNativeObject(), ambientOcclusion.ordinal());
    }

    public void setAmbientOcclusionOptions(AmbientOcclusionOptions ambientOcclusionOptions) {
        this.mAmbientOcclusionOptions = ambientOcclusionOptions;
        nSetAmbientOcclusionOptions(getNativeObject(), ambientOcclusionOptions.radius, ambientOcclusionOptions.bias, ambientOcclusionOptions.power, ambientOcclusionOptions.resolution, ambientOcclusionOptions.intensity, ambientOcclusionOptions.bilateralThreshold, ambientOcclusionOptions.quality.ordinal(), ambientOcclusionOptions.lowPassFilter.ordinal(), ambientOcclusionOptions.upsampling.ordinal(), ambientOcclusionOptions.enabled, ambientOcclusionOptions.bentNormals, ambientOcclusionOptions.minHorizonAngleRad);
        long nativeObject = getNativeObject();
        float f10 = ambientOcclusionOptions.ssctLightConeRad;
        float f11 = ambientOcclusionOptions.ssctShadowDistance;
        float f12 = ambientOcclusionOptions.ssctContactDistanceMax;
        float f13 = ambientOcclusionOptions.ssctIntensity;
        float[] fArr = ambientOcclusionOptions.ssctLightDirection;
        nSetSSCTOptions(nativeObject, f10, f11, f12, f13, fArr[0], fArr[1], fArr[2], ambientOcclusionOptions.ssctDepthBias, ambientOcclusionOptions.ssctDepthSlopeBias, ambientOcclusionOptions.ssctSampleCount, ambientOcclusionOptions.ssctRayCount, ambientOcclusionOptions.ssctEnabled);
    }

    public void setAntiAliasing(AntiAliasing antiAliasing) {
        nSetAntiAliasing(getNativeObject(), antiAliasing.ordinal());
    }

    public void setBlendMode(BlendMode blendMode) {
        this.mBlendMode = blendMode;
        nSetBlendMode(getNativeObject(), blendMode.ordinal());
    }

    public void setBloomOptions(BloomOptions bloomOptions) {
        this.mBloomOptions = bloomOptions;
        long nativeObject = getNativeObject();
        Texture texture = bloomOptions.dirt;
        nSetBloomOptions(nativeObject, texture != null ? texture.getNativeObject() : 0L, bloomOptions.dirtStrength, bloomOptions.strength, bloomOptions.resolution, bloomOptions.levels, bloomOptions.blendMode.ordinal(), bloomOptions.threshold, bloomOptions.enabled, bloomOptions.highlight, bloomOptions.lensFlare, bloomOptions.starburst, bloomOptions.chromaticAberration, bloomOptions.ghostCount, bloomOptions.ghostSpacing, bloomOptions.ghostThreshold, bloomOptions.haloThickness, bloomOptions.haloRadius, bloomOptions.haloThreshold);
    }

    public void setCamera(Camera camera) {
        this.mCamera = camera;
        nSetCamera(getNativeObject(), camera == null ? 0L : camera.getNativeObject());
    }

    public void setChannelDepthClearEnabled(int i10, boolean z10) {
        nSetChannelDepthClearEnabled(getNativeObject(), i10, z10);
    }

    public void setColorGrading(ColorGrading colorGrading) {
        nSetColorGrading(getNativeObject(), colorGrading != null ? colorGrading.getNativeObject() : 0L);
        this.mColorGrading = colorGrading;
    }

    public void setDepthOfFieldOptions(DepthOfFieldOptions depthOfFieldOptions) {
        this.mDepthOfFieldOptions = depthOfFieldOptions;
        nSetDepthOfFieldOptions(getNativeObject(), depthOfFieldOptions.cocScale, depthOfFieldOptions.maxApertureDiameter, depthOfFieldOptions.enabled, depthOfFieldOptions.filter.ordinal(), depthOfFieldOptions.nativeResolution, depthOfFieldOptions.foregroundRingCount, depthOfFieldOptions.backgroundRingCount, depthOfFieldOptions.fastGatherRingCount, depthOfFieldOptions.maxForegroundCOC, depthOfFieldOptions.maxBackgroundCOC);
    }

    public void setDithering(Dithering dithering) {
        nSetDithering(getNativeObject(), dithering.ordinal());
    }

    public void setDynamicLightingOptions(float f10, float f11) {
        nSetDynamicLightingOptions(getNativeObject(), f10, f11);
    }

    public void setDynamicResolutionOptions(DynamicResolutionOptions dynamicResolutionOptions) {
        this.mDynamicResolution = dynamicResolutionOptions;
        nSetDynamicResolutionOptions(getNativeObject(), dynamicResolutionOptions.enabled, dynamicResolutionOptions.homogeneousScaling, dynamicResolutionOptions.minScale, dynamicResolutionOptions.maxScale, dynamicResolutionOptions.sharpness, dynamicResolutionOptions.quality.ordinal());
    }

    public void setFogOptions(FogOptions fogOptions) {
        Asserts.assertFloat3In(fogOptions.color);
        this.mFogOptions = fogOptions;
        long nativeObject = getNativeObject();
        float f10 = fogOptions.distance;
        float f11 = fogOptions.maximumOpacity;
        float f12 = fogOptions.height;
        float f13 = fogOptions.heightFalloff;
        float f14 = fogOptions.cutOffDistance;
        float[] fArr = fogOptions.color;
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[2];
        float f18 = fogOptions.density;
        float f19 = fogOptions.inScatteringStart;
        float f20 = fogOptions.inScatteringSize;
        boolean z10 = fogOptions.fogColorFromIbl;
        Texture texture = fogOptions.skyColor;
        nSetFogOptions(nativeObject, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, z10, texture == null ? 0L : texture.getNativeObject(), fogOptions.enabled);
    }

    public void setFrontFaceWindingInverted(boolean z10) {
        nSetFrontFaceWindingInverted(getNativeObject(), z10);
    }

    public void setGuardBandOptions(GuardBandOptions guardBandOptions) {
        this.mGuardBandOptions = guardBandOptions;
        nSetGuardBandOptions(getNativeObject(), guardBandOptions.enabled);
    }

    public void setMaterialGlobal(int i10, float[] fArr) {
        Asserts.assertFloat4In(fArr);
        nSetMaterialGlobal(getNativeObject(), i10, fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public void setMultiSampleAntiAliasingOptions(MultiSampleAntiAliasingOptions multiSampleAntiAliasingOptions) {
        this.mMultiSampleAntiAliasingOptions = multiSampleAntiAliasingOptions;
        nSetMultiSampleAntiAliasingOptions(getNativeObject(), multiSampleAntiAliasingOptions.enabled, multiSampleAntiAliasingOptions.sampleCount, multiSampleAntiAliasingOptions.customResolve);
    }

    public void setName(String str) {
        this.mName = str;
        nSetName(getNativeObject(), str);
    }

    public void setPostProcessingEnabled(boolean z10) {
        nSetPostProcessingEnabled(getNativeObject(), z10);
    }

    public void setRenderQuality(RenderQuality renderQuality) {
        this.mRenderQuality = renderQuality;
        nSetRenderQuality(getNativeObject(), renderQuality.hdrColorBuffer.ordinal());
    }

    public void setRenderTarget(RenderTarget renderTarget) {
        this.mRenderTarget = renderTarget;
        nSetRenderTarget(getNativeObject(), renderTarget != null ? renderTarget.getNativeObject() : 0L);
    }

    @Deprecated
    public void setSampleCount(int i10) {
        nSetSampleCount(getNativeObject(), i10);
    }

    public void setScene(Scene scene) {
        this.mScene = scene;
        nSetScene(getNativeObject(), scene == null ? 0L : scene.getNativeObject());
    }

    public void setScreenSpaceReflectionsOptions(ScreenSpaceReflectionsOptions screenSpaceReflectionsOptions) {
        this.mScreenSpaceReflectionsOptions = screenSpaceReflectionsOptions;
        nSetScreenSpaceReflectionsOptions(getNativeObject(), screenSpaceReflectionsOptions.thickness, screenSpaceReflectionsOptions.bias, screenSpaceReflectionsOptions.maxDistance, screenSpaceReflectionsOptions.stride, screenSpaceReflectionsOptions.enabled);
    }

    public void setScreenSpaceRefractionEnabled(boolean z10) {
        nSetScreenSpaceRefractionEnabled(getNativeObject(), z10);
    }

    public void setShadowType(ShadowType shadowType) {
        nSetShadowType(getNativeObject(), shadowType.ordinal());
    }

    public void setShadowingEnabled(boolean z10) {
        nSetShadowingEnabled(getNativeObject(), z10);
    }

    public void setSoftShadowOptions(SoftShadowOptions softShadowOptions) {
        this.mSoftShadowOptions = softShadowOptions;
        nSetSoftShadowOptions(getNativeObject(), softShadowOptions.penumbraScale, softShadowOptions.penumbraRatioScale);
    }

    public void setStencilBufferEnabled(boolean z10) {
        nSetStencilBufferEnabled(getNativeObject(), z10);
    }

    public void setStereoscopicOptions(StereoscopicOptions stereoscopicOptions) {
        this.mStereoscopicOptions = stereoscopicOptions;
        nSetStereoscopicOptions(getNativeObject(), stereoscopicOptions.enabled);
    }

    public void setTemporalAntiAliasingOptions(TemporalAntiAliasingOptions temporalAntiAliasingOptions) {
        this.mTemporalAntiAliasingOptions = temporalAntiAliasingOptions;
        nSetTemporalAntiAliasingOptions(getNativeObject(), temporalAntiAliasingOptions.feedback, temporalAntiAliasingOptions.filterWidth, temporalAntiAliasingOptions.enabled);
    }

    public void setTransparentPickingEnabled(boolean z10) {
        nSetTransparentPickingEnabled(getNativeObject(), z10);
    }

    public void setViewport(Viewport viewport) {
        this.mViewport = viewport;
        long nativeObject = getNativeObject();
        Viewport viewport2 = this.mViewport;
        nSetViewport(nativeObject, viewport2.left, viewport2.bottom, viewport2.width, viewport2.height);
    }

    public void setVignetteOptions(VignetteOptions vignetteOptions) {
        Asserts.assertFloat4In(vignetteOptions.color);
        this.mVignetteOptions = vignetteOptions;
        long nativeObject = getNativeObject();
        float f10 = vignetteOptions.midPoint;
        float f11 = vignetteOptions.roundness;
        float f12 = vignetteOptions.feather;
        float[] fArr = vignetteOptions.color;
        nSetVignetteOptions(nativeObject, f10, f11, f12, fArr[0], fArr[1], fArr[2], fArr[3], vignetteOptions.enabled);
    }

    public void setVisibleLayers(int i10, int i11) {
        nSetVisibleLayers(getNativeObject(), i10 & 255, i11 & 255);
    }

    public void setVsmShadowOptions(VsmShadowOptions vsmShadowOptions) {
        this.mVsmShadowOptions = vsmShadowOptions;
        nSetVsmShadowOptions(getNativeObject(), vsmShadowOptions.anisotropy, vsmShadowOptions.mipmapping, vsmShadowOptions.highPrecision, vsmShadowOptions.minVarianceScale, vsmShadowOptions.lightBleedReduction);
    }

    @Deprecated
    public void setToneMapping(ToneMapping toneMapping) {
    }
}
