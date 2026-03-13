package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BlockingFlushHint implements DiskFlushNotification, Flushable {
    private final long flushTimeoutMillis;
    private final CountDownLatch latch = new CountDownLatch(1);
    private final ILogger logger;

    public BlockingFlushHint(long j10, ILogger iLogger) {
        this.flushTimeoutMillis = j10;
        this.logger = iLogger;
    }

    @Override // io.sentry.hints.DiskFlushNotification
    public void markFlushed() {
        this.latch.countDown();
    }

    @Override // io.sentry.hints.Flushable
    public boolean waitFlush() {
        try {
            return this.latch.await(this.flushTimeoutMillis, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.logger.log(SentryLevel.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
