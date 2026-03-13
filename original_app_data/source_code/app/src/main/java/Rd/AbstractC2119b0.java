package Rd;

import Wd.AbstractC2330j;
import Wd.C2329i;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2119b0 {
    public static final void a(AbstractC2117a0 abstractC2117a0, int i10) {
        InterfaceC4988e interfaceC4988eD = abstractC2117a0.d();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC4988eD instanceof C2329i) || b(i10) != b(abstractC2117a0.f15160c)) {
            d(abstractC2117a0, interfaceC4988eD, z10);
            return;
        }
        C2329i c2329i = (C2329i) interfaceC4988eD;
        I i11 = c2329i.f17925d;
        InterfaceC4992i context = c2329i.getContext();
        if (AbstractC2330j.d(i11, context)) {
            AbstractC2330j.c(i11, context, abstractC2117a0);
        } else {
            e(abstractC2117a0);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(AbstractC2117a0 abstractC2117a0, InterfaceC4988e interfaceC4988e, boolean z10) {
        Object objG;
        Object objI = abstractC2117a0.i();
        Throwable thF = abstractC2117a0.f(objI);
        if (thF != null) {
            C4035r.a aVar = C4035r.f34274b;
            objG = AbstractC4036s.a(thF);
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            objG = abstractC2117a0.g(objI);
        }
        Object objB = C4035r.b(objG);
        if (!z10) {
            interfaceC4988e.resumeWith(objB);
            return;
        }
        AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2329i c2329i = (C2329i) interfaceC4988e;
        InterfaceC4988e interfaceC4988e2 = c2329i.f17926e;
        Object obj = c2329i.f17928g;
        InterfaceC4992i context = interfaceC4988e2.getContext();
        Object objI2 = Wd.L.i(context, obj);
        c1 c1VarM = objI2 != Wd.L.f17903a ? G.m(interfaceC4988e2, context, objI2) : null;
        try {
            c2329i.f17926e.resumeWith(objB);
            C4015H c4015h = C4015H.f34254a;
            if (c1VarM == null || c1VarM.U0()) {
                Wd.L.f(context, objI2);
            }
        } catch (Throwable th) {
            if (c1VarM == null || c1VarM.U0()) {
                Wd.L.f(context, objI2);
            }
            throw th;
        }
    }

    public static final void e(AbstractC2117a0 abstractC2117a0) {
        AbstractC2135j0 abstractC2135j0B = X0.f15153a.b();
        if (abstractC2135j0B.f1()) {
            abstractC2135j0B.W0(abstractC2117a0);
            return;
        }
        abstractC2135j0B.d1(true);
        try {
            d(abstractC2117a0, abstractC2117a0.d(), true);
            do {
            } while (abstractC2135j0B.i1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
