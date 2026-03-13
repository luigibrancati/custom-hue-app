package h8;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import b0.C2777a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o8.C5233c;
import o8.C5236f;
import o8.n;
import o8.w;
import p8.EnumC5407A;
import t9.AbstractC5861c;
import t9.C5860b;
import u6.ComponentCallbacks2C5948c;
import v6.AbstractC6055j;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: h8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4288f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f36294k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f36295l = new C2777a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f36298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o8.n f36299d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f36302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O8.b f36303h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f36300e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f36301f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f36304i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f36305j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h8.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: renamed from: h8.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements ComponentCallbacks2C5948c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference f36306a = new AtomicReference();

        public static void c(Context context) {
            if (B6.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f36306a.get() == null) {
                    b bVar = new b();
                    if (T1.e.a(f36306a, null, bVar)) {
                        ComponentCallbacks2C5948c.c(application);
                        ComponentCallbacks2C5948c.b().a(bVar);
                    }
                }
            }
        }

        @Override // u6.ComponentCallbacks2C5948c.a
        public void a(boolean z10) {
            synchronized (C4288f.f36294k) {
                try {
                    for (C4288f c4288f : new ArrayList(C4288f.f36295l.values())) {
                        if (c4288f.f36300e.get()) {
                            c4288f.A(z10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h8.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static AtomicReference f36307b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f36308a;

        public c(Context context) {
            this.f36308a = context;
        }

        public static void b(Context context) {
            if (f36307b.get() == null) {
                c cVar = new c(context);
                if (T1.e.a(f36307b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f36308a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C4288f.f36294k) {
                try {
                    Iterator it = C4288f.f36295l.values().iterator();
                    while (it.hasNext()) {
                        ((C4288f) it.next()).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public C4288f(final Context context, String str, n nVar) {
        this.f36296a = (Context) AbstractC6056k.l(context);
        this.f36297b = AbstractC6056k.f(str);
        this.f36298c = (n) AbstractC6056k.l(nVar);
        o oVarB = FirebaseInitProvider.b();
        AbstractC5861c.b("Firebase");
        AbstractC5861c.b("ComponentDiscovery");
        List listB = C5236f.c(context, ComponentDiscoveryService.class).b();
        AbstractC5861c.a();
        AbstractC5861c.b("Runtime");
        n.b bVarF = o8.n.l(EnumC5407A.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C5233c.q(context, Context.class, new Class[0])).b(C5233c.q(this, C4288f.class, new Class[0])).b(C5233c.q(nVar, n.class, new Class[0])).f(new C5860b());
        if (U0.n.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C5233c.q(oVarB, o.class, new Class[0]));
        }
        o8.n nVarE = bVarF.e();
        this.f36299d = nVarE;
        AbstractC5861c.a();
        this.f36302g = new w(new O8.b() { // from class: h8.d
            @Override // O8.b
            public final Object get() {
                return C4288f.b(this.f36291a, context);
            }
        });
        this.f36303h = nVarE.e(M8.f.class);
        g(new a() { // from class: h8.e
            @Override // h8.C4288f.a
            public final void a(boolean z10) {
                C4288f.a(this.f36293a, z10);
            }
        });
        AbstractC5861c.a();
    }

    public static /* synthetic */ void a(C4288f c4288f, boolean z10) {
        if (z10) {
            c4288f.getClass();
        } else {
            ((M8.f) c4288f.f36303h.get()).h();
        }
    }

    public static /* synthetic */ T8.a b(C4288f c4288f, Context context) {
        return new T8.a(context, c4288f.s(), (L8.c) c4288f.f36299d.get(L8.c.class));
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f36294k) {
            try {
                Iterator it = f36295l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4288f) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f36294k) {
            arrayList = new ArrayList(f36295l.values());
        }
        return arrayList;
    }

    public static C4288f o() {
        C4288f c4288f;
        synchronized (f36294k) {
            try {
                c4288f = (C4288f) f36295l.get("[DEFAULT]");
                if (c4288f == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + B6.m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((M8.f) c4288f.f36303h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4288f;
    }

    public static C4288f p(String str) {
        C4288f c4288f;
        String str2;
        synchronized (f36294k) {
            try {
                c4288f = (C4288f) f36295l.get(z(str));
                if (c4288f == null) {
                    List listL = l();
                    if (listL.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listL);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((M8.f) c4288f.f36303h.get()).h();
            } finally {
            }
        }
        return c4288f;
    }

    public static C4288f u(Context context) {
        synchronized (f36294k) {
            try {
                if (f36295l.containsKey("[DEFAULT]")) {
                    return o();
                }
                n nVarA = n.a(context);
                if (nVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, nVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C4288f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static C4288f w(Context context, n nVar, String str) {
        C4288f c4288f;
        b.c(context);
        String strZ = z(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f36294k) {
            Map map = f36295l;
            AbstractC6056k.q(!map.containsKey(strZ), "FirebaseApp name " + strZ + " already exists!");
            AbstractC6056k.m(context, "Application context cannot be null.");
            c4288f = new C4288f(context, strZ, nVar);
            map.put(strZ, c4288f);
        }
        c4288f.t();
        return c4288f;
    }

    public static String z(String str) {
        return str.trim();
    }

    public final void A(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f36304i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    public final void B() {
        Iterator it = this.f36305j.iterator();
        while (it.hasNext()) {
            ((InterfaceC4289g) it.next()).a(this.f36297b, this.f36298c);
        }
    }

    public void C(boolean z10) {
        i();
        if (this.f36300e.compareAndSet(!z10, z10)) {
            boolean zD = ComponentCallbacks2C5948c.b().d();
            if (z10 && zD) {
                A(true);
            } else {
                if (z10 || !zD) {
                    return;
                }
                A(false);
            }
        }
    }

    public void D(Boolean bool) {
        i();
        ((T8.a) this.f36302g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4288f) {
            return this.f36297b.equals(((C4288f) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f36300e.get() && ComponentCallbacks2C5948c.b().d()) {
            aVar.a(true);
        }
        this.f36304i.add(aVar);
    }

    public void h(InterfaceC4289g interfaceC4289g) {
        i();
        AbstractC6056k.l(interfaceC4289g);
        this.f36305j.add(interfaceC4289g);
    }

    public int hashCode() {
        return this.f36297b.hashCode();
    }

    public final void i() {
        AbstractC6056k.q(!this.f36301f.get(), "FirebaseApp was deleted");
    }

    public void j() {
        if (this.f36301f.compareAndSet(false, true)) {
            synchronized (f36294k) {
                f36295l.remove(this.f36297b);
            }
            B();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f36299d.get(cls);
    }

    public Context m() {
        i();
        return this.f36296a;
    }

    public String q() {
        i();
        return this.f36297b;
    }

    public n r() {
        i();
        return this.f36298c;
    }

    public String s() {
        return B6.c.a(q().getBytes(Charset.defaultCharset())) + "+" + B6.c.a(r().c().getBytes(Charset.defaultCharset()));
    }

    public final void t() {
        if (!U0.n.a(this.f36296a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f36296a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f36299d.o(y());
        ((M8.f) this.f36303h.get()).h();
    }

    public String toString() {
        return AbstractC6055j.c(this).a("name", this.f36297b).a(RRWebOptionsEvent.EVENT_TAG, this.f36298c).toString();
    }

    public boolean x() {
        i();
        return ((T8.a) this.f36302g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
