package com.google.ar.core;

import com.google.ar.core.CameraConfig;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CameraConfigFilter {
    private static final String TAG = "CameraConfigFilter";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public CameraConfigFilter() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeCreateCameraConfigFilter(long j10);

    private static native void nativeDestroyCameraConfigFilter(long j10, long j11);

    private native int nativeGetDepthSensorUsage(long j10, long j11);

    private native int nativeGetFacingDirection(long j10, long j11);

    private native int nativeGetStereoCameraUsage(long j10, long j11);

    private native int nativeGetTargetFps(long j10, long j11);

    private native void nativeSetDepthSensorUsage(long j10, long j11, int i10);

    private native void nativeSetFacingDirection(long j10, long j11, int i10);

    private native void nativeSetStereoCameraUsage(long j10, long j11, int i10);

    private native void nativeSetTargetFps(long j10, long j11, int i10);

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyCameraConfigFilter(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public EnumSet<CameraConfig.DepthSensorUsage> getDepthSensorUsage() {
        return CameraConfig.DepthSensorUsage.forBitFlags(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CameraConfig.FacingDirection getFacingDirection() {
        return CameraConfig.FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public EnumSet<CameraConfig.StereoCameraUsage> getStereoCameraUsage() {
        return CameraConfig.StereoCameraUsage.forBitFlags(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public EnumSet<CameraConfig.TargetFps> getTargetFps() {
        return CameraConfig.TargetFps.forBitFlags(nativeGetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CameraConfigFilter setDepthSensorUsage(EnumSet<CameraConfig.DepthSensorUsage> enumSet) {
        Iterator<CameraConfig.DepthSensorUsage> it = enumSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().nativeCode;
        }
        nativeSetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle, i10);
        return this;
    }

    public CameraConfigFilter setFacingDirection(CameraConfig.FacingDirection facingDirection) {
        nativeSetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle, facingDirection.nativeCode);
        return this;
    }

    public CameraConfigFilter setStereoCameraUsage(EnumSet<CameraConfig.StereoCameraUsage> enumSet) {
        Iterator<CameraConfig.StereoCameraUsage> it = enumSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().nativeCode;
        }
        nativeSetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle, i10);
        return this;
    }

    public CameraConfigFilter setTargetFps(EnumSet<CameraConfig.TargetFps> enumSet) {
        Iterator<CameraConfig.TargetFps> it = enumSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().nativeCode;
        }
        nativeSetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle, i10);
        return this;
    }

    public CameraConfigFilter(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateCameraConfigFilter(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
