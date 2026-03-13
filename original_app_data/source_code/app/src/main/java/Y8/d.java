package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f19833a;

    public static synchronized d e() {
        try {
            if (f19833a == null) {
                f19833a = new d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19833a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // Y8.v
    public String b() {
        return "experiment_app_start_ttid";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}
