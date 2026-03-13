package p8;

import d.AbstractC3783B;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p8.ScheduledFutureC5423p;

/* JADX INFO: renamed from: p8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ScheduledExecutorServiceC5422o implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f42289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f42290b;

    public ScheduledExecutorServiceC5422o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f42289a = executorService;
        this.f42290b = scheduledExecutorService;
    }

    public static /* synthetic */ void f(Callable callable, ScheduledFutureC5423p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void g(Runnable runnable, ScheduledFutureC5423p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    public static /* synthetic */ void k(Runnable runnable, ScheduledFutureC5423p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void o(Runnable runnable, ScheduledFutureC5423p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f42289a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3783B.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f42289a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f42289a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f42289a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f42289a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f42289a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC5423p(new ScheduledFutureC5423p.c() { // from class: p8.c
            @Override // p8.ScheduledFutureC5423p.c
            public final ScheduledFuture a(ScheduledFutureC5423p.b bVar) {
                ScheduledExecutorServiceC5422o scheduledExecutorServiceC5422o = this.f42251a;
                return scheduledExecutorServiceC5422o.f42290b.schedule(new Runnable() { // from class: p8.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC5422o.f42289a.execute(new Runnable() { // from class: p8.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC5422o.o(runnable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC5423p(new ScheduledFutureC5423p.c() { // from class: p8.f
            @Override // p8.ScheduledFutureC5423p.c
            public final ScheduledFuture a(ScheduledFutureC5423p.b bVar) {
                ScheduledExecutorServiceC5422o scheduledExecutorServiceC5422o = this.f42259a;
                return scheduledExecutorServiceC5422o.f42290b.scheduleAtFixedRate(new Runnable() { // from class: p8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC5422o.f42289a.execute(new Runnable() { // from class: p8.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                ScheduledExecutorServiceC5422o.g(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC5423p(new ScheduledFutureC5423p.c() { // from class: p8.g
            @Override // p8.ScheduledFutureC5423p.c
            public final ScheduledFuture a(ScheduledFutureC5423p.b bVar) {
                ScheduledExecutorServiceC5422o scheduledExecutorServiceC5422o = this.f42264a;
                return scheduledExecutorServiceC5422o.f42290b.scheduleWithFixedDelay(new Runnable() { // from class: p8.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC5422o.f42289a.execute(new Runnable() { // from class: p8.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC5422o.k(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f42289a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f42289a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f42289a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC5423p(new ScheduledFutureC5423p.c() { // from class: p8.h
            @Override // p8.ScheduledFutureC5423p.c
            public final ScheduledFuture a(ScheduledFutureC5423p.b bVar) {
                ScheduledExecutorServiceC5422o scheduledExecutorServiceC5422o = this.f42269a;
                return scheduledExecutorServiceC5422o.f42290b.schedule(new Callable() { // from class: p8.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return scheduledExecutorServiceC5422o.f42289a.submit(new Runnable() { // from class: p8.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC5422o.f(callable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f42289a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f42289a.submit(runnable);
    }
}
