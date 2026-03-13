package N6;

/* JADX INFO: renamed from: N6.mb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1408mb implements InterfaceC1475s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumC1249a8 f10367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f10368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1460qb f10369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f10370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1421nb f10371e;

    public C1408mb(C1421nb c1421nb, EnumC1249a8 enumC1249a8, float f10, AbstractC1460qb abstractC1460qb, float f11) {
        this.f10367a = enumC1249a8;
        this.f10368b = f10;
        this.f10369c = abstractC1460qb;
        this.f10370d = f11;
        this.f10371e = c1421nb;
    }

    @Override // N6.InterfaceC1475s1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Float f10 = (Float) obj;
        if (f10.floatValue() >= 1.0f) {
            C1421nb.g(this.f10371e, f10.floatValue());
            this.f10371e.q(this.f10367a, this.f10368b, f10.floatValue(), this.f10369c);
        }
        this.f10371e.f10388b.set(false);
    }

    @Override // N6.InterfaceC1475s1
    public final void b(Throwable th) {
        C1421nb.f10386s.h("AutoZoom", "Unable to set zoom to " + this.f10370d, th);
        this.f10371e.f10388b.set(false);
    }
}
