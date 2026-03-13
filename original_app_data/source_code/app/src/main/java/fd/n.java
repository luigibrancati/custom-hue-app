package fd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.q;
import fd.u;
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
public final class n extends i.d implements md.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f34541v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static md.r f34542w = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f34548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f34550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f34551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f34553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f34554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f34556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f34557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f34559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f34560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34561u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public n c(C5051e c5051e, C5053g c5053g) {
            return new n(c5051e, c5053g);
        }
    }

    static {
        n nVar = new n(true);
        f34541v = nVar;
        nVar.t0();
    }

    public static n T() {
        return f34541v;
    }

    private void t0() {
        this.f34545e = 518;
        this.f34546f = 2054;
        this.f34547g = 0;
        this.f34548h = q.S();
        this.f34549i = 0;
        List list = Collections.EMPTY_LIST;
        this.f34550j = list;
        this.f34551k = q.S();
        this.f34552l = 0;
        this.f34553m = list;
        this.f34554n = list;
        this.f34556p = u.C();
        this.f34557q = 0;
        this.f34558r = 0;
        this.f34559s = list;
    }

    public static b u0() {
        return b.w();
    }

    public static b w0(n nVar) {
        return u0().m(nVar);
    }

    public q P(int i10) {
        return (q) this.f34553m.get(i10);
    }

    public int Q() {
        return this.f34553m.size();
    }

    public List R() {
        return this.f34554n;
    }

    public List S() {
        return this.f34553m;
    }

    @Override // md.q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public n getDefaultInstanceForType() {
        return f34541v;
    }

    public int V() {
        return this.f34545e;
    }

    public int W() {
        return this.f34557q;
    }

    public int X() {
        return this.f34547g;
    }

    public int Y() {
        return this.f34546f;
    }

    public q Z() {
        return this.f34551k;
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34544d & 2) == 2) {
            c5052f.Z(1, this.f34546f);
        }
        if ((this.f34544d & 4) == 4) {
            c5052f.Z(2, this.f34547g);
        }
        if ((this.f34544d & 8) == 8) {
            c5052f.c0(3, this.f34548h);
        }
        for (int i10 = 0; i10 < this.f34550j.size(); i10++) {
            c5052f.c0(4, (md.p) this.f34550j.get(i10));
        }
        if ((this.f34544d & 32) == 32) {
            c5052f.c0(5, this.f34551k);
        }
        if ((this.f34544d & 128) == 128) {
            c5052f.c0(6, this.f34556p);
        }
        if ((this.f34544d & 256) == 256) {
            c5052f.Z(7, this.f34557q);
        }
        if ((this.f34544d & 512) == 512) {
            c5052f.Z(8, this.f34558r);
        }
        if ((this.f34544d & 16) == 16) {
            c5052f.Z(9, this.f34549i);
        }
        if ((this.f34544d & 64) == 64) {
            c5052f.Z(10, this.f34552l);
        }
        if ((this.f34544d & 1) == 1) {
            c5052f.Z(11, this.f34545e);
        }
        for (int i11 = 0; i11 < this.f34553m.size(); i11++) {
            c5052f.c0(12, (md.p) this.f34553m.get(i11));
        }
        if (R().size() > 0) {
            c5052f.n0(106);
            c5052f.n0(this.f34555o);
        }
        for (int i12 = 0; i12 < this.f34554n.size(); i12++) {
            c5052f.a0(((Integer) this.f34554n.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f34559s.size(); i13++) {
            c5052f.Z(31, ((Integer) this.f34559s.get(i13)).intValue());
        }
        aVarS.a(19000, c5052f);
        c5052f.h0(this.f34543c);
    }

    public int a0() {
        return this.f34552l;
    }

    public q b0() {
        return this.f34548h;
    }

    public int c0() {
        return this.f34549i;
    }

    public int d0() {
        return this.f34558r;
    }

    public u e0() {
        return this.f34556p;
    }

    public s f0(int i10) {
        return (s) this.f34550j.get(i10);
    }

    public int g0() {
        return this.f34550j.size();
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34561u;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34544d & 2) == 2 ? C5052f.o(1, this.f34546f) : 0;
        if ((this.f34544d & 4) == 4) {
            iO += C5052f.o(2, this.f34547g);
        }
        if ((this.f34544d & 8) == 8) {
            iO += C5052f.r(3, this.f34548h);
        }
        for (int i11 = 0; i11 < this.f34550j.size(); i11++) {
            iO += C5052f.r(4, (md.p) this.f34550j.get(i11));
        }
        if ((this.f34544d & 32) == 32) {
            iO += C5052f.r(5, this.f34551k);
        }
        if ((this.f34544d & 128) == 128) {
            iO += C5052f.r(6, this.f34556p);
        }
        if ((this.f34544d & 256) == 256) {
            iO += C5052f.o(7, this.f34557q);
        }
        if ((this.f34544d & 512) == 512) {
            iO += C5052f.o(8, this.f34558r);
        }
        if ((this.f34544d & 16) == 16) {
            iO += C5052f.o(9, this.f34549i);
        }
        if ((this.f34544d & 64) == 64) {
            iO += C5052f.o(10, this.f34552l);
        }
        if ((this.f34544d & 1) == 1) {
            iO += C5052f.o(11, this.f34545e);
        }
        for (int i12 = 0; i12 < this.f34553m.size(); i12++) {
            iO += C5052f.r(12, (md.p) this.f34553m.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f34554n.size(); i13++) {
            iP += C5052f.p(((Integer) this.f34554n.get(i13)).intValue());
        }
        int iP2 = iO + iP;
        if (!R().isEmpty()) {
            iP2 = iP2 + 1 + C5052f.p(iP);
        }
        this.f34555o = iP;
        int iP3 = 0;
        for (int i14 = 0; i14 < this.f34559s.size(); i14++) {
            iP3 += C5052f.p(((Integer) this.f34559s.get(i14)).intValue());
        }
        int size = iP2 + iP3 + (i0().size() * 2) + n() + this.f34543c.size();
        this.f34561u = size;
        return size;
    }

    public List h0() {
        return this.f34550j;
    }

    public List i0() {
        return this.f34559s;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34560t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!l0()) {
            this.f34560t = (byte) 0;
            return false;
        }
        if (p0() && !b0().isInitialized()) {
            this.f34560t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < g0(); i10++) {
            if (!f0(i10).isInitialized()) {
                this.f34560t = (byte) 0;
                return false;
            }
        }
        if (n0() && !Z().isInitialized()) {
            this.f34560t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < Q(); i11++) {
            if (!P(i11).isInitialized()) {
                this.f34560t = (byte) 0;
                return false;
            }
        }
        if (s0() && !e0().isInitialized()) {
            this.f34560t = (byte) 0;
            return false;
        }
        if (m()) {
            this.f34560t = (byte) 1;
            return true;
        }
        this.f34560t = (byte) 0;
        return false;
    }

    public boolean j0() {
        return (this.f34544d & 1) == 1;
    }

    public boolean k0() {
        return (this.f34544d & 256) == 256;
    }

    public boolean l0() {
        return (this.f34544d & 4) == 4;
    }

    public boolean m0() {
        return (this.f34544d & 2) == 2;
    }

    public boolean n0() {
        return (this.f34544d & 32) == 32;
    }

    public boolean o0() {
        return (this.f34544d & 64) == 64;
    }

    public boolean p0() {
        return (this.f34544d & 8) == 8;
    }

    public boolean q0() {
        return (this.f34544d & 16) == 16;
    }

    public boolean r0() {
        return (this.f34544d & 512) == 512;
    }

    public boolean s0() {
        return (this.f34544d & 128) == 128;
    }

    @Override // md.p
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return u0();
    }

    @Override // md.p
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return w0(this);
    }

    public n(i.c cVar) {
        super(cVar);
        this.f34555o = -1;
        this.f34560t = (byte) -1;
        this.f34561u = -1;
        this.f34543c = cVar.j();
    }

    public n(boolean z10) {
        this.f34555o = -1;
        this.f34560t = (byte) -1;
        this.f34561u = -1;
        this.f34543c = AbstractC5050d.f40294a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public n(C5051e c5051e, C5053g c5053g) {
        this.f34555o = -1;
        this.f34560t = (byte) -1;
        this.f34561u = -1;
        t0();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? J10 = 256;
            if (!z10) {
                try {
                    try {
                        try {
                            int iJ = c5051e.J();
                            switch (iJ) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 8:
                                    this.f34544d |= 2;
                                    this.f34546f = c5051e.r();
                                    break;
                                case 16:
                                    this.f34544d |= 4;
                                    this.f34547g = c5051e.r();
                                    break;
                                case 26:
                                    q.c cVarW0 = (this.f34544d & 8) == 8 ? this.f34548h.toBuilder() : null;
                                    q qVar = (q) c5051e.t(q.f34607v, c5053g);
                                    this.f34548h = qVar;
                                    if (cVarW0 != null) {
                                        cVarW0.m(qVar);
                                        this.f34548h = cVarW0.u();
                                    }
                                    this.f34544d |= 8;
                                    break;
                                case 34:
                                    int i11 = (i10 == true ? 1 : 0) & 32;
                                    i10 = i10;
                                    if (i11 != 32) {
                                        this.f34550j = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 32;
                                    }
                                    this.f34550j.add(c5051e.t(s.f34680o, c5053g));
                                    break;
                                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    q.c cVarW02 = (this.f34544d & 32) == 32 ? this.f34551k.toBuilder() : null;
                                    q qVar2 = (q) c5051e.t(q.f34607v, c5053g);
                                    this.f34551k = qVar2;
                                    if (cVarW02 != null) {
                                        cVarW02.m(qVar2);
                                        this.f34551k = cVarW02.u();
                                    }
                                    this.f34544d |= 32;
                                    break;
                                case 50:
                                    u.b bVarV = (this.f34544d & 128) == 128 ? this.f34556p.toBuilder() : null;
                                    u uVar = (u) c5051e.t(u.f34711n, c5053g);
                                    this.f34556p = uVar;
                                    if (bVarV != null) {
                                        bVarV.m(uVar);
                                        this.f34556p = bVarV.u();
                                    }
                                    this.f34544d |= 128;
                                    break;
                                case 56:
                                    this.f34544d |= 256;
                                    this.f34557q = c5051e.r();
                                    break;
                                case 64:
                                    this.f34544d |= 512;
                                    this.f34558r = c5051e.r();
                                    break;
                                case 72:
                                    this.f34544d |= 16;
                                    this.f34549i = c5051e.r();
                                    break;
                                case 80:
                                    this.f34544d |= 64;
                                    this.f34552l = c5051e.r();
                                    break;
                                case 88:
                                    this.f34544d |= 1;
                                    this.f34545e = c5051e.r();
                                    break;
                                case 98:
                                    int i12 = (i10 == true ? 1 : 0) & 256;
                                    i10 = i10;
                                    if (i12 != 256) {
                                        this.f34553m = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 256;
                                    }
                                    this.f34553m.add(c5051e.t(q.f34607v, c5053g));
                                    break;
                                case 104:
                                    int i13 = (i10 == true ? 1 : 0) & 512;
                                    i10 = i10;
                                    if (i13 != 512) {
                                        this.f34554n = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 512;
                                    }
                                    this.f34554n.add(Integer.valueOf(c5051e.r()));
                                    break;
                                case 106:
                                    int i14 = c5051e.i(c5051e.z());
                                    int i15 = (i10 == true ? 1 : 0) & 512;
                                    i10 = i10;
                                    if (i15 != 512) {
                                        i10 = i10;
                                        if (c5051e.e() > 0) {
                                            this.f34554n = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (c5051e.e() > 0) {
                                        this.f34554n.add(Integer.valueOf(c5051e.r()));
                                    }
                                    c5051e.h(i14);
                                    break;
                                case 248:
                                    int i16 = (i10 == true ? 1 : 0) & 8192;
                                    i10 = i10;
                                    if (i16 != 8192) {
                                        this.f34559s = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8192;
                                    }
                                    this.f34559s.add(Integer.valueOf(c5051e.r()));
                                    break;
                                case 250:
                                    int i17 = c5051e.i(c5051e.z());
                                    int i18 = (i10 == true ? 1 : 0) & 8192;
                                    i10 = i10;
                                    if (i18 != 8192) {
                                        i10 = i10;
                                        if (c5051e.e() > 0) {
                                            this.f34559s = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (c5051e.e() > 0) {
                                        this.f34559s.add(Integer.valueOf(c5051e.r()));
                                    }
                                    c5051e.h(i17);
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
                        }
                    } catch (IOException e11) {
                        throw new md.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f34550j = Collections.unmodifiableList(this.f34550j);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == J10) {
                        this.f34553m = Collections.unmodifiableList(this.f34553m);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f34554n = Collections.unmodifiableList(this.f34554n);
                    }
                    if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f34559s = Collections.unmodifiableList(this.f34559s);
                    }
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f34543c = bVarT.f();
                        throw th2;
                    }
                    this.f34543c = bVarT.f();
                    g();
                    throw th;
                }
            } else {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f34550j = Collections.unmodifiableList(this.f34550j);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f34553m = Collections.unmodifiableList(this.f34553m);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f34554n = Collections.unmodifiableList(this.f34554n);
                }
                if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f34559s = Collections.unmodifiableList(this.f34559s);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f34543c = bVarT.f();
                    throw th3;
                }
                this.f34543c = bVarT.f();
                g();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34562d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34565g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34567i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f34568j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public q f34569k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f34570l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f34571m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f34572n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public u f34573o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f34574p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f34575q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List f34576r;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34563e = 518;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34564f = 2054;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public q f34566h = q.S();

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34568j = list;
            this.f34569k = q.S();
            this.f34571m = list;
            this.f34572n = list;
            this.f34573o = u.C();
            this.f34576r = list;
            B();
        }

        private void A() {
            if ((this.f34562d & 8192) != 8192) {
                this.f34576r = new ArrayList(this.f34576r);
                this.f34562d |= 8192;
            }
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f34562d & 512) != 512) {
                this.f34572n = new ArrayList(this.f34572n);
                this.f34562d |= 512;
            }
        }

        private void y() {
            if ((this.f34562d & 256) != 256) {
                this.f34571m = new ArrayList(this.f34571m);
                this.f34562d |= 256;
            }
        }

        private void z() {
            if ((this.f34562d & 32) != 32) {
                this.f34568j = new ArrayList(this.f34568j);
                this.f34562d |= 32;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b m(n nVar) {
            if (nVar == n.T()) {
                return this;
            }
            if (nVar.j0()) {
                H(nVar.V());
            }
            if (nVar.m0()) {
                K(nVar.Y());
            }
            if (nVar.l0()) {
                J(nVar.X());
            }
            if (nVar.p0()) {
                F(nVar.b0());
            }
            if (nVar.q0()) {
                M(nVar.c0());
            }
            if (!nVar.f34550j.isEmpty()) {
                if (this.f34568j.isEmpty()) {
                    this.f34568j = nVar.f34550j;
                    this.f34562d &= -33;
                } else {
                    z();
                    this.f34568j.addAll(nVar.f34550j);
                }
            }
            if (nVar.n0()) {
                E(nVar.Z());
            }
            if (nVar.o0()) {
                L(nVar.a0());
            }
            if (!nVar.f34553m.isEmpty()) {
                if (this.f34571m.isEmpty()) {
                    this.f34571m = nVar.f34553m;
                    this.f34562d &= -257;
                } else {
                    y();
                    this.f34571m.addAll(nVar.f34553m);
                }
            }
            if (!nVar.f34554n.isEmpty()) {
                if (this.f34572n.isEmpty()) {
                    this.f34572n = nVar.f34554n;
                    this.f34562d &= -513;
                } else {
                    x();
                    this.f34572n.addAll(nVar.f34554n);
                }
            }
            if (nVar.s0()) {
                G(nVar.e0());
            }
            if (nVar.k0()) {
                I(nVar.W());
            }
            if (nVar.r0()) {
                N(nVar.d0());
            }
            if (!nVar.f34559s.isEmpty()) {
                if (this.f34576r.isEmpty()) {
                    this.f34576r = nVar.f34559s;
                    this.f34562d &= -8193;
                } else {
                    A();
                    this.f34576r.addAll(nVar.f34559s);
                }
            }
            r(nVar);
            n(j().d(nVar.f34543c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.n.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.n.f34542w     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.n r3 = (fd.n) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.n r4 = (fd.n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.n.b.v0(md.e, md.g):fd.n$b");
        }

        public b E(q qVar) {
            if ((this.f34562d & 64) != 64 || this.f34569k == q.S()) {
                this.f34569k = qVar;
            } else {
                this.f34569k = q.t0(this.f34569k).m(qVar).u();
            }
            this.f34562d |= 64;
            return this;
        }

        public b F(q qVar) {
            if ((this.f34562d & 8) != 8 || this.f34566h == q.S()) {
                this.f34566h = qVar;
            } else {
                this.f34566h = q.t0(this.f34566h).m(qVar).u();
            }
            this.f34562d |= 8;
            return this;
        }

        public b G(u uVar) {
            if ((this.f34562d & RecognitionOptions.UPC_E) != 1024 || this.f34573o == u.C()) {
                this.f34573o = uVar;
            } else {
                this.f34573o = u.T(this.f34573o).m(uVar).u();
            }
            this.f34562d |= RecognitionOptions.UPC_E;
            return this;
        }

        public b H(int i10) {
            this.f34562d |= 1;
            this.f34563e = i10;
            return this;
        }

        public b I(int i10) {
            this.f34562d |= RecognitionOptions.PDF417;
            this.f34574p = i10;
            return this;
        }

        public b J(int i10) {
            this.f34562d |= 4;
            this.f34565g = i10;
            return this;
        }

        public b K(int i10) {
            this.f34562d |= 2;
            this.f34564f = i10;
            return this;
        }

        public b L(int i10) {
            this.f34562d |= 128;
            this.f34570l = i10;
            return this;
        }

        public b M(int i10) {
            this.f34562d |= 16;
            this.f34567i = i10;
            return this;
        }

        public b N(int i10) {
            this.f34562d |= RecognitionOptions.AZTEC;
            this.f34575q = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public n build() {
            n nVarU = u();
            if (nVarU.isInitialized()) {
                return nVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(nVarU);
        }

        public n u() {
            n nVar = new n(this);
            int i10 = this.f34562d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            nVar.f34545e = this.f34563e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            nVar.f34546f = this.f34564f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            nVar.f34547g = this.f34565g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            nVar.f34548h = this.f34566h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            nVar.f34549i = this.f34567i;
            if ((this.f34562d & 32) == 32) {
                this.f34568j = Collections.unmodifiableList(this.f34568j);
                this.f34562d &= -33;
            }
            nVar.f34550j = this.f34568j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            nVar.f34551k = this.f34569k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            nVar.f34552l = this.f34570l;
            if ((this.f34562d & 256) == 256) {
                this.f34571m = Collections.unmodifiableList(this.f34571m);
                this.f34562d &= -257;
            }
            nVar.f34553m = this.f34571m;
            if ((this.f34562d & 512) == 512) {
                this.f34572n = Collections.unmodifiableList(this.f34572n);
                this.f34562d &= -513;
            }
            nVar.f34554n = this.f34572n;
            if ((i10 & RecognitionOptions.UPC_E) == 1024) {
                i11 |= 128;
            }
            nVar.f34556p = this.f34573o;
            if ((i10 & RecognitionOptions.PDF417) == 2048) {
                i11 |= 256;
            }
            nVar.f34557q = this.f34574p;
            if ((i10 & RecognitionOptions.AZTEC) == 4096) {
                i11 |= 512;
            }
            nVar.f34558r = this.f34575q;
            if ((this.f34562d & 8192) == 8192) {
                this.f34576r = Collections.unmodifiableList(this.f34576r);
                this.f34562d &= -8193;
            }
            nVar.f34559s = this.f34576r;
            nVar.f34544d = i11;
            return nVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        private void B() {
        }
    }
}
