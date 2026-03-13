package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f43857d;

    public E(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f43854a = aVar;
        this.f43855b = aVar2;
        this.f43856c = aVar3;
        this.f43857d = aVar4;
    }

    public static E a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new E(aVar, aVar2, aVar3, aVar4);
    }

    public static D c(ta.F f10, C5690f c5690f, x xVar, C5685a c5685a) {
        return new D(f10, c5690f, xVar, c5685a);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public D get() {
        return c((ta.F) this.f43854a.get(), (C5690f) this.f43855b.get(), (x) this.f43856c.get(), (C5685a) this.f43857d.get());
    }
}
