package Uc;

import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.j0;
import Uc.I;
import dd.AbstractC3908m;
import fc.C4034q;
import gc.C4179C;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import od.InterfaceC5284f;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements InterfaceC5284f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16943a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean a(InterfaceC1173a superDescriptor, InterfaceC1173a subDescriptor) {
            AbstractC4862t.e(superDescriptor, "superDescriptor");
            AbstractC4862t.e(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof Wc.e) && (superDescriptor instanceof InterfaceC1196y)) {
                Wc.e eVar = (Wc.e) subDescriptor;
                eVar.i().size();
                InterfaceC1196y interfaceC1196y = (InterfaceC1196y) superDescriptor;
                interfaceC1196y.i().size();
                List listI = eVar.a().i();
                AbstractC4862t.d(listI, "subDescriptor.original.valueParameters");
                List listI2 = interfaceC1196y.a().i();
                AbstractC4862t.d(listI2, "superDescriptor.original.valueParameters");
                for (C4034q c4034q : C4179C.d1(listI, listI2)) {
                    j0 subParameter = (j0) c4034q.a();
                    j0 superParameter = (j0) c4034q.b();
                    AbstractC4862t.d(subParameter, "subParameter");
                    boolean z10 = c((InterfaceC1196y) subDescriptor, subParameter) instanceof AbstractC3908m.d;
                    AbstractC4862t.d(superParameter, "superParameter");
                    if (z10 != (c(interfaceC1196y, superParameter) instanceof AbstractC3908m.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean b(InterfaceC1196y interfaceC1196y) {
            if (interfaceC1196y.i().size() != 1) {
                return false;
            }
            InterfaceC1185m interfaceC1185mB = interfaceC1196y.b();
            InterfaceC1177e interfaceC1177e = interfaceC1185mB instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mB : null;
            if (interfaceC1177e == null) {
                return false;
            }
            List listI = interfaceC1196y.i();
            AbstractC4862t.d(listI, "f.valueParameters");
            InterfaceC1180h interfaceC1180hQ = ((j0) C4179C.F0(listI)).getType().N0().q();
            InterfaceC1177e interfaceC1177e2 = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
            return interfaceC1177e2 != null && Ic.g.q0(interfaceC1177e) && AbstractC4862t.a(AbstractC5823c.l(interfaceC1177e), AbstractC5823c.l(interfaceC1177e2));
        }

        public final AbstractC3908m c(InterfaceC1196y interfaceC1196y, j0 j0Var) {
            if (dd.w.e(interfaceC1196y) || b(interfaceC1196y)) {
                Cd.E type = j0Var.getType();
                AbstractC4862t.d(type, "valueParameterDescriptor.type");
                return dd.w.g(Hd.a.u(type));
            }
            Cd.E type2 = j0Var.getType();
            AbstractC4862t.d(type2, "valueParameterDescriptor.type");
            return dd.w.g(type2);
        }

        public a() {
        }
    }

    @Override // od.InterfaceC5284f
    public InterfaceC5284f.b a(InterfaceC1173a superDescriptor, InterfaceC1173a subDescriptor, InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(superDescriptor, "superDescriptor");
        AbstractC4862t.e(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, interfaceC1177e) ? InterfaceC5284f.b.INCOMPATIBLE : f16943a.a(superDescriptor, subDescriptor) ? InterfaceC5284f.b.INCOMPATIBLE : InterfaceC5284f.b.UNKNOWN;
    }

    @Override // od.InterfaceC5284f
    public InterfaceC5284f.a b() {
        return InterfaceC5284f.a.CONFLICTS_ONLY;
    }

    public final boolean c(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2, InterfaceC1177e interfaceC1177e) {
        if ((interfaceC1173a instanceof InterfaceC1174b) && (interfaceC1173a2 instanceof InterfaceC1196y) && !Ic.g.f0(interfaceC1173a2)) {
            C2304f c2304f = C2304f.f16916n;
            InterfaceC1196y interfaceC1196y = (InterfaceC1196y) interfaceC1173a2;
            kd.f name = interfaceC1196y.getName();
            AbstractC4862t.d(name, "subDescriptor.name");
            if (!c2304f.l(name)) {
                I.a aVar = I.f16886a;
                kd.f name2 = interfaceC1196y.getName();
                AbstractC4862t.d(name2, "subDescriptor.name");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC1174b interfaceC1174bE = H.e((InterfaceC1174b) interfaceC1173a);
            boolean z10 = interfaceC1173a instanceof InterfaceC1196y;
            InterfaceC1196y interfaceC1196y2 = z10 ? (InterfaceC1196y) interfaceC1173a : null;
            if (!(interfaceC1196y2 != null && interfaceC1196y.B0() == interfaceC1196y2.B0()) && (interfaceC1174bE == null || !interfaceC1196y.B0())) {
                return true;
            }
            if ((interfaceC1177e instanceof Wc.c) && interfaceC1196y.q0() == null && interfaceC1174bE != null && !H.f(interfaceC1177e, interfaceC1174bE)) {
                if ((interfaceC1174bE instanceof InterfaceC1196y) && z10 && C2304f.k((InterfaceC1196y) interfaceC1174bE) != null) {
                    String strC = dd.w.c(interfaceC1196y, false, false, 2, null);
                    InterfaceC1196y interfaceC1196yA = ((InterfaceC1196y) interfaceC1173a).a();
                    AbstractC4862t.d(interfaceC1196yA, "superDescriptor.original");
                    if (AbstractC4862t.a(strC, dd.w.c(interfaceC1196yA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
