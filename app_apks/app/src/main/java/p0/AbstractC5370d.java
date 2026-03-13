package p0;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import p0.AbstractC5368b;
import p0.l;

/* JADX INFO: renamed from: p0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5370d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(o(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final AbstractC5369c c(AbstractC5369c abstractC5369c, I i10, AbstractC5367a abstractC5367a) {
        if (AbstractC5368b.e(abstractC5369c.e(), AbstractC5368b.f42065a.b())) {
            AbstractC4862t.c(abstractC5369c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            F f10 = (F) abstractC5369c;
            if (!f(f10.B(), i10)) {
                return new F(f10, l(e(abstractC5367a.b(), f10.B().c(), i10.c()), f10.A()), i10);
            }
        }
        return abstractC5369c;
    }

    public static /* synthetic */ AbstractC5369c d(AbstractC5369c abstractC5369c, I i10, AbstractC5367a abstractC5367a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            abstractC5367a = AbstractC5367a.f42059b.a();
        }
        return c(abstractC5369c, i10, abstractC5367a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(I i10, I i11) {
        if (i10 == i11) {
            return true;
        }
        return Math.abs(i10.a() - i11.a()) < 0.001f && Math.abs(i10.b() - i11.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final l h(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, int i10) {
        int iB = abstractC5369c.b();
        int iB2 = abstractC5369c2.b();
        if ((iB | iB2) < 0) {
            return j(abstractC5369c, abstractC5369c2, i10);
        }
        b0.w wVarA = m.a();
        int i11 = iB | (iB2 << 6) | (i10 << 12);
        Object objB = wVarA.b(i11);
        if (objB == null) {
            objB = j(abstractC5369c, abstractC5369c2, i10);
            wVarA.n(i11, objB);
        }
        return (l) objB;
    }

    public static /* synthetic */ l i(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC5369c2 = k.f42078a.p();
        }
        if ((i11 & 2) != 0) {
            i10 = r.f42134a.b();
        }
        return h(abstractC5369c, abstractC5369c2, i10);
    }

    public static final l j(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, int i10) {
        if (abstractC5369c == abstractC5369c2) {
            return l.f42104g.c(abstractC5369c);
        }
        long jE = abstractC5369c.e();
        AbstractC5368b.a aVar = AbstractC5368b.f42065a;
        AbstractC4854k abstractC4854k = null;
        if (!AbstractC5368b.e(jE, aVar.b()) || !AbstractC5368b.e(abstractC5369c2.e(), aVar.b())) {
            return new l(abstractC5369c, abstractC5369c2, i10, abstractC4854k);
        }
        AbstractC4862t.c(abstractC5369c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        AbstractC4862t.c(abstractC5369c2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new l.b((F) abstractC5369c, (F) abstractC5369c2, i10, abstractC4854k);
    }

    public static final float[] k(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        fArr3[1] = (f15 * f16) + (f12 * f17) + (f18 * f14);
        float f19 = fArr[2] * f16;
        float f20 = fArr[5];
        float f21 = f19 + (fArr2[1] * f20);
        float f22 = fArr[8];
        fArr3[2] = f21 + (f14 * f22);
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = f24 + (f11 * f25);
        float f27 = fArr2[5];
        fArr3[3] = f26 + (f13 * f27);
        float f28 = fArr[1];
        float f29 = fArr2[3];
        fArr3[4] = (f28 * f29) + (f17 * f25) + (f18 * f27);
        float f30 = fArr[2];
        fArr3[5] = (f29 * f30) + (f20 * fArr2[4]) + (f27 * f22);
        float f31 = f23 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = f31 + (f32 * f33);
        float f35 = fArr2[8];
        fArr3[6] = f34 + (f13 * f35);
        float f36 = fArr2[6];
        fArr3[7] = (f28 * f36) + (fArr[4] * f33) + (f18 * f35);
        fArr3[8] = (f30 * f36) + (fArr[5] * fArr2[7]) + (f22 * f35);
        return fArr3;
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
