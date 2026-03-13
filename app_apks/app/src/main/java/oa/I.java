package oa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class I implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41332a;

    public I(X3.a aVar) {
        this.f41332a = aVar;
    }

    public static I a(X3.a aVar) {
        return new I(aVar);
    }

    public static H c(C5247E c5247e) {
        return new H(c5247e);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public H get() {
        return c((C5247E) this.f41332a.get());
    }
}
