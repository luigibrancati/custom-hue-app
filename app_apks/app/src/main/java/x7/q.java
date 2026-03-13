package x7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map f47500n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f47502b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f47508h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f47512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f47513m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f47504d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f47505e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f47506f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f47510j = new IBinder.DeathRecipient() { // from class: x7.h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            q.j(this.f47489a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f47511k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47503c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f47509i = new WeakReference(null);

    public q(Context context, f fVar, String str, Intent intent, w7.i iVar, l lVar) {
        this.f47501a = context;
        this.f47502b = fVar;
        this.f47508h = intent;
    }

    public static /* synthetic */ void j(q qVar) {
        qVar.f47502b.c("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.a.a(qVar.f47509i.get());
        qVar.f47502b.c("%s : Binder has died.", qVar.f47503c);
        Iterator it = qVar.f47504d.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(qVar.v());
        }
        qVar.f47504d.clear();
        synchronized (qVar.f47506f) {
            qVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final q qVar, final C2878l c2878l) {
        qVar.f47505e.add(c2878l);
        c2878l.a().b(new InterfaceC2872f() { // from class: x7.i
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                this.f47490a.t(c2878l, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(q qVar, g gVar) {
        if (qVar.f47513m != null || qVar.f47507g) {
            if (!qVar.f47507g) {
                gVar.run();
                return;
            } else {
                qVar.f47502b.c("Waiting to bind to the service.", new Object[0]);
                qVar.f47504d.add(gVar);
                return;
            }
        }
        qVar.f47502b.c("Initiate binding to the service.", new Object[0]);
        qVar.f47504d.add(gVar);
        o oVar = new o(qVar, null);
        qVar.f47512l = oVar;
        qVar.f47507g = true;
        if (qVar.f47501a.bindService(qVar.f47508h, oVar, 1)) {
            return;
        }
        qVar.f47502b.c("Failed to bind to the service.", new Object[0]);
        qVar.f47507g = false;
        Iterator it = qVar.f47504d.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(new r());
        }
        qVar.f47504d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(q qVar) {
        qVar.f47502b.c("linkToDeath", new Object[0]);
        try {
            qVar.f47513m.asBinder().linkToDeath(qVar.f47510j, 0);
        } catch (RemoteException e10) {
            qVar.f47502b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(q qVar) {
        qVar.f47502b.c("unlinkToDeath", new Object[0]);
        qVar.f47513m.asBinder().unlinkToDeath(qVar.f47510j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f47500n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f47503c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f47503c, 10);
                    handlerThread.start();
                    map.put(this.f47503c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f47503c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f47513m;
    }

    public final void s(g gVar, C2878l c2878l) {
        c().post(new j(this, gVar.b(), c2878l, gVar));
    }

    public final /* synthetic */ void t(C2878l c2878l, Task task) {
        synchronized (this.f47506f) {
            this.f47505e.remove(c2878l);
        }
    }

    public final void u(C2878l c2878l) {
        synchronized (this.f47506f) {
            this.f47505e.remove(c2878l);
        }
        c().post(new k(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f47503c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f47505e.iterator();
        while (it.hasNext()) {
            ((C2878l) it.next()).d(v());
        }
        this.f47505e.clear();
    }
}
