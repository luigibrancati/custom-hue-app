package oa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class K implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f41342d;

    public K(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f41339a = aVar;
        this.f41340b = aVar2;
        this.f41341c = aVar3;
        this.f41342d = aVar4;
    }

    public static K a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new K(aVar, aVar2, aVar3, aVar4);
    }

    public static J c(sa.d dVar, Object obj, ka.N n10, qa.k kVar) {
        return new J(dVar, (L) obj, n10, kVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public J get() {
        return c((sa.d) this.f41339a.get(), this.f41340b.get(), (ka.N) this.f41341c.get(), (qa.k) this.f41342d.get());
    }
}
