package a7;

import B6.h;
import B6.n;
import B6.p;
import P6.i;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: a7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2644a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f21094r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f21095s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f21096t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile InterfaceC2648e f21097u = new C2646c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f21099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future f21101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f21103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P6.b f21106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B6.e f21107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorkSource f21108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f21109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f21110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f21111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f21112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicInteger f21113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f21114q;

    public C2644a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f21098a = new Object();
        this.f21100c = 0;
        this.f21103f = new HashSet();
        this.f21104g = true;
        this.f21107j = h.d();
        this.f21112o = new HashMap();
        this.f21113p = new AtomicInteger(0);
        AbstractC6056k.m(context, "WakeLock: context must not be null");
        AbstractC6056k.g(str, "WakeLock: wakeLockName must not be empty");
        this.f21111n = context.getApplicationContext();
        this.f21110m = str;
        this.f21106i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f21109l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f21109l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f21099b = wakeLockNewWakeLock;
        if (p.c(context)) {
            WorkSource workSourceB = p.b(context, n.a(packageName) ? context.getPackageName() : packageName);
            this.f21108k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f21095s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f21096t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f21095s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        P6.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f21095s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f21114q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(C2644a c2644a) {
        synchronized (c2644a.f21098a) {
            try {
                if (c2644a.b()) {
                    Log.e("WakeLock", String.valueOf(c2644a.f21109l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c2644a.g();
                    if (c2644a.b()) {
                        c2644a.f21100c = 1;
                        c2644a.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f21113p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f21094r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f21098a) {
            try {
                if (!b()) {
                    this.f21106i = P6.b.a(false, null);
                    this.f21099b.acquire();
                    this.f21107j.c();
                }
                this.f21100c++;
                this.f21105h++;
                f(null);
                C2647d c2647d = (C2647d) this.f21112o.get(null);
                if (c2647d == null) {
                    c2647d = new C2647d(null);
                    this.f21112o.put(null, c2647d);
                }
                c2647d.f21116a++;
                long jC = this.f21107j.c();
                long j11 = Long.MAX_VALUE - jC > jMax ? jC + jMax : Long.MAX_VALUE;
                if (j11 > this.f21102e) {
                    this.f21102e = j11;
                    Future future = this.f21101d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f21101d = this.f21114q.schedule(new Runnable() { // from class: a7.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2644a.e(this.f21115a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f21098a) {
            z10 = this.f21100c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f21113p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f21109l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f21098a) {
            try {
                f(null);
                if (this.f21112o.containsKey(null)) {
                    C2647d c2647d = (C2647d) this.f21112o.get(null);
                    if (c2647d != null) {
                        int i10 = c2647d.f21116a - 1;
                        c2647d.f21116a = i10;
                        if (i10 == 0) {
                            this.f21112o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f21109l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f21098a) {
            this.f21104g = z10;
        }
    }

    public final String f(String str) {
        if (this.f21104g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f21103f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f21103f);
        this.f21103f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.a.a(arrayList.get(0));
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f21098a) {
            try {
                if (b()) {
                    if (this.f21104g) {
                        int i11 = this.f21100c - 1;
                        this.f21100c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f21100c = 0;
                    }
                    g();
                    Iterator it = this.f21112o.values().iterator();
                    while (it.hasNext()) {
                        ((C2647d) it.next()).f21116a = 0;
                    }
                    this.f21112o.clear();
                    Future future = this.f21101d;
                    if (future != null) {
                        future.cancel(false);
                        this.f21101d = null;
                        this.f21102e = 0L;
                    }
                    this.f21105h = 0;
                    if (this.f21099b.isHeld()) {
                        try {
                            try {
                                this.f21099b.release();
                                if (this.f21106i != null) {
                                    this.f21106i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f21109l).concat(" failed to release!"), e10);
                                if (this.f21106i != null) {
                                    this.f21106i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f21106i != null) {
                                this.f21106i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f21109l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
