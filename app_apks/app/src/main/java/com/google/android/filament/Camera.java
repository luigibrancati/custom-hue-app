package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Camera {

    @Entity
    private final int mEntity;
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Fov {
        VERTICAL,
        HORIZONTAL
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Projection {
        PERSPECTIVE,
        ORTHO
    }

    public Camera(long j10, @Entity int i10) {
        this.mNativeObject = j10;
        this.mEntity = i10;
    }

    public static double computeEffectiveFocalLength(double d10, double d11) {
        return nComputeEffectiveFocalLength(d10, d11);
    }

    public static double computeEffectiveFov(double d10, double d11) {
        return nComputeEffectiveFov(d10, d11);
    }

    private static native double nComputeEffectiveFocalLength(double d10, double d11);

    private static native double nComputeEffectiveFov(double d10, double d11);

    private static native float nGetAperture(long j10);

    private static native double nGetCullingFar(long j10);

    private static native void nGetCullingProjectionMatrix(long j10, double[] dArr);

    private static native double nGetFocalLength(long j10);

    private static native float nGetFocusDistance(long j10);

    private static native void nGetForwardVector(long j10, float[] fArr);

    private static native void nGetLeftVector(long j10, float[] fArr);

    private static native void nGetModelMatrix(long j10, float[] fArr);

    private static native void nGetModelMatrixFp64(long j10, double[] dArr);

    private static native double nGetNear(long j10);

    private static native void nGetPosition(long j10, float[] fArr);

    private static native void nGetProjectionMatrix(long j10, double[] dArr);

    private static native void nGetScaling(long j10, double[] dArr);

    private static native float nGetSensitivity(long j10);

    private static native float nGetShutterSpeed(long j10);

    private static native void nGetUpVector(long j10, float[] fArr);

    private static native void nGetViewMatrix(long j10, float[] fArr);

    private static native void nGetViewMatrixFp64(long j10, double[] dArr);

    private static native void nLookAt(long j10, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18);

    private static native void nSetCustomProjection(long j10, double[] dArr, double[] dArr2, double d10, double d11);

    private static native void nSetExposure(long j10, float f10, float f11, float f12);

    private static native void nSetFocusDistance(long j10, float f10);

    private static native void nSetLensProjection(long j10, double d10, double d11, double d12, double d13);

    private static native void nSetModelMatrix(long j10, float[] fArr);

    private static native void nSetModelMatrixFp64(long j10, double[] dArr);

    private static native void nSetProjection(long j10, int i10, double d10, double d11, double d12, double d13, double d14, double d15);

    private static native void nSetProjectionFov(long j10, double d10, double d11, double d12, double d13, int i10);

    private static native void nSetScaling(long j10, double d10, double d11);

    private static native void nSetShift(long j10, double d10, double d11);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getAperture() {
        return nGetAperture(getNativeObject());
    }

    public float getCullingFar() {
        return (float) nGetCullingFar(getNativeObject());
    }

    public double[] getCullingProjectionMatrix(double[] dArr) {
        double[] dArrAssertMat4d = Asserts.assertMat4d(dArr);
        nGetCullingProjectionMatrix(getNativeObject(), dArrAssertMat4d);
        return dArrAssertMat4d;
    }

    @Entity
    public int getEntity() {
        return this.mEntity;
    }

    public double getFocalLength() {
        return nGetFocalLength(getNativeObject());
    }

    public float getFocusDistance() {
        return nGetFocusDistance(getNativeObject());
    }

    public float[] getForwardVector(float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetForwardVector(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public float[] getLeftVector(float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetLeftVector(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public float[] getModelMatrix(float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetModelMatrix(getNativeObject(), fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Camera");
    }

    public float getNear() {
        return (float) nGetNear(getNativeObject());
    }

    public float[] getPosition(float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetPosition(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public double[] getProjectionMatrix(double[] dArr) {
        double[] dArrAssertMat4d = Asserts.assertMat4d(dArr);
        nGetProjectionMatrix(getNativeObject(), dArrAssertMat4d);
        return dArrAssertMat4d;
    }

    public double[] getScaling(double[] dArr) {
        double[] dArrAssertDouble4 = Asserts.assertDouble4(dArr);
        nGetScaling(getNativeObject(), dArrAssertDouble4);
        return dArrAssertDouble4;
    }

    public float getSensitivity() {
        return nGetSensitivity(getNativeObject());
    }

    public float getShutterSpeed() {
        return nGetShutterSpeed(getNativeObject());
    }

    public float[] getUpVector(float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetUpVector(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    public float[] getViewMatrix(float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetViewMatrix(getNativeObject(), fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public void lookAt(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        nLookAt(getNativeObject(), d10, d11, d12, d13, d14, d15, d16, d17, d18);
    }

    public void setCustomProjection(double[] dArr, double d10, double d11) {
        Asserts.assertMat4dIn(dArr);
        nSetCustomProjection(getNativeObject(), dArr, dArr, d10, d11);
    }

    public void setExposure(float f10, float f11, float f12) {
        nSetExposure(getNativeObject(), f10, f11, f12);
    }

    public void setFocusDistance(float f10) {
        nSetFocusDistance(getNativeObject(), f10);
    }

    public void setLensProjection(double d10, double d11, double d12, double d13) {
        nSetLensProjection(getNativeObject(), d10, d11, d12, d13);
    }

    public void setModelMatrix(float[] fArr) {
        Asserts.assertMat4fIn(fArr);
        nSetModelMatrix(getNativeObject(), fArr);
    }

    public void setProjection(Projection projection, double d10, double d11, double d12, double d13, double d14, double d15) {
        nSetProjection(getNativeObject(), projection.ordinal(), d10, d11, d12, d13, d14, d15);
    }

    public void setScaling(double d10, double d11) {
        nSetScaling(getNativeObject(), d10, d11);
    }

    public void setShift(double d10, double d11) {
        nSetShift(getNativeObject(), d10, d11);
    }

    public void setExposure(float f10) {
        setExposure(1.0f, 1.2f, (1.0f / f10) * 100.0f);
    }

    public void setProjection(double d10, double d11, double d12, double d13, Fov fov) {
        nSetProjectionFov(getNativeObject(), d10, d11, d12, d13, fov.ordinal());
    }

    @Deprecated
    public void setScaling(double[] dArr) {
        Asserts.assertDouble4In(dArr);
        setScaling(dArr[0], dArr[1]);
    }

    public double[] getModelMatrix(double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetModelMatrixFp64(getNativeObject(), dArrAssertMat4);
        return dArrAssertMat4;
    }

    public double[] getViewMatrix(double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetViewMatrixFp64(getNativeObject(), dArrAssertMat4);
        return dArrAssertMat4;
    }

    public void setCustomProjection(double[] dArr, double[] dArr2, double d10, double d11) {
        Asserts.assertMat4dIn(dArr);
        Asserts.assertMat4dIn(dArr2);
        nSetCustomProjection(getNativeObject(), dArr, dArr2, d10, d11);
    }

    public void setModelMatrix(double[] dArr) {
        Asserts.assertMat4In(dArr);
        nSetModelMatrixFp64(getNativeObject(), dArr);
    }
}
