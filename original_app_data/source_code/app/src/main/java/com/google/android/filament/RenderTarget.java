package com.google.android.filament;

import com.google.android.filament.Texture;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class RenderTarget {
    private static final int ATTACHMENT_COUNT = AttachmentPoint.values().length;
    private static final Texture.CubemapFace[] sCubemapFaceValues = Texture.CubemapFace.values();
    private long mNativeObject;
    private final Texture[] mTextures;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum AttachmentPoint {
        COLOR,
        COLOR1,
        COLOR2,
        COLOR3,
        COLOR4,
        COLOR5,
        COLOR6,
        COLOR7,
        DEPTH
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        private final Texture[] mTextures = new Texture[RenderTarget.ATTACHMENT_COUNT];

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
                RenderTarget.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = RenderTarget.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public RenderTarget build(Engine engine) {
            long jNBuilderBuild = RenderTarget.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new RenderTarget(jNBuilderBuild, this);
            }
            throw new IllegalStateException("Couldn't create RenderTarget");
        }

        public Builder face(AttachmentPoint attachmentPoint, Texture.CubemapFace cubemapFace) {
            RenderTarget.nBuilderFace(this.mNativeBuilder, attachmentPoint.ordinal(), cubemapFace.ordinal());
            return this;
        }

        public Builder layer(AttachmentPoint attachmentPoint, int i10) {
            RenderTarget.nBuilderLayer(this.mNativeBuilder, attachmentPoint.ordinal(), i10);
            return this;
        }

        public Builder mipLevel(AttachmentPoint attachmentPoint, int i10) {
            RenderTarget.nBuilderMipLevel(this.mNativeBuilder, attachmentPoint.ordinal(), i10);
            return this;
        }

        public Builder texture(AttachmentPoint attachmentPoint, Texture texture) {
            this.mTextures[attachmentPoint.ordinal()] = texture;
            RenderTarget.nBuilderTexture(this.mNativeBuilder, attachmentPoint.ordinal(), texture != null ? texture.getNativeObject() : 0L);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFace(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayer(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMipLevel(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTexture(long j10, int i10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetFace(long j10, int i10);

    private static native int nGetLayer(long j10, int i10);

    private static native int nGetMipLevel(long j10, int i10);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public Texture.CubemapFace getFace(AttachmentPoint attachmentPoint) {
        return sCubemapFaceValues[nGetFace(getNativeObject(), attachmentPoint.ordinal())];
    }

    public int getLayer(AttachmentPoint attachmentPoint) {
        return nGetLayer(getNativeObject(), attachmentPoint.ordinal());
    }

    public int getMipLevel(AttachmentPoint attachmentPoint) {
        return nGetMipLevel(getNativeObject(), attachmentPoint.ordinal());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed RenderTarget");
    }

    public Texture getTexture(AttachmentPoint attachmentPoint) {
        return this.mTextures[attachmentPoint.ordinal()];
    }

    private RenderTarget(long j10, Builder builder) {
        int i10 = ATTACHMENT_COUNT;
        Texture[] textureArr = new Texture[i10];
        this.mTextures = textureArr;
        this.mNativeObject = j10;
        System.arraycopy(builder.mTextures, 0, textureArr, 0, i10);
    }
}
