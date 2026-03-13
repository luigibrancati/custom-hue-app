package L1;

import G1.AbstractC0853a;
import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f8239d = new B0("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8241b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8242c = new Object();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f8243a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            AbstractC0853a.g(this.f8243a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f8243a = logSessionId;
        }
    }

    public B0(String str) {
        this.f8240a = str;
    }

    public synchronized LogSessionId a() {
        return ((a) AbstractC0853a.e(this.f8241b)).f8243a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) AbstractC0853a.e(this.f8241b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return Objects.equals(this.f8240a, b02.f8240a) && Objects.equals(this.f8241b, b02.f8241b) && Objects.equals(this.f8242c, b02.f8242c);
    }

    public int hashCode() {
        return Objects.hash(this.f8240a, this.f8241b, this.f8242c);
    }
}
