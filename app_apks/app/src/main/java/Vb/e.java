package Vb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Callable, Hb.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FutureTask f17407f = new FutureTask(Lb.a.f8701b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f17408a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f17411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f17412e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f17410c = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f17409b = new AtomicReference();

    public e(Runnable runnable, ExecutorService executorService) {
        this.f17408a = runnable;
        this.f17411d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f17412e = Thread.currentThread();
        try {
            this.f17408a.run();
            c(this.f17411d.submit(this));
            this.f17412e = null;
        } catch (Throwable th) {
            this.f17412e = null;
            AbstractC2904a.q(th);
        }
        return null;
    }

    public void b(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f17410c.get();
            if (future2 == f17407f) {
                future.cancel(this.f17412e != Thread.currentThread());
                return;
            }
        } while (!T1.e.a(this.f17410c, future2, future));
    }

    public void c(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f17409b.get();
            if (future2 == f17407f) {
                future.cancel(this.f17412e != Thread.currentThread());
                return;
            }
        } while (!T1.e.a(this.f17409b, future2, future));
    }

    @Override // Hb.c
    public void dispose() {
        AtomicReference atomicReference = this.f17410c;
        FutureTask futureTask = f17407f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f17412e != Thread.currentThread());
        }
        Future future2 = (Future) this.f17409b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f17412e != Thread.currentThread());
    }

    @Override // Hb.c
    public boolean j() {
        return this.f17410c.get() == f17407f;
    }
}
