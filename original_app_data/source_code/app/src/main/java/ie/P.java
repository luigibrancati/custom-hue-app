package ie;

import ee.k;
import ee.l;
import he.AbstractC4304b;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class P {
    public static final ee.e a(ee.e eVar, AbstractC4771b module) {
        ee.e eVarA;
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(module, "module");
        if (!AbstractC4862t.a(eVar.f(), k.a.f33969a)) {
            return eVar.isInline() ? a(eVar.h(0), module) : eVar;
        }
        ee.e eVarB = ee.b.b(module, eVar);
        return (eVarB == null || (eVarA = a(eVarB, module)) == null) ? eVar : eVarA;
    }

    public static final O b(AbstractC4304b abstractC4304b, ee.e desc) {
        AbstractC4862t.e(abstractC4304b, "<this>");
        AbstractC4862t.e(desc, "desc");
        ee.k kVarF = desc.f();
        if (kVarF instanceof ee.c) {
            return O.POLY_OBJ;
        }
        if (AbstractC4862t.a(kVarF, l.b.f33972a)) {
            return O.LIST;
        }
        if (!AbstractC4862t.a(kVarF, l.c.f33973a)) {
            return O.OBJ;
        }
        ee.e eVarA = a(desc.h(0), abstractC4304b.d());
        ee.k kVarF2 = eVarA.f();
        if ((kVarF2 instanceof ee.d) || AbstractC4862t.a(kVarF2, k.b.f33970a)) {
            return O.MAP;
        }
        if (abstractC4304b.c().c()) {
            return O.LIST;
        }
        throw u.c(eVarA);
    }
}
