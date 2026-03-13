package U;

import B0.c;
import E.J0;
import E.V0;
import L.AbstractC1109l0;
import L.e1;
import U.L;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f16448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f16450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f16453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16455i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V0 f16457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f16458l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16456j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f16459m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16460n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f16461o = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC1109l0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final O7.e f16462o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public c.a f16463p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public AbstractC1109l0 f16464q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public O f16465r;

        public a(Size size, int i10) {
            super(size, i10);
            this.f16462o = B0.c.a(new c.InterfaceC0018c() { // from class: U.J
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return L.a.r(this.f16445a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            O o10 = aVar.f16465r;
            if (o10 != null) {
                o10.g();
            }
            if (aVar.f16464q == null) {
                aVar.f16463p.d();
            }
            aVar.f16464q = null;
        }

        public static /* synthetic */ Object r(a aVar, c.a aVar2) {
            aVar.f16463p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // L.AbstractC1109l0
        public void d() {
            super.d();
            M.x.e(new Runnable() { // from class: U.I
                @Override // java.lang.Runnable
                public final void run() {
                    L.a.q(this.f16444a);
                }
            });
        }

        @Override // L.AbstractC1109l0
        public O7.e o() {
            return this.f16462o;
        }

        public boolean s() {
            M.x.b();
            return this.f16464q == null && !m();
        }

        public void t(O o10) {
            X0.h.j(this.f16465r == null, "Consumer can only be linked once.");
            this.f16465r = o10;
        }

        public boolean u(final AbstractC1109l0 abstractC1109l0, Runnable runnable) {
            M.x.b();
            X0.h.g(abstractC1109l0);
            AbstractC1109l0 abstractC1109l02 = this.f16464q;
            if (abstractC1109l02 == abstractC1109l0) {
                return false;
            }
            X0.h.j(abstractC1109l02 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            X0.h.b(h().equals(abstractC1109l0.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), abstractC1109l0.h()));
            X0.h.b(i() == abstractC1109l0.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(abstractC1109l0.i())));
            X0.h.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f16464q = abstractC1109l0;
            O.n.t(abstractC1109l0.j(), this.f16463p);
            abstractC1109l0.l();
            k().b(new Runnable() { // from class: U.K
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC1109l0.e();
                }
            }, N.a.a());
            abstractC1109l0.f().b(runnable, N.a.d());
            return true;
        }
    }

    public L(int i10, int i11, e1 e1Var, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f16452f = i10;
        this.f16447a = i11;
        this.f16453g = e1Var;
        this.f16448b = matrix;
        this.f16449c = z10;
        this.f16450d = rect;
        this.f16455i = i12;
        this.f16454h = i13;
        this.f16451e = z11;
        this.f16458l = new a(e1Var.f(), i11);
    }

    public static /* synthetic */ void a(final L l10) {
        l10.getClass();
        N.a.d().execute(new Runnable() { // from class: U.G
            @Override // java.lang.Runnable
            public final void run() {
                L.b(this.f16442a);
            }
        });
    }

    public static /* synthetic */ void b(L l10) {
        if (l10.f16460n) {
            return;
        }
        l10.u();
    }

    public static /* synthetic */ void c(L l10, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (l10.f16455i != i10) {
            l10.f16455i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (l10.f16454h != i11) {
            l10.f16454h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            l10.w();
        }
    }

    public static /* synthetic */ O7.e d(L l10, final a aVar, int i10, J0.a aVar2, J0.a aVar3, Surface surface) {
        l10.getClass();
        X0.h.g(surface);
        try {
            aVar.l();
            O o10 = new O(surface, l10.s(), i10, l10.f16453g.f(), aVar2, aVar3, l10.f16448b);
            o10.f().b(new Runnable() { // from class: U.H
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, N.a.a());
            aVar.t(o10);
            return O.n.p(o10);
        } catch (AbstractC1109l0.a e10) {
            return O.n.n(e10);
        }
    }

    public void e(Runnable runnable) {
        M.x.b();
        h();
        this.f16459m.add(runnable);
    }

    public void f(X0.a aVar) {
        X0.h.g(aVar);
        this.f16461o.add(aVar);
    }

    public final void g() {
        X0.h.j(!this.f16456j, "Consumer can only be linked once.");
        this.f16456j = true;
    }

    public final void h() {
        X0.h.j(!this.f16460n, "Edge is already closed.");
    }

    public final void i() {
        M.x.b();
        this.f16458l.d();
        this.f16460n = true;
        this.f16461o.clear();
        this.f16459m.clear();
    }

    public O7.e j(final int i10, final J0.a aVar, final J0.a aVar2) {
        M.x.b();
        h();
        g();
        final a aVar3 = this.f16458l;
        return O.n.y(aVar3.j(), new O.a() { // from class: U.E
            @Override // O.a
            public final O7.e apply(Object obj) {
                return L.d(this.f16434a, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, N.a.d());
    }

    public V0 k(L.J j10) {
        return l(j10, true);
    }

    public V0 l(L.J j10, boolean z10) {
        M.x.b();
        h();
        V0 v02 = new V0(this.f16453g.f(), j10, z10, this.f16453g.b(), this.f16453g.g(), this.f16453g.c(), new Runnable() { // from class: U.B
            @Override // java.lang.Runnable
            public final void run() {
                L.a(this.f16431a);
            }
        });
        try {
            final AbstractC1109l0 abstractC1109l0L = v02.l();
            a aVar = this.f16458l;
            Objects.requireNonNull(aVar);
            if (aVar.u(abstractC1109l0L, new C(aVar))) {
                O7.e eVarK = aVar.k();
                Objects.requireNonNull(abstractC1109l0L);
                eVarK.b(new Runnable() { // from class: U.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC1109l0L.d();
                    }
                }, N.a.a());
            }
            this.f16457k = v02;
            w();
            return v02;
        } catch (AbstractC1109l0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            v02.u();
            throw e11;
        }
    }

    public final void m() {
        M.x.b();
        h();
        this.f16458l.d();
    }

    public Rect n() {
        return this.f16450d;
    }

    public AbstractC1109l0 o() {
        M.x.b();
        h();
        g();
        return this.f16458l;
    }

    public int p() {
        return this.f16455i;
    }

    public Matrix q() {
        return this.f16448b;
    }

    public e1 r() {
        return this.f16453g;
    }

    public int s() {
        return this.f16452f;
    }

    public boolean t() {
        return this.f16449c;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f16452f + ", format=" + this.f16447a + ", resolution=" + this.f16453g.f() + ", cropRect=" + this.f16450d + ", rotationDegrees=" + this.f16455i + ", mirroring=" + this.f16451e + ", sensorToBufferTransform= " + this.f16448b + ", rotationInTransform= " + M.y.f(this.f16448b) + ", isMirrorInTransform= " + M.y.k(this.f16448b) + ", isClosed=" + this.f16460n + '}';
    }

    public void u() {
        M.x.b();
        h();
        if (this.f16458l.s()) {
            return;
        }
        this.f16456j = false;
        this.f16458l.d();
        this.f16458l = new a(this.f16453g.f(), this.f16447a);
        Iterator it = this.f16459m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public boolean v() {
        return this.f16451e;
    }

    public final void w() {
        M.x.b();
        V0.h hVarG = V0.h.g(this.f16450d, this.f16455i, this.f16454h, t(), this.f16448b, this.f16451e);
        V0 v02 = this.f16457k;
        if (v02 != null) {
            v02.t(hVarG);
        }
        Iterator it = this.f16461o.iterator();
        while (it.hasNext()) {
            ((X0.a) it.next()).accept(hVarG);
        }
    }

    public void x(AbstractC1109l0 abstractC1109l0) {
        M.x.b();
        h();
        a aVar = this.f16458l;
        Objects.requireNonNull(aVar);
        aVar.u(abstractC1109l0, new C(aVar));
    }

    public void y(final int i10, final int i11) {
        M.x.e(new Runnable() { // from class: U.F
            @Override // java.lang.Runnable
            public final void run() {
                L.c(this.f16439a, i10, i11);
            }
        });
    }
}
