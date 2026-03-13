package kotlin.jvm.internal;

import fc.InterfaceC4023f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import vc.InterfaceC6082a;
import vc.InterfaceC6083b;
import vc.InterfaceC6084c;
import vc.InterfaceC6085d;
import vc.InterfaceC6086e;
import vc.InterfaceC6087f;
import vc.InterfaceC6088g;
import vc.InterfaceC6089h;
import vc.InterfaceC6090i;
import vc.InterfaceC6091j;
import wc.InterfaceC6184a;
import wc.InterfaceC6185b;
import wc.InterfaceC6186c;
import wc.InterfaceC6187d;
import wc.InterfaceC6188e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class T {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC6184a) && !(obj instanceof InterfaceC6185b)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC6184a) && !(obj instanceof InterfaceC6186c)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC6184a) && !(obj instanceof InterfaceC6187d)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Map.Entry d(Object obj) {
        if ((obj instanceof InterfaceC6184a) && !(obj instanceof InterfaceC6187d.a)) {
            p(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return j(obj);
    }

    public static Set e(Object obj) {
        if ((obj instanceof InterfaceC6184a) && !(obj instanceof InterfaceC6188e)) {
            p(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i10) {
        if (obj != null && !m(obj, i10)) {
            p(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Map.Entry j(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Set k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof InterfaceC4858o) {
            return ((InterfaceC4858o) obj).getArity();
        }
        if (obj instanceof InterfaceC6082a) {
            return 0;
        }
        if (obj instanceof vc.l) {
            return 1;
        }
        if (obj instanceof vc.p) {
            return 2;
        }
        if (obj instanceof vc.q) {
            return 3;
        }
        if (obj instanceof vc.r) {
            return 4;
        }
        if (obj instanceof vc.s) {
            return 5;
        }
        if (obj instanceof vc.t) {
            return 6;
        }
        if (obj instanceof vc.u) {
            return 7;
        }
        if (obj instanceof vc.v) {
            return 8;
        }
        if (obj instanceof vc.w) {
            return 9;
        }
        if (obj instanceof InterfaceC6083b) {
            return 10;
        }
        if (obj instanceof InterfaceC6084c) {
            return 11;
        }
        if (obj instanceof InterfaceC6085d) {
            return 12;
        }
        if (obj instanceof InterfaceC6086e) {
            return 13;
        }
        if (obj instanceof InterfaceC6087f) {
            return 14;
        }
        if (obj instanceof InterfaceC6088g) {
            return 15;
        }
        if (obj instanceof InterfaceC6089h) {
            return 16;
        }
        if (obj instanceof InterfaceC6090i) {
            return 17;
        }
        if (obj instanceof InterfaceC6091j) {
            return 18;
        }
        if (obj instanceof vc.k) {
            return 19;
        }
        if (obj instanceof vc.m) {
            return 20;
        }
        if (obj instanceof vc.n) {
            return 21;
        }
        return obj instanceof vc.o ? 22 : -1;
    }

    public static boolean m(Object obj, int i10) {
        return (obj instanceof InterfaceC4023f) && l(obj) == i10;
    }

    public static Throwable n(Throwable th) {
        return AbstractC4862t.j(th, T.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        q((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
