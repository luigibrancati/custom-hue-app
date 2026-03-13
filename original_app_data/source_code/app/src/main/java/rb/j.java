package rb;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43959b = "j";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f43960c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f43961a;

    public j() {
        this.f43961a = new float[16];
        f(f43960c);
    }

    public static void e(j jVar, j jVar2, j jVar3) {
        j jVar4 = jVar;
        k.d(jVar4, "Parameter \"lhs\" was null.");
        k.d(jVar2, "Parameter \"rhs\" was null.");
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        int i10 = 0;
        while (true) {
            float f26 = f10;
            if (i10 >= 4) {
                float[] fArr = jVar3.f43961a;
                fArr[0] = f26;
                fArr[1] = f11;
                fArr[2] = f12;
                fArr[3] = f13;
                fArr[4] = f14;
                fArr[5] = f15;
                fArr[6] = f16;
                fArr[7] = f17;
                fArr[8] = f18;
                fArr[9] = f19;
                fArr[10] = f20;
                fArr[11] = f21;
                fArr[12] = f22;
                fArr[13] = f23;
                fArr[14] = f24;
                fArr[15] = f25;
                return;
            }
            float[] fArr2 = jVar4.f43961a;
            int i11 = i10 * 4;
            float f27 = fArr2[i11];
            float f28 = fArr2[i11 + 1];
            float f29 = fArr2[i11 + 2];
            float f30 = fArr2[i11 + 3];
            float[] fArr3 = jVar2.f43961a;
            float f31 = fArr3[i10];
            float f32 = fArr3[i10 + 4];
            float f33 = fArr3[i10 + 8];
            float f34 = fArr3[i10 + 12];
            f11 += f28 * f31;
            f12 += f29 * f31;
            f13 += f31 * f30;
            f14 += f27 * f32;
            f15 += f28 * f32;
            f16 += f29 * f32;
            f17 += f32 * f30;
            f18 += f27 * f33;
            f19 += f28 * f33;
            f20 += f29 * f33;
            f21 += f33 * f30;
            f22 += f27 * f34;
            f23 += f28 * f34;
            f24 += f29 * f34;
            f25 += f30 * f34;
            i10++;
            jVar4 = jVar;
            f10 = f26 + (f27 * f31);
        }
    }

    public void a(p pVar, j jVar) {
        if (pVar.f43970a != 0.0f) {
            for (int i10 = 0; i10 < 3; i10++) {
                jVar.f43961a[i10] = this.f43961a[i10] / pVar.f43970a;
            }
        }
        jVar.f43961a[3] = 0.0f;
        if (pVar.f43971b != 0.0f) {
            for (int i11 = 4; i11 < 7; i11++) {
                jVar.f43961a[i11] = this.f43961a[i11] / pVar.f43971b;
            }
        }
        jVar.f43961a[7] = 0.0f;
        if (pVar.f43972c != 0.0f) {
            for (int i12 = 8; i12 < 11; i12++) {
                jVar.f43961a[i12] = this.f43961a[i12] / pVar.f43972c;
            }
        }
        float[] fArr = jVar.f43961a;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public void b(p pVar) {
        float[] fArr = this.f43961a;
        p pVar2 = new p(fArr[0], fArr[1], fArr[2]);
        pVar.f43970a = pVar2.f();
        float[] fArr2 = this.f43961a;
        pVar2.o(fArr2[4], fArr2[5], fArr2[6]);
        pVar.f43971b = pVar2.f();
        float[] fArr3 = this.f43961a;
        pVar2.o(fArr3[8], fArr3[9], fArr3[10]);
        pVar.f43972c = pVar2.f();
    }

    public void c(l lVar) {
        float[] fArr = this.f43961a;
        float f10 = fArr[0];
        float f11 = fArr[5];
        float f12 = fArr[10];
        float f13 = f10 + f11 + f12;
        if (f13 > 0.0f) {
            float fSqrt = ((float) Math.sqrt(((double) f13) + 1.0d)) * 2.0f;
            lVar.f43965d = 0.25f * fSqrt;
            float[] fArr2 = this.f43961a;
            lVar.f43962a = (fArr2[6] - fArr2[9]) / fSqrt;
            lVar.f43963b = (fArr2[8] - fArr2[2]) / fSqrt;
            lVar.f43964c = (fArr2[1] - fArr2[4]) / fSqrt;
        } else if (f10 > f11 && f10 > f12) {
            float fSqrt2 = ((float) Math.sqrt(((f10 + 1.0f) - f11) - f12)) * 2.0f;
            float[] fArr3 = this.f43961a;
            lVar.f43965d = (fArr3[6] - fArr3[9]) / fSqrt2;
            lVar.f43962a = 0.25f * fSqrt2;
            lVar.f43963b = (fArr3[4] + fArr3[1]) / fSqrt2;
            lVar.f43964c = (fArr3[8] + fArr3[2]) / fSqrt2;
        } else if (f11 > f12) {
            float fSqrt3 = ((float) Math.sqrt(((f11 + 1.0f) - f10) - f12)) * 2.0f;
            float[] fArr4 = this.f43961a;
            lVar.f43965d = (fArr4[8] - fArr4[2]) / fSqrt3;
            lVar.f43962a = (fArr4[4] + fArr4[1]) / fSqrt3;
            lVar.f43963b = 0.25f * fSqrt3;
            lVar.f43964c = (fArr4[9] + fArr4[6]) / fSqrt3;
        } else {
            float fSqrt4 = ((float) Math.sqrt(((f12 + 1.0f) - f10) - f11)) * 2.0f;
            float[] fArr5 = this.f43961a;
            lVar.f43965d = (fArr5[1] - fArr5[4]) / fSqrt4;
            lVar.f43962a = (fArr5[8] + fArr5[2]) / fSqrt4;
            lVar.f43963b = (fArr5[9] + fArr5[6]) / fSqrt4;
            lVar.f43964c = fSqrt4 * 0.25f;
        }
        lVar.c();
    }

    public void d(float f10) {
        k.d(Float.valueOf(f10), "Parameter \"scale\" was null.");
        f(f43960c);
        float[] fArr = this.f43961a;
        fArr[0] = f10;
        fArr[5] = f10;
        fArr[10] = f10;
    }

    public void f(float[] fArr) {
        if (fArr == null || fArr.length != 16) {
            Log.w(f43959b, "Cannot set Matrix, invalid data.");
            return;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.f43961a[i10] = fArr[i10];
        }
    }

    public void g(p pVar) {
        float[] fArr = this.f43961a;
        fArr[12] = pVar.f43970a;
        fArr[13] = pVar.f43971b;
        fArr[14] = pVar.f43972c;
    }

    public p h(p pVar) {
        k.d(pVar, "Parameter \"vector\" was null.");
        p pVar2 = new p();
        float f10 = pVar.f43970a;
        float f11 = pVar.f43971b;
        float f12 = pVar.f43972c;
        float[] fArr = this.f43961a;
        float f13 = fArr[0] * f10;
        pVar2.f43970a = f13;
        float f14 = f13 + (fArr[4] * f11);
        pVar2.f43970a = f14;
        float f15 = f14 + (fArr[8] * f12);
        pVar2.f43970a = f15;
        pVar2.f43970a = f15 + fArr[12];
        float f16 = fArr[1] * f10;
        pVar2.f43971b = f16;
        float f17 = f16 + (fArr[5] * f11);
        pVar2.f43971b = f17;
        float f18 = f17 + (fArr[9] * f12);
        pVar2.f43971b = f18;
        pVar2.f43971b = f18 + fArr[13];
        float f19 = fArr[2] * f10;
        pVar2.f43972c = f19;
        float f20 = f19 + (fArr[6] * f11);
        pVar2.f43972c = f20;
        float f21 = f20 + (fArr[10] * f12);
        pVar2.f43972c = f21;
        pVar2.f43972c = f21 + fArr[14];
        return pVar2;
    }

    public j(float[] fArr) {
        this.f43961a = new float[16];
        f(fArr);
    }
}
