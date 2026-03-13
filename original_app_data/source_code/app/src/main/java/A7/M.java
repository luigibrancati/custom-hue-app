package A7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0679c f178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f181d;

    public M(N n10, AbstractC0679c abstractC0679c, int i10, int i11) {
        this.f181d = n10;
        this.f178a = abstractC0679c;
        this.f179b = i10;
        this.f180c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n10 = this.f181d;
        AbstractC0679c abstractC0679c = this.f178a;
        n10.j(new C0681e(abstractC0679c.d(), this.f179b, this.f180c, abstractC0679c.a(), abstractC0679c.f(), abstractC0679c.h(), abstractC0679c.g(), abstractC0679c.c(), abstractC0679c.i()));
    }
}
