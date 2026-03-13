package androidx.work.impl.foreground;

import I3.AbstractC0890u;
import I3.C0880j;
import J3.InterfaceC0897e;
import J3.g0;
import M3.b;
import M3.g;
import M3.j;
import M3.k;
import Q3.C1877w;
import Q3.I;
import Q3.q0;
import Rd.InterfaceC2166z0;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements g, InterfaceC0897e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f24801k = AbstractC0890u.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f24803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3.b f24804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24805d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1877w f24806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f24807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f24808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f24809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f24810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f24811j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC0323a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24812a;

        public RunnableC0323a(String str) {
            this.f24812a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            I iG = a.this.f24803b.n().g(this.f24812a);
            if (iG == null || !iG.m()) {
                return;
            }
            synchronized (a.this.f24805d) {
                a.this.f24808g.put(q0.a(iG), iG);
                a aVar = a.this;
                a.this.f24809h.put(q0.a(iG), k.c(aVar.f24810i, iG, aVar.f24804c.b(), a.this));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(int i10, Notification notification);

        void b(int i10);

        void c(int i10, int i11, Notification notification);

        void d(int i10);
    }

    public a(Context context) {
        this.f24802a = context;
        g0 g0VarL = g0.l(context);
        this.f24803b = g0VarL;
        this.f24804c = g0VarL.r();
        this.f24806e = null;
        this.f24807f = new LinkedHashMap();
        this.f24809h = new HashMap();
        this.f24808g = new HashMap();
        this.f24810i = new j(this.f24803b.p());
        this.f24803b.n().e(this);
    }

    public static Intent e(Context context, C1877w c1877w, C0880j c0880j) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c0880j.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0880j.a());
        intent.putExtra("KEY_NOTIFICATION", c0880j.b());
        intent.putExtra("KEY_WORKSPEC_ID", c1877w.b());
        intent.putExtra("KEY_GENERATION", c1877w.a());
        return intent;
    }

    public static Intent f(Context context, C1877w c1877w, C0880j c0880j) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c1877w.b());
        intent.putExtra("KEY_GENERATION", c1877w.a());
        intent.putExtra("KEY_NOTIFICATION_ID", c0880j.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0880j.a());
        intent.putExtra("KEY_NOTIFICATION", c0880j.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // M3.g
    public void b(I i10, M3.b bVar) {
        if (bVar instanceof b.C0138b) {
            String str = i10.f13588a;
            AbstractC0890u.e().a(f24801k, "Constraints unmet for WorkSpec " + str);
            this.f24803b.v(q0.a(i10), ((b.C0138b) bVar).a());
        }
    }

    @Override // J3.InterfaceC0897e
    public void c(C1877w c1877w, boolean z10) {
        Map.Entry entry;
        synchronized (this.f24805d) {
            try {
                InterfaceC2166z0 interfaceC2166z0 = ((I) this.f24808g.remove(c1877w)) != null ? (InterfaceC2166z0) this.f24809h.remove(c1877w) : null;
                if (interfaceC2166z0 != null) {
                    interfaceC2166z0.a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0880j c0880j = (C0880j) this.f24807f.remove(c1877w);
        if (c1877w.equals(this.f24806e)) {
            if (this.f24807f.size() > 0) {
                Iterator it = this.f24807f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f24806e = (C1877w) entry.getKey();
                if (this.f24811j != null) {
                    C0880j c0880j2 = (C0880j) entry.getValue();
                    this.f24811j.c(c0880j2.c(), c0880j2.a(), c0880j2.b());
                    this.f24811j.d(c0880j2.c());
                }
            } else {
                this.f24806e = null;
            }
        }
        b bVar = this.f24811j;
        if (c0880j == null || bVar == null) {
            return;
        }
        AbstractC0890u.e().a(f24801k, "Removing Notification (id: " + c0880j.c() + ", workSpecId: " + c1877w + ", notificationType: " + c0880j.a());
        bVar.d(c0880j.c());
    }

    public final void h(Intent intent) {
        AbstractC0890u.e().f(f24801k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f24803b.b(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        if (this.f24811j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C1877w c1877w = new C1877w(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC0890u.e().a(f24801k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C0880j c0880j = new C0880j(intExtra, notification, intExtra2);
        this.f24807f.put(c1877w, c0880j);
        C0880j c0880j2 = (C0880j) this.f24807f.get(this.f24806e);
        if (c0880j2 == null) {
            this.f24806e = c1877w;
        } else {
            this.f24811j.a(intExtra, notification);
            Iterator it = this.f24807f.entrySet().iterator();
            while (it.hasNext()) {
                iA |= ((C0880j) ((Map.Entry) it.next()).getValue()).a();
            }
            c0880j = new C0880j(c0880j2.c(), c0880j2.b(), iA);
        }
        this.f24811j.c(c0880j.c(), c0880j.a(), c0880j.b());
    }

    public final void j(Intent intent) {
        AbstractC0890u.e().f(f24801k, "Started foreground service " + intent);
        this.f24804c.d(new RunnableC0323a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent, int i10) {
        AbstractC0890u.e().f(f24801k, "Stopping foreground service");
        b bVar = this.f24811j;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public void l() {
        this.f24811j = null;
        synchronized (this.f24805d) {
            try {
                Iterator it = this.f24809h.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC2166z0) it.next()).a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24803b.n().m(this);
    }

    public void m(Intent intent, int i10) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent, i10);
        }
    }

    public void n(int i10, int i11) {
        AbstractC0890u.e().f(f24801k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry entry : this.f24807f.entrySet()) {
            if (((C0880j) entry.getValue()).a() == i11) {
                this.f24803b.v((C1877w) entry.getKey(), -128);
            }
        }
        b bVar = this.f24811j;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public void o(b bVar) {
        if (this.f24811j != null) {
            AbstractC0890u.e().c(f24801k, "A callback already exists.");
        } else {
            this.f24811j = bVar;
        }
    }
}
