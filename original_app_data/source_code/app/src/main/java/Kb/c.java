package Kb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum c implements Hb.c {
    DISPOSED;

    public static boolean a(AtomicReference atomicReference) {
        Hb.c cVar;
        Hb.c cVar2 = (Hb.c) atomicReference.get();
        c cVar3 = DISPOSED;
        if (cVar2 == cVar3 || (cVar = (Hb.c) atomicReference.getAndSet(cVar3)) == cVar3) {
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar.dispose();
        return true;
    }

    public static boolean b(Hb.c cVar) {
        return cVar == DISPOSED;
    }

    public static boolean p(AtomicReference atomicReference, Hb.c cVar) {
        Hb.c cVar2;
        do {
            cVar2 = (Hb.c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        } while (!T1.e.a(atomicReference, cVar2, cVar));
        return true;
    }

    public static void q() {
        AbstractC2904a.q(new Ib.e("Disposable already set!"));
    }

    public static boolean s(AtomicReference atomicReference, Hb.c cVar) {
        Hb.c cVar2;
        do {
            cVar2 = (Hb.c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        } while (!T1.e.a(atomicReference, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }

    public static boolean u(AtomicReference atomicReference, Hb.c cVar) {
        Lb.b.e(cVar, "d is null");
        if (T1.e.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        q();
        return false;
    }

    public static boolean v(AtomicReference atomicReference, Hb.c cVar) {
        if (T1.e.a(atomicReference, null, cVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        cVar.dispose();
        return false;
    }

    public static boolean w(Hb.c cVar, Hb.c cVar2) {
        if (cVar2 == null) {
            AbstractC2904a.q(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        q();
        return false;
    }

    @Override // Hb.c
    public boolean j() {
        return true;
    }

    @Override // Hb.c
    public void dispose() {
    }
}
