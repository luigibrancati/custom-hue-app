package Xb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum g implements Ze.c {
    CANCELLED;

    public static boolean a(AtomicReference atomicReference) {
        Ze.c cVar;
        Ze.c cVar2 = (Ze.c) atomicReference.get();
        g gVar = CANCELLED;
        if (cVar2 == gVar || (cVar = (Ze.c) atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar.cancel();
        return true;
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j10) {
        Ze.c cVar = (Ze.c) atomicReference.get();
        if (cVar != null) {
            cVar.p(j10);
            return;
        }
        if (v(j10)) {
            Yb.c.a(atomicLong, j10);
            Ze.c cVar2 = (Ze.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.p(andSet);
                }
            }
        }
    }

    public static boolean j(AtomicReference atomicReference, AtomicLong atomicLong, Ze.c cVar) {
        if (!u(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.p(andSet);
        return true;
    }

    public static void q(long j10) {
        AbstractC2904a.q(new Ib.e("More produced than requested: " + j10));
    }

    public static void s() {
        AbstractC2904a.q(new Ib.e("Subscription already set!"));
    }

    public static boolean u(AtomicReference atomicReference, Ze.c cVar) {
        Lb.b.e(cVar, "s is null");
        if (T1.e.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        s();
        return false;
    }

    public static boolean v(long j10) {
        if (j10 > 0) {
            return true;
        }
        AbstractC2904a.q(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean w(Ze.c cVar, Ze.c cVar2) {
        if (cVar2 == null) {
            AbstractC2904a.q(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        s();
        return false;
    }

    @Override // Ze.c
    public void cancel() {
    }

    @Override // Ze.c
    public void p(long j10) {
    }
}
