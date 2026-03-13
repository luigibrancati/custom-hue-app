package fd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.DescriptorProtos$FileOptions;
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
public final class q extends i.d implements md.q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f34606u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static md.r f34607v = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f34610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f34613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f34619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f34621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f34622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f34624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34625t;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public q c(C5051e c5051e, C5053g c5053g) {
            return new q(c5051e, c5053g);
        }
    }

    static {
        q qVar = new q(true);
        f34606u = qVar;
        qVar.r0();
    }

    public static q S() {
        return f34606u;
    }

    private void r0() {
        this.f34610e = Collections.EMPTY_LIST;
        this.f34611f = false;
        this.f34612g = 0;
        this.f34613h = S();
        this.f34614i = 0;
        this.f34615j = 0;
        this.f34616k = 0;
        this.f34617l = 0;
        this.f34618m = 0;
        this.f34619n = S();
        this.f34620o = 0;
        this.f34621p = S();
        this.f34622q = 0;
        this.f34623r = 0;
    }

    public static c s0() {
        return c.w();
    }

    public static c t0(q qVar) {
        return s0().m(qVar);
    }

    public q M() {
        return this.f34621p;
    }

    public int N() {
        return this.f34622q;
    }

    public b O(int i10) {
        return (b) this.f34610e.get(i10);
    }

    public int P() {
        return this.f34610e.size();
    }

    public List Q() {
        return this.f34610e;
    }

    public int R() {
        return this.f34615j;
    }

    @Override // md.q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public q getDefaultInstanceForType() {
        return f34606u;
    }

    public int U() {
        return this.f34623r;
    }

    public int V() {
        return this.f34612g;
    }

    public q W() {
        return this.f34613h;
    }

    public int X() {
        return this.f34614i;
    }

    public boolean Y() {
        return this.f34611f;
    }

    public q Z() {
        return this.f34619n;
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34609d & RecognitionOptions.AZTEC) == 4096) {
            c5052f.Z(1, this.f34623r);
        }
        for (int i10 = 0; i10 < this.f34610e.size(); i10++) {
            c5052f.c0(2, (md.p) this.f34610e.get(i10));
        }
        if ((this.f34609d & 1) == 1) {
            c5052f.K(3, this.f34611f);
        }
        if ((this.f34609d & 2) == 2) {
            c5052f.Z(4, this.f34612g);
        }
        if ((this.f34609d & 4) == 4) {
            c5052f.c0(5, this.f34613h);
        }
        if ((this.f34609d & 16) == 16) {
            c5052f.Z(6, this.f34615j);
        }
        if ((this.f34609d & 32) == 32) {
            c5052f.Z(7, this.f34616k);
        }
        if ((this.f34609d & 8) == 8) {
            c5052f.Z(8, this.f34614i);
        }
        if ((this.f34609d & 64) == 64) {
            c5052f.Z(9, this.f34617l);
        }
        if ((this.f34609d & 256) == 256) {
            c5052f.c0(10, this.f34619n);
        }
        if ((this.f34609d & 512) == 512) {
            c5052f.Z(11, this.f34620o);
        }
        if ((this.f34609d & 128) == 128) {
            c5052f.Z(12, this.f34618m);
        }
        if ((this.f34609d & RecognitionOptions.UPC_E) == 1024) {
            c5052f.c0(13, this.f34621p);
        }
        if ((this.f34609d & RecognitionOptions.PDF417) == 2048) {
            c5052f.Z(14, this.f34622q);
        }
        aVarS.a(200, c5052f);
        c5052f.h0(this.f34608c);
    }

    public int a0() {
        return this.f34620o;
    }

    public int b0() {
        return this.f34618m;
    }

    public int c0() {
        return this.f34616k;
    }

    public int d0() {
        return this.f34617l;
    }

    public boolean e0() {
        return (this.f34609d & RecognitionOptions.UPC_E) == 1024;
    }

    public boolean f0() {
        return (this.f34609d & RecognitionOptions.PDF417) == 2048;
    }

    public boolean g0() {
        return (this.f34609d & 16) == 16;
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34625t;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34609d & RecognitionOptions.AZTEC) == 4096 ? C5052f.o(1, this.f34623r) : 0;
        for (int i11 = 0; i11 < this.f34610e.size(); i11++) {
            iO += C5052f.r(2, (md.p) this.f34610e.get(i11));
        }
        if ((this.f34609d & 1) == 1) {
            iO += C5052f.a(3, this.f34611f);
        }
        if ((this.f34609d & 2) == 2) {
            iO += C5052f.o(4, this.f34612g);
        }
        if ((this.f34609d & 4) == 4) {
            iO += C5052f.r(5, this.f34613h);
        }
        if ((this.f34609d & 16) == 16) {
            iO += C5052f.o(6, this.f34615j);
        }
        if ((this.f34609d & 32) == 32) {
            iO += C5052f.o(7, this.f34616k);
        }
        if ((this.f34609d & 8) == 8) {
            iO += C5052f.o(8, this.f34614i);
        }
        if ((this.f34609d & 64) == 64) {
            iO += C5052f.o(9, this.f34617l);
        }
        if ((this.f34609d & 256) == 256) {
            iO += C5052f.r(10, this.f34619n);
        }
        if ((this.f34609d & 512) == 512) {
            iO += C5052f.o(11, this.f34620o);
        }
        if ((this.f34609d & 128) == 128) {
            iO += C5052f.o(12, this.f34618m);
        }
        if ((this.f34609d & RecognitionOptions.UPC_E) == 1024) {
            iO += C5052f.r(13, this.f34621p);
        }
        if ((this.f34609d & RecognitionOptions.PDF417) == 2048) {
            iO += C5052f.o(14, this.f34622q);
        }
        int iN = iO + n() + this.f34608c.size();
        this.f34625t = iN;
        return iN;
    }

    public boolean h0() {
        return (this.f34609d & RecognitionOptions.AZTEC) == 4096;
    }

    public boolean i0() {
        return (this.f34609d & 2) == 2;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34624s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < P(); i10++) {
            if (!O(i10).isInitialized()) {
                this.f34624s = (byte) 0;
                return false;
            }
        }
        if (j0() && !W().isInitialized()) {
            this.f34624s = (byte) 0;
            return false;
        }
        if (m0() && !Z().isInitialized()) {
            this.f34624s = (byte) 0;
            return false;
        }
        if (e0() && !M().isInitialized()) {
            this.f34624s = (byte) 0;
            return false;
        }
        if (m()) {
            this.f34624s = (byte) 1;
            return true;
        }
        this.f34624s = (byte) 0;
        return false;
    }

    public boolean j0() {
        return (this.f34609d & 4) == 4;
    }

    public boolean k0() {
        return (this.f34609d & 8) == 8;
    }

    public boolean l0() {
        return (this.f34609d & 1) == 1;
    }

    public boolean m0() {
        return (this.f34609d & 256) == 256;
    }

    public boolean n0() {
        return (this.f34609d & 512) == 512;
    }

    public boolean o0() {
        return (this.f34609d & 128) == 128;
    }

    public boolean p0() {
        return (this.f34609d & 32) == 32;
    }

    public boolean q0() {
        return (this.f34609d & 64) == 64;
    }

    @Override // md.p
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return s0();
    }

    @Override // md.p
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public c toBuilder() {
        return t0(this);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends md.i implements md.q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f34626i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static md.r f34627j = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f34628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f34630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public q f34631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f34633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34634h;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(C5051e c5051e, C5053g c5053g) {
                return new b(c5051e, c5053g);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum c implements j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

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
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // md.j.a
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            b bVar = new b(true);
            f34626i = bVar;
            bVar.x();
        }

        public static b q() {
            return f34626i;
        }

        private void x() {
            this.f34630d = c.INV;
            this.f34631e = q.S();
            this.f34632f = 0;
        }

        public static C0448b y() {
            return C0448b.s();
        }

        public static C0448b z(b bVar) {
            return y().m(bVar);
        }

        @Override // md.p
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0448b newBuilderForType() {
            return y();
        }

        @Override // md.p
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public C0448b toBuilder() {
            return z(this);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            if ((this.f34629c & 1) == 1) {
                c5052f.R(1, this.f34630d.getNumber());
            }
            if ((this.f34629c & 2) == 2) {
                c5052f.c0(2, this.f34631e);
            }
            if ((this.f34629c & 4) == 4) {
                c5052f.Z(3, this.f34632f);
            }
            c5052f.h0(this.f34628b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f34634h;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f34629c & 1) == 1 ? C5052f.h(1, this.f34630d.getNumber()) : 0;
            if ((this.f34629c & 2) == 2) {
                iH += C5052f.r(2, this.f34631e);
            }
            if ((this.f34629c & 4) == 4) {
                iH += C5052f.o(3, this.f34632f);
            }
            int size = iH + this.f34628b.size();
            this.f34634h = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f34633g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!v() || s().isInitialized()) {
                this.f34633g = (byte) 1;
                return true;
            }
            this.f34633g = (byte) 0;
            return false;
        }

        public c r() {
            return this.f34630d;
        }

        public q s() {
            return this.f34631e;
        }

        public int t() {
            return this.f34632f;
        }

        public boolean u() {
            return (this.f34629c & 1) == 1;
        }

        public boolean v() {
            return (this.f34629c & 2) == 2;
        }

        public boolean w() {
            return (this.f34629c & 4) == 4;
        }

        public b(i.b bVar) {
            super(bVar);
            this.f34633g = (byte) -1;
            this.f34634h = -1;
            this.f34628b = bVar.j();
        }

        public b(boolean z10) {
            this.f34633g = (byte) -1;
            this.f34634h = -1;
            this.f34628b = AbstractC5050d.f40294a;
        }

        public b(C5051e c5051e, C5053g c5053g) {
            this.f34633g = (byte) -1;
            this.f34634h = -1;
            x();
            AbstractC5050d.b bVarT = AbstractC5050d.t();
            C5052f c5052fI = C5052f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iJ = c5051e.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    int iM = c5051e.m();
                                    c cVarA = c.a(iM);
                                    if (cVarA == null) {
                                        c5052fI.n0(iJ);
                                        c5052fI.n0(iM);
                                    } else {
                                        this.f34629c |= 1;
                                        this.f34630d = cVarA;
                                    }
                                } else if (iJ == 18) {
                                    c builder = (this.f34629c & 2) == 2 ? this.f34631e.toBuilder() : null;
                                    q qVar = (q) c5051e.t(q.f34607v, c5053g);
                                    this.f34631e = qVar;
                                    if (builder != null) {
                                        builder.m(qVar);
                                        this.f34631e = builder.u();
                                    }
                                    this.f34629c |= 2;
                                } else if (iJ != 24) {
                                    if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                    }
                                } else {
                                    this.f34629c |= 4;
                                    this.f34632f = c5051e.r();
                                }
                            }
                            z10 = true;
                        } catch (md.k e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new md.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f34628b = bVarT.f();
                        throw th2;
                    }
                    this.f34628b = bVarT.f();
                    g();
                    throw th;
                }
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f34628b = bVarT.f();
                throw th3;
            }
            this.f34628b = bVarT.f();
            g();
        }

        /* JADX INFO: renamed from: fd.q$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0448b extends i.b implements md.q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f34635b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public c f34636c = c.INV;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public q f34637d = q.S();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f34638e;

            public C0448b() {
                t();
            }

            public static C0448b s() {
                return new C0448b();
            }

            @Override // md.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarQ = q();
                if (bVarQ.isInitialized()) {
                    return bVarQ;
                }
                throw AbstractC5047a.AbstractC0530a.i(bVarQ);
            }

            public b q() {
                b bVar = new b(this);
                int i10 = this.f34635b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f34630d = this.f34636c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f34631e = this.f34637d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f34632f = this.f34638e;
                bVar.f34629c = i11;
                return bVar;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0448b e() {
                return s().m(q());
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0448b m(b bVar) {
                if (bVar == b.q()) {
                    return this;
                }
                if (bVar.u()) {
                    x(bVar.r());
                }
                if (bVar.v()) {
                    w(bVar.s());
                }
                if (bVar.w()) {
                    y(bVar.t());
                }
                n(j().d(bVar.f34628b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public fd.q.b.C0448b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = fd.q.b.f34627j     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    fd.q$b r3 = (fd.q.b) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                    fd.q$b r4 = (fd.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: fd.q.b.C0448b.v0(md.e, md.g):fd.q$b$b");
            }

            public C0448b w(q qVar) {
                if ((this.f34635b & 2) != 2 || this.f34637d == q.S()) {
                    this.f34637d = qVar;
                } else {
                    this.f34637d = q.t0(this.f34637d).m(qVar).u();
                }
                this.f34635b |= 2;
                return this;
            }

            public C0448b x(c cVar) {
                cVar.getClass();
                this.f34635b |= 1;
                this.f34636c = cVar;
                return this;
            }

            public C0448b y(int i10) {
                this.f34635b |= 4;
                this.f34638e = i10;
                return this;
            }

            private void t() {
            }
        }
    }

    public q(i.c cVar) {
        super(cVar);
        this.f34624s = (byte) -1;
        this.f34625t = -1;
        this.f34608c = cVar.j();
    }

    public q(boolean z10) {
        this.f34624s = (byte) -1;
        this.f34625t = -1;
        this.f34608c = AbstractC5050d.f40294a;
    }

    public q(C5051e c5051e, C5053g c5053g) {
        c builder;
        this.f34624s = (byte) -1;
        this.f34625t = -1;
        r0();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    switch (iJ) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f34609d |= RecognitionOptions.AZTEC;
                            this.f34623r = c5051e.r();
                            break;
                        case 18:
                            if (!z11) {
                                this.f34610e = new ArrayList();
                                z11 = true;
                            }
                            this.f34610e.add(c5051e.t(b.f34627j, c5053g));
                            break;
                        case 24:
                            this.f34609d |= 1;
                            this.f34611f = c5051e.j();
                            break;
                        case 32:
                            this.f34609d |= 2;
                            this.f34612g = c5051e.r();
                            break;
                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            builder = (this.f34609d & 4) == 4 ? this.f34613h.toBuilder() : null;
                            q qVar = (q) c5051e.t(f34607v, c5053g);
                            this.f34613h = qVar;
                            if (builder != null) {
                                builder.m(qVar);
                                this.f34613h = builder.u();
                            }
                            this.f34609d |= 4;
                            break;
                        case 48:
                            this.f34609d |= 16;
                            this.f34615j = c5051e.r();
                            break;
                        case 56:
                            this.f34609d |= 32;
                            this.f34616k = c5051e.r();
                            break;
                        case 64:
                            this.f34609d |= 8;
                            this.f34614i = c5051e.r();
                            break;
                        case 72:
                            this.f34609d |= 64;
                            this.f34617l = c5051e.r();
                            break;
                        case 82:
                            builder = (this.f34609d & 256) == 256 ? this.f34619n.toBuilder() : null;
                            q qVar2 = (q) c5051e.t(f34607v, c5053g);
                            this.f34619n = qVar2;
                            if (builder != null) {
                                builder.m(qVar2);
                                this.f34619n = builder.u();
                            }
                            this.f34609d |= 256;
                            break;
                        case 88:
                            this.f34609d |= 512;
                            this.f34620o = c5051e.r();
                            break;
                        case 96:
                            this.f34609d |= 128;
                            this.f34618m = c5051e.r();
                            break;
                        case 106:
                            builder = (this.f34609d & RecognitionOptions.UPC_E) == 1024 ? this.f34621p.toBuilder() : null;
                            q qVar3 = (q) c5051e.t(f34607v, c5053g);
                            this.f34621p = qVar3;
                            if (builder != null) {
                                builder.m(qVar3);
                                this.f34621p = builder.u();
                            }
                            this.f34609d |= RecognitionOptions.UPC_E;
                            break;
                        case 112:
                            this.f34609d |= RecognitionOptions.PDF417;
                            this.f34622q = c5051e.r();
                            break;
                        default:
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f34610e = Collections.unmodifiableList(this.f34610e);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34608c = bVarT.f();
                    throw th2;
                }
                this.f34608c = bVarT.f();
                g();
                throw th;
            }
        }
        if (z11) {
            this.f34610e = Collections.unmodifiableList(this.f34610e);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34608c = bVarT.f();
            throw th3;
        }
        this.f34608c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34639d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f34641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34642g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34644i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f34645j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f34646k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f34647l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f34648m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f34650o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f34652q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f34653r;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f34640e = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public q f34643h = q.S();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public q f34649n = q.S();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public q f34651p = q.S();

        public c() {
            y();
        }

        public static c w() {
            return new c();
        }

        private void x() {
            if ((this.f34639d & 1) != 1) {
                this.f34640e = new ArrayList(this.f34640e);
                this.f34639d |= 1;
            }
        }

        public c A(q qVar) {
            if ((this.f34639d & 8) != 8 || this.f34643h == q.S()) {
                this.f34643h = qVar;
            } else {
                this.f34643h = q.t0(this.f34643h).m(qVar).u();
            }
            this.f34639d |= 8;
            return this;
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c m(q qVar) {
            if (qVar == q.S()) {
                return this;
            }
            if (!qVar.f34610e.isEmpty()) {
                if (this.f34640e.isEmpty()) {
                    this.f34640e = qVar.f34610e;
                    this.f34639d &= -2;
                } else {
                    x();
                    this.f34640e.addAll(qVar.f34610e);
                }
            }
            if (qVar.l0()) {
                J(qVar.Y());
            }
            if (qVar.i0()) {
                H(qVar.V());
            }
            if (qVar.j0()) {
                A(qVar.W());
            }
            if (qVar.k0()) {
                I(qVar.X());
            }
            if (qVar.g0()) {
                F(qVar.R());
            }
            if (qVar.p0()) {
                M(qVar.c0());
            }
            if (qVar.q0()) {
                N(qVar.d0());
            }
            if (qVar.o0()) {
                L(qVar.b0());
            }
            if (qVar.m0()) {
                D(qVar.Z());
            }
            if (qVar.n0()) {
                K(qVar.a0());
            }
            if (qVar.e0()) {
                z(qVar.M());
            }
            if (qVar.f0()) {
                E(qVar.N());
            }
            if (qVar.h0()) {
                G(qVar.U());
            }
            r(qVar);
            n(j().d(qVar.f34608c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.q.c v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.q.f34607v     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.q r3 = (fd.q) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.q r4 = (fd.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.q.c.v0(md.e, md.g):fd.q$c");
        }

        public c D(q qVar) {
            if ((this.f34639d & 512) != 512 || this.f34649n == q.S()) {
                this.f34649n = qVar;
            } else {
                this.f34649n = q.t0(this.f34649n).m(qVar).u();
            }
            this.f34639d |= 512;
            return this;
        }

        public c E(int i10) {
            this.f34639d |= RecognitionOptions.AZTEC;
            this.f34652q = i10;
            return this;
        }

        public c F(int i10) {
            this.f34639d |= 32;
            this.f34645j = i10;
            return this;
        }

        public c G(int i10) {
            this.f34639d |= 8192;
            this.f34653r = i10;
            return this;
        }

        public c H(int i10) {
            this.f34639d |= 4;
            this.f34642g = i10;
            return this;
        }

        public c I(int i10) {
            this.f34639d |= 16;
            this.f34644i = i10;
            return this;
        }

        public c J(boolean z10) {
            this.f34639d |= 2;
            this.f34641f = z10;
            return this;
        }

        public c K(int i10) {
            this.f34639d |= RecognitionOptions.UPC_E;
            this.f34650o = i10;
            return this;
        }

        public c L(int i10) {
            this.f34639d |= 256;
            this.f34648m = i10;
            return this;
        }

        public c M(int i10) {
            this.f34639d |= 64;
            this.f34646k = i10;
            return this;
        }

        public c N(int i10) {
            this.f34639d |= 128;
            this.f34647l = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public q build() {
            q qVarU = u();
            if (qVarU.isInitialized()) {
                return qVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(qVarU);
        }

        public q u() {
            q qVar = new q(this);
            int i10 = this.f34639d;
            if ((i10 & 1) == 1) {
                this.f34640e = Collections.unmodifiableList(this.f34640e);
                this.f34639d &= -2;
            }
            qVar.f34610e = this.f34640e;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            qVar.f34611f = this.f34641f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            qVar.f34612g = this.f34642g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            qVar.f34613h = this.f34643h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            qVar.f34614i = this.f34644i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            qVar.f34615j = this.f34645j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            qVar.f34616k = this.f34646k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            qVar.f34617l = this.f34647l;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            qVar.f34618m = this.f34648m;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            qVar.f34619n = this.f34649n;
            if ((i10 & RecognitionOptions.UPC_E) == 1024) {
                i11 |= 512;
            }
            qVar.f34620o = this.f34650o;
            if ((i10 & RecognitionOptions.PDF417) == 2048) {
                i11 |= RecognitionOptions.UPC_E;
            }
            qVar.f34621p = this.f34651p;
            if ((i10 & RecognitionOptions.AZTEC) == 4096) {
                i11 |= RecognitionOptions.PDF417;
            }
            qVar.f34622q = this.f34652q;
            if ((i10 & 8192) == 8192) {
                i11 |= RecognitionOptions.AZTEC;
            }
            qVar.f34623r = this.f34653r;
            qVar.f34609d = i11;
            return qVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c e() {
            return w().m(u());
        }

        public c z(q qVar) {
            if ((this.f34639d & RecognitionOptions.PDF417) != 2048 || this.f34651p == q.S()) {
                this.f34651p = qVar;
            } else {
                this.f34651p = q.t0(this.f34651p).m(qVar).u();
            }
            this.f34639d |= RecognitionOptions.PDF417;
            return this;
        }

        private void y() {
        }
    }
}
