package B7;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import b7.C2878l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: B7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0695c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f719l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f721b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Intent f726g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A7.p f730k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f723d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f724e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f725f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IBinder.DeathRecipient f728i = new IBinder.DeathRecipient() { // from class: B7.d0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C0695c.a(this.f732a);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f729j = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f722c = "SplitInstallService";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f727h = new WeakReference(null);

    public C0695c(Context context, c0 c0Var, String str, Intent intent, A7.p pVar, InterfaceC0694b interfaceC0694b) {
        this.f720a = context;
        this.f721b = c0Var;
        this.f726g = intent;
        this.f730k = pVar;
    }

    public static /* synthetic */ void a(C0695c c0695c) {
        c0695c.f721b.c("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.a.a(c0695c.f727h.get());
        c0695c.f721b.c("%s : Binder has died.", c0695c.f722c);
        Iterator it = c0695c.f723d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            c0695c.b();
            throw null;
        }
        c0695c.f723d.clear();
        synchronized (c0695c.f725f) {
            c0695c.c();
        }
    }

    public final RemoteException b() {
        return new RemoteException(String.valueOf(this.f722c).concat(" : Binder has died."));
    }

    public final void c() {
        Iterator it = this.f724e.iterator();
        while (it.hasNext()) {
            ((C2878l) it.next()).d(b());
        }
        this.f724e.clear();
    }
}
