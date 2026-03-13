package E;

import L.AbstractC1109l0;
import L.C1126u0;
import L.C1136z0;
import L.InterfaceC1099g0;
import L.InterfaceC1130w0;
import L.InterfaceC1132x0;
import L.a1;
import L.e1;
import L.s1;
import L.t1;
import X.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class S extends W0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final d f2831A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Boolean f2832B = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V f2834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Executor f2835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f2836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rect f2837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Matrix f2838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a1.b f2839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC1109l0 f2840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a1.c f2841z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        default Size a() {
            return null;
        }

        void b(androidx.camera.core.d dVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements s1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L.M0 f2842a;

        public c() {
            this(L.M0.g0());
        }

        public static c d(InterfaceC1099g0 interfaceC1099g0) {
            return new c(L.M0.h0(interfaceC1099g0));
        }

        @Override // E.K
        public L.L0 a() {
            return this.f2842a;
        }

        public S c() {
            C1126u0 c1126u0B = b();
            InterfaceC1132x0.k(c1126u0B);
            return new S(c1126u0B);
        }

        @Override // L.s1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1126u0 b() {
            return new C1126u0(L.R0.f0(this.f2842a));
        }

        public c f(int i10) {
            a().H(C1126u0.f8192Q, Integer.valueOf(i10));
            return this;
        }

        public c g(t1.b bVar) {
            a().H(s1.f8181G, bVar);
            return this;
        }

        public c h(Size size) {
            a().H(InterfaceC1132x0.f8221r, size);
            return this;
        }

        public c i(J j10) {
            if (!Objects.equals(J.f2794d, j10)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().H(InterfaceC1130w0.f8215l, j10);
            return this;
        }

        public c j(int i10) {
            a().H(C1126u0.f8195T, Integer.valueOf(i10));
            return this;
        }

        public c k(X.c cVar) {
            a().H(InterfaceC1132x0.f8224u, cVar);
            return this;
        }

        public c l(int i10) {
            a().H(s1.f8175A, Integer.valueOf(i10));
            return this;
        }

        public c m(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().H(InterfaceC1132x0.f8216m, Integer.valueOf(i10));
            return this;
        }

        public c n(Class cls) {
            a().H(P.q.f12542N, cls);
            if (a().c(P.q.f12541M, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c o(String str) {
            a().H(P.q.f12541M, str);
            return this;
        }

        public c(L.M0 m02) {
            this.f2842a = m02;
            Class cls = (Class) m02.c(P.q.f12542N, null);
            if (cls == null || cls.equals(S.class)) {
                g(t1.b.IMAGE_ANALYSIS);
                n(S.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Size f2843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final J f2844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final X.c f2845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1126u0 f2846d;

        static {
            Size size = new Size(640, 480);
            f2843a = size;
            J j10 = J.f2794d;
            f2844b = j10;
            X.c cVarA = new c.a().d(X.a.f17971c).f(new X.d(T.d.f15880c, 1)).a();
            f2845c = cVarA;
            f2846d = new c().h(size).l(1).m(0).k(cVarA).i(j10).b();
        }

        public C1126u0 a() {
            return f2846d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public S(C1126u0 c1126u0) {
        super(c1126u0);
        this.f2833r = new Object();
    }

    public static /* synthetic */ void e0(androidx.camera.core.f fVar, androidx.camera.core.f fVar2) {
        fVar.i();
        if (fVar2 != null) {
            fVar2.i();
        }
    }

    public static /* synthetic */ void f0(S s10, V v10, a1 a1Var, a1.g gVar) {
        if (s10.i() == null) {
            return;
        }
        s10.i0();
        v10.f();
        a1.b bVarJ0 = s10.j0(s10.k(), (C1126u0) s10.l(), (e1) X0.h.g(s10.g()));
        s10.f2839x = bVarJ0;
        s10.b0(List.of(bVarJ0.p()));
        s10.L();
    }

    public static /* synthetic */ List h0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // E.W0
    public s1.b E(InterfaceC1099g0 interfaceC1099g0) {
        return c.d(interfaceC1099g0);
    }

    @Override // E.W0
    public s1 P(L.I i10, s1.b bVar) {
        final Size sizeA;
        synchronized (this.f2833r) {
            try {
                a aVar = this.f2836u;
                sizeA = aVar != null ? aVar.a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sizeA == null) {
            return bVar.b();
        }
        if (i10.p(((Integer) bVar.a().c(InterfaceC1132x0.f8217n, 0)).intValue()) % 180 == 90) {
            sizeA = new Size(sizeA.getHeight(), sizeA.getWidth());
        }
        s1 s1VarB = bVar.b();
        InterfaceC1099g0.a aVar2 = InterfaceC1132x0.f8220q;
        if (!s1VarB.d(aVar2)) {
            bVar.a().H(aVar2, sizeA);
        }
        s1 s1VarB2 = bVar.b();
        InterfaceC1099g0.a aVar3 = InterfaceC1132x0.f8224u;
        if (s1VarB2.d(aVar3)) {
            X.c cVar = (X.c) e().c(aVar3, null);
            c.a aVar4 = cVar == null ? new c.a() : c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new X.d(sizeA, 1));
            }
            if (cVar == null) {
                aVar4.e(new X.b() { // from class: E.Q
                    @Override // X.b
                    public final List a(List list, int i11) {
                        return S.h0(sizeA, list, i11);
                    }
                });
            }
            bVar.a().H(aVar3, aVar4.a());
        }
        return bVar.b();
    }

    @Override // E.W0
    public e1 S(InterfaceC1099g0 interfaceC1099g0) {
        this.f2839x.g(interfaceC1099g0);
        b0(List.of(this.f2839x.p()));
        return g().i().d(interfaceC1099g0).a();
    }

    @Override // E.W0
    public e1 T(e1 e1Var, e1 e1Var2) {
        AbstractC0807p0.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + e1Var + ", secondaryStreamSpec " + e1Var2);
        a1.b bVarJ0 = j0(k(), (C1126u0) l(), e1Var);
        this.f2839x = bVarJ0;
        b0(List.of(bVarJ0.p()));
        return e1Var;
    }

    @Override // E.W0
    public void U() {
        i0();
        synchronized (this.f2833r) {
            this.f2834s.i();
            this.f2834s = null;
        }
    }

    @Override // E.W0
    public void Y(Matrix matrix) {
        super.Y(matrix);
        synchronized (this.f2833r) {
            try {
                V v10 = this.f2834s;
                if (v10 != null) {
                    v10.u(matrix);
                }
                this.f2838w = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.W0
    public void Z(Rect rect) {
        super.Z(rect);
        synchronized (this.f2833r) {
            try {
                V v10 = this.f2834s;
                if (v10 != null) {
                    v10.v(rect);
                }
                this.f2837v = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i0() {
        M.x.b();
        a1.c cVar = this.f2841z;
        if (cVar != null) {
            cVar.b();
            this.f2841z = null;
        }
        AbstractC1109l0 abstractC1109l0 = this.f2840y;
        if (abstractC1109l0 != null) {
            abstractC1109l0.d();
            this.f2840y = null;
        }
    }

    public a1.b j0(String str, C1126u0 c1126u0, e1 e1Var) {
        final V v10;
        M.x.b();
        Size sizeF = e1Var.f();
        Executor executor = (Executor) X0.h.g(c1126u0.a0(N.a.b()));
        boolean z10 = true;
        int iL0 = k0() == 1 ? l0() : 4;
        c1126u0.f0();
        final androidx.camera.core.f fVar = new androidx.camera.core.f(AbstractC0799l0.a(sizeF.getWidth(), sizeF.getHeight(), p(), iL0));
        synchronized (this.f2833r) {
            r0();
            v10 = this.f2834s;
        }
        boolean zP0 = i() != null ? p0(i()) : false;
        int height = zP0 ? sizeF.getHeight() : sizeF.getWidth();
        int width = zP0 ? sizeF.getWidth() : sizeF.getHeight();
        int i10 = n0() == 2 ? 1 : 35;
        boolean z11 = p() == 35 && n0() == 2;
        boolean z12 = p() == 35 && n0() == 3;
        if (p() != 35 || ((i() == null || t(i()) == 0) && !Boolean.TRUE.equals(m0()))) {
            z10 = false;
        }
        final androidx.camera.core.f fVar2 = (z11 || (z10 && !z12)) ? new androidx.camera.core.f(AbstractC0799l0.a(height, width, i10, fVar.e())) : null;
        if (fVar2 != null) {
            v10.s(fVar2);
        }
        t0();
        fVar.d(v10, executor);
        a1.b bVarQ = a1.b.q(c1126u0, e1Var.f());
        if (e1Var.d() != null) {
            bVarQ.g(e1Var.d());
        }
        AbstractC1109l0 abstractC1109l0 = this.f2840y;
        if (abstractC1109l0 != null) {
            abstractC1109l0.d();
        }
        C1136z0 c1136z0 = new C1136z0(fVar.getSurface(), sizeF, p());
        this.f2840y = c1136z0;
        c1136z0.k().b(new Runnable() { // from class: E.O
            @Override // java.lang.Runnable
            public final void run() {
                S.e0(fVar, fVar2);
            }
        }, N.a.d());
        bVarQ.x(e1Var.g());
        b(bVarQ, e1Var);
        bVarQ.n(this.f2840y, e1Var.b(), null, -1);
        a1.c cVar = this.f2841z;
        if (cVar != null) {
            cVar.b();
        }
        a1.c cVar2 = new a1.c(new a1.d() { // from class: E.P
            @Override // L.a1.d
            public final void a(a1 a1Var, a1.g gVar) {
                S.f0(this.f2823a, v10, a1Var, gVar);
            }
        });
        this.f2841z = cVar2;
        bVarQ.r(cVar2);
        return bVarQ;
    }

    public int k0() {
        return ((C1126u0) l()).d0(0);
    }

    public int l0() {
        return ((C1126u0) l()).e0(6);
    }

    @Override // E.W0
    public s1 m(boolean z10, t1 t1Var) {
        d dVar = f2831A;
        InterfaceC1099g0 interfaceC1099g0A = t1Var.a(dVar.a().S(), 1);
        if (z10) {
            interfaceC1099g0A = InterfaceC1099g0.F(interfaceC1099g0A, dVar.a());
        }
        if (interfaceC1099g0A == null) {
            return null;
        }
        return E(interfaceC1099g0A).b();
    }

    public Boolean m0() {
        return ((C1126u0) l()).g0(f2832B);
    }

    public int n0() {
        return ((C1126u0) l()).h0(1);
    }

    public z0 o0() {
        return v();
    }

    public final boolean p0(L.J j10) {
        return q0() && t(j10) % 180 != 0;
    }

    public boolean q0() {
        return ((C1126u0) l()).i0(Boolean.FALSE).booleanValue();
    }

    public final void r0() {
        a aVar;
        synchronized (this.f2833r) {
            try {
                C1126u0 c1126u0 = (C1126u0) l();
                if (c1126u0.d0(0) == 1) {
                    this.f2834s = new W();
                } else {
                    this.f2834s = new androidx.camera.core.c(c1126u0.a0(N.a.b()));
                }
                this.f2834s.q(n0());
                this.f2834s.r(q0());
                L.J jI = i();
                Boolean boolM0 = m0();
                boolean zA = jI != null ? jI.i().k().a(OnePixelShiftQuirk.class) : false;
                V v10 = this.f2834s;
                if (boolM0 != null) {
                    zA = boolM0.booleanValue();
                }
                v10.p(zA);
                if (jI != null) {
                    this.f2834s.t(t(jI));
                }
                Rect rect = this.f2837v;
                if (rect != null) {
                    this.f2834s.v(rect);
                }
                Matrix matrix = this.f2838w;
                if (matrix != null) {
                    this.f2834s.u(matrix);
                }
                Executor executor = this.f2835t;
                if (executor != null && (aVar = this.f2836u) != null) {
                    this.f2834s.o(executor, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s0(Executor executor, final a aVar) {
        synchronized (this.f2833r) {
            try {
                V v10 = this.f2834s;
                if (v10 != null) {
                    v10.o(executor, new a() { // from class: E.N
                        @Override // E.S.a
                        public final void b(androidx.camera.core.d dVar) {
                            aVar.b(dVar);
                        }
                    });
                }
                if (this.f2836u == null) {
                    J();
                }
                this.f2835t = executor;
                this.f2836u = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t0() {
        synchronized (this.f2833r) {
            try {
                L.J jI = i();
                if (jI != null) {
                    this.f2834s.t(t(jI));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + r();
    }
}
