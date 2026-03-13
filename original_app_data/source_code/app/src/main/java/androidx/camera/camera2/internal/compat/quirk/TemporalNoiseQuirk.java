package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    public static boolean d() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e(C6378n c6378n) {
        return d() && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
