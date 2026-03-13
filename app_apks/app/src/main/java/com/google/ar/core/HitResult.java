package com.google.ar.core;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class HitResult {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public HitResult() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private native long nativeCreateAnchor(long j10, long j11);

    private static native void nativeDestroyHitResult(long j10, long j11);

    private native float nativeGetDistance(long j10, long j11);

    private native Pose nativeGetPose(long j10, long j11);

    public Anchor createAnchor() {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public boolean equals(Object obj) {
        return (obj instanceof HitResult) && ((HitResult) obj).nativeHandle == this.nativeHandle;
    }

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyHitResult(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public float getDistance() {
        return nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getHitPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Trackable getTrackable() {
        return this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public native long nativeAcquireTrackable(long j10, long j11);

    public HitResult(long j10, Session session) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
