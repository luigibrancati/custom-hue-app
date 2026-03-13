package a0;

import E.C0805o0;
import E.F0;
import E.InterfaceC0800m;
import E.InterfaceC0802n;
import E.InterfaceC0815u;
import E.W0;
import L.I;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2757m;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC2757m, InterfaceC0800m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2758n f20465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P.f f20466c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20464a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f20467d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20468e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20469f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F0 f20470g = null;

    public c(InterfaceC2758n interfaceC2758n, P.f fVar) {
        this.f20465b = interfaceC2758n;
        this.f20466c = fVar;
        if (interfaceC2758n.getLifecycle().b().b(AbstractC2754j.b.STARTED)) {
            fVar.u();
        } else {
            fVar.F();
        }
        interfaceC2758n.getLifecycle().a(this);
    }

    public static /* synthetic */ void j(H.b bVar, F0 f02) {
        HashSet hashSet = new HashSet();
        if (bVar != null) {
            hashSet.addAll(bVar.a());
        }
        f02.d().accept(hashSet);
    }

    @Override // E.InterfaceC0800m
    public InterfaceC0802n a() {
        return this.f20466c.a();
    }

    @Override // E.InterfaceC0800m
    public InterfaceC0815u b() {
        return this.f20466c.b();
    }

    public void m(final F0 f02) {
        synchronized (this.f20464a) {
            try {
                if (this.f20470g == null) {
                    this.f20470g = f02;
                } else if (f02.m()) {
                    if (!this.f20470g.m()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f20470g.k());
                    arrayList.addAll(f02.k());
                    f02.l();
                    this.f20470g = new C0805o0(arrayList, null, f02.c());
                } else {
                    if (this.f20470g.m()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f20470g = f02;
                    P.f fVar = this.f20466c;
                    fVar.d0(fVar.M());
                }
                P.f fVar2 = this.f20466c;
                f02.l();
                fVar2.k0(null);
                this.f20466c.g0(f02.c());
                this.f20466c.j0(f02.i());
                this.f20466c.i0(f02.f());
                final H.b bVarB = H.b.b(f02, (I) b());
                f02.e().execute(new Runnable() { // from class: a0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.j(bVarB, f02);
                    }
                });
                this.f20466c.m(f02.k(), bVarB);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public P.f n() {
        return this.f20466c;
    }

    @y(AbstractC2754j.a.ON_DESTROY)
    public void onDestroy(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20464a) {
            P.f fVar = this.f20466c;
            fVar.d0(fVar.M());
        }
    }

    @y(AbstractC2754j.a.ON_PAUSE)
    public void onPause(InterfaceC2758n interfaceC2758n) {
        this.f20466c.f(false);
    }

    @y(AbstractC2754j.a.ON_RESUME)
    public void onResume(InterfaceC2758n interfaceC2758n) {
        this.f20466c.f(true);
    }

    @y(AbstractC2754j.a.ON_START)
    public void onStart(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20464a) {
            try {
                if (!this.f20468e && !this.f20469f) {
                    this.f20466c.u();
                    this.f20467d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @y(AbstractC2754j.a.ON_STOP)
    public void onStop(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20464a) {
            try {
                if (!this.f20468e && !this.f20469f) {
                    this.f20466c.F();
                    this.f20467d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC2758n r() {
        InterfaceC2758n interfaceC2758n;
        synchronized (this.f20464a) {
            interfaceC2758n = this.f20465b;
        }
        return interfaceC2758n;
    }

    public List s() {
        List listUnmodifiableList;
        synchronized (this.f20464a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f20466c.M());
        }
        return listUnmodifiableList;
    }

    public boolean t(W0 w02) {
        boolean zContains;
        synchronized (this.f20464a) {
            zContains = this.f20466c.M().contains(w02);
        }
        return zContains;
    }

    public boolean u() {
        boolean zM;
        synchronized (this.f20464a) {
            F0 f02 = this.f20470g;
            zM = f02 == null ? false : f02.m();
        }
        return zM;
    }

    public void v() {
        synchronized (this.f20464a) {
            try {
                if (this.f20468e) {
                    return;
                }
                onStop(this.f20465b);
                this.f20468e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w() {
        synchronized (this.f20464a) {
            P.f fVar = this.f20466c;
            fVar.d0(fVar.M());
            this.f20470g = null;
        }
    }

    public void x() {
        synchronized (this.f20464a) {
            try {
                if (this.f20468e) {
                    this.f20468e = false;
                    if (this.f20465b.getLifecycle().b().b(AbstractC2754j.b.STARTED)) {
                        onStart(this.f20465b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
