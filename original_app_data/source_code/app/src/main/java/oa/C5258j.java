package oa;

/* JADX INFO: renamed from: oa.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5258j implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41431b;

    public C5258j(X3.a aVar, X3.a aVar2) {
        this.f41430a = aVar;
        this.f41431b = aVar2;
    }

    public static C5258j a(X3.a aVar, X3.a aVar2) {
        return new C5258j(aVar, aVar2);
    }

    public static qa.x c(Eb.q qVar, ka.S s10) {
        return (qa.x) W3.e.d(AbstractC5252d.f(qVar, s10));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qa.x get() {
        return c((Eb.q) this.f41430a.get(), (ka.S) this.f41431b.get());
    }
}
