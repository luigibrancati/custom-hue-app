package androidx.camera.camera2.internal.compat.quirk;

import A.b;
import L.T0;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, T0 {
    public static boolean d() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        "pixel 4 xl".equalsIgnoreCase(Build.MODEL);
        return false;
    }

    public static boolean h() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean i() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    public static boolean j() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean k() {
        return d() || e() || j() || h() || g() || f() || i() || b.d();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean b() {
        return d() || e() || j() || h();
    }
}
