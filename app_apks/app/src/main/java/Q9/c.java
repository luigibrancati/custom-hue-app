package Q9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14231a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f14232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O8.b f14233b;

        public a(Class cls, O8.b bVar) {
            this.f14232a = cls;
            this.f14233b = bVar;
        }

        public final O8.b a() {
            return this.f14233b;
        }

        public final Class b() {
            return this.f14232a;
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f14231a.put(aVar.b(), aVar.a());
        }
    }
}
