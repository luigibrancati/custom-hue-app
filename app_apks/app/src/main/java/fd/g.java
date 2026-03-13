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
public final class g extends i.d implements md.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f34443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static md.r f34444i = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f34448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34449g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g c(C5051e c5051e, C5053g c5053g) {
            return new g(c5051e, c5053g);
        }
    }

    static {
        g gVar = new g(true);
        f34443h = gVar;
        gVar.B();
    }

    private void B() {
        this.f34447e = 0;
    }

    public static b C() {
        return b.w();
    }

    public static b D(g gVar) {
        return C().m(gVar);
    }

    public static g x() {
        return f34443h;
    }

    public boolean A() {
        return (this.f34446d & 1) == 1;
    }

    @Override // md.p
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return C();
    }

    @Override // md.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return D(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34446d & 1) == 1) {
            c5052f.Z(1, this.f34447e);
        }
        aVarS.a(200, c5052f);
        c5052f.h0(this.f34445c);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34449g;
        if (i10 != -1) {
            return i10;
        }
        int iO = ((this.f34446d & 1) == 1 ? C5052f.o(1, this.f34447e) : 0) + n() + this.f34445c.size();
        this.f34449g = iO;
        return iO;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34448f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (m()) {
            this.f34448f = (byte) 1;
            return true;
        }
        this.f34448f = (byte) 0;
        return false;
    }

    @Override // md.q
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public g getDefaultInstanceForType() {
        return f34443h;
    }

    public int z() {
        return this.f34447e;
    }

    public g(i.c cVar) {
        super(cVar);
        this.f34448f = (byte) -1;
        this.f34449g = -1;
        this.f34445c = cVar.j();
    }

    public g(boolean z10) {
        this.f34448f = (byte) -1;
        this.f34449g = -1;
        this.f34445c = AbstractC5050d.f40294a;
    }

    public g(C5051e c5051e, C5053g c5053g) {
        this.f34448f = (byte) -1;
        this.f34449g = -1;
        B();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ != 8) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            this.f34446d |= 1;
                            this.f34447e = c5051e.r();
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
                    this.f34445c = bVarT.f();
                    throw th2;
                }
                this.f34445c = bVarT.f();
                g();
                throw th;
            }
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34445c = bVarT.f();
            throw th3;
        }
        this.f34445c = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34451e;

        public b() {
            x();
        }

        public static b w() {
            return new b();
        }

        public b A(int i10) {
            this.f34450d |= 1;
            this.f34451e = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public g build() {
            g gVarU = u();
            if (gVarU.isInitialized()) {
                return gVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(gVarU);
        }

        public g u() {
            g gVar = new g(this);
            int i10 = (this.f34450d & 1) != 1 ? 0 : 1;
            gVar.f34447e = this.f34451e;
            gVar.f34446d = i10;
            return gVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b m(g gVar) {
            if (gVar == g.x()) {
                return this;
            }
            if (gVar.A()) {
                A(gVar.z());
            }
            r(gVar);
            n(j().d(gVar.f34445c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.g.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.g.f34444i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.g r3 = (fd.g) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.g r4 = (fd.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.g.b.v0(md.e, md.g):fd.g$b");
        }

        private void x() {
        }
    }
}
