package h9;

import X8.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import b9.C2898a;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import h8.C4288f;
import i9.EnumC4369b;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class k implements a.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2898a f36360r = C2898a.e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f36361s = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f36362a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4288f f36365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public W8.e f36366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P8.h f36367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O8.b f36368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C4292b f36369h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f36371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Y8.a f36372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f36373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public X8.a f36374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ApplicationInfo.b f36375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f36376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f36377p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f36363b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f36364c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36378q = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExecutorService f36370i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f36362a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static /* synthetic */ void b(k kVar, c cVar) {
        kVar.getClass();
        kVar.A(cVar.f36327a, cVar.f36328b);
    }

    public static /* synthetic */ void c(k kVar, TraceMetric traceMetric, EnumC4369b enumC4369b) {
        kVar.getClass();
        kVar.A(PerfMetric.newBuilder().o(traceMetric), enumC4369b);
    }

    public static /* synthetic */ void d(k kVar, NetworkRequestMetric networkRequestMetric, EnumC4369b enumC4369b) {
        kVar.getClass();
        kVar.A(PerfMetric.newBuilder().n(networkRequestMetric), enumC4369b);
    }

    public static /* synthetic */ void f(k kVar, GaugeMetric gaugeMetric, EnumC4369b enumC4369b) {
        kVar.getClass();
        kVar.A(PerfMetric.newBuilder().m(gaugeMetric), enumC4369b);
    }

    public static k k() {
        return f36361s;
    }

    public static String l(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    public static String m(NetworkRequestMetric networkRequestMetric) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN", new DecimalFormat("#.####").format((networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L) / 1000.0d));
    }

    public static String n(TraceMetric traceMetric) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", traceMetric.getName(), new DecimalFormat("#.####").format(traceMetric.getDurationUs() / 1000.0d));
    }

    public static String o(i9.d dVar) {
        return dVar.hasTraceMetric() ? n(dVar.getTraceMetric()) : dVar.hasNetworkRequestMetric() ? m(dVar.getNetworkRequestMetric()) : dVar.hasGaugeMetric() ? l(dVar.getGaugeMetric()) : "log";
    }

    public static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final void A(PerfMetric.b bVar, EnumC4369b enumC4369b) {
        if (!u()) {
            if (s(bVar)) {
                f36360r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", o(bVar));
                this.f36363b.add(new c(bVar, enumC4369b));
                return;
            }
            return;
        }
        PerfMetric perfMetricY = y(bVar, enumC4369b);
        if (t(perfMetricY)) {
            g(perfMetricY);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    public final void B() {
        String str;
        if (this.f36372k.K()) {
            if (!this.f36375n.j() || this.f36378q) {
                try {
                    str = (String) Tasks.a(this.f36367f.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    f36360r.d("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                    str = null;
                } catch (ExecutionException e11) {
                    f36360r.d("Unable to retrieve Installation Id: %s", e11.getMessage());
                    str = null;
                } catch (TimeoutException e12) {
                    f36360r.d("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    f36360r.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.f36375n.o(str);
                }
            }
        }
    }

    public final void C() {
        if (this.f36366e == null && u()) {
            this.f36366e = W8.e.c();
        }
    }

    public final void g(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            f36360r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", o(perfMetric), i(perfMetric.getTraceMetric()));
        } else {
            f36360r.g("Logging %s", o(perfMetric));
        }
        this.f36369h.b(perfMetric);
    }

    public final void h() {
        this.f36374m.k(new WeakReference(f36361s));
        ApplicationInfo.b bVarNewBuilder = ApplicationInfo.newBuilder();
        this.f36375n = bVarNewBuilder;
        bVarNewBuilder.q(this.f36365d.r().c()).n(AndroidApplicationInfo.newBuilder().j(this.f36376o).m(W8.a.f17851b).n(p(this.f36371j)));
        this.f36364c.set(true);
        while (!this.f36363b.isEmpty()) {
            final c cVar = (c) this.f36363b.poll();
            if (cVar != null) {
                this.f36370i.execute(new Runnable() { // from class: h9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b(this.f36358a, cVar);
                    }
                });
            }
        }
    }

    public final String i(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        return name.startsWith("_st_") ? b9.b.c(this.f36377p, this.f36376o, name) : b9.b.a(this.f36377p, this.f36376o, name);
    }

    public final Map j() {
        C();
        W8.e eVar = this.f36366e;
        return eVar != null ? eVar.b() : Collections.EMPTY_MAP;
    }

    @Override // X8.a.b
    public void onUpdateAppState(EnumC4369b enumC4369b) {
        this.f36378q = enumC4369b == EnumC4369b.FOREGROUND;
        if (u()) {
            this.f36370i.execute(new Runnable() { // from class: h9.e
                @Override // java.lang.Runnable
                public final void run() {
                    k kVar = this.f36347a;
                    kVar.f36373l.a(kVar.f36378q);
                }
            });
        }
    }

    public final void q(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f36374m.d(com.google.firebase.perf.util.b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f36374m.d(com.google.firebase.perf.util.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    public void r(C4288f c4288f, P8.h hVar, O8.b bVar) {
        this.f36365d = c4288f;
        this.f36377p = c4288f.r().g();
        this.f36367f = hVar;
        this.f36368g = bVar;
        this.f36370i.execute(new Runnable() { // from class: h9.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f36357a.z();
            }
        });
    }

    public final boolean s(i9.d dVar) {
        Integer num = (Integer) this.f36362a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = (Integer) this.f36362a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = (Integer) this.f36362a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (dVar.hasTraceMetric() && iIntValue > 0) {
            this.f36362a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (dVar.hasNetworkRequestMetric() && iIntValue2 > 0) {
            this.f36362a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!dVar.hasGaugeMetric() || iIntValue3 <= 0) {
            f36360r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", o(dVar), num, num2, num3);
            return false;
        }
        this.f36362a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    public final boolean t(PerfMetric perfMetric) {
        if (!this.f36372k.K()) {
            f36360r.g("Performance collection is not enabled, dropping %s", o(perfMetric));
            return false;
        }
        if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            f36360r.k("App Instance ID is null or empty, dropping %s", o(perfMetric));
            return false;
        }
        if (!d9.e.b(perfMetric, this.f36371j)) {
            f36360r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", o(perfMetric));
            return false;
        }
        if (!this.f36373l.h(perfMetric)) {
            q(perfMetric);
            f36360r.g("Event dropped due to device sampling - %s", o(perfMetric));
            return false;
        }
        if (!this.f36373l.g(perfMetric)) {
            return true;
        }
        q(perfMetric);
        f36360r.g("Rate limited (per device) - %s", o(perfMetric));
        return false;
    }

    public boolean u() {
        return this.f36364c.get();
    }

    public void v(final GaugeMetric gaugeMetric, final EnumC4369b enumC4369b) {
        this.f36370i.execute(new Runnable() { // from class: h9.f
            @Override // java.lang.Runnable
            public final void run() {
                k.f(this.f36348a, gaugeMetric, enumC4369b);
            }
        });
    }

    public void w(final NetworkRequestMetric networkRequestMetric, final EnumC4369b enumC4369b) {
        this.f36370i.execute(new Runnable() { // from class: h9.h
            @Override // java.lang.Runnable
            public final void run() {
                k.d(this.f36354a, networkRequestMetric, enumC4369b);
            }
        });
    }

    public void x(final TraceMetric traceMetric, final EnumC4369b enumC4369b) {
        this.f36370i.execute(new Runnable() { // from class: h9.g
            @Override // java.lang.Runnable
            public final void run() {
                k.c(this.f36351a, traceMetric, enumC4369b);
            }
        });
    }

    public final PerfMetric y(PerfMetric.b bVar, EnumC4369b enumC4369b) {
        B();
        ApplicationInfo.b bVarP = this.f36375n.p(enumC4369b);
        if (bVar.hasTraceMetric() || bVar.hasNetworkRequestMetric()) {
            bVarP = ((ApplicationInfo.b) bVarP.mo237clone()).m(j());
        }
        return (PerfMetric) bVar.j(bVarP).build();
    }

    public final void z() {
        Context contextM = this.f36365d.m();
        this.f36371j = contextM;
        this.f36376o = contextM.getPackageName();
        this.f36372k = Y8.a.g();
        this.f36373l = new d(this.f36371j, new com.google.firebase.perf.util.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f36374m = X8.a.b();
        this.f36369h = new C4292b(this.f36368g, this.f36372k.a());
        h();
    }
}
