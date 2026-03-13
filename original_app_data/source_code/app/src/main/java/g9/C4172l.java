package g9;

import b9.C2898a;
import com.google.firebase.perf.util.o;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: g9.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4172l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2898a f35562f = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f35563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f35564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runtime f35565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f35566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35567e;

    public C4172l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static /* synthetic */ void a(C4172l c4172l, com.google.firebase.perf.util.l lVar) {
        AndroidMemoryReading androidMemoryReadingJ = c4172l.j(lVar);
        if (androidMemoryReadingJ != null) {
            c4172l.f35564b.add(androidMemoryReadingJ);
        }
    }

    public static /* synthetic */ void b(C4172l c4172l, com.google.firebase.perf.util.l lVar) {
        AndroidMemoryReading androidMemoryReadingJ = c4172l.j(lVar);
        if (androidMemoryReadingJ != null) {
            c4172l.f35564b.add(androidMemoryReadingJ);
        }
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        f(lVar);
    }

    public final int d() {
        return o.c(com.google.firebase.perf.util.k.BYTES.b(this.f35565c.totalMemory() - this.f35565c.freeMemory()));
    }

    public final synchronized void f(final com.google.firebase.perf.util.l lVar) {
        try {
            this.f35563a.schedule(new Runnable() { // from class: g9.k
                @Override // java.lang.Runnable
                public final void run() {
                    C4172l.b(this.f35560a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f35562f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    public final synchronized void g(long j10, final com.google.firebase.perf.util.l lVar) {
        this.f35567e = j10;
        try {
            this.f35566d = this.f35563a.scheduleAtFixedRate(new Runnable() { // from class: g9.j
                @Override // java.lang.Runnable
                public final void run() {
                    C4172l.a(this.f35558a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f35562f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    public void h(long j10, com.google.firebase.perf.util.l lVar) {
        if (e(j10)) {
            return;
        }
        if (this.f35566d == null) {
            g(j10, lVar);
        } else if (this.f35567e != j10) {
            i();
            g(j10, lVar);
        }
    }

    public void i() {
        ScheduledFuture scheduledFuture = this.f35566d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f35566d = null;
        this.f35567e = -1L;
    }

    public final AndroidMemoryReading j(com.google.firebase.perf.util.l lVar) {
        if (lVar == null) {
            return null;
        }
        return (AndroidMemoryReading) AndroidMemoryReading.newBuilder().j(lVar.b()).m(d()).build();
    }

    public C4172l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f35566d = null;
        this.f35567e = -1L;
        this.f35563a = scheduledExecutorService;
        this.f35564b = new ConcurrentLinkedQueue();
        this.f35565c = runtime;
    }
}
