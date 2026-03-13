package S;

import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageCaptureFailedForSpecificCombinationQuirk f15223a = (ImageCaptureFailedForSpecificCombinationQuirk) R.b.b(ImageCaptureFailedForSpecificCombinationQuirk.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PreviewGreenTintQuirk f15224b = (PreviewGreenTintQuirk) R.b.b(PreviewGreenTintQuirk.class);

    public boolean a(String str, Collection collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.f15223a;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.h(str, collection);
        }
        if (this.f15224b != null) {
            return PreviewGreenTintQuirk.f(str, collection);
        }
        return false;
    }
}
