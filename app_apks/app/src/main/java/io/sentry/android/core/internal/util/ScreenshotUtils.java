package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.util.thread.IThreadChecker;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ScreenshotUtils {
    private static final long CAPTURE_TIMEOUT_MS = 1000;

    public static /* synthetic */ void a(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } catch (Throwable th) {
            try {
                iLogger.log(SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i10) {
        atomicBoolean.set(i10 == 0);
        countDownLatch.countDown();
    }

    public static Bitmap captureScreenshot(Activity activity, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return captureScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    public static byte[] compressBitmapToPng(Bitmap bitmap, ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.log(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                iLogger.log(SentryLevel.ERROR, "Compressing bitmap failed.", th);
            }
        }
        return null;
    }

    private static boolean isActivityValid(Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static byte[] takeScreenshot(Activity activity, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return takeScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    @SuppressLint({"NewApi"})
    public static byte[] takeScreenshot(Activity activity, IThreadChecker iThreadChecker, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return compressBitmapToPng(captureScreenshot(activity, iThreadChecker, iLogger, buildInfoProvider), iLogger);
    }

    @SuppressLint({"NewApi"})
    public static Bitmap captureScreenshot(Activity activity, IThreadChecker iThreadChecker, final ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        boolean z10 = false;
        if (!isActivityValid(activity)) {
            iLogger.log(SentryLevel.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.log(SentryLevel.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.log(SentryLevel.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        final View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.log(SentryLevel.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() > 0 && rootView.getHeight() > 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                if (buildInfoProvider.getSdkInfoVersion() >= 26) {
                    HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                    handlerThread.start();
                    try {
                        Handler handler = new Handler(handlerThread.getLooper());
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.i
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i10) {
                                ScreenshotUtils.b(atomicBoolean, countDownLatch, i10);
                            }
                        }, handler);
                        if (countDownLatch.await(CAPTURE_TIMEOUT_MS, TimeUnit.MILLISECONDS)) {
                            if (atomicBoolean.get()) {
                                z10 = true;
                            }
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    if (!z10) {
                        return null;
                    }
                } else {
                    final Canvas canvas = new Canvas(bitmapCreateBitmap);
                    if (iThreadChecker.isMainThread()) {
                        rootView.draw(canvas);
                        countDownLatch.countDown();
                    } else {
                        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.internal.util.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScreenshotUtils.a(rootView, canvas, iLogger, countDownLatch);
                            }
                        });
                    }
                    if (!countDownLatch.await(CAPTURE_TIMEOUT_MS, TimeUnit.MILLISECONDS)) {
                        return null;
                    }
                }
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                iLogger.log(SentryLevel.ERROR, "Taking screenshot failed.", th);
                return null;
            }
        }
        iLogger.log(SentryLevel.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
        return null;
    }
}
