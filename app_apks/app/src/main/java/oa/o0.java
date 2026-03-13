package oa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41478a;

    public o0(X3.a aVar) {
        this.f41478a = aVar;
    }

    public static o0 a(X3.a aVar) {
        return new o0(aVar);
    }

    public static n0 c(C5247E c5247e) {
        return new n0(c5247e);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c((C5247E) this.f41478a.get());
    }
}
