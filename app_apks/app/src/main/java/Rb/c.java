package Rb;

import Eb.p;
import Eb.v;
import Jb.e;
import Tb.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static boolean a(Object obj, e eVar, p pVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            v vVar = objCall != null ? (v) Lb.b.e(eVar.apply(objCall), "The mapper returned a null SingleSource") : null;
            if (vVar == null) {
                Kb.d.a(pVar);
            } else {
                vVar.c(t.O0(pVar));
            }
            return true;
        } catch (Throwable th) {
            Ib.b.b(th);
            Kb.d.p(th, pVar);
            return true;
        }
    }
}
