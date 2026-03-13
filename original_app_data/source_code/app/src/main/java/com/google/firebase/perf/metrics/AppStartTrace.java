package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2757m;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.y;
import b9.C2898a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.e;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.TraceMetric;
import f9.C4003a;
import h8.C4288f;
import h8.o;
import h9.k;
import i9.EnumC4369b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC2757m {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static volatile AppStartTrace f31802C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static ExecutorService f31803D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f31806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.perf.util.a f31807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y8.a f31808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TraceMetric.b f31809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f31810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f31811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f31812h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f31814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f31815k;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C4003a f31825u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l f31804z = new com.google.firebase.perf.util.a().a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final long f31800A = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f31801B = TimeUnit.MILLISECONDS.toMicros(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31805a = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31813i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f31816l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f31817m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f31818n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f31819o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f31820p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f31821q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f31822r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f31823s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f31824t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31826v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f31827w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f31828x = new b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31829y = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements ViewTreeObserver.OnDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppStartTrace f31831a;

        public c(AppStartTrace appStartTrace) {
            this.f31831a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31831a.f31816l == null) {
                this.f31831a.f31817m = new l();
            }
        }
    }

    public AppStartTrace(k kVar, com.google.firebase.perf.util.a aVar, Y8.a aVar2, ExecutorService executorService) {
        this.f31806b = kVar;
        this.f31807c = aVar;
        this.f31808d = aVar2;
        f31803D = executorService;
        this.f31809e = TraceMetric.newBuilder().v("_experiment_app_start_ttid");
        this.f31814j = l.f(Process.getStartElapsedRealtime());
        o oVar = (o) C4288f.o().k(o.class);
        this.f31815k = oVar != null ? l.f(oVar.b()) : null;
    }

    public static /* synthetic */ int i(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.f31827w;
        appStartTrace.f31827w = i10 + 1;
        return i10;
    }

    public static AppStartTrace k() {
        return f31802C != null ? f31802C : l(k.k(), new com.google.firebase.perf.util.a());
    }

    public static AppStartTrace l(k kVar, com.google.firebase.perf.util.a aVar) {
        if (f31802C == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f31802C == null) {
                        f31802C = new AppStartTrace(kVar, aVar, Y8.a.g(), new ThreadPoolExecutor(0, 1, 10 + f31800A, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f31802C;
    }

    public static boolean n(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    public final l j() {
        l lVar = this.f31815k;
        return lVar != null ? lVar : f31804z;
    }

    public final l m() {
        l lVar = this.f31814j;
        return lVar != null ? lVar : j();
    }

    public final void o() {
        TraceMetric.b bVarU = TraceMetric.newBuilder().v(com.google.firebase.perf.util.c.APP_START_TRACE_NAME.toString()).t(j().e()).u(j().d(this.f31819o));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((TraceMetric) TraceMetric.newBuilder().v(com.google.firebase.perf.util.c.ON_CREATE_TRACE_NAME.toString()).t(j().e()).u(j().d(this.f31816l)).build());
        if (this.f31818n != null) {
            TraceMetric.b bVarNewBuilder = TraceMetric.newBuilder();
            bVarNewBuilder.v(com.google.firebase.perf.util.c.ON_START_TRACE_NAME.toString()).t(this.f31816l.e()).u(this.f31816l.d(this.f31818n));
            arrayList.add((TraceMetric) bVarNewBuilder.build());
            TraceMetric.b bVarNewBuilder2 = TraceMetric.newBuilder();
            bVarNewBuilder2.v(com.google.firebase.perf.util.c.ON_RESUME_TRACE_NAME.toString()).t(this.f31818n.e()).u(this.f31818n.d(this.f31819o));
            arrayList.add((TraceMetric) bVarNewBuilder2.build());
        }
        bVarU.m(arrayList).n(this.f31825u.a());
        this.f31806b.x((TraceMetric) bVarU.build(), EnumC4369b.FOREGROUND_BACKGROUND);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            u();
            if (!this.f31826v && this.f31816l == null) {
                this.f31829y = this.f31829y || n(this.f31810f);
                this.f31811g = new WeakReference(activity);
                this.f31816l = this.f31807c.a();
                if (m().d(this.f31816l) > f31800A) {
                    this.f31813i = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f31826v || this.f31813i || !this.f31808d.h() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f31828x);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f31826v && !this.f31813i) {
                boolean zH = this.f31808d.h();
                if (zH && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f31828x);
                    e.b(viewFindViewById, new Runnable() { // from class: c9.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26373a.q();
                        }
                    });
                    h.a(viewFindViewById, new Runnable() { // from class: c9.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26374a.r();
                        }
                    }, new Runnable() { // from class: c9.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26375a.s();
                        }
                    });
                }
                if (this.f31819o != null) {
                    return;
                }
                this.f31812h = new WeakReference(activity);
                this.f31819o = this.f31807c.a();
                this.f31825u = SessionManager.getInstance().perfSession();
                C2898a.e().a("onResume(): " + activity.getClass().getName() + ": " + j().d(this.f31819o) + " microseconds");
                f31803D.execute(new Runnable() { // from class: c9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26376a.o();
                    }
                });
                if (!zH) {
                    v();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f31826v && this.f31818n == null && !this.f31813i) {
            this.f31818n = this.f31807c.a();
        }
    }

    @y(AbstractC2754j.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f31826v || this.f31813i || this.f31821q != null) {
            return;
        }
        this.f31821q = this.f31807c.a();
        this.f31809e.o((TraceMetric) TraceMetric.newBuilder().v("_experiment_firstBackgrounding").t(m().e()).u(m().d(this.f31821q)).build());
    }

    @y(AbstractC2754j.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f31826v || this.f31813i || this.f31820p != null) {
            return;
        }
        this.f31820p = this.f31807c.a();
        this.f31809e.o((TraceMetric) TraceMetric.newBuilder().v("_experiment_firstForegrounding").t(m().e()).u(m().d(this.f31820p)).build());
    }

    public final void p(final TraceMetric.b bVar) {
        if (this.f31822r == null || this.f31823s == null || this.f31824t == null) {
            return;
        }
        f31803D.execute(new Runnable() { // from class: c9.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f26377a.f31806b.x((TraceMetric) bVar.build(), EnumC4369b.FOREGROUND_BACKGROUND);
            }
        });
        v();
    }

    public final void q() {
        if (this.f31824t != null) {
            return;
        }
        this.f31824t = this.f31807c.a();
        this.f31809e.o((TraceMetric) TraceMetric.newBuilder().v("_experiment_onDrawFoQ").t(m().e()).u(m().d(this.f31824t)).build());
        if (this.f31814j != null) {
            this.f31809e.o((TraceMetric) TraceMetric.newBuilder().v("_experiment_procStart_to_classLoad").t(m().e()).u(m().d(j())).build());
        }
        this.f31809e.s("systemDeterminedForeground", this.f31829y ? "true" : "false");
        this.f31809e.r("onDrawCount", this.f31827w);
        this.f31809e.n(this.f31825u.a());
        p(this.f31809e);
    }

    public final void r() {
        if (this.f31822r != null) {
            return;
        }
        this.f31822r = this.f31807c.a();
        this.f31809e.t(m().e()).u(m().d(this.f31822r));
        p(this.f31809e);
    }

    public final void s() {
        if (this.f31823s != null) {
            return;
        }
        this.f31823s = this.f31807c.a();
        this.f31809e.o((TraceMetric) TraceMetric.newBuilder().v("_experiment_preDrawFoQ").t(m().e()).u(m().d(this.f31823s)).build());
        p(this.f31809e);
    }

    public synchronized void t(Context context) {
        try {
            if (this.f31805a) {
                return;
            }
            ProcessLifecycleOwner.k().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f31829y = this.f31829y || n(applicationContext);
                this.f31805a = true;
                this.f31810f = applicationContext;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void u() {
        l lVar = this.f31817m;
        if (lVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || lVar.c() > f31801B) {
            this.f31826v = true;
        }
        this.f31817m = null;
    }

    public synchronized void v() {
        if (this.f31805a) {
            ProcessLifecycleOwner.k().getLifecycle().c(this);
            ((Application) this.f31810f).unregisterActivityLifecycleCallbacks(this);
            this.f31805a = false;
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
