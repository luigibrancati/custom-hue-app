package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static o f19845a;

    public static synchronized o e() {
        try {
            if (f19845a == null) {
                f19845a = new o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19845a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // Y8.v
    public String b() {
        return "sessions_max_length_minutes";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_session_max_duration_min";
    }

    public Long d() {
        return 240L;
    }
}
