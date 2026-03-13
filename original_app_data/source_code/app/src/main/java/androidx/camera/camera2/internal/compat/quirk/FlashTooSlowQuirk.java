package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21946a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    public static boolean d() {
        Iterator it = f21946a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(C6378n c6378n) {
        return d() && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
