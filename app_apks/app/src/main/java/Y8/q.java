package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static q f19847a;

    public static synchronized q f() {
        try {
            if (f19847a == null) {
                f19847a = new q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19847a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // Y8.v
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }

    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
