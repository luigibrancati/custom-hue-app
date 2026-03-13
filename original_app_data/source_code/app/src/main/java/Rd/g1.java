package Rd;

import Wd.AbstractC2330j;
import Wd.C2329i;
import fc.C4015H;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g1 {
    public static final Object a(InterfaceC4988e interfaceC4988e) {
        Object objF;
        InterfaceC4992i context = interfaceC4988e.getContext();
        C0.k(context);
        InterfaceC4988e interfaceC4988eC = C5045b.c(interfaceC4988e);
        C2329i c2329i = interfaceC4988eC instanceof C2329i ? (C2329i) interfaceC4988eC : null;
        if (c2329i == null) {
            objF = C4015H.f34254a;
        } else {
            if (AbstractC2330j.d(c2329i.f17925d, context)) {
                c2329i.m(context, C4015H.f34254a);
            } else {
                f1 f1Var = new f1();
                InterfaceC4992i interfaceC4992iPlus = context.plus(f1Var);
                C4015H c4015h = C4015H.f34254a;
                c2329i.m(interfaceC4992iPlus, c4015h);
                objF = (!f1Var.f15175a || AbstractC2330j.e(c2329i)) ? C5046c.f() : c4015h;
            }
            objF = C5046c.f();
        }
        if (objF == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objF == C5046c.f() ? objF : C4015H.f34254a;
    }
}
