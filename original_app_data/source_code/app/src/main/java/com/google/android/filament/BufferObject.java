package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BufferObject {
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum BindingType {
            VERTEX
        }

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
                BufferObject.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = BufferObject.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Builder bindingType(BindingType bindingType) {
            BufferObject.nBuilderBindingType(this.mNativeBuilder, bindingType.ordinal());
            return this;
        }

        public BufferObject build(Engine engine) {
            long jNBuilderBuild = BufferObject.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new BufferObject(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create BufferObject");
        }

        public Builder size(int i10) {
            BufferObject.nBuilderSize(this.mNativeBuilder, i10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBindingType(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSize(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetByteCount(long j10);

    private static native int nSetBuffer(long j10, long j11, Buffer buffer, int i10, int i11, int i12, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getByteCount() {
        return nGetByteCount(getNativeObject());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed BufferObject");
    }

    public void setBuffer(Engine engine, Buffer buffer) {
        setBuffer(engine, buffer, 0, 0, null, null);
    }

    private BufferObject(long j10) {
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
