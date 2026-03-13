package B;

import L.AbstractC1109l0;
import L.C1095e0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import w.C6107a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f531a;

    public z() {
        this.f531a = A.d.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public C1095e0 a(C1095e0 c1095e0) {
        C1095e0.a aVar = new C1095e0.a();
        aVar.t(c1095e0.k());
        Iterator it = c1095e0.i().iterator();
        while (it.hasNext()) {
            aVar.f((AbstractC1109l0) it.next());
        }
        aVar.e(c1095e0.g());
        C6107a.C0631a c0631a = new C6107a.C0631a();
        c0631a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0631a.c());
        return aVar.h();
    }

    public boolean b(List list, boolean z10) {
        if (!this.f531a || !z10) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
