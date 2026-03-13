package B;

import L.X0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a(X0 x02) {
        return x02.a(LegacyCameraOutputConfigNullPointerQuirk.class) || x02.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
    }
}
