package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x.C6266v;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements T0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f21964b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6378n f21965a;

    public TorchFlashRequiredFor3aUpdateQuirk(C6378n c6378n) {
        this.f21965a = c6378n;
    }

    public static boolean d(C6378n c6378n) {
        return e() && h(c6378n);
    }

    private static boolean e() {
        Iterator it = f21964b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(C6378n c6378n) {
        return C6266v.O(c6378n, 5) == 5;
    }

    public static boolean h(C6378n c6378n) {
        return ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static boolean i(C6378n c6378n) {
        return d(c6378n);
    }

    public boolean g() {
        return !f(this.f21965a);
    }
}
