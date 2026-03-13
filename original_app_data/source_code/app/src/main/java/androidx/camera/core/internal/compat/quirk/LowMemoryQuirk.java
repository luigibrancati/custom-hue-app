package androidx.camera.core.internal.compat.quirk;

import L.T0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22021a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean d() {
        return f22021a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
