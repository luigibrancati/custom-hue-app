package ef;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ef.a;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean[] f34021m = {true, true, false, false, false, false, true, true, false, false, false, true, true, true, false, true, false, false, false, true};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean[] f34022n = {false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, true, false, false, false, true};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f34024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f34025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f34026d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Runnable f34033k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f34023a = {0, 1, 3, 5, 8, 9, 4, 7, 10, 6, 2, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f34027e = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34028f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f34029g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f34030h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34031i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34032j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a.e f34034l = a.e.RECORDER_IS_STOPPED;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f34035a;

        public a(long j10) {
            this.f34035a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f34035a;
            k kVar = k.this;
            long j10 = jElapsedRealtime - kVar.f34028f;
            try {
                n nVar = kVar.f34024b;
                double d10 = 0.0d;
                if (nVar != null) {
                    double dLog10 = Math.log10((nVar.a() / 51805.5336d) / 2.0E-4d) * 20.0d;
                    if (!Double.isInfinite(dLog10)) {
                        d10 = dLog10;
                    }
                }
                k.this.f34026d.d(d10, j10);
                k kVar2 = k.this;
                Handler handler = kVar2.f34025c;
                if (handler != null) {
                    handler.postDelayed(kVar2.f34033k, k.this.f34032j);
                }
            } catch (Exception e10) {
                k.this.i(" Exception: " + e10.toString());
            }
        }
    }

    public k(l lVar) {
        this.f34026d = lVar;
    }

    public void c() {
        Handler handler = this.f34025c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f34025c = null;
    }

    public void d() {
        t();
        this.f34034l = a.e.RECORDER_IS_STOPPED;
    }

    public boolean e(String str) {
        File file = new File(ef.a.b(str));
        return file.exists() && file.delete();
    }

    public a.e f() {
        return this.f34034l;
    }

    public boolean g(a.b bVar) {
        return f34021m[bVar.ordinal()];
    }

    public final /* synthetic */ void h(long j10) {
        this.f34030h.post(new a(j10));
    }

    public void i(String str) {
        this.f34026d.a(a.c.DBG, str);
    }

    public void j(String str) {
        this.f34026d.a(a.c.ERROR, str);
    }

    public boolean k() {
        this.f34026d.k(true);
        return true;
    }

    public void l() {
        c();
        this.f34024b.e();
        this.f34029g = SystemClock.elapsedRealtime();
        this.f34034l = a.e.RECORDER_IS_PAUSED;
        this.f34026d.m(true);
    }

    public void m(byte[] bArr) {
        this.f34026d.i(bArr);
    }

    public void n(ArrayList arrayList) {
        this.f34026d.g(arrayList);
    }

    public void o(ArrayList arrayList) {
        this.f34026d.n(arrayList);
    }

    public void p() {
        r(this.f34032j);
        this.f34024b.d();
        if (this.f34029g >= 0) {
            this.f34028f += SystemClock.elapsedRealtime() - this.f34029g;
        }
        this.f34029g = -1L;
        this.f34034l = a.e.RECORDER_IS_RECORDING;
        this.f34026d.l(true);
    }

    public void q(int i10) {
        long j10 = i10;
        this.f34032j = j10;
        if (this.f34024b != null) {
            r(j10);
        }
    }

    public void r(long j10) {
        c();
        this.f34032j = j10;
        if (this.f34024b == null || j10 == 0) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f34025c = new Handler();
        Runnable runnable = new Runnable() { // from class: ef.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f34019a.h(jElapsedRealtime);
            }
        };
        this.f34033k = runnable;
        this.f34025c.post(runnable);
    }

    public boolean s(a.b bVar, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, String str, a.EnumC0435a enumC0435a, boolean z10) {
        int i10 = this.f34023a[enumC0435a.ordinal()];
        this.f34028f = 0L;
        this.f34029g = -1L;
        t();
        String strA = ef.a.a(str);
        this.f34031i = strA;
        if (f34022n[bVar.ordinal()]) {
            this.f34024b = new m();
        } else {
            this.f34024b = new o(this.f34026d);
        }
        try {
            this.f34024b.c(num2, bool, num, num3, num4, bVar, strA, i10, this);
            long j10 = this.f34032j;
            if (j10 > 0) {
                r(j10);
            }
            this.f34034l = a.e.RECORDER_IS_RECORDING;
            this.f34026d.j(true);
            return true;
        } catch (Exception e10) {
            j("Error starting recorder" + e10.getMessage());
            return false;
        }
    }

    public void t() {
        try {
            c();
            n nVar = this.f34024b;
            if (nVar != null) {
                nVar.b();
            }
        } catch (Exception unused) {
        }
        this.f34024b = null;
        this.f34034l = a.e.RECORDER_IS_STOPPED;
    }

    public void u() {
        t();
        this.f34026d.o(true, this.f34031i);
    }

    public String v(String str) {
        return ef.a.b(str);
    }
}
