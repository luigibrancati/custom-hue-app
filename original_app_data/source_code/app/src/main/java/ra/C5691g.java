package ra;

import ta.H;

/* JADX INFO: renamed from: ra.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5691g implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43881b;

    public C5691g(X3.a aVar, X3.a aVar2) {
        this.f43880a = aVar;
        this.f43881b = aVar2;
    }

    public static C5691g a(X3.a aVar, X3.a aVar2) {
        return new C5691g(aVar, aVar2);
    }

    public static C5690f c(H h10, j jVar) {
        return new C5690f(h10, jVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5690f get() {
        return c((H) this.f43880a.get(), (j) this.f43881b.get());
    }
}
