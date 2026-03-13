package B;

import L.X0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f530b;

    public y(X0 x02) {
        this.f529a = CaptureIntentPreviewQuirk.c(x02);
        this.f530b = x02.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map a(int i10) {
        if (i10 == 3 && this.f529a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i10 != 4 || !this.f530b) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
