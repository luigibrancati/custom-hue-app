package oa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41346b;

    public M(X3.a aVar, X3.a aVar2) {
        this.f41345a = aVar;
        this.f41346b = aVar2;
    }

    public static M a(X3.a aVar, X3.a aVar2) {
        return new M(aVar, aVar2);
    }

    public static L c(ka.N n10, int i10) {
        return new L(n10, i10);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public L get() {
        return c((ka.N) this.f41345a.get(), ((Integer) this.f41346b.get()).intValue());
    }
}
