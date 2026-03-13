package Xd;

import Rd.G0;
import Rd.Y;
import Rd.Y0;
import Wd.A;
import Wd.L;
import fc.AbstractC4036s;
import fc.C4025h;
import fc.C4035r;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import nc.AbstractC5157a;
import nc.h;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final Void a(A a10, Y y10) throws Throwable {
        a10.s0(new Rd.A(y10.getCause(), false, 2, null));
        throw y10.getCause();
    }

    public static final boolean b(A a10, Throwable th) {
        return ((th instanceof Y0) && ((Y0) th).f15156a == a10) ? false : true;
    }

    public static final void c(p pVar, Object obj, InterfaceC4988e interfaceC4988e) {
        InterfaceC4988e interfaceC4988eA = h.a(interfaceC4988e);
        try {
            InterfaceC4992i context = interfaceC4988eA.getContext();
            Object objI = L.i(context, null);
            try {
                h.b(interfaceC4988eA);
                Object objD = !(pVar instanceof AbstractC5157a) ? C5045b.d(pVar, obj, interfaceC4988eA) : ((p) T.f(pVar, 2)).invoke(obj, interfaceC4988eA);
                L.f(context, objI);
                if (objD != C5046c.f()) {
                    interfaceC4988eA.resumeWith(C4035r.b(objD));
                }
            } catch (Throwable th) {
                L.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof Y) {
                th = ((Y) th).getCause();
            }
            C4035r.a aVar = C4035r.f34274b;
            interfaceC4988eA.resumeWith(C4035r.b(AbstractC4036s.a(th)));
        }
    }

    public static final Object d(A a10, Object obj, p pVar) {
        return f(a10, true, obj, pVar);
    }

    public static final Object e(A a10, Object obj, p pVar) {
        return f(a10, false, obj, pVar);
    }

    public static final Object f(A a10, boolean z10, Object obj, p pVar) throws Throwable {
        Object a11;
        try {
            a11 = !(pVar instanceof AbstractC5157a) ? C5045b.d(pVar, obj, a10) : ((p) T.f(pVar, 2)).invoke(obj, a10);
        } catch (Y e10) {
            a(a10, e10);
            throw new C4025h();
        } catch (Throwable th) {
            a11 = new Rd.A(th, false, 2, null);
        }
        if (a11 == C5046c.f()) {
            return C5046c.f();
        }
        Object objT0 = a10.t0(a11);
        if (objT0 == G0.f15129b) {
            return C5046c.f();
        }
        a10.T0();
        if (!(objT0 instanceof Rd.A)) {
            return G0.h(objT0);
        }
        if (z10 || b(a10, ((Rd.A) objT0).f15106a)) {
            throw ((Rd.A) objT0).f15106a;
        }
        if (a11 instanceof Rd.A) {
            throw ((Rd.A) a11).f15106a;
        }
        return a11;
    }
}
