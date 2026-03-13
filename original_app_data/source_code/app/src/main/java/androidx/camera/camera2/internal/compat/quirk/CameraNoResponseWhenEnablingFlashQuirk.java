package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21937a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN", "VIVO 1610");

    public static boolean d(C6378n c6378n) {
        return f21937a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
