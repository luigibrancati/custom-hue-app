package K;

import E.AbstractC0799l0;
import E.AbstractC0807p0;
import E.C0785e0;
import E.InterfaceC0797k0;
import K.C0977t;
import K.P;
import K.X;
import L.AbstractC1109l0;
import L.AbstractC1114o;
import L.AbstractC1116p;
import L.C1136z0;
import L.InterfaceC1134y0;
import U.C2272u;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: K.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0977t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.camera.core.f f6630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.camera.core.f f6631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.camera.core.f f6632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public P.a f6633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f6634f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q f6629a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E f6635g = null;

    /* JADX INFO: renamed from: K.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC1114o {
        public a() {
        }

        public static /* synthetic */ void e(a aVar) {
            Q q10 = C0977t.this.f6629a;
            if (q10 != null) {
                q10.p();
            }
        }

        @Override // L.AbstractC1114o
        public void d(int i10) {
            N.a.d().execute(new Runnable() { // from class: K.s
                @Override // java.lang.Runnable
                public final void run() {
                    C0977t.a.e(this.f6628a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K.t$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC1114o f6640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC1109l0 f6641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC1109l0 f6642d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1114o f6639a = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC1109l0 f6643e = null;

        /* JADX INFO: renamed from: K.t$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AbstractC1114o {
            public a() {
            }
        }

        public static c n(Size size, int i10, List list, boolean z10, InterfaceC0797k0 interfaceC0797k0, F f10) {
            return new C0960b(size, i10, list, z10, interfaceC0797k0, f10, new C2272u(), new C2272u());
        }

        public AbstractC1114o a() {
            return this.f6639a;
        }

        public abstract C2272u b();

        public abstract InterfaceC0797k0 c();

        public abstract int d();

        public abstract List e();

        public abstract F f();

        public AbstractC1109l0 g() {
            return this.f6643e;
        }

        public abstract C2272u h();

        public AbstractC1114o i() {
            return this.f6640b;
        }

        public AbstractC1109l0 j() {
            return this.f6642d;
        }

        public abstract Size k();

        public AbstractC1109l0 l() {
            AbstractC1109l0 abstractC1109l0 = this.f6641c;
            Objects.requireNonNull(abstractC1109l0);
            return abstractC1109l0;
        }

        public abstract boolean m();

        public void o(AbstractC1114o abstractC1114o) {
            this.f6639a = abstractC1114o;
        }

        public void p(Surface surface, Size size, int i10) {
            this.f6643e = new C1136z0(surface, size, i10);
        }

        public void q(AbstractC1114o abstractC1114o) {
            this.f6640b = abstractC1114o;
        }

        public void r(Surface surface) {
            X0.h.j(this.f6642d == null, "The secondary surface is already set.");
            this.f6642d = new C1136z0(surface, k(), d());
        }

        public void s(Surface surface) {
            X0.h.j(this.f6641c == null, "The surface is already set.");
            this.f6641c = new C1136z0(surface, k(), d());
        }
    }

    public static /* synthetic */ void a(C0977t c0977t, InterfaceC1134y0 interfaceC1134y0) {
        c0977t.getClass();
        try {
            androidx.camera.core.d dVarAcquireLatestImage = interfaceC1134y0.acquireLatestImage();
            if (dVarAcquireLatestImage != null) {
                c0977t.k(dVarAcquireLatestImage);
                return;
            }
            Q q10 = c0977t.f6629a;
            if (q10 != null) {
                c0977t.p(X.a.c(q10.e(), new C0785e0(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            Q q11 = c0977t.f6629a;
            if (q11 != null) {
                c0977t.p(X.a.c(q11.e(), new C0785e0(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    public static /* synthetic */ void b(C0977t c0977t, Q q10) {
        c0977t.l(q10);
        c0977t.f6635g.g(q10);
    }

    public static /* synthetic */ void d(androidx.camera.core.f fVar) {
        if (fVar != null) {
            fVar.i();
        }
    }

    public static /* synthetic */ void e(C0977t c0977t, InterfaceC1134y0 interfaceC1134y0) {
        c0977t.getClass();
        try {
            androidx.camera.core.d dVarAcquireLatestImage = interfaceC1134y0.acquireLatestImage();
            if (dVarAcquireLatestImage != null) {
                c0977t.m(dVarAcquireLatestImage);
            }
        } catch (IllegalStateException e10) {
            AbstractC0807p0.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    public static /* synthetic */ void f(androidx.camera.core.f fVar) {
        if (fVar != null) {
            fVar.i();
        }
    }

    public static InterfaceC1134y0 h(InterfaceC0797k0 interfaceC0797k0, int i10, int i11, int i12) {
        return interfaceC0797k0 != null ? interfaceC0797k0.a(i10, i11, i12, 4, 0L) : AbstractC0799l0.a(i10, i11, i12, 4);
    }

    public int i() {
        M.x.b();
        X0.h.j(this.f6630b != null, "The ImageReader is not initialized.");
        return this.f6630b.h();
    }

    public final void j(androidx.camera.core.d dVar) {
        Q q10;
        Q q11;
        M.x.b();
        P.a aVar = this.f6633e;
        Objects.requireNonNull(aVar);
        aVar.a().accept(P.b.c(this.f6629a, dVar));
        Q q12 = this.f6629a;
        c cVar = this.f6634f;
        boolean z10 = cVar != null && cVar.e().size() > 1;
        if (z10 && (q11 = this.f6629a) != null) {
            q11.k().s(dVar.getFormat(), true);
        }
        if (!z10 || ((q10 = this.f6629a) != null && q10.k().q())) {
            this.f6629a = null;
        }
        q12.s();
    }

    public void k(androidx.camera.core.d dVar) {
        M.x.b();
        if (this.f6629a == null) {
            AbstractC0807p0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + dVar);
            dVar.close();
            return;
        }
        if (((Integer) dVar.L0().c().d(this.f6629a.j())) != null) {
            j(dVar);
        } else {
            AbstractC0807p0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            dVar.close();
        }
    }

    public void l(Q q10) {
        M.x.b();
        X0.h.j(q10.i().size() == 1, "only one capture stage is supported.");
        X0.h.j(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f6629a = q10;
        O.n.j(q10.a(), new b(q10), N.a.a());
    }

    public final void m(androidx.camera.core.d dVar) {
        if (this.f6629a == null) {
            AbstractC0807p0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            dVar.close();
        } else {
            P.a aVar = this.f6633e;
            Objects.requireNonNull(aVar);
            aVar.d().accept(P.b.c(this.f6629a, dVar));
        }
    }

    public void n() {
        M.x.b();
        c cVar = this.f6634f;
        Objects.requireNonNull(cVar);
        androidx.camera.core.f fVar = this.f6630b;
        Objects.requireNonNull(fVar);
        o(cVar, fVar, this.f6631c, this.f6632d);
    }

    public final void o(c cVar, final androidx.camera.core.f fVar, final androidx.camera.core.f fVar2, final androidx.camera.core.f fVar3) {
        cVar.l().d();
        cVar.l().k().b(new Runnable() { // from class: K.p
            @Override // java.lang.Runnable
            public final void run() {
                fVar.i();
            }
        }, N.a.d());
        if (cVar.g() != null) {
            cVar.g().d();
            cVar.g().k().b(new Runnable() { // from class: K.q
                @Override // java.lang.Runnable
                public final void run() {
                    C0977t.f(fVar3);
                }
            }, N.a.d());
        }
        if (cVar.e().size() <= 1 || cVar.j() == null) {
            return;
        }
        cVar.j().d();
        cVar.j().k().b(new Runnable() { // from class: K.r
            @Override // java.lang.Runnable
            public final void run() {
                C0977t.d(fVar2);
            }
        }, N.a.d());
    }

    public void p(X.a aVar) {
        M.x.b();
        Q q10 = this.f6629a;
        if (q10 == null || q10.e() != aVar.b()) {
            return;
        }
        this.f6629a.n(aVar.a());
    }

    public final void q(InterfaceC1134y0 interfaceC1134y0) {
        interfaceC1134y0.d(new InterfaceC1134y0.a() { // from class: K.k
            @Override // L.InterfaceC1134y0.a
            public final void a(InterfaceC1134y0 interfaceC1134y02) {
                C0977t.a(this.f6620a, interfaceC1134y02);
            }
        }, N.a.d());
    }

    public void r(b.a aVar) {
        M.x.b();
        X0.h.j(this.f6630b != null, "The ImageReader is not initialized.");
        this.f6630b.j(aVar);
    }

    public P.a s(c cVar) {
        InterfaceC1134y0 interfaceC1134y0;
        androidx.camera.core.e eVar;
        X0.a aVar;
        AbstractC1114o abstractC1114oB;
        InterfaceC1134y0 interfaceC1134y02;
        X0.h.j(this.f6634f == null && this.f6630b == null, "CaptureNode does not support recreation yet.");
        this.f6634f = cVar;
        Size sizeK = cVar.k();
        int iD = cVar.d();
        boolean zM = cVar.m();
        AbstractC1114o aVar2 = new a();
        boolean z10 = cVar.e().size() > 1;
        if (zM) {
            cVar.c();
            E e10 = new E(h(null, sizeK.getWidth(), sizeK.getHeight(), iD));
            this.f6635g = e10;
            interfaceC1134y0 = e10;
            eVar = null;
            aVar = new X0.a() { // from class: K.m
                @Override // X0.a
                public final void accept(Object obj) {
                    C0977t.b(this.f6622a, (Q) obj);
                }
            };
            abstractC1114oB = null;
        } else {
            cVar.c();
            if (z10) {
                androidx.camera.core.e eVar2 = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), 256, 4);
                AbstractC1114o abstractC1114oB2 = AbstractC1116p.b(aVar2, eVar2.l());
                eVar = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), 32, 4);
                abstractC1114oB = AbstractC1116p.b(aVar2, eVar.l());
                aVar2 = abstractC1114oB2;
                interfaceC1134y02 = eVar2;
            } else {
                androidx.camera.core.e eVar3 = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), iD, 4);
                aVar2 = AbstractC1116p.b(aVar2, eVar3.l());
                abstractC1114oB = null;
                eVar = null;
                interfaceC1134y02 = eVar3;
            }
            aVar = new X0.a() { // from class: K.l
                @Override // X0.a
                public final void accept(Object obj) {
                    this.f6621a.l((Q) obj);
                }
            };
            interfaceC1134y0 = interfaceC1134y02;
        }
        cVar.o(aVar2);
        if (z10 && abstractC1114oB != null) {
            cVar.q(abstractC1114oB);
        }
        Surface surface = interfaceC1134y0.getSurface();
        Objects.requireNonNull(surface);
        cVar.s(surface);
        this.f6630b = new androidx.camera.core.f(interfaceC1134y0);
        q(interfaceC1134y0);
        F f10 = cVar.f();
        if (f10 != null) {
            cVar.c();
            InterfaceC1134y0 interfaceC1134y0H = h(null, f10.b().getWidth(), f10.b().getHeight(), f10.a());
            interfaceC1134y0H.d(new InterfaceC1134y0.a() { // from class: K.n
                @Override // L.InterfaceC1134y0.a
                public final void a(InterfaceC1134y0 interfaceC1134y03) {
                    C0977t.e(this.f6623a, interfaceC1134y03);
                }
            }, N.a.d());
            this.f6632d = new androidx.camera.core.f(interfaceC1134y0H);
            cVar.p(interfaceC1134y0H.getSurface(), f10.b(), f10.a());
        }
        if (z10 && eVar != null) {
            cVar.r(eVar.getSurface());
            this.f6631c = new androidx.camera.core.f(eVar);
            q(eVar);
        }
        cVar.h().a(aVar);
        cVar.b().a(new X0.a() { // from class: K.o
            @Override // X0.a
            public final void accept(Object obj) {
                this.f6624a.p((X.a) obj);
            }
        });
        P.a aVarE = P.a.e(cVar.d(), cVar.e());
        this.f6633e = aVarE;
        return aVarE;
    }

    /* JADX INFO: renamed from: K.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q f6637a;

        public b(Q q10) {
            this.f6637a = q10;
        }

        @Override // O.c
        public void a(Throwable th) {
            M.x.b();
            if (this.f6637a == C0977t.this.f6629a) {
                AbstractC0807p0.l("CaptureNode", "request aborted, id=" + C0977t.this.f6629a.e());
                if (C0977t.this.f6635g != null) {
                    C0977t.this.f6635g.h();
                }
                C0977t.this.f6629a = null;
            }
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
