package q8;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static void a(Throwable th) {
        if (th == null) {
            r8.g.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            h.e().f43310a.w(th);
        }
    }

    public static void b(String str) {
        h.e().f43310a.D("com.crashlytics.flutter.build-id.0", str);
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            i10++;
            h.e().f43310a.D("com.crashlytics.flutter.build-id." + i10, str);
        }
    }
}
