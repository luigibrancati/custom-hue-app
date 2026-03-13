package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21949a = Arrays.asList("itel w6004");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f21950b = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(C6378n c6378n) {
        List list = f21950b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f21949a.contains(str.toLowerCase(locale));
    }
}
