package com.google.ar.core;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CameraIntrinsics {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public CameraIntrinsics() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private native void nativeDestroyCameraIntrinsics(long j10, long j11);

    private native void nativeGetFocalLength(long j10, long j11, float[] fArr, int i10);

    private native void nativeGetImageDimensions(long j10, long j11, int[] iArr, int i10);

    private native void nativeGetPrincipalPoint(long j10, long j11, float[] fArr, int i10);

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyCameraIntrinsics(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public float[] getFocalLength() {
        float[] fArr = new float[2];
        getFocalLength(fArr, 0);
        return fArr;
    }

    public int[] getImageDimensions() {
        int[] iArr = new int[2];
        getImageDimensions(iArr, 0);
        return iArr;
    }

    public float[] getPrincipalPoint() {
        float[] fArr = new float[2];
        getPrincipalPoint(fArr, 0);
        return fArr;
    }

    public CameraIntrinsics(long j10, Session session) {
        this.nativeHandle = j10;
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public void getFocalLength(float[] fArr, int i10) {
        nativeGetFocalLength(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10);
    }

    public void getImageDimensions(int[] iArr, int i10) {
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr, i10);
    }

    public void getPrincipalPoint(float[] fArr, int i10) {
        nativeGetPrincipalPoint(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10);
    }
}
