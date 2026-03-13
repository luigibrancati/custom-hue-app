package u6;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: u6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacks2C5948c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C5948c f45143e = new ComponentCallbacks2C5948c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f45144a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f45145b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45146c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45147d = false;

    /* JADX INFO: renamed from: u6.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(boolean z10);
    }

    public static ComponentCallbacks2C5948c b() {
        return f45143e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C5948c componentCallbacks2C5948c = f45143e;
        synchronized (componentCallbacks2C5948c) {
            try {
                if (!componentCallbacks2C5948c.f45147d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C5948c);
                    application.registerComponentCallbacks(componentCallbacks2C5948c);
                    componentCallbacks2C5948c.f45147d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f45143e) {
            this.f45146c.add(aVar);
        }
    }

    public boolean d() {
        return this.f45144a.get();
    }

    public boolean e(boolean z10) {
        AtomicBoolean atomicBoolean = this.f45145b;
        if (!atomicBoolean.get()) {
            if (B6.m.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f45144a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z10) {
        synchronized (f45143e) {
            try {
                Iterator it = this.f45146c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f45145b;
        boolean zCompareAndSet = this.f45144a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f45145b;
        boolean zCompareAndSet = this.f45144a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f45144a.compareAndSet(false, true)) {
            this.f45145b.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
