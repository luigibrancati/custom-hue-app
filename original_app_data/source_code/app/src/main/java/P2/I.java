package P2;

import i2.InterfaceC4337q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12721a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12726f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.H f12722b = new G1.H(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12727g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12728h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12729i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.C f12723c = new G1.C();

    public I(int i10) {
        this.f12721a = i10;
    }

    public final int a(InterfaceC4337q interfaceC4337q) {
        this.f12723c.X(G1.M.f4267f);
        this.f12724d = true;
        interfaceC4337q.i();
        return 0;
    }

    public long b() {
        return this.f12729i;
    }

    public G1.H c() {
        return this.f12722b;
    }

    public boolean d() {
        return this.f12724d;
    }

    public int e(InterfaceC4337q interfaceC4337q, i2.I i10, int i11) {
        if (i11 <= 0) {
            return a(interfaceC4337q);
        }
        if (!this.f12726f) {
            return h(interfaceC4337q, i10, i11);
        }
        if (this.f12728h == -9223372036854775807L) {
            return a(interfaceC4337q);
        }
        if (!this.f12725e) {
            return f(interfaceC4337q, i10, i11);
        }
        long j10 = this.f12727g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC4337q);
        }
        this.f12729i = this.f12722b.c(this.f12728h) - this.f12722b.b(j10);
        return a(interfaceC4337q);
    }

    public final int f(InterfaceC4337q interfaceC4337q, i2.I i10, int i11) {
        int iMin = (int) Math.min(this.f12721a, interfaceC4337q.getLength());
        long j10 = 0;
        if (interfaceC4337q.getPosition() != j10) {
            i10.f36871a = j10;
            return 1;
        }
        this.f12723c.W(iMin);
        interfaceC4337q.i();
        interfaceC4337q.s(this.f12723c.f(), 0, iMin);
        this.f12727g = g(this.f12723c, i11);
        this.f12725e = true;
        return 0;
    }

    public final long g(G1.C c10, int i10) {
        int iJ = c10.j();
        for (int iG = c10.g(); iG < iJ; iG++) {
            if (c10.f()[iG] == 71) {
                long jC = M.c(c10, iG, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(InterfaceC4337q interfaceC4337q, i2.I i10, int i11) {
        long length = interfaceC4337q.getLength();
        int iMin = (int) Math.min(this.f12721a, length);
        long j10 = length - ((long) iMin);
        if (interfaceC4337q.getPosition() != j10) {
            i10.f36871a = j10;
            return 1;
        }
        this.f12723c.W(iMin);
        interfaceC4337q.i();
        interfaceC4337q.s(this.f12723c.f(), 0, iMin);
        this.f12728h = i(this.f12723c, i11);
        this.f12726f = true;
        return 0;
    }

    public final long i(G1.C c10, int i10) {
        int iG = c10.g();
        int iJ = c10.j();
        for (int i11 = iJ - 188; i11 >= iG; i11--) {
            if (M.b(c10.f(), iG, iJ, i11)) {
                long jC = M.c(c10, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }
}
