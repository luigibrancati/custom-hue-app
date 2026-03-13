package N6;

/* JADX INFO: renamed from: N6.pb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1447pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1447pb f10422a;

    static {
        m().l();
        AbstractC1434ob abstractC1434obM = m();
        abstractC1434obM.h(false);
        f10422a = abstractC1434obM.l();
    }

    public static AbstractC1434ob m() {
        C1330gb c1330gb = new C1330gb();
        c1330gb.m(10);
        c1330gb.e(5);
        c1330gb.f(0.25f);
        c1330gb.d(0.8f);
        c1330gb.h(true);
        c1330gb.c(0.5f);
        c1330gb.b(0.8f);
        c1330gb.j(1500L);
        c1330gb.g(3000L);
        c1330gb.a(true);
        c1330gb.i(0.1f);
        c1330gb.k(0.05f);
        return c1330gb;
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract float e();

    public abstract float f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract long j();

    public abstract boolean k();

    public abstract boolean l();
}
