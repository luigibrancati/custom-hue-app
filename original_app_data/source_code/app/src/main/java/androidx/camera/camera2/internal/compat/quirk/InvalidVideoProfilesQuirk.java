package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21954a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f21955b = Arrays.asList("cph2417", "cph2451");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f21956c = Arrays.asList("cph2437", "cph2525", "pht110");

    public static boolean d() {
        return Build.VERSION.SDK_INT == 33;
    }

    public static boolean e() {
        return f() && d();
    }

    public static boolean f() {
        return f21955b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean g() {
        return h() && d();
    }

    public static boolean h() {
        return f21956c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean i() {
        return p() || n();
    }

    public static boolean j() {
        return k() && i();
    }

    public static boolean k() {
        return f21954a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean l() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && p();
    }

    public static boolean m() {
        String str = Build.BRAND;
        if ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) {
            return o() || p();
        }
        return false;
    }

    public static boolean n() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    public static boolean o() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    public static boolean p() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    public static boolean q() {
        return l() || j() || m() || e() || g();
    }
}
