package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements T0 {
    public static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return f();
    }

    public Size[] d(int i10) {
        return (i10 == 34 && f()) ? e() : new Size[0];
    }

    public final Size[] e() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }
}
