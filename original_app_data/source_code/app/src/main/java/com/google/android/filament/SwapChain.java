package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SwapChain {
    private long mNativeObject;
    private final Object mSurface;

    public SwapChain(long j10, Object obj) {
        this.mNativeObject = j10;
        this.mSurface = obj;
    }

    public static boolean isMSAASwapChainSupported(Engine engine, int i10) {
        return nIsMSAASwapChainSupported(engine.getNativeObject(), i10);
    }

    public static boolean isProtectedContentSupported(Engine engine) {
        return nIsProtectedContentSupported(engine.getNativeObject());
    }

    public static boolean isSRGBSwapChainSupported(Engine engine) {
        return nIsSRGBSwapChainSupported(engine.getNativeObject());
    }

    private static native boolean nIsFrameScheduledCallbackSet(long j10);

    private static native boolean nIsMSAASwapChainSupported(long j10, int i10);

    private static native boolean nIsProtectedContentSupported(long j10);

    private static native boolean nIsSRGBSwapChainSupported(long j10);

    private static native void nSetFrameCompletedCallback(long j10, Object obj, Runnable runnable);

    private static native void nSetFrameScheduledCallback(long j10, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed SwapChain");
    }

    public Object getNativeWindow() {
        return this.mSurface;
    }

    public boolean isFrameScheduledCallbackSet() {
        return nIsFrameScheduledCallbackSet(getNativeObject());
    }

    public void setFrameCompletedCallback(Object obj, Runnable runnable) {
        nSetFrameCompletedCallback(getNativeObject(), obj, runnable);
    }

    public void setFrameScheduledCallback(Object obj, Runnable runnable) {
        nSetFrameScheduledCallback(getNativeObject(), obj, runnable);
    }
}
