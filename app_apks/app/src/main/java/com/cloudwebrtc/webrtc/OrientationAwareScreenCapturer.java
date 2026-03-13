package com.cloudwebrtc.webrtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class OrientationAwareScreenCapturer implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isPortrait;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private int oldHeight;
    private int oldWidth;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;
    private WindowManager windowManager;
    private long numCapturedFrames = 0;
    private boolean isDisposed = false;

    public OrientationAwareScreenCapturer(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, VIRTUAL_DISPLAY_DPI, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private boolean isDeviceOrientationPortrait() {
        Display defaultDisplay = this.windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels > displayMetrics.widthPixels;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i10, int i11, int i12) {
        try {
            checkNotDisposed();
            if (this.oldWidth != i10 || this.oldHeight != i11) {
                this.oldWidth = i10;
                this.oldHeight = i11;
                if (i11 > i10) {
                    ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (OrientationAwareScreenCapturer.this.virtualDisplay == null || OrientationAwareScreenCapturer.this.surfaceTextureHelper == null) {
                                return;
                            }
                            OrientationAwareScreenCapturer.this.virtualDisplay.setSurface(new Surface(OrientationAwareScreenCapturer.this.surfaceTextureHelper.getSurfaceTexture()));
                            OrientationAwareScreenCapturer.this.surfaceTextureHelper.setTextureSize(OrientationAwareScreenCapturer.this.oldWidth, OrientationAwareScreenCapturer.this.oldHeight);
                            OrientationAwareScreenCapturer.this.virtualDisplay.resize(OrientationAwareScreenCapturer.this.oldWidth, OrientationAwareScreenCapturer.this.oldHeight, OrientationAwareScreenCapturer.VIRTUAL_DISPLAY_DPI);
                        }
                    });
                }
                int i13 = this.oldWidth;
                int i14 = this.oldHeight;
                if (i13 > i14) {
                    this.surfaceTextureHelper.setTextureSize(i13, i14);
                    this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ThreadUtils.invokeAtFrontUninterruptibly(OrientationAwareScreenCapturer.this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (OrientationAwareScreenCapturer.this.virtualDisplay == null || OrientationAwareScreenCapturer.this.surfaceTextureHelper == null) {
                                        return;
                                    }
                                    OrientationAwareScreenCapturer.this.virtualDisplay.resize(OrientationAwareScreenCapturer.this.oldWidth, OrientationAwareScreenCapturer.this.oldHeight, OrientationAwareScreenCapturer.VIRTUAL_DISPLAY_DPI);
                                }
                            });
                        }
                    }, 700L);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.windowManager = (WindowManager) context.getSystemService("window");
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        checkNotDisposed();
        this.isPortrait = isDeviceOrientationPortrait();
        int iMax = Math.max(this.height, this.width);
        int iMin = Math.min(this.height, this.width);
        if (this.isPortrait) {
            changeCaptureFormat(iMin, iMax, 15);
        } else {
            changeCaptureFormat(iMax, iMin, 15);
        }
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i10, int i11, int i12) {
        try {
            boolean zIsDeviceOrientationPortrait = isDeviceOrientationPortrait();
            this.isPortrait = zIsDeviceOrientationPortrait;
            if (zIsDeviceOrientationPortrait) {
                this.width = i10;
                this.height = i11;
            } else {
                this.height = i10;
                this.width = i11;
            }
            MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
            this.mediaProjection = mediaProjection;
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            this.surfaceTextureHelper.startListening(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.1
            @Override // java.lang.Runnable
            public void run() {
                OrientationAwareScreenCapturer.this.surfaceTextureHelper.stopListening();
                OrientationAwareScreenCapturer.this.capturerObserver.onCapturerStopped();
                if (OrientationAwareScreenCapturer.this.virtualDisplay != null) {
                    OrientationAwareScreenCapturer.this.virtualDisplay.release();
                    OrientationAwareScreenCapturer.this.virtualDisplay = null;
                }
                if (OrientationAwareScreenCapturer.this.mediaProjection != null) {
                    OrientationAwareScreenCapturer.this.mediaProjection.unregisterCallback(OrientationAwareScreenCapturer.this.mediaProjectionCallback);
                    OrientationAwareScreenCapturer.this.mediaProjection.stop();
                    OrientationAwareScreenCapturer.this.mediaProjection = null;
                }
            }
        });
    }
}
