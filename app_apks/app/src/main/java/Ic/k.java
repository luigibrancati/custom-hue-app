package Ic;

import Cd.E;
import Cd.F;
import Cd.M;
import Cd.e0;
import Cd.i0;
import Cd.u0;
import Lc.AbstractC1191t;
import Lc.D;
import Lc.EnumC1178f;
import Lc.a0;
import Oc.C1819m;
import Oc.K;
import Oc.y;
import gc.C4179C;
import gc.C4205s;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f5833a;

    static {
        C1819m c1819m = new C1819m(Ed.k.f3414a.i(), j.f5731m);
        EnumC1178f enumC1178f = EnumC1178f.INTERFACE;
        kd.f fVarG = j.f5734p.g();
        a0 a0Var = a0.f8746a;
        Bd.n nVar = Bd.f.f816e;
        y yVar = new y(c1819m, enumC1178f, false, false, fVarG, a0Var, nVar);
        yVar.M0(D.ABSTRACT);
        yVar.O0(AbstractC1191t.f8775e);
        yVar.N0(C4205s.d(K.R0(yVar, Mc.g.f9435K.b(), false, u0.IN_VARIANCE, kd.f.s("T"), 0, nVar)));
        yVar.K0();
        f5833a = yVar;
    }

    public static final M a(E suspendFunType) {
        AbstractC4862t.e(suspendFunType, "suspendFunType");
        f.q(suspendFunType);
        g gVarI = Hd.a.i(suspendFunType);
        Mc.g annotations = suspendFunType.getAnnotations();
        E eJ = f.j(suspendFunType);
        List listE = f.e(suspendFunType);
        List listL = f.l(suspendFunType);
        ArrayList arrayList = new ArrayList(C4207u.v(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).getType());
        }
        Cd.a0 a0VarH = Cd.a0.f1311b.h();
        e0 e0VarK = f5833a.k();
        AbstractC4862t.d(e0VarK, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List listD0 = C4179C.D0(arrayList, F.j(a0VarH, e0VarK, C4205s.d(Hd.a.a(f.k(suspendFunType))), false, null, 16, null));
        M mI = Hd.a.i(suspendFunType).I();
        AbstractC4862t.d(mI, "suspendFunType.builtIns.nullableAnyType");
        return f.b(gVarI, annotations, eJ, listE, listD0, null, mI, (128 & 128) != 0 ? false : false).R0(suspendFunType.O0());
    }
}
