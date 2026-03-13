package j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f38912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f38913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f38914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vc.l f38915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public vc.l f38916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f38917t;

    public p(d dVar, vc.l lVar, vc.l lVar2, boolean z10, boolean z11) {
        vc.l lVarJ;
        vc.l lVarC;
        super(m.f38897b, h.f38880e.a(), m.l(lVar, (dVar == null || (lVarC = dVar.c()) == null) ? m.f38906k.c() : lVarC, z10), m.n(lVar2, (dVar == null || (lVarJ = dVar.j()) == null) ? m.f38906k.j() : lVarJ));
        this.f38912o = dVar;
        this.f38913p = z10;
        this.f38914q = z11;
        this.f38915r = super.c();
        this.f38916s = super.j();
        this.f38917t = i0.h.a();
    }

    @Override // j0.d, j0.e
    public void a() {
        d dVar;
        h(true);
        if (!this.f38914q || (dVar = this.f38912o) == null) {
            return;
        }
        dVar.a();
    }

    @Override // j0.e
    public h b() {
        return k().b();
    }

    @Override // j0.d, j0.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public vc.l c() {
        return this.f38915r;
    }

    @Override // j0.d
    public vc.l j() {
        return this.f38916s;
    }

    public final d k() {
        d dVar = this.f38912o;
        return dVar == null ? m.f38906k : dVar;
    }

    public final long l() {
        return this.f38917t;
    }

    public void m(vc.l lVar) {
        this.f38915r = lVar;
    }
}
