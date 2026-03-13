package B;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f525a;

    public v() {
        this.f525a = ((StillCaptureFlashStopRepeatingQuirk) A.d.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public boolean a(List list, boolean z10) {
        if (this.f525a && z10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
