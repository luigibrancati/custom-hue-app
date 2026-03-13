package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43895b;

    public s(X3.a aVar, X3.a aVar2) {
        this.f43894a = aVar;
        this.f43895b = aVar2;
    }

    public static s a(X3.a aVar, X3.a aVar2) {
        return new s(aVar, aVar2);
    }

    public static r c(ta.F f10, ta.w wVar) {
        return new r(f10, wVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((ta.F) this.f43894a.get(), (ta.w) this.f43895b.get());
    }
}
