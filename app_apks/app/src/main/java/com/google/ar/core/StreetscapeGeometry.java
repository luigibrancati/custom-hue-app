package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class StreetscapeGeometry extends TrackableBase {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Quality {
        NONE(0),
        BUILDING_LOD_1(1),
        BUILDING_LOD_2(2);

        final int nativeCode;

        Quality(int i10) {
            this.nativeCode = i10;
        }

        public static Quality forNumber(int i10) {
            for (Quality quality : values()) {
                if (quality.nativeCode == i10) {
                    return quality;
                }
            }
            throw new FatalException(p.b((byte) 63, i10, "Unexpected value for native StreetscapeGeometry.Quality, value="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Type {
        TERRAIN(0),
        BUILDING(1);

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
            throw new FatalException(p.b((byte) 60, i10, "Unexpected value for native StreetscapeGeometry.Type, value="));
        }
    }

    public StreetscapeGeometry(long j10, Session session) {
        super(j10, session);
    }

    private native long nativeAcquireMesh(long j10, long j11);

    private native Pose nativeGetMeshPose(long j10, long j11);

    private native int nativeGetQuality(long j10, long j11);

    private native int nativeGetType(long j10, long j11);

    private native void nativeReleaseStreetscapeGeometry(long j10, long j11);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseStreetscapeGeometry(this.session.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Mesh getMesh() {
        long jNativeAcquireMesh = nativeAcquireMesh(this.session.nativeWrapperHandle, this.nativeHandle);
        if (jNativeAcquireMesh != 0) {
            return new Mesh(jNativeAcquireMesh, this.session);
        }
        return null;
    }

    public Pose getMeshPose() {
        return nativeGetMeshPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Quality getQuality() {
        return Quality.forNumber(nativeGetQuality(this.session.nativeWrapperHandle, this.nativeHandle));
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
}
