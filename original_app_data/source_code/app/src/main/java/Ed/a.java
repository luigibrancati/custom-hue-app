package Ed;

import Cd.l0;
import Cd.n0;
import Lc.AbstractC1191t;
import Lc.D;
import Lc.EnumC1178f;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.a0;
import Oc.C1812f;
import Oc.C1814h;
import gc.C4206t;
import gc.T;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends C1814h {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(kd.f name) {
        AbstractC4862t.e(name, "name");
        k kVar = k.f3414a;
        G gI = kVar.i();
        D d10 = D.OPEN;
        EnumC1178f enumC1178f = EnumC1178f.CLASS;
        List listK = C4206t.k();
        a0 a0Var = a0.f8746a;
        super(gI, name, d10, enumC1178f, listK, a0Var, false, Bd.f.f816e);
        C1812f c1812fN1 = C1812f.n1(this, Mc.g.f9435K.b(), true, a0Var);
        c1812fN1.q1(C4206t.k(), AbstractC1191t.f8774d);
        AbstractC4862t.d(c1812fN1, "create(this, Annotations…          )\n            }");
        g gVar = g.SCOPE_FOR_ERROR_CLASS;
        String string = c1812fN1.getName().toString();
        AbstractC4862t.d(string, "errorConstructor.name.toString()");
        InterfaceC6099h interfaceC6099hB = k.b(gVar, string, "");
        j jVar = j.ERROR_CLASS;
        c1812fN1.g1(new h(kVar.e(jVar, new String[0]), interfaceC6099hB, jVar, null, false, new String[0], 24, null));
        K0(interfaceC6099hB, T.c(c1812fN1), c1812fN1);
    }

    @Override // Oc.AbstractC1807a, Lc.c0
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1177e c(n0 substitutor) {
        AbstractC4862t.e(substitutor, "substitutor");
        return this;
    }

    @Override // Oc.AbstractC1807a, Oc.t
    public InterfaceC6099h g0(l0 typeSubstitution, Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(typeSubstitution, "typeSubstitution");
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        g gVar = g.SCOPE_FOR_ERROR_CLASS;
        String string = getName().toString();
        AbstractC4862t.d(string, "name.toString()");
        return k.b(gVar, string, typeSubstitution.toString());
    }

    @Override // Oc.C1814h
    public String toString() {
        String strB = getName().b();
        AbstractC4862t.d(strB, "name.asString()");
        return strB;
    }
}
