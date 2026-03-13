package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.hardware.camera2.CameraCharacteristics;
import java.util.List;
import y.C6378n;
import y.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f21935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f21936b = null;

    public CamcorderProfileResolutionQuirk(C6378n c6378n) {
        this.f21935a = c6378n.e();
    }

    public static boolean d(C6378n c6378n) {
        Integer num = (Integer) c6378n.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
