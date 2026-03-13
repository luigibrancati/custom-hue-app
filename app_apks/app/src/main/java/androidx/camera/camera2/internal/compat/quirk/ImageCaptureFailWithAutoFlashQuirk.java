package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21947a = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(C6378n c6378n) {
        return f21947a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
