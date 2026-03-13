package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AfRegionFlipHorizontallyQuirk implements T0 {
    public static boolean d(C6378n c6378n) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
