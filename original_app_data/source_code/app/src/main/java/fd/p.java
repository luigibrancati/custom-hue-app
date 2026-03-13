package fd;

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
public final class p extends md.i implements md.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f34598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static md.r f34599g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public md.n f34601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f34602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34603e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p c(C5051e c5051e, C5053g c5053g) {
            return new p(c5051e, c5053g);
        }
    }

    static {
        p pVar = new p(true);
        f34598f = pVar;
        pVar.r();
    }

    public static p o() {
        return f34598f;
    }

    private void r() {
        this.f34601c = md.m.f40353b;
    }

    public static b s() {
        return b.s();
    }

    public static b t(p pVar) {
        return s().m(pVar);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f34601c.size(); i10++) {
            c5052f.N(1, this.f34601c.a0(i10));
        }
        c5052f.h0(this.f34600b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34603e;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f34601c.size(); i11++) {
            iE += C5052f.e(this.f34601c.a0(i11));
        }
        int size = iE + q().size() + this.f34600b.size();
        this.f34603e = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34602d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f34602d = (byte) 1;
        return true;
    }

    public String p(int i10) {
        return (String) this.f34601c.get(i10);
    }

    public md.s q() {
        return this.f34601c;
    }

    @Override // md.p
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return s();
    }

    @Override // md.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return t(this);
    }

    public p(i.b bVar) {
        super(bVar);
        this.f34602d = (byte) -1;
        this.f34603e = -1;
        this.f34600b = bVar.j();
    }

    public p(boolean z10) {
        this.f34602d = (byte) -1;
        this.f34603e = -1;
        this.f34600b = AbstractC5050d.f40294a;
    }

    public p(C5051e c5051e, C5053g c5053g) {
        this.f34602d = (byte) -1;
        this.f34603e = -1;
        r();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            AbstractC5050d abstractC5050dK = c5051e.k();
                            if (!z11) {
                                this.f34601c = new md.m();
                                z11 = true;
                            }
                            this.f34601c.G(abstractC5050dK);
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
                    this.f34601c = this.f34601c.u();
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34600b = bVarT.f();
                    throw th2;
                }
                this.f34600b = bVarT.f();
                g();
                throw th;
            }
        }
        if (z11) {
            this.f34601c = this.f34601c.u();
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34600b = bVarT.f();
            throw th3;
        }
        this.f34600b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public md.n f34605c = md.m.f40353b;

        public b() {
            u();
        }

        public static b s() {
            return new b();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p build() {
            p pVarQ = q();
            if (pVarQ.isInitialized()) {
                return pVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(pVarQ);
        }

        public p q() {
            p pVar = new p(this);
            if ((this.f34604b & 1) == 1) {
                this.f34605c = this.f34605c.u();
                this.f34604b &= -2;
            }
            pVar.f34601c = this.f34605c;
            return pVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34604b & 1) != 1) {
                this.f34605c = new md.m(this.f34605c);
                this.f34604b |= 1;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(p pVar) {
            if (pVar == p.o()) {
                return this;
            }
            if (!pVar.f34601c.isEmpty()) {
                if (this.f34605c.isEmpty()) {
                    this.f34605c = pVar.f34601c;
                    this.f34604b &= -2;
                } else {
                    t();
                    this.f34605c.addAll(pVar.f34601c);
                }
            }
            n(j().d(pVar.f34600b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.p.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.p.f34599g     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.p r3 = (fd.p) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.p r4 = (fd.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.p.b.v0(md.e, md.g):fd.p$b");
        }

        private void u() {
        }
    }
}
