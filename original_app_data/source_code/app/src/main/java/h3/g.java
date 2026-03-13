package h3;

import b3.C2804c;
import b3.t;
import fc.C4034q;
import gc.C4206t;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final boolean a(t.e eVar, int i10, int i11) {
        AbstractC4862t.e(eVar, "<this>");
        Map mapD = eVar.d();
        if (!mapD.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map mapI = (Map) mapD.get(Integer.valueOf(i10));
        if (mapI == null) {
            mapI = Q.i();
        }
        return mapI.containsKey(Integer.valueOf(i11));
    }

    public static final List b(t.e eVar, int i10, int i11) {
        AbstractC4862t.e(eVar, "<this>");
        if (i10 == i11) {
            return C4206t.k();
        }
        return c(eVar, new ArrayList(), i11 > i10, i10, i11);
    }

    public static final List c(t.e eVar, List list, boolean z10, int i10, int i11) {
        int iIntValue;
        boolean z11;
        while (true) {
            if (z10) {
                if (i10 >= i11) {
                    return list;
                }
            } else if (i10 <= i11) {
                return list;
            }
            C4034q c4034qE = z10 ? eVar.e(i10) : eVar.f(i10);
            if (c4034qE == null) {
                return null;
            }
            Map map = (Map) c4034qE.a();
            Iterator it = ((Iterable) c4034qE.b()).iterator();
            while (it.hasNext()) {
                iIntValue = ((Number) it.next()).intValue();
                if (!z10) {
                    if (i11 <= iIntValue && iIntValue < i10) {
                        Object obj = map.get(Integer.valueOf(iIntValue));
                        AbstractC4862t.b(obj);
                        list.add(obj);
                        z11 = true;
                        break;
                    }
                } else if (i10 + 1 <= iIntValue && iIntValue <= i11) {
                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                    AbstractC4862t.b(obj2);
                    list.add(obj2);
                    z11 = true;
                    break;
                }
            }
            iIntValue = i10;
            z11 = false;
            if (!z11) {
                return null;
            }
            i10 = iIntValue;
        }
    }

    public static final boolean d(C2804c c2804c, int i10, int i11) {
        AbstractC4862t.e(c2804c, "<this>");
        if (i10 > i11 && c2804c.f25166l) {
            return false;
        }
        Set setC = c2804c.c();
        return c2804c.f25165k && (setC == null || !setC.contains(Integer.valueOf(i10)));
    }
}
