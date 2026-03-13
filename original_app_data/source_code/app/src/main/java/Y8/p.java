package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p f19846a;

    public static synchronized p e() {
        try {
            if (f19846a == null) {
                f19846a = new p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19846a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // Y8.v
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}
