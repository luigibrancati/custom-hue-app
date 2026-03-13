package Cd;

import Cd.d0;
import gc.C4179C;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0720c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0720c f1313a = new C0720c();

    public final boolean a(d0 d0Var, Gd.k type, d0.c supertypesPolicy) {
        AbstractC4862t.e(d0Var, "<this>");
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(supertypesPolicy, "supertypesPolicy");
        Gd.p pVarJ = d0Var.j();
        if ((pVarJ.D(type) && !pVarJ.y0(type)) || pVarJ.T(type)) {
            return true;
        }
        d0Var.k();
        ArrayDeque arrayDequeH = d0Var.h();
        AbstractC4862t.b(arrayDequeH);
        Set setI = d0Var.i();
        AbstractC4862t.b(setI);
        arrayDequeH.push(type);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + C4179C.q0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Gd.k current = (Gd.k) arrayDequeH.pop();
            AbstractC4862t.d(current, "current");
            if (setI.add(current)) {
                d0.c cVar = pVarJ.y0(current) ? d0.c.C0031c.f1327a : supertypesPolicy;
                if (AbstractC4862t.a(cVar, d0.c.C0031c.f1327a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Gd.p pVarJ2 = d0Var.j();
                    Iterator it = pVarJ2.n(pVarJ2.f(current)).iterator();
                    while (it.hasNext()) {
                        Gd.k kVarA = cVar.a(d0Var, (Gd.i) it.next());
                        if ((pVarJ.D(kVarA) && !pVarJ.y0(kVarA)) || pVarJ.T(kVarA)) {
                            d0Var.e();
                            return true;
                        }
                        arrayDequeH.add(kVarA);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    public final boolean b(d0 state, Gd.k start, Gd.n end) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(start, "start");
        AbstractC4862t.e(end, "end");
        Gd.p pVarJ = state.j();
        if (f1313a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC4862t.b(arrayDequeH);
        Set setI = state.i();
        AbstractC4862t.b(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + C4179C.q0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Gd.k current = (Gd.k) arrayDequeH.pop();
            AbstractC4862t.d(current, "current");
            if (setI.add(current)) {
                d0.c cVar = pVarJ.y0(current) ? d0.c.C0031c.f1327a : d0.c.b.f1326a;
                if (AbstractC4862t.a(cVar, d0.c.C0031c.f1327a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Gd.p pVarJ2 = state.j();
                    Iterator it = pVarJ2.n(pVarJ2.f(current)).iterator();
                    while (it.hasNext()) {
                        Gd.k kVarA = cVar.a(state, (Gd.i) it.next());
                        if (f1313a.c(state, kVarA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(kVarA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean c(d0 d0Var, Gd.k kVar, Gd.n nVar) {
        Gd.p pVarJ = d0Var.j();
        if (pVarJ.r(kVar)) {
            return true;
        }
        if (pVarJ.y0(kVar)) {
            return false;
        }
        if (d0Var.n() && pVarJ.k(kVar)) {
            return true;
        }
        return pVarJ.H(pVarJ.f(kVar), nVar);
    }

    public final boolean d(d0 state, Gd.k subType, Gd.k superType) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        return e(state, subType, superType);
    }

    public final boolean e(d0 d0Var, Gd.k kVar, Gd.k kVar2) {
        Gd.p pVarJ = d0Var.j();
        if (C0722e.f1330b) {
            if (!pVarJ.g(kVar) && !pVarJ.W(pVarJ.f(kVar))) {
                d0Var.l(kVar);
            }
            if (!pVarJ.g(kVar2)) {
                d0Var.l(kVar2);
            }
        }
        if (pVarJ.y0(kVar2) || pVarJ.T(kVar) || pVarJ.A0(kVar)) {
            return true;
        }
        if ((kVar instanceof Gd.d) && pVarJ.O((Gd.d) kVar)) {
            return true;
        }
        C0720c c0720c = f1313a;
        if (c0720c.a(d0Var, kVar, d0.c.b.f1326a)) {
            return true;
        }
        if (pVarJ.T(kVar2) || c0720c.a(d0Var, kVar2, d0.c.d.f1328a) || pVarJ.D(kVar)) {
            return false;
        }
        return c0720c.b(d0Var, kVar, pVarJ.f(kVar2));
    }
}
