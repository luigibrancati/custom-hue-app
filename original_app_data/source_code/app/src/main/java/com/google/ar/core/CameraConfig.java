package com.google.ar.core;

import android.util.Range;
import android.util.Size;
import com.google.ar.core.exceptions.FatalException;
import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);

        final int nativeCode;

        DepthSensorUsage(int i10) {
            this.nativeCode = i10;
        }

        public static EnumSet<DepthSensorUsage> forBitFlags(int i10) {
            EnumSet<DepthSensorUsage> enumSetNoneOf = EnumSet.noneOf(DepthSensorUsage.class);
            for (DepthSensorUsage depthSensorUsage : values()) {
                if ((depthSensorUsage.nativeCode & i10) != 0) {
                    enumSetNoneOf.add(depthSensorUsage);
                }
            }
            return enumSetNoneOf;
        }

        public static DepthSensorUsage forNumber(int i10) {
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i10) {
                    return depthSensorUsage;
                }
            }
            throw new FatalException(p.b((byte) 52, i10, "Unexpected value for native DepthSensorUsage, value="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);

        final int nativeCode;

        FacingDirection(int i10) {
            this.nativeCode = i10;
        }

        public static FacingDirection forNumber(int i10) {
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i10) {
                    return facingDirection;
                }
            }
            throw new FatalException(p.b((byte) 51, i10, "Unexpected value for native FacingDirection, value="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);

        final int nativeCode;

        StereoCameraUsage(int i10) {
            this.nativeCode = i10;
        }

        public static EnumSet<StereoCameraUsage> forBitFlags(int i10) {
            EnumSet<StereoCameraUsage> enumSetNoneOf = EnumSet.noneOf(StereoCameraUsage.class);
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if ((stereoCameraUsage.nativeCode & i10) != 0) {
                    enumSetNoneOf.add(stereoCameraUsage);
                }
            }
            return enumSetNoneOf;
        }

        public static StereoCameraUsage forNumber(int i10) {
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if (stereoCameraUsage.nativeCode == i10) {
                    return stereoCameraUsage;
                }
            }
            throw new FatalException(p.b((byte) 53, i10, "Unexpected value for native StereoCameraUsage, value="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);

        final int nativeCode;

        TargetFps(int i10) {
            this.nativeCode = i10;
        }

        public static EnumSet<TargetFps> forBitFlags(int i10) {
            EnumSet<TargetFps> enumSetNoneOf = EnumSet.noneOf(TargetFps.class);
            for (TargetFps targetFps : values()) {
                if ((targetFps.nativeCode & i10) != 0) {
                    enumSetNoneOf.add(targetFps);
                }
            }
            return enumSetNoneOf;
        }
    }

    public CameraConfig() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native void nativeDestroyCameraConfig(long j10, long j11);

    private native String nativeGetCameraId(long j10, long j11);

    private native int nativeGetDepthSensorUsage(long j10, long j11);

    private native int nativeGetFacingDirection(long j10, long j11);

    private native void nativeGetFpsRange(long j10, long j11, int[] iArr);

    private native void nativeGetImageDimensions(long j10, long j11, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j10, long j11);

    private native void nativeGetTextureDimensions(long j10, long j11, int[] iArr);

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Range<Integer> getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public StereoCameraUsage getStereoCameraUsage() {
        return StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public CameraConfig(Session session, long j10) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
