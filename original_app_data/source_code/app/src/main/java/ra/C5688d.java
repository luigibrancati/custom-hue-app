package ra;

/* JADX INFO: renamed from: ra.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5688d implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f43875d;

    public C5688d(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f43872a = aVar;
        this.f43873b = aVar2;
        this.f43874c = aVar3;
        this.f43875d = aVar4;
    }

    public static C5688d a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new C5688d(aVar, aVar2, aVar3, aVar4);
    }

    public static C5687c c(ta.F f10, C5685a c5685a, C5690f c5690f, h hVar) {
        return new C5687c(f10, c5685a, c5690f, hVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5687c get() {
        return c((ta.F) this.f43872a.get(), (C5685a) this.f43873b.get(), (C5690f) this.f43874c.get(), (h) this.f43875d.get());
    }
}
