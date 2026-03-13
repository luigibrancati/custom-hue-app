package fd;

import fd.l;
import fd.o;
import fd.p;
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
public final class m extends i.d implements md.q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f34526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static md.r f34527l = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f34530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f34531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f34532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f34533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f34534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34535j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public m c(C5051e c5051e, C5053g c5053g) {
            return new m(c5051e, c5053g);
        }
    }

    static {
        m mVar = new m(true);
        f34526k = mVar;
        mVar.N();
    }

    public static m E() {
        return f34526k;
    }

    private void N() {
        this.f34530e = p.o();
        this.f34531f = o.o();
        this.f34532g = l.E();
        this.f34533h = Collections.EMPTY_LIST;
    }

    public static b O() {
        return b.w();
    }

    public static b P(m mVar) {
        return O().m(mVar);
    }

    public static m R(InputStream inputStream, C5053g c5053g) {
        return (m) f34527l.b(inputStream, c5053g);
    }

    public c B(int i10) {
        return (c) this.f34533h.get(i10);
    }

    public int C() {
        return this.f34533h.size();
    }

    public List D() {
        return this.f34533h;
    }

    @Override // md.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public m getDefaultInstanceForType() {
        return f34526k;
    }

    public l G() {
        return this.f34532g;
    }

    public o I() {
        return this.f34531f;
    }

    public p J() {
        return this.f34530e;
    }

    public boolean K() {
        return (this.f34529d & 4) == 4;
    }

    public boolean L() {
        return (this.f34529d & 2) == 2;
    }

    public boolean M() {
        return (this.f34529d & 1) == 1;
    }

    @Override // md.p
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return O();
    }

    @Override // md.p
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return P(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34529d & 1) == 1) {
            c5052f.c0(1, this.f34530e);
        }
        if ((this.f34529d & 2) == 2) {
            c5052f.c0(2, this.f34531f);
        }
        if ((this.f34529d & 4) == 4) {
            c5052f.c0(3, this.f34532g);
        }
        for (int i10 = 0; i10 < this.f34533h.size(); i10++) {
            c5052f.c0(4, (md.p) this.f34533h.get(i10));
        }
        aVarS.a(200, c5052f);
        c5052f.h0(this.f34528c);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34535j;
        if (i10 != -1) {
            return i10;
        }
        int iR = (this.f34529d & 1) == 1 ? C5052f.r(1, this.f34530e) : 0;
        if ((this.f34529d & 2) == 2) {
            iR += C5052f.r(2, this.f34531f);
        }
        if ((this.f34529d & 4) == 4) {
            iR += C5052f.r(3, this.f34532g);
        }
        for (int i11 = 0; i11 < this.f34533h.size(); i11++) {
            iR += C5052f.r(4, (md.p) this.f34533h.get(i11));
        }
        int iN = iR + n() + this.f34528c.size();
        this.f34535j = iN;
        return iN;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34534i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (L() && !I().isInitialized()) {
            this.f34534i = (byte) 0;
            return false;
        }
        if (K() && !G().isInitialized()) {
            this.f34534i = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < C(); i10++) {
            if (!B(i10).isInitialized()) {
                this.f34534i = (byte) 0;
                return false;
            }
        }
        if (m()) {
            this.f34534i = (byte) 1;
            return true;
        }
        this.f34534i = (byte) 0;
        return false;
    }

    public m(i.c cVar) {
        super(cVar);
        this.f34534i = (byte) -1;
        this.f34535j = -1;
        this.f34528c = cVar.j();
    }

    public m(boolean z10) {
        this.f34534i = (byte) -1;
        this.f34535j = -1;
        this.f34528c = AbstractC5050d.f40294a;
    }

    public m(C5051e c5051e, C5053g c5053g) {
        this.f34534i = (byte) -1;
        this.f34535j = -1;
        N();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            p.b builder = (this.f34529d & 1) == 1 ? this.f34530e.toBuilder() : null;
                            p pVar = (p) c5051e.t(p.f34599g, c5053g);
                            this.f34530e = pVar;
                            if (builder != null) {
                                builder.m(pVar);
                                this.f34530e = builder.q();
                            }
                            this.f34529d |= 1;
                        } else if (iJ == 18) {
                            o.b builder2 = (this.f34529d & 2) == 2 ? this.f34531f.toBuilder() : null;
                            o oVar = (o) c5051e.t(o.f34578g, c5053g);
                            this.f34531f = oVar;
                            if (builder2 != null) {
                                builder2.m(oVar);
                                this.f34531f = builder2.q();
                            }
                            this.f34529d |= 2;
                        } else if (iJ == 26) {
                            l.b builder3 = (this.f34529d & 4) == 4 ? this.f34532g.toBuilder() : null;
                            l lVar = (l) c5051e.t(l.f34510m, c5053g);
                            this.f34532g = lVar;
                            if (builder3 != null) {
                                builder3.m(lVar);
                                this.f34532g = builder3.u();
                            }
                            this.f34529d |= 4;
                        } else if (iJ != 34) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            int i10 = (c10 == true ? 1 : 0) & '\b';
                            c10 = c10;
                            if (i10 != 8) {
                                this.f34533h = new ArrayList();
                                c10 = '\b';
                            }
                            this.f34533h.add(c5051e.t(c.f34347Q, c5053g));
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f34533h = Collections.unmodifiableList(this.f34533h);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34528c = bVarT.f();
                    throw th2;
                }
                this.f34528c = bVarT.f();
                g();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f34533h = Collections.unmodifiableList(this.f34533h);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34528c = bVarT.f();
            throw th3;
        }
        this.f34528c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p f34537e = p.o();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o f34538f = o.o();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public l f34539g = l.E();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f34540h = Collections.EMPTY_LIST;

        public b() {
            y();
        }

        public static b w() {
            return new b();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.m.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.m.f34527l     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.m r3 = (fd.m) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.m r4 = (fd.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.m.b.v0(md.e, md.g):fd.m$b");
        }

        public b B(l lVar) {
            if ((this.f34536d & 4) != 4 || this.f34539g == l.E()) {
                this.f34539g = lVar;
            } else {
                this.f34539g = l.W(this.f34539g).m(lVar).u();
            }
            this.f34536d |= 4;
            return this;
        }

        public b C(o oVar) {
            if ((this.f34536d & 2) != 2 || this.f34538f == o.o()) {
                this.f34538f = oVar;
            } else {
                this.f34538f = o.t(this.f34538f).m(oVar).q();
            }
            this.f34536d |= 2;
            return this;
        }

        public b D(p pVar) {
            if ((this.f34536d & 1) != 1 || this.f34537e == p.o()) {
                this.f34537e = pVar;
            } else {
                this.f34537e = p.t(this.f34537e).m(pVar).q();
            }
            this.f34536d |= 1;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public m build() {
            m mVarU = u();
            if (mVarU.isInitialized()) {
                return mVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(mVarU);
        }

        public m u() {
            m mVar = new m(this);
            int i10 = this.f34536d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            mVar.f34530e = this.f34537e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            mVar.f34531f = this.f34538f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            mVar.f34532g = this.f34539g;
            if ((this.f34536d & 8) == 8) {
                this.f34540h = Collections.unmodifiableList(this.f34540h);
                this.f34536d &= -9;
            }
            mVar.f34533h = this.f34540h;
            mVar.f34529d = i11;
            return mVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        public final void x() {
            if ((this.f34536d & 8) != 8) {
                this.f34540h = new ArrayList(this.f34540h);
                this.f34536d |= 8;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b m(m mVar) {
            if (mVar == m.E()) {
                return this;
            }
            if (mVar.M()) {
                D(mVar.J());
            }
            if (mVar.L()) {
                C(mVar.I());
            }
            if (mVar.K()) {
                B(mVar.G());
            }
            if (!mVar.f34533h.isEmpty()) {
                if (this.f34540h.isEmpty()) {
                    this.f34540h = mVar.f34533h;
                    this.f34536d &= -9;
                } else {
                    x();
                    this.f34540h.addAll(mVar.f34533h);
                }
            }
            r(mVar);
            n(j().d(mVar.f34528c));
            return this;
        }

        private void y() {
        }
    }
}
