package fd;

import fd.t;
import fd.w;
import java.io.IOException;
import java.io.InputStream;
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
public final class l extends i.d implements md.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f34509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static md.r f34510m = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f34513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f34514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f34515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f34516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f34517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f34518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34519k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public l c(C5051e c5051e, C5053g c5053g) {
            return new l(c5051e, c5053g);
        }
    }

    static {
        l lVar = new l(true);
        f34509l = lVar;
        lVar.U();
    }

    public static l E() {
        return f34509l;
    }

    private void U() {
        List list = Collections.EMPTY_LIST;
        this.f34513e = list;
        this.f34514f = list;
        this.f34515g = list;
        this.f34516h = t.q();
        this.f34517i = w.o();
    }

    public static b V() {
        return b.w();
    }

    public static b W(l lVar) {
        return V().m(lVar);
    }

    public static l Y(InputStream inputStream, C5053g c5053g) {
        return (l) f34510m.b(inputStream, c5053g);
    }

    @Override // md.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public l getDefaultInstanceForType() {
        return f34509l;
    }

    public i G(int i10) {
        return (i) this.f34513e.get(i10);
    }

    public int I() {
        return this.f34513e.size();
    }

    public List J() {
        return this.f34513e;
    }

    public n K(int i10) {
        return (n) this.f34514f.get(i10);
    }

    public int L() {
        return this.f34514f.size();
    }

    public List M() {
        return this.f34514f;
    }

    public r N(int i10) {
        return (r) this.f34515g.get(i10);
    }

    public int O() {
        return this.f34515g.size();
    }

    public List P() {
        return this.f34515g;
    }

    public t Q() {
        return this.f34516h;
    }

    public w R() {
        return this.f34517i;
    }

    public boolean S() {
        return (this.f34512d & 1) == 1;
    }

    public boolean T() {
        return (this.f34512d & 2) == 2;
    }

    @Override // md.p
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return V();
    }

    @Override // md.p
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return W(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        for (int i10 = 0; i10 < this.f34513e.size(); i10++) {
            c5052f.c0(3, (md.p) this.f34513e.get(i10));
        }
        for (int i11 = 0; i11 < this.f34514f.size(); i11++) {
            c5052f.c0(4, (md.p) this.f34514f.get(i11));
        }
        for (int i12 = 0; i12 < this.f34515g.size(); i12++) {
            c5052f.c0(5, (md.p) this.f34515g.get(i12));
        }
        if ((this.f34512d & 1) == 1) {
            c5052f.c0(30, this.f34516h);
        }
        if ((this.f34512d & 2) == 2) {
            c5052f.c0(32, this.f34517i);
        }
        aVarS.a(200, c5052f);
        c5052f.h0(this.f34511c);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34519k;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f34513e.size(); i11++) {
            iR += C5052f.r(3, (md.p) this.f34513e.get(i11));
        }
        for (int i12 = 0; i12 < this.f34514f.size(); i12++) {
            iR += C5052f.r(4, (md.p) this.f34514f.get(i12));
        }
        for (int i13 = 0; i13 < this.f34515g.size(); i13++) {
            iR += C5052f.r(5, (md.p) this.f34515g.get(i13));
        }
        if ((this.f34512d & 1) == 1) {
            iR += C5052f.r(30, this.f34516h);
        }
        if ((this.f34512d & 2) == 2) {
            iR += C5052f.r(32, this.f34517i);
        }
        int iN = iR + n() + this.f34511c.size();
        this.f34519k = iN;
        return iN;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34518j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < I(); i10++) {
            if (!G(i10).isInitialized()) {
                this.f34518j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < L(); i11++) {
            if (!K(i11).isInitialized()) {
                this.f34518j = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < O(); i12++) {
            if (!N(i12).isInitialized()) {
                this.f34518j = (byte) 0;
                return false;
            }
        }
        if (S() && !Q().isInitialized()) {
            this.f34518j = (byte) 0;
            return false;
        }
        if (m()) {
            this.f34518j = (byte) 1;
            return true;
        }
        this.f34518j = (byte) 0;
        return false;
    }

    public l(i.c cVar) {
        super(cVar);
        this.f34518j = (byte) -1;
        this.f34519k = -1;
        this.f34511c = cVar.j();
    }

    public l(boolean z10) {
        this.f34518j = (byte) -1;
        this.f34519k = -1;
        this.f34511c = AbstractC5050d.f40294a;
    }

    public l(C5051e c5051e, C5053g c5053g) {
        this.f34518j = (byte) -1;
        this.f34519k = -1;
        U();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 != 1) {
                                this.f34513e = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.f34513e.add(c5051e.t(i.f34474w, c5053g));
                        } else if (iJ == 34) {
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 != 2) {
                                this.f34514f = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.f34514f.add(c5051e.t(n.f34542w, c5053g));
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                t.b bVarA = (this.f34512d & 1) == 1 ? this.f34516h.toBuilder() : null;
                                t tVar = (t) c5051e.t(t.f34700i, c5053g);
                                this.f34516h = tVar;
                                if (bVarA != null) {
                                    bVarA.m(tVar);
                                    this.f34516h = bVarA.q();
                                }
                                this.f34512d |= 1;
                            } else if (iJ != 258) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                w.b bVarV = (this.f34512d & 2) == 2 ? this.f34517i.toBuilder() : null;
                                w wVar = (w) c5051e.t(w.f34749g, c5053g);
                                this.f34517i = wVar;
                                if (bVarV != null) {
                                    bVarV.m(wVar);
                                    this.f34517i = bVarV.q();
                                }
                                this.f34512d |= 2;
                            }
                        } else {
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 != 4) {
                                this.f34515g = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.f34515g.add(c5051e.t(r.f34655q, c5053g));
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((i10 == true ? 1 : 0) & 1) == 1) {
                    this.f34513e = Collections.unmodifiableList(this.f34513e);
                }
                if (((i10 == true ? 1 : 0) & 2) == 2) {
                    this.f34514f = Collections.unmodifiableList(this.f34514f);
                }
                if (((i10 == true ? 1 : 0) & 4) == 4) {
                    this.f34515g = Collections.unmodifiableList(this.f34515g);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34511c = bVarT.f();
                    throw th2;
                }
                this.f34511c = bVarT.f();
                g();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f34513e = Collections.unmodifiableList(this.f34513e);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f34514f = Collections.unmodifiableList(this.f34514f);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f34515g = Collections.unmodifiableList(this.f34515g);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34511c = bVarT.f();
            throw th3;
        }
        this.f34511c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f34521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f34522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f34523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public t f34524h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public w f34525i;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34521e = list;
            this.f34522f = list;
            this.f34523g = list;
            this.f34524h = t.q();
            this.f34525i = w.o();
            A();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f34520d & 1) != 1) {
                this.f34521e = new ArrayList(this.f34521e);
                this.f34520d |= 1;
            }
        }

        private void y() {
            if ((this.f34520d & 2) != 2) {
                this.f34522f = new ArrayList(this.f34522f);
                this.f34520d |= 2;
            }
        }

        private void z() {
            if ((this.f34520d & 4) != 4) {
                this.f34523g = new ArrayList(this.f34523g);
                this.f34520d |= 4;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b m(l lVar) {
            if (lVar == l.E()) {
                return this;
            }
            if (!lVar.f34513e.isEmpty()) {
                if (this.f34521e.isEmpty()) {
                    this.f34521e = lVar.f34513e;
                    this.f34520d &= -2;
                } else {
                    x();
                    this.f34521e.addAll(lVar.f34513e);
                }
            }
            if (!lVar.f34514f.isEmpty()) {
                if (this.f34522f.isEmpty()) {
                    this.f34522f = lVar.f34514f;
                    this.f34520d &= -3;
                } else {
                    y();
                    this.f34522f.addAll(lVar.f34514f);
                }
            }
            if (!lVar.f34515g.isEmpty()) {
                if (this.f34523g.isEmpty()) {
                    this.f34523g = lVar.f34515g;
                    this.f34520d &= -5;
                } else {
                    z();
                    this.f34523g.addAll(lVar.f34515g);
                }
            }
            if (lVar.S()) {
                D(lVar.Q());
            }
            if (lVar.T()) {
                E(lVar.R());
            }
            r(lVar);
            n(j().d(lVar.f34511c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.l.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.l.f34510m     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.l r3 = (fd.l) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.l r4 = (fd.l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.l.b.v0(md.e, md.g):fd.l$b");
        }

        public b D(t tVar) {
            if ((this.f34520d & 8) != 8 || this.f34524h == t.q()) {
                this.f34524h = tVar;
            } else {
                this.f34524h = t.y(this.f34524h).m(tVar).q();
            }
            this.f34520d |= 8;
            return this;
        }

        public b E(w wVar) {
            if ((this.f34520d & 16) != 16 || this.f34525i == w.o()) {
                this.f34525i = wVar;
            } else {
                this.f34525i = w.t(this.f34525i).m(wVar).q();
            }
            this.f34520d |= 16;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public l build() {
            l lVarU = u();
            if (lVarU.isInitialized()) {
                return lVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(lVarU);
        }

        public l u() {
            l lVar = new l(this);
            int i10 = this.f34520d;
            if ((i10 & 1) == 1) {
                this.f34521e = Collections.unmodifiableList(this.f34521e);
                this.f34520d &= -2;
            }
            lVar.f34513e = this.f34521e;
            if ((this.f34520d & 2) == 2) {
                this.f34522f = Collections.unmodifiableList(this.f34522f);
                this.f34520d &= -3;
            }
            lVar.f34514f = this.f34522f;
            if ((this.f34520d & 4) == 4) {
                this.f34523g = Collections.unmodifiableList(this.f34523g);
                this.f34520d &= -5;
            }
            lVar.f34515g = this.f34523g;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            lVar.f34516h = this.f34524h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            lVar.f34517i = this.f34525i;
            lVar.f34512d = i11;
            return lVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        private void A() {
        }
    }
}
