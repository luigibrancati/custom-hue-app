package D;

import B0.c;
import E.InterfaceC0802n;
import L.InterfaceC1099g0;
import O.n;
import java.util.concurrent.Executor;
import w.C6107a;
import x.C6266v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6266v f1421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f1422d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.a f1425g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1419a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1420b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1423e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C6107a.C0631a f1424f = new C6107a.C0631a();

    public g(C6266v c6266v, Executor executor) {
        this.f1421c = c6266v;
        this.f1422d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final c.a aVar) {
        gVar.f1422d.execute(new Runnable() { // from class: D.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f1413a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final c.a aVar) {
        gVar.f1422d.execute(new Runnable() { // from class: D.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1410a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public O7.e g(l lVar) {
        h(lVar);
        return n.s(B0.c.a(new c.InterfaceC0018c() { // from class: D.d
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return g.a(this.f1415a, aVar);
            }
        }));
    }

    public final void h(l lVar) {
        synchronized (this.f1423e) {
            this.f1424f.d(lVar);
        }
    }

    public void i(C6107a.C0631a c0631a) {
        synchronized (this.f1423e) {
            c0631a.e(this.f1424f.a(), InterfaceC1099g0.c.ALWAYS_OVERRIDE);
        }
    }

    public O7.e j() {
        k();
        return n.s(B0.c.a(new c.InterfaceC0018c() { // from class: D.f
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return g.b(this.f1418a, aVar);
            }
        }));
    }

    public final void k() {
        synchronized (this.f1423e) {
            this.f1424f = new C6107a.C0631a();
        }
    }

    public final void l() {
        c.a aVar = this.f1425g;
        if (aVar != null) {
            aVar.c(null);
            this.f1425g = null;
        }
    }

    public final void m(Exception exc) {
        c.a aVar = this.f1425g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f1425g = null;
        }
    }

    public C6107a n() {
        C6107a c6107aC;
        synchronized (this.f1423e) {
            c6107aC = this.f1424f.c();
        }
        return c6107aC;
    }

    public void o(final boolean z10) {
        this.f1422d.execute(new Runnable() { // from class: D.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1416a.p(z10);
            }
        });
    }

    public final void p(boolean z10) {
        if (this.f1419a == z10) {
            return;
        }
        this.f1419a = z10;
        if (!z10) {
            m(new InterfaceC0802n.a("The camera control has became inactive."));
        } else if (this.f1420b) {
            r();
        }
    }

    public final void q(c.a aVar) {
        this.f1420b = true;
        m(new InterfaceC0802n.a("Camera2CameraControl was updated with new options."));
        this.f1425g = aVar;
        if (this.f1419a) {
            r();
        }
    }

    public final void r() {
        this.f1421c.n0().b(new Runnable() { // from class: D.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f1412a.l();
            }
        }, this.f1422d);
        this.f1420b = false;
    }
}
