package B;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import w.C6107a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j {
    public void a(int i10, C6107a.C0631a c0631a) {
        if (((ImageCapturePixelHDRPlusQuirk) A.d.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            c0631a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            c0631a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
