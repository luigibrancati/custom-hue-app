package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ColorGrading {
    long mNativeObject;

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
                ColorGrading.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = ColorGrading.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public ColorGrading build(Engine engine) {
            long jNBuilderBuild = ColorGrading.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new ColorGrading(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create ColorGrading");
        }

        public Builder channelMixer(float[] fArr, float[] fArr2, float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderChannelMixer(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder contrast(float f10) {
            ColorGrading.nBuilderContrast(this.mNativeBuilder, f10);
            return this;
        }

        public Builder curves(float[] fArr, float[] fArr2, float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderCurves(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder dimensions(int i10) {
            ColorGrading.nBuilderDimensions(this.mNativeBuilder, i10);
            return this;
        }

        public Builder exposure(float f10) {
            ColorGrading.nBuilderExposure(this.mNativeBuilder, f10);
            return this;
        }

        public Builder format(LutFormat lutFormat) {
            ColorGrading.nBuilderFormat(this.mNativeBuilder, lutFormat.ordinal());
            return this;
        }

        public Builder gamutMapping(boolean z10) {
            ColorGrading.nBuilderGamutMapping(this.mNativeBuilder, z10);
            return this;
        }

        public Builder luminanceScaling(boolean z10) {
            ColorGrading.nBuilderLuminanceScaling(this.mNativeBuilder, z10);
            return this;
        }

        public Builder nightAdaptation(float f10) {
            ColorGrading.nBuilderNightAdaptation(this.mNativeBuilder, f10);
            return this;
        }

        public Builder quality(QualityLevel qualityLevel) {
            ColorGrading.nBuilderQuality(this.mNativeBuilder, qualityLevel.ordinal());
            return this;
        }

        public Builder saturation(float f10) {
            ColorGrading.nBuilderSaturation(this.mNativeBuilder, f10);
            return this;
        }

        public Builder shadowsMidtonesHighlights(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            Asserts.assertFloat4In(fArr);
            Asserts.assertFloat4In(fArr2);
            Asserts.assertFloat4In(fArr3);
            Asserts.assertFloat4In(fArr4);
            ColorGrading.nBuilderShadowsMidtonesHighlights(this.mNativeBuilder, fArr, fArr2, fArr3, fArr4);
            return this;
        }

        public Builder slopeOffsetPower(float[] fArr, float[] fArr2, float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderSlopeOffsetPower(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder toneMapper(ToneMapper toneMapper) {
            ColorGrading.nBuilderToneMapper(this.mNativeBuilder, toneMapper.getNativeObject());
            return this;
        }

        @Deprecated
        public Builder toneMapping(ToneMapping toneMapping) {
            ColorGrading.nBuilderToneMapping(this.mNativeBuilder, toneMapping.ordinal());
            return this;
        }

        public Builder vibrance(float f10) {
            ColorGrading.nBuilderVibrance(this.mNativeBuilder, f10);
            return this;
        }

        public Builder whiteBalance(float f10, float f11) {
            ColorGrading.nBuilderWhiteBalance(this.mNativeBuilder, f10, f11);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum LutFormat {
        INTEGER,
        FLOAT
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum QualityLevel {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Deprecated
    public enum ToneMapping {
        LINEAR,
        ACES_LEGACY,
        ACES,
        FILMIC,
        DISPLAY_RANGE
    }

    public ColorGrading(long j10) {
        this.mNativeObject = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannelMixer(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderContrast(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCurves(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDimensions(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderExposure(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGamutMapping(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLuminanceScaling(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNightAdaptation(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderQuality(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSaturation(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowsMidtonesHighlights(long j10, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSlopeOffsetPower(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapper(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapping(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVibrance(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWhiteBalance(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed ColorGrading");
    }
}
