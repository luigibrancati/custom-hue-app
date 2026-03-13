package androidx.camera.core.internal.compat.quirk;

import L.T0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class LargeJpegImageQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22019a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f22020b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    public static boolean d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f22019a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean f() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && f22020b.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean g() {
        return d() || f();
    }

    public boolean h(byte[] bArr) {
        return e() || f() || bArr.length > 10000000;
    }
}
