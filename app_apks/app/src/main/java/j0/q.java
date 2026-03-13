package j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f38918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vc.l f38921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f38922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f38923l;

    public q(e eVar, vc.l lVar, boolean z10, boolean z11) {
        vc.l lVarC;
        super(m.f38897b, h.f38880e.a(), null);
        this.f38918g = eVar;
        this.f38919h = z10;
        this.f38920i = z11;
        this.f38921j = m.l(lVar, (eVar == null || (lVarC = eVar.c()) == null) ? m.f38906k.c() : lVarC, z10);
        this.f38922k = i0.h.a();
        this.f38923l = this;
    }

    @Override // j0.e
    public void a() {
        e eVar;
        h(true);
        if (!this.f38920i || (eVar = this.f38918g) == null) {
            return;
        }
        eVar.a();
    }

    @Override // j0.e
    public h b() {
        return i().b();
    }

    public final e i() {
        e eVar = this.f38918g;
        return eVar == null ? m.f38906k : eVar;
    }

    @Override // j0.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public vc.l c() {
        return this.f38921j;
    }

    public final long k() {
        return this.f38922k;
    }

    public void l(vc.l lVar) {
        this.f38921j = lVar;
    }
}
