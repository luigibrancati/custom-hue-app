package androidx.camera.core.internal.compat.quirk;

import L.T0;
import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22016a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    public static boolean e() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f22016a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int d() {
        return 1;
    }
}
