package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44876b;

    public q(X3.a aVar, X3.a aVar2) {
        this.f44875a = aVar;
        this.f44876b = aVar2;
    }

    public static q a(X3.a aVar, X3.a aVar2) {
        return new q(aVar, aVar2);
    }

    public static p c(n nVar, String[][] strArr) {
        return new p(nVar, strArr);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c((n) this.f44875a.get(), (String[][]) this.f44876b.get());
    }
}
