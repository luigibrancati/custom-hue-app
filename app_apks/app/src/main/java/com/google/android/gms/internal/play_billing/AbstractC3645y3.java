package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3645y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I3 f30271a;

    static {
        C3615t3 c3615t3 = C3615t3.f30246c;
        f30271a = new K3();
    }

    public static void A(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.t(i10, list, z10);
    }

    public static void B(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.o(i10, list, z10);
    }

    public static void C(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.C(i10, list, z10);
    }

    public static void D(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.d(i10, list, z10);
    }

    public static void E(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.a(i10, list, z10);
    }

    public static void a(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.h(i10, list, z10);
    }

    public static void b(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.i(i10, list, z10);
    }

    public static void c(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.f(i10, list, z10);
    }

    public static void d(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.c(i10, list, z10);
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
        if (!(list instanceof P2)) {
            int iA = 0;
            while (i10 < size) {
                iA += AbstractC3638x2.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        P2 p22 = (P2) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += AbstractC3638x2.a(p22.d(i10));
            i10++;
        }
        return iA2;
    }

    public static int g(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3638x2.B(i10 << 3) + 4);
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3638x2.B(i10 << 3) + 8);
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
        if (!(list instanceof P2)) {
            int iA = 0;
            while (i10 < size) {
                iA += AbstractC3638x2.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        P2 p22 = (P2) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += AbstractC3638x2.a(p22.d(i10));
            i10++;
        }
        return iA2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA += AbstractC3638x2.a(((Long) list.get(i10)).longValue());
        }
        return iA;
    }

    public static int m(int i10, Object obj, InterfaceC3633w3 interfaceC3633w3) {
        int i11 = i10 << 3;
        if (!(obj instanceof Y2)) {
            return AbstractC3638x2.B(i11) + AbstractC3638x2.z((InterfaceC3568l3) obj, interfaceC3633w3);
        }
        int iB = AbstractC3638x2.B(i11);
        int iA = ((Y2) obj).a();
        return iB + AbstractC3638x2.B(iA) + iA;
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof P2)) {
            int iB = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iB += AbstractC3638x2.B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iB;
        }
        P2 p22 = (P2) list;
        int iB2 = 0;
        while (i10 < size) {
            int iD = p22.d(i10);
            iB2 += AbstractC3638x2.B((iD >> 31) ^ (iD + iD));
            i10++;
        }
        return iB2;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iA += AbstractC3638x2.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iA;
    }

    public static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof P2)) {
            int iB = 0;
            while (i10 < size) {
                iB += AbstractC3638x2.B(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB;
        }
        P2 p22 = (P2) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += AbstractC3638x2.B(p22.d(i10));
            i10++;
        }
        return iB2;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA += AbstractC3638x2.a(((Long) list.get(i10)).longValue());
        }
        return iA;
    }

    public static I3 r() {
        return f30271a;
    }

    public static Object s(Object obj, int i10, int i11, Object obj2, I3 i32) {
        Object obj3 = obj2;
        if (obj2 == null) {
            O2 o22 = (O2) obj;
            J3 j32 = o22.zzc;
            obj3 = j32;
            if (j32 == J3.c()) {
                J3 j3F = J3.f();
                o22.zzc = j3F;
                obj3 = j3F;
            }
        }
        ((J3) obj3).j(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    public static void t(C2 c22, Object obj, Object obj2) {
        if (((M2) obj2).zzb.f30036a.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void u(I3 i32, Object obj, Object obj2) {
        O2 o22 = (O2) obj;
        J3 j3E = o22.zzc;
        J3 j32 = ((O2) obj2).zzc;
        if (!J3.c().equals(j32)) {
            if (J3.c().equals(j3E)) {
                j3E = J3.e(j3E, j32);
            } else {
                j3E.d(j32);
            }
        }
        o22.zzc = j3E;
    }

    public static void v(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.n(i10, list, z10);
    }

    public static void w(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.E(i10, list, z10);
    }

    public static void x(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.A(i10, list, z10);
    }

    public static void y(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.y(i10, list, z10);
    }

    public static void z(int i10, List list, V3 v32, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v32.r(i10, list, z10);
    }
}
