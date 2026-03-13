package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("session_jni_wrapper.cc")
public class GeospatialPose {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public GeospatialPose(long j10, Session session) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native void nativeDestroy(long j10, long j11);

    private native float[] nativeEastUpSouthQuaternion(long j10, long j11);

    private native double nativeGetAltitude(long j10, long j11);

    private native double nativeGetHeading(long j10, long j11);

    private native double nativeGetHeadingAccuracy(long j10, long j11);

    private native double nativeGetHorizontalAccuracy(long j10, long j11);

    private native double nativeGetLatitude(long j10, long j11);

    private native double nativeGetLongitude(long j10, long j11);

    private native double nativeGetOrientationYawAccuracy(long j10, long j11);

    private native double nativeGetVerticalAccuracy(long j10, long j11);

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public double getAltitude() {
        return nativeGetAltitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float[] getEastUpSouthQuaternion() {
        return nativeEastUpSouthQuaternion(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public double getHeading() {
        return nativeGetHeading(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public double getHeadingAccuracy() {
        return nativeGetHeadingAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHorizontalAccuracy() {
        return nativeGetHorizontalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLatitude() {
        return nativeGetLatitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLongitude() {
        return nativeGetLongitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getOrientationYawAccuracy() {
        return nativeGetOrientationYawAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getVerticalAccuracy() {
        return nativeGetVerticalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
