package k9;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import h8.C4288f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import l8.InterfaceC4964a;
import m9.C5032a;
import n9.InterfaceC5150a;
import o9.InterfaceC5242f;
import u6.ComponentCallbacks2C5948c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class z implements InterfaceC5150a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final B6.e f39303j = B6.h.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Random f39304k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f39305l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f39308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4288f f39309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P8.h f39310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i8.c f39311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O8.b f39312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f39314i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements ComponentCallbacks2C5948c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference f39315a = new AtomicReference();

        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f39315a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (T1.e.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C5948c.c(application);
                    ComponentCallbacks2C5948c.b().a(aVar);
                }
            }
        }

        @Override // u6.ComponentCallbacks2C5948c.a
        public void a(boolean z10) {
            z.q(z10);
        }
    }

    public z(Context context, ScheduledExecutorService scheduledExecutorService, C4288f c4288f, P8.h hVar, i8.c cVar, O8.b bVar) {
        this(context, scheduledExecutorService, c4288f, hVar, cVar, bVar, true);
    }

    public static /* synthetic */ InterfaceC4964a b() {
        return null;
    }

    public static l9.r k(C4288f c4288f, String str, O8.b bVar) {
        if (p(c4288f) && str.equals("firebase")) {
            return new l9.r(bVar);
        }
        return null;
    }

    public static com.google.firebase.remoteconfig.internal.e n(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.e(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    public static boolean o(C4288f c4288f, String str) {
        return str.equals("firebase") && p(c4288f);
    }

    public static boolean p(C4288f c4288f) {
        return c4288f.q().equals("[DEFAULT]");
    }

    public static synchronized void q(boolean z10) {
        Iterator it = f39305l.values().iterator();
        while (it.hasNext()) {
            ((o) it.next()).u(z10);
        }
    }

    @Override // n9.InterfaceC5150a
    public void a(String str, InterfaceC5242f interfaceC5242f) {
        e(str).q().e(interfaceC5242f);
    }

    public synchronized o d(C4288f c4288f, String str, P8.h hVar, i8.c cVar, Executor executor, l9.e eVar, l9.e eVar2, l9.e eVar3, com.google.firebase.remoteconfig.internal.c cVar2, l9.l lVar, com.google.firebase.remoteconfig.internal.e eVar4, m9.e eVar5) throws Throwable {
        z zVar;
        String str2;
        try {
            try {
                if (this.f39306a.containsKey(str)) {
                    zVar = this;
                    str2 = str;
                } else {
                    zVar = this;
                    str2 = str;
                    o oVar = new o(this.f39307b, c4288f, hVar, o(c4288f, str) ? cVar : null, executor, eVar, eVar2, eVar3, cVar2, lVar, eVar4, l(c4288f, hVar, cVar2, eVar2, this.f39307b, str, eVar4), eVar5);
                    oVar.y();
                    zVar.f39306a.put(str2, oVar);
                    f39305l.put(str2, oVar);
                }
                return (o) zVar.f39306a.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized o e(String str) throws Throwable {
        Throwable th;
        z zVar;
        l9.e eVarF;
        l9.e eVarF2;
        l9.e eVarF3;
        com.google.firebase.remoteconfig.internal.e eVarN;
        l9.l lVarJ;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            eVarF = f(str, "fetch");
            eVarF2 = f(str, "activate");
            eVarF3 = f(str, "defaults");
            eVarN = n(this.f39307b, this.f39313h, str);
            lVarJ = j(eVarF2, eVarF3);
            final l9.r rVarK = k(this.f39309d, str, this.f39312g);
            if (rVarK != null) {
                try {
                    lVarJ.b(new B6.d() { // from class: k9.w
                        @Override // B6.d
                        public final void accept(Object obj, Object obj2) {
                            rVarK.a((String) obj, (com.google.firebase.remoteconfig.internal.b) obj2);
                        }
                    });
                } catch (Throwable th3) {
                    th = th3;
                    zVar = this;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            zVar = this;
            th = th;
            throw th;
        }
        return d(this.f39309d, str, this.f39310e, this.f39311f, this.f39308c, eVarF, eVarF2, eVarF3, h(str, eVarF, eVarN), lVarJ, eVarN, m(eVarF2, eVarF3));
    }

    public final l9.e f(String str, String str2) {
        return l9.e.h(this.f39308c, l9.p.c(this.f39307b, String.format("%s_%s_%s_%s.json", "frc", this.f39313h, str, str2)));
    }

    public o g() {
        return e("firebase");
    }

    public synchronized com.google.firebase.remoteconfig.internal.c h(String str, l9.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.c(this.f39310e, p(this.f39309d) ? this.f39312g : new O8.b() { // from class: k9.y
            @Override // O8.b
            public final Object get() {
                return z.b();
            }
        }, this.f39308c, f39303j, f39304k, eVar, i(this.f39309d.r().b(), str, eVar2), eVar2, this.f39314i);
    }

    public ConfigFetchHttpClient i(String str, String str2, com.google.firebase.remoteconfig.internal.e eVar) {
        return new ConfigFetchHttpClient(this.f39307b, this.f39309d.r().c(), str, str2, eVar.c(), eVar.c());
    }

    public final l9.l j(l9.e eVar, l9.e eVar2) {
        return new l9.l(this.f39308c, eVar, eVar2);
    }

    public synchronized l9.m l(C4288f c4288f, P8.h hVar, com.google.firebase.remoteconfig.internal.c cVar, l9.e eVar, Context context, String str, com.google.firebase.remoteconfig.internal.e eVar2) {
        return new l9.m(c4288f, hVar, cVar, eVar, context, str, eVar2, this.f39308c);
    }

    public final m9.e m(l9.e eVar, l9.e eVar2) {
        return new m9.e(eVar, C5032a.a(eVar, eVar2), this.f39308c);
    }

    public z(Context context, ScheduledExecutorService scheduledExecutorService, C4288f c4288f, P8.h hVar, i8.c cVar, O8.b bVar, boolean z10) {
        this.f39306a = new HashMap();
        this.f39314i = new HashMap();
        this.f39307b = context;
        this.f39308c = scheduledExecutorService;
        this.f39309d = c4288f;
        this.f39310e = hVar;
        this.f39311f = cVar;
        this.f39312g = bVar;
        this.f39313h = c4288f.r().c();
        a.c(context);
        if (z10) {
            Tasks.b(scheduledExecutorService, new Callable() { // from class: k9.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f39302a.g();
                }
            });
        }
    }
}
