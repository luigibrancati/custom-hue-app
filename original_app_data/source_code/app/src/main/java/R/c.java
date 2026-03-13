package R;

import L.U0;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static List a(U0 u02) {
        ArrayList arrayList = new ArrayList();
        if (u02.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.i())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (u02.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.d())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (u02.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.e())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (u02.a(LowMemoryQuirk.class, LowMemoryQuirk.d())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (u02.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.g())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (u02.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.h())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (u02.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.g())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (u02.a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.e())) {
            arrayList.add(PreviewGreenTintQuirk.f22022a);
        }
        return arrayList;
    }
}
