package Dd;

import Cd.AbstractC0737u;
import Cd.AbstractC0741y;
import Cd.B;
import Cd.F;
import Cd.G;
import Cd.M;
import Cd.t0;
import fc.C4032o;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final t0 a(List types) {
        M mV0;
        AbstractC4862t.e(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (t0) C4179C.F0(types);
        }
        ArrayList arrayList = new ArrayList(C4207u.v(types, 10));
        Iterator it = types.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            z10 = z10 || G.a(t0Var);
            if (t0Var instanceof M) {
                mV0 = (M) t0Var;
            } else {
                if (!(t0Var instanceof AbstractC0741y)) {
                    throw new C4032o();
                }
                if (AbstractC0737u.a(t0Var)) {
                    return t0Var;
                }
                mV0 = ((AbstractC0741y) t0Var).V0();
                z11 = true;
            }
            arrayList.add(mV0);
        }
        if (z10) {
            return Ed.k.d(Ed.j.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z11) {
            return u.f2695a.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(B.d((t0) it2.next()));
        }
        u uVar = u.f2695a;
        return F.d(uVar.c(arrayList), uVar.c(arrayList2));
    }
}
