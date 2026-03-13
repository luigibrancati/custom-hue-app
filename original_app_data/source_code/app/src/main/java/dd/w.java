package dd;

import Cd.E;
import Ic.j;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.Z;
import Lc.j0;
import Uc.C2304f;
import Uc.H;
import dd.AbstractC3908m;
import gc.C4179C;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import sd.AbstractC5823c;
import td.C5881d;
import td.EnumC5882e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {
    public static final void a(StringBuilder sb2, E e10) {
        sb2.append(g(e10));
    }

    public static final String b(InterfaceC1196y interfaceC1196y, boolean z10, boolean z11) {
        String strB;
        AbstractC4862t.e(interfaceC1196y, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (interfaceC1196y instanceof InterfaceC1184l) {
                strB = "<init>";
            } else {
                strB = interfaceC1196y.getName().b();
                AbstractC4862t.d(strB, "name.asString()");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        X xM = interfaceC1196y.M();
        if (xM != null) {
            E type = xM.getType();
            AbstractC4862t.d(type, "it.type");
            a(sb2, type);
        }
        Iterator it = interfaceC1196y.i().iterator();
        while (it.hasNext()) {
            E type2 = ((j0) it.next()).getType();
            AbstractC4862t.d(type2, "parameter.type");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (AbstractC3900e.c(interfaceC1196y)) {
                sb2.append("V");
            } else {
                E returnType = interfaceC1196y.getReturnType();
                AbstractC4862t.b(returnType);
                a(sb2, returnType);
            }
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String c(InterfaceC1196y interfaceC1196y, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(interfaceC1196y, z10, z11);
    }

    public static final String d(InterfaceC1173a interfaceC1173a) {
        AbstractC4862t.e(interfaceC1173a, "<this>");
        y yVar = y.f33464a;
        if (AbstractC5283e.E(interfaceC1173a)) {
            return null;
        }
        InterfaceC1185m interfaceC1185mB = interfaceC1173a.b();
        InterfaceC1177e interfaceC1177e = interfaceC1185mB instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mB : null;
        if (interfaceC1177e == null || interfaceC1177e.getName().u()) {
            return null;
        }
        InterfaceC1173a interfaceC1173aA = interfaceC1173a.a();
        Z z10 = interfaceC1173aA instanceof Z ? (Z) interfaceC1173aA : null;
        if (z10 == null) {
            return null;
        }
        return AbstractC3917v.a(yVar, interfaceC1177e, c(z10, false, false, 3, null));
    }

    public static final boolean e(InterfaceC1173a f10) {
        InterfaceC1196y interfaceC1196yK;
        AbstractC4862t.e(f10, "f");
        if (!(f10 instanceof InterfaceC1196y)) {
            return false;
        }
        InterfaceC1196y interfaceC1196y = (InterfaceC1196y) f10;
        if (AbstractC4862t.a(interfaceC1196y.getName().b(), "remove") && interfaceC1196y.i().size() == 1 && !H.h((InterfaceC1174b) f10)) {
            List listI = interfaceC1196y.a().i();
            AbstractC4862t.d(listI, "f.original.valueParameters");
            E type = ((j0) C4179C.F0(listI)).getType();
            AbstractC4862t.d(type, "f.original.valueParameters.single().type");
            AbstractC3908m abstractC3908mG = g(type);
            AbstractC3908m.d dVar = abstractC3908mG instanceof AbstractC3908m.d ? (AbstractC3908m.d) abstractC3908mG : null;
            if ((dVar != null ? dVar.i() : null) != EnumC5882e.INT || (interfaceC1196yK = C2304f.k(interfaceC1196y)) == null) {
                return false;
            }
            List listI2 = interfaceC1196yK.a().i();
            AbstractC4862t.d(listI2, "overridden.original.valueParameters");
            E type2 = ((j0) C4179C.F0(listI2)).getType();
            AbstractC4862t.d(type2, "overridden.original.valueParameters.single().type");
            AbstractC3908m abstractC3908mG2 = g(type2);
            InterfaceC1185m interfaceC1185mB = interfaceC1196yK.b();
            AbstractC4862t.d(interfaceC1185mB, "overridden.containingDeclaration");
            if (AbstractC4862t.a(AbstractC5823c.m(interfaceC1185mB), j.a.f5786c0.j()) && (abstractC3908mG2 instanceof AbstractC3908m.c) && AbstractC4862t.a(((AbstractC3908m.c) abstractC3908mG2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(interfaceC1177e, "<this>");
        Kc.c cVar = Kc.c.f7792a;
        kd.d dVarJ = AbstractC5823c.l(interfaceC1177e).j();
        AbstractC4862t.d(dVarJ, "fqNameSafe.toUnsafe()");
        kd.b bVarN = cVar.n(dVarJ);
        if (bVarN == null) {
            return AbstractC3900e.b(interfaceC1177e, null, 2, null);
        }
        String strF = C5881d.b(bVarN).f();
        AbstractC4862t.d(strF, "byClassId(it).internalName");
        return strF;
    }

    public static final AbstractC3908m g(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return (AbstractC3908m) AbstractC3900e.e(e10, C3910o.f33452a, C3894B.f33358o, C3893A.f33353a, null, null, 32, null);
    }
}
