package androidx.camera.core.internal.compat.quirk;

import E.C0781c0;
import E.C0822x0;
import E.W0;
import L.T0;
import L.s1;
import L.t1;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22017a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean d() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "google".equalsIgnoreCase(Build.BRAND) && f22017a.contains(Build.MODEL.toLowerCase());
    }

    public static boolean g() {
        return d() || e();
    }

    public final boolean f(Collection collection) {
        if (collection.size() != 3) {
            return false;
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            if (w02 instanceof C0822x0) {
                z10 = true;
            } else if (w02 instanceof C0781c0) {
                z12 = true;
            } else if (w02.l().d(s1.f8181G)) {
                z11 = w02.l().S() == t1.b.VIDEO_CAPTURE;
            }
        }
        return z10 && z11 && z12;
    }

    public boolean h(String str, Collection collection) {
        if (d()) {
            return i(str, collection);
        }
        if (e()) {
            return j(str, collection);
        }
        return false;
    }

    public final boolean i(String str, Collection collection) {
        return str.equals("1") && f(collection);
    }

    public final boolean j(String str, Collection collection) {
        return str.equals("1") && f(collection);
    }
}
