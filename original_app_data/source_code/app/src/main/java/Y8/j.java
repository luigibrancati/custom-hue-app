package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j f19840a;

    public static synchronized j e() {
        try {
            if (f19840a == null) {
                f19840a = new j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19840a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    public Long d() {
        return 600L;
    }
}
