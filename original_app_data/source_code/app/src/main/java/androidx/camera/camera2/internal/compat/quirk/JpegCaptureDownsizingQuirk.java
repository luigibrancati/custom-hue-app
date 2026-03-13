package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f21957a = new HashSet(Arrays.asList("redmi note 8 pro"));

    public static boolean d(C6378n c6378n) {
        return f21957a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c6378n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
