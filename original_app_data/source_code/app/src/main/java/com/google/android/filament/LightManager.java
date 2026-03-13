package com.google.android.filament;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class LightManager {
    public static final float EFFICIENCY_FLUORESCENT = 0.0878f;
    public static final float EFFICIENCY_HALOGEN = 0.0707f;
    public static final float EFFICIENCY_INCANDESCENT = 0.022f;
    public static final float EFFICIENCY_LED = 0.1171f;
    private static final Type[] sTypeValues = Type.values();
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j10) {
                this.mNativeObject = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                LightManager.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder(Type type) {
            long jNCreateBuilder = LightManager.nCreateBuilder(type.ordinal());
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public void build(Engine engine, @Entity int i10) {
            if (LightManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i10)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Light component for entity " + i10 + ", see log.");
        }

        public Builder castLight(boolean z10) {
            LightManager.nBuilderCastLight(this.mNativeBuilder, z10);
            return this;
        }

        public Builder castShadows(boolean z10) {
            LightManager.nBuilderCastShadows(this.mNativeBuilder, z10);
            return this;
        }

        public Builder color(float f10, float f11, float f12) {
            LightManager.nBuilderColor(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder direction(float f10, float f11, float f12) {
            LightManager.nBuilderDirection(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder falloff(float f10) {
            LightManager.nBuilderFalloff(this.mNativeBuilder, f10);
            return this;
        }

        public Builder intensity(float f10) {
            LightManager.nBuilderIntensity(this.mNativeBuilder, f10);
            return this;
        }

        public Builder intensityCandela(float f10) {
            LightManager.nBuilderIntensityCandela(this.mNativeBuilder, f10);
            return this;
        }

        public Builder lightChannel(int i10, boolean z10) {
            LightManager.nBuilderLightChannel(this.mNativeBuilder, i10, z10);
            return this;
        }

        public Builder position(float f10, float f11, float f12) {
            LightManager.nBuilderPosition(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder shadowOptions(ShadowOptions shadowOptions) {
            LightManager.nBuilderShadowOptions(this.mNativeBuilder, shadowOptions.mapSize, shadowOptions.shadowCascades, shadowOptions.cascadeSplitPositions, shadowOptions.constantBias, shadowOptions.normalBias, shadowOptions.shadowFar, shadowOptions.shadowNearHint, shadowOptions.shadowFarHint, shadowOptions.stable, shadowOptions.lispsm, shadowOptions.polygonOffsetConstant, shadowOptions.polygonOffsetSlope, shadowOptions.screenSpaceContactShadows, shadowOptions.stepCount, shadowOptions.maxShadowDistance, shadowOptions.elvsm, shadowOptions.blurWidth, shadowOptions.shadowBulbRadius, shadowOptions.transform);
            return this;
        }

        public Builder spotLightCone(float f10, float f11) {
            LightManager.nBuilderSpotLightCone(this.mNativeBuilder, f10, f11);
            return this;
        }

        public Builder sunAngularRadius(float f10) {
            LightManager.nBuilderAngularRadius(this.mNativeBuilder, f10);
            return this;
        }

        public Builder sunHaloFalloff(float f10) {
            LightManager.nBuilderHaloFalloff(this.mNativeBuilder, f10);
            return this;
        }

        public Builder sunHaloSize(float f10) {
            LightManager.nBuilderHaloSize(this.mNativeBuilder, f10);
            return this;
        }

        public Builder intensity(float f10, float f11) {
            LightManager.nBuilderIntensity(this.mNativeBuilder, f10, f11);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ShadowCascades {
        public static void computeLogSplits(float[] fArr, int i10, float f10, float f11) {
            int i11 = i10 - 1;
            if (fArr.length < i11) {
                throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i11)));
            }
            LightManager.nComputeLogSplits(fArr, i10, f10, f11);
        }

        public static void computePracticalSplits(float[] fArr, int i10, float f10, float f11, float f12) {
            int i11 = i10 - 1;
            if (fArr.length < i11) {
                throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i11)));
            }
            LightManager.nComputePracticalSplits(fArr, i10, f10, f11, f12);
        }

        public static void computeUniformSplits(float[] fArr, int i10) {
            int i11 = i10 - 1;
            if (fArr.length < i11) {
                throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i11)));
            }
            LightManager.nComputeUniformSplits(fArr, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ShadowOptions {
        public int mapSize = RecognitionOptions.UPC_E;
        public int shadowCascades = 1;
        public float[] cascadeSplitPositions = {0.125f, 0.25f, 0.5f};
        public float constantBias = 0.001f;
        public float normalBias = 1.0f;
        public float shadowFar = 0.0f;
        public float shadowNearHint = 1.0f;
        public float shadowFarHint = 100.0f;
        public boolean stable = false;
        public boolean lispsm = false;
        float polygonOffsetConstant = 0.5f;
        float polygonOffsetSlope = 2.0f;
        public boolean screenSpaceContactShadows = false;
        public int stepCount = 8;
        public float maxShadowDistance = 0.3f;
        public boolean elvsm = false;
        public float blurWidth = 0.0f;
        public float shadowBulbRadius = 0.02f;
        public float[] transform = {0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Type {
        SUN,
        DIRECTIONAL,
        POINT,
        FOCUSED_SPOT,
        SPOT
    }

    public LightManager(long j10) {
        this.mNativeObject = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAngularRadius(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j10, long j11, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastLight(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDirection(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFalloff(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHaloFalloff(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHaloSize(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensityCandela(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowOptions(long j10, int i10, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, boolean z12, int i12, float f17, boolean z13, float f18, float f19, float[] fArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSpotLightCone(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputeLogSplits(float[] fArr, int i10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputePracticalSplits(float[] fArr, int i10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputeUniformSplits(float[] fArr, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i10);

    private static native void nDestroy(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetColor(long j10, int i10, float[] fArr);

    private static native int nGetComponentCount(long j10);

    private static native void nGetDirection(long j10, int i10, float[] fArr);

    private static native float nGetFalloff(long j10, int i10);

    private static native float nGetInnerConeAngle(long j10, int i10);

    private static native int nGetInstance(long j10, int i10);

    private static native float nGetIntensity(long j10, int i10);

    private static native boolean nGetLightChannel(long j10, int i10, int i11);

    private static native float nGetOuterConeAngle(long j10, int i10);

    private static native void nGetPosition(long j10, int i10, float[] fArr);

    private static native float nGetSunAngularRadius(long j10, int i10);

    private static native float nGetSunHaloFalloff(long j10, int i10);

    private static native float nGetSunHaloSize(long j10, int i10);

    private static native int nGetType(long j10, int i10);

    private static native boolean nHasComponent(long j10, int i10);

    private static native boolean nIsShadowCaster(long j10, int i10);

    private static native void nSetColor(long j10, int i10, float f10, float f11, float f12);

    private static native void nSetDirection(long j10, int i10, float f10, float f11, float f12);

    private static native void nSetFalloff(long j10, int i10, float f10);

    private static native void nSetIntensity(long j10, int i10, float f10);

    private static native void nSetIntensity(long j10, int i10, float f10, float f11);

    private static native void nSetIntensityCandela(long j10, int i10, float f10);

    private static native void nSetLightChannel(long j10, int i10, int i11, boolean z10);

    private static native void nSetPosition(long j10, int i10, float f10, float f11, float f12);

    private static native void nSetShadowCaster(long j10, int i10, boolean z10);

    private static native void nSetSpotLightCone(long j10, int i10, float f10, float f11);

    private static native void nSetSunAngularRadius(long j10, int i10, float f10);

    private static native void nSetSunHaloFalloff(long j10, int i10, float f10);

    private static native void nSetSunHaloSize(long j10, int i10, float f10);

    public void destroy(@Entity int i10) {
        nDestroy(this.mNativeObject, i10);
    }

    public float[] getColor(@EntityInstance int i10, float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetColor(this.mNativeObject, i10, fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public int getComponentCount() {
        return nGetComponentCount(this.mNativeObject);
    }

    public float[] getDirection(@EntityInstance int i10, float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetDirection(this.mNativeObject, i10, fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public float getFalloff(@EntityInstance int i10) {
        return nGetFalloff(this.mNativeObject, i10);
    }

    public float getInnerConeAngle(@EntityInstance int i10) {
        return nGetInnerConeAngle(this.mNativeObject, i10);
    }

    @EntityInstance
    public int getInstance(@Entity int i10) {
        return nGetInstance(this.mNativeObject, i10);
    }

    public float getIntensity(@EntityInstance int i10) {
        return nGetIntensity(this.mNativeObject, i10);
    }

    public boolean getLightChannel(@EntityInstance int i10, int i11) {
        return nGetLightChannel(this.mNativeObject, i10, i11);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public float getOuterConeAngle(@EntityInstance int i10) {
        return nGetOuterConeAngle(this.mNativeObject, i10);
    }

    public float[] getPosition(@EntityInstance int i10, float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetPosition(this.mNativeObject, i10, fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public float getSunAngularRadius(@EntityInstance int i10) {
        return nGetSunAngularRadius(this.mNativeObject, i10);
    }

    public float getSunHaloFalloff(@EntityInstance int i10) {
        return nGetSunHaloFalloff(this.mNativeObject, i10);
    }

    public float getSunHaloSize(@EntityInstance int i10) {
        return nGetSunHaloSize(this.mNativeObject, i10);
    }

    public Type getType(@EntityInstance int i10) {
        return sTypeValues[nGetType(this.mNativeObject, i10)];
    }

    public boolean hasComponent(@Entity int i10) {
        return nHasComponent(this.mNativeObject, i10);
    }

    public boolean isDirectional(@EntityInstance int i10) {
        Type type = getType(i10);
        return type == Type.DIRECTIONAL || type == Type.SUN;
    }

    public boolean isPointLight(@EntityInstance int i10) {
        return getType(i10) == Type.POINT;
    }

    public boolean isShadowCaster(@EntityInstance int i10) {
        return nIsShadowCaster(this.mNativeObject, i10);
    }

    public boolean isSpotLight(@EntityInstance int i10) {
        Type type = getType(i10);
        return type == Type.SPOT || type == Type.FOCUSED_SPOT;
    }

    public void setColor(@EntityInstance int i10, float f10, float f11, float f12) {
        nSetColor(this.mNativeObject, i10, f10, f11, f12);
    }

    public void setDirection(@EntityInstance int i10, float f10, float f11, float f12) {
        nSetDirection(this.mNativeObject, i10, f10, f11, f12);
    }

    public void setFalloff(@EntityInstance int i10, float f10) {
        nSetFalloff(this.mNativeObject, i10, f10);
    }

    public void setIntensity(@EntityInstance int i10, float f10) {
        nSetIntensity(this.mNativeObject, i10, f10);
    }

    public void setIntensityCandela(@EntityInstance int i10, float f10) {
        nSetIntensityCandela(this.mNativeObject, i10, f10);
    }

    public void setLightChannel(@EntityInstance int i10, int i11, boolean z10) {
        nSetLightChannel(this.mNativeObject, i10, i11, z10);
    }

    public void setPosition(@EntityInstance int i10, float f10, float f11, float f12) {
        nSetPosition(this.mNativeObject, i10, f10, f11, f12);
    }

    public void setShadowCaster(@EntityInstance int i10, boolean z10) {
        nSetShadowCaster(this.mNativeObject, i10, z10);
    }

    public void setSpotLightCone(@EntityInstance int i10, float f10, float f11) {
        nSetSpotLightCone(this.mNativeObject, i10, f10, f11);
    }

    public void setSunAngularRadius(@EntityInstance int i10, float f10) {
        nSetSunAngularRadius(this.mNativeObject, i10, f10);
    }

    public void setSunHaloFalloff(@EntityInstance int i10, float f10) {
        nSetSunHaloFalloff(this.mNativeObject, i10, f10);
    }

    public void setSunHaloSize(@EntityInstance int i10, float f10) {
        nSetSunHaloSize(this.mNativeObject, i10, f10);
    }

    public void setIntensity(@EntityInstance int i10, float f10, float f11) {
        nSetIntensity(this.mNativeObject, i10, f10, f11);
    }
}
