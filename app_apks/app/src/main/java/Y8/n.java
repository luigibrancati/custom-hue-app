package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static n f19844a;

    public static synchronized n f() {
        try {
            if (f19844a == null) {
                f19844a = new n();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19844a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // Y8.v
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }

    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
