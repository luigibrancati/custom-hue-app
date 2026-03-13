package h9;

import android.content.Context;
import b9.C2898a;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.o;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y8.a f36329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f36330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f36331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f36332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f36333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36334f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final C2898a f36335k = C2898a.e();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final long f36336l = TimeUnit.SECONDS.toMicros(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.firebase.perf.util.a f36337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f36338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l f36339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.google.firebase.perf.util.i f36340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f36341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f36342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.firebase.perf.util.i f36343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public com.google.firebase.perf.util.i f36344h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f36345i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f36346j;

        public a(com.google.firebase.perf.util.i iVar, long j10, com.google.firebase.perf.util.a aVar, Y8.a aVar2, String str, boolean z10) {
            this.f36337a = aVar;
            this.f36341e = j10;
            this.f36340d = iVar;
            this.f36342f = j10;
            this.f36339c = aVar.a();
            g(aVar2, str, z10);
            this.f36338b = z10;
        }

        public static long c(Y8.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        public static long d(Y8.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        public static long e(Y8.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        public static long f(Y8.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        public synchronized void a(boolean z10) {
            try {
                this.f36340d = z10 ? this.f36343g : this.f36344h;
                this.f36341e = z10 ? this.f36345i : this.f36346j;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean b(PerfMetric perfMetric) {
            try {
                l lVarA = this.f36337a.a();
                double d10 = (this.f36339c.d(lVarA) * this.f36340d.a()) / f36336l;
                if (d10 > 0.0d) {
                    this.f36342f = Math.min(this.f36342f + d10, this.f36341e);
                    this.f36339c = lVarA;
                }
                double d11 = this.f36342f;
                if (d11 >= 1.0d) {
                    this.f36342f = d11 - 1.0d;
                    return true;
                }
                if (this.f36338b) {
                    f36335k.j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void g(Y8.a aVar, String str, boolean z10) {
            long jF = f(aVar, str);
            long jE = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.google.firebase.perf.util.i iVar = new com.google.firebase.perf.util.i(jE, jF, timeUnit);
            this.f36343g = iVar;
            this.f36345i = jE;
            if (z10) {
                f36335k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(jE));
            }
            long jD = d(aVar, str);
            long jC = c(aVar, str);
            com.google.firebase.perf.util.i iVar2 = new com.google.firebase.perf.util.i(jC, jD, timeUnit);
            this.f36344h = iVar2;
            this.f36346j = jC;
            if (z10) {
                f36335k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(jC));
            }
        }
    }

    public d(Context context, com.google.firebase.perf.util.i iVar, long j10) {
        this(iVar, j10, new com.google.firebase.perf.util.a(), b(), b(), Y8.a.g());
        this.f36334f = o.b(context);
    }

    public static double b() {
        return new Random().nextDouble();
    }

    public void a(boolean z10) {
        this.f36332d.a(z10);
        this.f36333e.a(z10);
    }

    public final boolean c(List list) {
        return list.size() > 0 && ((PerfSession) list.get(0)).getSessionVerbosityCount() > 0 && ((PerfSession) list.get(0)).getSessionVerbosity(0) == i9.f.GAUGES_AND_SYSTEM_EVENTS;
    }

    public final boolean d() {
        return this.f36331c < this.f36329a.f();
    }

    public final boolean e() {
        return this.f36330b < this.f36329a.s();
    }

    public final boolean f() {
        return this.f36330b < this.f36329a.G();
    }

    public boolean g(PerfMetric perfMetric) {
        boolean zB;
        if (!j(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            zB = this.f36333e.b(perfMetric);
        } else {
            if (!perfMetric.hasTraceMetric()) {
                return true;
            }
            zB = this.f36332d.b(perfMetric);
        }
        return !zB;
    }

    public boolean h(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !f() && !c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (!i(perfMetric) || d() || c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return !perfMetric.hasNetworkRequestMetric() || e() || c(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
        }
        return false;
    }

    public boolean i(PerfMetric perfMetric) {
        return perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith("_st_") && perfMetric.getTraceMetric().containsCustomAttributes("Hosting_activity");
    }

    public boolean j(PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    public d(com.google.firebase.perf.util.i iVar, long j10, com.google.firebase.perf.util.a aVar, double d10, double d11, Y8.a aVar2) {
        this.f36332d = null;
        this.f36333e = null;
        boolean z10 = false;
        this.f36334f = false;
        o.a(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f36330b = d10;
        this.f36331c = d11;
        this.f36329a = aVar2;
        this.f36332d = new a(iVar, j10, aVar, aVar2, "Trace", this.f36334f);
        this.f36333e = new a(iVar, j10, aVar, aVar2, "Network", this.f36334f);
    }
}
