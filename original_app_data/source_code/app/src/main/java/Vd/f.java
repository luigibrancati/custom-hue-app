package Vd;

import Ud.InterfaceC2314f;
import Wd.L;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import nc.AbstractC5157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final Object b(InterfaceC4992i interfaceC4992i, Object obj, Object obj2, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        Object objI = L.i(interfaceC4992i, obj2);
        try {
            A a10 = new A(interfaceC4988e, interfaceC4992i);
            Object objD = !(pVar instanceof AbstractC5157a) ? C5045b.d(pVar, obj, a10) : ((vc.p) T.f(pVar, 2)).invoke(obj, a10);
            L.f(interfaceC4992i, objI);
            if (objD == C5046c.f()) {
                nc.h.c(interfaceC4988e);
            }
            return objD;
        } catch (Throwable th) {
            L.f(interfaceC4992i, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(InterfaceC4992i interfaceC4992i, Object obj, Object obj2, vc.p pVar, InterfaceC4988e interfaceC4988e, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = L.g(interfaceC4992i);
        }
        return b(interfaceC4992i, obj, obj2, pVar, interfaceC4988e);
    }

    public static final InterfaceC2314f d(InterfaceC2314f interfaceC2314f, InterfaceC4992i interfaceC4992i) {
        return ((interfaceC2314f instanceof z) || (interfaceC2314f instanceof s)) ? interfaceC2314f : new B(interfaceC2314f, interfaceC4992i);
    }
}
