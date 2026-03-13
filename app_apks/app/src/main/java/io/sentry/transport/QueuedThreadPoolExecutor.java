package io.sentry.transport;

import d.AbstractC3783B;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.SentryDate;
import io.sentry.SentryDateProvider;
import io.sentry.SentryLevel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class QueuedThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private static final long RECENT_THRESHOLD = DateUtils.millisToNanos(2000);
    private final SentryDateProvider dateProvider;
    private SentryDate lastRejectTimestamp;
    private final ILogger logger;
    private final int maxQueueSize;
    private final ReusableCountLatch unfinishedTasksCount;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CancelledFuture<T> implements Future<T> {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public QueuedThreadPoolExecutor(int i10, int i11, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, SentryDateProvider sentryDateProvider) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.lastRejectTimestamp = null;
        this.unfinishedTasksCount = new ReusableCountLatch();
        this.maxQueueSize = i11;
        this.logger = iLogger;
        this.dateProvider = sentryDateProvider;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.unfinishedTasksCount.decrement();
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3783B.a(this);
    }

    public boolean didRejectRecently() {
        SentryDate sentryDate = this.lastRejectTimestamp;
        return sentryDate != null && this.dateProvider.now().diff(sentryDate) < RECENT_THRESHOLD;
    }

    public boolean isSchedulingAllowed() {
        return this.unfinishedTasksCount.getCount() < this.maxQueueSize;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (!isSchedulingAllowed()) {
            this.lastRejectTimestamp = this.dateProvider.now();
            this.logger.log(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
            return new CancelledFuture();
        }
        this.unfinishedTasksCount.increment();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            this.unfinishedTasksCount.decrement();
            this.lastRejectTimestamp = this.dateProvider.now();
            this.logger.log(SentryLevel.WARNING, "Submit rejected by thread pool executor", e10);
            return new CancelledFuture();
        }
    }

    public void waitTillIdle(long j10) {
        try {
            this.unfinishedTasksCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.logger.log(SentryLevel.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }
}
