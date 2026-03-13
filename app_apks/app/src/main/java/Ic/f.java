package Ic;

import Cd.E;
import Cd.F;
import Cd.M;
import Cd.b0;
import Cd.i0;
import Ic.j;
import Jc.c;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import fc.AbstractC4040w;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import qd.u;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final int a(E e10) {
        AbstractC4862t.e(e10, "<this>");
        Mc.c cVarJ = e10.getAnnotations().j(j.a.f5751D);
        if (cVarJ == null) {
            return 0;
        }
        qd.g gVar = (qd.g) Q.j(cVarJ.a(), j.f5729k);
        AbstractC4862t.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((qd.m) gVar).b()).intValue();
    }

    public static final M b(g builtIns, Mc.g annotations, E e10, List contextReceiverTypes, List parameterTypes, List list, E returnType, boolean z10) {
        AbstractC4862t.e(builtIns, "builtIns");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(contextReceiverTypes, "contextReceiverTypes");
        AbstractC4862t.e(parameterTypes, "parameterTypes");
        AbstractC4862t.e(returnType, "returnType");
        List listG = g(e10, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        InterfaceC1177e interfaceC1177eF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (e10 == null ? 0 : 1), z10);
        if (e10 != null) {
            annotations = t(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = s(annotations, builtIns, contextReceiverTypes.size());
        }
        return F.g(b0.b(annotations), interfaceC1177eF, listG);
    }

    public static final kd.f d(E e10) {
        String str;
        AbstractC4862t.e(e10, "<this>");
        Mc.c cVarJ = e10.getAnnotations().j(j.a.f5753E);
        if (cVarJ == null) {
            return null;
        }
        Object objG0 = C4179C.G0(cVarJ.a().values());
        u uVar = objG0 instanceof u ? (u) objG0 : null;
        if (uVar != null && (str = (String) uVar.b()) != null) {
            if (!kd.f.v(str)) {
                str = null;
            }
            if (str != null) {
                return kd.f.s(str);
            }
        }
        return null;
    }

    public static final List e(E e10) {
        AbstractC4862t.e(e10, "<this>");
        o(e10);
        int iA = a(e10);
        if (iA == 0) {
            return C4206t.k();
        }
        List listSubList = e10.L0().subList(0, iA);
        ArrayList arrayList = new ArrayList(C4207u.v(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            E type = ((i0) it.next()).getType();
            AbstractC4862t.d(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final InterfaceC1177e f(g builtIns, int i10, boolean z10) {
        AbstractC4862t.e(builtIns, "builtIns");
        InterfaceC1177e interfaceC1177eX = z10 ? builtIns.X(i10) : builtIns.C(i10);
        AbstractC4862t.d(interfaceC1177eX, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return interfaceC1177eX;
    }

    public static final List g(E e10, List contextReceiverTypes, List parameterTypes, List list, E returnType, g builtIns) {
        kd.f fVar;
        AbstractC4862t.e(contextReceiverTypes, "contextReceiverTypes");
        AbstractC4862t.e(parameterTypes, "parameterTypes");
        AbstractC4862t.e(returnType, "returnType");
        AbstractC4862t.e(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (e10 != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(C4207u.v(contextReceiverTypes, 10));
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(Hd.a.a((E) it.next()));
        }
        arrayList.addAll(arrayList2);
        Md.a.a(arrayList, e10 != null ? Hd.a.a(e10) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            E eV = (E) obj;
            if (list == null || (fVar = (kd.f) list.get(i10)) == null || fVar.u()) {
                fVar = null;
            }
            if (fVar != null) {
                kd.c cVar = j.a.f5753E;
                kd.f fVarS = kd.f.s("name");
                String strB = fVar.b();
                AbstractC4862t.d(strB, "name.asString()");
                eV = Hd.a.v(eV, Mc.g.f9435K.a(C4179C.B0(eV.getAnnotations(), new Mc.j(builtIns, cVar, P.f(AbstractC4040w.a(fVarS, new u(strB)))))));
            }
            arrayList.add(Hd.a.a(eV));
            i10 = i11;
        }
        arrayList.add(Hd.a.a(returnType));
        return arrayList;
    }

    public static final Jc.c h(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        if ((interfaceC1185m instanceof InterfaceC1177e) && g.A0(interfaceC1185m)) {
            return i(AbstractC5823c.m(interfaceC1185m));
        }
        return null;
    }

    public static final Jc.c i(kd.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        c.a aVar = Jc.c.Companion;
        String strB = dVar.i().b();
        AbstractC4862t.d(strB, "shortName().asString()");
        kd.c cVarE = dVar.l().e();
        AbstractC4862t.d(cVarE, "toSafe().parent()");
        return aVar.b(strB, cVarE);
    }

    public static final E j(E e10) {
        AbstractC4862t.e(e10, "<this>");
        o(e10);
        if (!r(e10)) {
            return null;
        }
        return ((i0) e10.L0().get(a(e10))).getType();
    }

    public static final E k(E e10) {
        AbstractC4862t.e(e10, "<this>");
        o(e10);
        E type = ((i0) C4179C.s0(e10.L0())).getType();
        AbstractC4862t.d(type, "arguments.last().type");
        return type;
    }

    public static final List l(E e10) {
        AbstractC4862t.e(e10, "<this>");
        o(e10);
        return e10.L0().subList(a(e10) + (m(e10) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean m(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return o(e10) && r(e10);
    }

    public static final boolean n(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        Jc.c cVarH = h(interfaceC1185m);
        return cVarH == Jc.c.Function || cVarH == Jc.c.SuspendFunction;
    }

    public static final boolean o(E e10) {
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return interfaceC1180hQ != null && n(interfaceC1180hQ);
    }

    public static final boolean p(E e10) {
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return (interfaceC1180hQ != null ? h(interfaceC1180hQ) : null) == Jc.c.Function;
    }

    public static final boolean q(E e10) {
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return (interfaceC1180hQ != null ? h(interfaceC1180hQ) : null) == Jc.c.SuspendFunction;
    }

    public static final boolean r(E e10) {
        return e10.getAnnotations().j(j.a.f5749C) != null;
    }

    public static final Mc.g s(Mc.g gVar, g builtIns, int i10) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(builtIns, "builtIns");
        kd.c cVar = j.a.f5751D;
        return gVar.K(cVar) ? gVar : Mc.g.f9435K.a(C4179C.B0(gVar, new Mc.j(builtIns, cVar, P.f(AbstractC4040w.a(j.f5729k, new qd.m(i10))))));
    }

    public static final Mc.g t(Mc.g gVar, g builtIns) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(builtIns, "builtIns");
        kd.c cVar = j.a.f5749C;
        return gVar.K(cVar) ? gVar : Mc.g.f9435K.a(C4179C.B0(gVar, new Mc.j(builtIns, cVar, Q.i())));
    }
}
