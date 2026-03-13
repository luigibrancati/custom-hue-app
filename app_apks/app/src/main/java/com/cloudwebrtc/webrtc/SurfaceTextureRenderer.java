package com.cloudwebrtc.webrtc;

import android.view.Surface;
import io.flutter.view.TextureRegistry;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SurfaceTextureRenderer extends EglRenderer {
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock;
    private TextureRegistry.SurfaceProducer producer;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private Surface surface;

    public SurfaceTextureRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
        this.surface = null;
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            try {
                if (this.isRenderingPaused) {
                    return;
                }
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    this.rotatedFrameHeight = rotatedHeight;
                    this.producer.setSize(this.rotatedFrameWidth, rotatedHeight);
                    this.frameRotation = videoFrame.getRotation();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.surface == null) {
            this.producer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            Surface surface = this.producer.getSurface();
            this.surface = surface;
            createEglSurface(surface);
        }
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f10) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = f10 == 0.0f;
        }
        super.setFpsReduction(f10);
    }

    public void surfaceCreated(TextureRegistry.SurfaceProducer surfaceProducer) {
        ThreadUtils.checkIsOnMainThread();
        this.producer = surfaceProducer;
        surfaceProducer.setCallback(new TextureRegistry.SurfaceProducer.Callback() { // from class: com.cloudwebrtc.webrtc.SurfaceTextureRenderer.1
            @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
            public void onSurfaceCleanup() {
                SurfaceTextureRenderer.this.surfaceDestroyed();
            }

            @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
            public void onSurfaceAvailable() {
            }
        });
    }

    public void surfaceDestroyed() {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new x(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.surface = null;
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = -1;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
