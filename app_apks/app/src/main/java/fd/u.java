package fd;

import fd.q;
import java.io.IOException;
import md.AbstractC5047a;
import md.AbstractC5048b;
import md.AbstractC5050d;
import md.C5051e;
import md.C5052f;
import md.C5053g;
import md.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends i.d implements md.q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f34710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static md.r f34711n = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f34716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f34718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f34720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34721l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u c(C5051e c5051e, C5053g c5053g) {
            return new u(c5051e, c5053g);
        }
    }

    static {
        u uVar = new u(true);
        f34710m = uVar;
        uVar.R();
    }

    public static u C() {
        return f34710m;
    }

    private void R() {
        this.f34714e = 0;
        this.f34715f = 0;
        this.f34716g = q.S();
        this.f34717h = 0;
        this.f34718i = q.S();
        this.f34719j = 0;
    }

    public static b S() {
        return b.w();
    }

    public static b T(u uVar) {
        return S().m(uVar);
    }

    @Override // md.q
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public u getDefaultInstanceForType() {
        return f34710m;
    }

    public int E() {
        return this.f34714e;
    }

    public int F() {
        return this.f34715f;
    }

    public q G() {
        return this.f34716g;
    }

    public int I() {
        return this.f34717h;
    }

    public q J() {
        return this.f34718i;
    }

    public int K() {
        return this.f34719j;
    }

    public boolean L() {
        return (this.f34713d & 1) == 1;
    }

    public boolean M() {
        return (this.f34713d & 2) == 2;
    }

    public boolean N() {
        return (this.f34713d & 4) == 4;
    }

    public boolean O() {
        return (this.f34713d & 8) == 8;
    }

    public boolean P() {
        return (this.f34713d & 16) == 16;
    }

    public boolean Q() {
        return (this.f34713d & 32) == 32;
    }

    @Override // md.p
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return S();
    }

    @Override // md.p
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return T(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34713d & 1) == 1) {
            c5052f.Z(1, this.f34714e);
        }
        if ((this.f34713d & 2) == 2) {
            c5052f.Z(2, this.f34715f);
        }
        if ((this.f34713d & 4) == 4) {
            c5052f.c0(3, this.f34716g);
        }
        if ((this.f34713d & 16) == 16) {
            c5052f.c0(4, this.f34718i);
        }
        if ((this.f34713d & 8) == 8) {
            c5052f.Z(5, this.f34717h);
        }
        if ((this.f34713d & 32) == 32) {
            c5052f.Z(6, this.f34719j);
        }
        aVarS.a(200, c5052f);
        c5052f.h0(this.f34712c);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34721l;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34713d & 1) == 1 ? C5052f.o(1, this.f34714e) : 0;
        if ((this.f34713d & 2) == 2) {
            iO += C5052f.o(2, this.f34715f);
        }
        if ((this.f34713d & 4) == 4) {
            iO += C5052f.r(3, this.f34716g);
        }
        if ((this.f34713d & 16) == 16) {
            iO += C5052f.r(4, this.f34718i);
        }
        if ((this.f34713d & 8) == 8) {
            iO += C5052f.o(5, this.f34717h);
        }
        if ((this.f34713d & 32) == 32) {
            iO += C5052f.o(6, this.f34719j);
        }
        int iN = iO + n() + this.f34712c.size();
        this.f34721l = iN;
        return iN;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34720k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!M()) {
            this.f34720k = (byte) 0;
            return false;
        }
        if (N() && !G().isInitialized()) {
            this.f34720k = (byte) 0;
            return false;
        }
        if (P() && !J().isInitialized()) {
            this.f34720k = (byte) 0;
            return false;
        }
        if (m()) {
            this.f34720k = (byte) 1;
            return true;
        }
        this.f34720k = (byte) 0;
        return false;
    }

    public u(i.c cVar) {
        super(cVar);
        this.f34720k = (byte) -1;
        this.f34721l = -1;
        this.f34712c = cVar.j();
    }

    public u(boolean z10) {
        this.f34720k = (byte) -1;
        this.f34721l = -1;
        this.f34712c = AbstractC5050d.f40294a;
    }

    public u(C5051e c5051e, C5053g c5053g) {
        q.c builder;
        this.f34720k = (byte) -1;
        this.f34721l = -1;
        R();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f34713d |= 1;
                            this.f34714e = c5051e.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                builder = (this.f34713d & 4) == 4 ? this.f34716g.toBuilder() : null;
                                q qVar = (q) c5051e.t(q.f34607v, c5053g);
                                this.f34716g = qVar;
                                if (builder != null) {
                                    builder.m(qVar);
                                    this.f34716g = builder.u();
                                }
                                this.f34713d |= 4;
                            } else if (iJ == 34) {
                                builder = (this.f34713d & 16) == 16 ? this.f34718i.toBuilder() : null;
                                q qVar2 = (q) c5051e.t(q.f34607v, c5053g);
                                this.f34718i = qVar2;
                                if (builder != null) {
                                    builder.m(qVar2);
                                    this.f34718i = builder.u();
                                }
                                this.f34713d |= 16;
                            } else if (iJ == 40) {
                                this.f34713d |= 8;
                                this.f34717h = c5051e.r();
                            } else if (iJ != 48) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                this.f34713d |= 32;
                                this.f34719j = c5051e.r();
                            }
                        } else {
                            this.f34713d |= 2;
                            this.f34715f = c5051e.r();
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34712c = bVarT.f();
                    throw th2;
                }
                this.f34712c = bVarT.f();
                g();
                throw th;
            }
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34712c = bVarT.f();
            throw th3;
        }
        this.f34712c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34724f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34726h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f34728j;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public q f34725g = q.S();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q f34727i = q.S();

        public b() {
            x();
        }

        public static b w() {
            return new b();
        }

        public b A(q qVar) {
            if ((this.f34722d & 4) != 4 || this.f34725g == q.S()) {
                this.f34725g = qVar;
            } else {
                this.f34725g = q.t0(this.f34725g).m(qVar).u();
            }
            this.f34722d |= 4;
            return this;
        }

        public b B(q qVar) {
            if ((this.f34722d & 16) != 16 || this.f34727i == q.S()) {
                this.f34727i = qVar;
            } else {
                this.f34727i = q.t0(this.f34727i).m(qVar).u();
            }
            this.f34722d |= 16;
            return this;
        }

        public b C(int i10) {
            this.f34722d |= 1;
            this.f34723e = i10;
            return this;
        }

        public b D(int i10) {
            this.f34722d |= 2;
            this.f34724f = i10;
            return this;
        }

        public b E(int i10) {
            this.f34722d |= 8;
            this.f34726h = i10;
            return this;
        }

        public b F(int i10) {
            this.f34722d |= 32;
            this.f34728j = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public u build() {
            u uVarU = u();
            if (uVarU.isInitialized()) {
                return uVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(uVarU);
        }

        public u u() {
            u uVar = new u(this);
            int i10 = this.f34722d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            uVar.f34714e = this.f34723e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            uVar.f34715f = this.f34724f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            uVar.f34716g = this.f34725g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            uVar.f34717h = this.f34726h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            uVar.f34718i = this.f34727i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            uVar.f34719j = this.f34728j;
            uVar.f34713d = i11;
            return uVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b m(u uVar) {
            if (uVar == u.C()) {
                return this;
            }
            if (uVar.L()) {
                C(uVar.E());
            }
            if (uVar.M()) {
                D(uVar.F());
            }
            if (uVar.N()) {
                A(uVar.G());
            }
            if (uVar.O()) {
                E(uVar.I());
            }
            if (uVar.P()) {
                B(uVar.J());
            }
            if (uVar.Q()) {
                F(uVar.K());
            }
            r(uVar);
            n(j().d(uVar.f34712c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.u.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.u.f34711n     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.u r3 = (fd.u) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                md.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                fd.u r4 = (fd.u) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.u.b.v0(md.e, md.g):fd.u$b");
        }

        private void x() {
        }
    }
}
