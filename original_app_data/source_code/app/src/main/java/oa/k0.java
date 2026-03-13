package oa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f41458d;

    public k0(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f41455a = aVar;
        this.f41456b = aVar2;
        this.f41457c = aVar3;
        this.f41458d = aVar4;
    }

    public static k0 a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new k0(aVar, aVar2, aVar3, aVar4);
    }

    public static j0 c(Eb.q qVar, C5249a c5249a, Object obj, Object obj2) {
        return new j0(qVar, c5249a, (C5272y) obj, (Q) obj2);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0 get() {
        return c((Eb.q) this.f41455a.get(), (C5249a) this.f41456b.get(), this.f41457c.get(), this.f41458d.get());
    }
}
