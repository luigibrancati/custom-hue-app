package Yb;

import Eb.p;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static void a(p pVar, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = bVar.b();
            if (thB != null) {
                pVar.onError(thB);
            } else {
                pVar.a();
            }
        }
    }

    public static void b(Ze.b bVar, AtomicInteger atomicInteger, b bVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = bVar2.b();
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.a();
            }
        }
    }

    public static void c(p pVar, Throwable th, AtomicInteger atomicInteger, b bVar) {
        if (!bVar.a(th)) {
            AbstractC2904a.q(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            pVar.onError(bVar.b());
        }
    }

    public static void d(Ze.b bVar, Throwable th, AtomicInteger atomicInteger, b bVar2) {
        if (!bVar2.a(th)) {
            AbstractC2904a.q(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(bVar2.b());
        }
    }

    public static void e(p pVar, Object obj, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            pVar.c(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = bVar.b();
                if (thB != null) {
                    pVar.onError(thB);
                } else {
                    pVar.a();
                }
            }
        }
    }

    public static void f(Ze.b bVar, Object obj, AtomicInteger atomicInteger, b bVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.c(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = bVar2.b();
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.a();
                }
            }
        }
    }
}
