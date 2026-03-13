package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43849c;

    public C(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f43847a = aVar;
        this.f43848b = aVar2;
        this.f43849c = aVar3;
    }

    public static C a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new C(aVar, aVar2, aVar3);
    }

    public static C5684B c(ta.F f10, C5690f c5690f, x xVar) {
        return new C5684B(f10, c5690f, xVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5684B get() {
        return c((ta.F) this.f43847a.get(), (C5690f) this.f43848b.get(), (x) this.f43849c.get());
    }
}
