package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V2 {
    public static InterfaceC3277p a(Object obj) {
        if (obj == null) {
            return InterfaceC3277p.f29568a0;
        }
        if (obj instanceof String) {
            return new C3312t((String) obj);
        }
        if (obj instanceof Double) {
            return new C3214i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C3214i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C3214i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C3196g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C3187f c3187f = new C3187f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c3187f.w(c3187f.s(), a(it.next()));
            }
            return c3187f;
        }
        C3250m c3250m = new C3250m();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC3277p interfaceC3277pA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c3250m.k((String) string, interfaceC3277pA);
            }
        }
        return c3250m;
    }

    public static InterfaceC3277p b(B3 b32) {
        if (b32 == null) {
            return InterfaceC3277p.f29567U;
        }
        int iM = b32.M() - 1;
        if (iM == 1) {
            return b32.F() ? new C3312t(b32.G()) : InterfaceC3277p.f29574g0;
        }
        if (iM == 2) {
            return b32.J() ? new C3214i(Double.valueOf(b32.K())) : new C3214i(null);
        }
        if (iM == 3) {
            return b32.H() ? new C3196g(Boolean.valueOf(b32.I())) : new C3196g(null);
        }
        if (iM != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listD = b32.D();
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((B3) it.next()));
        }
        return new C3286q(b32.E(), arrayList);
    }
}
