package B7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import v7.InterfaceC6071a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f715d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z f716e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f717f = false;

    public a0(c0 c0Var, IntentFilter intentFilter, Context context) {
        this.f712a = c0Var;
        this.f713b = intentFilter;
        this.f714c = E.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(InterfaceC6071a interfaceC6071a) {
        this.f712a.c("registerListener", new Object[0]);
        I.a(interfaceC6071a, "Registered Play Core listener should not be null.");
        this.f715d.add(interfaceC6071a);
        f();
    }

    public final synchronized void c(boolean z10) {
        this.f717f = true;
        f();
    }

    public final synchronized void d(InterfaceC6071a interfaceC6071a) {
        this.f712a.c("unregisterListener", new Object[0]);
        I.a(interfaceC6071a, "Unregistered Play Core listener should not be null.");
        this.f715d.remove(interfaceC6071a);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f715d).iterator();
        while (it.hasNext()) {
            ((InterfaceC6071a) it.next()).onStateUpdate(obj);
        }
    }

    public final void f() {
        Z z10;
        if ((this.f717f || !this.f715d.isEmpty()) && this.f716e == null) {
            Z z11 = new Z(this, null);
            this.f716e = z11;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f714c.registerReceiver(z11, this.f713b, 2);
            } else {
                this.f714c.registerReceiver(z11, this.f713b);
            }
        }
        if (this.f717f || !this.f715d.isEmpty() || (z10 = this.f716e) == null) {
            return;
        }
        this.f714c.unregisterReceiver(z10);
        this.f716e = null;
    }
}
