package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Skybox {
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
                Skybox.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Skybox.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Skybox build(Engine engine) {
            long jNBuilderBuild = Skybox.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Skybox(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Skybox");
        }

        public Builder color(float f10, float f11, float f12, float f13) {
            Skybox.nBuilderColor(this.mNativeBuilder, f10, f11, f12, f13);
            return this;
        }

        public Builder environment(Texture texture) {
            Skybox.nBuilderEnvironment(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        public Builder intensity(float f10) {
            Skybox.nBuilderIntensity(this.mNativeBuilder, f10);
            return this;
        }

        public Builder showSun(boolean z10) {
            Skybox.nBuilderShowSun(this.mNativeBuilder, z10);
            return this;
        }

        public Builder color(float[] fArr) {
            Skybox.nBuilderColor(this.mNativeBuilder, fArr[0], fArr[1], fArr[2], fArr[3]);
            return this;
        }
    }

    public Skybox(long j10) {
        this.mNativeObject = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j10, float f10, float f11, float f12, float f13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnvironment(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShowSun(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native float nGetIntensity(long j10);

    private static native int nGetLayerMask(long j10);

    private static native long nGetTexture(long j10);

    private static native void nSetColor(long j10, float f10, float f11, float f12, float f13);

    private static native void nSetLayerMask(long j10, int i10, int i11);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getIntensity() {
        return nGetIntensity(getNativeObject());
    }

    public int getLayerMask() {
        return nGetLayerMask(getNativeObject());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Skybox");
    }

    public Texture getTexture() {
        long jNGetTexture = nGetTexture(getNativeObject());
        if (jNGetTexture == 0) {
            return null;
        }
        return new Texture(jNGetTexture);
    }

    public void setColor(float f10, float f11, float f12, float f13) {
        nSetColor(getNativeObject(), f10, f11, f12, f13);
    }

    public void setLayerMask(int i10, int i11) {
        nSetLayerMask(getNativeObject(), i10 & 255, i11 & 255);
    }

    public void setColor(float[] fArr) {
        nSetColor(getNativeObject(), fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
