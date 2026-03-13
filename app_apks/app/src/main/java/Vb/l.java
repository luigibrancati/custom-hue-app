package Vb;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends AtomicReferenceArray implements Runnable, Callable, Hb.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f17439b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17440c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f17441d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f17442e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f17443a;

    public l(Runnable runnable, Kb.b bVar) {
        super(3);
        this.f17443a = runnable;
        lazySet(0, bVar);
    }

    public void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f17442e) {
                return;
            }
            if (obj == f17440c) {
                future.cancel(false);
                return;
            } else if (obj == f17441d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // Hb.c
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f17442e || obj5 == (obj3 = f17440c) || obj5 == (obj4 = f17441d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f17442e || obj == (obj2 = f17439b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((Kb.b) obj).c(this);
    }

    @Override // Hb.c
    public boolean j() {
        Object obj = get(0);
        return obj == f17439b || obj == f17442e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        lazySet(2, Thread.currentThread());
        try {
            this.f17443a.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj5 = get(0);
        if (obj5 != f17439b && compareAndSet(0, obj5, f17442e) && obj5 != null) {
            ((Kb.b) obj5).c(this);
        }
        do {
            obj4 = get(1);
            if (obj4 == f17440c || obj4 == f17441d) {
                return;
            }
        } while (!compareAndSet(1, obj4, f17442e));
    }
}
