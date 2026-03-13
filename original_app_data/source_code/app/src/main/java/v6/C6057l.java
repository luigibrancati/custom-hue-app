package v6;

/* JADX INFO: renamed from: v6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6057l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C6057l f45866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6058m f45867c = new C6058m(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C6058m f45868a;

    public static synchronized C6057l b() {
        try {
            if (f45866b == null) {
                f45866b = new C6057l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f45866b;
    }

    public C6058m a() {
        return this.f45868a;
    }

    public final synchronized void c(C6058m c6058m) {
        if (c6058m == null) {
            this.f45868a = f45867c;
            return;
        }
        C6058m c6058m2 = this.f45868a;
        if (c6058m2 == null || c6058m2.k() < c6058m.k()) {
            this.f45868a = c6058m;
        }
    }
}
