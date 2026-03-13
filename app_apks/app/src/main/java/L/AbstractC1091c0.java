package L;

import E.AbstractC0807p0;
import E.C0817v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: renamed from: L.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1091c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0817v f8014a = new C0817v.a().b(2).a();

    /* JADX INFO: renamed from: L.c0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    /* JADX INFO: renamed from: L.c0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8015a;

        public b(String str, int i10, Throwable th) {
            super(str, th);
            this.f8015a = i10;
        }

        public int a() {
            return this.f8015a;
        }
    }

    public static void a(Context context, W w10, C0817v c0817v) throws b {
        Integer numD;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            AbstractC0807p0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + w10.m().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e10 = null;
        if (c0817v != null) {
            try {
                numD = c0817v.d();
                if (numD == null) {
                    AbstractC0807p0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                AbstractC0807p0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            numD = null;
        }
        AbstractC0807p0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        int i10 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0817v == null || numD.intValue() == 1)) {
                C0817v.f3028d.g(w10.m());
                i10 = 1;
            }
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            AbstractC0807p0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", e10);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0817v == null || numD.intValue() == 0)) {
                C0817v.f3027c.g(w10.m());
                i10++;
            }
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            AbstractC0807p0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e10);
        }
        try {
            f8014a.g(w10.m());
            AbstractC0807p0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (e10 == null) {
            return;
        }
        AbstractC0807p0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + w10.m());
        throw new b("Expected camera missing from device.", i10, e10);
    }
}
