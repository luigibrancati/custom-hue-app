package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements T0 {
    public static boolean d() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return d();
    }
}
