package x;

import L.AbstractC1114o;
import L.AbstractC1116p;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z0 {
    public static CameraCaptureSession.CaptureCallback a(AbstractC1114o abstractC1114o) {
        if (abstractC1114o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC1114o, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : Z.a(arrayList);
    }

    public static void b(AbstractC1114o abstractC1114o, List list) {
        if (abstractC1114o instanceof AbstractC1116p.a) {
            Iterator it = ((AbstractC1116p.a) abstractC1114o).e().iterator();
            while (it.hasNext()) {
                b((AbstractC1114o) it.next(), list);
            }
        } else if (abstractC1114o instanceof Y0) {
            list.add(((Y0) abstractC1114o).f());
        } else {
            list.add(new X0(abstractC1114o));
        }
    }
}
