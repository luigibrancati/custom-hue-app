package com.google.android.filament;

import com.google.android.filament.Texture;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Renderer {
    public static final int MIRROR_FRAME_FLAG_CLEAR = 4;
    public static final int MIRROR_FRAME_FLAG_COMMIT = 1;
    public static final int MIRROR_FRAME_FLAG_SET_PRESENTATION_TIME = 2;
    private ClearOptions mClearOptions;
    private DisplayInfo mDisplayInfo;
    private final Engine mEngine;
    private FrameRateOptions mFrameRateOptions;
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ClearOptions {
        public float[] clearColor = {0.0f, 0.0f, 0.0f, 0.0f};
        public boolean clear = false;
        public boolean discard = true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DisplayInfo {
        public float refreshRate = 60.0f;

        @Deprecated
        public long presentationDeadlineNanos = 0;

        @Deprecated
        public long vsyncOffsetNanos = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FrameRateOptions {
        public float interval = 1.0f;
        public float headRoomRatio = 0.0f;
        public float scaleRate = 0.06666667f;
        public int history = 15;
    }

    public Renderer(Engine engine, long j10) {
        this.mEngine = engine;
        this.mNativeObject = j10;
    }

    private static native boolean nBeginFrame(long j10, long j11, long j12);

    private static native void nCopyFrame(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native void nEndFrame(long j10);

    private static native int nGetFrameToSkipCount(long j10);

    private static native double nGetUserTime(long j10);

    private static native int nReadPixels(long j10, long j11, int i10, int i11, int i12, int i13, Buffer buffer, int i14, int i15, int i16, int i17, int i18, int i19, int i20, Object obj, Runnable runnable);

    private static native int nReadPixelsEx(long j10, long j11, long j12, int i10, int i11, int i12, int i13, Buffer buffer, int i14, int i15, int i16, int i17, int i18, int i19, int i20, Object obj, Runnable runnable);

    private static native void nRender(long j10, long j11);

    private static native void nRenderStandaloneView(long j10, long j11);

    private static native void nResetUserTime(long j10);

    private static native void nSetClearOptions(long j10, float f10, float f11, float f12, float f13, boolean z10, boolean z11);

    private static native void nSetDisplayInfo(long j10, float f10);

    private static native void nSetFrameRateOptions(long j10, float f10, float f11, float f12, int i10);

    private static native void nSetPresentationTime(long j10, long j11);

    private static native void nSetVsyncTime(long j10, long j11);

    private static native boolean nShouldRenderFrame(long j10);

    private static native void nSkipFrame(long j10, long j11);

    private static native void nSkipNextFrames(long j10, int i10);

    public boolean beginFrame(SwapChain swapChain, long j10) {
        return nBeginFrame(getNativeObject(), swapChain.getNativeObject(), j10);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void copyFrame(SwapChain swapChain, Viewport viewport, Viewport viewport2, int i10) {
        nCopyFrame(getNativeObject(), swapChain.getNativeObject(), viewport.left, viewport.bottom, viewport.width, viewport.height, viewport2.left, viewport2.bottom, viewport2.width, viewport2.height, i10);
    }

    public void endFrame() {
        nEndFrame(getNativeObject());
    }

    public ClearOptions getClearOptions() {
        if (this.mClearOptions == null) {
            this.mClearOptions = new ClearOptions();
        }
        return this.mClearOptions;
    }

    public DisplayInfo getDisplayInfo() {
        if (this.mDisplayInfo == null) {
            this.mDisplayInfo = new DisplayInfo();
        }
        return this.mDisplayInfo;
    }

    public Engine getEngine() {
        return this.mEngine;
    }

    public FrameRateOptions getFrameRateOptions() {
        if (this.mFrameRateOptions == null) {
            this.mFrameRateOptions = new FrameRateOptions();
        }
        return this.mFrameRateOptions;
    }

    public int getFrameToSkipCount() {
        return nGetFrameToSkipCount(getNativeObject());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Renderer");
    }

    public double getUserTime() {
        return nGetUserTime(getNativeObject());
    }

    @Deprecated
    public void mirrorFrame(SwapChain swapChain, Viewport viewport, Viewport viewport2, int i10) {
        copyFrame(swapChain, viewport, viewport2, i10);
    }

    public void readPixels(int i10, int i11, int i12, int i13, Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (pixelBufferDescriptor.storage.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        long nativeObject = getNativeObject();
        long nativeObject2 = this.mEngine.getNativeObject();
        Buffer buffer = pixelBufferDescriptor.storage;
        if (nReadPixels(nativeObject, nativeObject2, i10, i11, i12, i13, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void render(View view) {
        nRender(getNativeObject(), view.getNativeObject());
    }

    public void renderStandaloneView(View view) {
        nRenderStandaloneView(getNativeObject(), view.getNativeObject());
    }

    public void resetUserTime() {
        nResetUserTime(getNativeObject());
    }

    public void setClearOptions(ClearOptions clearOptions) {
        this.mClearOptions = clearOptions;
        long nativeObject = getNativeObject();
        float[] fArr = clearOptions.clearColor;
        nSetClearOptions(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], clearOptions.clear, clearOptions.discard);
    }

    public void setDisplayInfo(DisplayInfo displayInfo) {
        this.mDisplayInfo = displayInfo;
        nSetDisplayInfo(getNativeObject(), displayInfo.refreshRate);
    }

    public void setFrameRateOptions(FrameRateOptions frameRateOptions) {
        this.mFrameRateOptions = frameRateOptions;
        nSetFrameRateOptions(getNativeObject(), frameRateOptions.interval, frameRateOptions.headRoomRatio, frameRateOptions.scaleRate, frameRateOptions.history);
    }

    public void setPresentationTime(long j10) {
        nSetPresentationTime(getNativeObject(), j10);
    }

    public void setVsyncTime(long j10) {
        nSetVsyncTime(getNativeObject(), j10);
    }

    public boolean shouldRenderFrame() {
        return nShouldRenderFrame(getNativeObject());
    }

    public void skipFrame(long j10) {
        nSkipFrame(getNativeObject(), j10);
    }

    public void skipNextFrames(int i10) {
        nSkipNextFrames(getNativeObject(), i10);
    }

    public void readPixels(RenderTarget renderTarget, int i10, int i11, int i12, int i13, Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (!pixelBufferDescriptor.storage.isReadOnly()) {
            long nativeObject = getNativeObject();
            long nativeObject2 = this.mEngine.getNativeObject();
            long nativeObject3 = renderTarget.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            if (nReadPixelsEx(nativeObject, nativeObject2, nativeObject3, i10, i11, i12, i13, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) < 0) {
                throw new BufferOverflowException();
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }
}
