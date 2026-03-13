package org.webrtc;

import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class Camera1Helper {
    public static Size findClosestCaptureFormat(int i10, int i11, int i12) {
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(i10);
        ArrayList arrayList = new ArrayList();
        if (supportedFormats != null) {
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
                arrayList.add(new Size(captureFormat.width, captureFormat.height));
            }
        }
        return CameraEnumerationAndroid.getClosestSupportedSize(arrayList, i11, i12);
    }

    public static int getCameraId(String str) {
        return Camera1Enumerator.getCameraIndex(str);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i10) {
        return Camera1Enumerator.getSupportedFormats(i10);
    }
}
