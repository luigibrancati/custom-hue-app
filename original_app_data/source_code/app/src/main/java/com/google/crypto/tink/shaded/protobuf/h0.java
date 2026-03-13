package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f31460a = C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f31461b = D();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f31462c = new o0();

    public static int A(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof H)) {
            int iR = 0;
            while (i10 < size) {
                iR += AbstractC3664k.R(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iR;
        }
        H h10 = (H) list;
        int iR2 = 0;
        while (i10 < size) {
            iR2 += AbstractC3664k.R(h10.getLong(i10));
            i10++;
        }
        return iR2;
    }

    public static Object B(Object obj, int i10, List list, AbstractC3678z.c cVar, Object obj2, m0 m0Var) {
        if (cVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!cVar.isInRange(iIntValue)) {
                    obj2 = K(obj, i10, iIntValue, obj2, m0Var);
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
            if (cVar.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = K(obj, i10, iIntValue2, obj2, m0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Class C() {
        if (b0.f31427d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static m0 D() {
        try {
            Class clsE = E();
            if (clsE == null) {
                return null;
            }
            return (m0) clsE.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class E() {
        if (b0.f31427d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(AbstractC3670q abstractC3670q, Object obj, Object obj2) {
        C3672t c3672tC = abstractC3670q.c(obj2);
        if (c3672tC.j()) {
            return;
        }
        abstractC3670q.d(obj).q(c3672tC);
    }

    public static void G(L l10, Object obj, Object obj2, long j10) {
        p0.R(obj, j10, l10.a(p0.C(obj, j10), p0.C(obj2, j10)));
    }

    public static void H(m0 m0Var, Object obj, Object obj2) {
        m0Var.p(obj, m0Var.k(m0Var.g(obj), m0Var.g(obj2)));
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC3676x.class.isAssignableFrom(cls) && !b0.f31427d && (cls2 = f31460a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object K(Object obj, int i10, int i11, Object obj2, m0 m0Var) {
        if (obj2 == null) {
            obj2 = m0Var.f(obj);
        }
        m0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static m0 L() {
        return f31461b;
    }

    public static m0 M() {
        return f31462c;
    }

    public static void N(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.A(i10, list, z10);
    }

    public static void O(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i10, list);
    }

    public static void P(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i10, list, z10);
    }

    public static void Q(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.n(i10, list, z10);
    }

    public static void R(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i10, list, z10);
    }

    public static void S(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i10, list, z10);
    }

    public static void T(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i10, list, z10);
    }

    public static void U(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.O(i10, list, f0Var);
    }

    public static void V(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i10, list, z10);
    }

    public static void W(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i10, list, z10);
    }

    public static void X(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.L(i10, list, f0Var);
    }

    public static void Y(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.z(i10, list, z10);
    }

    public static void Z(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.q(i10, list, z10);
    }

    public static int a(int i10, AbstractC3654a abstractC3654a, f0 f0Var) {
        return AbstractC3664k.N(i10) + b(abstractC3654a, f0Var);
    }

    public static void a0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.D(i10, list, z10);
    }

    public static int b(AbstractC3654a abstractC3654a, f0 f0Var) {
        return AbstractC3664k.A(abstractC3654a.c(f0Var));
    }

    public static void b0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.l(i10, list, z10);
    }

    public static int c(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(size) : size * AbstractC3664k.d(i10, true);
    }

    public static void c0(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.d(i10, list);
    }

    public static int d(List list) {
        return list.size();
    }

    public static void d0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.k(i10, list, z10);
    }

    public static int e(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = size * AbstractC3664k.N(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iN += AbstractC3664k.h((AbstractC3661h) list.get(i11));
        }
        return iN;
    }

    public static void e0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.r(i10, list, z10);
    }

    public static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = g(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iG) : iG + (size * AbstractC3664k.N(i10));
    }

    public static int g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3677y)) {
            int iL = 0;
            while (i10 < size) {
                iL += AbstractC3664k.l(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iL;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iL2 = 0;
        while (i10 < size) {
            iL2 += AbstractC3664k.l(abstractC3677y.getInt(i10));
            i10++;
        }
        return iL2;
    }

    public static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(size * 4) : size * AbstractC3664k.m(i10, 0);
    }

    public static int i(List list) {
        return list.size() * 4;
    }

    public static int j(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(size * 8) : size * AbstractC3664k.o(i10, 0L);
    }

    public static int k(List list) {
        return list.size() * 8;
    }

    public static int l(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += AbstractC3664k.s(i10, (Q) list.get(i11), f0Var);
        }
        return iS;
    }

    public static int m(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iN) : iN + (size * AbstractC3664k.N(i10));
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3677y)) {
            int iV = 0;
            while (i10 < size) {
                iV += AbstractC3664k.v(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iV;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iV2 = 0;
        while (i10 < size) {
            iV2 += AbstractC3664k.v(abstractC3677y.getInt(i10));
            i10++;
        }
        return iV2;
    }

    public static int o(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iP = p(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iP) : iP + (list.size() * AbstractC3664k.N(i10));
    }

    public static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof H)) {
            int iX = 0;
            while (i10 < size) {
                iX += AbstractC3664k.x(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iX;
        }
        H h10 = (H) list;
        int iX2 = 0;
        while (i10 < size) {
            iX2 += AbstractC3664k.x(h10.getLong(i10));
            i10++;
        }
        return iX2;
    }

    public static int q(int i10, Object obj, f0 f0Var) {
        return obj instanceof D ? AbstractC3664k.y(i10, (D) obj) : a(i10, (AbstractC3654a) obj, f0Var);
    }

    public static int r(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = AbstractC3664k.N(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iN += obj instanceof D ? AbstractC3664k.z((D) obj) : b((AbstractC3654a) obj, f0Var);
        }
        return iN;
    }

    public static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iT) : iT + (size * AbstractC3664k.N(i10));
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3677y)) {
            int I10 = 0;
            while (i10 < size) {
                I10 += AbstractC3664k.I(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return I10;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int I11 = 0;
        while (i10 < size) {
            I11 += AbstractC3664k.I(abstractC3677y.getInt(i10));
            i10++;
        }
        return I11;
    }

    public static int u(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = v(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iV) : iV + (size * AbstractC3664k.N(i10));
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof H)) {
            int iK = 0;
            while (i10 < size) {
                iK += AbstractC3664k.K(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iK;
        }
        H h10 = (H) list;
        int iK2 = 0;
        while (i10 < size) {
            iK2 += AbstractC3664k.K(h10.getLong(i10));
            i10++;
        }
        return iK2;
    }

    public static int w(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = AbstractC3664k.N(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iN += obj instanceof AbstractC3661h ? AbstractC3664k.h((AbstractC3661h) obj) : AbstractC3664k.M((String) obj);
        }
        return iN;
    }

    public static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iY) : iY + (size * AbstractC3664k.N(i10));
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3677y)) {
            int iP = 0;
            while (i10 < size) {
                iP += AbstractC3664k.P(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iP;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iP2 = 0;
        while (i10 < size) {
            iP2 += AbstractC3664k.P(abstractC3677y.getInt(i10));
            i10++;
        }
        return iP2;
    }

    public static int z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = A(list);
        return z10 ? AbstractC3664k.N(i10) + AbstractC3664k.A(iA) : iA + (size * AbstractC3664k.N(i10));
    }
}
