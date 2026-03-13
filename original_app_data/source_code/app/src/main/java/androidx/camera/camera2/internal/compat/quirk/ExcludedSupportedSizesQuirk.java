package androidx.camera.camera2.internal.compat.quirk;

import E.AbstractC0807p0;
import L.T0;
import android.os.Build;
import android.util.Size;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements T0 {
    public static boolean m() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean n() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static boolean o() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean p() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean q() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean r() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }

    public static boolean s() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean t() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean u() {
        return o() || p() || m() || t() || s() || q() || r() || n();
    }

    public List d(String str, int i10) {
        if (o()) {
            return g(str, i10);
        }
        if (p()) {
            return h(str, i10);
        }
        if (m()) {
            return e(str, i10, null);
        }
        if (t()) {
            return l(str, i10, null);
        }
        if (s()) {
            return k(str, i10, null);
        }
        if (q()) {
            return i(str, i10);
        }
        if (r()) {
            return j(i10);
        }
        if (n()) {
            return f(i10);
        }
        AbstractC0807p0.l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    public final List e(String str, int i10, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(WebrtcBuildVersion.maint_version) && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    public final List f(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 == 35) {
            arrayList.add(new Size(4032, 3024));
            arrayList.add(new Size(4000, 3000));
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3200, 2400));
            arrayList.add(new Size(3024, 3024));
            arrayList.add(new Size(2976, 2976));
            arrayList.add(new Size(2448, 2448));
        }
        return arrayList;
    }

    public final List g(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(WebrtcBuildVersion.maint_version) && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List h(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(WebrtcBuildVersion.maint_version) && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List i(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(WebrtcBuildVersion.maint_version) && i10 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    public final List j(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 == 35) {
            arrayList.add(new Size(3840, 2160));
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3200, 2400));
            arrayList.add(new Size(2688, 1512));
            arrayList.add(new Size(2592, 1944));
            arrayList.add(new Size(2592, 1940));
            arrayList.add(new Size(1920, 1440));
        }
        return arrayList;
    }

    public final List k(String str, int i10, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(WebrtcBuildVersion.maint_version)) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
            if (i10 == 35) {
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    public final List l(String str, int i10, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(WebrtcBuildVersion.maint_version)) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
            if (i10 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }
}
