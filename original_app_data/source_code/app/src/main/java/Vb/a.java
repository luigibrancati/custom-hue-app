package Vb;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AtomicReference implements Hb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask f17368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask f17369d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f17370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f17371b;

    static {
        Runnable runnable = Lb.a.f8701b;
        f17368c = new FutureTask(runnable, null);
        f17369d = new FutureTask(runnable, null);
    }

    public a(Runnable runnable) {
        this.f17370a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f17368c) {
                return;
            }
            if (future2 == f17369d) {
                future.cancel(this.f17371b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // Hb.c
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f17368c || future == (futureTask = f17369d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f17371b != Thread.currentThread());
    }

    @Override // Hb.c
    public final boolean j() {
        Future future = (Future) get();
        return future == f17368c || future == f17369d;
    }
}
