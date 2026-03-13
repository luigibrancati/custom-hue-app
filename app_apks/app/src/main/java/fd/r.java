package fd;

import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.q;
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
public final class r extends i.d implements md.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r f34654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static md.r f34655q = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f34660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f34661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f34663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f34665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f34666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f34667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34668o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public r c(C5051e c5051e, C5053g c5053g) {
            return new r(c5051e, c5053g);
        }
    }

    static {
        r rVar = new r(true);
        f34654p = rVar;
        rVar.e0();
    }

    public static r M() {
        return f34654p;
    }

    private void e0() {
        this.f34658e = 6;
        this.f34659f = 0;
        List list = Collections.EMPTY_LIST;
        this.f34660g = list;
        this.f34661h = q.S();
        this.f34662i = 0;
        this.f34663j = q.S();
        this.f34664k = 0;
        this.f34665l = list;
        this.f34666m = list;
    }

    public static b f0() {
        return b.w();
    }

    public static b g0(r rVar) {
        return f0().m(rVar);
    }

    public static r i0(InputStream inputStream, C5053g c5053g) {
        return (r) f34655q.a(inputStream, c5053g);
    }

    public fd.b J(int i10) {
        return (fd.b) this.f34665l.get(i10);
    }

    public int K() {
        return this.f34665l.size();
    }

    public List L() {
        return this.f34665l;
    }

    @Override // md.q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public r getDefaultInstanceForType() {
        return f34654p;
    }

    public q O() {
        return this.f34663j;
    }

    public int P() {
        return this.f34664k;
    }

    public int Q() {
        return this.f34658e;
    }

    public int R() {
        return this.f34659f;
    }

    public s S(int i10) {
        return (s) this.f34660g.get(i10);
    }

    public int T() {
        return this.f34660g.size();
    }

    public List U() {
        return this.f34660g;
    }

    public q V() {
        return this.f34661h;
    }

    public int W() {
        return this.f34662i;
    }

    public List X() {
        return this.f34666m;
    }

    public boolean Y() {
        return (this.f34657d & 16) == 16;
    }

    public boolean Z() {
        return (this.f34657d & 32) == 32;
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34657d & 1) == 1) {
            c5052f.Z(1, this.f34658e);
        }
        if ((this.f34657d & 2) == 2) {
            c5052f.Z(2, this.f34659f);
        }
        for (int i10 = 0; i10 < this.f34660g.size(); i10++) {
            c5052f.c0(3, (md.p) this.f34660g.get(i10));
        }
        if ((this.f34657d & 4) == 4) {
            c5052f.c0(4, this.f34661h);
        }
        if ((this.f34657d & 8) == 8) {
            c5052f.Z(5, this.f34662i);
        }
        if ((this.f34657d & 16) == 16) {
            c5052f.c0(6, this.f34663j);
        }
        if ((this.f34657d & 32) == 32) {
            c5052f.Z(7, this.f34664k);
        }
        for (int i11 = 0; i11 < this.f34665l.size(); i11++) {
            c5052f.c0(8, (md.p) this.f34665l.get(i11));
        }
        for (int i12 = 0; i12 < this.f34666m.size(); i12++) {
            c5052f.Z(31, ((Integer) this.f34666m.get(i12)).intValue());
        }
        aVarS.a(200, c5052f);
        c5052f.h0(this.f34656c);
    }

    public boolean a0() {
        return (this.f34657d & 1) == 1;
    }

    public boolean b0() {
        return (this.f34657d & 2) == 2;
    }

    public boolean c0() {
        return (this.f34657d & 4) == 4;
    }

    public boolean d0() {
        return (this.f34657d & 8) == 8;
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34668o;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34657d & 1) == 1 ? C5052f.o(1, this.f34658e) : 0;
        if ((this.f34657d & 2) == 2) {
            iO += C5052f.o(2, this.f34659f);
        }
        for (int i11 = 0; i11 < this.f34660g.size(); i11++) {
            iO += C5052f.r(3, (md.p) this.f34660g.get(i11));
        }
        if ((this.f34657d & 4) == 4) {
            iO += C5052f.r(4, this.f34661h);
        }
        if ((this.f34657d & 8) == 8) {
            iO += C5052f.o(5, this.f34662i);
        }
        if ((this.f34657d & 16) == 16) {
            iO += C5052f.r(6, this.f34663j);
        }
        if ((this.f34657d & 32) == 32) {
            iO += C5052f.o(7, this.f34664k);
        }
        for (int i12 = 0; i12 < this.f34665l.size(); i12++) {
            iO += C5052f.r(8, (md.p) this.f34665l.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f34666m.size(); i13++) {
            iP += C5052f.p(((Integer) this.f34666m.get(i13)).intValue());
        }
        int size = iO + iP + (X().size() * 2) + n() + this.f34656c.size();
        this.f34668o = size;
        return size;
    }

    @Override // md.p
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return f0();
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34667n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!b0()) {
            this.f34667n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < T(); i10++) {
            if (!S(i10).isInitialized()) {
                this.f34667n = (byte) 0;
                return false;
            }
        }
        if (c0() && !V().isInitialized()) {
            this.f34667n = (byte) 0;
            return false;
        }
        if (Y() && !O().isInitialized()) {
            this.f34667n = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < K(); i11++) {
            if (!J(i11).isInitialized()) {
                this.f34667n = (byte) 0;
                return false;
            }
        }
        if (m()) {
            this.f34667n = (byte) 1;
            return true;
        }
        this.f34667n = (byte) 0;
        return false;
    }

    @Override // md.p
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return g0(this);
    }

    public r(i.c cVar) {
        super(cVar);
        this.f34667n = (byte) -1;
        this.f34668o = -1;
        this.f34656c = cVar.j();
    }

    public r(boolean z10) {
        this.f34667n = (byte) -1;
        this.f34668o = -1;
        this.f34656c = AbstractC5050d.f40294a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public r(C5051e c5051e, C5053g c5053g) {
        q.c builder;
        this.f34667n = (byte) -1;
        this.f34668o = -1;
        e0();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? J10 = 128;
            if (!z10) {
                try {
                    try {
                        int iJ = c5051e.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f34657d |= 1;
                                this.f34658e = c5051e.r();
                                break;
                            case 16:
                                this.f34657d |= 2;
                                this.f34659f = c5051e.r();
                                break;
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f34660g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f34660g.add(c5051e.t(s.f34680o, c5053g));
                                break;
                            case 34:
                                builder = (this.f34657d & 4) == 4 ? this.f34661h.toBuilder() : null;
                                q qVar = (q) c5051e.t(q.f34607v, c5053g);
                                this.f34661h = qVar;
                                if (builder != null) {
                                    builder.m(qVar);
                                    this.f34661h = builder.u();
                                }
                                this.f34657d |= 4;
                                break;
                            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                this.f34657d |= 8;
                                this.f34662i = c5051e.r();
                                break;
                            case 50:
                                builder = (this.f34657d & 16) == 16 ? this.f34663j.toBuilder() : null;
                                q qVar2 = (q) c5051e.t(q.f34607v, c5053g);
                                this.f34663j = qVar2;
                                if (builder != null) {
                                    builder.m(qVar2);
                                    this.f34663j = builder.u();
                                }
                                this.f34657d |= 16;
                                break;
                            case 56:
                                this.f34657d |= 32;
                                this.f34664k = c5051e.r();
                                break;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f34665l = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f34665l.add(c5051e.t(fd.b.f34296i, c5053g));
                                break;
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.f34666m = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f34666m.add(Integer.valueOf(c5051e.r()));
                                break;
                            case 250:
                                int i11 = c5051e.i(c5051e.z());
                                if ((i10 & 256) != 256 && c5051e.e() > 0) {
                                    this.f34666m = new ArrayList();
                                    i10 |= 256;
                                }
                                while (c5051e.e() > 0) {
                                    this.f34666m.add(Integer.valueOf(c5051e.r()));
                                }
                                c5051e.h(i11);
                                break;
                            default:
                                J10 = j(c5051e, c5052fI, c5053g, iJ);
                                if (J10 == 0) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (md.k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new md.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i10 & 4) == 4) {
                        this.f34660g = Collections.unmodifiableList(this.f34660g);
                    }
                    if ((i10 & 128) == J10) {
                        this.f34665l = Collections.unmodifiableList(this.f34665l);
                    }
                    if ((i10 & 256) == 256) {
                        this.f34666m = Collections.unmodifiableList(this.f34666m);
                    }
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f34656c = bVarT.f();
                        throw th2;
                    }
                    this.f34656c = bVarT.f();
                    g();
                    throw th;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f34660g = Collections.unmodifiableList(this.f34660g);
                }
                if ((i10 & 128) == 128) {
                    this.f34665l = Collections.unmodifiableList(this.f34665l);
                }
                if ((i10 & 256) == 256) {
                    this.f34666m = Collections.unmodifiableList(this.f34666m);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f34656c = bVarT.f();
                    throw th3;
                }
                this.f34656c = bVarT.f();
                g();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34670e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f34672g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public q f34673h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34674i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public q f34675j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f34676k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f34677l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f34678m;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34672g = list;
            this.f34673h = q.S();
            this.f34675j = q.S();
            this.f34677l = list;
            this.f34678m = list;
            A();
        }

        public static b w() {
            return new b();
        }

        private void y() {
            if ((this.f34669d & 4) != 4) {
                this.f34672g = new ArrayList(this.f34672g);
                this.f34669d |= 4;
            }
        }

        private void z() {
            if ((this.f34669d & 256) != 256) {
                this.f34678m = new ArrayList(this.f34678m);
                this.f34669d |= 256;
            }
        }

        public b B(q qVar) {
            if ((this.f34669d & 32) != 32 || this.f34675j == q.S()) {
                this.f34675j = qVar;
            } else {
                this.f34675j = q.t0(this.f34675j).m(qVar).u();
            }
            this.f34669d |= 32;
            return this;
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b m(r rVar) {
            if (rVar == r.M()) {
                return this;
            }
            if (rVar.a0()) {
                G(rVar.Q());
            }
            if (rVar.b0()) {
                H(rVar.R());
            }
            if (!rVar.f34660g.isEmpty()) {
                if (this.f34672g.isEmpty()) {
                    this.f34672g = rVar.f34660g;
                    this.f34669d &= -5;
                } else {
                    y();
                    this.f34672g.addAll(rVar.f34660g);
                }
            }
            if (rVar.c0()) {
                E(rVar.V());
            }
            if (rVar.d0()) {
                I(rVar.W());
            }
            if (rVar.Y()) {
                B(rVar.O());
            }
            if (rVar.Z()) {
                F(rVar.P());
            }
            if (!rVar.f34665l.isEmpty()) {
                if (this.f34677l.isEmpty()) {
                    this.f34677l = rVar.f34665l;
                    this.f34669d &= -129;
                } else {
                    x();
                    this.f34677l.addAll(rVar.f34665l);
                }
            }
            if (!rVar.f34666m.isEmpty()) {
                if (this.f34678m.isEmpty()) {
                    this.f34678m = rVar.f34666m;
                    this.f34669d &= -257;
                } else {
                    z();
                    this.f34678m.addAll(rVar.f34666m);
                }
            }
            r(rVar);
            n(j().d(rVar.f34656c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.r.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.r.f34655q     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.r r3 = (fd.r) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.r r4 = (fd.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.r.b.v0(md.e, md.g):fd.r$b");
        }

        public b E(q qVar) {
            if ((this.f34669d & 8) != 8 || this.f34673h == q.S()) {
                this.f34673h = qVar;
            } else {
                this.f34673h = q.t0(this.f34673h).m(qVar).u();
            }
            this.f34669d |= 8;
            return this;
        }

        public b F(int i10) {
            this.f34669d |= 64;
            this.f34676k = i10;
            return this;
        }

        public b G(int i10) {
            this.f34669d |= 1;
            this.f34670e = i10;
            return this;
        }

        public b H(int i10) {
            this.f34669d |= 2;
            this.f34671f = i10;
            return this;
        }

        public b I(int i10) {
            this.f34669d |= 16;
            this.f34674i = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public r build() {
            r rVarU = u();
            if (rVarU.isInitialized()) {
                return rVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(rVarU);
        }

        public r u() {
            r rVar = new r(this);
            int i10 = this.f34669d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            rVar.f34658e = this.f34670e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            rVar.f34659f = this.f34671f;
            if ((this.f34669d & 4) == 4) {
                this.f34672g = Collections.unmodifiableList(this.f34672g);
                this.f34669d &= -5;
            }
            rVar.f34660g = this.f34672g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.f34661h = this.f34673h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.f34662i = this.f34674i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.f34663j = this.f34675j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.f34664k = this.f34676k;
            if ((this.f34669d & 128) == 128) {
                this.f34677l = Collections.unmodifiableList(this.f34677l);
                this.f34669d &= -129;
            }
            rVar.f34665l = this.f34677l;
            if ((this.f34669d & 256) == 256) {
                this.f34678m = Collections.unmodifiableList(this.f34678m);
                this.f34669d &= -257;
            }
            rVar.f34666m = this.f34678m;
            rVar.f34657d = i11;
            return rVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        public final void x() {
            if ((this.f34669d & 128) != 128) {
                this.f34677l = new ArrayList(this.f34677l);
                this.f34669d |= 128;
            }
        }

        private void A() {
        }
    }
}
