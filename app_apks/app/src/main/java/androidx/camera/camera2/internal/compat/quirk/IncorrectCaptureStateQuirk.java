package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.hardware.camera2.CameraCharacteristics;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class IncorrectCaptureStateQuirk implements T0 {
    public static boolean d(C6378n c6378n) {
        Integer num = (Integer) c6378n.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
