package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static t f19850a;

    public static synchronized t e() {
        try {
            if (f19850a == null) {
                f19850a = new t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19850a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    public Long d() {
        return 300L;
    }
}
