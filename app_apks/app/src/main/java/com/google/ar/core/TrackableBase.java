package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("trackable_base_jni.cc")
class TrackableBase implements Trackable {
    long nativeHandle;
    protected final long nativeSymbolTableHandle;
    protected final Session session;

    public TrackableBase(long j10, Session session) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session == null ? 0L : session.nativeSymbolTableHandle;
    }

    public static int internalGetType(long j10, long j11) {
        return nativeGetType(j10, j11);
    }

    public static void internalReleaseNativeHandle(long j10, long j11) {
        nativeReleaseTrackable(j10, j11);
    }

    private native long nativeCreateAnchor(long j10, long j11, Pose pose);

    private native long[] nativeGetAnchors(long j10, long j11);

    private native int nativeGetTrackingState(long j10, long j11);

    private static native int nativeGetType(long j10, long j11);

    private static native void nativeReleaseTrackable(long j10, long j11);

    @Override // com.google.ar.core.Trackable
    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TrackableBase) && ((TrackableBase) obj).nativeHandle == this.nativeHandle;
    }

    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseTrackable(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.Trackable
    public Collection<Anchor> getAnchors() {
        return this.session.convertNativeAnchorsToCollection(nativeGetAnchors(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.Trackable
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
