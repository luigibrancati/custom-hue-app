package B;

import L.a1;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import w.C6107a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f514a = new Rational(16, 9);

    public static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, a1.b bVar) {
        if (((PreviewPixelHDRnetQuirk) A.d.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f514a)) {
            return;
        }
        C6107a.C0631a c0631a = new C6107a.C0631a();
        c0631a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0631a.c());
    }
}
