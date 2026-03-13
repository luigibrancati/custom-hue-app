package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class IndirectLight {
    long mNativeObject;

    public IndirectLight(long j10) {
        this.mNativeObject = j10;
    }

    public static float[] getColorEstimate(float[] fArr, float[] fArr2, float f10, float f11, float f12) {
        if (fArr2.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] fArrAssertFloat4 = Asserts.assertFloat4(fArr);
        nGetColorEstimateStatic(fArrAssertFloat4, fArr2, f10, f11, f12);
        return fArrAssertFloat4;
    }

    public static float[] getDirectionEstimate(float[] fArr, float[] fArr2) {
        if (fArr.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr2);
        nGetDirectionEstimateStatic(fArr, fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReflections(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetColorEstimate(long j10, float[] fArr, float f10, float f11, float f12);

    private static native void nGetColorEstimateStatic(float[] fArr, float[] fArr2, float f10, float f11, float f12);

    private static native void nGetDirectionEstimate(long j10, float[] fArr);

    private static native void nGetDirectionEstimateStatic(float[] fArr, float[] fArr2);

    private static native float nGetIntensity(long j10);

    private static native long nGetIrradianceTexture(long j10);

    private static native long nGetReflectionsTexture(long j10);

    private static native void nGetRotation(long j10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradiance(long j10, int i10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradianceAsTexture(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRadiance(long j10, int i10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRotation(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    private static native void nSetIntensity(long j10, float f10);

    private static native void nSetRotation(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getIntensity() {
        return nGetIntensity(getNativeObject());
    }

    public Texture getIrradianceTexture() {
        long jNGetIrradianceTexture = nGetIrradianceTexture(getNativeObject());
        if (jNGetIrradianceTexture == 0) {
            return null;
        }
        return new Texture(jNGetIrradianceTexture);
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IndirectLight");
    }

    public Texture getReflectionsTexture() {
        long jNGetReflectionsTexture = nGetReflectionsTexture(getNativeObject());
        if (jNGetReflectionsTexture == 0) {
            return null;
        }
        return new Texture(jNGetReflectionsTexture);
    }

    public float[] getRotation(float[] fArr) {
        float[] fArrAssertMat3f = Asserts.assertMat3f(fArr);
        nGetRotation(getNativeObject(), fArrAssertMat3f);
        return fArrAssertMat3f;
    }

    public void setIntensity(float f10) {
        nSetIntensity(getNativeObject(), f10);
    }

    public void setRotation(float[] fArr) {
        Asserts.assertMat3fIn(fArr);
        nSetRotation(getNativeObject(), fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
    }

    @Deprecated
    public float[] getColorEstimate(float[] fArr, float f10, float f11, float f12) {
        float[] fArrAssertFloat4 = Asserts.assertFloat4(fArr);
        nGetColorEstimate(getNativeObject(), fArrAssertFloat4, f10, f11, f12);
        return fArrAssertFloat4;
    }

    @Deprecated
    public float[] getDirectionEstimate(float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetDirectionEstimate(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

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
                IndirectLight.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = IndirectLight.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public IndirectLight build(Engine engine) {
            long jNBuilderBuild = IndirectLight.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new IndirectLight(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create IndirectLight");
        }

        public Builder intensity(float f10) {
            IndirectLight.nIntensity(this.mNativeBuilder, f10);
            return this;
        }

        public Builder irradiance(int i10, float[] fArr) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (fArr.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nIrradiance(this.mNativeBuilder, i10, fArr);
            return this;
        }

        public Builder radiance(int i10, float[] fArr) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (fArr.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nRadiance(this.mNativeBuilder, i10, fArr);
            return this;
        }

        public Builder reflections(Texture texture) {
            IndirectLight.nBuilderReflections(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        public Builder rotation(float[] fArr) {
            IndirectLight.nRotation(this.mNativeBuilder, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
            return this;
        }

        public Builder irradiance(Texture texture) {
            IndirectLight.nIrradianceAsTexture(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }
    }
}
