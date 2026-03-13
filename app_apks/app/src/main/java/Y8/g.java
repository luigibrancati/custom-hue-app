package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f19837a;

    public static synchronized g e() {
        try {
            if (f19837a == null) {
                f19837a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19837a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    public Long d() {
        return 70L;
    }
}
