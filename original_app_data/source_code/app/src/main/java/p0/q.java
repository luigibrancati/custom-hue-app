package p0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;
import o0.AbstractC5189f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC5369c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f42129e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f42130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f42131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f42132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f42133i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        float[] fArrB = AbstractC5367a.f42059b.a().b();
        o oVar = o.f42116a;
        float[] fArrL = AbstractC5370d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC5370d.e(fArrB, oVar.b().c(), oVar.e().c()));
        f42130f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f42131g = fArr;
        f42132h = AbstractC5370d.k(fArrL);
        f42133i = AbstractC5370d.k(fArr);
    }

    public q(String str, int i10) {
        super(str, AbstractC5368b.f42065a.a(), i10, null);
    }

    @Override // p0.AbstractC5369c
    public float c(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // p0.AbstractC5369c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // p0.AbstractC5369c
    public long h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f42133i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f42132h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19))) & KeyboardMap.kValueMask);
    }

    @Override // p0.AbstractC5369c
    public float i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f42133i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f42132h;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    @Override // p0.AbstractC5369c
    public long j(float f10, float f11, float f12, float f13, AbstractC5369c abstractC5369c) {
        float[] fArr = f42130f;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float fA = A0.a.a(f14);
        float fA2 = A0.a.a(f15);
        float fA3 = A0.a.a(f16);
        float[] fArr2 = f42131g;
        return AbstractC5189f.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), f13, abstractC5369c);
    }
}
