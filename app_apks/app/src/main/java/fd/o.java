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
public final class o extends md.i implements md.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f34577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static md.r f34578g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f34580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f34581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34582e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public o c(C5051e c5051e, C5053g c5053g) {
            return new o(c5051e, c5053g);
        }
    }

    static {
        o oVar = new o(true);
        f34577f = oVar;
        oVar.r();
    }

    public static o o() {
        return f34577f;
    }

    private void r() {
        this.f34580c = Collections.EMPTY_LIST;
    }

    public static b s() {
        return b.s();
    }

    public static b t(o oVar) {
        return s().m(oVar);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f34580c.size(); i10++) {
            c5052f.c0(1, (md.p) this.f34580c.get(i10));
        }
        c5052f.h0(this.f34579b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34582e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f34580c.size(); i11++) {
            iR += C5052f.r(1, (md.p) this.f34580c.get(i11));
        }
        int size = iR + this.f34579b.size();
        this.f34582e = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34581d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < q(); i10++) {
            if (!p(i10).isInitialized()) {
                this.f34581d = (byte) 0;
                return false;
            }
        }
        this.f34581d = (byte) 1;
        return true;
    }

    public c p(int i10) {
        return (c) this.f34580c.get(i10);
    }

    public int q() {
        return this.f34580c.size();
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

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends md.i implements md.q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f34585i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static md.r f34586j = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f34587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public EnumC0447c f34591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f34592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34593h;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c c(C5051e c5051e, C5053g c5053g) {
                return new c(c5051e, c5053g);
            }
        }

        /* JADX INFO: renamed from: fd.o$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum EnumC0447c implements j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static j.b internalValueMap = new a();
            private final int value;

            /* JADX INFO: renamed from: fd.o$c$c$a */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class a implements j.b {
                @Override // md.j.b
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EnumC0447c findValueByNumber(int i10) {
                    return EnumC0447c.a(i10);
                }
            }

            EnumC0447c(int i10, int i11) {
                this.value = i11;
            }

            public static EnumC0447c a(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // md.j.a
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            c cVar = new c(true);
            f34585i = cVar;
            cVar.x();
        }

        public static c q() {
            return f34585i;
        }

        private void x() {
            this.f34589d = -1;
            this.f34590e = 0;
            this.f34591f = EnumC0447c.PACKAGE;
        }

        public static b y() {
            return b.s();
        }

        public static b z(c cVar) {
            return y().m(cVar);
        }

        @Override // md.p
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return y();
        }

        @Override // md.p
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return z(this);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            if ((this.f34588c & 1) == 1) {
                c5052f.Z(1, this.f34589d);
            }
            if ((this.f34588c & 2) == 2) {
                c5052f.Z(2, this.f34590e);
            }
            if ((this.f34588c & 4) == 4) {
                c5052f.R(3, this.f34591f.getNumber());
            }
            c5052f.h0(this.f34587b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f34593h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f34588c & 1) == 1 ? C5052f.o(1, this.f34589d) : 0;
            if ((this.f34588c & 2) == 2) {
                iO += C5052f.o(2, this.f34590e);
            }
            if ((this.f34588c & 4) == 4) {
                iO += C5052f.h(3, this.f34591f.getNumber());
            }
            int size = iO + this.f34587b.size();
            this.f34593h = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f34592g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (w()) {
                this.f34592g = (byte) 1;
                return true;
            }
            this.f34592g = (byte) 0;
            return false;
        }

        public EnumC0447c r() {
            return this.f34591f;
        }

        public int s() {
            return this.f34589d;
        }

        public int t() {
            return this.f34590e;
        }

        public boolean u() {
            return (this.f34588c & 4) == 4;
        }

        public boolean v() {
            return (this.f34588c & 1) == 1;
        }

        public boolean w() {
            return (this.f34588c & 2) == 2;
        }

        public c(i.b bVar) {
            super(bVar);
            this.f34592g = (byte) -1;
            this.f34593h = -1;
            this.f34587b = bVar.j();
        }

        public c(boolean z10) {
            this.f34592g = (byte) -1;
            this.f34593h = -1;
            this.f34587b = AbstractC5050d.f40294a;
        }

        public c(C5051e c5051e, C5053g c5053g) {
            this.f34592g = (byte) -1;
            this.f34593h = -1;
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
                                    this.f34588c |= 1;
                                    this.f34589d = c5051e.r();
                                } else if (iJ == 16) {
                                    this.f34588c |= 2;
                                    this.f34590e = c5051e.r();
                                } else if (iJ != 24) {
                                    if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                    }
                                } else {
                                    int iM = c5051e.m();
                                    EnumC0447c enumC0447cA = EnumC0447c.a(iM);
                                    if (enumC0447cA == null) {
                                        c5052fI.n0(iJ);
                                        c5052fI.n0(iM);
                                    } else {
                                        this.f34588c |= 4;
                                        this.f34591f = enumC0447cA;
                                    }
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
                        this.f34587b = bVarT.f();
                        throw th2;
                    }
                    this.f34587b = bVarT.f();
                    g();
                    throw th;
                }
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f34587b = bVarT.f();
                throw th3;
            }
            this.f34587b = bVarT.f();
            g();
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends i.b implements md.q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f34594b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f34596d;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f34595c = -1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public EnumC0447c f34597e = EnumC0447c.PACKAGE;

            public b() {
                t();
            }

            public static b s() {
                return new b();
            }

            @Override // md.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarQ = q();
                if (cVarQ.isInitialized()) {
                    return cVarQ;
                }
                throw AbstractC5047a.AbstractC0530a.i(cVarQ);
            }

            public c q() {
                c cVar = new c(this);
                int i10 = this.f34594b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f34589d = this.f34595c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f34590e = this.f34596d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f34591f = this.f34597e;
                cVar.f34588c = i11;
                return cVar;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e() {
                return s().m(q());
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b m(c cVar) {
                if (cVar == c.q()) {
                    return this;
                }
                if (cVar.v()) {
                    x(cVar.s());
                }
                if (cVar.w()) {
                    y(cVar.t());
                }
                if (cVar.u()) {
                    w(cVar.r());
                }
                n(j().d(cVar.f34587b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public fd.o.c.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = fd.o.c.f34586j     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    fd.o$c r3 = (fd.o.c) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                    fd.o$c r4 = (fd.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: fd.o.c.b.v0(md.e, md.g):fd.o$c$b");
            }

            public b w(EnumC0447c enumC0447c) {
                enumC0447c.getClass();
                this.f34594b |= 4;
                this.f34597e = enumC0447c;
                return this;
            }

            public b x(int i10) {
                this.f34594b |= 1;
                this.f34595c = i10;
                return this;
            }

            public b y(int i10) {
                this.f34594b |= 2;
                this.f34596d = i10;
                return this;
            }

            private void t() {
            }
        }
    }

    public o(i.b bVar) {
        super(bVar);
        this.f34581d = (byte) -1;
        this.f34582e = -1;
        this.f34579b = bVar.j();
    }

    public o(boolean z10) {
        this.f34581d = (byte) -1;
        this.f34582e = -1;
        this.f34579b = AbstractC5050d.f40294a;
    }

    public o(C5051e c5051e, C5053g c5053g) {
        this.f34581d = (byte) -1;
        this.f34582e = -1;
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
                                this.f34580c = new ArrayList();
                                z11 = true;
                            }
                            this.f34580c.add(c5051e.t(c.f34586j, c5053g));
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
                    this.f34580c = Collections.unmodifiableList(this.f34580c);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34579b = bVarT.f();
                    throw th2;
                }
                this.f34579b = bVarT.f();
                g();
                throw th;
            }
        }
        if (z11) {
            this.f34580c = Collections.unmodifiableList(this.f34580c);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34579b = bVarT.f();
            throw th3;
        }
        this.f34579b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f34584c = Collections.EMPTY_LIST;

        public b() {
            u();
        }

        public static b s() {
            return new b();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public o build() {
            o oVarQ = q();
            if (oVarQ.isInitialized()) {
                return oVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(oVarQ);
        }

        public o q() {
            o oVar = new o(this);
            if ((this.f34583b & 1) == 1) {
                this.f34584c = Collections.unmodifiableList(this.f34584c);
                this.f34583b &= -2;
            }
            oVar.f34580c = this.f34584c;
            return oVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34583b & 1) != 1) {
                this.f34584c = new ArrayList(this.f34584c);
                this.f34583b |= 1;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(o oVar) {
            if (oVar == o.o()) {
                return this;
            }
            if (!oVar.f34580c.isEmpty()) {
                if (this.f34584c.isEmpty()) {
                    this.f34584c = oVar.f34580c;
                    this.f34583b &= -2;
                } else {
                    t();
                    this.f34584c.addAll(oVar.f34580c);
                }
            }
            n(j().d(oVar.f34579b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.o.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.o.f34578g     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.o r3 = (fd.o) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.o r4 = (fd.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.o.b.v0(md.e, md.g):fd.o$b");
        }

        private void u() {
        }
    }
}
