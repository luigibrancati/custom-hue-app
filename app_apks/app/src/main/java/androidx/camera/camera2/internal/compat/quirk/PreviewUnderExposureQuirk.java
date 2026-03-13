package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import Od.C;
import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/internal/compat/quirk/PreviewUnderExposureQuirk;", "LL/T0;", "<init>", "()V", "", "d", "()Z", "b", "Z", "isTclDevice", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewUnderExposureQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewUnderExposureQuirk f21961a = new PreviewUnderExposureQuirk();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final boolean isTclDevice = C.E(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }

    public static final boolean d() {
        return isTclDevice;
    }
}
