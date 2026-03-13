package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f19834a;

    public static synchronized e e() {
        try {
            if (f19834a == null) {
                f19834a = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19834a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // Y8.v
    public String b() {
        return "fragment_sampling_percentage";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(0.0d);
    }
}
