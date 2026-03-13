package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class TransformManager {
    private long mNativeObject;

    public TransformManager(long j10) {
        this.mNativeObject = j10;
    }

    private static native void nCommitLocalTransformTransaction(long j10);

    private static native int nCreate(long j10, int i10);

    private static native int nCreateArray(long j10, int i10, int i11, float[] fArr);

    private static native int nCreateArrayFp64(long j10, int i10, int i11, double[] dArr);

    private static native void nDestroy(long j10, int i10);

    private static native int nGetChildCount(long j10, int i10);

    private static native void nGetChildren(long j10, int i10, int[] iArr, int i11);

    private static native int nGetInstance(long j10, int i10);

    private static native int nGetParent(long j10, int i10);

    private static native void nGetTransform(long j10, int i10, float[] fArr);

    private static native void nGetTransformFp64(long j10, int i10, double[] dArr);

    private static native void nGetWorldTransform(long j10, int i10, float[] fArr);

    private static native void nGetWorldTransformFp64(long j10, int i10, double[] dArr);

    private static native boolean nHasComponent(long j10, int i10);

    private static native boolean nIsAccurateTranslationsEnabled(long j10);

    private static native void nOpenLocalTransformTransaction(long j10);

    private static native void nSetAccurateTranslationsEnabled(long j10, boolean z10);

    private static native void nSetParent(long j10, int i10, int i11);

    private static native void nSetTransform(long j10, int i10, float[] fArr);

    private static native void nSetTransformFp64(long j10, int i10, double[] dArr);

    public void commitLocalTransformTransaction() {
        nCommitLocalTransformTransaction(this.mNativeObject);
    }

    @EntityInstance
    public int create(@Entity int i10) {
        return nCreate(this.mNativeObject, i10);
    }

    public void destroy(@Entity int i10) {
        nDestroy(this.mNativeObject, i10);
    }

    public int getChildCount(@EntityInstance int i10) {
        return nGetChildCount(this.mNativeObject, i10);
    }

    @Entity
    public int[] getChildren(@EntityInstance int i10, int[] iArr) {
        if (iArr == null) {
            iArr = new int[getChildCount(i10)];
        }
        if (iArr.length > 0) {
            nGetChildren(this.mNativeObject, i10, iArr, iArr.length);
        }
        return iArr;
    }

    @EntityInstance
    public int getInstance(@Entity int i10) {
        return nGetInstance(this.mNativeObject, i10);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int getParent(@EntityInstance int i10) {
        return nGetParent(this.mNativeObject, i10);
    }

    public float[] getTransform(@EntityInstance int i10, float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetTransform(this.mNativeObject, i10, fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public float[] getWorldTransform(@EntityInstance int i10, float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetWorldTransform(this.mNativeObject, i10, fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public boolean hasComponent(@Entity int i10) {
        return nHasComponent(this.mNativeObject, i10);
    }

    public boolean isAccurateTranslationsEnabled() {
        return nIsAccurateTranslationsEnabled(this.mNativeObject);
    }

    public void openLocalTransformTransaction() {
        nOpenLocalTransformTransaction(this.mNativeObject);
    }

    public void setAccurateTranslationsEnabled(boolean z10) {
        nSetAccurateTranslationsEnabled(this.mNativeObject, z10);
    }

    public void setParent(@EntityInstance int i10, @EntityInstance int i11) {
        nSetParent(this.mNativeObject, i10, i11);
    }

    public void setTransform(@EntityInstance int i10, float[] fArr) {
        Asserts.assertMat4fIn(fArr);
        nSetTransform(this.mNativeObject, i10, fArr);
    }

    @EntityInstance
    public int create(@Entity int i10, @EntityInstance int i11, float[] fArr) {
        return nCreateArray(this.mNativeObject, i10, i11, fArr);
    }

    @EntityInstance
    public int create(@Entity int i10, @EntityInstance int i11, double[] dArr) {
        return nCreateArrayFp64(this.mNativeObject, i10, i11, dArr);
    }

    public double[] getTransform(@EntityInstance int i10, double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetTransformFp64(this.mNativeObject, i10, dArrAssertMat4);
        return dArrAssertMat4;
    }

    public double[] getWorldTransform(@EntityInstance int i10, double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetWorldTransformFp64(this.mNativeObject, i10, dArrAssertMat4);
        return dArrAssertMat4;
    }

    public void setTransform(@EntityInstance int i10, double[] dArr) {
        Asserts.assertMat4In(dArr);
        nSetTransformFp64(this.mNativeObject, i10, dArr);
    }
}
