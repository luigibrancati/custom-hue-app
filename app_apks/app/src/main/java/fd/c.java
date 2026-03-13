package fd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
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
import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends i.d implements md.q {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final c f34346P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static md.r f34347Q = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f34348A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f34349B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f34350C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f34351D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f34352E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public t f34353F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public List f34354G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public w f34355H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public byte f34356I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f34357J;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f34358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f34363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f34364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f34365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f34367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f34369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f34370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f34372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f34373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f34374s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f34375t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f34376u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f34377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f34379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f34380y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f34381z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c c(C5051e c5051e, C5053g c5053g) {
            return new c(c5051e, c5053g);
        }
    }

    /* JADX INFO: renamed from: fd.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum EnumC0446c implements j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static j.b internalValueMap = new a();
        private final int value;

        /* JADX INFO: renamed from: fd.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements j.b {
            @Override // md.j.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumC0446c findValueByNumber(int i10) {
                return EnumC0446c.a(i10);
            }
        }

        EnumC0446c(int i10, int i11) {
            this.value = i11;
        }

        public static EnumC0446c a(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // md.j.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        c cVar = new c(true);
        f34346P = cVar;
        cVar.o1();
    }

    private void o1() {
        this.f34360e = 6;
        this.f34361f = 0;
        this.f34362g = 0;
        List list = Collections.EMPTY_LIST;
        this.f34363h = list;
        this.f34364i = list;
        this.f34365j = list;
        this.f34367l = list;
        this.f34369n = list;
        this.f34370o = list;
        this.f34372q = list;
        this.f34373r = list;
        this.f34374s = list;
        this.f34375t = list;
        this.f34376u = list;
        this.f34377v = list;
        this.f34379x = 0;
        this.f34380y = q.S();
        this.f34381z = 0;
        this.f34348A = list;
        this.f34350C = list;
        this.f34351D = list;
        this.f34353F = t.q();
        this.f34354G = list;
        this.f34355H = w.o();
    }

    public static b p1() {
        return b.w();
    }

    public static b q1(c cVar) {
        return p1().m(cVar);
    }

    public static c s1(InputStream inputStream, C5053g c5053g) {
        return (c) f34347Q.b(inputStream, c5053g);
    }

    public static c t0() {
        return f34346P;
    }

    public int A0() {
        return this.f34361f;
    }

    public i B0(int i10) {
        return (i) this.f34373r.get(i10);
    }

    public int C0() {
        return this.f34373r.size();
    }

    public List D0() {
        return this.f34373r;
    }

    public int E0() {
        return this.f34379x;
    }

    public q F0() {
        return this.f34380y;
    }

    public int G0() {
        return this.f34381z;
    }

    public int H0() {
        return this.f34348A.size();
    }

    public List I0() {
        return this.f34348A;
    }

    public q J0(int i10) {
        return (q) this.f34350C.get(i10);
    }

    public int K0() {
        return this.f34350C.size();
    }

    public int L0() {
        return this.f34351D.size();
    }

    public List M0() {
        return this.f34351D;
    }

    public List N0() {
        return this.f34350C;
    }

    public List O0() {
        return this.f34367l;
    }

    public n P0(int i10) {
        return (n) this.f34374s.get(i10);
    }

    public int Q0() {
        return this.f34374s.size();
    }

    public List R0() {
        return this.f34374s;
    }

    public List S0() {
        return this.f34377v;
    }

    public q T0(int i10) {
        return (q) this.f34364i.get(i10);
    }

    public int U0() {
        return this.f34364i.size();
    }

    public List V0() {
        return this.f34365j;
    }

    public List W0() {
        return this.f34364i;
    }

    public r X0(int i10) {
        return (r) this.f34375t.get(i10);
    }

    public int Y0() {
        return this.f34375t.size();
    }

    public List Z0() {
        return this.f34375t;
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f34359d & 1) == 1) {
            c5052f.Z(1, this.f34360e);
        }
        if (V0().size() > 0) {
            c5052f.n0(18);
            c5052f.n0(this.f34366k);
        }
        for (int i10 = 0; i10 < this.f34365j.size(); i10++) {
            c5052f.a0(((Integer) this.f34365j.get(i10)).intValue());
        }
        if ((this.f34359d & 2) == 2) {
            c5052f.Z(3, this.f34361f);
        }
        if ((this.f34359d & 4) == 4) {
            c5052f.Z(4, this.f34362g);
        }
        for (int i11 = 0; i11 < this.f34363h.size(); i11++) {
            c5052f.c0(5, (md.p) this.f34363h.get(i11));
        }
        for (int i12 = 0; i12 < this.f34364i.size(); i12++) {
            c5052f.c0(6, (md.p) this.f34364i.get(i12));
        }
        if (O0().size() > 0) {
            c5052f.n0(58);
            c5052f.n0(this.f34368m);
        }
        for (int i13 = 0; i13 < this.f34367l.size(); i13++) {
            c5052f.a0(((Integer) this.f34367l.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f34372q.size(); i14++) {
            c5052f.c0(8, (md.p) this.f34372q.get(i14));
        }
        for (int i15 = 0; i15 < this.f34373r.size(); i15++) {
            c5052f.c0(9, (md.p) this.f34373r.get(i15));
        }
        for (int i16 = 0; i16 < this.f34374s.size(); i16++) {
            c5052f.c0(10, (md.p) this.f34374s.get(i16));
        }
        for (int i17 = 0; i17 < this.f34375t.size(); i17++) {
            c5052f.c0(11, (md.p) this.f34375t.get(i17));
        }
        for (int i18 = 0; i18 < this.f34376u.size(); i18++) {
            c5052f.c0(13, (md.p) this.f34376u.get(i18));
        }
        if (S0().size() > 0) {
            c5052f.n0(130);
            c5052f.n0(this.f34378w);
        }
        for (int i19 = 0; i19 < this.f34377v.size(); i19++) {
            c5052f.a0(((Integer) this.f34377v.get(i19)).intValue());
        }
        if ((this.f34359d & 8) == 8) {
            c5052f.Z(17, this.f34379x);
        }
        if ((this.f34359d & 16) == 16) {
            c5052f.c0(18, this.f34380y);
        }
        if ((this.f34359d & 32) == 32) {
            c5052f.Z(19, this.f34381z);
        }
        for (int i20 = 0; i20 < this.f34369n.size(); i20++) {
            c5052f.c0(20, (md.p) this.f34369n.get(i20));
        }
        if (r0().size() > 0) {
            c5052f.n0(170);
            c5052f.n0(this.f34371p);
        }
        for (int i21 = 0; i21 < this.f34370o.size(); i21++) {
            c5052f.a0(((Integer) this.f34370o.get(i21)).intValue());
        }
        if (I0().size() > 0) {
            c5052f.n0(178);
            c5052f.n0(this.f34349B);
        }
        for (int i22 = 0; i22 < this.f34348A.size(); i22++) {
            c5052f.a0(((Integer) this.f34348A.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f34350C.size(); i23++) {
            c5052f.c0(23, (md.p) this.f34350C.get(i23));
        }
        if (M0().size() > 0) {
            c5052f.n0(194);
            c5052f.n0(this.f34352E);
        }
        for (int i24 = 0; i24 < this.f34351D.size(); i24++) {
            c5052f.a0(((Integer) this.f34351D.get(i24)).intValue());
        }
        if ((this.f34359d & 64) == 64) {
            c5052f.c0(30, this.f34353F);
        }
        for (int i25 = 0; i25 < this.f34354G.size(); i25++) {
            c5052f.Z(31, ((Integer) this.f34354G.get(i25)).intValue());
        }
        if ((this.f34359d & 128) == 128) {
            c5052f.c0(32, this.f34355H);
        }
        aVarS.a(19000, c5052f);
        c5052f.h0(this.f34358c);
    }

    public s a1(int i10) {
        return (s) this.f34363h.get(i10);
    }

    public int b1() {
        return this.f34363h.size();
    }

    public List c1() {
        return this.f34363h;
    }

    public t d1() {
        return this.f34353F;
    }

    public List e1() {
        return this.f34354G;
    }

    public w f1() {
        return this.f34355H;
    }

    public boolean g1() {
        return (this.f34359d & 4) == 4;
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34357J;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34359d & 1) == 1 ? C5052f.o(1, this.f34360e) : 0;
        int iP = 0;
        for (int i11 = 0; i11 < this.f34365j.size(); i11++) {
            iP += C5052f.p(((Integer) this.f34365j.get(i11)).intValue());
        }
        int iR = iO + iP;
        if (!V0().isEmpty()) {
            iR = iR + 1 + C5052f.p(iP);
        }
        this.f34366k = iP;
        if ((this.f34359d & 2) == 2) {
            iR += C5052f.o(3, this.f34361f);
        }
        if ((this.f34359d & 4) == 4) {
            iR += C5052f.o(4, this.f34362g);
        }
        for (int i12 = 0; i12 < this.f34363h.size(); i12++) {
            iR += C5052f.r(5, (md.p) this.f34363h.get(i12));
        }
        for (int i13 = 0; i13 < this.f34364i.size(); i13++) {
            iR += C5052f.r(6, (md.p) this.f34364i.get(i13));
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f34367l.size(); i14++) {
            iP2 += C5052f.p(((Integer) this.f34367l.get(i14)).intValue());
        }
        int iR2 = iR + iP2;
        if (!O0().isEmpty()) {
            iR2 = iR2 + 1 + C5052f.p(iP2);
        }
        this.f34368m = iP2;
        for (int i15 = 0; i15 < this.f34372q.size(); i15++) {
            iR2 += C5052f.r(8, (md.p) this.f34372q.get(i15));
        }
        for (int i16 = 0; i16 < this.f34373r.size(); i16++) {
            iR2 += C5052f.r(9, (md.p) this.f34373r.get(i16));
        }
        for (int i17 = 0; i17 < this.f34374s.size(); i17++) {
            iR2 += C5052f.r(10, (md.p) this.f34374s.get(i17));
        }
        for (int i18 = 0; i18 < this.f34375t.size(); i18++) {
            iR2 += C5052f.r(11, (md.p) this.f34375t.get(i18));
        }
        for (int i19 = 0; i19 < this.f34376u.size(); i19++) {
            iR2 += C5052f.r(13, (md.p) this.f34376u.get(i19));
        }
        int iP3 = 0;
        for (int i20 = 0; i20 < this.f34377v.size(); i20++) {
            iP3 += C5052f.p(((Integer) this.f34377v.get(i20)).intValue());
        }
        int iR3 = iR2 + iP3;
        if (!S0().isEmpty()) {
            iR3 = iR3 + 2 + C5052f.p(iP3);
        }
        this.f34378w = iP3;
        if ((this.f34359d & 8) == 8) {
            iR3 += C5052f.o(17, this.f34379x);
        }
        if ((this.f34359d & 16) == 16) {
            iR3 += C5052f.r(18, this.f34380y);
        }
        if ((this.f34359d & 32) == 32) {
            iR3 += C5052f.o(19, this.f34381z);
        }
        for (int i21 = 0; i21 < this.f34369n.size(); i21++) {
            iR3 += C5052f.r(20, (md.p) this.f34369n.get(i21));
        }
        int iP4 = 0;
        for (int i22 = 0; i22 < this.f34370o.size(); i22++) {
            iP4 += C5052f.p(((Integer) this.f34370o.get(i22)).intValue());
        }
        int iP5 = iR3 + iP4;
        if (!r0().isEmpty()) {
            iP5 = iP5 + 2 + C5052f.p(iP4);
        }
        this.f34371p = iP4;
        int iP6 = 0;
        for (int i23 = 0; i23 < this.f34348A.size(); i23++) {
            iP6 += C5052f.p(((Integer) this.f34348A.get(i23)).intValue());
        }
        int iR4 = iP5 + iP6;
        if (!I0().isEmpty()) {
            iR4 = iR4 + 2 + C5052f.p(iP6);
        }
        this.f34349B = iP6;
        for (int i24 = 0; i24 < this.f34350C.size(); i24++) {
            iR4 += C5052f.r(23, (md.p) this.f34350C.get(i24));
        }
        int iP7 = 0;
        for (int i25 = 0; i25 < this.f34351D.size(); i25++) {
            iP7 += C5052f.p(((Integer) this.f34351D.get(i25)).intValue());
        }
        int iR5 = iR4 + iP7;
        if (!M0().isEmpty()) {
            iR5 = iR5 + 2 + C5052f.p(iP7);
        }
        this.f34352E = iP7;
        if ((this.f34359d & 64) == 64) {
            iR5 += C5052f.r(30, this.f34353F);
        }
        int iP8 = 0;
        for (int i26 = 0; i26 < this.f34354G.size(); i26++) {
            iP8 += C5052f.p(((Integer) this.f34354G.get(i26)).intValue());
        }
        int size = iR5 + iP8 + (e1().size() * 2);
        if ((this.f34359d & 128) == 128) {
            size += C5052f.r(32, this.f34355H);
        }
        int iN = size + n() + this.f34358c.size();
        this.f34357J = iN;
        return iN;
    }

    public boolean h1() {
        return (this.f34359d & 1) == 1;
    }

    public boolean i1() {
        return (this.f34359d & 2) == 2;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34356I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!i1()) {
            this.f34356I = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < b1(); i10++) {
            if (!a1(i10).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < U0(); i11++) {
            if (!T0(i11).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < q0(); i12++) {
            if (!p0(i12).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < n0(); i13++) {
            if (!m0(i13).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < C0(); i14++) {
            if (!B0(i14).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < Q0(); i15++) {
            if (!P0(i15).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < Y0(); i16++) {
            if (!X0(i16).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < x0(); i17++) {
            if (!w0(i17).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        if (k1() && !F0().isInitialized()) {
            this.f34356I = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < K0(); i18++) {
            if (!J0(i18).isInitialized()) {
                this.f34356I = (byte) 0;
                return false;
            }
        }
        if (m1() && !d1().isInitialized()) {
            this.f34356I = (byte) 0;
            return false;
        }
        if (m()) {
            this.f34356I = (byte) 1;
            return true;
        }
        this.f34356I = (byte) 0;
        return false;
    }

    public boolean j1() {
        return (this.f34359d & 8) == 8;
    }

    public boolean k1() {
        return (this.f34359d & 16) == 16;
    }

    public int l0() {
        return this.f34362g;
    }

    public boolean l1() {
        return (this.f34359d & 32) == 32;
    }

    public d m0(int i10) {
        return (d) this.f34372q.get(i10);
    }

    public boolean m1() {
        return (this.f34359d & 64) == 64;
    }

    public int n0() {
        return this.f34372q.size();
    }

    public boolean n1() {
        return (this.f34359d & 128) == 128;
    }

    public List o0() {
        return this.f34372q;
    }

    public q p0(int i10) {
        return (q) this.f34369n.get(i10);
    }

    public int q0() {
        return this.f34369n.size();
    }

    public List r0() {
        return this.f34370o;
    }

    @Override // md.p
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return p1();
    }

    public List s0() {
        return this.f34369n;
    }

    @Override // md.p
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return q1(this);
    }

    @Override // md.q
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public c getDefaultInstanceForType() {
        return f34346P;
    }

    public g w0(int i10) {
        return (g) this.f34376u.get(i10);
    }

    public int x0() {
        return this.f34376u.size();
    }

    public List y0() {
        return this.f34376u;
    }

    public int z0() {
        return this.f34360e;
    }

    public c(i.c cVar) {
        super(cVar);
        this.f34366k = -1;
        this.f34368m = -1;
        this.f34371p = -1;
        this.f34378w = -1;
        this.f34349B = -1;
        this.f34352E = -1;
        this.f34356I = (byte) -1;
        this.f34357J = -1;
        this.f34358c = cVar.j();
    }

    public c(boolean z10) {
        this.f34366k = -1;
        this.f34368m = -1;
        this.f34371p = -1;
        this.f34378w = -1;
        this.f34349B = -1;
        this.f34352E = -1;
        this.f34356I = (byte) -1;
        this.f34357J = -1;
        this.f34358c = AbstractC5050d.f40294a;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.c implements md.q {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public List f34382A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public w f34383B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34385e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f34388h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f34389i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f34390j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List f34391k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f34392l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f34393m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f34394n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List f34395o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List f34396p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List f34397q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List f34398r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f34399s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34400t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public q f34401u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f34402v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public List f34403w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public List f34404x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public List f34405y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public t f34406z;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f34388h = list;
            this.f34389i = list;
            this.f34390j = list;
            this.f34391k = list;
            this.f34392l = list;
            this.f34393m = list;
            this.f34394n = list;
            this.f34395o = list;
            this.f34396p = list;
            this.f34397q = list;
            this.f34398r = list;
            this.f34399s = list;
            this.f34401u = q.S();
            this.f34403w = list;
            this.f34404x = list;
            this.f34405y = list;
            this.f34406z = t.q();
            this.f34382A = list;
            this.f34383B = w.o();
            N();
        }

        public static b w() {
            return new b();
        }

        public final void A() {
            if ((this.f34384d & 8192) != 8192) {
                this.f34398r = new ArrayList(this.f34398r);
                this.f34384d |= 8192;
            }
        }

        public final void B() {
            if ((this.f34384d & RecognitionOptions.UPC_E) != 1024) {
                this.f34395o = new ArrayList(this.f34395o);
                this.f34384d |= RecognitionOptions.UPC_E;
            }
        }

        public final void C() {
            if ((this.f34384d & 262144) != 262144) {
                this.f34403w = new ArrayList(this.f34403w);
                this.f34384d |= 262144;
            }
        }

        public final void D() {
            if ((this.f34384d & ImageMetadata.SHADING_MODE) != 1048576) {
                this.f34405y = new ArrayList(this.f34405y);
                this.f34384d |= ImageMetadata.SHADING_MODE;
            }
        }

        public final void E() {
            if ((this.f34384d & ImageMetadata.LENS_APERTURE) != 524288) {
                this.f34404x = new ArrayList(this.f34404x);
                this.f34384d |= ImageMetadata.LENS_APERTURE;
            }
        }

        public final void F() {
            if ((this.f34384d & 64) != 64) {
                this.f34391k = new ArrayList(this.f34391k);
                this.f34384d |= 64;
            }
        }

        public final void G() {
            if ((this.f34384d & RecognitionOptions.PDF417) != 2048) {
                this.f34396p = new ArrayList(this.f34396p);
                this.f34384d |= RecognitionOptions.PDF417;
            }
        }

        public final void H() {
            if ((this.f34384d & 16384) != 16384) {
                this.f34399s = new ArrayList(this.f34399s);
                this.f34384d |= 16384;
            }
        }

        public final void I() {
            if ((this.f34384d & 32) != 32) {
                this.f34390j = new ArrayList(this.f34390j);
                this.f34384d |= 32;
            }
        }

        public final void J() {
            if ((this.f34384d & 16) != 16) {
                this.f34389i = new ArrayList(this.f34389i);
                this.f34384d |= 16;
            }
        }

        public final void K() {
            if ((this.f34384d & RecognitionOptions.AZTEC) != 4096) {
                this.f34397q = new ArrayList(this.f34397q);
                this.f34384d |= RecognitionOptions.AZTEC;
            }
        }

        public final void L() {
            if ((this.f34384d & 8) != 8) {
                this.f34388h = new ArrayList(this.f34388h);
                this.f34384d |= 8;
            }
        }

        public final void M() {
            if ((this.f34384d & 4194304) != 4194304) {
                this.f34382A = new ArrayList(this.f34382A);
                this.f34384d |= 4194304;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public b m(c cVar) {
            if (cVar == c.t0()) {
                return this;
            }
            if (cVar.h1()) {
                U(cVar.z0());
            }
            if (cVar.i1()) {
                V(cVar.A0());
            }
            if (cVar.g1()) {
                T(cVar.l0());
            }
            if (!cVar.f34363h.isEmpty()) {
                if (this.f34388h.isEmpty()) {
                    this.f34388h = cVar.f34363h;
                    this.f34384d &= -9;
                } else {
                    L();
                    this.f34388h.addAll(cVar.f34363h);
                }
            }
            if (!cVar.f34364i.isEmpty()) {
                if (this.f34389i.isEmpty()) {
                    this.f34389i = cVar.f34364i;
                    this.f34384d &= -17;
                } else {
                    J();
                    this.f34389i.addAll(cVar.f34364i);
                }
            }
            if (!cVar.f34365j.isEmpty()) {
                if (this.f34390j.isEmpty()) {
                    this.f34390j = cVar.f34365j;
                    this.f34384d &= -33;
                } else {
                    I();
                    this.f34390j.addAll(cVar.f34365j);
                }
            }
            if (!cVar.f34367l.isEmpty()) {
                if (this.f34391k.isEmpty()) {
                    this.f34391k = cVar.f34367l;
                    this.f34384d &= -65;
                } else {
                    F();
                    this.f34391k.addAll(cVar.f34367l);
                }
            }
            if (!cVar.f34369n.isEmpty()) {
                if (this.f34392l.isEmpty()) {
                    this.f34392l = cVar.f34369n;
                    this.f34384d &= -129;
                } else {
                    z();
                    this.f34392l.addAll(cVar.f34369n);
                }
            }
            if (!cVar.f34370o.isEmpty()) {
                if (this.f34393m.isEmpty()) {
                    this.f34393m = cVar.f34370o;
                    this.f34384d &= -257;
                } else {
                    y();
                    this.f34393m.addAll(cVar.f34370o);
                }
            }
            if (!cVar.f34372q.isEmpty()) {
                if (this.f34394n.isEmpty()) {
                    this.f34394n = cVar.f34372q;
                    this.f34384d &= -513;
                } else {
                    x();
                    this.f34394n.addAll(cVar.f34372q);
                }
            }
            if (!cVar.f34373r.isEmpty()) {
                if (this.f34395o.isEmpty()) {
                    this.f34395o = cVar.f34373r;
                    this.f34384d &= -1025;
                } else {
                    B();
                    this.f34395o.addAll(cVar.f34373r);
                }
            }
            if (!cVar.f34374s.isEmpty()) {
                if (this.f34396p.isEmpty()) {
                    this.f34396p = cVar.f34374s;
                    this.f34384d &= -2049;
                } else {
                    G();
                    this.f34396p.addAll(cVar.f34374s);
                }
            }
            if (!cVar.f34375t.isEmpty()) {
                if (this.f34397q.isEmpty()) {
                    this.f34397q = cVar.f34375t;
                    this.f34384d &= -4097;
                } else {
                    K();
                    this.f34397q.addAll(cVar.f34375t);
                }
            }
            if (!cVar.f34376u.isEmpty()) {
                if (this.f34398r.isEmpty()) {
                    this.f34398r = cVar.f34376u;
                    this.f34384d &= -8193;
                } else {
                    A();
                    this.f34398r.addAll(cVar.f34376u);
                }
            }
            if (!cVar.f34377v.isEmpty()) {
                if (this.f34399s.isEmpty()) {
                    this.f34399s = cVar.f34377v;
                    this.f34384d &= -16385;
                } else {
                    H();
                    this.f34399s.addAll(cVar.f34377v);
                }
            }
            if (cVar.j1()) {
                W(cVar.E0());
            }
            if (cVar.k1()) {
                Q(cVar.F0());
            }
            if (cVar.l1()) {
                X(cVar.G0());
            }
            if (!cVar.f34348A.isEmpty()) {
                if (this.f34403w.isEmpty()) {
                    this.f34403w = cVar.f34348A;
                    this.f34384d &= -262145;
                } else {
                    C();
                    this.f34403w.addAll(cVar.f34348A);
                }
            }
            if (!cVar.f34350C.isEmpty()) {
                if (this.f34404x.isEmpty()) {
                    this.f34404x = cVar.f34350C;
                    this.f34384d &= -524289;
                } else {
                    E();
                    this.f34404x.addAll(cVar.f34350C);
                }
            }
            if (!cVar.f34351D.isEmpty()) {
                if (this.f34405y.isEmpty()) {
                    this.f34405y = cVar.f34351D;
                    this.f34384d &= -1048577;
                } else {
                    D();
                    this.f34405y.addAll(cVar.f34351D);
                }
            }
            if (cVar.m1()) {
                R(cVar.d1());
            }
            if (!cVar.f34354G.isEmpty()) {
                if (this.f34382A.isEmpty()) {
                    this.f34382A = cVar.f34354G;
                    this.f34384d &= -4194305;
                } else {
                    M();
                    this.f34382A.addAll(cVar.f34354G);
                }
            }
            if (cVar.n1()) {
                S(cVar.f1());
            }
            r(cVar);
            n(j().d(cVar.f34358c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.c.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.c.f34347Q     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.c r3 = (fd.c) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                fd.c r4 = (fd.c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: fd.c.b.g(md.e, md.g):fd.c$b");
        }

        public b Q(q qVar) {
            if ((this.f34384d & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 65536 || this.f34401u == q.S()) {
                this.f34401u = qVar;
            } else {
                this.f34401u = q.t0(this.f34401u).m(qVar).u();
            }
            this.f34384d |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            return this;
        }

        public b R(t tVar) {
            if ((this.f34384d & 2097152) != 2097152 || this.f34406z == t.q()) {
                this.f34406z = tVar;
            } else {
                this.f34406z = t.y(this.f34406z).m(tVar).q();
            }
            this.f34384d |= 2097152;
            return this;
        }

        public b S(w wVar) {
            if ((this.f34384d & 8388608) != 8388608 || this.f34383B == w.o()) {
                this.f34383B = wVar;
            } else {
                this.f34383B = w.t(this.f34383B).m(wVar).q();
            }
            this.f34384d |= 8388608;
            return this;
        }

        public b T(int i10) {
            this.f34384d |= 4;
            this.f34387g = i10;
            return this;
        }

        public b U(int i10) {
            this.f34384d |= 1;
            this.f34385e = i10;
            return this;
        }

        public b V(int i10) {
            this.f34384d |= 2;
            this.f34386f = i10;
            return this;
        }

        public b W(int i10) {
            this.f34384d |= 32768;
            this.f34400t = i10;
            return this;
        }

        public b X(int i10) {
            this.f34384d |= 131072;
            this.f34402v = i10;
            return this;
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c build() {
            c cVarU = u();
            if (cVarU.isInitialized()) {
                return cVarU;
            }
            throw AbstractC5047a.AbstractC0530a.i(cVarU);
        }

        public c u() {
            c cVar = new c(this);
            int i10 = this.f34384d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            cVar.f34360e = this.f34385e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            cVar.f34361f = this.f34386f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            cVar.f34362g = this.f34387g;
            if ((this.f34384d & 8) == 8) {
                this.f34388h = Collections.unmodifiableList(this.f34388h);
                this.f34384d &= -9;
            }
            cVar.f34363h = this.f34388h;
            if ((this.f34384d & 16) == 16) {
                this.f34389i = Collections.unmodifiableList(this.f34389i);
                this.f34384d &= -17;
            }
            cVar.f34364i = this.f34389i;
            if ((this.f34384d & 32) == 32) {
                this.f34390j = Collections.unmodifiableList(this.f34390j);
                this.f34384d &= -33;
            }
            cVar.f34365j = this.f34390j;
            if ((this.f34384d & 64) == 64) {
                this.f34391k = Collections.unmodifiableList(this.f34391k);
                this.f34384d &= -65;
            }
            cVar.f34367l = this.f34391k;
            if ((this.f34384d & 128) == 128) {
                this.f34392l = Collections.unmodifiableList(this.f34392l);
                this.f34384d &= -129;
            }
            cVar.f34369n = this.f34392l;
            if ((this.f34384d & 256) == 256) {
                this.f34393m = Collections.unmodifiableList(this.f34393m);
                this.f34384d &= -257;
            }
            cVar.f34370o = this.f34393m;
            if ((this.f34384d & 512) == 512) {
                this.f34394n = Collections.unmodifiableList(this.f34394n);
                this.f34384d &= -513;
            }
            cVar.f34372q = this.f34394n;
            if ((this.f34384d & RecognitionOptions.UPC_E) == 1024) {
                this.f34395o = Collections.unmodifiableList(this.f34395o);
                this.f34384d &= -1025;
            }
            cVar.f34373r = this.f34395o;
            if ((this.f34384d & RecognitionOptions.PDF417) == 2048) {
                this.f34396p = Collections.unmodifiableList(this.f34396p);
                this.f34384d &= -2049;
            }
            cVar.f34374s = this.f34396p;
            if ((this.f34384d & RecognitionOptions.AZTEC) == 4096) {
                this.f34397q = Collections.unmodifiableList(this.f34397q);
                this.f34384d &= -4097;
            }
            cVar.f34375t = this.f34397q;
            if ((this.f34384d & 8192) == 8192) {
                this.f34398r = Collections.unmodifiableList(this.f34398r);
                this.f34384d &= -8193;
            }
            cVar.f34376u = this.f34398r;
            if ((this.f34384d & 16384) == 16384) {
                this.f34399s = Collections.unmodifiableList(this.f34399s);
                this.f34384d &= -16385;
            }
            cVar.f34377v = this.f34399s;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            cVar.f34379x = this.f34400t;
            if ((i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 65536) {
                i11 |= 16;
            }
            cVar.f34380y = this.f34401u;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            cVar.f34381z = this.f34402v;
            if ((this.f34384d & 262144) == 262144) {
                this.f34403w = Collections.unmodifiableList(this.f34403w);
                this.f34384d &= -262145;
            }
            cVar.f34348A = this.f34403w;
            if ((this.f34384d & ImageMetadata.LENS_APERTURE) == 524288) {
                this.f34404x = Collections.unmodifiableList(this.f34404x);
                this.f34384d &= -524289;
            }
            cVar.f34350C = this.f34404x;
            if ((this.f34384d & ImageMetadata.SHADING_MODE) == 1048576) {
                this.f34405y = Collections.unmodifiableList(this.f34405y);
                this.f34384d &= -1048577;
            }
            cVar.f34351D = this.f34405y;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            cVar.f34353F = this.f34406z;
            if ((this.f34384d & 4194304) == 4194304) {
                this.f34382A = Collections.unmodifiableList(this.f34382A);
                this.f34384d &= -4194305;
            }
            cVar.f34354G = this.f34382A;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            cVar.f34355H = this.f34383B;
            cVar.f34359d = i11;
            return cVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b e() {
            return w().m(u());
        }

        public final void x() {
            if ((this.f34384d & 512) != 512) {
                this.f34394n = new ArrayList(this.f34394n);
                this.f34384d |= 512;
            }
        }

        public final void y() {
            if ((this.f34384d & 256) != 256) {
                this.f34393m = new ArrayList(this.f34393m);
                this.f34384d |= 256;
            }
        }

        public final void z() {
            if ((this.f34384d & 128) != 128) {
                this.f34392l = new ArrayList(this.f34392l);
                this.f34384d |= 128;
            }
        }

        private void N() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(md.C5051e r22, md.C5053g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.c.<init>(md.e, md.g):void");
    }
}
