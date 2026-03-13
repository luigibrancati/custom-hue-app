package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u f19851a;

    public static synchronized u f() {
        try {
            if (f19851a == null) {
                f19851a = new u();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19851a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(1.0d);
    }

    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
