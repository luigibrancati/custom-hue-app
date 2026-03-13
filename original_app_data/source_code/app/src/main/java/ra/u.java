package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43901b;

    public u(X3.a aVar, X3.a aVar2) {
        this.f43900a = aVar;
        this.f43901b = aVar2;
    }

    public static u a(X3.a aVar, X3.a aVar2) {
        return new u(aVar, aVar2);
    }

    public static t c(r rVar, Eb.q qVar) {
        return new t(rVar, qVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((r) this.f43900a.get(), (Eb.q) this.f43901b.get());
    }
}
