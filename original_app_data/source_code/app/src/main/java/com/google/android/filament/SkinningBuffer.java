package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SkinningBuffer {
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
                SkinningBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = SkinningBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Builder boneCount(int i10) {
            SkinningBuffer.nBuilderBoneCount(this.mNativeBuilder, i10);
            return this;
        }

        public SkinningBuffer build(Engine engine) {
            long jNBuilderBuild = SkinningBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new SkinningBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create SkinningBuffer");
        }

        public Builder initialize(boolean z10) {
            SkinningBuffer.nBuilderInitialize(this.mNativeBuilder, z10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoneCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInitialize(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetBoneCount(long j10);

    private static native int nSetBonesAsMatrices(long j10, long j11, Buffer buffer, int i10, int i11, int i12);

    private static native int nSetBonesAsQuaternions(long j10, long j11, Buffer buffer, int i10, int i11, int i12);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getBoneCount() {
        return nGetBoneCount(this.mNativeObject);
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void setBonesAsMatrices(Engine engine, Buffer buffer, int i10, int i11) {
        if (nSetBonesAsMatrices(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), i10, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setBonesAsQuaternions(Engine engine, Buffer buffer, int i10, int i11) {
        if (nSetBonesAsQuaternions(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), i10, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    private SkinningBuffer(long j10) {
        this.mNativeObject = j10;
    }
}
