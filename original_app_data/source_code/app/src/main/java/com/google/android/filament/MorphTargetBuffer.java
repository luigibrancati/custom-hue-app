package com.google.android.filament;

import java.nio.BufferOverflowException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MorphTargetBuffer {
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
                MorphTargetBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = MorphTargetBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public MorphTargetBuffer build(Engine engine) {
            long jNBuilderBuild = MorphTargetBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new MorphTargetBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create MorphTargetBuffer");
        }

        public Builder count(int i10) {
            MorphTargetBuffer.nBuilderCount(this.mNativeBuilder, i10);
            return this;
        }

        public Builder vertexCount(int i10) {
            MorphTargetBuffer.nBuilderVertexCount(this.mNativeBuilder, i10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetCount(long j10);

    private static native int nGetVertexCount(long j10);

    private static native int nSetPositionsAt(long j10, long j11, int i10, float[] fArr, int i11);

    private static native int nSetTangentsAt(long j10, long j11, int i10, short[] sArr, int i11);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getCount() {
        return nGetCount(this.mNativeObject);
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed MorphTargetBuffer");
    }

    public int getVertexCount() {
        return nGetVertexCount(this.mNativeObject);
    }

    public void setPositionsAt(Engine engine, int i10, float[] fArr, int i11) {
        if (nSetPositionsAt(this.mNativeObject, engine.getNativeObject(), i10, fArr, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setTangentsAt(Engine engine, int i10, short[] sArr, int i11) {
        if (nSetTangentsAt(this.mNativeObject, engine.getNativeObject(), i10, sArr, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    private MorphTargetBuffer(long j10) {
        this.mNativeObject = j10;
    }
}
