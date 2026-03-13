package ta;

/* JADX INFO: renamed from: ta.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5862A implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f44824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f44825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f44826e;

    public C5862A(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5) {
        this.f44822a = aVar;
        this.f44823b = aVar2;
        this.f44824c = aVar3;
        this.f44825d = aVar4;
        this.f44826e = aVar5;
    }

    public static C5862A a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5) {
        return new C5862A(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static z c(l lVar, p pVar, int i10, int i11, boolean z10) {
        return new z(lVar, pVar, i10, i11, z10);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c((l) this.f44822a.get(), (p) this.f44823b.get(), ((Integer) this.f44824c.get()).intValue(), ((Integer) this.f44825d.get()).intValue(), ((Boolean) this.f44826e.get()).booleanValue());
    }
}
