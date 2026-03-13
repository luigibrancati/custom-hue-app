package p0;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final F f42074A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AbstractC5369c f42075B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final AbstractC5369c[] f42076C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f42077D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f42078a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f42079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f42080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f42081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f42082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G f42083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final G f42084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G f42085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F f42086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final F f42087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F f42088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final F f42089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final F f42090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final F f42091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final F f42092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final F f42093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final F f42094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final F f42095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final F f42096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final F f42097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final F f42098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final F f42099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC5369c f42100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AbstractC5369c f42101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final F f42102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final F f42103z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f42079b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f42080c = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        f42081d = fArr3;
        G g10 = new G(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f42082e = g10;
        G g11 = new G(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f42083f = g11;
        G g12 = new G(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f42084g = g12;
        G g13 = new G(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f42085h = g13;
        o oVar = o.f42116a;
        F f10 = new F("sRGB IEC61966-2.1", fArr, oVar.e(), g10, 0);
        f42086i = f10;
        F f11 = new F("sRGB IEC61966-2.1 (Linear)", fArr, oVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f42087j = f11;
        F f12 = new F("scRGB-nl IEC 61966-2-2:2003", fArr, oVar.e(), null, new n() { // from class: p0.e
            @Override // p0.n
            public final double a(double d10) {
                return k.k(d10);
            }
        }, new n() { // from class: p0.f
            @Override // p0.n
            public final double a(double d10) {
                return k.l(d10);
            }
        }, -0.799f, 2.399f, g10, 2);
        f42088k = f12;
        F f13 = new F("scRGB IEC 61966-2-2:2003", fArr, oVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f42089l = f13;
        F f14 = new F("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, oVar.e(), new G(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f42090m = f14;
        F f15 = new F("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, oVar.e(), new G(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f42091n = f15;
        F f16 = new F("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new I(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f42092o = f16;
        F f17 = new F("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, oVar.e(), g10, 7);
        f42093p = f17;
        F f18 = new F("NTSC (1953)", fArr2, oVar.a(), new G(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f42094q = f18;
        F f19 = new F("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, oVar.e(), new G(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f42095r = f19;
        F f20 = new F("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, oVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f42096s = f20;
        F f21 = new F("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, oVar.b(), new G(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f42097t = f21;
        F f22 = new F("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, oVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f42098u = f22;
        F f23 = new F("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, oVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f42099v = f23;
        J j10 = new J("Generic XYZ", 14);
        f42100w = j10;
        p pVar = new p("Generic L*a*b*", 15);
        f42101x = pVar;
        F f24 = new F(OfficeOpenXMLExtended.SECURITY_NONE, fArr, oVar.e(), g11, 16);
        f42102y = f24;
        F f25 = new F("Hybrid Log Gamma encoding", fArr3, oVar.e(), null, new n() { // from class: p0.g
            @Override // p0.n
            public final double a(double d10) {
                return k.g(d10);
            }
        }, new n() { // from class: p0.h
            @Override // p0.n
            public final double a(double d10) {
                return k.h(d10);
            }
        }, 0.0f, 1.0f, g12, 17);
        f42103z = f25;
        F f26 = new F("Perceptual Quantizer encoding", fArr3, oVar.e(), null, new n() { // from class: p0.i
            @Override // p0.n
            public final double a(double d10) {
                return k.i(d10);
            }
        }, new n() { // from class: p0.j
            @Override // p0.n
            public final double a(double d10) {
                return k.j(d10);
            }
        }, 0.0f, 1.0f, g13, 18);
        f42074A = f26;
        q qVar = new q("Oklab", 19);
        f42075B = qVar;
        f42076C = new AbstractC5369c[]{f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, j10, pVar, f24, f25, f26, qVar};
        f42077D = 8;
    }

    public static final double g(double d10) {
        return f42078a.t(f42084g, d10);
    }

    public static final double h(double d10) {
        return f42078a.s(f42084g, d10);
    }

    public static final double i(double d10) {
        return f42078a.v(f42085h, d10);
    }

    public static final double j(double d10) {
        return f42078a.u(f42085h, d10);
    }

    public static final double k(double d10) {
        return AbstractC5370d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double l(double d10) {
        return AbstractC5370d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final AbstractC5369c[] m() {
        return f42076C;
    }

    public final float[] n() {
        return f42080c;
    }

    public final AbstractC5369c o() {
        return f42075B;
    }

    public final F p() {
        return f42086i;
    }

    public final float[] q() {
        return f42079b;
    }

    public final F r() {
        return f42102y;
    }

    public final double s(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double dA = g10.a();
        double dB = g10.b();
        double dC = g10.c();
        double d13 = g10.d();
        double dE = g10.e();
        double d14 = dA * d12;
        return (g10.f() + 1.0d) * d11 * (d14 <= 1.0d ? Math.pow(d14, dB) : Math.exp((d12 - dE) * dC) + d13);
    }

    public final double t(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double dA = 1.0d / g10.a();
        double dB = 1.0d / g10.b();
        double dC = 1.0d / g10.c();
        double d12 = g10.d();
        double dE = g10.e();
        double dF = (d10 * d11) / (g10.f() + 1.0d);
        return d11 * (dF <= 1.0d ? dA * Math.pow(dF, dB) : (dC * Math.log(dF - d12)) + dE);
    }

    public final double u(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        return d11 * Math.pow(Bc.k.d(g10.a() + (g10.b() * Math.pow(d12, g10.c())), 0.0d) / (g10.d() + (g10.e() * Math.pow(d12, g10.c()))), g10.f());
    }

    public final double v(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -g10.a();
        double d14 = g10.d();
        double dF = 1.0d / g10.f();
        return d11 * Math.pow(Math.max(d13 + (d14 * Math.pow(d12, dF)), 0.0d) / (g10.b() + ((-g10.e()) * Math.pow(d12, dF))), 1.0d / g10.c());
    }
}
