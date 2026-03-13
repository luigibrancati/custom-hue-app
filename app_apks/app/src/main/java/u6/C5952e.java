package u6;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b0.C2778b;
import b7.C2878l;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s6.C5783b;
import t6.AbstractC5846d;
import u6.C5960i;
import v6.AbstractC6050e;
import v6.AbstractC6061p;
import v6.C6054i;
import v6.C6057l;
import v6.C6058m;
import v6.C6060o;
import v6.C6069y;
import v6.InterfaceC6062q;

/* JADX INFO: renamed from: u6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5952e implements Handler.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static C5952e f45155s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C6060o f45159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC6062q f45160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f45161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GoogleApiAvailability f45162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6069y f45163g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f45170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f45171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f45152p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f45153q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f45154r = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile boolean f45156t = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45157a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45158b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f45164h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f45165i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f45166j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C5974t f45167k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f45168l = new C2778b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f45169m = new C2778b();

    public C5952e(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f45171o = true;
        this.f45161e = context;
        H6.e eVar = new H6.e(looper, this);
        this.f45170n = eVar;
        this.f45162f = googleApiAvailability;
        this.f45163g = new C6069y(googleApiAvailability);
        if (B6.i.a(context)) {
            this.f45171o = false;
        }
        eVar.sendMessage(eVar.obtainMessage(6));
    }

    public static Status j(C5946b c5946b, C5783b c5783b) {
        String strB = c5946b.b();
        String strValueOf = String.valueOf(c5783b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strB).length() + 63 + strValueOf.length());
        sb2.append("API: ");
        sb2.append(strB);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(strValueOf);
        return new Status(c5783b, sb2.toString());
    }

    public static C5952e m(Context context) {
        C5952e c5952e;
        synchronized (f45154r) {
            try {
                if (f45155s == null) {
                    f45155s = new C5952e(context.getApplicationContext(), AbstractC6050e.b().getLooper(), GoogleApiAvailability.m());
                    if (f45156t) {
                        final Handler handler = f45155s.f45170n;
                        Objects.requireNonNull(handler);
                        com.google.android.gms.common.internal.c.l0(new Executor() { // from class: u6.E
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                handler.post(runnable);
                            }
                        });
                    }
                }
                c5952e = f45155s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5952e;
    }

    public final /* synthetic */ long C() {
        return this.f45157a;
    }

    public final /* synthetic */ void D(boolean z10) {
        this.f45158b = true;
    }

    public final /* synthetic */ Context F() {
        return this.f45161e;
    }

    public final /* synthetic */ GoogleApiAvailability a() {
        return this.f45162f;
    }

    public final /* synthetic */ C6069y b() {
        return this.f45163g;
    }

    public final /* synthetic */ Map c() {
        return this.f45166j;
    }

    public final /* synthetic */ C5974t d() {
        return this.f45167k;
    }

    public final /* synthetic */ Set e() {
        return this.f45168l;
    }

    public final /* synthetic */ Handler f() {
        return this.f45170n;
    }

    public final /* synthetic */ boolean g() {
        return this.f45171o;
    }

    public final C5919A h(AbstractC5846d abstractC5846d) {
        Map map = this.f45166j;
        C5946b c5946bP = abstractC5846d.p();
        C5919A c5919a = (C5919A) map.get(c5946bP);
        if (c5919a == null) {
            c5919a = new C5919A(this, abstractC5846d);
            map.put(c5946bP, c5919a);
        }
        if (c5919a.A()) {
            this.f45169m.add(c5946bP);
        }
        c5919a.z();
        return c5919a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        C5919A c5919a = null;
        switch (i10) {
            case 1:
                this.f45157a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                Handler handler = this.f45170n;
                handler.removeMessages(12);
                Iterator it = this.f45166j.keySet().iterator();
                while (it.hasNext()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, (C5946b) it.next()), this.f45157a);
                }
                return true;
            case 2:
                android.support.v4.media.session.a.a(message.obj);
                throw null;
            case 3:
                for (C5919A c5919a2 : this.f45166j.values()) {
                    c5919a2.v();
                    c5919a2.z();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C5932N c5932n = (C5932N) message.obj;
                Map map = this.f45166j;
                AbstractC5846d abstractC5846d = c5932n.f45121c;
                C5919A c5919aH = (C5919A) map.get(abstractC5846d.p());
                if (c5919aH == null) {
                    c5919aH = h(abstractC5846d);
                }
                if (!c5919aH.A() || this.f45165i.get() == c5932n.f45120b) {
                    c5919aH.r(c5932n.f45119a);
                } else {
                    c5932n.f45119a.a(f45152p);
                    c5919aH.s();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C5783b c5783b = (C5783b) message.obj;
                Iterator it2 = this.f45166j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C5919A c5919a3 = (C5919A) it2.next();
                        if (c5919a3.B() == i11) {
                            c5919a = c5919a3;
                        }
                    }
                }
                if (c5919a == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 65);
                    sb2.append("Could not find API instance ");
                    sb2.append(i11);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                } else if (c5783b.e() == 13) {
                    String strE = this.f45162f.e(c5783b.e());
                    String strF = c5783b.f();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strE).length() + 69 + String.valueOf(strF).length());
                    sb3.append("Error resolution was canceled by the user, original error message: ");
                    sb3.append(strE);
                    sb3.append(": ");
                    sb3.append(strF);
                    c5919a.H(new Status(17, sb3.toString()));
                } else {
                    c5919a.H(j(c5919a.a(), c5783b));
                }
                return true;
            case 6:
                Context context = this.f45161e;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C5948c.c((Application) context.getApplicationContext());
                    ComponentCallbacks2C5948c.b().a(new C5976v(this));
                    if (!ComponentCallbacks2C5948c.b().e(true)) {
                        this.f45157a = 300000L;
                    }
                }
                return true;
            case 7:
                h((AbstractC5846d) message.obj);
                return true;
            case 9:
                Map map2 = this.f45166j;
                if (map2.containsKey(message.obj)) {
                    ((C5919A) map2.get(message.obj)).w();
                }
                return true;
            case 10:
                Set set = this.f45169m;
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    C5919A c5919a4 = (C5919A) this.f45166j.remove((C5946b) it3.next());
                    if (c5919a4 != null) {
                        c5919a4.s();
                    }
                }
                set.clear();
                return true;
            case 11:
                Map map3 = this.f45166j;
                if (map3.containsKey(message.obj)) {
                    ((C5919A) map3.get(message.obj)).x();
                }
                return true;
            case 12:
                Map map4 = this.f45166j;
                if (map4.containsKey(message.obj)) {
                    ((C5919A) map4.get(message.obj)).y();
                }
                return true;
            case 14:
                android.support.v4.media.session.a.a(message.obj);
                throw null;
            case 15:
                C5920B c5920b = (C5920B) message.obj;
                Map map5 = this.f45166j;
                if (map5.containsKey(c5920b.a())) {
                    ((C5919A) map5.get(c5920b.a())).I(c5920b);
                }
                return true;
            case 16:
                C5920B c5920b2 = (C5920B) message.obj;
                Map map6 = this.f45166j;
                if (map6.containsKey(c5920b2.a())) {
                    ((C5919A) map6.get(c5920b2.a())).J(c5920b2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                C5930L c5930l = (C5930L) message.obj;
                long j10 = c5930l.f45117c;
                if (j10 == 0) {
                    l().e(new C6060o(c5930l.f45116b, Arrays.asList(c5930l.f45115a)));
                } else {
                    C6060o c6060o = this.f45159c;
                    if (c6060o != null) {
                        List listE = c6060o.e();
                        if (c6060o.d() != c5930l.f45116b || (listE != null && listE.size() >= c5930l.f45118d)) {
                            this.f45170n.removeMessages(17);
                            k();
                        } else {
                            this.f45159c.f(c5930l.f45115a);
                        }
                    }
                    if (this.f45159c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c5930l.f45115a);
                        this.f45159c = new C6060o(c5930l.f45116b, arrayList);
                        Handler handler2 = this.f45170n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j10);
                    }
                }
                return true;
            case 19:
                this.f45158b = false;
                return true;
            default:
                StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 20);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
    }

    public final void i(C2878l c2878l, int i10, AbstractC5846d abstractC5846d) {
        C5929K c5929kB;
        if (i10 == 0 || (c5929kB = C5929K.b(this, i10, abstractC5846d.p())) == null) {
            return;
        }
        Task taskA = c2878l.a();
        final Handler handler = this.f45170n;
        Objects.requireNonNull(handler);
        taskA.c(new Executor() { // from class: u6.F
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, c5929kB);
    }

    public final void k() {
        C6060o c6060o = this.f45159c;
        if (c6060o != null) {
            if (c6060o.d() > 0 || u()) {
                l().e(c6060o);
            }
            this.f45159c = null;
        }
    }

    public final InterfaceC6062q l() {
        if (this.f45160d == null) {
            this.f45160d = AbstractC6061p.a(this.f45161e);
        }
        return this.f45160d;
    }

    public final int n() {
        return this.f45164h.getAndIncrement();
    }

    public final void o(AbstractC5846d abstractC5846d) {
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(7, abstractC5846d));
    }

    public final void p(C5974t c5974t) {
        synchronized (f45154r) {
            try {
                if (this.f45167k != c5974t) {
                    this.f45167k = c5974t;
                    this.f45168l.clear();
                }
                this.f45168l.addAll(c5974t.u());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(C5974t c5974t) {
        synchronized (f45154r) {
            try {
                if (this.f45167k == c5974t) {
                    this.f45167k = null;
                    this.f45168l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5919A r(C5946b c5946b) {
        return (C5919A) this.f45166j.get(c5946b);
    }

    public final void s() {
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void t(AbstractC5846d abstractC5846d, int i10, AbstractC5970p abstractC5970p, C2878l c2878l, InterfaceC5969o interfaceC5969o) {
        i(c2878l, abstractC5970p.e(), abstractC5846d);
        C5932N c5932n = new C5932N(new C5943Z(i10, abstractC5970p, c2878l, interfaceC5969o), this.f45165i.get(), abstractC5846d);
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(4, c5932n));
    }

    public final boolean u() {
        if (this.f45158b) {
            return false;
        }
        C6058m c6058mA = C6057l.b().a();
        if (c6058mA != null && !c6058mA.f()) {
            return false;
        }
        int iB = this.f45163g.b(this.f45161e, 203400000);
        return iB == -1 || iB == 0;
    }

    public final Task v(AbstractC5846d abstractC5846d, AbstractC5966l abstractC5966l, AbstractC5972r abstractC5972r, Runnable runnable) {
        C2878l c2878l = new C2878l();
        i(c2878l, abstractC5966l.f(), abstractC5846d);
        C5932N c5932n = new C5932N(new C5942Y(new C5933O(abstractC5966l, abstractC5972r, runnable), c2878l), this.f45165i.get(), abstractC5846d);
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(8, c5932n));
        return c2878l.a();
    }

    public final Task w(AbstractC5846d abstractC5846d, C5960i.a aVar, int i10) {
        C2878l c2878l = new C2878l();
        i(c2878l, i10, abstractC5846d);
        C5932N c5932n = new C5932N(new C5945a0(aVar, c2878l), this.f45165i.get(), abstractC5846d);
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(13, c5932n));
        return c2878l.a();
    }

    public final boolean x(C5783b c5783b, int i10) {
        return this.f45162f.s(this.f45161e, c5783b, i10);
    }

    public final void y(C5783b c5783b, int i10) {
        if (x(c5783b, i10)) {
            return;
        }
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c5783b));
    }

    public final void z(C6054i c6054i, int i10, long j10, int i11) {
        C5930L c5930l = new C5930L(c6054i, i10, j10, i11);
        Handler handler = this.f45170n;
        handler.sendMessage(handler.obtainMessage(18, c5930l));
    }
}
