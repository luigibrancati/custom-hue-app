package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class IndexBuffer {
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
                IndexBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum IndexType {
            USHORT,
            UINT
        }

        public Builder() {
            long jNCreateBuilder = IndexBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Builder bufferType(IndexType indexType) {
            IndexBuffer.nBuilderBufferType(this.mNativeBuilder, indexType.ordinal());
            return this;
        }

        public IndexBuffer build(Engine engine) {
            long jNBuilderBuild = IndexBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new IndexBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create IndexBuffer");
        }

        public Builder indexCount(int i10) {
            IndexBuffer.nBuilderIndexCount(this.mNativeBuilder, i10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferType(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIndexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetIndexCount(long j10);

    private static native int nSetBuffer(long j10, long j11, Buffer buffer, int i10, int i11, int i12, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getIndexCount() {
        return nGetIndexCount(getNativeObject());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void setBuffer(Engine engine, Buffer buffer) {
        setBuffer(engine, buffer, 0, 0, null, null);
    }

    private IndexBuffer(long j10) {
        this.mNativeObject = j10;
    }

    public void setBuffer(Engine engine, Buffer buffer, int i10, int i11) {
        setBuffer(engine, buffer, i10, i11, null, null);
    }

    public void setBuffer(Engine engine, Buffer buffer, int i10, int i11, Object obj, Runnable runnable) {
        long nativeObject = getNativeObject();
        long nativeObject2 = engine.getNativeObject();
        int iRemaining = buffer.remaining();
        if (i11 == 0) {
            i11 = buffer.remaining();
        }
        if (nSetBuffer(nativeObject, nativeObject2, buffer, iRemaining, i10, i11, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }
}
