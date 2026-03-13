package io.sentry.metrics;

import io.sentry.DataCategory;
import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryMetricsEvents;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.transport.ReusableCountLatch;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MetricsBatchProcessor implements IMetricsBatchProcessor {
    public static final int FLUSH_AFTER_MS = 5000;
    public static final int MAX_BATCH_SIZE = 1000;
    public static final int MAX_QUEUE_SIZE = 10000;
    private final ISentryClient client;
    private final ISentryExecutorService executorService;
    protected final SentryOptions options;
    private volatile Future<?> scheduledFlush;
    private final AutoClosableReentrantLock scheduleLock = new AutoClosableReentrantLock();
    private volatile boolean hasScheduled = false;
    private volatile boolean isShuttingDown = false;
    private final ReusableCountLatch pendingCount = new ReusableCountLatch();
    private final Queue<SentryMetricsEvent> queue = new ConcurrentLinkedQueue();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class BatchRunnable implements Runnable {
        private BatchRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsBatchProcessor.this.flush();
        }
    }

    public MetricsBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        this.options = sentryOptions;
        this.client = iSentryClient;
        this.executorService = new SentryExecutorService(sentryOptions);
    }

    private void flushBatch() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            SentryMetricsEvent sentryMetricsEventPoll = this.queue.poll();
            if (sentryMetricsEventPoll != null) {
                arrayList.add(sentryMetricsEventPoll);
            }
            if (this.queue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        this.client.captureBatchedMetricsEvents(new SentryMetricsEvents(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.pendingCount.decrement();
        }
    }

    private void flushInternal() {
        do {
            flushBatch();
        } while (this.queue.size() >= 1000);
    }

    private void maybeSchedule(boolean z10, boolean z11) {
        if (!this.hasScheduled || z10) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.scheduleLock.acquire();
            try {
                Future<?> future = this.scheduledFlush;
                if (z10 || future == null || future.isDone() || future.isCancelled()) {
                    this.hasScheduled = true;
                    try {
                        this.scheduledFlush = this.executorService.schedule(new BatchRunnable(), z11 ? 0 : 5000);
                    } catch (RejectedExecutionException e10) {
                        this.hasScheduled = false;
                        this.options.getLogger().log(SentryLevel.WARNING, "Metrics batch processor flush task rejected", e10);
                    }
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
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void add(SentryMetricsEvent sentryMetricsEvent) {
        if (this.isShuttingDown) {
            return;
        }
        if (this.pendingCount.getCount() >= 10000) {
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.QUEUE_OVERFLOW, DataCategory.TraceMetric);
            return;
        }
        this.pendingCount.increment();
        this.queue.offer(sentryMetricsEvent);
        maybeSchedule(false, false);
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z10) {
        this.isShuttingDown = true;
        if (z10) {
            maybeSchedule(true, true);
            this.executorService.submit(new Runnable() { // from class: io.sentry.metrics.a
                @Override // java.lang.Runnable
                public final void run() {
                    MetricsBatchProcessor metricsBatchProcessor = this.f38776a;
                    metricsBatchProcessor.executorService.close(metricsBatchProcessor.options.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.executorService.close(this.options.getShutdownTimeoutMillis());
            while (!this.queue.isEmpty()) {
                flushBatch();
            }
        }
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void flush(long j10) {
        maybeSchedule(true, true);
        try {
            this.pendingCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to flush metrics events", e10);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        flushInternal();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.scheduleLock.acquire();
        try {
            if (!this.queue.isEmpty()) {
                maybeSchedule(true, false);
            } else {
                this.hasScheduled = false;
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
}
