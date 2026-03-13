package B;

import L.X0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import x.U1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureSessionOnClosedNotCalledQuirk f503a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(U1 u12);
    }

    public h(X0 x02) {
        this.f503a = (CaptureSessionOnClosedNotCalledQuirk) x02.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public final void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            U1 u12 = (U1) it.next();
            u12.m().r(u12);
        }
    }

    public final void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            U1 u12 = (U1) it.next();
            u12.m().s(u12);
        }
    }

    public void c(U1 u12, List list, List list2, a aVar) {
        U1 u13;
        U1 u14;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (u14 = (U1) it.next()) != u12) {
                linkedHashSet.add(u14);
            }
            b(linkedHashSet);
        }
        aVar.a(u12);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (u13 = (U1) it2.next()) != u12) {
                linkedHashSet2.add(u13);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f503a != null;
    }
}
