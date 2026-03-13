package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class MathUtils {
    private MathUtils() {
    }

    private static native void nPackTangentFrame(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr, int i10);

    public static void packTangentFrame(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr) {
        nPackTangentFrame(f10, f11, f12, f13, f14, f15, f16, f17, f18, fArr, 0);
    }

    public static void packTangentFrame(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr, int i10) {
        nPackTangentFrame(f10, f11, f12, f13, f14, f15, f16, f17, f18, fArr, i10);
    }
}
