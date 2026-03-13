package Dd;

import Cd.E;
import Cd.F;
import Cd.M;
import Cd.i0;
import Cd.n0;
import Cd.t0;
import Cd.u0;
import Dd.f;
import Lc.f0;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public static final List a(t0 t0Var, Gd.b bVar) {
        if (t0Var.L0().size() != t0Var.N0().getParameters().size()) {
            return null;
        }
        List listL0 = t0Var.L0();
        if (listL0 == null || !listL0.isEmpty()) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                if (((i0) it.next()).b() != u0.INVARIANT) {
                    List parameters = t0Var.N0().getParameters();
                    AbstractC4862t.d(parameters, "type.constructor.parameters");
                    List<C4034q> listD1 = C4179C.d1(listL0, parameters);
                    ArrayList arrayList = new ArrayList(C4207u.v(listD1, 10));
                    for (C4034q c4034q : listD1) {
                        i0 i0VarA = (i0) c4034q.a();
                        f0 parameter = (f0) c4034q.b();
                        if (i0VarA.b() != u0.INVARIANT) {
                            t0 t0VarQ0 = (i0VarA.a() || i0VarA.b() != u0.IN_VARIANCE) ? null : i0VarA.getType().Q0();
                            AbstractC4862t.d(parameter, "parameter");
                            i0VarA = Hd.a.a(new i(bVar, t0VarQ0, i0VarA, parameter));
                        }
                        arrayList.add(i0VarA);
                    }
                    n0 n0VarC = Cd.f0.f1357c.b(t0Var.N0(), arrayList).c();
                    int size = listL0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        i0 i0Var = (i0) listL0.get(i10);
                        i0 i0Var2 = (i0) arrayList.get(i10);
                        if (i0Var.b() != u0.INVARIANT) {
                            List upperBounds = ((f0) t0Var.N0().getParameters().get(i10)).getUpperBounds();
                            AbstractC4862t.d(upperBounds, "type.constructor.parameters[index].upperBounds");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f2665a.a(n0VarC.n((E) it2.next(), u0.INVARIANT).Q0()));
                            }
                            if (!i0Var.a() && i0Var.b() == u0.OUT_VARIANCE) {
                                arrayList2.add(f.a.f2665a.a(i0Var.getType().Q0()));
                            }
                            E type = i0Var2.getType();
                            AbstractC4862t.c(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).N0().d(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final M b(M type, Gd.b status) {
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(status, "status");
        List listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    public static final M c(t0 t0Var, List list) {
        return F.j(t0Var.M0(), t0Var.N0(), list, t0Var.O0(), null, 16, null);
    }
}
