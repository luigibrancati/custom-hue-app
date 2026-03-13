package com.google.protobuf;

import com.google.protobuf.N;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f32041a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f32042b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J0 f32043c = new L0();

    public static Object A(Object obj, int i10, List list, N.e eVar, Object obj2, J0 j02) {
        if (eVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!eVar.isInRange(iIntValue)) {
                    obj2 = J(obj, i10, iIntValue, obj2, j02);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (eVar.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = J(obj, i10, iIntValue2, obj2, j02);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Class B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static J0 C() {
        try {
            Class clsD = D();
            if (clsD == null) {
                return null;
            }
            return (J0) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void E(E e10, Object obj, Object obj2) {
        I iC = e10.c(obj2);
        if (iC.q()) {
            return;
        }
        e10.d(obj).y(iC);
    }

    public static void F(InterfaceC3707b0 interfaceC3707b0, Object obj, Object obj2, long j10) {
        N0.V(obj, j10, interfaceC3707b0.a(N0.G(obj, j10), N0.G(obj2, j10)));
    }

    public static void G(J0 j02, Object obj, Object obj2) {
        j02.p(obj, j02.k(j02.g(obj), j02.g(obj2)));
    }

    public static void H(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f32041a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object J(Object obj, int i10, int i11, Object obj2, J0 j02) {
        if (obj2 == null) {
            obj2 = j02.f(obj);
        }
        j02.e(obj2, i10, i11);
        return obj2;
    }

    public static J0 K() {
        return f32042b;
    }

    public static J0 L() {
        return f32043c;
    }

    public static void M(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.A(i10, list, z10);
    }

    public static void N(int i10, List list, R0 r02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.I(i10, list);
    }

    public static void O(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.G(i10, list, z10);
    }

    public static void P(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.n(i10, list, z10);
    }

    public static void Q(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.j(i10, list, z10);
    }

    public static void R(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.y(i10, list, z10);
    }

    public static void S(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.a(i10, list, z10);
    }

    public static void T(int i10, List list, R0 r02, A0 a02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.M(i10, list, a02);
    }

    public static void U(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.g(i10, list, z10);
    }

    public static void V(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.F(i10, list, z10);
    }

    public static void W(int i10, List list, R0 r02, A0 a02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.J(i10, list, a02);
    }

    public static void X(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.z(i10, list, z10);
    }

    public static void Y(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.q(i10, list, z10);
    }

    public static void Z(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.D(i10, list, z10);
    }

    public static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(size) : size * AbstractC3728m.e(i10, true);
    }

    public static void a0(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.l(i10, list, z10);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, R0 r02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.d(i10, list);
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * AbstractC3728m.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += AbstractC3728m.i((AbstractC3722j) list.get(i11));
        }
        return iU;
    }

    public static void c0(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.k(i10, list, z10);
    }

    public static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iE) : iE + (size * AbstractC3728m.U(i10));
    }

    public static void d0(int i10, List list, R0 r02, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r02.r(i10, list, z10);
    }

    public static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof M)) {
            int iM = 0;
            while (i10 < size) {
                iM += AbstractC3728m.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM;
        }
        M m10 = (M) list;
        int iM2 = 0;
        while (i10 < size) {
            iM2 += AbstractC3728m.m(m10.getInt(i10));
            i10++;
        }
        return iM2;
    }

    public static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(size * 4) : size * AbstractC3728m.n(i10, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(size * 8) : size * AbstractC3728m.p(i10, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, A0 a02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iT += AbstractC3728m.t(i10, (InterfaceC3717g0) list.get(i11), a02);
        }
        return iT;
    }

    public static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iL) : iL + (size * AbstractC3728m.U(i10));
    }

    public static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof M)) {
            int iX = 0;
            while (i10 < size) {
                iX += AbstractC3728m.x(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iX;
        }
        M m10 = (M) list;
        int iX2 = 0;
        while (i10 < size) {
            iX2 += AbstractC3728m.x(m10.getInt(i10));
            i10++;
        }
        return iX2;
    }

    public static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iN) : iN + (list.size() * AbstractC3728m.U(i10));
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof X)) {
            int iZ = 0;
            while (i10 < size) {
                iZ += AbstractC3728m.z(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZ;
        }
        X x10 = (X) list;
        int iZ2 = 0;
        while (i10 < size) {
            iZ2 += AbstractC3728m.z(x10.getLong(i10));
            i10++;
        }
        return iZ2;
    }

    public static int o(int i10, Object obj, A0 a02) {
        return obj instanceof T ? AbstractC3728m.A(i10, (T) obj) : AbstractC3728m.F(i10, (InterfaceC3717g0) obj, a02);
    }

    public static int p(int i10, List list, A0 a02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = AbstractC3728m.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iU += obj instanceof T ? AbstractC3728m.B((T) obj) : AbstractC3728m.H((InterfaceC3717g0) obj, a02);
        }
        return iU;
    }

    public static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iR) : iR + (size * AbstractC3728m.U(i10));
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof M)) {
            int iP = 0;
            while (i10 < size) {
                iP += AbstractC3728m.P(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iP;
        }
        M m10 = (M) list;
        int iP2 = 0;
        while (i10 < size) {
            iP2 += AbstractC3728m.P(m10.getInt(i10));
            i10++;
        }
        return iP2;
    }

    public static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iT) : iT + (size * AbstractC3728m.U(i10));
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof X)) {
            int iR = 0;
            while (i10 < size) {
                iR += AbstractC3728m.R(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iR;
        }
        X x10 = (X) list;
        int iR2 = 0;
        while (i10 < size) {
            iR2 += AbstractC3728m.R(x10.getLong(i10));
            i10++;
        }
        return iR2;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = AbstractC3728m.U(i10) * size;
        if (!(list instanceof V)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iU += obj instanceof AbstractC3722j ? AbstractC3728m.i((AbstractC3722j) obj) : AbstractC3728m.T((String) obj);
                i11++;
            }
            return iU;
        }
        V v10 = (V) list;
        while (i11 < size) {
            Object objW0 = v10.W0(i11);
            iU += objW0 instanceof AbstractC3722j ? AbstractC3728m.i((AbstractC3722j) objW0) : AbstractC3728m.T((String) objW0);
            i11++;
        }
        return iU;
    }

    public static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iW) : iW + (size * AbstractC3728m.U(i10));
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof M)) {
            int iW = 0;
            while (i10 < size) {
                iW += AbstractC3728m.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iW;
        }
        M m10 = (M) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += AbstractC3728m.W(m10.getInt(i10));
            i10++;
        }
        return iW2;
    }

    public static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? AbstractC3728m.U(i10) + AbstractC3728m.C(iY) : iY + (size * AbstractC3728m.U(i10));
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof X)) {
            int iY = 0;
            while (i10 < size) {
                iY += AbstractC3728m.Y(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iY;
        }
        X x10 = (X) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += AbstractC3728m.Y(x10.getLong(i10));
            i10++;
        }
        return iY2;
    }

    public static Object z(Object obj, int i10, List list, N.d dVar, Object obj2, J0 j02) {
        if (dVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (dVar.findValueByNumber(iIntValue) == null) {
                    obj2 = J(obj, i10, iIntValue, obj2, j02);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (dVar.findValueByNumber(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = J(obj, i10, iIntValue2, obj2, j02);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
