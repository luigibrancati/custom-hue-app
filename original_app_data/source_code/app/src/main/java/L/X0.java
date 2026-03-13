package L;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7964a;

    public X0(List list) {
        this.f7964a = new ArrayList(list);
    }

    public static String d(X0 x02) {
        ArrayList arrayList = new ArrayList();
        Iterator it = x02.f7964a.iterator();
        while (it.hasNext()) {
            arrayList.add(((T0) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean a(Class cls) {
        Iterator it = this.f7964a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((T0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public T0 b(Class cls) {
        for (T0 t02 : this.f7964a) {
            if (t02.getClass() == cls) {
                return t02;
            }
        }
        return null;
    }

    public List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (T0 t02 : this.f7964a) {
            if (cls.isAssignableFrom(t02.getClass())) {
                arrayList.add(t02);
            }
        }
        return arrayList;
    }
}
