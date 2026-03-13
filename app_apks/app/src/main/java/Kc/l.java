package Kc;

import Cd.M;
import Cd.f0;
import Lc.InterfaceC1177e;
import gc.C4179C;
import gc.C4207u;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final f0 a(InterfaceC1177e from, InterfaceC1177e to) {
        AbstractC4862t.e(from, "from");
        AbstractC4862t.e(to, "to");
        from.q().size();
        to.q().size();
        f0.a aVar = f0.f1357c;
        List listQ = from.q();
        AbstractC4862t.d(listQ, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C4207u.v(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((Lc.f0) it.next()).k());
        }
        List listQ2 = to.q();
        AbstractC4862t.d(listQ2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C4207u.v(listQ2, 10));
        Iterator it2 = listQ2.iterator();
        while (it2.hasNext()) {
            M mP = ((Lc.f0) it2.next()).p();
            AbstractC4862t.d(mP, "it.defaultType");
            arrayList2.add(Hd.a.a(mP));
        }
        return f0.a.e(aVar, Q.s(C4179C.d1(arrayList, arrayList2)), false, 2, null);
    }
}
