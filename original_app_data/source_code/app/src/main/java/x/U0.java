package x;

import E.C0803n0;
import E.C0817v;
import E.C0821x;
import E.InterfaceC0815u;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.WebrtcBuildVersion;
import y.C6369e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class U0 {
    public static String a(y.t tVar, Integer num, List list) {
        if (num != null && list.contains(WebrtcBuildVersion.maint_version) && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) tVar.c(WebrtcBuildVersion.maint_version).a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) tVar.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return WebrtcBuildVersion.maint_version;
            }
        }
        return null;
    }

    public static List b(C6272x c6272x, C0817v c0817v, List list) throws C0803n0 {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            if (c0817v == null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strA = a(c6272x.a(), c0817v.d(), list);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!str.equals(strA)) {
                        arrayList2.add(c6272x.h(str));
                    }
                }
                Iterator it3 = c0817v.b(arrayList2).iterator();
                while (it3.hasNext()) {
                    arrayList.add(((L.I) ((InterfaceC0815u) it3.next())).d());
                }
            }
            return arrayList;
        } catch (C0821x e10) {
            throw new C0803n0(e10);
        } catch (C6369e e11) {
            throw new C0803n0(W0.a(e11));
        }
    }
}
