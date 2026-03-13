package X8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC2740v;
import androidx.fragment.app.J;
import b9.C2898a;
import c9.g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.TraceMetric;
import h9.k;
import i9.EnumC4369b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2898a f19350r = C2898a.e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile a f19351s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f19352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f19353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f19354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f19355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f19356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f19357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f19358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f19359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f19360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y8.a f19361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.firebase.perf.util.a f19362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f19364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f19365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC4369b f19366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19368q;

    /* JADX INFO: renamed from: X8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0243a {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void onUpdateAppState(EnumC4369b enumC4369b);
    }

    public a(k kVar, com.google.firebase.perf.util.a aVar) {
        this(kVar, aVar, Y8.a.g(), g());
    }

    public static a b() {
        if (f19351s == null) {
            synchronized (a.class) {
                try {
                    if (f19351s == null) {
                        f19351s = new a(k.k(), new com.google.firebase.perf.util.a());
                    }
                } finally {
                }
            }
        }
        return f19351s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    public static boolean g() {
        return d.a();
    }

    public EnumC4369b a() {
        return this.f19366o;
    }

    public void d(String str, long j10) {
        synchronized (this.f19356e) {
            try {
                Long l10 = (Long) this.f19356e.get(str);
                if (l10 == null) {
                    this.f19356e.put(str, Long.valueOf(j10));
                } else {
                    this.f19356e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i10) {
        this.f19359h.addAndGet(i10);
    }

    public boolean f() {
        return this.f19368q;
    }

    public boolean h() {
        return this.f19363l;
    }

    public synchronized void i(Context context) {
        if (this.f19367p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f19367p = true;
        }
    }

    public void j(InterfaceC0243a interfaceC0243a) {
        synchronized (this.f19358g) {
            this.f19358g.add(interfaceC0243a);
        }
    }

    public void k(WeakReference weakReference) {
        synchronized (this.f19357f) {
            this.f19357f.add(weakReference);
        }
    }

    public final void l() {
        synchronized (this.f19358g) {
            try {
                for (InterfaceC0243a interfaceC0243a : this.f19358g) {
                    if (interfaceC0243a != null) {
                        interfaceC0243a.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(Activity activity) {
        Trace trace = (Trace) this.f19355d.get(activity);
        if (trace == null) {
            return;
        }
        this.f19355d.remove(activity);
        g gVarE = ((d) this.f19353b.get(activity)).e();
        if (!gVarE.d()) {
            f19350r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, (g.a) gVarE.c());
            trace.stop();
        }
    }

    public final void n(String str, l lVar, l lVar2) {
        if (this.f19361j.K()) {
            TraceMetric.b bVarN = TraceMetric.newBuilder().v(str).t(lVar.e()).u(lVar.d(lVar2)).n(SessionManager.getInstance().perfSession().a());
            int andSet = this.f19359h.getAndSet(0);
            synchronized (this.f19356e) {
                try {
                    bVarN.p(this.f19356e);
                    if (andSet != 0) {
                        bVarN.r(com.google.firebase.perf.util.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f19356e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f19360i.x((TraceMetric) bVarN.build(), EnumC4369b.FOREGROUND_BACKGROUND);
        }
    }

    public final void o(Activity activity) {
        if (h() && this.f19361j.K()) {
            d dVar = new d(activity);
            this.f19353b.put(activity, dVar);
            if (activity instanceof ActivityC2740v) {
                c cVar = new c(this.f19362k, this.f19360i, this, dVar);
                this.f19354c.put(activity, cVar);
                ((ActivityC2740v) activity).getSupportFragmentManager().h1(cVar, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f19353b.remove(activity);
        if (this.f19354c.containsKey(activity)) {
            ((ActivityC2740v) activity).getSupportFragmentManager().x1((J.k) this.f19354c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f19352a.isEmpty()) {
                this.f19364m = this.f19362k.a();
                this.f19352a.put(activity, Boolean.TRUE);
                if (this.f19368q) {
                    q(EnumC4369b.FOREGROUND);
                    l();
                    this.f19368q = false;
                } else {
                    n(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString(), this.f19365n, this.f19364m);
                    q(EnumC4369b.FOREGROUND);
                }
            } else {
                this.f19352a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.f19361j.K()) {
                if (!this.f19353b.containsKey(activity)) {
                    o(activity);
                }
                ((d) this.f19353b.get(activity)).c();
                Trace trace = new Trace(c(activity), this.f19360i, this.f19362k, this);
                trace.start();
                this.f19355d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f19352a.containsKey(activity)) {
                this.f19352a.remove(activity);
                if (this.f19352a.isEmpty()) {
                    this.f19365n = this.f19362k.a();
                    n(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString(), this.f19364m, this.f19365n);
                    q(EnumC4369b.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void p(WeakReference weakReference) {
        synchronized (this.f19357f) {
            this.f19357f.remove(weakReference);
        }
    }

    public final void q(EnumC4369b enumC4369b) {
        this.f19366o = enumC4369b;
        synchronized (this.f19357f) {
            try {
                Iterator it = this.f19357f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f19366o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a(k kVar, com.google.firebase.perf.util.a aVar, Y8.a aVar2, boolean z10) {
        this.f19352a = new WeakHashMap();
        this.f19353b = new WeakHashMap();
        this.f19354c = new WeakHashMap();
        this.f19355d = new WeakHashMap();
        this.f19356e = new HashMap();
        this.f19357f = new HashSet();
        this.f19358g = new HashSet();
        this.f19359h = new AtomicInteger(0);
        this.f19366o = EnumC4369b.BACKGROUND;
        this.f19367p = false;
        this.f19368q = true;
        this.f19360i = kVar;
        this.f19362k = aVar;
        this.f19361j = aVar2;
        this.f19363l = z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
