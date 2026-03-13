package O6;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: O6.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C1704k5 implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f11704h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f11707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11711g;

    public C1704k5(String str) {
        this.f11710f = 2147483647L;
        this.f11711g = -2147483648L;
        this.f11705a = str;
    }

    public static C1704k5 f(String str) {
        K5.a();
        if (!K5.b()) {
            return C1690i5.f11673i;
        }
        Map map = f11704h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C1704k5("detectorTaskWithResource#run"));
        }
        return (C1704k5) map.get("detectorTaskWithResource#run");
    }

    public final void a() {
        this.f11706b = 0;
        this.f11707c = 0.0d;
        this.f11708d = 0L;
        this.f11710f = 2147483647L;
        this.f11711g = -2147483648L;
    }

    public C1704k5 b() {
        this.f11708d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void c(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f11709e;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= 1000000) {
            a();
        }
        this.f11709e = jElapsedRealtimeNanos;
        this.f11706b++;
        this.f11707c += j10;
        this.f11710f = Math.min(this.f11710f, j10);
        this.f11711g = Math.max(this.f11711g, j10);
        if (this.f11706b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f11705a, Long.valueOf(j10), Integer.valueOf(this.f11706b), Long.valueOf(this.f11710f), Long.valueOf(this.f11711g), Integer.valueOf((int) (this.f11707c / ((double) this.f11706b))));
            K5.a();
        }
        if (this.f11706b % 500 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f11708d;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        d(j10);
    }

    public void d(long j10) {
        c((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
