package B8;

import Y5.f;
import Y5.i;
import Y5.k;
import android.os.SystemClock;
import b6.AbstractC2843l;
import b7.C2878l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r8.g;
import u8.E;
import u8.S;
import u8.Z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S f771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f773k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2878l f775b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f774a, this.f775b);
            e.this.f771i.e();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f774a.d());
            e.o(dG);
        }

        public b(E e10, C2878l c2878l) {
            this.f774a = e10;
            this.f775b = c2878l;
        }
    }

    public e(i iVar, C8.d dVar, S s10) {
        this(dVar.f1175f, dVar.f1176g, ((long) dVar.f1177h) * 1000, iVar, s10);
    }

    public static /* synthetic */ void a(e eVar, C2878l c2878l, boolean z10, E e10, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            c2878l.d(exc);
            return;
        }
        if (z10) {
            eVar.j();
        }
        c2878l.e(e10);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            AbstractC2843l.a(eVar.f770h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    public static void o(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.f763a) * Math.pow(this.f764b, h()));
    }

    public final int h() {
        if (this.f773k == 0) {
            this.f773k = m();
        }
        int iM = (int) ((m() - this.f773k) / this.f765c);
        int iMin = l() ? Math.min(100, this.f772j + iM) : Math.max(0, this.f772j - iM);
        if (this.f772j != iMin) {
            this.f772j = iMin;
            this.f773k = m();
        }
        return iMin;
    }

    public C2878l i(E e10, boolean z10) {
        synchronized (this.f768f) {
            try {
                C2878l c2878l = new C2878l();
                if (!z10) {
                    n(e10, c2878l);
                    return c2878l;
                }
                this.f771i.d();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + e10.d());
                    this.f771i.c();
                    c2878l.e(e10);
                    return c2878l;
                }
                g.f().b("Enqueueing report: " + e10.d());
                g.f().b("Queue size: " + this.f768f.size());
                this.f769g.execute(new b(e10, c2878l));
                g.f().b("Closing task for report: " + e10.d());
                c2878l.e(e10);
                return c2878l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: B8.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f761a, countDownLatch);
            }
        }).start();
        Z.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f768f.size() < this.f767e;
    }

    public final boolean l() {
        return this.f768f.size() == this.f767e;
    }

    public final long m() {
        return System.currentTimeMillis();
    }

    public final void n(final E e10, final C2878l c2878l) {
        g.f().b("Sending report through Google DataTransport: " + e10.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f766d < 2000;
        this.f770h.b(Y5.d.i(e10.b()), new k() { // from class: B8.c
            @Override // Y5.k
            public final void a(Exception exc) {
                e.a(this.f757a, c2878l, z10, e10, exc);
            }
        });
    }

    public e(double d10, double d11, long j10, i iVar, S s10) {
        this.f763a = d10;
        this.f764b = d11;
        this.f765c = j10;
        this.f770h = iVar;
        this.f771i = s10;
        this.f766d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f767e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f768f = arrayBlockingQueue;
        this.f769g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f772j = 0;
        this.f773k = 0L;
    }
}
