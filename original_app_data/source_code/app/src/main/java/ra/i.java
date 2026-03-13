package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43883a;

    public i(X3.a aVar) {
        this.f43883a = aVar;
    }

    public static i a(X3.a aVar) {
        return new i(aVar);
    }

    public static h c(ma.o oVar) {
        return new h(oVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c((ma.o) this.f43883a.get());
    }
}
