package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2714u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f22767a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f22768b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f22769c = new i0();

    public static Class A() {
        if (V.f22756d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static g0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (g0) clsC.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        if (V.f22756d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC2708n abstractC2708n, Object obj, Object obj2) {
        C2711q c2711qC = abstractC2708n.c(obj2);
        if (c2711qC.k()) {
            return;
        }
        abstractC2708n.d(obj).r(c2711qC);
    }

    public static void E(F f10, Object obj, Object obj2, long j10) {
        j0.O(obj, j10, f10.a(j0.z(obj, j10), j0.z(obj2, j10)));
    }

    public static void F(g0 g0Var, Object obj, Object obj2) {
        g0Var.p(obj, g0Var.k(g0Var.g(obj), g0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC2713t.class.isAssignableFrom(cls) && !V.f22756d && (cls2 = f22767a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object I(Object obj, int i10, int i11, Object obj2, g0 g0Var) {
        if (obj2 == null) {
            obj2 = g0Var.f(obj);
        }
        g0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static g0 J() {
        return f22768b;
    }

    public static g0 K() {
        return f22769c;
    }

    public static void L(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.A(i10, list, z10);
    }

    public static void M(int i10, List list, m0 m0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.I(i10, list);
    }

    public static void N(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.G(i10, list, z10);
    }

    public static void O(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.n(i10, list, z10);
    }

    public static void P(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.j(i10, list, z10);
    }

    public static void Q(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.y(i10, list, z10);
    }

    public static void R(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.a(i10, list, z10);
    }

    public static void S(int i10, List list, m0 m0Var, Z z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.J(i10, list, z10);
    }

    public static void T(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.g(i10, list, z10);
    }

    public static void U(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.F(i10, list, z10);
    }

    public static void V(int i10, List list, m0 m0Var, Z z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.O(i10, list, z10);
    }

    public static void W(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.z(i10, list, z10);
    }

    public static void X(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.q(i10, list, z10);
    }

    public static void Y(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.D(i10, list, z10);
    }

    public static void Z(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.l(i10, list, z10);
    }

    public static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(size) : size * AbstractC2703i.d(i10, true);
    }

    public static void a0(int i10, List list, m0 m0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.d(i10, list);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.k(i10, list, z10);
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = size * AbstractC2703i.R(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iR += AbstractC2703i.h((AbstractC2700f) list.get(i11));
        }
        return iR;
    }

    public static void c0(int i10, List list, m0 m0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.r(i10, list, z10);
    }

    public static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iE) : iE + (size * AbstractC2703i.R(i10));
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iL += AbstractC2703i.l(((Integer) list.get(i10)).intValue());
        }
        return iL;
    }

    public static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(size * 4) : size * AbstractC2703i.m(i10, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(size * 8) : size * AbstractC2703i.o(i10, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, Z z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += AbstractC2703i.s(i10, (K) list.get(i11), z10);
        }
        return iS;
    }

    public static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iL) : iL + (size * AbstractC2703i.R(i10));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iW += AbstractC2703i.w(((Integer) list.get(i10)).intValue());
        }
        return iW;
    }

    public static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iN) : iN + (list.size() * AbstractC2703i.R(i10));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iY += AbstractC2703i.y(((Long) list.get(i10)).longValue());
        }
        return iY;
    }

    public static int o(int i10, Object obj, Z z10) {
        return obj instanceof C2718y ? AbstractC2703i.z(i10, (C2718y) obj) : AbstractC2703i.C(i10, (K) obj, z10);
    }

    public static int p(int i10, List list, Z z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = AbstractC2703i.R(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iR += obj instanceof C2718y ? AbstractC2703i.A((C2718y) obj) : AbstractC2703i.E((K) obj, z10);
        }
        return iR;
    }

    public static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iR) : iR + (size * AbstractC2703i.R(i10));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM += AbstractC2703i.M(((Integer) list.get(i10)).intValue());
        }
        return iM;
    }

    public static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iT) : iT + (size * AbstractC2703i.R(i10));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iO += AbstractC2703i.O(((Long) list.get(i10)).longValue());
        }
        return iO;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = AbstractC2703i.R(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iR += obj instanceof AbstractC2700f ? AbstractC2703i.h((AbstractC2700f) obj) : AbstractC2703i.Q((String) obj);
        }
        return iR;
    }

    public static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iW) : iW + (size * AbstractC2703i.R(i10));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iT += AbstractC2703i.T(((Integer) list.get(i10)).intValue());
        }
        return iT;
    }

    public static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? AbstractC2703i.R(i10) + AbstractC2703i.B(iY) : iY + (size * AbstractC2703i.R(i10));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += AbstractC2703i.V(((Long) list.get(i10)).longValue());
        }
        return iV;
    }

    public static Object z(Object obj, int i10, List list, AbstractC2714u.a aVar, Object obj2, g0 g0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.isInRange(iIntValue)) {
                    obj2 = I(obj, i10, iIntValue, obj2, g0Var);
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
            if (aVar.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, iIntValue2, obj2, g0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
