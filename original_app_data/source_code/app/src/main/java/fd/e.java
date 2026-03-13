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
public final class e extends md.i implements md.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f34420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static md.r f34421g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f34423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f34424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34425e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public e c(C5051e c5051e, C5053g c5053g) {
            return new e(c5051e, c5053g);
        }
    }

    static {
        e eVar = new e(true);
        f34420f = eVar;
        eVar.r();
    }

    public static e o() {
        return f34420f;
    }

    private void r() {
        this.f34423c = Collections.EMPTY_LIST;
    }

    public static b s() {
        return b.s();
    }

    public static b t(e eVar) {
        return s().m(eVar);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f34423c.size(); i10++) {
            c5052f.c0(1, (md.p) this.f34423c.get(i10));
        }
        c5052f.h0(this.f34422b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34425e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f34423c.size(); i11++) {
            iR += C5052f.r(1, (md.p) this.f34423c.get(i11));
        }
        int size = iR + this.f34422b.size();
        this.f34425e = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34424d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < q(); i10++) {
            if (!p(i10).isInitialized()) {
                this.f34424d = (byte) 0;
                return false;
            }
        }
        this.f34424d = (byte) 1;
        return true;
    }

    public f p(int i10) {
        return (f) this.f34423c.get(i10);
    }

    public int q() {
        return this.f34423c.size();
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

    public e(i.b bVar) {
        super(bVar);
        this.f34424d = (byte) -1;
        this.f34425e = -1;
        this.f34422b = bVar.j();
    }

    public e(boolean z10) {
        this.f34424d = (byte) -1;
        this.f34425e = -1;
        this.f34422b = AbstractC5050d.f40294a;
    }

    public e(C5051e c5051e, C5053g c5053g) {
        this.f34424d = (byte) -1;
        this.f34425e = -1;
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
                            if (!z11) {
                                this.f34423c = new ArrayList();
                                z11 = true;
                            }
                            this.f34423c.add(c5051e.t(f.f34429k, c5053g));
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
                    this.f34423c = Collections.unmodifiableList(this.f34423c);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34422b = bVarT.f();
                    throw th2;
                }
                this.f34422b = bVarT.f();
                g();
                throw th;
            }
        }
        if (z11) {
            this.f34423c = Collections.unmodifiableList(this.f34423c);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34422b = bVarT.f();
            throw th3;
        }
        this.f34422b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f34427c = Collections.EMPTY_LIST;

        public b() {
            u();
        }

        public static b s() {
            return new b();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVarQ = q();
            if (eVarQ.isInitialized()) {
                return eVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(eVarQ);
        }

        public e q() {
            e eVar = new e(this);
            if ((this.f34426b & 1) == 1) {
                this.f34427c = Collections.unmodifiableList(this.f34427c);
                this.f34426b &= -2;
            }
            eVar.f34423c = this.f34427c;
            return eVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34426b & 1) != 1) {
                this.f34427c = new ArrayList(this.f34427c);
                this.f34426b |= 1;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(e eVar) {
            if (eVar == e.o()) {
                return this;
            }
            if (!eVar.f34423c.isEmpty()) {
                if (this.f34427c.isEmpty()) {
                    this.f34427c = eVar.f34423c;
                    this.f34426b &= -2;
                } else {
                    t();
                    this.f34427c.addAll(eVar.f34423c);
                }
            }
            n(j().d(eVar.f34422b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.e.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.e.f34421g     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.e r3 = (fd.e) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.e r4 = (fd.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.e.b.v0(md.e, md.g):fd.e$b");
        }

        private void u() {
        }
    }
}
