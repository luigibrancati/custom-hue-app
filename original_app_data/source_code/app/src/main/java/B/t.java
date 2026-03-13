package B;

import L.h1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f523a;

    public t() {
        this((ExtraCroppingQuirk) A.d.b(ExtraCroppingQuirk.class));
    }

    public List a(h1.d dVar, List list) {
        Size sizeD;
        ExtraCroppingQuirk extraCroppingQuirk = this.f523a;
        if (extraCroppingQuirk == null || (sizeD = extraCroppingQuirk.d(dVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeD);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(sizeD)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f523a = extraCroppingQuirk;
    }
}
