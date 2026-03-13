package S2;

import gc.C4205s;
import gc.C4206t;
import gc.y;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15283b;

    public f(List list, int i10) {
        this.f15282a = list;
        this.f15283b = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i10 + "', bounds = '" + C4206t.l(list) + "'.").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15283b == fVar.f15283b && AbstractC4862t.a(this.f15282a, fVar.f15282a);
    }

    public int hashCode() {
        return (this.f15283b * 31) + this.f15282a.hashCode();
    }

    public String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f15283b + ", mergedHistory=" + this.f15282a + ')';
    }

    public f() {
        this(C4206t.k(), -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(g currentInfo, List backInfo, List forwardInfo) {
        AbstractC4862t.e(currentInfo, "currentInfo");
        AbstractC4862t.e(backInfo, "backInfo");
        AbstractC4862t.e(forwardInfo, "forwardInfo");
        List listC = C4205s.c();
        y.C(listC, backInfo);
        listC.add(currentInfo);
        y.C(listC, forwardInfo);
        this(C4205s.a(listC), backInfo.size());
    }
}
