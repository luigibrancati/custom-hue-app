package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class EglRenderer implements VideoSink {
    private static final UUID EMPTY_UUID = new UUID(0, 0);
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final Runnable eglExceptionCallback;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private EglThread eglThread;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private UUID f41644id;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private final ArrayList<RenderListener> renderListeners;
    private long renderSwapBufferTimeNs;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private final Object threadLock;
    private boolean usePresentationTimeStamp;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else {
                        if (!(obj instanceof SurfaceTexture)) {
                            throw new IllegalStateException("Invalid surface: " + String.valueOf(this.surface));
                        }
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        private EglSurfaceCreation() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer, boolean z10) {
            this.listener = frameListener;
            this.scale = f10;
            this.drawer = glDrawer;
            this.applyFpsReduction = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface RenderListener {
        void onRender(long j10);
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j10, int i10) {
        if (i10 <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j10 / ((long) i10)) + " us";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$5(float f10, float f11, float f12, float f13) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        this.eglBase.makeCurrent();
        GLES20.glClearColor(f10, f11, f12, f13);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$1(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f10, boolean z10) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f10, glDrawer, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.renderListeners.clear();
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$4(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$2(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeRenderListener$3(CountDownLatch countDownLatch, RenderListener renderListener) {
        countDownLatch.countDown();
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            if (it.next() == renderListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$swapBuffersOnRenderThread$6(VideoFrame videoFrame, long j10, boolean z10) {
        if (!z10) {
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                return;
            } else {
                this.eglBase.makeCurrent();
            }
        }
        if (this.usePresentationTimeStamp) {
            this.eglBase.swapBuffers(videoFrame.getTimestampNs());
        } else {
            this.eglBase.swapBuffers();
        }
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            it.next().onRender(System.nanoTime());
        }
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs += System.nanoTime() - j10;
        }
    }

    private void logD(String str) {
        Logging.d(TAG, this.name + str);
    }

    private void logE(String str, Throwable th) {
        Logging.e(TAG, this.name + str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j10 = jNanoTime - this.statisticsStartTimeNs;
                if (j10 > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                    float nanos = (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1L)) / j10;
                    logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j10) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format(nanos) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                    resetStatistics(jNanoTime);
                }
            } finally {
            }
        }
    }

    private void logW(String str) {
        Logging.w(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z10) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z10 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.getHandler().post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z10;
        float f10;
        float f11;
        float f12;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase == null || !eglBase.hasSurface()) {
                    logD("Dropping frame - No surface");
                    videoFrame.release();
                    return;
                }
                try {
                    this.eglBase.makeCurrent();
                    synchronized (this.fpsReductionLock) {
                        try {
                            long j10 = this.minRenderPeriodNs;
                            if (j10 != Long.MAX_VALUE) {
                                if (j10 > 0) {
                                    long jNanoTime = System.nanoTime();
                                    long j11 = this.nextFrameTimeNs;
                                    if (jNanoTime < j11) {
                                        logD("Skipping frame rendering - fps reduction is active.");
                                        z10 = false;
                                    } else {
                                        long j12 = j11 + this.minRenderPeriodNs;
                                        this.nextFrameTimeNs = j12;
                                        this.nextFrameTimeNs = Math.max(j12, jNanoTime);
                                    }
                                }
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } finally {
                        }
                    }
                    long jNanoTime2 = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f10 = this.layoutAspectRatio;
                        if (f10 == 0.0f) {
                            f10 = rotatedWidth;
                        }
                    }
                    if (rotatedWidth > f10) {
                        f12 = f10 / rotatedWidth;
                        f11 = 1.0f;
                    } else {
                        f11 = rotatedWidth / f10;
                        f12 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
                    this.drawMatrix.preScale(f12, f11);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    try {
                        if (z10) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(16384);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long jNanoTime3 = System.nanoTime();
                                swapBuffersOnRenderThread(videoFrame, jNanoTime3);
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs += jNanoTime3 - jNanoTime2;
                                }
                            } catch (GlUtil.GlOutOfMemoryException e10) {
                                logE("Error while drawing frame", e10);
                                ErrorCallback errorCallback = this.errorCallback;
                                if (errorCallback != null) {
                                    errorCallback.onGlOutOfMemory();
                                }
                                this.drawer.release();
                                this.frameDrawer.release();
                                this.bitmapTextureFramebuffer.release();
                                videoFrame.release();
                                return;
                            }
                        }
                        notifyCallbacks(videoFrame, z10);
                        videoFrame.release();
                    } catch (Throwable th) {
                        videoFrame.release();
                        throw th;
                    }
                } catch (GLException e11) {
                    logE("Error while eglMakeCurrent", e11);
                    videoFrame.release();
                }
            } finally {
            }
        }
    }

    private void resetStatistics(long j10) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j10;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j10) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                EglThread.RenderUpdate renderUpdate = new EglThread.RenderUpdate() { // from class: org.webrtc.q
                    @Override // org.webrtc.EglThread.RenderUpdate
                    public final void update(boolean z10) {
                        this.f41710a.lambda$swapBuffersOnRenderThread$6(videoFrame, j10, z10);
                    }
                };
                if (this.f41644id.equals(EMPTY_UUID)) {
                    this.eglThread.scheduleRenderUpdate(renderUpdate);
                } else {
                    this.eglThread.scheduleRenderUpdate(this.f41644id, renderUpdate);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f10) {
        addFrameListener(frameListener, f10, null, false);
    }

    public void addRenderListener(RenderListener renderListener) {
        this.renderListeners.add(renderListener);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z10) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logD("Initializing EglRenderer");
                this.eglThread = eglThread;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z10;
                eglThread.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = eglThread.createEglBaseWithSharedConnection();
                eglThread.getHandler().post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread.getHandler().postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z10;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame2 = this.pendingFrame;
                        z10 = videoFrame2 != null;
                        if (z10) {
                            videoFrame2.release();
                        }
                        this.pendingFrame = videoFrame;
                        videoFrame.retain();
                        this.eglThread.getHandler().post(new Runnable() { // from class: org.webrtc.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f41715a.renderFrameOnRenderThread();
                            }
                        });
                    } finally {
                    }
                }
                if (z10) {
                    synchronized (this.statisticsLock) {
                        this.framesDropped++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                Thread thread = eglThread == null ? null : eglThread.getHandler().getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    logD("Already released");
                    return;
                }
                eglThread.getHandler().removeCallbacks(this.logStatisticsRunnable);
                this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
                this.eglThread.getHandler().postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41713a.lambda$release$0(countDownLatch);
                    }
                });
                this.eglThread.release();
                this.eglThread = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    runnable.run();
                } else {
                    eglThread.getHandler().removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.eglThread.getHandler().postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f41698a.lambda$releaseEglSurface$4(runnable);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                if (Thread.currentThread() == this.eglThread.getHandler().getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new Runnable() { // from class: org.webrtc.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41716a.lambda$removeFrameListener$2(countDownLatch, frameListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeRenderListener(final RenderListener renderListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                if (Thread.currentThread() == this.eglThread.getHandler().getLooper().getThread()) {
                    throw new RuntimeException("removeRenderListener must not be called on the render thread.");
                }
                postToRenderThread(new Runnable() { // from class: org.webrtc.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41719a.lambda$removeRenderListener$3(countDownLatch, renderListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f10) {
        synchronized (this.fpsReductionLock) {
            try {
                long j10 = this.minRenderPeriodNs;
                if (f10 <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f10);
                }
                if (this.minRenderPeriodNs != j10) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setLayoutAspectRatio(float f10) {
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f10;
        }
    }

    public void setMirror(boolean z10) {
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z10;
        }
    }

    public void setMirrorVertically(boolean z10) {
        synchronized (this.layoutLock) {
            this.mirrorVertically = z10;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.f41644id = EMPTY_UUID;
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList<>();
        this.renderListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    try {
                        if (EglRenderer.this.eglThread != null) {
                            EglRenderer.this.eglThread.getHandler().removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                            EglRenderer.this.eglThread.getHandler().postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f10, glDrawer, false);
    }

    public void clearImage(final float f10, final float f11, final float f12, final float f13) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    return;
                }
                eglThread.getHandler().postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41705a.lambda$clearImage$5(f10, f11, f12, f13);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(final FrameListener frameListener, final float f10, final RendererCommon.GlDrawer glDrawer, final boolean z10) {
        postToRenderThread(new Runnable() { // from class: org.webrtc.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f41700a.lambda$addFrameListener$1(glDrawer, frameListener, f10, z10);
            }
        });
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z10, boolean z11) {
        if (z11) {
            this.f41644id = UUID.randomUUID();
        }
        init(eglThread, glDrawer, z10);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z10) {
        init(EglThread.create(null, context, iArr), glDrawer, z10);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
