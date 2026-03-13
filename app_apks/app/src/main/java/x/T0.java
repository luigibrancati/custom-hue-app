package x;

import E.C0803n0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import y.C6369e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {
    public static boolean a(y.t tVar, String str) throws C0803n0 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) tVar.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C6369e e10) {
            throw new C0803n0(W0.a(e10));
        }
    }
}
