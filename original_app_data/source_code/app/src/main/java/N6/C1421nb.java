package N6;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.C6051f;

/* JADX INFO: renamed from: N6.nb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1421nb {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C6051f f10386s = new C6051f("AutoZoom");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1447pb f10387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f10390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f10391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B f10392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Sa f10393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f10395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ScheduledFuture f10400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f10401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X9.e f10404r;

    public C1421nb(Context context, AbstractC1447pb abstractC1447pb, String str) {
        AbstractC1399m2.a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        B bA = r.a();
        Sa sa2 = new Sa(context, new R9.m(context), new La(context, Ka.d("scanner-auto-zoom").c()), "scanner-auto-zoom");
        this.f10389c = new Object();
        this.f10387a = abstractC1447pb;
        this.f10388b = new AtomicBoolean(false);
        this.f10390d = W.z();
        this.f10391e = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.f10392f = bA;
        this.f10393g = sa2;
        this.f10394h = str;
        this.f10403q = 1;
        this.f10396j = 1.0f;
        this.f10397k = -1.0f;
        this.f10398l = bA.a();
    }

    public static C1421nb d(Context context, String str) {
        return new C1421nb(context, AbstractC1447pb.f10422a, str);
    }

    public static /* synthetic */ void f(C1421nb c1421nb) {
        ScheduledFuture scheduledFuture;
        synchronized (c1421nb.f10389c) {
            try {
                if (c1421nb.f10403q == 2 && !c1421nb.f10388b.get() && (scheduledFuture = c1421nb.f10400n) != null && !scheduledFuture.isCancelled()) {
                    if (c1421nb.f10396j > 1.0f && c1421nb.a() >= c1421nb.f10387a.i()) {
                        f10386s.e("AutoZoom", "Reset zoom = 1");
                        c1421nb.l(1.0f, EnumC1249a8.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ void g(C1421nb c1421nb, float f10) {
        synchronized (c1421nb.f10389c) {
            c1421nb.f10396j = f10;
            c1421nb.r(false);
        }
    }

    public final long a() {
        long jConvert;
        synchronized (this.f10389c) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.f10392f.a() - this.f10398l, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    public final /* synthetic */ E1 c(float f10) {
        X9.e eVar = this.f10404r;
        float fP = p(f10);
        T9.d dVar = eVar.f19385a;
        T9.b bVar = X9.h.f19392l;
        if (true != dVar.b().a(fP)) {
            fP = 0.0f;
        }
        return AbstractC1501u1.a(Float.valueOf(fP));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x026c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0247 A[Catch: all -> 0x0199, Merged into TryCatch #1 {all -> 0x000e, all -> 0x0199, blocks: (B:4:0x0007, B:6:0x000c, B:10:0x0011, B:12:0x0017, B:14:0x0020, B:17:0x002c, B:19:0x0030, B:20:0x003a, B:22:0x0090, B:23:0x0096, B:25:0x009c, B:28:0x00aa, B:29:0x00cb, B:30:0x00da, B:32:0x00e0, B:34:0x00f4, B:36:0x0100, B:39:0x0108, B:40:0x0152, B:42:0x015c, B:43:0x0167, B:45:0x0173, B:47:0x017b, B:74:0x0265, B:49:0x0185, B:50:0x0187, B:77:0x0268, B:78:0x0269, B:51:0x0188, B:53:0x0196, B:57:0x019c, B:58:0x01c8, B:60:0x01ce, B:63:0x01f7, B:65:0x0206, B:67:0x0215, B:69:0x0220, B:70:0x0245, B:72:0x0247, B:73:0x0264), top: B:83:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r18, N6.AbstractC1460qb r19) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.C1421nb.i(int, N6.qb):void");
    }

    public final void j() {
        synchronized (this.f10389c) {
            try {
                if (this.f10403q == 4) {
                    return;
                }
                n(false);
                this.f10391e.shutdown();
                this.f10403q = 4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(float f10) {
        synchronized (this.f10389c) {
            AbstractC1564z.d(f10 >= 1.0f);
            this.f10397k = f10;
        }
    }

    public final void l(float f10, EnumC1249a8 enumC1249a8, AbstractC1460qb abstractC1460qb) {
        synchronized (this.f10389c) {
            try {
                if (this.f10395i != null && this.f10404r != null && this.f10403q == 2) {
                    if (this.f10388b.compareAndSet(false, true)) {
                        AbstractC1501u1.b(AbstractC1501u1.c(new C1382kb(this, f10), this.f10395i), new C1408mb(this, enumC1249a8, this.f10396j, abstractC1460qb, f10), F1.a());
                    }
                }
            } finally {
            }
        }
    }

    public final void m() {
        synchronized (this.f10389c) {
            try {
                int i10 = this.f10403q;
                if (i10 != 2 && i10 != 4) {
                    r(true);
                    this.f10400n = this.f10391e.scheduleWithFixedDelay(new Runnable() { // from class: N6.lb
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1421nb.f(this.f10357a);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.f10403q == 1) {
                        this.f10401o = UUID.randomUUID().toString();
                        this.f10399m = this.f10392f.a();
                        this.f10402p = false;
                        EnumC1249a8 enumC1249a8 = EnumC1249a8.SCANNER_AUTO_ZOOM_START;
                        float f10 = this.f10396j;
                        q(enumC1249a8, f10, f10, null);
                    } else {
                        EnumC1249a8 enumC1249a82 = EnumC1249a8.SCANNER_AUTO_ZOOM_RESUME;
                        float f11 = this.f10396j;
                        q(enumC1249a82, f11, f11, null);
                    }
                    this.f10403q = 2;
                }
            } finally {
            }
        }
    }

    public final void n(boolean z10) {
        synchronized (this.f10389c) {
            try {
                int i10 = this.f10403q;
                if (i10 != 1 && i10 != 4) {
                    r(true);
                    if (z10) {
                        if (!this.f10402p) {
                            EnumC1249a8 enumC1249a8 = EnumC1249a8.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f10 = this.f10396j;
                            q(enumC1249a8, f10, f10, null);
                        }
                        EnumC1249a8 enumC1249a82 = EnumC1249a8.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f11 = this.f10396j;
                        q(enumC1249a82, f11, f11, null);
                    } else {
                        EnumC1249a8 enumC1249a83 = EnumC1249a8.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f12 = this.f10396j;
                        q(enumC1249a83, f12, f12, null);
                    }
                    this.f10402p = false;
                    this.f10403q = 1;
                    this.f10401o = null;
                }
            } finally {
            }
        }
    }

    public final void o(X9.e eVar, Executor executor) {
        this.f10404r = eVar;
        this.f10395i = executor;
    }

    public final float p(float f10) {
        float f11 = this.f10397k;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        return (f11 <= 0.0f || f10 <= f11) ? f10 : f11;
    }

    public final void q(EnumC1249a8 enumC1249a8, float f10, float f11, AbstractC1460qb abstractC1460qb) {
        long jConvert;
        if (this.f10401o != null) {
            P9 p92 = new P9();
            p92.a(this.f10394h);
            String str = this.f10401o;
            str.getClass();
            p92.e(str);
            p92.f(Float.valueOf(f10));
            p92.c(Float.valueOf(f11));
            synchronized (this.f10389c) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.f10392f.a() - this.f10399m, TimeUnit.NANOSECONDS);
            }
            p92.b(Long.valueOf(jConvert));
            if (abstractC1460qb != null) {
                Q9 q92 = new Q9();
                q92.c(Float.valueOf(abstractC1460qb.c()));
                q92.e(Float.valueOf(abstractC1460qb.e()));
                q92.b(Float.valueOf(abstractC1460qb.b()));
                q92.d(Float.valueOf(abstractC1460qb.d()));
                q92.a(Float.valueOf(0.0f));
                p92.d(q92.f());
            }
            Sa sa2 = this.f10393g;
            C1262b8 c1262b8 = new C1262b8();
            c1262b8.i(p92.h());
            sa2.d(Va.e(c1262b8), enumC1249a8);
        }
    }

    public final void r(boolean z10) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f10389c) {
            try {
                this.f10390d.r();
                this.f10398l = this.f10392f.a();
                if (z10 && (scheduledFuture = this.f10400n) != null) {
                    scheduledFuture.cancel(false);
                    this.f10400n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
