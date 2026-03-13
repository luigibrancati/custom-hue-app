package io.sentry.backpressure;

import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class BackpressureMonitor implements IBackpressureMonitor, Runnable {
    private static final int CHECK_INTERVAL_IN_MS = 10000;
    private static final int INITIAL_CHECK_DELAY_IN_MS = 500;
    static final int MAX_DOWNSAMPLE_FACTOR = 10;
    private int downsampleFactor = 0;
    private volatile Future<?> latestScheduledRun = null;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final IScopes scopes;
    private final SentryOptions sentryOptions;

    public BackpressureMonitor(SentryOptions sentryOptions, IScopes iScopes) {
        this.sentryOptions = sentryOptions;
        this.scopes = iScopes;
    }

    private boolean isHealthy() {
        return this.scopes.isHealthy();
    }

    private void reschedule(int i10) {
        ISentryExecutorService executorService = this.sentryOptions.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            try {
                this.latestScheduledRun = executorService.schedule(this, i10);
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
        } catch (RejectedExecutionException e10) {
            this.sentryOptions.getLogger().log(SentryLevel.WARNING, "Backpressure monitor reschedule task rejected", e10);
        }
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
    }

    public void checkHealth() {
        if (isHealthy()) {
            if (this.downsampleFactor > 0) {
                this.sentryOptions.getLogger().log(SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.downsampleFactor = 0;
        } else {
            int i10 = this.downsampleFactor;
            if (i10 < 10) {
                this.downsampleFactor = i10 + 1;
                this.sentryOptions.getLogger().log(SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.downsampleFactor));
            }
        }
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void close() {
        Future<?> future = this.latestScheduledRun;
        if (future != null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                future.cancel(true);
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

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public int getDownsampleFactor() {
        return this.downsampleFactor;
    }

    @Override // java.lang.Runnable
    public void run() {
        checkHealth();
        reschedule(10000);
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void start() {
        reschedule(500);
    }
}
