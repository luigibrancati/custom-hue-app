package o2;

import G1.AbstractC0853a;
import G1.C;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.r;
import i2.u;

/* JADX INFO: renamed from: o2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5199c implements InterfaceC4336p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f41122q = new u() { // from class: o2.b
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return C5199c.b();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f41128f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f41131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C5197a f41137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C5202f f41138p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f41123a = new C(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f41124b = new C(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f41125c = new C(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f41126d = new C();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5200d f41127e = new C5200d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41129g = 1;

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new C5199c()};
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f41129g = 1;
            this.f41130h = false;
        } else {
            this.f41129g = 3;
        }
        this.f41132j = 0;
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f41128f = rVar;
    }

    public final void d() {
        if (this.f41136n) {
            return;
        }
        this.f41128f.v(new J.b(-9223372036854775807L));
        this.f41136n = true;
    }

    public final long e() {
        if (this.f41130h) {
            return this.f41131i + this.f41135m;
        }
        if (this.f41127e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f41135m;
    }

    public final C g(InterfaceC4337q interfaceC4337q) {
        if (this.f41134l > this.f41126d.b()) {
            C c10 = this.f41126d;
            c10.Y(new byte[Math.max(c10.b() * 2, this.f41134l)], 0);
        } else {
            this.f41126d.a0(0);
        }
        this.f41126d.Z(this.f41134l);
        interfaceC4337q.readFully(this.f41126d.f(), 0, this.f41134l);
        return this.f41126d;
    }

    public final boolean h(InterfaceC4337q interfaceC4337q) {
        if (!interfaceC4337q.j(this.f41124b.f(), 0, 9, true)) {
            return false;
        }
        this.f41124b.a0(0);
        this.f41124b.b0(4);
        int iL = this.f41124b.L();
        boolean z10 = (iL & 4) != 0;
        boolean z11 = (iL & 1) != 0;
        if (z10 && this.f41137o == null) {
            this.f41137o = new C5197a(this.f41128f.f(8, 1));
        }
        if (z11 && this.f41138p == null) {
            this.f41138p = new C5202f(this.f41128f.f(9, 2));
        }
        this.f41128f.n();
        this.f41132j = this.f41124b.u() - 5;
        this.f41129g = 2;
        return true;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        AbstractC0853a.i(this.f41128f);
        while (true) {
            int i11 = this.f41129g;
            if (i11 != 1) {
                if (i11 == 2) {
                    n(interfaceC4337q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(interfaceC4337q)) {
                        return 0;
                    }
                } else if (!m(interfaceC4337q)) {
                    return -1;
                }
            } else if (!h(interfaceC4337q)) {
                return -1;
            }
        }
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.s(this.f41123a.f(), 0, 3);
        this.f41123a.a0(0);
        if (this.f41123a.O() != 4607062) {
            return false;
        }
        interfaceC4337q.s(this.f41123a.f(), 0, 2);
        this.f41123a.a0(0);
        if ((this.f41123a.T() & 250) != 0) {
            return false;
        }
        interfaceC4337q.s(this.f41123a.f(), 0, 4);
        this.f41123a.a0(0);
        int iU = this.f41123a.u();
        interfaceC4337q.i();
        interfaceC4337q.o(iU);
        interfaceC4337q.s(this.f41123a.f(), 0, 4);
        this.f41123a.a0(0);
        return this.f41123a.u() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(i2.InterfaceC4337q r10) {
        /*
            r9 = this;
            long r0 = r9.e()
            int r2 = r9.f41133k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            o2.a r3 = r9.f41137o
            if (r3 == 0) goto L23
            r9.d()
            o2.a r2 = r9.f41137o
            G1.C r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            o2.f r3 = r9.f41138p
            if (r3 == 0) goto L39
            r9.d()
            o2.f r2 = r9.f41138p
            G1.C r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f41136n
            if (r2 != 0) goto L6e
            o2.d r2 = r9.f41127e
            G1.C r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            o2.d r0 = r9.f41127e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            i2.r r2 = r9.f41128f
            i2.E r3 = new i2.E
            o2.d r7 = r9.f41127e
            long[] r7 = r7.e()
            o2.d r8 = r9.f41127e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.v(r3)
            r9.f41136n = r6
            goto L21
        L6e:
            int r0 = r9.f41134l
            r10.q(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f41130h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f41130h = r6
            o2.d r10 = r9.f41127e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f41135m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f41131i = r1
        L8f:
            r10 = 4
            r9.f41132j = r10
            r10 = 2
            r9.f41129g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.C5199c.l(i2.q):boolean");
    }

    public final boolean m(InterfaceC4337q interfaceC4337q) {
        if (!interfaceC4337q.j(this.f41125c.f(), 0, 11, true)) {
            return false;
        }
        this.f41125c.a0(0);
        this.f41133k = this.f41125c.L();
        this.f41134l = this.f41125c.O();
        this.f41135m = this.f41125c.O();
        this.f41135m = (((long) (this.f41125c.L() << 24)) | this.f41135m) * 1000;
        this.f41125c.b0(3);
        this.f41129g = 4;
        return true;
    }

    public final void n(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.q(this.f41132j);
        this.f41132j = 0;
        this.f41129g = 3;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
