package ma;

import qa.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f40238a;

    public h(X3.a aVar) {
        this.f40238a = aVar;
    }

    public static h a(X3.a aVar) {
        return new h(aVar);
    }

    public static x c(Eb.q qVar) {
        return (x) W3.e.d(c.e(qVar));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Eb.q) this.f40238a.get());
    }
}
