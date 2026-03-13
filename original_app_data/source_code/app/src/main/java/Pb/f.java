package Pb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends Eb.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ze.a f13259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.e f13260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13263f;

    public f(Ze.a aVar, Jb.e eVar, boolean z10, int i10, int i11) {
        this.f13259b = aVar;
        this.f13260c = eVar;
        this.f13261d = z10;
        this.f13262e = i10;
        this.f13263f = i11;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        if (j.a(this.f13259b, bVar, this.f13260c)) {
            return;
        }
        this.f13259b.a(e.k(bVar, this.f13260c, this.f13261d, this.f13262e, this.f13263f));
    }
}
