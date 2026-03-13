package v6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import s6.C5783b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T implements ServiceConnection, W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f45802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f45805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f45806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f45807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V f45808g;

    public T(V v10, S s10) {
        Objects.requireNonNull(v10);
        this.f45808g = v10;
        this.f45806e = s10;
        this.f45802a = new HashMap();
        this.f45803b = 2;
    }

    public final void a(String str) {
        S s10 = this.f45806e;
        V v10 = this.f45808g;
        v10.h().removeMessages(1, s10);
        v10.i().c(v10.g(), this);
        this.f45804c = false;
        this.f45803b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f45802a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f45802a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f45804c;
    }

    public final int e() {
        return this.f45803b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f45802a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f45802a.isEmpty();
    }

    public final IBinder h() {
        return this.f45805d;
    }

    public final ComponentName i() {
        return this.f45807f;
    }

    public final /* synthetic */ C5783b j(String str, Executor executor) {
        try {
            Intent intentA = J.a(this.f45808g.g(), this.f45806e);
            this.f45803b = 3;
            StrictMode.VmPolicy vmPolicyA = B6.s.a();
            try {
                V v10 = this.f45808g;
                A6.a aVarI = v10.i();
                Context contextG = v10.g();
                S s10 = this.f45806e;
                boolean zD = aVarI.d(contextG, str, intentA, this, 4225, executor);
                this.f45804c = zD;
                if (zD) {
                    v10.h().sendMessageDelayed(v10.h().obtainMessage(1, s10), v10.j());
                    C5783b c5783b = C5783b.f44145f;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return c5783b;
                }
                this.f45803b = 2;
                try {
                    v10.i().c(v10.g(), this);
                } catch (IllegalArgumentException unused) {
                }
                C5783b c5783b2 = new C5783b(16);
                StrictMode.setVmPolicy(vmPolicyA);
                return c5783b2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicyA);
                throw th;
            }
        } catch (H e10) {
            return e10.f45787a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        V v10 = this.f45808g;
        synchronized (v10.f()) {
            try {
                v10.h().removeMessages(1, this.f45806e);
                this.f45805d = iBinder;
                this.f45807f = componentName;
                Iterator it = this.f45802a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f45803b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        V v10 = this.f45808g;
        synchronized (v10.f()) {
            try {
                v10.h().removeMessages(1, this.f45806e);
                this.f45805d = null;
                this.f45807f = componentName;
                Iterator it = this.f45802a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f45803b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
