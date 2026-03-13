package Y8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f19835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f19836b = Collections.unmodifiableMap(new a());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends HashMap {
        public a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    public static synchronized f e() {
        try {
            if (f19835a == null) {
                f19835a = new f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19835a;
    }

    public static String f(long j10) {
        return (String) f19836b.get(Long.valueOf(j10));
    }

    public static boolean g(long j10) {
        return f19836b.containsKey(Long.valueOf(j10));
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_log_source";
    }

    public String d() {
        return W8.a.f17852c;
    }
}
