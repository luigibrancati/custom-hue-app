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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i.d implements md.q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f34407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static md.r f34408k = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f34412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f34413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f34414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34415i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d c(C5051e c5051e, C5053g c5053g) {
            return new d(c5051e, c5053g);
        }
    }

    static {
        d dVar = new d(true);
        f34407j = dVar;
        dVar.K();
    }

    public static d B() {
        return f34407j;
    }

    private void K() {
        this.f34411e = 6;
        List list = Collections.EMPTY_LIST;
        this.f34412f = list;
        this.f34413g = list;
    }

    public static b L() {
        return b.w();
    }

    public static b M(d dVar) {
        return L().m(dVar);
    }

    @Override // md.q
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public d getDefaultInstanceForType() {
        return f34407j;
    }

    public int D() {
        return this.f34411e;
    }

    public u E(int i10) {
        return (u) this.f34412f.get(i10);
    }

    public int F() {
        return this.f34412f.size();
    }

    public List G() {
        return this.f34412f;
    }

    public List I() {
        return this.f34413g;
    }

    public boolean J() {
        return (this.f34410d & 1) == 1;
    }

    @Override // md.p
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return L();
    }

    @Override // md.p
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return M(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34410d & 1) == 1) {
            c5052f.Z(1, this.f34411e);
        }
        for (int i10 = 0; i10 < this.f34412f.size(); i10++) {
            c5052f.c0(2, (md.p) this.f34412f.get(i10));
        }
        for (int i11 = 0; i11 < this.f34413g.size(); i11++) {
            c5052f.Z(31, ((Integer) this.f34413g.get(i11)).intValue());
        }
        aVarS.a(19000, c5052f);
        c5052f.h0(this.f34409c);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34415i;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34410d & 1) == 1 ? C5052f.o(1, this.f34411e) : 0;
        for (int i11 = 0; i11 < this.f34412f.size(); i11++) {
            iO += C5052f.r(2, (md.p) this.f34412f.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f34413g.size(); i12++) {
            iP += C5052f.p(((Integer) this.f34413g.get(i12)).intValue());
        }
        int size = iO + iP + (I().size() * 2) + n() + this.f34409c.size();
        this.f34415i = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34414h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < F(); i10++) {
            if (!E(i10).isInitialized()) {
                this.f34414h = (byte) 0;
                return false;
            }
        }
        if (m()) {
            this.f34414h = (byte) 1;
            return true;
        }
        this.f34414h = (byte) 0;
        return false;
    }

    public d(i.c cVar) {
        super(cVar);
        this.f34414h = (byte) -1;
        this.f34415i = -1;
        this.f34409c = cVar.j();
    }

    public d(boolean z10) {
        this.f34414h = (byte) -1;
        this.f34415i = -1;
        this.f34409c = AbstractC5050d.f40294a;
    }

    public d(C5051e c5051e, C5053g c5053g) {
        this.f34414h = (byte) -1;
        this.f34415i = -1;
        K();
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
                            this.f34410d |= 1;
                            this.f34411e = c5051e.r();
                        } else if (iJ == 18) {
                            if ((i10 & 2) != 2) {
                                this.f34412f = new ArrayList();
                                i10 |= 2;
                            }
                            this.f34412f.add(c5051e.t(u.f34711n, c5053g));
                        } else if (iJ == 248) {
                            if ((i10 & 4) != 4) {
                                this.f34413g = new ArrayList();
                                i10 |= 4;
                            }
                            this.f34413g.add(Integer.valueOf(c5051e.r()));
                        } else if (iJ != 250) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            int i11 = c5051e.i(c5051e.z());
                            if ((i10 & 4) != 4 && c5051e.e() > 0) {
                                this.f34413g = new ArrayList();
                                i10 |= 4;
                            }
                            while (c5051e.e() > 0) {
                                this.f34413g.add(Integer.valueOf(c5051e.r()));
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
                if ((i10 & 2) == 2) {
                    this.f34412f = Collections.unmodifiableList(this.f34412f);
                }
                if ((i10 & 4) == 4) {
                    this.f34413g = Collections.unmodifiableList(this.f34413g);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34409c = bVarT.f();
                    throw th2;
                }
                this.f34409c = bVarT.f();
                g();
                throw th;
            }
        }
        if ((i10 & 2) == 2) {
            this.f34412f = Collections.unmodifiableList(this.f34412f);
        }
        if ((i10 & 4) == 4) {
            this.f34413g = Collections.unmodifiableList(this.f34413g);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34409c = bVarT.f();
            throw th3;
        }
        this.f34409c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34417e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f34418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f34419g;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34418f = list;
            this.f34419g = list;
            z();
        }

        public static b w() {
            return new b();
        }

        private void y() {
            if ((this.f34416d & 4) != 4) {
                this.f34419g = new ArrayList(this.f34419g);
                this.f34416d |= 4;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m(d dVar) {
            if (dVar == d.B()) {
                return this;
            }
            if (dVar.J()) {
                C(dVar.D());
            }
            if (!dVar.f34412f.isEmpty()) {
                if (this.f34418f.isEmpty()) {
                    this.f34418f = dVar.f34412f;
                    this.f34416d &= -3;
                } else {
                    x();
                    this.f34418f.addAll(dVar.f34412f);
                }
            }
            if (!dVar.f34413g.isEmpty()) {
                if (this.f34419g.isEmpty()) {
                    this.f34419g = dVar.f34413g;
                    this.f34416d &= -5;
                } else {
                    y();
                    this.f34419g.addAll(dVar.f34413g);
                }
            }
            r(dVar);
            n(j().d(dVar.f34409c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.d.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.d.f34408k     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.d r3 = (fd.d) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.d r4 = (fd.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.d.b.v0(md.e, md.g):fd.d$b");
        }

        public b C(int i10) {
            this.f34416d |= 1;
            this.f34417e = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public d build() {
            d dVarU = u();
            if (dVarU.isInitialized()) {
                return dVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(dVarU);
        }

        public d u() {
            d dVar = new d(this);
            int i10 = (this.f34416d & 1) != 1 ? 0 : 1;
            dVar.f34411e = this.f34417e;
            if ((this.f34416d & 2) == 2) {
                this.f34418f = Collections.unmodifiableList(this.f34418f);
                this.f34416d &= -3;
            }
            dVar.f34412f = this.f34418f;
            if ((this.f34416d & 4) == 4) {
                this.f34419g = Collections.unmodifiableList(this.f34419g);
                this.f34416d &= -5;
            }
            dVar.f34413g = this.f34419g;
            dVar.f34410d = i10;
            return dVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        public final void x() {
            if ((this.f34416d & 2) != 2) {
                this.f34418f = new ArrayList(this.f34418f);
                this.f34416d |= 2;
            }
        }

        private void z() {
        }
    }
}
