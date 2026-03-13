package E;

import L.AbstractC1109l0;
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
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: E.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0822x0 extends W0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f3039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Executor f3040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a1.b f3041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC1109l0 f3042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public U.L f3043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public V0 f3044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U.U f3045x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a1.c f3046y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f3038z = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Executor f3037A = N.a.d();

    /* JADX INFO: renamed from: E.x0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements s1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L.M0 f3047a;

        public a() {
            this(L.M0.g0());
        }

        public static a d(InterfaceC1099g0 interfaceC1099g0) {
            return new a(L.M0.h0(interfaceC1099g0));
        }

        @Override // E.K
        public L.L0 a() {
            return this.f3047a;
        }

        public C0822x0 c() {
            L.S0 s0B = b();
            InterfaceC1132x0.k(s0B);
            return new C0822x0(s0B);
        }

        @Override // L.s1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public L.S0 b() {
            return new L.S0(L.R0.f0(this.f3047a));
        }

        public a f(t1.b bVar) {
            a().H(s1.f8181G, bVar);
            return this;
        }

        public a g(J j10) {
            a().H(InterfaceC1130w0.f8215l, j10);
            return this;
        }

        public a h(boolean z10) {
            a().H(s1.f8180F, Boolean.valueOf(z10));
            return this;
        }

        public a i(X.c cVar) {
            a().H(InterfaceC1132x0.f8224u, cVar);
            return this;
        }

        public a j(int i10) {
            a().H(s1.f8175A, Integer.valueOf(i10));
            return this;
        }

        public a k(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().H(InterfaceC1132x0.f8216m, Integer.valueOf(i10));
            return this;
        }

        public a l(Class cls) {
            a().H(P.q.f12542N, cls);
            if (a().c(P.q.f12541M, null) == null) {
                m(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a m(String str) {
            a().H(P.q.f12541M, str);
            return this;
        }

        public a(L.M0 m02) {
            this.f3047a = m02;
            Class cls = (Class) m02.c(P.q.f12542N, null);
            if (cls != null && !cls.equals(C0822x0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            f(t1.b.PREVIEW);
            l(C0822x0.class);
            InterfaceC1099g0.a aVar = InterfaceC1132x0.f8219p;
            if (((Integer) m02.c(aVar, -1)).intValue() == -1) {
                m02.H(aVar, 2);
            }
        }
    }

    /* JADX INFO: renamed from: E.x0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X.c f3048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final L.S0 f3049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final J f3050c;

        static {
            X.c cVarA = new c.a().d(X.a.f17971c).f(X.d.f17983c).a();
            f3048a = cVarA;
            J j10 = J.f2793c;
            f3050c = j10;
            f3049b = new a().j(2).k(0).i(cVarA).h(true).g(j10).b();
        }

        public L.S0 a() {
            return f3049b;
        }
    }

    /* JADX INFO: renamed from: E.x0$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(V0 v02);
    }

    public C0822x0(L.S0 s02) {
        super(s02);
        this.f3040s = f3037A;
    }

    public static /* synthetic */ void e0(C0822x0 c0822x0, a1 a1Var, a1.g gVar) {
        if (c0822x0.i() == null) {
            return;
        }
        c0822x0.p0((L.S0) c0822x0.l(), c0822x0.g());
        c0822x0.L();
    }

    private void h0() {
        a1.c cVar = this.f3046y;
        if (cVar != null) {
            cVar.b();
            this.f3046y = null;
        }
        AbstractC1109l0 abstractC1109l0 = this.f3042u;
        if (abstractC1109l0 != null) {
            abstractC1109l0.d();
            this.f3042u = null;
        }
        U.U u10 = this.f3045x;
        if (u10 != null) {
            u10.f();
            this.f3045x = null;
        }
        U.L l10 = this.f3043v;
        if (l10 != null) {
            l10.i();
            this.f3043v = null;
        }
        V0 v02 = this.f3044w;
        if (v02 != null) {
            v02.k();
        }
        this.f3044w = null;
    }

    @Override // E.W0
    public Set C() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // E.W0
    public s1.b E(InterfaceC1099g0 interfaceC1099g0) {
        return a.d(interfaceC1099g0);
    }

    @Override // E.W0
    public s1 P(L.I i10, s1.b bVar) {
        bVar.a().H(InterfaceC1130w0.f8213j, 34);
        return bVar.b();
    }

    @Override // E.W0
    public e1 S(InterfaceC1099g0 interfaceC1099g0) {
        this.f3041t.g(interfaceC1099g0);
        b0(List.of(this.f3041t.p()));
        return g().i().d(interfaceC1099g0).a();
    }

    @Override // E.W0
    public e1 T(e1 e1Var, e1 e1Var2) {
        AbstractC0807p0.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + e1Var + ", secondaryStreamSpec " + e1Var2);
        p0((L.S0) l(), e1Var);
        return e1Var;
    }

    @Override // E.W0
    public void U() {
        h0();
    }

    @Override // E.W0
    public void Z(Rect rect) {
        super.Z(rect);
        l0();
    }

    public final void g0(a1.b bVar, e1 e1Var) {
        if (this.f3039r != null) {
            bVar.n(this.f3042u, e1Var.b(), s(), q());
        }
        a1.c cVar = this.f3046y;
        if (cVar != null) {
            cVar.b();
        }
        a1.c cVar2 = new a1.c(new a1.d() { // from class: E.w0
            @Override // L.a1.d
            public final void a(a1 a1Var, a1.g gVar) {
                C0822x0.e0(this.f3035a, a1Var, gVar);
            }
        });
        this.f3046y = cVar2;
        bVar.r(cVar2);
    }

    public final a1.b i0(L.S0 s02, e1 e1Var) {
        M.x.b();
        L.J jI = i();
        Objects.requireNonNull(jI);
        L.J j10 = jI;
        h0();
        X0.h.i(this.f3043v == null);
        Matrix matrixZ = z();
        boolean zP = j10.p();
        Rect rectJ0 = j0(e1Var.f());
        Objects.requireNonNull(rectJ0);
        this.f3043v = new U.L(1, 34, e1Var, matrixZ, zP, rectJ0, u(j10, H(j10)), f(), o0(j10));
        n();
        this.f3043v.e(new Runnable() { // from class: E.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3026a.L();
            }
        });
        V0 v0K = this.f3043v.k(j10);
        this.f3044w = v0K;
        this.f3042u = v0K.l();
        if (this.f3039r != null) {
            k0();
        }
        a1.b bVarQ = a1.b.q(s02, e1Var.f());
        bVarQ.x(e1Var.g());
        b(bVarQ, e1Var);
        bVarQ.w(s02.z());
        if (e1Var.d() != null) {
            bVarQ.g(e1Var.d());
        }
        g0(bVarQ, e1Var);
        return bVarQ;
    }

    public final Rect j0(Size size) {
        if (F() != null) {
            return F();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public final void k0() {
        l0();
        final c cVar = (c) X0.h.g(this.f3039r);
        final V0 v02 = (V0) X0.h.g(this.f3044w);
        this.f3040s.execute(new Runnable() { // from class: E.v0
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(v02);
            }
        });
    }

    public final void l0() {
        L.J jI = i();
        U.L l10 = this.f3043v;
        if (jI == null || l10 == null) {
            return;
        }
        l10.y(u(jI, H(jI)), f());
    }

    @Override // E.W0
    public s1 m(boolean z10, t1 t1Var) {
        b bVar = f3038z;
        InterfaceC1099g0 interfaceC1099g0A = t1Var.a(bVar.a().S(), 1);
        if (z10) {
            interfaceC1099g0A = InterfaceC1099g0.F(interfaceC1099g0A, bVar.a());
        }
        if (interfaceC1099g0A == null) {
            return null;
        }
        return E(interfaceC1099g0A).b();
    }

    public void m0(c cVar) {
        n0(f3037A, cVar);
    }

    public void n0(Executor executor, c cVar) {
        M.x.b();
        if (cVar == null) {
            this.f3039r = null;
            K();
            return;
        }
        this.f3039r = cVar;
        this.f3040s = executor;
        if (h() != null) {
            p0((L.S0) l(), g());
            L();
        }
        J();
    }

    public final boolean o0(L.J j10) {
        return j10.p() && H(j10);
    }

    public final void p0(L.S0 s02, e1 e1Var) {
        a1.b bVarI0 = i0(s02, e1Var);
        this.f3041t = bVarI0;
        b0(List.of(bVarI0.p()));
    }

    public String toString() {
        return "Preview:" + r();
    }
}
