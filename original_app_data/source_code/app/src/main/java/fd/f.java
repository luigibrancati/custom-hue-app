package fd;

import fd.h;
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
public final class f extends md.i implements md.q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f34428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static md.r f34429k = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f34432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f34433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f34434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f34435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f34436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34437i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public f c(C5051e c5051e, C5053g c5053g) {
            return new f(c5051e, c5053g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

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
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d implements j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements j.b {
            @Override // md.j.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i10) {
                return d.a(i10);
            }
        }

        d(int i10, int i11) {
            this.value = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        f fVar = new f(true);
        f34428j = fVar;
        fVar.B();
    }

    private void B() {
        this.f34432d = c.RETURNS_CONSTANT;
        this.f34433e = Collections.EMPTY_LIST;
        this.f34434f = h.z();
        this.f34435g = d.AT_MOST_ONCE;
    }

    public static b C() {
        return b.s();
    }

    public static b D(f fVar) {
        return C().m(fVar);
    }

    public static f t() {
        return f34428j;
    }

    public boolean A() {
        return (this.f34431c & 4) == 4;
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
        if ((this.f34431c & 1) == 1) {
            c5052f.R(1, this.f34432d.getNumber());
        }
        for (int i10 = 0; i10 < this.f34433e.size(); i10++) {
            c5052f.c0(2, (md.p) this.f34433e.get(i10));
        }
        if ((this.f34431c & 2) == 2) {
            c5052f.c0(3, this.f34434f);
        }
        if ((this.f34431c & 4) == 4) {
            c5052f.R(4, this.f34435g.getNumber());
        }
        c5052f.h0(this.f34430b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34437i;
        if (i10 != -1) {
            return i10;
        }
        int iH = (this.f34431c & 1) == 1 ? C5052f.h(1, this.f34432d.getNumber()) : 0;
        for (int i11 = 0; i11 < this.f34433e.size(); i11++) {
            iH += C5052f.r(2, (md.p) this.f34433e.get(i11));
        }
        if ((this.f34431c & 2) == 2) {
            iH += C5052f.r(3, this.f34434f);
        }
        if ((this.f34431c & 4) == 4) {
            iH += C5052f.h(4, this.f34435g.getNumber());
        }
        int size = iH + this.f34430b.size();
        this.f34437i = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34436h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < v(); i10++) {
            if (!u(i10).isInitialized()) {
                this.f34436h = (byte) 0;
                return false;
            }
        }
        if (!y() || s().isInitialized()) {
            this.f34436h = (byte) 1;
            return true;
        }
        this.f34436h = (byte) 0;
        return false;
    }

    public h s() {
        return this.f34434f;
    }

    public h u(int i10) {
        return (h) this.f34433e.get(i10);
    }

    public int v() {
        return this.f34433e.size();
    }

    public c w() {
        return this.f34432d;
    }

    public d x() {
        return this.f34435g;
    }

    public boolean y() {
        return (this.f34431c & 2) == 2;
    }

    public boolean z() {
        return (this.f34431c & 1) == 1;
    }

    public f(i.b bVar) {
        super(bVar);
        this.f34436h = (byte) -1;
        this.f34437i = -1;
        this.f34430b = bVar.j();
    }

    public f(boolean z10) {
        this.f34436h = (byte) -1;
        this.f34437i = -1;
        this.f34430b = AbstractC5050d.f40294a;
    }

    public f(C5051e c5051e, C5053g c5053g) {
        this.f34436h = (byte) -1;
        this.f34437i = -1;
        B();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
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
                                this.f34431c |= 1;
                                this.f34432d = cVarA;
                            }
                        } else if (iJ == 18) {
                            if ((c10 & 2) != 2) {
                                this.f34433e = new ArrayList();
                                c10 = 2;
                            }
                            this.f34433e.add(c5051e.t(h.f34453n, c5053g));
                        } else if (iJ == 26) {
                            h.b builder = (this.f34431c & 2) == 2 ? this.f34434f.toBuilder() : null;
                            h hVar = (h) c5051e.t(h.f34453n, c5053g);
                            this.f34434f = hVar;
                            if (builder != null) {
                                builder.m(hVar);
                                this.f34434f = builder.q();
                            }
                            this.f34431c |= 2;
                        } else if (iJ != 32) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            int iM2 = c5051e.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                c5052fI.n0(iJ);
                                c5052fI.n0(iM2);
                            } else {
                                this.f34431c |= 4;
                                this.f34435g = dVarA;
                            }
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((c10 & 2) == 2) {
                    this.f34433e = Collections.unmodifiableList(this.f34433e);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34430b = bVarT.f();
                    throw th2;
                }
                this.f34430b = bVarT.f();
                g();
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f34433e = Collections.unmodifiableList(this.f34433e);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34430b = bVarT.f();
            throw th3;
        }
        this.f34430b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f34439c = c.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f34440d = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h f34441e = h.z();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f34442f = d.AT_MOST_ONCE;

        public b() {
            u();
        }

        public static b s() {
            return new b();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarQ = q();
            if (fVarQ.isInitialized()) {
                return fVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(fVarQ);
        }

        public f q() {
            f fVar = new f(this);
            int i10 = this.f34438b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            fVar.f34432d = this.f34439c;
            if ((this.f34438b & 2) == 2) {
                this.f34440d = Collections.unmodifiableList(this.f34440d);
                this.f34438b &= -3;
            }
            fVar.f34433e = this.f34440d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            fVar.f34434f = this.f34441e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            fVar.f34435g = this.f34442f;
            fVar.f34431c = i11;
            return fVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34438b & 2) != 2) {
                this.f34440d = new ArrayList(this.f34440d);
                this.f34438b |= 2;
            }
        }

        public b v(h hVar) {
            if ((this.f34438b & 4) != 4 || this.f34441e == h.z()) {
                this.f34441e = hVar;
            } else {
                this.f34441e = h.O(this.f34441e).m(hVar).q();
            }
            this.f34438b |= 4;
            return this;
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b m(f fVar) {
            if (fVar == f.t()) {
                return this;
            }
            if (fVar.z()) {
                y(fVar.w());
            }
            if (!fVar.f34433e.isEmpty()) {
                if (this.f34440d.isEmpty()) {
                    this.f34440d = fVar.f34433e;
                    this.f34438b &= -3;
                } else {
                    t();
                    this.f34440d.addAll(fVar.f34433e);
                }
            }
            if (fVar.y()) {
                v(fVar.s());
            }
            if (fVar.A()) {
                z(fVar.x());
            }
            n(j().d(fVar.f34430b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.f.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.f.f34429k     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.f r3 = (fd.f) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.f r4 = (fd.f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.f.b.v0(md.e, md.g):fd.f$b");
        }

        public b y(c cVar) {
            cVar.getClass();
            this.f34438b |= 1;
            this.f34439c = cVar;
            return this;
        }

        public b z(d dVar) {
            dVar.getClass();
            this.f34438b |= 8;
            this.f34442f = dVar;
            return this;
        }

        private void u() {
        }
    }
}
