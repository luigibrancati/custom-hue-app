package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y5 f29313a;

    static {
        K5 k52 = K5.f29253c;
        f29313a = new C3149a6();
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (J4.G(i10 << 3) + 4);
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (J4.G(i10 << 3) + 8);
    }

    public static int E(int i10, Object obj, N5 n52) {
        int i11 = i10 << 3;
        if (!(obj instanceof C3256m5)) {
            return J4.G(i11) + J4.d((C5) obj, n52);
        }
        int iG = J4.G(i11);
        int iA = ((C3256m5) obj).a();
        return iG + J4.G(iA) + iA;
    }

    public static Y5 a() {
        return f29313a;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(O4 o42, Object obj, Object obj2) {
        if (((Y4) obj2).zzb.f29327a.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void d(Y5 y52, Object obj, Object obj2) {
        AbstractC3148a5 abstractC3148a5 = (AbstractC3148a5) obj;
        Z5 z5C = abstractC3148a5.zzc;
        Z5 z52 = ((AbstractC3148a5) obj2).zzc;
        if (!Z5.a().equals(z52)) {
            if (Z5.a().equals(z5C)) {
                z5C = Z5.c(z5C, z52);
            } else {
                z5C.l(z52);
            }
        }
        abstractC3148a5.zzc = z5C;
    }

    public static Object e(Object obj, int i10, int i11, Object obj2, Y5 y52) {
        if (obj2 == null) {
            obj2 = y52.a(obj);
        }
        ((Z5) obj2).k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.h(i10, list, z10);
    }

    public static void g(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.D(i10, list, z10);
    }

    public static void h(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.d(i10, list, z10);
    }

    public static void i(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.y(i10, list, z10);
    }

    public static void j(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.c(i10, list, z10);
    }

    public static void k(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.a(i10, list, z10);
    }

    public static void l(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.f(i10, list, z10);
    }

    public static void m(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.L(i10, list, z10);
    }

    public static void n(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.B(i10, list, z10);
    }

    public static void o(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.q(i10, list, z10);
    }

    public static void p(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.H(i10, list, z10);
    }

    public static void q(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.z(i10, list, z10);
    }

    public static void r(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.K(i10, list, z10);
    }

    public static void s(int i10, List list, InterfaceC3248l6 interfaceC3248l6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3248l6.i(i10, list, z10);
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3292q5)) {
            int iA = 0;
            while (i10 < size) {
                iA += J4.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += J4.a(c3292q5.S(i10));
            i10++;
        }
        return iA2;
    }

    public static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3292q5)) {
            int iA = 0;
            while (i10 < size) {
                iA += J4.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += J4.a(c3292q5.S(i10));
            i10++;
        }
        return iA2;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3292q5)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += J4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        int iA2 = 0;
        while (i10 < size) {
            long jS = c3292q5.S(i10);
            iA2 += J4.a((jS >> 63) ^ (jS + jS));
            i10++;
        }
        return iA2;
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3157b5)) {
            int iA = 0;
            while (i10 < size) {
                iA += J4.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += J4.a(c3157b5.e(i10));
            i10++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3157b5)) {
            int iA = 0;
            while (i10 < size) {
                iA += J4.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += J4.a(c3157b5.e(i10));
            i10++;
        }
        return iA2;
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3157b5)) {
            int iG = 0;
            while (i10 < size) {
                iG += J4.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        int iG2 = 0;
        while (i10 < size) {
            iG2 += J4.G(c3157b5.e(i10));
            i10++;
        }
        return iG2;
    }

    public static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3157b5)) {
            int iG = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iG += J4.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iG;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        int iG2 = 0;
        while (i10 < size) {
            int iE = c3157b5.e(i10);
            iG2 += J4.G((iE >> 31) ^ (iE + iE));
            i10++;
        }
        return iG2;
    }
}
