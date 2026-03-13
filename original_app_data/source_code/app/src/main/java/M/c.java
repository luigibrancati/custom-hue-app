package M;

import E.AbstractC0807p0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (AbstractC0807p0.h("CameraOrientationUtil")) {
            AbstractC0807p0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
    }
}
