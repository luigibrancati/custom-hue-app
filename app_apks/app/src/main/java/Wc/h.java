package Wc;

import Cd.E;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.a0;
import Lc.j0;
import Oc.L;
import Yc.l;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final List a(Collection newValueParameterTypes, Collection oldValueParameters, InterfaceC1173a newOwner) {
        AbstractC4862t.e(newValueParameterTypes, "newValueParameterTypes");
        AbstractC4862t.e(oldValueParameters, "oldValueParameters");
        AbstractC4862t.e(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<C4034q> listD1 = C4179C.d1(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(C4207u.v(listD1, 10));
        for (C4034q c4034q : listD1) {
            E e10 = (E) c4034q.a();
            j0 j0Var = (j0) c4034q.b();
            int index = j0Var.getIndex();
            Mc.g annotations = j0Var.getAnnotations();
            kd.f name = j0Var.getName();
            AbstractC4862t.d(name, "oldParameter.name");
            boolean zX0 = j0Var.x0();
            boolean zP0 = j0Var.p0();
            boolean zO0 = j0Var.o0();
            E eK = j0Var.s0() != null ? AbstractC5823c.p(newOwner).n().k(e10) : null;
            a0 a0VarJ = j0Var.j();
            AbstractC4862t.d(a0VarJ, "oldParameter.source");
            arrayList.add(new L(newOwner, null, index, annotations, name, e10, zX0, zP0, zO0, eK, a0VarJ));
        }
        return arrayList;
    }

    public static final l b(InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(interfaceC1177e, "<this>");
        InterfaceC1177e interfaceC1177eT = AbstractC5823c.t(interfaceC1177e);
        if (interfaceC1177eT == null) {
            return null;
        }
        InterfaceC6099h interfaceC6099hL0 = interfaceC1177eT.l0();
        l lVar = interfaceC6099hL0 instanceof l ? (l) interfaceC6099hL0 : null;
        return lVar == null ? b(interfaceC1177eT) : lVar;
    }
}
