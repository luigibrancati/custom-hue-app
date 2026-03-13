package td;

import Cd.E;
import Ic.j;
import Lc.AbstractC1191t;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.f0;
import Lc.j0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import od.AbstractC5285g;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: td.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5879b {
    public static final boolean a(InterfaceC1177e interfaceC1177e) {
        return AbstractC4862t.a(AbstractC5823c.l(interfaceC1177e), j.f5735q);
    }

    public static final boolean b(E e10) {
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return interfaceC1180hQ != null && c(interfaceC1180hQ);
    }

    public static final boolean c(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        return AbstractC5285g.b(interfaceC1185m) && !a((InterfaceC1177e) interfaceC1185m);
    }

    public static final boolean d(E e10) {
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        f0 f0Var = interfaceC1180hQ instanceof f0 ? (f0) interfaceC1180hQ : null;
        if (f0Var == null) {
            return false;
        }
        return e(Hd.a.j(f0Var));
    }

    public static final boolean e(E e10) {
        return b(e10) || d(e10);
    }

    public static final boolean f(InterfaceC1174b descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        InterfaceC1176d interfaceC1176d = descriptor instanceof InterfaceC1176d ? (InterfaceC1176d) descriptor : null;
        if (interfaceC1176d == null || AbstractC1191t.g(interfaceC1176d.getVisibility())) {
            return false;
        }
        InterfaceC1177e interfaceC1177eC0 = interfaceC1176d.c0();
        AbstractC4862t.d(interfaceC1177eC0, "constructorDescriptor.constructedClass");
        if (AbstractC5285g.b(interfaceC1177eC0) || AbstractC5283e.G(interfaceC1176d.c0())) {
            return false;
        }
        List listI = interfaceC1176d.i();
        AbstractC4862t.d(listI, "constructorDescriptor.valueParameters");
        if (listI != null && listI.isEmpty()) {
            return false;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            E type = ((j0) it.next()).getType();
            AbstractC4862t.d(type, "it.type");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
