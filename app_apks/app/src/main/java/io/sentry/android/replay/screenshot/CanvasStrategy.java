package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import fc.C4015H;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\u000e*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lio/sentry/android/replay/screenshot/CanvasStrategy;", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "Lio/sentry/android/replay/ExecutorProvider;", "executor", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "<init>", "(Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/View;", "root", "Lfc/H;", "capture", "(Landroid/view/View;)V", "onContentChanged", "()V", "close", "", "lastCaptureSuccessful", "()Z", "emitLastScreenshot", "Landroid/os/Handler;", "Lio/sentry/android/replay/util/ReplayRunnable;", "runnable", "postSafely", "(Landroid/os/Handler;Lio/sentry/android/replay/util/ReplayRunnable;)V", "Lio/sentry/android/replay/ExecutorProvider;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Landroid/graphics/Bitmap;", "screenshot", "Landroid/graphics/Bitmap;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/graphics/Picture;", "unprocessedPictureRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/sentry/util/AutoClosableReentrantLock;", "screenshotLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "Lfc/k;", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "textIgnoringCanvas", "Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "isClosed", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "Ljava/lang/Runnable;", "pictureRenderTask", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NewApi", "UseKtx"})
public final class CanvasStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;
    private final ScreenshotRecorderConfig config;
    private final ExecutorProvider executor;
    private final AtomicBoolean isClosed;
    private final AtomicBoolean lastCaptureSuccessful;
    private final SentryOptions options;

    @SuppressLint({"NewApi"})
    private final Runnable pictureRenderTask;

    /* JADX INFO: renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k prescaledMatrix;
    private volatile Bitmap screenshot;
    private final AutoClosableReentrantLock screenshotLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    private final Surface surface;
    private final SurfaceTexture surfaceTexture;
    private final TextIgnoringDelegateCanvas textIgnoringCanvas;
    private AtomicReference<Picture> unprocessedPictureRef;

    public CanvasStrategy(ExecutorProvider executor, ScreenshotRecorderCallback screenshotRecorderCallback, SentryOptions options, ScreenshotRecorderConfig config) {
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(config, "config");
        this.executor = executor;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.unprocessedPictureRef = new AtomicReference<>(null);
        this.screenshotLock = new AutoClosableReentrantLock();
        this.prescaledMatrix = C4029l.a(EnumC4031n.NONE, new CanvasStrategy$prescaledMatrix$2(this));
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.textIgnoringCanvas = new TextIgnoringDelegateCanvas();
        this.isClosed = new AtomicBoolean(false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(config.getRecordingWidth(), config.getRecordingHeight());
        this.surfaceTexture = surfaceTexture;
        this.surface = new Surface(surfaceTexture);
        IntegrationUtils.addIntegrationToSdkVersion("ReplayCanvasStrategy");
        this.pictureRenderTask = new Runnable() { // from class: io.sentry.android.replay.screenshot.a
            @Override // java.lang.Runnable
            public final void run() {
                CanvasStrategy.pictureRenderTask$lambda$3(this.f38671a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$6(CanvasStrategy canvasStrategy) {
        Bitmap bitmap = canvasStrategy.screenshot;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        canvasStrategy.surface.release();
        canvasStrategy.surfaceTexture.release();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3(final CanvasStrategy canvasStrategy) {
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture andSet = canvasStrategy.unprocessedPictureRef.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = canvasStrategy.surface.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                andSet.draw(canvasLockHardwareCanvas);
                canvasStrategy.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (canvasStrategy.screenshot == null) {
                    ISentryLifecycleToken iSentryLifecycleTokenAcquire = canvasStrategy.screenshotLock.acquire();
                    try {
                        if (canvasStrategy.screenshot == null) {
                            canvasStrategy.screenshot = Bitmap.createBitmap(canvasStrategy.config.getRecordingWidth(), canvasStrategy.config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
                        }
                        C4015H c4015h = C4015H.f34254a;
                        AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    } finally {
                    }
                }
                if (canvasStrategy.isClosed.get()) {
                    canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = canvasStrategy.surface;
                Bitmap bitmap = canvasStrategy.screenshot;
                AbstractC4862t.b(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i10) {
                        CanvasStrategy.pictureRenderTask$lambda$3$lambda$2(this.f38672a, i10);
                    }
                }, canvasStrategy.executor.getBackgroundHandler());
            } catch (Throwable th) {
                canvasStrategy.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        } catch (Throwable th2) {
            canvasStrategy.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: picture render failed", th2);
            canvasStrategy.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3$lambda$2(CanvasStrategy canvasStrategy, int i10) {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 == 0) {
            canvasStrategy.lastCaptureSuccessful.set(true);
            Bitmap bitmap = canvasStrategy.screenshot;
            if (bitmap == null || bitmap.isRecycled() || (screenshotRecorderCallback = canvasStrategy.screenshotRecorderCallback) == null) {
                return;
            }
            screenshotRecorderCallback.onScreenshotRecorded(bitmap);
            return;
        }
        canvasStrategy.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: PixelCopy failed with code " + i10, new Object[0]);
        canvasStrategy.lastCaptureSuccessful.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    @SuppressLint({"NewApi"})
    public void capture(View root) {
        AbstractC4862t.e(root, "root");
        if (this.isClosed.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.config.getRecordingWidth(), this.config.getRecordingHeight());
        AbstractC4862t.d(canvasBeginRecording, "beginRecording(...)");
        this.textIgnoringCanvas.setDelegate(canvasBeginRecording);
        this.textIgnoringCanvas.setMatrix(getPrescaledMatrix());
        root.draw(this.textIgnoringCanvas);
        picture.endRecording();
        if (this.isClosed.get()) {
            return;
        }
        this.unprocessedPictureRef.set(picture);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("screenshot_recorder.canvas", this.pictureRenderTask));
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("CanvasStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.c
            @Override // java.lang.Runnable
            public final void run() {
                CanvasStrategy.close$lambda$6(this.f38673a);
            }
        }));
        this.unprocessedPictureRef.getAndSet(null);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        Bitmap bitmap;
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || (bitmap = this.screenshot) == null || bitmap.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    public final void postSafely(Handler handler, ReplayRunnable runnable) {
        AbstractC4862t.e(handler, "<this>");
        AbstractC4862t.e(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: failed to post runnable " + runnable.getTaskName(), th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
    }
}
