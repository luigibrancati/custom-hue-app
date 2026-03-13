package N6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G1 extends C1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H1 f9738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1382kb f9739d;

    public G1(H1 h12, C1382kb c1382kb) {
        this.f9738c = h12;
        this.f9739d = c1382kb;
    }

    @Override // N6.C1
    public final /* bridge */ /* synthetic */ Object a() {
        return this.f9739d.a();
    }

    @Override // N6.C1
    public final String b() {
        return this.f9739d.toString();
    }

    @Override // N6.C1
    public final void c(Throwable th) {
        this.f9738c.p(th);
    }

    @Override // N6.C1
    public final /* synthetic */ void d(Object obj) {
        this.f9738c.q((E1) obj);
    }

    @Override // N6.C1
    public final boolean f() {
        return this.f9738c.isDone();
    }
}
