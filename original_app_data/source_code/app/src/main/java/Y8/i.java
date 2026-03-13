package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static i f19839a;

    public static synchronized i f() {
        try {
            if (f19839a == null) {
                f19839a = new i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19839a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(1.0d);
    }

    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
