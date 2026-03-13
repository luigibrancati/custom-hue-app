package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s f19849a;

    public static synchronized s e() {
        try {
            if (f19849a == null) {
                f19849a = new s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19849a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    public Long d() {
        return 30L;
    }
}
