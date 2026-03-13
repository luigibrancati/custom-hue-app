package ge;

import gc.C4179C;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4244k0 {
    public static final int b(ee.e eVar, ee.e[] typeParams) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(typeParams, "typeParams");
        int iHashCode = (eVar.i().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = ee.h.a(eVar);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strI = ((ee.e) it.next()).i();
            if (strI != null) {
                iHashCode3 = strI.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            ee.k kVarF = ((ee.e) it2.next()).f();
            iHashCode2 = i12 + (kVarF != null ? kVarF.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }

    public static final String c(final ee.e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        return C4179C.q0(Bc.k.p(0, eVar.d()), ", ", eVar.i() + '(', ")", 0, null, new vc.l() { // from class: ge.j0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return AbstractC4244k0.d(eVar, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public static final CharSequence d(ee.e eVar, int i10) {
        return eVar.e(i10) + ": " + eVar.h(i10).i();
    }
}
