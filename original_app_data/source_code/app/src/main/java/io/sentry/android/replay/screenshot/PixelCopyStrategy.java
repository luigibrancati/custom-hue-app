package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import fc.C4015H;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u00109R\u0014\u0010\u001c\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010<R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<R\u0014\u0010C\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010<¨\u0006D"}, d2 = {"Lio/sentry/android/replay/screenshot/PixelCopyStrategy;", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "Lio/sentry/android/replay/ExecutorProvider;", "executorProvider", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "Lio/sentry/android/replay/util/DebugOverlayDrawable;", "debugOverlayDrawable", "<init>", "(Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/util/DebugOverlayDrawable;)V", "Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "rect", "", "dominantColorForRect", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I", "Landroid/view/View;", "root", "Lfc/H;", "capture", "(Landroid/view/View;)V", "onContentChanged", "()V", "", "lastCaptureSuccessful", "()Z", "emitLastScreenshot", "close", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Lio/sentry/android/replay/util/DebugOverlayDrawable;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "singlePixelBitmap$delegate", "Lfc/k;", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmap", "screenshot", "Landroid/graphics/Bitmap;", "Landroid/graphics/Canvas;", "singlePixelBitmapCanvas$delegate", "getSinglePixelBitmapCanvas", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas", "Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/graphics/Paint;", "maskingPaint$delegate", "getMaskingPaint", "()Landroid/graphics/Paint;", "maskingPaint", "contentChanged", "isClosed", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
public final class PixelCopyStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;
    private final ScreenshotRecorderConfig config;
    private final AtomicBoolean contentChanged;
    private final DebugOverlayDrawable debugOverlayDrawable;
    private final ScheduledExecutorService executor;
    private final AtomicBoolean isClosed;
    private final AtomicBoolean lastCaptureSuccessful;
    private final MainLooperHandler mainLooperHandler;

    /* JADX INFO: renamed from: maskingPaint$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k maskingPaint;
    private final SentryOptions options;

    /* JADX INFO: renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k prescaledMatrix;
    private final Bitmap screenshot;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    /* JADX INFO: renamed from: singlePixelBitmap$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k singlePixelBitmap;

    /* JADX INFO: renamed from: singlePixelBitmapCanvas$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k singlePixelBitmapCanvas;

    public PixelCopyStrategy(ExecutorProvider executorProvider, ScreenshotRecorderCallback screenshotRecorderCallback, SentryOptions options, ScreenshotRecorderConfig config, DebugOverlayDrawable debugOverlayDrawable) {
        AbstractC4862t.e(executorProvider, "executorProvider");
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(config, "config");
        AbstractC4862t.e(debugOverlayDrawable, "debugOverlayDrawable");
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.executor = executorProvider.getExecutor();
        this.mainLooperHandler = executorProvider.getMainLooperHandler();
        EnumC4031n enumC4031n = EnumC4031n.NONE;
        this.singlePixelBitmap = C4029l.a(enumC4031n, PixelCopyStrategy$singlePixelBitmap$2.INSTANCE);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(...)");
        this.screenshot = bitmapCreateBitmap;
        this.singlePixelBitmapCanvas = C4029l.a(enumC4031n, new PixelCopyStrategy$singlePixelBitmapCanvas$2(this));
        this.prescaledMatrix = C4029l.a(enumC4031n, new PixelCopyStrategy$prescaledMatrix$2(this));
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.maskingPaint = C4029l.a(enumC4031n, PixelCopyStrategy$maskingPaint$2.INSTANCE);
        this.contentChanged = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2(final PixelCopyStrategy pixelCopyStrategy, final View view, int i10) {
        if (pixelCopyStrategy.isClosed.get()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 != 0) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
            pixelCopyStrategy.lastCaptureSuccessful.set(false);
        } else if (pixelCopyStrategy.contentChanged.get()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            pixelCopyStrategy.lastCaptureSuccessful.set(false);
        } else {
            final ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(view, null, 0, pixelCopyStrategy.options);
            ViewsKt.traverse(view, viewHierarchyNodeFromView, pixelCopyStrategy.options);
            pixelCopyStrategy.executor.submit(new ReplayRunnable("screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.screenshot.e
                @Override // java.lang.Runnable
                public final void run() {
                    PixelCopyStrategy.capture$lambda$2$lambda$1(this.f38676a, viewHierarchyNodeFromView, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1(final PixelCopyStrategy pixelCopyStrategy, ViewHierarchyNode viewHierarchyNode, final View view) {
        if (pixelCopyStrategy.isClosed.get() || pixelCopyStrategy.screenshot.isRecycled()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(pixelCopyStrategy.screenshot);
        canvas.setMatrix(pixelCopyStrategy.getPrescaledMatrix());
        viewHierarchyNode.traverse(new PixelCopyStrategy$capture$1$1$1(pixelCopyStrategy, arrayList, canvas));
        if (pixelCopyStrategy.options.getReplayController().isDebugMaskingOverlayEnabled()) {
            pixelCopyStrategy.mainLooperHandler.post(new Runnable() { // from class: io.sentry.android.replay.screenshot.g
                @Override // java.lang.Runnable
                public final void run() {
                    PixelCopyStrategy.capture$lambda$2$lambda$1$lambda$0(this.f38680a, view, arrayList);
                }
            });
        }
        ScreenshotRecorderCallback screenshotRecorderCallback = pixelCopyStrategy.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            screenshotRecorderCallback.onScreenshotRecorded(pixelCopyStrategy.screenshot);
        }
        pixelCopyStrategy.lastCaptureSuccessful.set(true);
        pixelCopyStrategy.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1$lambda$0(PixelCopyStrategy pixelCopyStrategy, View view, List list) {
        if (pixelCopyStrategy.debugOverlayDrawable.getCallback() == null) {
            view.getOverlay().add(pixelCopyStrategy.debugOverlayDrawable);
        }
        pixelCopyStrategy.debugOverlayDrawable.updateMasks(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$4(PixelCopyStrategy pixelCopyStrategy) {
        if (!pixelCopyStrategy.screenshot.isRecycled()) {
            synchronized (pixelCopyStrategy.screenshot) {
                try {
                    if (!pixelCopyStrategy.screenshot.isRecycled()) {
                        pixelCopyStrategy.screenshot.recycle();
                    }
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (pixelCopyStrategy.getSinglePixelBitmap().isRecycled()) {
            return;
        }
        pixelCopyStrategy.getSinglePixelBitmap().recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(Bitmap bitmap, Rect rect) {
        if (this.isClosed.get() || bitmap.isRecycled() || getSinglePixelBitmap().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint.getValue();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getSinglePixelBitmap() {
        return (Bitmap) this.singlePixelBitmap.getValue();
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    @SuppressLint({"NewApi"})
    public void capture(final View root) {
        AbstractC4862t.e(root, "root");
        Window phoneWindow = WindowsKt.getPhoneWindow(root);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.isClosed.get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            PixelCopy.request(phoneWindow, this.screenshot, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    PixelCopyStrategy.capture$lambda$2(this.f38674a, root, i10);
                }
            }, this.mainLooperHandler.getHandler());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th);
            this.lastCaptureSuccessful.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        this.executor.submit(new ReplayRunnable("PixelCopyStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.f
            @Override // java.lang.Runnable
            public final void run() {
                PixelCopyStrategy.close$lambda$4(this.f38679a);
            }
        }));
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || this.screenshot.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
        this.contentChanged.set(true);
    }
}
