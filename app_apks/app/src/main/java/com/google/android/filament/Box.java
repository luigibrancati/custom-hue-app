package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Box {
    private final float[] mCenter;
    private final float[] mHalfExtent;

    public Box() {
        this.mCenter = new float[3];
        this.mHalfExtent = new float[3];
    }

    public float[] getCenter() {
        return this.mCenter;
    }

    public float[] getHalfExtent() {
        return this.mHalfExtent;
    }

    public void setCenter(float f10, float f11, float f12) {
        float[] fArr = this.mCenter;
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
    }

    public void setHalfExtent(float f10, float f11, float f12) {
        float[] fArr = this.mHalfExtent;
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
    }

    public Box(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.mCenter = new float[]{f10, f11, f12};
        this.mHalfExtent = new float[]{f13, f14, f15};
    }

    public Box(float[] fArr, float[] fArr2) {
        this.mCenter = new float[]{fArr[0], fArr[1], fArr[2]};
        this.mHalfExtent = new float[]{fArr2[0], fArr2[1], fArr2[2]};
    }
}
