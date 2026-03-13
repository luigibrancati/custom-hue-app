package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ISentryExecutorService {
    void close(long j10);

    boolean isClosed();

    void prewarm();

    Future<?> schedule(Runnable runnable, long j10);

    Future<?> submit(Runnable runnable);

    <T> Future<T> submit(Callable<T> callable);
}
