package B;

import L.X0;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* JADX INFO: renamed from: B.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0691a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f499b;

    public C0691a(X0 x02) {
        this.f498a = x02.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f499b = A.d.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i10) {
        if ((this.f498a || this.f499b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
