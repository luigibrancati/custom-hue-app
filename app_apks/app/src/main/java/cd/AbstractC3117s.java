package cd;

import Cd.o0;
import Uc.B;
import gc.C4179C;
import gc.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3117s {
    public static final C3101e a(C3101e c3101e, Collection superQualifiers, boolean z10, boolean z11, boolean z12) {
        EnumC3104h enumC3104hD;
        boolean z13;
        AbstractC4862t.e(c3101e, "<this>");
        AbstractC4862t.e(superQualifiers, "superQualifiers");
        ArrayList arrayList = new ArrayList();
        Iterator it = superQualifiers.iterator();
        while (it.hasNext()) {
            EnumC3104h enumC3104hB = b((C3101e) it.next());
            if (enumC3104hB != null) {
                arrayList.add(enumC3104hB);
            }
        }
        EnumC3104h enumC3104hD2 = d(C4179C.Z0(arrayList), b(c3101e), z10);
        if (enumC3104hD2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = superQualifiers.iterator();
            while (it2.hasNext()) {
                EnumC3104h enumC3104hD3 = ((C3101e) it2.next()).d();
                if (enumC3104hD3 != null) {
                    arrayList2.add(enumC3104hD3);
                }
            }
            enumC3104hD = d(C4179C.Z0(arrayList2), c3101e.d(), z10);
        } else {
            enumC3104hD = enumC3104hD2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = superQualifiers.iterator();
        while (it3.hasNext()) {
            EnumC3102f enumC3102fC = ((C3101e) it3.next()).c();
            if (enumC3102fC != null) {
                arrayList3.add(enumC3102fC);
            }
        }
        EnumC3102f enumC3102f = (EnumC3102f) e(C4179C.Z0(arrayList3), EnumC3102f.MUTABLE, EnumC3102f.READ_ONLY, c3101e.c(), z10);
        EnumC3104h enumC3104h = null;
        if (enumC3104hD != null && !z12 && (!z11 || enumC3104hD != EnumC3104h.NULLABLE)) {
            enumC3104h = enumC3104hD;
        }
        boolean z14 = false;
        if (enumC3104h == EnumC3104h.NOT_NULL) {
            if (!c3101e.b()) {
                if (!superQualifiers.isEmpty()) {
                    Iterator it4 = superQualifiers.iterator();
                    while (it4.hasNext()) {
                        if (((C3101e) it4.next()).b()) {
                        }
                    }
                }
                z13 = false;
            }
            z13 = true;
            break;
        }
        z13 = false;
        if (enumC3104h != null && enumC3104hD2 != enumC3104hD) {
            z14 = true;
        }
        return new C3101e(enumC3104h, enumC3102f, z13, z14);
    }

    public static final EnumC3104h b(C3101e c3101e) {
        if (c3101e.e()) {
            return null;
        }
        return c3101e.d();
    }

    public static final boolean c(o0 o0Var, Gd.i type) {
        AbstractC4862t.e(o0Var, "<this>");
        AbstractC4862t.e(type, "type");
        kd.c ENHANCED_NULLABILITY_ANNOTATION = B.f16859u;
        AbstractC4862t.d(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return o0Var.c0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    public static final EnumC3104h d(Set set, EnumC3104h enumC3104h, boolean z10) {
        EnumC3104h enumC3104h2 = EnumC3104h.FORCE_FLEXIBILITY;
        return enumC3104h == enumC3104h2 ? enumC3104h2 : (EnumC3104h) e(set, EnumC3104h.NOT_NULL, EnumC3104h.NULLABLE, enumC3104h, z10);
    }

    public static final Object e(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set setZ0;
        if (!z10) {
            if (obj3 != null && (setZ0 = C4179C.Z0(V.l(set, obj3))) != null) {
                set = setZ0;
            }
            return C4179C.G0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (AbstractC4862t.a(obj4, obj) && AbstractC4862t.a(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
