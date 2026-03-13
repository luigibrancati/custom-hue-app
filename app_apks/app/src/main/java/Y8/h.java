package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static h f19838a;

    public static synchronized h e() {
        try {
            if (f19838a == null) {
                f19838a = new h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19838a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    public Long d() {
        return 700L;
    }
}
