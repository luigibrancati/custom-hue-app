package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r f19848a;

    public static synchronized r f() {
        try {
            if (f19848a == null) {
                f19848a = new r();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19848a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // Y8.v
    public String b() {
        return "sessions_sampling_percentage";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(0.01d);
    }

    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
