package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f21948a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6"));

    public static boolean d() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        Set set = f21948a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (set.contains(str.toLowerCase(locale)) || "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (str2.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        return "itel".equalsIgnoreCase(Build.BRAND) && str2.toLowerCase(locale).startsWith("sp");
    }

    public static boolean f() {
        return e() || d();
    }
}
