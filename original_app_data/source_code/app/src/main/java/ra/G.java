package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class G implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f43865d;

    public G(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f43862a = aVar;
        this.f43863b = aVar2;
        this.f43864c = aVar3;
        this.f43865d = aVar4;
    }

    public static G a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new G(aVar, aVar2, aVar3, aVar4);
    }

    public static F c(ta.F f10, C5690f c5690f, x xVar, C5685a c5685a) {
        return new F(f10, c5690f, xVar, c5685a);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public F get() {
        return c((ta.F) this.f43862a.get(), (C5690f) this.f43863b.get(), (x) this.f43864c.get(), (C5685a) this.f43865d.get());
    }
}
