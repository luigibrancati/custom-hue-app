package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.nio.FloatBuffer;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Plane extends TrackableBase {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Type {
        HORIZONTAL_UPWARD_FACING(0),
        HORIZONTAL_DOWNWARD_FACING(1),
        VERTICAL(2);

        final int nativeCode;

        Type(int i10) {
            this.nativeCode = i10;
        }

        public static Type forNumber(int i10) {
            for (Type type : values()) {
                if (type.nativeCode == i10) {
                    return type;
                }
            }
            throw new FatalException(p.b((byte) 46, i10, "Unexpected value for native Plane.Type, value="));
        }
    }

    public Plane() {
        super(0L, null);
    }

    private native long nativeAcquireSubsumedBy(long j10, long j11);

    private native Pose nativeGetCenterPose(long j10, long j11);

    private native float nativeGetExtentX(long j10, long j11);

    private native float nativeGetExtentZ(long j10, long j11);

    private native float[] nativeGetPolygon(long j10, long j11);

    private native int nativeGetType(long j10, long j11);

    private native boolean nativeIsPoseInExtents(long j10, long j11, Pose pose);

    private native boolean nativeIsPoseInPolygon(long j10, long j11, Pose pose);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Pose getCenterPose() {
        return nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentX() {
        return nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentZ() {
        return nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public FloatBuffer getPolygon() {
        return FloatBuffer.wrap(nativeGetPolygon(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Plane getSubsumedBy() {
        long jNativeAcquireSubsumedBy = nativeAcquireSubsumedBy(this.session.nativeWrapperHandle, this.nativeHandle);
        if (jNativeAcquireSubsumedBy == 0) {
            return null;
        }
        return new Plane(jNativeAcquireSubsumedBy, this.session);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public Type getType() {
        return Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isPoseInExtents(Pose pose) {
        return nativeIsPoseInExtents(this.session.nativeWrapperHandle, this.nativeHandle, pose);
    }

    public boolean isPoseInPolygon(Pose pose) {
        return nativeIsPoseInPolygon(this.session.nativeWrapperHandle, this.nativeHandle, pose);
    }

    public Plane(long j10, Session session) {
        super(j10, session);
    }
}
