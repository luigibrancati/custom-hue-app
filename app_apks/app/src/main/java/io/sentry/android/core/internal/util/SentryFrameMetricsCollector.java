package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryUUID;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.util.Objects;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryFrameMetricsCollector implements Application.ActivityLifecycleCallbacks {
    private final BuildInfoProvider buildInfoProvider;
    private Choreographer choreographer;
    private Field choreographerLastFrameTimeField;
    private WeakReference<Window> currentWindow;
    private Window.OnFrameMetricsAvailableListener frameMetricsAvailableListener;
    private Handler handler;
    private boolean isAvailable;
    private long lastFrameEndNanos;
    private long lastFrameStartNanos;
    private final Map<String, FrameMetricsCollectorListener> listenerMap;
    private final ILogger logger;
    private final Set<Window> trackedWindows;
    private final WindowFrameMetricsManager windowFrameMetricsManager;
    private static final long oneSecondInNanos = TimeUnit.SECONDS.toNanos(1);
    private static final long frozenFrameThresholdNanos = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface FrameMetricsCollectorListener {
        void onFrameMetricCollected(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface WindowFrameMetricsManager {
        default void addOnFrameMetricsAvailableListener(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void removeOnFrameMetricsAvailableListener(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    @SuppressLint({"NewApi"})
    public SentryFrameMetricsCollector(Context context, SentryOptions sentryOptions, BuildInfoProvider buildInfoProvider) {
        this(context, sentryOptions, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.1
        });
    }

    public static /* synthetic */ void a(SentryFrameMetricsCollector sentryFrameMetricsCollector, ILogger iLogger) {
        sentryFrameMetricsCollector.getClass();
        try {
            sentryFrameMetricsCollector.choreographer = Choreographer.getInstance();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    public static /* synthetic */ void b(SentryFrameMetricsCollector sentryFrameMetricsCollector, Window window) {
        if (sentryFrameMetricsCollector.trackedWindows.add(window)) {
            try {
                sentryFrameMetricsCollector.windowFrameMetricsManager.addOnFrameMetricsAvailableListener(window, sentryFrameMetricsCollector.frameMetricsAvailableListener, sentryFrameMetricsCollector.handler);
            } catch (Throwable th) {
                sentryFrameMetricsCollector.logger.log(SentryLevel.ERROR, "Failed to add frameMetricsAvailableListener", th);
            }
        }
    }

    public static /* synthetic */ void c(SentryFrameMetricsCollector sentryFrameMetricsCollector, Window window) {
        sentryFrameMetricsCollector.getClass();
        try {
            if (sentryFrameMetricsCollector.trackedWindows.remove(window)) {
                sentryFrameMetricsCollector.windowFrameMetricsManager.removeOnFrameMetricsAvailableListener(window, sentryFrameMetricsCollector.frameMetricsAvailableListener);
            }
        } catch (Throwable th) {
            sentryFrameMetricsCollector.logger.log(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", th);
        }
    }

    public static /* synthetic */ void e(SentryFrameMetricsCollector sentryFrameMetricsCollector, BuildInfoProvider buildInfoProvider, Window window, FrameMetrics frameMetrics, int i10) {
        sentryFrameMetricsCollector.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = buildInfoProvider.getSdkInfoVersion() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f10 = oneSecondInNanos;
        long frameCpuDuration = sentryFrameMetricsCollector.getFrameCpuDuration(frameMetrics);
        long jMax = Math.max(0L, frameCpuDuration - ((long) (f10 / refreshRate)));
        long frameStartTimestamp = sentryFrameMetricsCollector.getFrameStartTimestamp(frameMetrics);
        if (frameStartTimestamp < 0) {
            frameStartTimestamp = jNanoTime - frameCpuDuration;
        }
        long jMax2 = Math.max(frameStartTimestamp, sentryFrameMetricsCollector.lastFrameEndNanos);
        if (jMax2 == sentryFrameMetricsCollector.lastFrameStartNanos) {
            return;
        }
        sentryFrameMetricsCollector.lastFrameStartNanos = jMax2;
        sentryFrameMetricsCollector.lastFrameEndNanos = jMax2 + frameCpuDuration;
        boolean zIsSlow = isSlow(frameCpuDuration, (long) (f10 / (refreshRate - 1.0f)));
        boolean z10 = zIsSlow && isFrozen(frameCpuDuration);
        Iterator<FrameMetricsCollectorListener> it = sentryFrameMetricsCollector.listenerMap.values().iterator();
        while (it.hasNext()) {
            it.next().onFrameMetricCollected(jMax2, sentryFrameMetricsCollector.lastFrameEndNanos, frameCpuDuration, jMax, zIsSlow, z10, refreshRate);
        }
    }

    private long getFrameCpuDuration(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @SuppressLint({"NewApi"})
    private long getFrameStartTimestamp(FrameMetrics frameMetrics) {
        return this.buildInfoProvider.getSdkInfoVersion() >= 26 ? frameMetrics.getMetric(10) : getLastKnownFrameStartTimeNanos();
    }

    public static boolean isFrozen(long j10) {
        return j10 > frozenFrameThresholdNanos;
    }

    public static boolean isSlow(long j10, long j11) {
        return j10 > j11;
    }

    private void setCurrentWindow(Window window) {
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != window) {
            this.currentWindow = new WeakReference<>(window);
            trackCurrentWindow();
        }
    }

    @SuppressLint({"NewApi"})
    private void stopTrackingWindow(final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.l
            @Override // java.lang.Runnable
            public final void run() {
                SentryFrameMetricsCollector.c(this.f38571a, window);
            }
        });
    }

    @SuppressLint({"NewApi"})
    private void trackCurrentWindow() {
        WeakReference<Window> weakReference = this.currentWindow;
        final Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.isAvailable || this.listenerMap.isEmpty() || this.handler == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.k
            @Override // java.lang.Runnable
            public final void run() {
                SentryFrameMetricsCollector.b(this.f38569a, window);
            }
        });
    }

    public long getLastKnownFrameStartTimeNanos() {
        Field field;
        Choreographer choreographer = this.choreographer;
        if (choreographer == null || (field = this.choreographerLastFrameTimeField) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        setCurrentWindow(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        stopTrackingWindow(activity.getWindow());
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.currentWindow = null;
    }

    public String startCollection(FrameMetricsCollectorListener frameMetricsCollectorListener) {
        if (!this.isAvailable) {
            return null;
        }
        String strGenerateSentryId = SentryUUID.generateSentryId();
        this.listenerMap.put(strGenerateSentryId, frameMetricsCollectorListener);
        trackCurrentWindow();
        return strGenerateSentryId;
    }

    public void stopCollection(String str) {
        if (this.isAvailable) {
            if (str != null) {
                this.listenerMap.remove(str);
            }
            WeakReference<Window> weakReference = this.currentWindow;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.listenerMap.isEmpty()) {
                return;
            }
            stopTrackingWindow(window);
        }
    }

    @SuppressLint({"NewApi"})
    public SentryFrameMetricsCollector(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this(context, iLogger, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.2
        });
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public SentryFrameMetricsCollector(Context context, SentryOptions sentryOptions, BuildInfoProvider buildInfoProvider, WindowFrameMetricsManager windowFrameMetricsManager) {
        this(context, sentryOptions.getLogger(), buildInfoProvider, windowFrameMetricsManager);
    }

    @SuppressLint({"NewApi", "PrivateApi"})
    public SentryFrameMetricsCollector(Context context, final ILogger iLogger, final BuildInfoProvider buildInfoProvider, WindowFrameMetricsManager windowFrameMetricsManager) {
        this.trackedWindows = new CopyOnWriteArraySet();
        this.listenerMap = new ConcurrentHashMap();
        this.isAvailable = false;
        this.lastFrameStartNanos = 0L;
        this.lastFrameEndNanos = 0L;
        Context context2 = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.windowFrameMetricsManager = (WindowFrameMetricsManager) Objects.requireNonNull(windowFrameMetricsManager, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && buildInfoProvider.getSdkInfoVersion() >= 24) {
            this.isAvailable = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.m
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    iLogger.log(SentryLevel.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.n
                @Override // java.lang.Runnable
                public final void run() {
                    SentryFrameMetricsCollector.a(this.f38574a, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.choreographerLastFrameTimeField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.log(SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.frameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.o
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    SentryFrameMetricsCollector.e(this.f38576a, buildInfoProvider, window, frameMetrics, i10);
                }
            };
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
