package com.google.android.gms.internal.measurement;

import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3324u2 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(InterfaceC3277p interfaceC3277p) {
        if (interfaceC3277p == null) {
            return false;
        }
        Double dC = interfaceC3277p.c();
        return !dC.isNaN() && dC.doubleValue() >= 0.0d && dC.equals(Double.valueOf(Math.floor(dC.doubleValue())));
    }

    public static M e(String str) {
        M mA = null;
        if (str != null && !str.isEmpty()) {
            mA = M.a(Integer.parseInt(str));
        }
        if (mA != null) {
            return mA;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(InterfaceC3277p interfaceC3277p, InterfaceC3277p interfaceC3277p2) {
        if (!interfaceC3277p.getClass().equals(interfaceC3277p2.getClass())) {
            return false;
        }
        if ((interfaceC3277p instanceof C3321u) || (interfaceC3277p instanceof C3259n)) {
            return true;
        }
        if (!(interfaceC3277p instanceof C3214i)) {
            return interfaceC3277p instanceof C3312t ? interfaceC3277p.b().equals(interfaceC3277p2.b()) : interfaceC3277p instanceof C3196g ? interfaceC3277p.d().equals(interfaceC3277p2.d()) : interfaceC3277p == interfaceC3277p2;
        }
        if (Double.isNaN(interfaceC3277p.c().doubleValue()) || Double.isNaN(interfaceC3277p2.c().doubleValue())) {
            return false;
        }
        return interfaceC3277p.c().equals(interfaceC3277p2.c());
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return ((long) g(d10)) & KeyboardMap.kValueMask;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object j(InterfaceC3277p interfaceC3277p) {
        if (InterfaceC3277p.f29568a0.equals(interfaceC3277p)) {
            return null;
        }
        if (InterfaceC3277p.f29567U.equals(interfaceC3277p)) {
            return "";
        }
        if (interfaceC3277p instanceof C3250m) {
            return k((C3250m) interfaceC3277p);
        }
        if (!(interfaceC3277p instanceof C3187f)) {
            return !interfaceC3277p.c().isNaN() ? interfaceC3277p.c() : interfaceC3277p.b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C3187f) interfaceC3277p).iterator();
        while (it.hasNext()) {
            Object objJ = j((InterfaceC3277p) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(C3250m c3250m) {
        HashMap map = new HashMap();
        for (String str : c3250m.a()) {
            Object objJ = j(c3250m.h(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(T1 t12) {
        int iG = g(t12.h("runtime.counter").c().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        t12.e("runtime.counter", new C3214i(Double.valueOf(iG)));
        return iG;
    }
}
