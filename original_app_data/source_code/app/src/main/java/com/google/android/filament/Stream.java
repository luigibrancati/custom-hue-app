package com.google.android.filament;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Stream {
    private static final StreamType[] sStreamTypeValues = StreamType.values();
    private long mNativeEngine;
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
                Stream.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Stream.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Stream build(Engine engine) {
            long jNBuilderBuild = Stream.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Stream(jNBuilderBuild, engine);
            }
            throw new IllegalStateException("Couldn't create Stream");
        }

        public Builder height(int i10) {
            Stream.nBuilderHeight(this.mNativeBuilder, i10);
            return this;
        }

        public Builder stream(Object obj) {
            if (Platform.get().validateStreamSource(obj)) {
                Stream.nBuilderStreamSource(this.mNativeBuilder, obj);
                return this;
            }
            throw new IllegalArgumentException("Invalid stream source: " + obj);
        }

        public Builder width(int i10) {
            Stream.nBuilderWidth(this.mNativeBuilder, i10);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StreamType {
        NATIVE,
        ACQUIRED
    }

    public Stream(long j10, Engine engine) {
        this.mNativeObject = j10;
        this.mNativeEngine = engine.getNativeObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderStreamSource(long j10, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetStreamType(long j10);

    private static native long nGetTimestamp(long j10);

    private static native int nReadPixels(long j10, long j11, int i10, int i11, int i12, int i13, Buffer buffer, int i14, int i15, int i16, int i17, int i18, int i19, int i20, Object obj, Runnable runnable);

    private static native void nSetAcquiredImage(long j10, long j11, Object obj, Object obj2, Runnable runnable);

    private static native void nSetDimensions(long j10, int i10, int i11);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Stream");
    }

    public StreamType getStreamType() {
        return sStreamTypeValues[nGetStreamType(getNativeObject())];
    }

    public long getTimestamp() {
        return nGetTimestamp(getNativeObject());
    }

    public void setAcquiredImage(Object obj, Object obj2, Runnable runnable) {
        nSetAcquiredImage(getNativeObject(), this.mNativeEngine, obj, obj2, runnable);
    }

    public void setDimensions(int i10, int i11) {
        nSetDimensions(getNativeObject(), i10, i11);
    }
}
