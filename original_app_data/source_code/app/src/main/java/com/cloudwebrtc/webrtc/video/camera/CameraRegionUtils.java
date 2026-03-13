package com.cloudwebrtc.webrtc.video.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.util.Arrays;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class CameraRegionUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.video.camera.CameraRegionUtils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation;

        static {
            int[] iArr = new int[PlatformChannel.DeviceOrientation.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation = iArr;
            try {
                iArr[PlatformChannel.DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel.DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MeteringRectangleFactory {
        public static MeteringRectangle create(int i10, int i11, int i12, int i13, int i14) {
            return new MeteringRectangle(i10, i11, i12, i13, i14);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SizeFactory {
        public static Size create(int i10, int i11) {
            return new Size(i10, i11);
        }
    }

    public static /* synthetic */ boolean a(int i10) {
        return i10 != 0;
    }

    public static MeteringRectangle convertPointToMeteringRectangle(Size size, double d10, double d11, PlatformChannel.DeviceOrientation deviceOrientation) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[deviceOrientation.ordinal()];
        if (i10 == 1) {
            d11 = 1.0d - d10;
            d10 = d11;
        } else if (i10 == 2) {
            double d12 = 1.0d - d11;
            d11 = d10;
            d10 = d12;
        } else if (i10 == 4) {
            d10 = 1.0d - d10;
            d11 = 1.0d - d11;
        }
        int iRound = (int) Math.round(d10 * ((double) (size.getWidth() - 1)));
        int iRound2 = (int) Math.round(d11 * ((double) (size.getHeight() - 1)));
        int iRound3 = (int) Math.round(((double) size.getWidth()) / 10.0d);
        int iRound4 = (int) Math.round(((double) size.getHeight()) / 10.0d);
        int i11 = iRound - (iRound3 / 2);
        int i12 = iRound2 - (iRound4 / 2);
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        int width = (size.getWidth() - 1) - iRound3;
        int height = (size.getHeight() - 1) - iRound4;
        if (i11 > width) {
            i11 = width;
        }
        if (i12 > height) {
            i12 = height;
        }
        return MeteringRectangleFactory.create(i11, i12, iRound3, iRound4, 1);
    }

    public static Size getCameraBoundaries(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder) {
        if (!SdkCapabilityChecker.supportsDistortionCorrection() || !supportsDistortionCorrection(cameraCharacteristics)) {
            return getSensorInfoPixelArraySize(cameraCharacteristics);
        }
        Integer num = (Integer) builder.get(CaptureRequest.DISTORTION_CORRECTION_MODE);
        Rect sensorInfoPreCorrectionActiveArraySize = (num == null || num.intValue() == 0) ? getSensorInfoPreCorrectionActiveArraySize(cameraCharacteristics) : getSensorInfoActiveArraySize(cameraCharacteristics);
        return SizeFactory.create(sensorInfoPreCorrectionActiveArraySize.width(), sensorInfoPreCorrectionActiveArraySize.height());
    }

    public static Integer getControlMaxRegionsAutoExposure(CameraCharacteristics cameraCharacteristics) {
        return (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
    }

    public static int[] getDistortionCorrectionAvailableModes(CameraCharacteristics cameraCharacteristics) {
        return (int[]) cameraCharacteristics.get(CameraCharacteristics.DISTORTION_CORRECTION_AVAILABLE_MODES);
    }

    public static Rect getSensorInfoActiveArraySize(CameraCharacteristics cameraCharacteristics) {
        return (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public static Size getSensorInfoPixelArraySize(CameraCharacteristics cameraCharacteristics) {
        return (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
    }

    public static Rect getSensorInfoPreCorrectionActiveArraySize(CameraCharacteristics cameraCharacteristics) {
        return (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
    }

    @TargetApi(28)
    private static boolean supportsDistortionCorrection(CameraCharacteristics cameraCharacteristics) {
        int[] distortionCorrectionAvailableModes = getDistortionCorrectionAvailableModes(cameraCharacteristics);
        if (distortionCorrectionAvailableModes == null) {
            distortionCorrectionAvailableModes = new int[0];
        }
        return Arrays.stream(distortionCorrectionAvailableModes).filter(new IntPredicate() { // from class: com.cloudwebrtc.webrtc.video.camera.a
            @Override // java.util.function.IntPredicate
            public final boolean test(int i10) {
                return CameraRegionUtils.a(i10);
            }
        }).count() > 0;
    }
}
