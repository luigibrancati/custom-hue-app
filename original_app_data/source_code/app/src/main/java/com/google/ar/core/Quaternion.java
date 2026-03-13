package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("session_jni_wrapper.cc")
class Quaternion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Quaternion f31088a = new Quaternion();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f31090x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f31091y = 0.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f31092z = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f31089w = 1.0f;

    public Quaternion() {
        a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static Quaternion i(Quaternion quaternion, Quaternion quaternion2, float f10) {
        Quaternion quaternion3 = new Quaternion();
        float f11 = (quaternion.f31090x * quaternion2.f31090x) + (quaternion.f31091y * quaternion2.f31091y) + (quaternion.f31092z * quaternion2.f31092z) + (quaternion.f31089w * quaternion2.f31089w);
        if (f11 < 0.0f) {
            Quaternion quaternion4 = new Quaternion(quaternion2);
            f11 = -f11;
            quaternion4.f31090x = -quaternion4.f31090x;
            quaternion4.f31091y = -quaternion4.f31091y;
            quaternion4.f31092z = -quaternion4.f31092z;
            quaternion4.f31089w = -quaternion4.f31089w;
            quaternion2 = quaternion4;
        }
        float f12 = 1.0f - f10;
        float fAcos = (float) Math.acos(f11);
        float fSqrt = (float) Math.sqrt(1.0f - (f11 * f11));
        if (Math.abs(fSqrt) > 0.001d) {
            float f13 = 1.0f / fSqrt;
            float fSin = (float) Math.sin(f12 * fAcos);
            f10 = ((float) Math.sin(f10 * fAcos)) * f13;
            f12 = fSin * f13;
        }
        quaternion3.f31090x = (quaternion.f31090x * f12) + (quaternion2.f31090x * f10);
        quaternion3.f31091y = (quaternion.f31091y * f12) + (quaternion2.f31091y * f10);
        quaternion3.f31092z = (quaternion.f31092z * f12) + (quaternion2.f31092z * f10);
        quaternion3.f31089w = (f12 * quaternion.f31089w) + (f10 * quaternion2.f31089w);
        float fSqrt2 = (float) (1.0d / Math.sqrt((((r1 * r1) + (r2 * r2)) + (r4 * r4)) + (r3 * r3)));
        quaternion3.f31090x *= fSqrt2;
        quaternion3.f31091y *= fSqrt2;
        quaternion3.f31092z *= fSqrt2;
        quaternion3.f31089w *= fSqrt2;
        return quaternion3;
    }

    public static void j(Quaternion quaternion, float[] fArr, int i10, float[] fArr2, int i11) {
        float f10 = fArr[i10];
        float f11 = fArr[i10 + 1];
        float f12 = fArr[i10 + 2];
        float f13 = quaternion.f31090x;
        float f14 = quaternion.f31091y;
        float f15 = quaternion.f31092z;
        float f16 = quaternion.f31089w;
        float f17 = f14 * f12;
        float f18 = f15 * f11;
        float f19 = f16 * f11;
        float f20 = f15 * f10;
        float f21 = f13 * f12;
        float f22 = f16 * f12;
        float f23 = f13 * f11;
        float f24 = f14 * f10;
        float f25 = -f13;
        float f26 = f11 * f14;
        float f27 = f12 * f15;
        float f28 = ((f16 * f10) + f17) - f18;
        float f29 = -f15;
        float f30 = -f14;
        float f31 = (f22 + f23) - f24;
        float f32 = (f19 + f20) - f21;
        float f33 = ((f10 * f25) - f26) - f27;
        fArr2[i11] = (((f28 * f16) + (f33 * f25)) + (f32 * f29)) - (f31 * f30);
        fArr2[i11 + 1] = (((f32 * f16) + (f33 * f30)) + (f31 * f25)) - (f28 * f29);
        fArr2[i11 + 2] = (((f31 * f16) + (f33 * f29)) + (f28 * f30)) - (f32 * f25);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f31090x = f10;
        this.f31091y = f11;
        this.f31092z = f12;
        this.f31089w = f13;
    }

    public final float b() {
        return this.f31090x;
    }

    public final float c() {
        return this.f31091y;
    }

    public final float d() {
        return this.f31092z;
    }

    public final float e() {
        return this.f31089w;
    }

    public final void f(float[] fArr, int i10) {
        fArr[i10] = this.f31090x;
        fArr[i10 + 1] = this.f31091y;
        fArr[i10 + 2] = this.f31092z;
        fArr[i10 + 3] = this.f31089w;
    }

    public final Quaternion g() {
        return new Quaternion(-this.f31090x, -this.f31091y, -this.f31092z, this.f31089w);
    }

    public final Quaternion h(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f10 = this.f31090x;
        float f11 = quaternion.f31089w;
        float f12 = this.f31091y;
        float f13 = quaternion.f31092z;
        float f14 = this.f31092z;
        float f15 = quaternion.f31091y;
        float f16 = this.f31089w;
        quaternion2.f31090x = (((f10 * f11) + (f12 * f13)) - (f14 * f15)) + (quaternion.f31090x * f16);
        float f17 = this.f31090x;
        float f18 = -f17;
        float f19 = quaternion.f31090x;
        quaternion2.f31091y = (f18 * f13) + (f12 * f11) + (f14 * f19) + (f15 * f16);
        float f20 = quaternion.f31091y;
        float f21 = this.f31091y;
        quaternion2.f31092z = ((f17 * f20) - (f21 * f19)) + (f14 * f11) + (f13 * f16);
        quaternion2.f31089w = (((f18 * f19) - (f21 * f20)) - (this.f31092z * quaternion.f31092z)) + (f16 * f11);
        return quaternion2;
    }

    public final void k(float[] fArr, int i10) {
        float f10 = this.f31090x;
        float f11 = this.f31091y;
        float f12 = this.f31092z;
        float f13 = this.f31089w;
        float f14 = (f10 * f10) + (f11 * f11) + (f12 * f12) + (f13 * f13);
        float f15 = f14 > 0.0f ? 2.0f / f14 : 0.0f;
        float f16 = f10 * f15;
        float f17 = f11 * f15;
        float f18 = f15 * f12;
        float f19 = f13 * f16;
        float f20 = f13 * f17;
        float f21 = f13 * f18;
        float f22 = f16 * f10;
        float f23 = f10 * f17;
        float f24 = f10 * f18;
        float f25 = f17 * f11;
        float f26 = f11 * f18;
        float f27 = f12 * f18;
        fArr[i10] = 1.0f - (f25 + f27);
        fArr[i10 + 4] = f23 - f21;
        fArr[i10 + 8] = f24 + f20;
        fArr[i10 + 1] = f23 + f21;
        fArr[i10 + 5] = 1.0f - (f27 + f22);
        fArr[i10 + 9] = f26 - f19;
        fArr[i10 + 2] = f24 - f20;
        fArr[i10 + 6] = f26 + f19;
        fArr[i10 + 10] = 1.0f - (f22 + f25);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", Float.valueOf(this.f31090x), Float.valueOf(this.f31091y), Float.valueOf(this.f31092z), Float.valueOf(this.f31089w));
    }

    @UsedByNative("session_jni_wrapper.cc")
    public Quaternion(float f10, float f11, float f12, float f13) {
        a(f10, f11, f12, f13);
    }

    public Quaternion(Quaternion quaternion) {
        a(quaternion.f31090x, quaternion.f31091y, quaternion.f31092z, quaternion.f31089w);
    }
}
