package fd;

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
public final class s extends i.d implements md.q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f34679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static md.r f34680o = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f34686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f34687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f34688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f34690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34691m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public s c(C5051e c5051e, C5053g c5053g) {
            return new s(c5051e, c5053g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

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
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        s sVar = new s(true);
        f34679n = sVar;
        sVar.T();
    }

    public static s E() {
        return f34679n;
    }

    private void T() {
        this.f34683e = 0;
        this.f34684f = 0;
        this.f34685g = false;
        this.f34686h = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f34687i = list;
        this.f34688j = list;
    }

    public static b U() {
        return b.w();
    }

    public static b V(s sVar) {
        return U().m(sVar);
    }

    @Override // md.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public s getDefaultInstanceForType() {
        return f34679n;
    }

    public int G() {
        return this.f34683e;
    }

    public int I() {
        return this.f34684f;
    }

    public boolean J() {
        return this.f34685g;
    }

    public q K(int i10) {
        return (q) this.f34687i.get(i10);
    }

    public int L() {
        return this.f34687i.size();
    }

    public List M() {
        return this.f34688j;
    }

    public List N() {
        return this.f34687i;
    }

    public c O() {
        return this.f34686h;
    }

    public boolean P() {
        return (this.f34682d & 1) == 1;
    }

    public boolean Q() {
        return (this.f34682d & 2) == 2;
    }

    public boolean R() {
        return (this.f34682d & 4) == 4;
    }

    public boolean S() {
        return (this.f34682d & 8) == 8;
    }

    @Override // md.p
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return U();
    }

    @Override // md.p
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return V(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34682d & 1) == 1) {
            c5052f.Z(1, this.f34683e);
        }
        if ((this.f34682d & 2) == 2) {
            c5052f.Z(2, this.f34684f);
        }
        if ((this.f34682d & 4) == 4) {
            c5052f.K(3, this.f34685g);
        }
        if ((this.f34682d & 8) == 8) {
            c5052f.R(4, this.f34686h.getNumber());
        }
        for (int i10 = 0; i10 < this.f34687i.size(); i10++) {
            c5052f.c0(5, (md.p) this.f34687i.get(i10));
        }
        if (M().size() > 0) {
            c5052f.n0(50);
            c5052f.n0(this.f34689k);
        }
        for (int i11 = 0; i11 < this.f34688j.size(); i11++) {
            c5052f.a0(((Integer) this.f34688j.get(i11)).intValue());
        }
        aVarS.a(1000, c5052f);
        c5052f.h0(this.f34681c);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34691m;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34682d & 1) == 1 ? C5052f.o(1, this.f34683e) : 0;
        if ((this.f34682d & 2) == 2) {
            iO += C5052f.o(2, this.f34684f);
        }
        if ((this.f34682d & 4) == 4) {
            iO += C5052f.a(3, this.f34685g);
        }
        if ((this.f34682d & 8) == 8) {
            iO += C5052f.h(4, this.f34686h.getNumber());
        }
        for (int i11 = 0; i11 < this.f34687i.size(); i11++) {
            iO += C5052f.r(5, (md.p) this.f34687i.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f34688j.size(); i12++) {
            iP += C5052f.p(((Integer) this.f34688j.get(i12)).intValue());
        }
        int iP2 = iO + iP;
        if (!M().isEmpty()) {
            iP2 = iP2 + 1 + C5052f.p(iP);
        }
        this.f34689k = iP;
        int iN = iP2 + n() + this.f34681c.size();
        this.f34691m = iN;
        return iN;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34690l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!P()) {
            this.f34690l = (byte) 0;
            return false;
        }
        if (!Q()) {
            this.f34690l = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < L(); i10++) {
            if (!K(i10).isInitialized()) {
                this.f34690l = (byte) 0;
                return false;
            }
        }
        if (m()) {
            this.f34690l = (byte) 1;
            return true;
        }
        this.f34690l = (byte) 0;
        return false;
    }

    public s(i.c cVar) {
        super(cVar);
        this.f34689k = -1;
        this.f34690l = (byte) -1;
        this.f34691m = -1;
        this.f34681c = cVar.j();
    }

    public s(boolean z10) {
        this.f34689k = -1;
        this.f34690l = (byte) -1;
        this.f34691m = -1;
        this.f34681c = AbstractC5050d.f40294a;
    }

    public s(C5051e c5051e, C5053g c5053g) {
        this.f34689k = -1;
        this.f34690l = (byte) -1;
        this.f34691m = -1;
        T();
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
                            this.f34682d |= 1;
                            this.f34683e = c5051e.r();
                        } else if (iJ == 16) {
                            this.f34682d |= 2;
                            this.f34684f = c5051e.r();
                        } else if (iJ == 24) {
                            this.f34682d |= 4;
                            this.f34685g = c5051e.j();
                        } else if (iJ == 32) {
                            int iM = c5051e.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                c5052fI.n0(iJ);
                                c5052fI.n0(iM);
                            } else {
                                this.f34682d |= 8;
                                this.f34686h = cVarA;
                            }
                        } else if (iJ == 42) {
                            if ((i10 & 16) != 16) {
                                this.f34687i = new ArrayList();
                                i10 |= 16;
                            }
                            this.f34687i.add(c5051e.t(q.f34607v, c5053g));
                        } else if (iJ == 48) {
                            if ((i10 & 32) != 32) {
                                this.f34688j = new ArrayList();
                                i10 |= 32;
                            }
                            this.f34688j.add(Integer.valueOf(c5051e.r()));
                        } else if (iJ != 50) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            int i11 = c5051e.i(c5051e.z());
                            if ((i10 & 32) != 32 && c5051e.e() > 0) {
                                this.f34688j = new ArrayList();
                                i10 |= 32;
                            }
                            while (c5051e.e() > 0) {
                                this.f34688j.add(Integer.valueOf(c5051e.r()));
                            }
                            c5051e.h(i11);
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 16) == 16) {
                    this.f34687i = Collections.unmodifiableList(this.f34687i);
                }
                if ((i10 & 32) == 32) {
                    this.f34688j = Collections.unmodifiableList(this.f34688j);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34681c = bVarT.f();
                    throw th2;
                }
                this.f34681c = bVarT.f();
                g();
                throw th;
            }
        }
        if ((i10 & 16) == 16) {
            this.f34687i = Collections.unmodifiableList(this.f34687i);
        }
        if ((i10 & 32) == 32) {
            this.f34688j = Collections.unmodifiableList(this.f34688j);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34681c = bVarT.f();
            throw th3;
        }
        this.f34681c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f34695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f34696h = c.INV;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f34697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f34698j;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34697i = list;
            this.f34698j = list;
            z();
        }

        public static b w() {
            return new b();
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m(s sVar) {
            if (sVar == s.E()) {
                return this;
            }
            if (sVar.P()) {
                C(sVar.G());
            }
            if (sVar.Q()) {
                D(sVar.I());
            }
            if (sVar.R()) {
                E(sVar.J());
            }
            if (sVar.S()) {
                F(sVar.O());
            }
            if (!sVar.f34687i.isEmpty()) {
                if (this.f34697i.isEmpty()) {
                    this.f34697i = sVar.f34687i;
                    this.f34692d &= -17;
                } else {
                    y();
                    this.f34697i.addAll(sVar.f34687i);
                }
            }
            if (!sVar.f34688j.isEmpty()) {
                if (this.f34698j.isEmpty()) {
                    this.f34698j = sVar.f34688j;
                    this.f34692d &= -33;
                } else {
                    x();
                    this.f34698j.addAll(sVar.f34688j);
                }
            }
            r(sVar);
            n(j().d(sVar.f34681c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.s.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.s.f34680o     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.s r3 = (fd.s) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.s r4 = (fd.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.s.b.v0(md.e, md.g):fd.s$b");
        }

        public b C(int i10) {
            this.f34692d |= 1;
            this.f34693e = i10;
            return this;
        }

        public b D(int i10) {
            this.f34692d |= 2;
            this.f34694f = i10;
            return this;
        }

        public b E(boolean z10) {
            this.f34692d |= 4;
            this.f34695g = z10;
            return this;
        }

        public b F(c cVar) {
            cVar.getClass();
            this.f34692d |= 8;
            this.f34696h = cVar;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public s build() {
            s sVarU = u();
            if (sVarU.isInitialized()) {
                return sVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(sVarU);
        }

        public s u() {
            s sVar = new s(this);
            int i10 = this.f34692d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            sVar.f34683e = this.f34693e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            sVar.f34684f = this.f34694f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            sVar.f34685g = this.f34695g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            sVar.f34686h = this.f34696h;
            if ((this.f34692d & 16) == 16) {
                this.f34697i = Collections.unmodifiableList(this.f34697i);
                this.f34692d &= -17;
            }
            sVar.f34687i = this.f34697i;
            if ((this.f34692d & 32) == 32) {
                this.f34698j = Collections.unmodifiableList(this.f34698j);
                this.f34692d &= -33;
            }
            sVar.f34688j = this.f34698j;
            sVar.f34682d = i11;
            return sVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        public final void x() {
            if ((this.f34692d & 32) != 32) {
                this.f34698j = new ArrayList(this.f34698j);
                this.f34692d |= 32;
            }
        }

        public final void y() {
            if ((this.f34692d & 16) != 16) {
                this.f34697i = new ArrayList(this.f34697i);
                this.f34692d |= 16;
            }
        }

        private void z() {
        }
    }
}
