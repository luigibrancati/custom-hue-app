package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f39777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Cc.d[] f39778b;

    static {
        N n10 = null;
        try {
            n10 = (N) Fc.G.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (n10 == null) {
            n10 = new N();
        }
        f39777a = n10;
        f39778b = new Cc.d[0];
    }

    public static Cc.h a(AbstractC4859p abstractC4859p) {
        return f39777a.a(abstractC4859p);
    }

    public static Cc.d b(Class cls) {
        return f39777a.b(cls);
    }

    public static Cc.g c(Class cls) {
        return f39777a.c(cls, "");
    }

    public static Cc.g d(Class cls, String str) {
        return f39777a.c(cls, str);
    }

    public static Cc.j e(x xVar) {
        return f39777a.d(xVar);
    }

    public static Cc.m f(B b10) {
        return f39777a.e(b10);
    }

    public static Cc.n g(D d10) {
        return f39777a.f(d10);
    }

    public static Cc.o h(F f10) {
        return f39777a.g(f10);
    }

    public static String i(InterfaceC4858o interfaceC4858o) {
        return f39777a.h(interfaceC4858o);
    }

    public static String j(v vVar) {
        return f39777a.i(vVar);
    }
}
