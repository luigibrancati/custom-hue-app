package com.cloudwebrtc.webrtc.video.camera;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.cloudwebrtc.webrtc.GetUserMediaImpl;
import com.cloudwebrtc.webrtc.utils.AnyThreadResult;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.lang.reflect.Field;
import java.util.List;
import org.webrtc.Camera1Capturer;
import org.webrtc.Camera2Capturer;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.VideoCapturer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CameraUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "CameraUtils";
    Activity activity;
    private DeviceOrientationManager deviceOrientationManager;
    private GetUserMediaImpl getUserMediaImpl;
    private boolean isTorchOn = false;

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.video.camera.CameraUtils$1, reason: invalid class name */
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
    public class NoSuchFieldWithNameException extends NoSuchFieldException {
        String className;
        String fieldName;

        public NoSuchFieldWithNameException(String str, String str2, NoSuchFieldException noSuchFieldException) {
            super(noSuchFieldException.getMessage());
            this.className = str;
            this.fieldName = str2;
        }
    }

    public CameraUtils(GetUserMediaImpl getUserMediaImpl, Activity activity) {
        this.getUserMediaImpl = getUserMediaImpl;
        this.activity = activity;
        this.deviceOrientationManager = new DeviceOrientationManager(activity, 0);
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

    private Object getPrivateProperty(Class cls, Object obj, String str) throws NoSuchFieldWithNameException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchFieldException e11) {
            throw this.new NoSuchFieldWithNameException(cls.getName(), str, e11);
        }
    }

    private static void resultError(String str, String str2, MethodChannel.Result result) {
        String str3 = str + "(): " + str2;
        result.error(str, str3, null);
        Log.d(TAG, str3);
    }

    public void hasTorch(String str, MethodChannel.Result result) {
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("hasTorch", "Video capturer not found for id: " + str, result);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (videoCapturer instanceof Camera2Capturer) {
            try {
                Object privateProperty = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                try {
                    Boolean bool = (Boolean) ((CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager")).getCameraCharacteristics(((CameraDevice) getPrivateProperty(privateProperty.getClass(), privateProperty, "cameraDevice")).getId()).get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    bool.booleanValue();
                    result.success(bool);
                    return;
                } catch (CameraAccessException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (NoSuchFieldWithNameException e11) {
                resultError("hasTorch", "[TORCH] Failed to get `" + e11.fieldName + "` from `" + e11.className + "`", result);
                return;
            }
        }
        if (!(videoCapturer instanceof Camera1Capturer)) {
            resultError("hasTorch", "[TORCH] Video capturer not compatible", result);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            List<String> supportedFlashModes = ((Camera) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "camera")).getParameters().getSupportedFlashModes();
            result.success(Boolean.valueOf(supportedFlashModes != null && supportedFlashModes.contains("torch")));
        } catch (NoSuchFieldWithNameException e12) {
            resultError("hasTorch", "[TORCH] Failed to get `" + e12.fieldName + "` from `" + e12.className + "`", result);
        }
    }

    public void setExposurePoint(MethodCall methodCall, Point point, AnyThreadResult anyThreadResult) {
        String str = (String) methodCall.argument("trackId");
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setExposurePoint", "Video capturer not found for id: " + str, anyThreadResult);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (videoCapturer instanceof Camera1Capturer) {
                try {
                    Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                    Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                    parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                    parameters.setFocusAreas(null);
                } catch (NoSuchFieldWithNameException e10) {
                    resultError("setFocusMode", "[FocusMode] Failed to get `" + e10.fieldName + "` from `" + e10.className + "`", anyThreadResult);
                    return;
                }
            }
            resultError("setFocusMode", "[FocusMode] Video capturer not compatible", anyThreadResult);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraManager cameraManager = (CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).getClass();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraDevice.getId());
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
                if (CameraRegionUtils.getControlMaxRegionsAutoExposure(cameraCharacteristics).intValue() <= 0) {
                    resultError("setExposurePoint", "[setExposurePoint] Camera does not support auto exposure", anyThreadResult);
                    return;
                }
                MeteringRectangle meteringRectangleConvertPointToMeteringRectangle = convertPointToMeteringRectangle(CameraRegionUtils.getCameraBoundaries(cameraCharacteristics, builderCreateCaptureRequest), point.f28851x.doubleValue(), point.f28852y.doubleValue(), this.deviceOrientationManager.getLastUIOrientation());
                if (meteringRectangleConvertPointToMeteringRectangle != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangleConvertPointToMeteringRectangle});
                } else {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
                    builderCreateCaptureRequest.set(key, (MeteringRectangle[]) builderCreateCaptureRequest.get(key));
                }
                builderCreateCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, handler);
                anyThreadResult.success(null);
            } catch (CameraAccessException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchFieldWithNameException e12) {
            resultError("setExposurePoint", "[setExposurePoint] Failed to get `" + e12.fieldName + "` from `" + e12.className + "`", anyThreadResult);
        }
    }

    public void setFocusMode(MethodCall methodCall, AnyThreadResult anyThreadResult) {
        String str = (String) methodCall.argument("trackId");
        String str2 = (String) methodCall.argument("mode");
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setFocusMode", "Video capturer not found for id: " + str, anyThreadResult);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (videoCapturer instanceof Camera1Capturer) {
                try {
                    Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                    Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                    parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                    if (!parameters.getSupportedFocusModes().isEmpty()) {
                        str2.getClass();
                        if (str2.equals("locked")) {
                            parameters.setFocusMode("fixed");
                        } else if (str2.equals("auto")) {
                            parameters.setFocusMode("auto");
                        }
                        anyThreadResult.success(null);
                        return;
                    }
                } catch (NoSuchFieldWithNameException e10) {
                    resultError("setFocusMode", "[FocusMode] Failed to get `" + e10.fieldName + "` from `" + e10.className + "`", anyThreadResult);
                    return;
                }
            }
            resultError("setFocusMode", "[FocusMode] Video capturer not compatible", anyThreadResult);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureFormat");
            int iIntValue = ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).intValue();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
                int iHashCode = str2.hashCode();
                if (iHashCode != -1097452790) {
                    if (iHashCode == 3005871 && str2.equals("auto")) {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    }
                } else if (str2.equals("locked")) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
                }
                builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, Integer.valueOf(this.isTorchOn ? 2 : 0));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat.framerate.min / iIntValue), Integer.valueOf(captureFormat.framerate.max / iIntValue)));
                builderCreateCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, handler);
                anyThreadResult.success(null);
            } catch (CameraAccessException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchFieldWithNameException e12) {
            resultError("setFocusMode", "[FocusMode] Failed to get `" + e12.fieldName + "` from `" + e12.className + "`", anyThreadResult);
        }
    }

    public void setFocusPoint(MethodCall methodCall, Point point, AnyThreadResult anyThreadResult) {
        String str = (String) methodCall.argument("trackId");
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setFocusMode", "Video capturer not found for id: " + str, anyThreadResult);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (!(videoCapturer instanceof Camera1Capturer)) {
                resultError("setFocusMode", "[FocusMode] Video capturer not compatible", anyThreadResult);
                return;
            }
            try {
                Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                parameters.setFocusAreas(null);
                anyThreadResult.success(null);
                return;
            } catch (NoSuchFieldWithNameException e10) {
                resultError("setFocusMode", "[FocusMode] Failed to get `" + e10.fieldName + "` from `" + e10.className + "`", anyThreadResult);
                return;
            }
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraManager cameraManager = (CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).getClass();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraDevice.getId());
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, builderCreateCaptureRequest == null ? null : new MeteringRectangle[]{convertPointToMeteringRectangle(CameraRegionUtils.getCameraBoundaries(cameraCharacteristics, builderCreateCaptureRequest), point.f28851x.doubleValue(), point.f28852y.doubleValue(), this.deviceOrientationManager.getLastUIOrientation())});
                builderCreateCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, handler);
                anyThreadResult.success(null);
            } catch (CameraAccessException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchFieldWithNameException e12) {
            resultError("setFocusMode", "[FocusMode] Failed to get `" + e12.fieldName + "` from `" + e12.className + "`", anyThreadResult);
        }
    }

    public void setTorch(String str, boolean z10, MethodChannel.Result result) {
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setTorch", "Video capturer not found for id: " + str, result);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (!(videoCapturer instanceof Camera1Capturer)) {
                resultError("setTorch", "[TORCH] Video capturer not compatible", result);
                return;
            }
            try {
                Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                Camera camera = (Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera");
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode(z10 ? "torch" : "off");
                camera.setParameters(parameters);
                result.success(null);
                this.isTorchOn = z10;
                return;
            } catch (NoSuchFieldWithNameException e10) {
                resultError("setTorch", "[TORCH] Failed to get `" + e10.fieldName + "` from `" + e10.className + "`", result);
                return;
            }
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureFormat");
            int iIntValue = ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).intValue();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
                builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z10 ? 2 : 0));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat.framerate.min / iIntValue), Integer.valueOf(captureFormat.framerate.max / iIntValue)));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                builderCreateCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, handler);
                result.success(null);
                this.isTorchOn = z10;
            } catch (CameraAccessException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchFieldWithNameException e12) {
            resultError("setTorch", "[TORCH] Failed to get `" + e12.fieldName + "` from `" + e12.className + "`", result);
        }
    }

    public void setZoom(String str, double d10, MethodChannel.Result result) {
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setZoom", "Video capturer not found for id: " + str, result);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (videoCapturer instanceof Camera1Capturer) {
                try {
                    Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                    Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                    parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                    if (parameters.isZoomSupported()) {
                        parameters.setZoom((int) Math.max(0.0d, Math.min(d10, parameters.getMaxZoom())));
                        result.success(null);
                        return;
                    }
                } catch (NoSuchFieldWithNameException e10) {
                    resultError("setZoom", "[ZOOM] Failed to get `" + e10.fieldName + "` from `" + e10.className + "`", result);
                    return;
                }
            }
            resultError("setZoom", "[ZOOM] Video capturer not compatible", result);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraManager cameraManager = (CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureFormat");
            int iIntValue = ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).intValue();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
                Rect rect = (Rect) cameraManager.getCameraCharacteristics(cameraDevice.getId()).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                float fMax = 1.0f / ((float) Math.max(1.0d, Math.min(d10, ((Float) r5.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue())));
                int i10 = 2;
                if (rect != null) {
                    int iWidth = rect.width() - Math.round(rect.width() * fMax);
                    int iHeight = rect.height() - Math.round(rect.height() * fMax);
                    builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, new Rect(iWidth / 2, iHeight / 2, rect.width() - (iWidth / 2), rect.height() - (iHeight / 2)));
                }
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (!this.isTorchOn) {
                    i10 = 0;
                }
                builderCreateCaptureRequest.set(key, Integer.valueOf(i10));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat.framerate.min / iIntValue), Integer.valueOf(captureFormat.framerate.max / iIntValue)));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                builderCreateCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, handler);
                result.success(null);
            } catch (CameraAccessException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchFieldWithNameException e12) {
            resultError("setZoom", "[ZOOM] Failed to get `" + e12.fieldName + "` from `" + e12.className + "`", result);
        }
    }

    public void setExposureMode(MethodCall methodCall, AnyThreadResult anyThreadResult) {
    }
}
