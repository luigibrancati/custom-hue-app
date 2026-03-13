package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3392e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3447p2 f29848a;

    static {
        R1 r12 = R1.f29797c;
        f29848a = new C3456r2();
    }

    public static void A(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.t(i10, list, z10);
    }

    public static void B(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.o(i10, list, z10);
    }

    public static void C(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.C(i10, list, z10);
    }

    public static void D(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.d(i10, list, z10);
    }

    public static void E(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.a(i10, list, z10);
    }

    public static void a(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.h(i10, list, z10);
    }

    public static void b(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.i(i10, list, z10);
    }

    public static void c(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.f(i10, list, z10);
    }

    public static void d(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.c(i10, list, z10);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3411i1)) {
            int iB = 0;
            while (i10 < size) {
                iB += O0.b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += O0.b(c3411i1.d(i10));
            i10++;
        }
        return iB2;
    }

    public static int g(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (O0.a(i10 << 3) + 4);
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (O0.a(i10 << 3) + 8);
    }

    public static int j(List list) {
        return list.size() * 8;
    }

    public static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3411i1)) {
            int iB = 0;
            while (i10 < size) {
                iB += O0.b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += O0.b(c3411i1.d(i10));
            i10++;
        }
        return iB2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB += O0.b(((Long) list.get(i10)).longValue());
        }
        return iB;
    }

    public static int m(int i10, Object obj, InterfaceC3382c2 interfaceC3382c2) {
        int i11 = i10 << 3;
        if (!(obj instanceof C3480w1)) {
            return O0.a(i11) + O0.B((J1) obj, interfaceC3382c2);
        }
        int iA = O0.a(i11);
        int iA2 = ((C3480w1) obj).a();
        return iA + O0.a(iA2) + iA2;
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3411i1)) {
            int iA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iA += O0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iA;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        int iA2 = 0;
        while (i10 < size) {
            int iD = c3411i1.d(i10);
            iA2 += O0.a((iD >> 31) ^ (iD + iD));
            i10++;
        }
        return iA2;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iB += O0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iB;
    }

    public static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3411i1)) {
            int iA = 0;
            while (i10 < size) {
                iA += O0.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += O0.a(c3411i1.d(i10));
            i10++;
        }
        return iA2;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB += O0.b(((Long) list.get(i10)).longValue());
        }
        return iB;
    }

    public static AbstractC3447p2 r() {
        return f29848a;
    }

    public static Object s(Object obj, int i10, int i11, Object obj2, AbstractC3447p2 abstractC3447p2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            AbstractC3406h1 abstractC3406h1 = (AbstractC3406h1) obj;
            C3452q2 c3452q2 = abstractC3406h1.zzc;
            obj3 = c3452q2;
            if (c3452q2 == C3452q2.c()) {
                C3452q2 c3452q2F = C3452q2.f();
                abstractC3406h1.zzc = c3452q2F;
                obj3 = c3452q2F;
            }
        }
        ((C3452q2) obj3).j(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    public static void t(T0 t02, Object obj, Object obj2) {
        X0 x02 = ((AbstractC3391e1) obj2).zzb;
        if (x02.f29821a.isEmpty()) {
            return;
        }
        ((AbstractC3391e1) obj).J().h(x02);
    }

    public static void u(AbstractC3447p2 abstractC3447p2, Object obj, Object obj2) {
        AbstractC3406h1 abstractC3406h1 = (AbstractC3406h1) obj;
        C3452q2 c3452q2E = abstractC3406h1.zzc;
        C3452q2 c3452q2 = ((AbstractC3406h1) obj2).zzc;
        if (!C3452q2.c().equals(c3452q2)) {
            if (C3452q2.c().equals(c3452q2E)) {
                c3452q2E = C3452q2.e(c3452q2E, c3452q2);
            } else {
                c3452q2E.d(c3452q2);
            }
        }
        abstractC3406h1.zzc = c3452q2E;
    }

    public static void v(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.n(i10, list, z10);
    }

    public static void w(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.E(i10, list, z10);
    }

    public static void x(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.A(i10, list, z10);
    }

    public static void y(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.y(i10, list, z10);
    }

    public static void z(int i10, List list, F2 f22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f22.r(i10, list, z10);
    }
}
