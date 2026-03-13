package fd;

import java.io.IOException;
import md.AbstractC5047a;
import md.AbstractC5048b;
import md.AbstractC5050d;
import md.C5051e;
import md.C5052f;
import md.C5053g;
import md.i;
import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends md.i implements md.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f34729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static md.r f34730m = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f34735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f34738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f34739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34740k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public v c(C5051e c5051e, C5053g c5053g) {
            return new v(c5051e, c5053g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements j.b {
            @Override // md.j.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c findValueByNumber(int i10) {
                return c.a(i10);
            }
        }

        c(int i10, int i11) {
            this.value = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d implements j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements j.b {
            @Override // md.j.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i10) {
                return d.a(i10);
            }
        }

        d(int i10, int i11) {
            this.value = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        v vVar = new v(true);
        f34729l = vVar;
        vVar.G();
    }

    private void G() {
        this.f34733d = 0;
        this.f34734e = 0;
        this.f34735f = c.ERROR;
        this.f34736g = 0;
        this.f34737h = 0;
        this.f34738i = d.LANGUAGE_VERSION;
    }

    public static b I() {
        return b.s();
    }

    public static b J(v vVar) {
        return I().m(vVar);
    }

    public static v t() {
        return f34729l;
    }

    public boolean A() {
        return (this.f34732c & 8) == 8;
    }

    public boolean B() {
        return (this.f34732c & 4) == 4;
    }

    public boolean C() {
        return (this.f34732c & 16) == 16;
    }

    public boolean D() {
        return (this.f34732c & 1) == 1;
    }

    public boolean E() {
        return (this.f34732c & 2) == 2;
    }

    public boolean F() {
        return (this.f34732c & 32) == 32;
    }

    @Override // md.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return I();
    }

    @Override // md.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return J(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        if ((this.f34732c & 1) == 1) {
            c5052f.Z(1, this.f34733d);
        }
        if ((this.f34732c & 2) == 2) {
            c5052f.Z(2, this.f34734e);
        }
        if ((this.f34732c & 4) == 4) {
            c5052f.R(3, this.f34735f.getNumber());
        }
        if ((this.f34732c & 8) == 8) {
            c5052f.Z(4, this.f34736g);
        }
        if ((this.f34732c & 16) == 16) {
            c5052f.Z(5, this.f34737h);
        }
        if ((this.f34732c & 32) == 32) {
            c5052f.R(6, this.f34738i.getNumber());
        }
        c5052f.h0(this.f34731b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34740k;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34732c & 1) == 1 ? C5052f.o(1, this.f34733d) : 0;
        if ((this.f34732c & 2) == 2) {
            iO += C5052f.o(2, this.f34734e);
        }
        if ((this.f34732c & 4) == 4) {
            iO += C5052f.h(3, this.f34735f.getNumber());
        }
        if ((this.f34732c & 8) == 8) {
            iO += C5052f.o(4, this.f34736g);
        }
        if ((this.f34732c & 16) == 16) {
            iO += C5052f.o(5, this.f34737h);
        }
        if ((this.f34732c & 32) == 32) {
            iO += C5052f.h(6, this.f34738i.getNumber());
        }
        int size = iO + this.f34731b.size();
        this.f34740k = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34739j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f34739j = (byte) 1;
        return true;
    }

    public int u() {
        return this.f34736g;
    }

    public c v() {
        return this.f34735f;
    }

    public int w() {
        return this.f34737h;
    }

    public int x() {
        return this.f34733d;
    }

    public int y() {
        return this.f34734e;
    }

    public d z() {
        return this.f34738i;
    }

    public v(i.b bVar) {
        super(bVar);
        this.f34739j = (byte) -1;
        this.f34740k = -1;
        this.f34731b = bVar.j();
    }

    public v(boolean z10) {
        this.f34739j = (byte) -1;
        this.f34740k = -1;
        this.f34731b = AbstractC5050d.f40294a;
    }

    public v(C5051e c5051e, C5053g c5053g) {
        this.f34739j = (byte) -1;
        this.f34740k = -1;
        G();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f34732c |= 1;
                            this.f34733d = c5051e.r();
                        } else if (iJ == 16) {
                            this.f34732c |= 2;
                            this.f34734e = c5051e.r();
                        } else if (iJ == 24) {
                            int iM = c5051e.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                c5052fI.n0(iJ);
                                c5052fI.n0(iM);
                            } else {
                                this.f34732c |= 4;
                                this.f34735f = cVarA;
                            }
                        } else if (iJ == 32) {
                            this.f34732c |= 8;
                            this.f34736g = c5051e.r();
                        } else if (iJ == 40) {
                            this.f34732c |= 16;
                            this.f34737h = c5051e.r();
                        } else if (iJ != 48) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            int iM2 = c5051e.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                c5052fI.n0(iJ);
                                c5052fI.n0(iM2);
                            } else {
                                this.f34732c |= 32;
                                this.f34738i = dVarA;
                            }
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
                    this.f34731b = bVarT.f();
                    throw th2;
                }
                this.f34731b = bVarT.f();
                g();
                throw th;
            }
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34731b = bVarT.f();
            throw th3;
        }
        this.f34731b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34743d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34746g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f34744e = c.ERROR;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d f34747h = d.LANGUAGE_VERSION;

        public b() {
            t();
        }

        public static b s() {
            return new b();
        }

        public b A(int i10) {
            this.f34741b |= 2;
            this.f34743d = i10;
            return this;
        }

        public b B(d dVar) {
            dVar.getClass();
            this.f34741b |= 32;
            this.f34747h = dVar;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public v build() {
            v vVarQ = q();
            if (vVarQ.isInitialized()) {
                return vVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(vVarQ);
        }

        public v q() {
            v vVar = new v(this);
            int i10 = this.f34741b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f34733d = this.f34742c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f34734e = this.f34743d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f34735f = this.f34744e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f34736g = this.f34745f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f34737h = this.f34746g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f34738i = this.f34747h;
            vVar.f34732c = i11;
            return vVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b m(v vVar) {
            if (vVar == v.t()) {
                return this;
            }
            if (vVar.D()) {
                z(vVar.x());
            }
            if (vVar.E()) {
                A(vVar.y());
            }
            if (vVar.B()) {
                x(vVar.v());
            }
            if (vVar.A()) {
                w(vVar.u());
            }
            if (vVar.C()) {
                y(vVar.w());
            }
            if (vVar.F()) {
                B(vVar.z());
            }
            n(j().d(vVar.f34731b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.v.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.v.f34730m     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.v r3 = (fd.v) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.v r4 = (fd.v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.v.b.v0(md.e, md.g):fd.v$b");
        }

        public b w(int i10) {
            this.f34741b |= 8;
            this.f34745f = i10;
            return this;
        }

        public b x(c cVar) {
            cVar.getClass();
            this.f34741b |= 4;
            this.f34744e = cVar;
            return this;
        }

        public b y(int i10) {
            this.f34741b |= 16;
            this.f34746g = i10;
            return this;
        }

        public b z(int i10) {
            this.f34741b |= 1;
            this.f34742c = i10;
            return this;
        }

        private void t() {
        }
    }
}
