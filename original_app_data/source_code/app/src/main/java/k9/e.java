package k9;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39267a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f39268a = new HashMap();

        public e b() {
            return new e(this);
        }

        public a c(String str, double d10) {
            this.f39268a.put(str, Double.toString(d10));
            return this;
        }

        public a d(String str, long j10) {
            this.f39268a.put(str, Long.toString(j10));
            return this;
        }

        public a e(String str, String str2) {
            this.f39268a.put(str, str2);
            return this;
        }
    }

    public e(a aVar) {
        this.f39267a = aVar.f39268a;
    }
}
