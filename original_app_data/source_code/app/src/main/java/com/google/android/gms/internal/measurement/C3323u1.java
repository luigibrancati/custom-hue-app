package com.google.android.gms.internal.measurement;

import X6.AbstractC2352b3;
import X6.AbstractC2354b5;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3323u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile C3323u1 f29620j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29621a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B6.e f29622b = B6.h.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f29623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W6.a f29624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f29625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f29628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile InterfaceC3287q0 f29629i;

    public C3323u1(Context context, Bundle bundle) {
        AbstractC3260n0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3153b1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29623c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f29624d = new W6.a(this);
        this.f29625e = new ArrayList();
        try {
            if (AbstractC2354b5.a(context, "google_app_id", AbstractC2352b3.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C3323u1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f29628h = null;
                    this.f29627g = true;
                    Log.w(this.f29621a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f29628h = "fa";
        j(new O0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f29621a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C3314t1(this));
        }
    }

    public static C3323u1 s(Context context, Bundle bundle) {
        AbstractC6056k.l(context);
        if (f29620j == null) {
            synchronized (C3323u1.class) {
                try {
                    if (f29620j == null) {
                        f29620j = new C3323u1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f29620j;
    }

    public final void A(String str, String str2, Bundle bundle) {
        j(new G0(this, str, str2, bundle));
    }

    public final List B(String str, String str2) {
        zzco zzcoVar = new zzco();
        j(new H0(this, str, str2, zzcoVar));
        List list = (List) zzco.zzf(zzcoVar.I6(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void C(String str) {
        j(new I0(this, str));
    }

    public final void D(C0 c02, String str, String str2) {
        j(new J0(this, c02, str, str2));
    }

    public final void E(Boolean bool) {
        j(new K0(this, bool));
    }

    public final void F(Bundle bundle) {
        j(new L0(this, bundle));
    }

    public final void G() {
        j(new M0(this));
    }

    public final void H(long j10) {
        j(new N0(this, j10));
    }

    public final void I(String str) {
        j(new P0(this, str));
    }

    public final void J(String str) {
        j(new Q0(this, str));
    }

    public final void K(Runnable runnable) {
        j(new S0(this, runnable));
    }

    public final String L() {
        zzco zzcoVar = new zzco();
        j(new T0(this, zzcoVar));
        return zzcoVar.K(500L);
    }

    public final String M() {
        zzco zzcoVar = new zzco();
        j(new U0(this, zzcoVar));
        return zzcoVar.K(50L);
    }

    public final long N() {
        zzco zzcoVar = new zzco();
        j(new V0(this, zzcoVar));
        Long lX = zzcoVar.X(500L);
        if (lX != null) {
            return lX.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f29622b.a()).nextLong();
        int i10 = this.f29626f + 1;
        this.f29626f = i10;
        return jNextLong + ((long) i10);
    }

    public final String a() {
        zzco zzcoVar = new zzco();
        j(new W0(this, zzcoVar));
        return zzcoVar.K(500L);
    }

    public final String b() {
        zzco zzcoVar = new zzco();
        j(new Y0(this, zzcoVar));
        return zzcoVar.K(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        zzco zzcoVar = new zzco();
        j(new Z0(this, str, str2, z10, zzcoVar));
        Bundle bundleI6 = zzcoVar.I6(5000L);
        if (bundleI6 == null || bundleI6.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleI6.size());
        for (String str3 : bundleI6.keySet()) {
            Object obj = bundleI6.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        j(new C3144a1(this, false, 5, str, obj, null, null));
    }

    public final int e(String str) {
        zzco zzcoVar = new zzco();
        j(new C3162c1(this, str, zzcoVar));
        Integer num = (Integer) zzco.zzf(zzcoVar.I6(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String f() {
        zzco zzcoVar = new zzco();
        j(new C3171d1(this, zzcoVar));
        return zzcoVar.K(120000L);
    }

    public final Long g() {
        zzco zzcoVar = new zzco();
        j(new C3180e1(this, zzcoVar));
        return zzcoVar.X(120000L);
    }

    public final void h(boolean z10) {
        j(new C3189f1(this, z10));
    }

    public final void i(Bundle bundle) {
        j(new C3198g1(this, bundle));
    }

    public final /* synthetic */ String l() {
        return this.f29621a;
    }

    public final /* synthetic */ boolean m() {
        return this.f29627g;
    }

    public final /* synthetic */ InterfaceC3287q0 n() {
        return this.f29629i;
    }

    public final /* synthetic */ void o(InterfaceC3287q0 interfaceC3287q0) {
        this.f29629i = interfaceC3287q0;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(AbstractRunnableC3225j1 abstractRunnableC3225j1) {
        this.f29623c.execute(abstractRunnableC3225j1);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void k(Exception exc, boolean z10, boolean z11) {
        C3323u1 c3323u1;
        Exception exc2;
        this.f29627g |= z10;
        if (z10) {
            Log.w(this.f29621a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c3323u1 = this;
            exc2 = exc;
            c3323u1.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            c3323u1 = this;
            exc2 = exc;
        }
        Log.w(c3323u1.f29621a, "Error with data collection. Data lost.", exc2);
    }

    public final void r(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        j(new C3216i1(this, l10, str, str2, bundle, z10, z11));
    }

    public final W6.a t() {
        return this.f29624d;
    }

    public final InterfaceC3287q0 u(Context context, boolean z10) {
        try {
            return zzcq.asInterface(DynamiteModule.e(context, z10 ? DynamiteModule.f29114e : DynamiteModule.f29112c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            this.k(e10, true, false);
            return null;
        }
    }

    public final void v(X6.X3 x32) {
        AbstractC6056k.l(x32);
        List list = this.f29625e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (x32.equals(((Pair) list.get(i10)).first)) {
                        Log.w(this.f29621a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC3234k1 binderC3234k1 = new BinderC3234k1(x32);
            list.add(new Pair(x32, binderC3234k1));
            if (this.f29629i != null) {
                try {
                    this.f29629i.registerOnMeasurementEventListener(binderC3234k1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f29621a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            j(new C3207h1(this, binderC3234k1));
        }
    }

    public final void w(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void x(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        j(new E0(this, str, str2, obj, z10));
    }

    public final void z(Bundle bundle) {
        j(new F0(this, bundle));
    }
}
