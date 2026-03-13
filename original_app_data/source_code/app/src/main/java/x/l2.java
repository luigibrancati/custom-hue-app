package x;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l2 {
    public static boolean a(C6378n c6378n) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) c6378n.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i10 : iArr) {
                if (i10 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
