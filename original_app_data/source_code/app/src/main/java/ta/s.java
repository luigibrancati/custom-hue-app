package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f44888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f44889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f44890e;

    public s(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5) {
        this.f44886a = aVar;
        this.f44887b = aVar2;
        this.f44888c = aVar3;
        this.f44889d = aVar4;
        this.f44890e = aVar5;
    }

    public static s a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r c(F f10, Eb.k kVar, Eb.k kVar2, w wVar, Eb.q qVar) {
        return new r(f10, kVar, kVar2, wVar, qVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((F) this.f44886a.get(), (Eb.k) this.f44887b.get(), (Eb.k) this.f44888c.get(), (w) this.f44889d.get(), (Eb.q) this.f44890e.get());
    }
}
