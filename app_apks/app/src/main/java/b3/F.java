package b3;

import fc.C4015H;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final Object b(m mVar, String str, InterfaceC4988e interfaceC4988e) {
        Object objA = mVar.a(str, new vc.l() { // from class: b3.E
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(F.c((InterfaceC4794d) obj));
            }
        }, interfaceC4988e);
        return objA == C5046c.f() ? objA : C4015H.f34254a;
    }

    public static final boolean c(InterfaceC4794d it) {
        AbstractC4862t.e(it, "it");
        return it.X0();
    }
}
