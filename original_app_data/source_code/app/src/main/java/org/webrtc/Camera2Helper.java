package org.webrtc;

import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class Camera2Helper {
    public static Size findClosestCaptureFormat(CameraManager cameraManager, String str, int i10, int i11) {
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(cameraManager, str);
        ArrayList arrayList = new ArrayList();
        if (supportedFormats != null) {
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
                arrayList.add(new Size(captureFormat.width, captureFormat.height));
            }
        }
        return CameraEnumerationAndroid.getClosestSupportedSize(arrayList, i10, i11);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
        return Camera2Enumerator.getSupportedFormats(cameraManager, str);
    }
}
