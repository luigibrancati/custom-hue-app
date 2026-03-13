package J3;

import I3.AbstractC0890u;
import Q3.C1877w;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import fc.C4015H;
import java.util.List;
import java.util.UUID;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g0 extends I3.M {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f5993m = AbstractC0890u.i("WorkManagerImpl");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static g0 f5994n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static g0 f5995o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f5996p = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f5998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkDatabase f5999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S3.b f6000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f6001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0910s f6002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public R3.s f6003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6004i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f6005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final O3.n f6006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rd.M f6007l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public g0(Context context, androidx.work.a aVar, S3.b bVar, WorkDatabase workDatabase, List list, C0910s c0910s, O3.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        AbstractC0890u.h(new AbstractC0890u.a(aVar.j()));
        this.f5997b = applicationContext;
        this.f6000e = bVar;
        this.f5999d = workDatabase;
        this.f6002g = c0910s;
        this.f6006k = nVar;
        this.f5998c = aVar;
        this.f6001f = list;
        Rd.M mF = androidx.work.impl.a.f(bVar);
        this.f6007l = mF;
        this.f6003h = new R3.s(this.f5999d);
        AbstractC0915x.e(list, this.f6002g, bVar.c(), this.f5999d, aVar);
        this.f6000e.d(new ForceStopRunnable(applicationContext, this));
        D.c(mF, this.f5997b, aVar, workDatabase);
    }

    public static void g(Context context, androidx.work.a aVar) {
        synchronized (f5996p) {
            try {
                g0 g0Var = f5994n;
                if (g0Var != null && f5995o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (g0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f5995o == null) {
                        f5995o = androidx.work.impl.a.c(applicationContext, aVar);
                    }
                    f5994n = f5995o;
                }
            } finally {
            }
        }
    }

    public static /* synthetic */ C4015H h(g0 g0Var) {
        L3.f.b(g0Var.i());
        g0Var.q().W().n();
        AbstractC0915x.f(g0Var.j(), g0Var.q(), g0Var.o());
        return C4015H.f34254a;
    }

    public static g0 k() {
        synchronized (f5996p) {
            try {
                g0 g0Var = f5994n;
                if (g0Var != null) {
                    return g0Var;
                }
                return f5995o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g0 l(Context context) {
        g0 g0VarK;
        synchronized (f5996p) {
            try {
                g0VarK = k();
                if (g0VarK == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0VarK;
    }

    @Override // I3.M
    public I3.y a(String str) {
        return R3.g.l(str, this);
    }

    @Override // I3.M
    public I3.y b(UUID uuid) {
        return R3.g.g(uuid, this);
    }

    @Override // I3.M
    public I3.y d(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new F(this, list).b();
    }

    @Override // I3.M
    public O7.e f(String str) {
        return R3.x.c(this.f5999d, this.f6000e, str);
    }

    public Context i() {
        return this.f5997b;
    }

    public androidx.work.a j() {
        return this.f5998c;
    }

    public R3.s m() {
        return this.f6003h;
    }

    public C0910s n() {
        return this.f6002g;
    }

    public List o() {
        return this.f6001f;
    }

    public O3.n p() {
        return this.f6006k;
    }

    public WorkDatabase q() {
        return this.f5999d;
    }

    public S3.b r() {
        return this.f6000e;
    }

    public void s() {
        synchronized (f5996p) {
            try {
                this.f6004i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f6005j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f6005j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t() {
        I3.J.a(j().n(), "ReschedulingWork", new InterfaceC6082a() { // from class: J3.f0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return g0.h(this.f5991a);
            }
        });
    }

    public void u(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f5996p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f6005j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f6005j = pendingResult;
                if (this.f6004i) {
                    pendingResult.finish();
                    this.f6005j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(C1877w c1877w, int i10) {
        this.f6000e.d(new R3.y(this.f6002g, new C0916y(c1877w), true, i10));
    }
}
