package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f19843a;

    public static synchronized m e() {
        try {
            if (f19843a == null) {
                f19843a = new m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19843a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // Y8.v
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}
