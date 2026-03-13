package fd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.e;
import fd.q;
import fd.t;
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
public final class i extends i.d implements md.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f34473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static md.r f34474w = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f34480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f34482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f34483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f34485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f34486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f34488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f34489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f34490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e f34491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f34492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34493u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public i c(C5051e c5051e, C5053g c5053g) {
            return new i(c5051e, c5053g);
        }
    }

    static {
        i iVar = new i(true);
        f34473v = iVar;
        iVar.w0();
    }

    public static i A0(InputStream inputStream, C5053g c5053g) {
        return (i) f34474w.b(inputStream, c5053g);
    }

    public static i V() {
        return f34473v;
    }

    private void w0() {
        this.f34477e = 6;
        this.f34478f = 6;
        this.f34479g = 0;
        this.f34480h = q.S();
        this.f34481i = 0;
        List list = Collections.EMPTY_LIST;
        this.f34482j = list;
        this.f34483k = q.S();
        this.f34484l = 0;
        this.f34485m = list;
        this.f34486n = list;
        this.f34488p = list;
        this.f34489q = t.q();
        this.f34490r = list;
        this.f34491s = e.o();
    }

    public static b x0() {
        return b.w();
    }

    public static b y0(i iVar) {
        return x0().m(iVar);
    }

    @Override // md.p
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return y0(this);
    }

    public q Q(int i10) {
        return (q) this.f34485m.get(i10);
    }

    public int R() {
        return this.f34485m.size();
    }

    public List S() {
        return this.f34486n;
    }

    public List T() {
        return this.f34485m;
    }

    public e U() {
        return this.f34491s;
    }

    @Override // md.q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public i getDefaultInstanceForType() {
        return f34473v;
    }

    public int X() {
        return this.f34477e;
    }

    public int Y() {
        return this.f34479g;
    }

    public int Z() {
        return this.f34478f;
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34476d & 2) == 2) {
            c5052f.Z(1, this.f34478f);
        }
        if ((this.f34476d & 4) == 4) {
            c5052f.Z(2, this.f34479g);
        }
        if ((this.f34476d & 8) == 8) {
            c5052f.c0(3, this.f34480h);
        }
        for (int i10 = 0; i10 < this.f34482j.size(); i10++) {
            c5052f.c0(4, (md.p) this.f34482j.get(i10));
        }
        if ((this.f34476d & 32) == 32) {
            c5052f.c0(5, this.f34483k);
        }
        for (int i11 = 0; i11 < this.f34488p.size(); i11++) {
            c5052f.c0(6, (md.p) this.f34488p.get(i11));
        }
        if ((this.f34476d & 16) == 16) {
            c5052f.Z(7, this.f34481i);
        }
        if ((this.f34476d & 64) == 64) {
            c5052f.Z(8, this.f34484l);
        }
        if ((this.f34476d & 1) == 1) {
            c5052f.Z(9, this.f34477e);
        }
        for (int i12 = 0; i12 < this.f34485m.size(); i12++) {
            c5052f.c0(10, (md.p) this.f34485m.get(i12));
        }
        if (S().size() > 0) {
            c5052f.n0(90);
            c5052f.n0(this.f34487o);
        }
        for (int i13 = 0; i13 < this.f34486n.size(); i13++) {
            c5052f.a0(((Integer) this.f34486n.get(i13)).intValue());
        }
        if ((this.f34476d & 128) == 128) {
            c5052f.c0(30, this.f34489q);
        }
        for (int i14 = 0; i14 < this.f34490r.size(); i14++) {
            c5052f.Z(31, ((Integer) this.f34490r.get(i14)).intValue());
        }
        if ((this.f34476d & 256) == 256) {
            c5052f.c0(32, this.f34491s);
        }
        aVarS.a(19000, c5052f);
        c5052f.h0(this.f34475c);
    }

    public q a0() {
        return this.f34483k;
    }

    public int b0() {
        return this.f34484l;
    }

    public q c0() {
        return this.f34480h;
    }

    public int d0() {
        return this.f34481i;
    }

    public s e0(int i10) {
        return (s) this.f34482j.get(i10);
    }

    public int f0() {
        return this.f34482j.size();
    }

    public List g0() {
        return this.f34482j;
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34493u;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34476d & 2) == 2 ? C5052f.o(1, this.f34478f) : 0;
        if ((this.f34476d & 4) == 4) {
            iO += C5052f.o(2, this.f34479g);
        }
        if ((this.f34476d & 8) == 8) {
            iO += C5052f.r(3, this.f34480h);
        }
        for (int i11 = 0; i11 < this.f34482j.size(); i11++) {
            iO += C5052f.r(4, (md.p) this.f34482j.get(i11));
        }
        if ((this.f34476d & 32) == 32) {
            iO += C5052f.r(5, this.f34483k);
        }
        for (int i12 = 0; i12 < this.f34488p.size(); i12++) {
            iO += C5052f.r(6, (md.p) this.f34488p.get(i12));
        }
        if ((this.f34476d & 16) == 16) {
            iO += C5052f.o(7, this.f34481i);
        }
        if ((this.f34476d & 64) == 64) {
            iO += C5052f.o(8, this.f34484l);
        }
        if ((this.f34476d & 1) == 1) {
            iO += C5052f.o(9, this.f34477e);
        }
        for (int i13 = 0; i13 < this.f34485m.size(); i13++) {
            iO += C5052f.r(10, (md.p) this.f34485m.get(i13));
        }
        int iP = 0;
        for (int i14 = 0; i14 < this.f34486n.size(); i14++) {
            iP += C5052f.p(((Integer) this.f34486n.get(i14)).intValue());
        }
        int iR = iO + iP;
        if (!S().isEmpty()) {
            iR = iR + 1 + C5052f.p(iP);
        }
        this.f34487o = iP;
        if ((this.f34476d & 128) == 128) {
            iR += C5052f.r(30, this.f34489q);
        }
        int iP2 = 0;
        for (int i15 = 0; i15 < this.f34490r.size(); i15++) {
            iP2 += C5052f.p(((Integer) this.f34490r.get(i15)).intValue());
        }
        int size = iR + iP2 + (l0().size() * 2);
        if ((this.f34476d & 256) == 256) {
            size += C5052f.r(32, this.f34491s);
        }
        int iN = size + n() + this.f34475c.size();
        this.f34493u = iN;
        return iN;
    }

    public t h0() {
        return this.f34489q;
    }

    public u i0(int i10) {
        return (u) this.f34488p.get(i10);
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34492t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!o0()) {
            this.f34492t = (byte) 0;
            return false;
        }
        if (s0() && !c0().isInitialized()) {
            this.f34492t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < f0(); i10++) {
            if (!e0(i10).isInitialized()) {
                this.f34492t = (byte) 0;
                return false;
            }
        }
        if (q0() && !a0().isInitialized()) {
            this.f34492t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < R(); i11++) {
            if (!Q(i11).isInitialized()) {
                this.f34492t = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < j0(); i12++) {
            if (!i0(i12).isInitialized()) {
                this.f34492t = (byte) 0;
                return false;
            }
        }
        if (u0() && !h0().isInitialized()) {
            this.f34492t = (byte) 0;
            return false;
        }
        if (m0() && !U().isInitialized()) {
            this.f34492t = (byte) 0;
            return false;
        }
        if (m()) {
            this.f34492t = (byte) 1;
            return true;
        }
        this.f34492t = (byte) 0;
        return false;
    }

    public int j0() {
        return this.f34488p.size();
    }

    public List k0() {
        return this.f34488p;
    }

    public List l0() {
        return this.f34490r;
    }

    public boolean m0() {
        return (this.f34476d & 256) == 256;
    }

    public boolean n0() {
        return (this.f34476d & 1) == 1;
    }

    public boolean o0() {
        return (this.f34476d & 4) == 4;
    }

    public boolean p0() {
        return (this.f34476d & 2) == 2;
    }

    public boolean q0() {
        return (this.f34476d & 32) == 32;
    }

    public boolean r0() {
        return (this.f34476d & 64) == 64;
    }

    public boolean s0() {
        return (this.f34476d & 8) == 8;
    }

    public boolean t0() {
        return (this.f34476d & 16) == 16;
    }

    public boolean u0() {
        return (this.f34476d & 128) == 128;
    }

    @Override // md.p
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return x0();
    }

    public i(i.c cVar) {
        super(cVar);
        this.f34487o = -1;
        this.f34492t = (byte) -1;
        this.f34493u = -1;
        this.f34475c = cVar.j();
    }

    public i(boolean z10) {
        this.f34487o = -1;
        this.f34492t = (byte) -1;
        this.f34493u = -1;
        this.f34475c = AbstractC5050d.f40294a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public i(C5051e c5051e, C5053g c5053g) {
        this.f34487o = -1;
        this.f34492t = (byte) -1;
        this.f34493u = -1;
        w0();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? J10 = 1024;
            if (!z10) {
                try {
                    try {
                        int iJ = c5051e.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f34476d |= 2;
                                this.f34478f = c5051e.r();
                                break;
                            case 16:
                                this.f34476d |= 4;
                                this.f34479g = c5051e.r();
                                break;
                            case 26:
                                q.c cVarW0 = (this.f34476d & 8) == 8 ? this.f34480h.toBuilder() : null;
                                q qVar = (q) c5051e.t(q.f34607v, c5053g);
                                this.f34480h = qVar;
                                if (cVarW0 != null) {
                                    cVarW0.m(qVar);
                                    this.f34480h = cVarW0.u();
                                }
                                this.f34476d |= 8;
                                break;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f34482j = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f34482j.add(c5051e.t(s.f34680o, c5053g));
                                break;
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                q.c cVarW02 = (this.f34476d & 32) == 32 ? this.f34483k.toBuilder() : null;
                                q qVar2 = (q) c5051e.t(q.f34607v, c5053g);
                                this.f34483k = qVar2;
                                if (cVarW02 != null) {
                                    cVarW02.m(qVar2);
                                    this.f34483k = cVarW02.u();
                                }
                                this.f34476d |= 32;
                                break;
                            case 50:
                                int i12 = (i10 == true ? 1 : 0) & RecognitionOptions.UPC_E;
                                i10 = i10;
                                if (i12 != 1024) {
                                    this.f34488p = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | RecognitionOptions.UPC_E;
                                }
                                this.f34488p.add(c5051e.t(u.f34711n, c5053g));
                                break;
                            case 56:
                                this.f34476d |= 16;
                                this.f34481i = c5051e.r();
                                break;
                            case 64:
                                this.f34476d |= 64;
                                this.f34484l = c5051e.r();
                                break;
                            case 72:
                                this.f34476d |= 1;
                                this.f34477e = c5051e.r();
                                break;
                            case 82:
                                int i13 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i13 != 256) {
                                    this.f34485m = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.f34485m.add(c5051e.t(q.f34607v, c5053g));
                                break;
                            case 88:
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512) {
                                    this.f34486n = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.f34486n.add(Integer.valueOf(c5051e.r()));
                                break;
                            case 90:
                                int i15 = c5051e.i(c5051e.z());
                                int i16 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i16 != 512) {
                                    i10 = i10;
                                    if (c5051e.e() > 0) {
                                        this.f34486n = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c5051e.e() > 0) {
                                    this.f34486n.add(Integer.valueOf(c5051e.r()));
                                }
                                c5051e.h(i15);
                                break;
                            case 242:
                                t.b bVarA = (this.f34476d & 128) == 128 ? this.f34489q.toBuilder() : null;
                                t tVar = (t) c5051e.t(t.f34700i, c5053g);
                                this.f34489q = tVar;
                                if (bVarA != null) {
                                    bVarA.m(tVar);
                                    this.f34489q = bVarA.q();
                                }
                                this.f34476d |= 128;
                                break;
                            case 248:
                                int i17 = (i10 == true ? 1 : 0) & RecognitionOptions.AZTEC;
                                i10 = i10;
                                if (i17 != 4096) {
                                    this.f34490r = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | RecognitionOptions.AZTEC;
                                }
                                this.f34490r.add(Integer.valueOf(c5051e.r()));
                                break;
                            case 250:
                                int i18 = c5051e.i(c5051e.z());
                                int i19 = (i10 == true ? 1 : 0) & RecognitionOptions.AZTEC;
                                i10 = i10;
                                if (i19 != 4096) {
                                    i10 = i10;
                                    if (c5051e.e() > 0) {
                                        this.f34490r = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | RecognitionOptions.AZTEC;
                                    }
                                }
                                while (c5051e.e() > 0) {
                                    this.f34490r.add(Integer.valueOf(c5051e.r()));
                                }
                                c5051e.h(i18);
                                break;
                            case 258:
                                e.b bVarV = (this.f34476d & 256) == 256 ? this.f34491s.toBuilder() : null;
                                e eVar = (e) c5051e.t(e.f34421g, c5053g);
                                this.f34491s = eVar;
                                if (bVarV != null) {
                                    bVarV.m(eVar);
                                    this.f34491s = bVarV.q();
                                }
                                this.f34476d |= 256;
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
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f34482j = Collections.unmodifiableList(this.f34482j);
                    }
                    if (((i10 == true ? 1 : 0) & RecognitionOptions.UPC_E) == J10) {
                        this.f34488p = Collections.unmodifiableList(this.f34488p);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f34485m = Collections.unmodifiableList(this.f34485m);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f34486n = Collections.unmodifiableList(this.f34486n);
                    }
                    if (((i10 == true ? 1 : 0) & RecognitionOptions.AZTEC) == 4096) {
                        this.f34490r = Collections.unmodifiableList(this.f34490r);
                    }
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f34475c = bVarT.f();
                        throw th2;
                    }
                    this.f34475c = bVarT.f();
                    g();
                    throw th;
                }
            } else {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f34482j = Collections.unmodifiableList(this.f34482j);
                }
                if (((i10 == true ? 1 : 0) & RecognitionOptions.UPC_E) == 1024) {
                    this.f34488p = Collections.unmodifiableList(this.f34488p);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f34485m = Collections.unmodifiableList(this.f34485m);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f34486n = Collections.unmodifiableList(this.f34486n);
                }
                if (((i10 == true ? 1 : 0) & RecognitionOptions.AZTEC) == 4096) {
                    this.f34490r = Collections.unmodifiableList(this.f34490r);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f34475c = bVarT.f();
                    throw th3;
                }
                this.f34475c = bVarT.f();
                g();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34494d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34497g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34499i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f34500j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public q f34501k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f34502l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f34503m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f34504n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List f34505o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public t f34506p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List f34507q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public e f34508r;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34495e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34496f = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public q f34498h = q.S();

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34500j = list;
            this.f34501k = q.S();
            this.f34503m = list;
            this.f34504n = list;
            this.f34505o = list;
            this.f34506p = t.q();
            this.f34507q = list;
            this.f34508r = e.o();
            C();
        }

        private void A() {
            if ((this.f34494d & RecognitionOptions.UPC_E) != 1024) {
                this.f34505o = new ArrayList(this.f34505o);
                this.f34494d |= RecognitionOptions.UPC_E;
            }
        }

        private void B() {
            if ((this.f34494d & RecognitionOptions.AZTEC) != 4096) {
                this.f34507q = new ArrayList(this.f34507q);
                this.f34494d |= RecognitionOptions.AZTEC;
            }
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f34494d & 512) != 512) {
                this.f34504n = new ArrayList(this.f34504n);
                this.f34494d |= 512;
            }
        }

        private void y() {
            if ((this.f34494d & 256) != 256) {
                this.f34503m = new ArrayList(this.f34503m);
                this.f34494d |= 256;
            }
        }

        private void z() {
            if ((this.f34494d & 32) != 32) {
                this.f34500j = new ArrayList(this.f34500j);
                this.f34494d |= 32;
            }
        }

        public b D(e eVar) {
            if ((this.f34494d & 8192) != 8192 || this.f34508r == e.o()) {
                this.f34508r = eVar;
            } else {
                this.f34508r = e.t(this.f34508r).m(eVar).q();
            }
            this.f34494d |= 8192;
            return this;
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public b m(i iVar) {
            if (iVar == i.V()) {
                return this;
            }
            if (iVar.n0()) {
                J(iVar.X());
            }
            if (iVar.p0()) {
                L(iVar.Z());
            }
            if (iVar.o0()) {
                K(iVar.Y());
            }
            if (iVar.s0()) {
                H(iVar.c0());
            }
            if (iVar.t0()) {
                N(iVar.d0());
            }
            if (!iVar.f34482j.isEmpty()) {
                if (this.f34500j.isEmpty()) {
                    this.f34500j = iVar.f34482j;
                    this.f34494d &= -33;
                } else {
                    z();
                    this.f34500j.addAll(iVar.f34482j);
                }
            }
            if (iVar.q0()) {
                G(iVar.a0());
            }
            if (iVar.r0()) {
                M(iVar.b0());
            }
            if (!iVar.f34485m.isEmpty()) {
                if (this.f34503m.isEmpty()) {
                    this.f34503m = iVar.f34485m;
                    this.f34494d &= -257;
                } else {
                    y();
                    this.f34503m.addAll(iVar.f34485m);
                }
            }
            if (!iVar.f34486n.isEmpty()) {
                if (this.f34504n.isEmpty()) {
                    this.f34504n = iVar.f34486n;
                    this.f34494d &= -513;
                } else {
                    x();
                    this.f34504n.addAll(iVar.f34486n);
                }
            }
            if (!iVar.f34488p.isEmpty()) {
                if (this.f34505o.isEmpty()) {
                    this.f34505o = iVar.f34488p;
                    this.f34494d &= -1025;
                } else {
                    A();
                    this.f34505o.addAll(iVar.f34488p);
                }
            }
            if (iVar.u0()) {
                I(iVar.h0());
            }
            if (!iVar.f34490r.isEmpty()) {
                if (this.f34507q.isEmpty()) {
                    this.f34507q = iVar.f34490r;
                    this.f34494d &= -4097;
                } else {
                    B();
                    this.f34507q.addAll(iVar.f34490r);
                }
            }
            if (iVar.m0()) {
                D(iVar.U());
            }
            r(iVar);
            n(j().d(iVar.f34475c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.i.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.i.f34474w     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.i r3 = (fd.i) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.i r4 = (fd.i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.i.b.v0(md.e, md.g):fd.i$b");
        }

        public b G(q qVar) {
            if ((this.f34494d & 64) != 64 || this.f34501k == q.S()) {
                this.f34501k = qVar;
            } else {
                this.f34501k = q.t0(this.f34501k).m(qVar).u();
            }
            this.f34494d |= 64;
            return this;
        }

        public b H(q qVar) {
            if ((this.f34494d & 8) != 8 || this.f34498h == q.S()) {
                this.f34498h = qVar;
            } else {
                this.f34498h = q.t0(this.f34498h).m(qVar).u();
            }
            this.f34494d |= 8;
            return this;
        }

        public b I(t tVar) {
            if ((this.f34494d & RecognitionOptions.PDF417) != 2048 || this.f34506p == t.q()) {
                this.f34506p = tVar;
            } else {
                this.f34506p = t.y(this.f34506p).m(tVar).q();
            }
            this.f34494d |= RecognitionOptions.PDF417;
            return this;
        }

        public b J(int i10) {
            this.f34494d |= 1;
            this.f34495e = i10;
            return this;
        }

        public b K(int i10) {
            this.f34494d |= 4;
            this.f34497g = i10;
            return this;
        }

        public b L(int i10) {
            this.f34494d |= 2;
            this.f34496f = i10;
            return this;
        }

        public b M(int i10) {
            this.f34494d |= 128;
            this.f34502l = i10;
            return this;
        }

        public b N(int i10) {
            this.f34494d |= 16;
            this.f34499i = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public i build() {
            i iVarU = u();
            if (iVarU.isInitialized()) {
                return iVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(iVarU);
        }

        public i u() {
            i iVar = new i(this);
            int i10 = this.f34494d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            iVar.f34477e = this.f34495e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            iVar.f34478f = this.f34496f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            iVar.f34479g = this.f34497g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            iVar.f34480h = this.f34498h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            iVar.f34481i = this.f34499i;
            if ((this.f34494d & 32) == 32) {
                this.f34500j = Collections.unmodifiableList(this.f34500j);
                this.f34494d &= -33;
            }
            iVar.f34482j = this.f34500j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            iVar.f34483k = this.f34501k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            iVar.f34484l = this.f34502l;
            if ((this.f34494d & 256) == 256) {
                this.f34503m = Collections.unmodifiableList(this.f34503m);
                this.f34494d &= -257;
            }
            iVar.f34485m = this.f34503m;
            if ((this.f34494d & 512) == 512) {
                this.f34504n = Collections.unmodifiableList(this.f34504n);
                this.f34494d &= -513;
            }
            iVar.f34486n = this.f34504n;
            if ((this.f34494d & RecognitionOptions.UPC_E) == 1024) {
                this.f34505o = Collections.unmodifiableList(this.f34505o);
                this.f34494d &= -1025;
            }
            iVar.f34488p = this.f34505o;
            if ((i10 & RecognitionOptions.PDF417) == 2048) {
                i11 |= 128;
            }
            iVar.f34489q = this.f34506p;
            if ((this.f34494d & RecognitionOptions.AZTEC) == 4096) {
                this.f34507q = Collections.unmodifiableList(this.f34507q);
                this.f34494d &= -4097;
            }
            iVar.f34490r = this.f34507q;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            iVar.f34491s = this.f34508r;
            iVar.f34476d = i11;
            return iVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        private void C() {
        }
    }
}
