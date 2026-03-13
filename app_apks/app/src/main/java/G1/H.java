package G1;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f4259d = new ThreadLocal();

    public H(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return M.a1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return M.a1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f4256a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) AbstractC0853a.e((Long) this.f4259d.get())).longValue();
                }
                this.f4257b = jLongValue - j10;
                notifyAll();
            }
            this.f4258c = j10;
            return j10 + this.f4257b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f4258c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = (4294967296L + jK) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f4258c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = jK / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 += (j12 + 1) * 8589934592L;
                if (j13 >= jK) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f4256a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f4258c;
        } catch (Throwable th) {
            throw th;
        }
        return j10 != -9223372036854775807L ? j10 + this.f4257b : d();
    }

    public synchronized long f() {
        return this.f4257b;
    }

    public synchronized boolean g() {
        return this.f4257b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f4256a = j10;
        this.f4257b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f4258c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) {
        try {
            AbstractC0853a.g(this.f4256a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z10) {
                this.f4259d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        AbstractC0853a.g(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
