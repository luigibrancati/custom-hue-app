package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpSentryExecutorService implements ISentryExecutorService {
    private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

    private NoOpSentryExecutorService() {
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ Object c() {
        return null;
    }

    public static ISentryExecutorService getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> schedule(Runnable runnable, long j10) {
        return new FutureTask(new Callable() { // from class: io.sentry.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NoOpSentryExecutorService.b();
            }
        });
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NoOpSentryExecutorService.a();
            }
        });
    }

    @Override // io.sentry.ISentryExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return new FutureTask(new Callable() { // from class: io.sentry.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NoOpSentryExecutorService.c();
            }
        });
    }

    @Override // io.sentry.ISentryExecutorService
    public void prewarm() {
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j10) {
    }
}
