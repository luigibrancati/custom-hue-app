package K;

import B0.c;
import E.C0781c0;
import E.C0785e0;
import K.h0;
import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class U implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.a f6554b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f6557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.a f6558f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O7.e f6561i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6559g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6560h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O7.e f6555c = B0.c.a(new c.InterfaceC0018c() { // from class: K.S
        @Override // B0.c.InterfaceC0018c
        public final Object a(c.a aVar) {
            return U.i(this.f6551a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O7.e f6556d = B0.c.a(new c.InterfaceC0018c() { // from class: K.T
        @Override // B0.c.InterfaceC0018c
        public final Object a(c.a aVar) {
            return U.j(this.f6552a, aVar);
        }
    });

    public U(h0 h0Var, h0.a aVar) {
        this.f6553a = h0Var;
        this.f6554b = aVar;
    }

    public static /* synthetic */ Object i(U u10, c.a aVar) {
        u10.f6557e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object j(U u10, c.a aVar) {
        u10.f6558f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // K.W
    public void a(C0781c0.h hVar) {
        M.x.b();
        if (this.f6559g) {
            return;
        }
        n();
        q();
        this.f6553a.w(hVar);
    }

    @Override // K.W
    public void b(C0785e0 c0785e0) {
        M.x.b();
        if (this.f6559g) {
            return;
        }
        boolean zF = this.f6553a.f();
        if (!zF) {
            r(c0785e0);
        }
        q();
        this.f6557e.f(c0785e0);
        if (zF) {
            this.f6554b.d(this.f6553a);
        }
    }

    @Override // K.W
    public void c(androidx.camera.core.d dVar) {
        M.x.b();
        if (this.f6559g) {
            dVar.close();
            return;
        }
        n();
        q();
        this.f6553a.x(dVar);
    }

    @Override // K.W
    public void d(int i10) {
        M.x.b();
        if (this.f6559g) {
            return;
        }
        this.f6553a.t(i10);
    }

    @Override // K.W
    public void e() {
        M.x.b();
        if (this.f6559g) {
            return;
        }
        if (!this.f6560h) {
            h();
        }
        this.f6557e.c(null);
    }

    @Override // K.W
    public void f(Bitmap bitmap) {
        M.x.b();
        if (this.f6559g) {
            return;
        }
        this.f6553a.v(bitmap);
    }

    @Override // K.W
    public void g(C0785e0 c0785e0) {
        M.x.b();
        if (this.f6559g) {
            return;
        }
        n();
        q();
        r(c0785e0);
    }

    @Override // K.W
    public void h() {
        M.x.b();
        if (this.f6559g || this.f6560h) {
            return;
        }
        this.f6560h = true;
        C0781c0.e eVarI = this.f6553a.i();
        if (eVarI != null) {
            eVarI.b();
        }
        this.f6553a.k();
    }

    @Override // K.W
    public boolean isAborted() {
        return this.f6559g;
    }

    public final void k(C0785e0 c0785e0) {
        M.x.b();
        this.f6559g = true;
        O7.e eVar = this.f6561i;
        Objects.requireNonNull(eVar);
        eVar.cancel(true);
        this.f6557e.f(c0785e0);
        this.f6558f.c(null);
    }

    public void l(C0785e0 c0785e0) {
        M.x.b();
        if (this.f6556d.isDone()) {
            return;
        }
        k(c0785e0);
        r(c0785e0);
    }

    public void m() {
        M.x.b();
        if (this.f6556d.isDone()) {
            return;
        }
        k(new C0785e0(3, "The request is aborted silently and retried.", null));
        this.f6554b.d(this.f6553a);
    }

    public final void n() {
        X0.h.j(this.f6555c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public O7.e o() {
        M.x.b();
        return this.f6555c;
    }

    public O7.e p() {
        M.x.b();
        return this.f6556d;
    }

    public final void q() {
        if (!this.f6553a.r() || this.f6553a.q()) {
            if (!this.f6553a.r()) {
                X0.h.j(!this.f6556d.isDone(), "The callback can only complete once.");
            }
            this.f6558f.c(null);
        }
    }

    public final void r(C0785e0 c0785e0) {
        M.x.b();
        this.f6553a.u(c0785e0);
    }

    public void s(O7.e eVar) {
        M.x.b();
        X0.h.j(this.f6561i == null, "CaptureRequestFuture can only be set once.");
        this.f6561i = eVar;
    }
}
