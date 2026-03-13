package p0;

import gc.C4202o;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import o0.AbstractC5189f;
import p0.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC5369c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f42030t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f42031u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f42032v = new n() { // from class: p0.u
        @Override // p0.n
        public final double a(double d10) {
            return F.p(d10);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f42033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f42034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f42035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G f42036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f42037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f42038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f42039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f42040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vc.l f42041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f42042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n f42043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vc.l f42044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f42045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f42046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f42047s;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final double A(G g10, double d10) {
            return AbstractC5370d.o(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.g());
        }

        public static final double B(G g10, double d10) {
            return AbstractC5370d.p(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.e(), g10.f(), g10.g());
        }

        public static final double t(G g10, double d10) {
            return k.f42078a.s(g10, d10);
        }

        public static final double u(G g10, double d10) {
            return k.f42078a.u(g10, d10);
        }

        public static final double v(G g10, double d10) {
            return AbstractC5370d.q(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.g());
        }

        public static final double w(G g10, double d10) {
            return AbstractC5370d.r(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.e(), g10.f(), g10.g());
        }

        public static final double y(G g10, double d10) {
            return k.f42078a.t(g10, d10);
        }

        public static final double z(G g10, double d10) {
            return k.f42078a.v(g10, d10);
        }

        public final boolean C(float[] fArr, I i10, n nVar, n nVar2, float f10, float f11, int i11) {
            if (i11 == 0) {
                return true;
            }
            k kVar = k.f42078a;
            if (!AbstractC5370d.g(fArr, kVar.q()) || !AbstractC5370d.f(i10, o.f42116a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            F fP = kVar.p();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!p(d10, nVar, fP.z()) || !p(d10, nVar2, fP.w())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean D(float[] fArr, float f10, float f11) {
            float fO = o(fArr);
            k kVar = k.f42078a;
            if (fO / o(kVar.n()) <= 0.9f || !r(fArr, kVar.q())) {
                return f10 < 0.0f && f11 > 1.0f;
            }
            return true;
        }

        public final float[] E(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                C4202o.o(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        public final float o(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        public final boolean p(double d10, n nVar, n nVar2) {
            return Math.abs(nVar.a(d10) - nVar2.a(d10)) <= 0.001d;
        }

        public final float[] q(float[] fArr, I i10) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fA = i10.a();
            float fB = i10.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - fA) / fB;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (fA / fB) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        public final boolean r(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2];
            float f15 = fArr2[2];
            float f16 = fArr[3];
            float f17 = fArr2[3];
            float f18 = fArr[4];
            float f19 = fArr2[4];
            float f20 = fArr[5];
            float f21 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14 - f15, f16 - f17, f18 - f19, f20 - f21};
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            if (((f13 - f21) * f22) - ((f11 - f19) * f23) >= 0.0f && ((f11 - f15) * f23) - ((f13 - f17) * f22) >= 0.0f) {
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                if (((f17 - f13) * f24) - ((f15 - f11) * f25) >= 0.0f && ((f15 - f19) * f25) - ((f17 - f21) * f24) >= 0.0f) {
                    float f26 = fArr3[4];
                    float f27 = fArr3[5];
                    if (((f21 - f17) * f26) - ((f19 - f15) * f27) >= 0.0f && ((f19 - f11) * f27) - ((f21 - f13) * f26) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final n s(final G g10) {
            return g10.h() ? new n() { // from class: p0.x
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.t(g10, d10);
                }
            } : g10.i() ? new n() { // from class: p0.y
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.u(g10, d10);
                }
            } : (g10.e() == 0.0d && g10.f() == 0.0d) ? new n() { // from class: p0.z
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.v(g10, d10);
                }
            } : new n() { // from class: p0.A
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.w(g10, d10);
                }
            };
        }

        public final n x(final G g10) {
            return g10.h() ? new n() { // from class: p0.B
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.y(g10, d10);
                }
            } : g10.i() ? new n() { // from class: p0.C
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.z(g10, d10);
                }
            } : (g10.e() == 0.0d && g10.f() == 0.0d) ? new n() { // from class: p0.D
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.A(g10, d10);
                }
            } : new n() { // from class: p0.E
                @Override // p0.n
                public final double a(double d10) {
                    return F.a.B(g10, d10);
                }
            };
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {
        public b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(F.this.w().a(Bc.k.j(d10, F.this.f42034f, F.this.f42035g)));
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {
        public c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(Bc.k.j(F.this.z().a(d10), F.this.f42034f, F.this.f42035g));
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    public F(String str, float[] fArr, I i10, float[] fArr2, n nVar, n nVar2, float f10, float f11, G g10, int i11) {
        super(str, AbstractC5368b.f42065a.b(), i11, null);
        this.f42033e = i10;
        this.f42034f = f10;
        this.f42035g = f11;
        this.f42036h = g10;
        this.f42040l = nVar;
        this.f42041m = new c();
        this.f42042n = new n() { // from class: p0.s
            @Override // p0.n
            public final double a(double d10) {
                return F.C(this.f42139a, d10);
            }
        };
        this.f42043o = nVar2;
        this.f42044p = new b();
        this.f42045q = new n() { // from class: p0.t
            @Override // p0.n
            public final double a(double d10) {
                return F.u(this.f42140a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f42030t;
        float[] fArrE = aVar.E(fArr);
        this.f42037i = fArrE;
        if (fArr2 == null) {
            this.f42038j = aVar.q(fArrE, i10);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f42038j = fArr2;
        }
        this.f42039k = AbstractC5370d.k(this.f42038j);
        this.f42046r = aVar.D(fArrE, f10, f11);
        this.f42047s = aVar.C(fArrE, i10, nVar, nVar2, f10, f11, i11);
    }

    public static final double C(F f10, double d10) {
        return Bc.k.j(f10.f42040l.a(d10), f10.f42034f, f10.f42035g);
    }

    public static final double q(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    public static final double r(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public static final double u(F f10, double d10) {
        return f10.f42043o.a(Bc.k.j(d10, f10.f42034f, f10.f42035g));
    }

    public final float[] A() {
        return this.f42038j;
    }

    public final I B() {
        return this.f42033e;
    }

    @Override // p0.AbstractC5369c
    public float c(int i10) {
        return this.f42035g;
    }

    @Override // p0.AbstractC5369c
    public float d(int i10) {
        return this.f42034f;
    }

    @Override // p0.AbstractC5369c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        F f10 = (F) obj;
        if (Float.compare(f10.f42034f, this.f42034f) != 0 || Float.compare(f10.f42035g, this.f42035g) != 0 || !AbstractC4862t.a(this.f42033e, f10.f42033e) || !Arrays.equals(this.f42037i, f10.f42037i)) {
            return false;
        }
        G g10 = this.f42036h;
        if (g10 != null) {
            return AbstractC4862t.a(g10, f10.f42036h);
        }
        if (f10.f42036h == null) {
            return true;
        }
        if (AbstractC4862t.a(this.f42040l, f10.f42040l)) {
            return AbstractC4862t.a(this.f42043o, f10.f42043o);
        }
        return false;
    }

    @Override // p0.AbstractC5369c
    public boolean g() {
        return this.f42047s;
    }

    @Override // p0.AbstractC5369c
    public long h(float f10, float f11, float f12) {
        float fA = (float) this.f42045q.a(f10);
        float fA2 = (float) this.f42045q.a(f11);
        float fA3 = (float) this.f42045q.a(f12);
        float[] fArr = this.f42038j;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & KeyboardMap.kValueMask);
    }

    @Override // p0.AbstractC5369c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f42033e.hashCode()) * 31) + Arrays.hashCode(this.f42037i)) * 31;
        float f10 = this.f42034f;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f42035g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        G g10 = this.f42036h;
        int iHashCode2 = iFloatToIntBits2 + (g10 != null ? g10.hashCode() : 0);
        return this.f42036h == null ? (((iHashCode2 * 31) + this.f42040l.hashCode()) * 31) + this.f42043o.hashCode() : iHashCode2;
    }

    @Override // p0.AbstractC5369c
    public float i(float f10, float f11, float f12) {
        float fA = (float) this.f42045q.a(f10);
        float fA2 = (float) this.f42045q.a(f11);
        float fA3 = (float) this.f42045q.a(f12);
        float[] fArr = this.f42038j;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // p0.AbstractC5369c
    public long j(float f10, float f11, float f12, float f13, AbstractC5369c abstractC5369c) {
        float[] fArr = this.f42039k;
        return AbstractC5189f.a((float) this.f42042n.a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.f42042n.a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.f42042n.a((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, abstractC5369c);
    }

    public final n v() {
        return this.f42045q;
    }

    public final n w() {
        return this.f42043o;
    }

    public final float[] x() {
        return this.f42039k;
    }

    public final n y() {
        return this.f42042n;
    }

    public final n z() {
        return this.f42040l;
    }

    public static final double p(double d10) {
        return d10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(String str, float[] fArr, I i10, G g10, int i11) {
        a aVar = f42030t;
        this(str, fArr, i10, null, aVar.x(g10), aVar.s(g10), 0.0f, 1.0f, g10, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(String str, float[] fArr, I i10, final double d10, float f10, float f11, int i11) {
        n nVar;
        n nVar2;
        if (d10 == 1.0d) {
            nVar = f42032v;
        } else {
            nVar = new n() { // from class: p0.v
                @Override // p0.n
                public final double a(double d11) {
                    return F.q(d10, d11);
                }
            };
        }
        n nVar3 = nVar;
        if (d10 == 1.0d) {
            nVar2 = f42032v;
        } else {
            nVar2 = new n() { // from class: p0.w
                @Override // p0.n
                public final double a(double d11) {
                    return F.r(d10, d11);
                }
            };
        }
        this(str, fArr, i10, null, nVar3, nVar2, f10, f11, new G(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i11);
    }

    public F(F f10, float[] fArr, I i10) {
        this(f10.f(), f10.f42037i, i10, fArr, f10.f42040l, f10.f42043o, f10.f42034f, f10.f42035g, f10.f42036h, -1);
    }
}
