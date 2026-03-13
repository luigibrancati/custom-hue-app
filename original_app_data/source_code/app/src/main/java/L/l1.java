package L;

import E.B0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements E.B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E.B0 f8128e;

    public l1(long j10, E.B0 b02) {
        X0.h.b(j10 >= 0, "Timeout must be non-negative.");
        this.f8127d = j10;
        this.f8128e = b02;
    }

    @Override // E.B0
    public long a() {
        return this.f8127d;
    }

    @Override // E.B0
    public B0.c d(B0.b bVar) {
        B0.c cVarD = this.f8128e.d(bVar);
        return (a() <= 0 || bVar.b() < a() - cVarD.b()) ? cVarD : B0.c.f2715d;
    }
}
