package Kc;

import Lc.InterfaceC1177e;
import gc.C4206t;
import gc.T;
import gc.U;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7812a = new d();

    public static /* synthetic */ InterfaceC1177e f(d dVar, kd.c cVar, Ic.g gVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, gVar, num);
    }

    public final InterfaceC1177e a(InterfaceC1177e mutable) {
        AbstractC4862t.e(mutable, "mutable");
        kd.c cVarO = c.f7792a.o(AbstractC5283e.m(mutable));
        if (cVarO != null) {
            InterfaceC1177e interfaceC1177eO = AbstractC5823c.j(mutable).o(cVarO);
            AbstractC4862t.d(interfaceC1177eO, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return interfaceC1177eO;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final InterfaceC1177e b(InterfaceC1177e readOnly) {
        AbstractC4862t.e(readOnly, "readOnly");
        kd.c cVarP = c.f7792a.p(AbstractC5283e.m(readOnly));
        if (cVarP != null) {
            InterfaceC1177e interfaceC1177eO = AbstractC5823c.j(readOnly).o(cVarP);
            AbstractC4862t.d(interfaceC1177eO, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return interfaceC1177eO;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(InterfaceC1177e mutable) {
        AbstractC4862t.e(mutable, "mutable");
        return c.f7792a.k(AbstractC5283e.m(mutable));
    }

    public final boolean d(InterfaceC1177e readOnly) {
        AbstractC4862t.e(readOnly, "readOnly");
        return c.f7792a.l(AbstractC5283e.m(readOnly));
    }

    public final InterfaceC1177e e(kd.c fqName, Ic.g builtIns, Integer num) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(builtIns, "builtIns");
        kd.b bVarM = (num == null || !AbstractC4862t.a(fqName, c.f7792a.h())) ? c.f7792a.m(fqName) : Ic.j.a(num.intValue());
        if (bVarM != null) {
            return builtIns.o(bVarM.b());
        }
        return null;
    }

    public final Collection g(kd.c fqName, Ic.g builtIns) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(builtIns, "builtIns");
        InterfaceC1177e interfaceC1177eF = f(this, fqName, builtIns, null, 4, null);
        if (interfaceC1177eF == null) {
            return U.d();
        }
        kd.c cVarP = c.f7792a.p(AbstractC5823c.m(interfaceC1177eF));
        if (cVarP == null) {
            return T.c(interfaceC1177eF);
        }
        InterfaceC1177e interfaceC1177eO = builtIns.o(cVarP);
        AbstractC4862t.d(interfaceC1177eO, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return C4206t.n(interfaceC1177eF, interfaceC1177eO);
    }
}
