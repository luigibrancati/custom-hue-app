package E;

import B0.c;
import E.B0;
import E.G;
import L.AbstractC1087a0;
import L.AbstractC1091c0;
import L.G;
import L.H;
import L.t1;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Executor;
import s.InterfaceC5702a;
import s3.AbstractC5712a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f2734s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseArray f2735t = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.W f2736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f2738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f2739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f2740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f2741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L.H f2742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L.G f2743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t1 f2744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public P.m f2745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC0823y f2746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B0 f2747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O7.e f2748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final L.Q f2749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f2750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public O7.e f2751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f2752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2753r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public F(Context context, G.b bVar) {
        this(context, bVar, new L.W0());
    }

    public static /* synthetic */ void a(final F f10, Context context, final Executor executor, final int i10, final c.a aVar, final long j10) {
        f10.getClass();
        AbstractC5712a.b("CX:initAndRetryRecursively");
        final Context contextA = M.e.a(context);
        try {
            H.a aVarF0 = f10.f2738c.f0(null);
            if (aVarF0 == null) {
                throw new C0803n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            AbstractC1087a0 abstractC1087a0A = AbstractC1087a0.a(f10.f2739d, f10.f2740e);
            C0817v c0817vD0 = f10.f2738c.d0(null);
            long jG0 = f10.f2738c.g0();
            t1.c cVarM0 = f10.f2738c.m0(null);
            if (cVarM0 == null) {
                throw new C0803n0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            f10.f2744i = cVarM0.a(contextA);
            P.n nVar = new P.n(f10.f2744i, null);
            f10.f2745j = nVar;
            f10.f2742g = aVarF0.a(contextA, abstractC1087a0A, c0817vD0, jG0, f10.f2738c, nVar);
            G.a aVarJ0 = f10.f2738c.j0(null);
            if (aVarJ0 == null) {
                throw new C0803n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            L.G gA = aVarJ0.a(contextA, f10.f2742g.a(), f10.f2742g.d());
            f10.f2743h = gA;
            f10.f2745j.a(gA);
            if (executor instanceof r) {
                ((r) executor).e(f10.f2742g);
            }
            f10.f2736a.n(f10.f2742g);
            F.a aVarF = f10.f2742g.f();
            aVarF.f(f10.f2736a);
            f10.f2746k = new C0825z(f10.f2736a, aVarF, f10.f2744i, f10.f2745j);
            Iterator it = f10.f2736a.m().iterator();
            while (it.hasNext()) {
                ((L.J) it.next()).i().r(f10.f2746k);
            }
            f10.f2749n.w(f10.f2742g, f10.f2736a);
            f10.f2749n.i(f10.f2743h);
            f10.f2749n.i(f10.f2742g.f());
            AbstractC1091c0.a(contextA, f10.f2736a, c0817vD0);
            if (i10 > 1) {
                f10.s(null);
            }
            f10.p();
            aVar.c(null);
        } catch (C0803n0 | AbstractC1091c0.b | RuntimeException e10) {
            L.S s10 = new L.S(j10, i10, e10);
            B0.c cVarD = f10.f2747l.d(s10);
            f10.s(s10);
            f10.f2749n.v();
            if (!cVarD.d() || i10 >= Integer.MAX_VALUE) {
                synchronized (f10.f2737b) {
                    f10.f2750o = a.INITIALIZING_ERROR;
                    if (cVarD.c()) {
                        f10.p();
                        aVar.c(null);
                    } else if (e10 instanceof AbstractC1091c0.b) {
                        String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC1091c0.b) e10).a();
                        AbstractC0807p0.d("CameraX", str, e10);
                        aVar.f(new C0803n0(new C0821x(3, str)));
                    } else if (e10 instanceof C0803n0) {
                        aVar.f(e10);
                    } else {
                        aVar.f(new C0803n0(e10));
                    }
                }
            } else {
                AbstractC0807p0.m("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e10);
                U0.g.b(f10.f2740e, new Runnable() { // from class: E.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2728a.n(executor, j10, i10 + 1, contextA, aVar);
                    }
                }, "retry_token", cVarD.b());
            }
        } finally {
            AbstractC5712a.d();
        }
    }

    public static /* synthetic */ void b(F f10, c.a aVar) {
        f10.f2742g.shutdown();
        if (f10.f2741f != null) {
            Executor executor = f10.f2739d;
            if (executor instanceof r) {
                ((r) executor).d();
            }
            f10.f2741f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ Object c(F f10, Context context, c.a aVar) {
        f10.n(f10.f2739d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final F f10, final c.a aVar) {
        f10.f2749n.v();
        f10.f2736a.k().b(new Runnable() { // from class: E.D
            @Override // java.lang.Runnable
            public final void run() {
                F.b(this.f2725a, aVar);
            }
        }, f10.f2739d);
        return "CameraX shutdownInternal";
    }

    public static void f(Integer num) {
        synchronized (f2734s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f2735t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static G.b k(Context context) {
        ComponentCallbacks2 componentCallbacks2B = M.e.b(context);
        if (componentCallbacks2B instanceof G.b) {
            return (G.b) componentCallbacks2B;
        }
        try {
            Context contextA = M.e.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (G.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            AbstractC0807p0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            AbstractC0807p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e10);
            return null;
        }
    }

    public static void m(Integer num) {
        synchronized (f2734s) {
            try {
                if (num == null) {
                    return;
                }
                X0.h.d(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f2735t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t() {
        SparseArray sparseArray = f2735t;
        if (sparseArray.size() == 0) {
            AbstractC0807p0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC0807p0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC0807p0.j(4);
        } else if (sparseArray.get(5) != null) {
            AbstractC0807p0.j(5);
        } else if (sparseArray.get(6) != null) {
            AbstractC0807p0.j(6);
        }
    }

    public static void u(Context context, L.U0 u02, InterfaceC5702a interfaceC5702a) {
        if (u02 != null) {
            AbstractC0807p0.a("CameraX", "QuirkSettings from CameraXConfig: " + u02);
        } else {
            u02 = (L.U0) interfaceC5702a.apply(context);
            AbstractC0807p0.a("CameraX", "QuirkSettings from app metadata: " + u02);
        }
        if (u02 == null) {
            u02 = L.V0.f7953b;
            AbstractC0807p0.a("CameraX", "QuirkSettings by default: " + u02);
        }
        L.V0.b().d(u02);
    }

    public L.H g() {
        L.H h10 = this.f2742g;
        if (h10 != null) {
            return h10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public L.W h() {
        return this.f2736a;
    }

    public InterfaceC0823y i() {
        InterfaceC0823y interfaceC0823y = this.f2746k;
        if (interfaceC0823y != null) {
            return interfaceC0823y;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public int j() {
        return this.f2753r;
    }

    public O7.e l() {
        return this.f2748m;
    }

    public final void n(final Executor executor, final long j10, final int i10, final Context context, final c.a aVar) {
        executor.execute(new Runnable() { // from class: E.B
            @Override // java.lang.Runnable
            public final void run() {
                F.a(this.f2704a, context, executor, i10, aVar, j10);
            }
        });
    }

    public final O7.e o(final Context context) {
        O7.e eVarA;
        synchronized (this.f2737b) {
            X0.h.j(this.f2750o == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f2750o = a.INITIALIZING;
            eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: E.A
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return F.c(this.f2702a, context, aVar);
                }
            });
        }
        return eVarA;
    }

    public final void p() {
        synchronized (this.f2737b) {
            this.f2750o = a.INITIALIZED;
        }
    }

    public O7.e q() {
        return r();
    }

    public final O7.e r() {
        synchronized (this.f2737b) {
            try {
                this.f2740e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f2750o.ordinal();
                if (iOrdinal == 0) {
                    this.f2750o = a.SHUTDOWN;
                    return O.n.p(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f2750o = a.SHUTDOWN;
                    f(this.f2752q);
                    this.f2751p = B0.c.a(new c.InterfaceC0018c() { // from class: E.C
                        @Override // B0.c.InterfaceC0018c
                        public final Object a(c.a aVar) {
                            return F.d(this.f2722a, aVar);
                        }
                    });
                }
                return this.f2751p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(B0.b bVar) {
        if (AbstractC5712a.e()) {
            AbstractC5712a.f("CX:CameraProvider-RetryStatus", bVar != null ? bVar.getStatus() : -1);
        }
    }

    public F(Context context, G.b bVar, InterfaceC5702a interfaceC5702a) {
        this.f2736a = new L.W();
        this.f2737b = new Object();
        this.f2750o = a.UNINITIALIZED;
        this.f2751p = O.n.p(null);
        if (bVar != null) {
            this.f2738c = bVar.getCameraXConfig();
        } else {
            G.b bVarK = k(context);
            if (bVarK == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f2738c = bVarK.getCameraXConfig();
        }
        u(context, this.f2738c.k0(), interfaceC5702a);
        this.f2753r = this.f2738c.i0();
        Executor executorE0 = this.f2738c.e0(null);
        Handler handlerL0 = this.f2738c.l0(null);
        executorE0 = executorE0 == null ? new r() : executorE0;
        this.f2739d = executorE0;
        if (handlerL0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f2741f = handlerThread;
            handlerThread.start();
            this.f2740e = U0.g.a(handlerThread.getLooper());
        } else {
            this.f2741f = null;
            this.f2740e = handlerL0;
        }
        Integer num = (Integer) this.f2738c.c(G.f2768V, null);
        this.f2752q = num;
        m(num);
        this.f2747l = new B0.a(this.f2738c.h0()).a();
        this.f2749n = new L.Q(executorE0);
        this.f2748m = o(context);
    }
}
