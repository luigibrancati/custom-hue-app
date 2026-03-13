package io.sentry.logger;

import io.sentry.DataCategory;
import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEvents;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.transport.ReusableCountLatch;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.JsonSerializationUtils;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LoggerBatchProcessor implements ILoggerBatchProcessor {
    public static final int FLUSH_AFTER_MS = 5000;
    public static final int MAX_BATCH_SIZE = 100;
    public static final int MAX_QUEUE_SIZE = 1000;
    private final ISentryClient client;
    private final ISentryExecutorService executorService;
    protected final SentryOptions options;
    private volatile Future<?> scheduledFlush;
    private final AutoClosableReentrantLock scheduleLock = new AutoClosableReentrantLock();
    private volatile boolean hasScheduled = false;
    private volatile boolean isShuttingDown = false;
    private final ReusableCountLatch pendingCount = new ReusableCountLatch();
    private final Queue<SentryLogEvent> queue = new ConcurrentLinkedQueue();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class BatchRunnable implements Runnable {
        private BatchRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoggerBatchProcessor.this.flush();
        }
    }

    public LoggerBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        this.options = sentryOptions;
        this.client = iSentryClient;
        this.executorService = new SentryExecutorService(sentryOptions);
    }

    private void flushBatch() {
        ArrayList arrayList = new ArrayList(100);
        do {
            SentryLogEvent sentryLogEventPoll = this.queue.poll();
            if (sentryLogEventPoll != null) {
                arrayList.add(sentryLogEventPoll);
            }
            if (this.queue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.client.captureBatchedLogEvents(new SentryLogEvents(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.pendingCount.decrement();
        }
    }

    private void flushInternal() {
        do {
            flushBatch();
        } while (this.queue.size() >= 100);
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
                        this.options.getLogger().log(SentryLevel.WARNING, "Logs batch processor flush task rejected", e10);
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

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void add(SentryLogEvent sentryLogEvent) {
        if (this.isShuttingDown) {
            return;
        }
        if (this.pendingCount.getCount() < 1000) {
            this.pendingCount.increment();
            this.queue.offer(sentryLogEvent);
            maybeSchedule(false, false);
        } else {
            IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.QUEUE_OVERFLOW;
            clientReportRecorder.recordLostEvent(discardReason, DataCategory.LogItem);
            this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.LogByte, JsonSerializationUtils.byteSizeOf(this.options.getSerializer(), this.options.getLogger(), sentryLogEvent));
        }
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void close(boolean z10) {
        this.isShuttingDown = true;
        if (z10) {
            maybeSchedule(true, true);
            this.executorService.submit(new Runnable() { // from class: io.sentry.logger.a
                @Override // java.lang.Runnable
                public final void run() {
                    LoggerBatchProcessor loggerBatchProcessor = this.f38774a;
                    loggerBatchProcessor.executorService.close(loggerBatchProcessor.options.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.executorService.close(this.options.getShutdownTimeoutMillis());
            while (!this.queue.isEmpty()) {
                flushBatch();
            }
        }
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void flush(long j10) {
        maybeSchedule(true, true);
        try {
            this.pendingCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to flush log events", e10);
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
