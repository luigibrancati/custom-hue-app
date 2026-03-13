package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ISentryLifecycleToken;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityFramesTracker {
    private final Map<SentryId, Map<String, MeasurementValue>> activityMeasurements;
    private final LazyEvaluator<Boolean> androidXAvailable;
    private final Map<Activity, FrameCounts> frameCountAtStartSnapshots;
    private LazyEvaluator<FrameMetricsAggregator> frameMetricsAggregator;
    private final MainLooperHandler handler;
    protected AutoClosableReentrantLock lock;
    private final SentryAndroidOptions options;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class FrameCounts {
        private final int frozenFrames;
        private final int slowFrames;
        private final int totalFrames;

        private FrameCounts(int i10, int i11, int i12) {
            this.totalFrames = i10;
            this.slowFrames = i11;
            this.frozenFrames = i12;
        }
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler) {
        this.activityMeasurements = new ConcurrentHashMap();
        this.frameCountAtStartSnapshots = new WeakHashMap();
        this.lock = new AutoClosableReentrantLock();
        this.androidXAvailable = loadClass.isClassAvailableLazy("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.frameMetricsAggregator = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.h
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return ActivityFramesTracker.f();
            }
        });
        this.options = sentryAndroidOptions;
        this.handler = mainLooperHandler;
    }

    public static /* synthetic */ void c(ActivityFramesTracker activityFramesTracker, Runnable runnable, String str) {
        activityFramesTracker.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                activityFramesTracker.options.getLogger().log(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private FrameCounts calculateCurrentFrameCounts() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable() || !this.androidXAvailable.getValue().booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = this.frameMetricsAggregator.getValue().b();
        int i12 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new FrameCounts(i12, i10, i11);
    }

    private FrameCounts diffFrameCountsAtEnd(Activity activity) {
        FrameCounts frameCountsCalculateCurrentFrameCounts;
        FrameCounts frameCountsRemove = this.frameCountAtStartSnapshots.remove(activity);
        if (frameCountsRemove == null || (frameCountsCalculateCurrentFrameCounts = calculateCurrentFrameCounts()) == null) {
            return null;
        }
        return new FrameCounts(frameCountsCalculateCurrentFrameCounts.totalFrames - frameCountsRemove.totalFrames, frameCountsCalculateCurrentFrameCounts.slowFrames - frameCountsRemove.slowFrames, frameCountsCalculateCurrentFrameCounts.frozenFrames - frameCountsRemove.frozenFrames);
    }

    public static /* synthetic */ FrameMetricsAggregator f() {
        return new FrameMetricsAggregator();
    }

    private void runSafelyOnUiThread(final Runnable runnable, final String str) {
        try {
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                runnable.run();
            } else {
                this.handler.post(new Runnable() { // from class: io.sentry.android.core.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityFramesTracker.c(this.f38520a, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void snapshotFrameCountsAtStart(Activity activity) {
        FrameCounts frameCountsCalculateCurrentFrameCounts = calculateCurrentFrameCounts();
        if (frameCountsCalculateCurrentFrameCounts != null) {
            this.frameCountAtStartSnapshots.put(activity, frameCountsCalculateCurrentFrameCounts);
        }
    }

    public void addActivity(final Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } else {
                runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38510a.frameMetricsAggregator.getValue().a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                snapshotFrameCountsAtStart(activity);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable.getValue().booleanValue() && this.options.isEnableFramesTracking() && !this.options.isEnablePerformanceV2();
    }

    public void setMetrics(final Activity activity, SentryId sentryId) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38528a.frameMetricsAggregator.getValue().c(activity);
                }
            }, null);
            FrameCounts frameCountsDiffFrameCountsAtEnd = diffFrameCountsAtEnd(activity);
            if (frameCountsDiffFrameCountsAtEnd != null && (frameCountsDiffFrameCountsAtEnd.totalFrames != 0 || frameCountsDiffFrameCountsAtEnd.slowFrames != 0 || frameCountsDiffFrameCountsAtEnd.frozenFrames != 0)) {
                MeasurementValue measurementValue = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.totalFrames), MeasurementUnit.NONE);
                MeasurementValue measurementValue2 = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.slowFrames), MeasurementUnit.NONE);
                MeasurementValue measurementValue3 = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.frozenFrames), MeasurementUnit.NONE);
                HashMap map = new HashMap();
                map.put(MeasurementValue.KEY_FRAMES_TOTAL, measurementValue);
                map.put(MeasurementValue.KEY_FRAMES_SLOW, measurementValue2);
                map.put(MeasurementValue.KEY_FRAMES_FROZEN, measurementValue3);
                this.activityMeasurements.put(sentryId, map);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (isFrameMetricsAggregatorAvailable()) {
                runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38530a.frameMetricsAggregator.getValue().e();
                    }
                }, "FrameMetricsAggregator.stop");
                this.frameMetricsAggregator.getValue().d();
            }
            this.activityMeasurements.clear();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Map<String, MeasurementValue> takeMetrics(SentryId sentryId) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            Map<String, MeasurementValue> map = this.activityMeasurements.get(sentryId);
            this.activityMeasurements.remove(sentryId);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return map;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions) {
        this(loadClass, sentryAndroidOptions, new MainLooperHandler());
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler, final FrameMetricsAggregator frameMetricsAggregator) {
        this(loadClass, sentryAndroidOptions, mainLooperHandler);
        this.frameMetricsAggregator = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.e
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return ActivityFramesTracker.d(frameMetricsAggregator);
            }
        });
    }

    public static /* synthetic */ FrameMetricsAggregator d(FrameMetricsAggregator frameMetricsAggregator) {
        return frameMetricsAggregator;
    }
}
