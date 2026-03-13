package i;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import b0.C2778b;
import i.AbstractC4312e;
import io.sentry.protocol.Device;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: i.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4312e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f36626a = new c(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f36627b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static U0.h f36628c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static U0.h f36629d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f36630e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f36631f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2778b f36632g = new C2778b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f36633h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f36634i = new Object();

    /* JADX INFO: renamed from: i.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: i.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: i.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f36635a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue f36636b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f36637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f36638d;

        public c(Executor executor) {
            this.f36637c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.c();
            }
        }

        public void c() {
            synchronized (this.f36635a) {
                try {
                    Runnable runnable = (Runnable) this.f36636b.poll();
                    this.f36638d = runnable;
                    if (runnable != null) {
                        this.f36637c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f36635a) {
                try {
                    this.f36636b.add(new Runnable() { // from class: i.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC4312e.c.a(this.f36639a, runnable);
                        }
                    });
                    if (this.f36638d == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i.e$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void D(AbstractC4312e abstractC4312e) {
        synchronized (f36633h) {
            E(abstractC4312e);
        }
    }

    public static void E(AbstractC4312e abstractC4312e) {
        synchronized (f36633h) {
            try {
                Iterator it = f36632g.iterator();
                while (it.hasNext()) {
                    AbstractC4312e abstractC4312e2 = (AbstractC4312e) ((WeakReference) it.next()).get();
                    if (abstractC4312e2 == abstractC4312e || abstractC4312e2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void M(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().f()) {
                    String strB = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService(Device.JsonKeys.LOCALE);
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void N(final Context context) {
        if (u(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f36631f) {
                    return;
                }
                f36626a.execute(new Runnable() { // from class: i.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4312e.c(context);
                    }
                });
                return;
            }
            synchronized (f36634i) {
                try {
                    U0.h hVar = f36628c;
                    if (hVar == null) {
                        if (f36629d == null) {
                            f36629d = U0.h.b(androidx.core.app.e.b(context));
                        }
                        if (f36629d.f()) {
                        } else {
                            f36628c = f36629d;
                        }
                    } else if (!hVar.equals(f36629d)) {
                        U0.h hVar2 = f36628c;
                        f36629d = hVar2;
                        androidx.core.app.e.a(context, hVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        M(context);
        f36631f = true;
    }

    public static void d(AbstractC4312e abstractC4312e) {
        synchronized (f36633h) {
            E(abstractC4312e);
            f36632g.add(new WeakReference(abstractC4312e));
        }
    }

    public static AbstractC4312e h(Activity activity, InterfaceC4310c interfaceC4310c) {
        return new g(activity, interfaceC4310c);
    }

    public static AbstractC4312e i(Dialog dialog, InterfaceC4310c interfaceC4310c) {
        return new g(dialog, interfaceC4310c);
    }

    public static U0.h k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objO = o();
            if (objO != null) {
                return U0.h.i(b.a(objO));
            }
        } else {
            U0.h hVar = f36628c;
            if (hVar != null) {
                return hVar;
            }
        }
        return U0.h.e();
    }

    public static int m() {
        return f36627b;
    }

    public static Object o() {
        Context contextL;
        Iterator it = f36632g.iterator();
        while (it.hasNext()) {
            AbstractC4312e abstractC4312e = (AbstractC4312e) ((WeakReference) it.next()).get();
            if (abstractC4312e != null && (contextL = abstractC4312e.l()) != null) {
                return contextL.getSystemService(Device.JsonKeys.LOCALE);
            }
        }
        return null;
    }

    public static U0.h q() {
        return f36628c;
    }

    public static boolean u(Context context) {
        if (f36630e == null) {
            try {
                Bundle bundle = n.a(context).metaData;
                if (bundle != null) {
                    f36630e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f36630e = Boolean.FALSE;
            }
        }
        return f36630e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C();

    public abstract boolean F(int i10);

    public abstract void G(int i10);

    public abstract void H(View view);

    public abstract void I(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void K(int i10);

    public abstract void L(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i10);

    public abstract Context l();

    public abstract int n();

    public abstract MenuInflater p();

    public abstract AbstractC4308a r();

    public abstract void s();

    public abstract void t();

    public abstract void v(Configuration configuration);

    public abstract void w(Bundle bundle);

    public abstract void x();

    public abstract void y(Bundle bundle);

    public abstract void z();

    public void J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void f(Context context) {
    }
}
