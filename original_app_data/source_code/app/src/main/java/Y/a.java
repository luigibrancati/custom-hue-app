package Y;

import E.J;
import L.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static J a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        J j10 = (J) list.get(0);
        Integer numValueOf = Integer.valueOf(j10.b());
        Integer numValueOf2 = Integer.valueOf(j10.a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            J j11 = (J) list.get(i10);
            numValueOf = c(numValueOf, Integer.valueOf(j11.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(j11.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new J(numValueOf.intValue(), numValueOf2.intValue());
    }

    public static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    public static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static J d(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((s1) it.next()).C());
        }
        return a(arrayList);
    }
}
