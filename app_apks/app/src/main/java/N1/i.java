package N1;

import i2.C4327g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4327g f9565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9566b;

    public i(C4327g c4327g, long j10) {
        this.f9565a = c4327g;
        this.f9566b = j10;
    }

    @Override // N1.g
    public long a(long j10, long j11) {
        return this.f9565a.f36989d[(int) j10];
    }

    @Override // N1.g
    public long b(long j10) {
        return this.f9565a.f36990e[(int) j10] - this.f9566b;
    }

    @Override // N1.g
    public long c(long j10, long j11) {
        return 0L;
    }

    @Override // N1.g
    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // N1.g
    public O1.i e(long j10) {
        return new O1.i(null, this.f9565a.f36988c[(int) j10], r6.f36987b[r7]);
    }

    @Override // N1.g
    public long f(long j10, long j11) {
        return this.f9565a.a(j10 + this.f9566b);
    }

    @Override // N1.g
    public long g(long j10) {
        return this.f9565a.f36986a;
    }

    @Override // N1.g
    public boolean h() {
        return true;
    }

    @Override // N1.g
    public long i() {
        return 0L;
    }

    @Override // N1.g
    public long j(long j10, long j11) {
        return this.f9565a.f36986a;
    }
}
