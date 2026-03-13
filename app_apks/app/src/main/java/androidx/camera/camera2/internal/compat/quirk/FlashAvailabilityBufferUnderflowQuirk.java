package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f21945a = new HashSet();

    static {
        d("sprd", "lemp");
        d("sprd", "DM20C");
    }

    public static void d(String str, String str2) {
        Set set = f21945a;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    public static boolean e() {
        Set set = f21945a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
