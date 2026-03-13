package fd;

import fd.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public final class h extends md.i implements md.q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f34452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static md.r f34453n = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f34458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f34459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f34461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f34462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f34463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34464l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public h c(C5051e c5051e, C5053g c5053g) {
            return new h(c5051e, c5053g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

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
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        h hVar = new h(true);
        f34452m = hVar;
        hVar.M();
    }

    private void M() {
        this.f34456d = 0;
        this.f34457e = 0;
        this.f34458f = c.TRUE;
        this.f34459g = q.S();
        this.f34460h = 0;
        List list = Collections.EMPTY_LIST;
        this.f34461i = list;
        this.f34462j = list;
    }

    public static b N() {
        return b.s();
    }

    public static b O(h hVar) {
        return N().m(hVar);
    }

    public static h z() {
        return f34452m;
    }

    public int A() {
        return this.f34456d;
    }

    public q B() {
        return this.f34459g;
    }

    public int C() {
        return this.f34460h;
    }

    public h D(int i10) {
        return (h) this.f34462j.get(i10);
    }

    public int E() {
        return this.f34462j.size();
    }

    public int F() {
        return this.f34457e;
    }

    public boolean G() {
        return (this.f34455c & 4) == 4;
    }

    public boolean I() {
        return (this.f34455c & 1) == 1;
    }

    public boolean J() {
        return (this.f34455c & 8) == 8;
    }

    public boolean K() {
        return (this.f34455c & 16) == 16;
    }

    public boolean L() {
        return (this.f34455c & 2) == 2;
    }

    @Override // md.p
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return N();
    }

    @Override // md.p
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return O(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        if ((this.f34455c & 1) == 1) {
            c5052f.Z(1, this.f34456d);
        }
        if ((this.f34455c & 2) == 2) {
            c5052f.Z(2, this.f34457e);
        }
        if ((this.f34455c & 4) == 4) {
            c5052f.R(3, this.f34458f.getNumber());
        }
        if ((this.f34455c & 8) == 8) {
            c5052f.c0(4, this.f34459g);
        }
        if ((this.f34455c & 16) == 16) {
            c5052f.Z(5, this.f34460h);
        }
        for (int i10 = 0; i10 < this.f34461i.size(); i10++) {
            c5052f.c0(6, (md.p) this.f34461i.get(i10));
        }
        for (int i11 = 0; i11 < this.f34462j.size(); i11++) {
            c5052f.c0(7, (md.p) this.f34462j.get(i11));
        }
        c5052f.h0(this.f34454b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34464l;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34455c & 1) == 1 ? C5052f.o(1, this.f34456d) : 0;
        if ((this.f34455c & 2) == 2) {
            iO += C5052f.o(2, this.f34457e);
        }
        if ((this.f34455c & 4) == 4) {
            iO += C5052f.h(3, this.f34458f.getNumber());
        }
        if ((this.f34455c & 8) == 8) {
            iO += C5052f.r(4, this.f34459g);
        }
        if ((this.f34455c & 16) == 16) {
            iO += C5052f.o(5, this.f34460h);
        }
        for (int i11 = 0; i11 < this.f34461i.size(); i11++) {
            iO += C5052f.r(6, (md.p) this.f34461i.get(i11));
        }
        for (int i12 = 0; i12 < this.f34462j.size(); i12++) {
            iO += C5052f.r(7, (md.p) this.f34462j.get(i12));
        }
        int size = iO + this.f34454b.size();
        this.f34464l = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34463k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (J() && !B().isInitialized()) {
            this.f34463k = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).isInitialized()) {
                this.f34463k = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < E(); i11++) {
            if (!D(i11).isInitialized()) {
                this.f34463k = (byte) 0;
                return false;
            }
        }
        this.f34463k = (byte) 1;
        return true;
    }

    public h w(int i10) {
        return (h) this.f34461i.get(i10);
    }

    public int x() {
        return this.f34461i.size();
    }

    public c y() {
        return this.f34458f;
    }

    public h(i.b bVar) {
        super(bVar);
        this.f34463k = (byte) -1;
        this.f34464l = -1;
        this.f34454b = bVar.j();
    }

    public h(boolean z10) {
        this.f34463k = (byte) -1;
        this.f34464l = -1;
        this.f34454b = AbstractC5050d.f40294a;
    }

    public h(C5051e c5051e, C5053g c5053g) {
        this.f34463k = (byte) -1;
        this.f34464l = -1;
        M();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f34455c |= 1;
                            this.f34456d = c5051e.r();
                        } else if (iJ == 16) {
                            this.f34455c |= 2;
                            this.f34457e = c5051e.r();
                        } else if (iJ == 24) {
                            int iM = c5051e.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                c5052fI.n0(iJ);
                                c5052fI.n0(iM);
                            } else {
                                this.f34455c |= 4;
                                this.f34458f = cVarA;
                            }
                        } else if (iJ == 34) {
                            q.c builder = (this.f34455c & 8) == 8 ? this.f34459g.toBuilder() : null;
                            q qVar = (q) c5051e.t(q.f34607v, c5053g);
                            this.f34459g = qVar;
                            if (builder != null) {
                                builder.m(qVar);
                                this.f34459g = builder.u();
                            }
                            this.f34455c |= 8;
                        } else if (iJ == 40) {
                            this.f34455c |= 16;
                            this.f34460h = c5051e.r();
                        } else if (iJ == 50) {
                            if ((i10 & 32) != 32) {
                                this.f34461i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f34461i.add(c5051e.t(f34453n, c5053g));
                        } else if (iJ != 58) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f34462j = new ArrayList();
                                i10 |= 64;
                            }
                            this.f34462j.add(c5051e.t(f34453n, c5053g));
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 32) == 32) {
                    this.f34461i = Collections.unmodifiableList(this.f34461i);
                }
                if ((i10 & 64) == 64) {
                    this.f34462j = Collections.unmodifiableList(this.f34462j);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34454b = bVarT.f();
                    throw th2;
                }
                this.f34454b = bVarT.f();
                g();
                throw th;
            }
        }
        if ((i10 & 32) == 32) {
            this.f34461i = Collections.unmodifiableList(this.f34461i);
        }
        if ((i10 & 64) == 64) {
            this.f34462j = Collections.unmodifiableList(this.f34462j);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34454b = bVarT.f();
            throw th3;
        }
        this.f34454b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f34468e = c.TRUE;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public q f34469f = q.S();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f34471h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f34472i;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34471h = list;
            this.f34472i = list;
            v();
        }

        public static b s() {
            return new b();
        }

        public b A(int i10) {
            this.f34465b |= 1;
            this.f34466c = i10;
            return this;
        }

        public b B(int i10) {
            this.f34465b |= 16;
            this.f34470g = i10;
            return this;
        }

        public b C(int i10) {
            this.f34465b |= 2;
            this.f34467d = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public h build() {
            h hVarQ = q();
            if (hVarQ.isInitialized()) {
                return hVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(hVarQ);
        }

        public h q() {
            h hVar = new h(this);
            int i10 = this.f34465b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            hVar.f34456d = this.f34466c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            hVar.f34457e = this.f34467d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            hVar.f34458f = this.f34468e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            hVar.f34459g = this.f34469f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            hVar.f34460h = this.f34470g;
            if ((this.f34465b & 32) == 32) {
                this.f34471h = Collections.unmodifiableList(this.f34471h);
                this.f34465b &= -33;
            }
            hVar.f34461i = this.f34471h;
            if ((this.f34465b & 64) == 64) {
                this.f34472i = Collections.unmodifiableList(this.f34472i);
                this.f34465b &= -65;
            }
            hVar.f34462j = this.f34472i;
            hVar.f34455c = i11;
            return hVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34465b & 32) != 32) {
                this.f34471h = new ArrayList(this.f34471h);
                this.f34465b |= 32;
            }
        }

        public final void u() {
            if ((this.f34465b & 64) != 64) {
                this.f34472i = new ArrayList(this.f34472i);
                this.f34465b |= 64;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b m(h hVar) {
            if (hVar == h.z()) {
                return this;
            }
            if (hVar.I()) {
                A(hVar.A());
            }
            if (hVar.L()) {
                C(hVar.F());
            }
            if (hVar.G()) {
                z(hVar.y());
            }
            if (hVar.J()) {
                y(hVar.B());
            }
            if (hVar.K()) {
                B(hVar.C());
            }
            if (!hVar.f34461i.isEmpty()) {
                if (this.f34471h.isEmpty()) {
                    this.f34471h = hVar.f34461i;
                    this.f34465b &= -33;
                } else {
                    t();
                    this.f34471h.addAll(hVar.f34461i);
                }
            }
            if (!hVar.f34462j.isEmpty()) {
                if (this.f34472i.isEmpty()) {
                    this.f34472i = hVar.f34462j;
                    this.f34465b &= -65;
                } else {
                    u();
                    this.f34472i.addAll(hVar.f34462j);
                }
            }
            n(j().d(hVar.f34454b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.h.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.h.f34453n     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.h r3 = (fd.h) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.h r4 = (fd.h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.h.b.v0(md.e, md.g):fd.h$b");
        }

        public b y(q qVar) {
            if ((this.f34465b & 8) != 8 || this.f34469f == q.S()) {
                this.f34469f = qVar;
            } else {
                this.f34469f = q.t0(this.f34469f).m(qVar).u();
            }
            this.f34465b |= 8;
            return this;
        }

        public b z(c cVar) {
            cVar.getClass();
            this.f34465b |= 4;
            this.f34468e = cVar;
            return this;
        }

        private void v() {
        }
    }
}
