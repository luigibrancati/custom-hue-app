package androidx.camera.core.internal.compat.quirk;

import L.C1095e0;
import L.InterfaceC1099g0;
import L.T0;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements T0 {
    public static boolean d() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Cuttlefish") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.PRODUCT.equals("google_sdk") || Build.HARDWARE.contains("ranchu");
    }

    public static boolean e() {
        d();
        return false;
    }

    public static boolean f() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean i() {
        return g() || f() || e();
    }

    public boolean h(InterfaceC1099g0.a aVar) {
        return aVar != C1095e0.f8038i;
    }
}
