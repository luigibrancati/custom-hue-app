package Rd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0 f15153a = new X0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f15154b = Wd.O.a(new Wd.E("ThreadLocalEventLoop"));

    public final AbstractC2135j0 a() {
        return (AbstractC2135j0) f15154b.get();
    }

    public final AbstractC2135j0 b() {
        ThreadLocal threadLocal = f15154b;
        AbstractC2135j0 abstractC2135j0 = (AbstractC2135j0) threadLocal.get();
        if (abstractC2135j0 != null) {
            return abstractC2135j0;
        }
        AbstractC2135j0 abstractC2135j0A = AbstractC2141m0.a();
        threadLocal.set(abstractC2135j0A);
        return abstractC2135j0A;
    }

    public final void c() {
        f15154b.set(null);
    }

    public final void d(AbstractC2135j0 abstractC2135j0) {
        f15154b.set(abstractC2135j0);
    }
}
