package g9;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import b9.C2898a;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: g9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4163c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2898a f35539g = C2898a.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f35540h = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f35545e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35546f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f35541a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f35542b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35543c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35544d = e();

    public static /* synthetic */ void a(C4163c c4163c, com.google.firebase.perf.util.l lVar) {
        CpuMetricReading cpuMetricReadingK = c4163c.k(lVar);
        if (cpuMetricReadingK != null) {
            c4163c.f35541a.add(cpuMetricReadingK);
        }
    }

    public static /* synthetic */ void b(C4163c c4163c, com.google.firebase.perf.util.l lVar) {
        CpuMetricReading cpuMetricReadingK = c4163c.k(lVar);
        if (cpuMetricReadingK != null) {
            c4163c.f35541a.add(cpuMetricReadingK);
        }
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        g(lVar);
    }

    public final long d(long j10) {
        return Math.round((j10 / this.f35544d) * f35540h);
    }

    public final long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public final synchronized void g(final com.google.firebase.perf.util.l lVar) {
        try {
            this.f35542b.schedule(new Runnable() { // from class: g9.b
                @Override // java.lang.Runnable
                public final void run() {
                    C4163c.b(this.f35537a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f35539g.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    public final synchronized void h(long j10, final com.google.firebase.perf.util.l lVar) {
        this.f35546f = j10;
        try {
            this.f35545e = this.f35542b.scheduleAtFixedRate(new Runnable() { // from class: g9.a
                @Override // java.lang.Runnable
                public final void run() {
                    C4163c.a(this.f35535a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f35539g.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    public void i(long j10, com.google.firebase.perf.util.l lVar) {
        long j11 = this.f35544d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f35545e == null) {
            h(j10, lVar);
        } else if (this.f35546f != j10) {
            j();
            h(j10, lVar);
        }
    }

    public void j() {
        ScheduledFuture scheduledFuture = this.f35545e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f35545e = null;
        this.f35546f = -1L;
    }

    public final CpuMetricReading k(com.google.firebase.perf.util.l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f35543c));
                try {
                    long jB = lVar.b();
                    String[] strArrSplit = bufferedReader.readLine().split(StringUtils.SPACE);
                    CpuMetricReading cpuMetricReading = (CpuMetricReading) CpuMetricReading.newBuilder().j(jB).m(d(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).n(d(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                    bufferedReader.close();
                    return cpuMetricReading;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e10) {
                f35539g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e10.getMessage());
                return null;
            }
        } catch (IOException e11) {
            f35539g.j("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        }
    }
}
