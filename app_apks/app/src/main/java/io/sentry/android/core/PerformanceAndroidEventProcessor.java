package io.sentry.android.core;

import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.ISentryLifecycleToken;
import io.sentry.MeasurementUnit;
import io.sentry.SentryEvent;
import io.sentry.SpanContext;
import io.sentry.SpanDataConvention;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.App;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class PerformanceAndroidEventProcessor implements EventProcessor {
    private static final String APP_METRICS_ACTIVITIES_OP = "activity.load";
    private static final String APP_METRICS_APPLICATION_OP = "application.load";
    private static final String APP_METRICS_CONTENT_PROVIDER_OP = "contentprovider.load";
    private static final String APP_METRICS_ORIGIN = "auto.ui";
    private static final String APP_METRICS_PROCESS_INIT_OP = "process.load";
    private static final long MAX_PROCESS_INIT_APP_START_DIFF_MS = 10000;
    private final ActivityFramesTracker activityFramesTracker;
    private final SentryAndroidOptions options;
    private boolean sentStartMeasurement = false;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    public PerformanceAndroidEventProcessor(SentryAndroidOptions sentryAndroidOptions, ActivityFramesTracker activityFramesTracker) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
    }

    private void attachAppStartSpans(AppStartMetrics appStartMetrics, SentryTransaction sentryTransaction) {
        SpanContext trace;
        SpanId spanId;
        if (appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD && (trace = sentryTransaction.getContexts().getTrace()) != null) {
            SentryId traceId = trace.getTraceId();
            Iterator<SentrySpan> it = sentryTransaction.getSpans().iterator();
            while (true) {
                if (!it.hasNext()) {
                    spanId = null;
                    break;
                }
                SentrySpan next = it.next();
                if (next.getOp().contentEquals("app.start.cold")) {
                    spanId = next.getSpanId();
                    break;
                }
            }
            TimeSpan timeSpanCreateProcessInitSpan = appStartMetrics.createProcessInitSpan();
            if (timeSpanCreateProcessInitSpan.hasStarted() && Math.abs(timeSpanCreateProcessInitSpan.getDurationMs()) <= MAX_PROCESS_INIT_APP_START_DIFF_MS) {
                sentryTransaction.getSpans().add(timeSpanToSentrySpan(timeSpanCreateProcessInitSpan, spanId, traceId, APP_METRICS_PROCESS_INIT_OP));
            }
            List<TimeSpan> contentProviderOnCreateTimeSpans = appStartMetrics.getContentProviderOnCreateTimeSpans();
            if (!contentProviderOnCreateTimeSpans.isEmpty()) {
                Iterator<TimeSpan> it2 = contentProviderOnCreateTimeSpans.iterator();
                while (it2.hasNext()) {
                    sentryTransaction.getSpans().add(timeSpanToSentrySpan(it2.next(), spanId, traceId, APP_METRICS_CONTENT_PROVIDER_OP));
                }
            }
            TimeSpan applicationOnCreateTimeSpan = appStartMetrics.getApplicationOnCreateTimeSpan();
            if (applicationOnCreateTimeSpan.hasStopped()) {
                sentryTransaction.getSpans().add(timeSpanToSentrySpan(applicationOnCreateTimeSpan, spanId, traceId, APP_METRICS_APPLICATION_OP));
            }
        }
    }

    private boolean hasAppStartSpan(SentryTransaction sentryTransaction) {
        for (SentrySpan sentrySpan : sentryTransaction.getSpans()) {
            if (sentrySpan.getOp().contentEquals("app.start.cold") || sentrySpan.getOp().contentEquals("app.start.warm")) {
                return true;
            }
        }
        SpanContext trace = sentryTransaction.getContexts().getTrace();
        if (trace != null) {
            return trace.getOperation().equals("app.start.cold") || trace.getOperation().equals("app.start.warm");
        }
        return false;
    }

    private static boolean isTimestampWithinSpan(double d10, SentrySpan sentrySpan) {
        if (d10 >= sentrySpan.getStartTimestamp().doubleValue()) {
            return sentrySpan.getTimestamp() == null || d10 <= sentrySpan.getTimestamp().doubleValue();
        }
        return false;
    }

    private void setContributingFlags(SentryTransaction sentryTransaction) {
        Object obj;
        SentrySpan sentrySpan = null;
        SentrySpan sentrySpan2 = null;
        for (SentrySpan sentrySpan3 : sentryTransaction.getSpans()) {
            if ("ui.load.initial_display".equals(sentrySpan3.getOp())) {
                sentrySpan = sentrySpan3;
            } else if ("ui.load.full_display".equals(sentrySpan3.getOp())) {
                sentrySpan2 = sentrySpan3;
            }
            if (sentrySpan != null && sentrySpan2 != null) {
                break;
            }
        }
        if (sentrySpan == null && sentrySpan2 == null) {
            return;
        }
        for (SentrySpan sentrySpan4 : sentryTransaction.getSpans()) {
            if (sentrySpan4 != sentrySpan && sentrySpan4 != sentrySpan2) {
                Map<String, Object> data = sentrySpan4.getData();
                boolean z10 = false;
                boolean z11 = sentrySpan != null && isTimestampWithinSpan(sentrySpan4.getStartTimestamp().doubleValue(), sentrySpan) && (data == null || (obj = data.get(SpanDataConvention.THREAD_NAME)) == null || SentryThread.JsonKeys.MAIN.equals(obj));
                if (sentrySpan2 != null && isTimestampWithinSpan(sentrySpan4.getStartTimestamp().doubleValue(), sentrySpan2)) {
                    z10 = true;
                }
                if (z11 || z10) {
                    Map<String, Object> data2 = sentrySpan4.getData();
                    if (data2 == null) {
                        data2 = new ConcurrentHashMap<>();
                        sentrySpan4.setData(data2);
                    }
                    if (z11) {
                        data2.put(SpanDataConvention.CONTRIBUTES_TTID, Boolean.TRUE);
                    }
                    if (z10) {
                        data2.put(SpanDataConvention.CONTRIBUTES_TTFD, Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static SentrySpan timeSpanToSentrySpan(TimeSpan timeSpan, SpanId spanId, SentryId sentryId, String str) {
        HashMap map = new HashMap(2);
        map.put(SpanDataConvention.THREAD_ID, Long.valueOf(AndroidThreadChecker.mainThreadSystemId));
        map.put(SpanDataConvention.THREAD_NAME, SentryThread.JsonKeys.MAIN);
        Boolean bool = Boolean.TRUE;
        map.put(SpanDataConvention.CONTRIBUTES_TTID, bool);
        map.put(SpanDataConvention.CONTRIBUTES_TTFD, bool);
        return new SentrySpan(Double.valueOf(timeSpan.getStartTimestampSecs()), Double.valueOf(timeSpan.getProjectedStopTimestampSecs()), sentryId, new SpanId(), spanId, str, timeSpan.getDescription(), SpanStatus.OK, APP_METRICS_ORIGIN, new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 9000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        return sentryEvent;
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        Map<String, MeasurementValue> mapTakeMetrics;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.options.isTracingEnabled()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return sentryTransaction;
            }
            AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
            if (hasAppStartSpan(sentryTransaction)) {
                if (appStartMetrics.shouldSendStartMeasurements()) {
                    long durationMs = appStartMetrics.getAppStartTimeSpanWithFallback(this.options).getDurationMs();
                    if (durationMs != 0) {
                        sentryTransaction.getMeasurements().put(appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD ? MeasurementValue.KEY_APP_START_COLD : MeasurementValue.KEY_APP_START_WARM, new MeasurementValue(Float.valueOf(durationMs), MeasurementUnit.Duration.MILLISECOND.apiName()));
                        attachAppStartSpans(appStartMetrics, sentryTransaction);
                        appStartMetrics.onAppStartSpansSent();
                    }
                }
                App app2 = sentryTransaction.getContexts().getApp();
                if (app2 == null) {
                    app2 = new App();
                    sentryTransaction.getContexts().setApp(app2);
                }
                app2.setStartType(appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD ? "cold" : "warm");
            }
            setContributingFlags(sentryTransaction);
            SentryId eventId = sentryTransaction.getEventId();
            SpanContext trace = sentryTransaction.getContexts().getTrace();
            if (eventId != null && trace != null && trace.getOperation().contentEquals("ui.load") && (mapTakeMetrics = this.activityFramesTracker.takeMetrics(eventId)) != null) {
                sentryTransaction.getMeasurements().putAll(mapTakeMetrics);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return sentryTransaction;
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
}
