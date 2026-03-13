package Yb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class cls) {
        AbstractC2904a.q(new Ib.e(a(cls.getName())));
    }

    public static boolean c(AtomicReference atomicReference, Hb.c cVar, Class cls) {
        Lb.b.e(cVar, "next is null");
        if (T1.e.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() == Kb.c.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
