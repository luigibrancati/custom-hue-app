package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44865b;

    public k(X3.a aVar, X3.a aVar2) {
        this.f44864a = aVar;
        this.f44865b = aVar2;
    }

    public static k a(X3.a aVar, X3.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j c(n nVar, String[][] strArr) {
        return new j(nVar, strArr);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((n) this.f44864a.get(), (String[][]) this.f44865b.get());
    }
}
