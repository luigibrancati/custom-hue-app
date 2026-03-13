package S;

import L.C1095e0;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) R.b.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.h(C1095e0.f8038i);
    }

    public boolean b(androidx.camera.core.d dVar) {
        return a() && T.b.e(dVar.getFormat());
    }
}
