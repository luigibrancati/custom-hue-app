package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f44833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f44834d;

    public C(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f44831a = aVar;
        this.f44832b = aVar2;
        this.f44833c = aVar3;
        this.f44834d = aVar4;
    }

    public static C a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new C(aVar, aVar2, aVar3, aVar4);
    }

    public static B c(l lVar, p pVar, boolean z10, boolean z11) {
        return new B(lVar, pVar, z10, z11);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public B get() {
        return c((l) this.f44831a.get(), (p) this.f44832b.get(), ((Boolean) this.f44833c.get()).booleanValue(), ((Boolean) this.f44834d.get()).booleanValue());
    }
}
