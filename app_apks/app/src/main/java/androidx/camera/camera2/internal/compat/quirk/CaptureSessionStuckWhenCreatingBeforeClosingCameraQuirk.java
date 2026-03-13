package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements T0 {
    public static boolean d(C6378n c6378n) {
        return e(c6378n);
    }

    public static boolean e(C6378n c6378n) {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && c6378n.b().equals("1");
    }
}
