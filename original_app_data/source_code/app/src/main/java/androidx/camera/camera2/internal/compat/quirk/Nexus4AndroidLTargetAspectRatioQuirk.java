package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21959a = Arrays.asList("NEXUS 4");

    public static boolean e() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int d() {
        return 2;
    }
}
