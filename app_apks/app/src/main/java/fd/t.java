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
public final class t extends md.i implements md.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f34699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static md.r f34700i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f34703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f34705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34706g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public t c(C5051e c5051e, C5053g c5053g) {
            return new t(c5051e, c5053g);
        }
    }

    static {
        t tVar = new t(true);
        f34699h = tVar;
        tVar.w();
    }

    public static t q() {
        return f34699h;
    }

    private void w() {
        this.f34703d = Collections.EMPTY_LIST;
        this.f34704e = -1;
    }

    public static b x() {
        return b.s();
    }

    public static b y(t tVar) {
        return x().m(tVar);
    }

    @Override // md.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return y(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f34703d.size(); i10++) {
            c5052f.c0(1, (md.p) this.f34703d.get(i10));
        }
        if ((this.f34702c & 1) == 1) {
            c5052f.Z(2, this.f34704e);
        }
        c5052f.h0(this.f34701b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34706g;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f34703d.size(); i11++) {
            iO += C5052f.r(1, (md.p) this.f34703d.get(i11));
        }
        if ((this.f34702c & 1) == 1) {
            iO += C5052f.o(2, this.f34704e);
        }
        int size = iO + this.f34701b.size();
        this.f34706g = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34705f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < t(); i10++) {
            if (!s(i10).isInitialized()) {
                this.f34705f = (byte) 0;
                return false;
            }
        }
        this.f34705f = (byte) 1;
        return true;
    }

    public int r() {
        return this.f34704e;
    }

    public q s(int i10) {
        return (q) this.f34703d.get(i10);
    }

    public int t() {
        return this.f34703d.size();
    }

    public List u() {
        return this.f34703d;
    }

    public boolean v() {
        return (this.f34702c & 1) == 1;
    }

    @Override // md.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return x();
    }

    public t(i.b bVar) {
        super(bVar);
        this.f34705f = (byte) -1;
        this.f34706g = -1;
        this.f34701b = bVar.j();
    }

    public t(boolean z10) {
        this.f34705f = (byte) -1;
        this.f34706g = -1;
        this.f34701b = AbstractC5050d.f40294a;
    }

    public t(C5051e c5051e, C5053g c5053g) {
        this.f34705f = (byte) -1;
        this.f34706g = -1;
        w();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z11) {
                                this.f34703d = new ArrayList();
                                z11 = true;
                            }
                            this.f34703d.add(c5051e.t(q.f34607v, c5053g));
                        } else if (iJ != 16) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            this.f34702c |= 1;
                            this.f34704e = c5051e.r();
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f34703d = Collections.unmodifiableList(this.f34703d);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34701b = bVarT.f();
                    throw th2;
                }
                this.f34701b = bVarT.f();
                g();
                throw th;
            }
        }
        if (z11) {
            this.f34703d = Collections.unmodifiableList(this.f34703d);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34701b = bVarT.f();
            throw th3;
        }
        this.f34701b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f34708c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34709d = -1;

        public b() {
            u();
        }

        public static b s() {
            return new b();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public t build() {
            t tVarQ = q();
            if (tVarQ.isInitialized()) {
                return tVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(tVarQ);
        }

        public t q() {
            t tVar = new t(this);
            int i10 = this.f34707b;
            if ((i10 & 1) == 1) {
                this.f34708c = Collections.unmodifiableList(this.f34708c);
                this.f34707b &= -2;
            }
            tVar.f34703d = this.f34708c;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            tVar.f34704e = this.f34709d;
            tVar.f34702c = i11;
            return tVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34707b & 1) != 1) {
                this.f34708c = new ArrayList(this.f34708c);
                this.f34707b |= 1;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(t tVar) {
            if (tVar == t.q()) {
                return this;
            }
            if (!tVar.f34703d.isEmpty()) {
                if (this.f34708c.isEmpty()) {
                    this.f34708c = tVar.f34703d;
                    this.f34707b &= -2;
                } else {
                    t();
                    this.f34708c.addAll(tVar.f34703d);
                }
            }
            if (tVar.v()) {
                x(tVar.r());
            }
            n(j().d(tVar.f34701b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.t.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.t.f34700i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.t r3 = (fd.t) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.t r4 = (fd.t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.t.b.v0(md.e, md.g):fd.t$b");
        }

        public b x(int i10) {
            this.f34707b |= 2;
            this.f34709d = i10;
            return this;
        }

        private void u() {
        }
    }
}
