package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryExecutorService implements ISentryExecutorService {
    private static final int INITIAL_QUEUE_SIZE = 40;
    private static final int MAX_QUEUE_SIZE = 271;
    private final Runnable dummyRunnable;
    private final ScheduledThreadPoolExecutor executorService;
    private final AutoClosableReentrantLock lock;
    private final SentryOptions options;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CancelledFuture<T> implements Future<T> {
        private CancelledFuture() {
        }

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

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class SentryExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        private SentryExecutorServiceThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.cnt;
            this.cnt = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public SentryExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, SentryOptions sentryOptions) {
        this.lock = new AutoClosableReentrantLock();
        this.dummyRunnable = new Runnable() { // from class: io.sentry.v0
            @Override // java.lang.Runnable
            public final void run() {
                SentryExecutorService.b();
            }
        };
        this.executorService = scheduledThreadPoolExecutor;
        this.options = sentryOptions;
    }

    public static /* synthetic */ void a(SentryExecutorService sentryExecutorService) {
        sentryExecutorService.getClass();
        for (int i10 = 0; i10 < 40; i10++) {
            try {
                sentryExecutorService.executorService.schedule(sentryExecutorService.dummyRunnable, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        sentryExecutorService.executorService.purge();
    }

    private boolean isQueueAvailable() {
        if (this.executorService.getQueue().size() >= MAX_QUEUE_SIZE) {
            this.executorService.purge();
        }
        return this.executorService.getQueue().size() < MAX_QUEUE_SIZE;
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j10) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.executorService.isShutdown()) {
                this.executorService.shutdown();
                try {
                    if (!this.executorService.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.executorService.shutdownNow();
                    Thread.currentThread().interrupt();
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

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            boolean zIsShutdown = this.executorService.isShutdown();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return zIsShutdown;
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

    @Override // io.sentry.ISentryExecutorService
    public void prewarm() {
        try {
            this.executorService.submit(new Runnable() { // from class: io.sentry.w0
                @Override // java.lang.Runnable
                public final void run() {
                    SentryExecutorService.a(this.f38852a);
                }
            });
        } catch (RejectedExecutionException e10) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions != null) {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "Prewarm task rejected from " + this.executorService, e10);
            }
        }
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> schedule(Runnable runnable, long j10) {
        return this.executorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> submit(Runnable runnable) {
        if (isQueueAvailable()) {
            return this.executorService.submit(runnable);
        }
        SentryOptions sentryOptions = this.options;
        if (sentryOptions != null) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Task " + runnable + " rejected from " + this.executorService, new Object[0]);
        }
        return new CancelledFuture();
    }

    public SentryExecutorService(SentryOptions sentryOptions) {
        this(new ScheduledThreadPoolExecutor(1, new SentryExecutorServiceThreadFactory()), sentryOptions);
    }

    public SentryExecutorService() {
        this(new ScheduledThreadPoolExecutor(1, new SentryExecutorServiceThreadFactory()), null);
    }

    @Override // io.sentry.ISentryExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        if (isQueueAvailable()) {
            return this.executorService.submit(callable);
        }
        SentryOptions sentryOptions = this.options;
        if (sentryOptions != null) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Task " + callable + " rejected from " + this.executorService, new Object[0]);
        }
        return new CancelledFuture();
    }

    public static /* synthetic */ void b() {
    }
}
