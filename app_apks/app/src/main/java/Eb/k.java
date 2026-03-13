package Eb;

import Sb.A;
import Sb.C;
import Sb.C2201b;
import Sb.C2203d;
import Sb.C2205f;
import Sb.C2206g;
import Sb.C2207h;
import Sb.C2208i;
import Sb.C2209j;
import Sb.C2210k;
import Sb.C2211l;
import Sb.C2212m;
import Sb.C2213n;
import Sb.C2214o;
import Sb.C2216q;
import Sb.C2217s;
import Sb.C2218t;
import Sb.C2219u;
import Sb.C2220v;
import Sb.C2221w;
import Sb.C2222x;
import Sb.C2224z;
import Sb.CallableC2223y;
import Sb.D;
import Sb.E;
import Sb.F;
import Sb.G;
import Sb.H;
import Sb.I;
import Sb.J;
import Sb.K;
import Sb.N;
import Sb.P;
import Sb.Q;
import Sb.S;
import Sb.T;
import Sb.U;
import Sb.V;
import Sb.W;
import Sb.X;
import Sb.Y;
import Sb.Z;
import Sb.a0;
import Sb.b0;
import Sb.e0;
import Sb.f0;
import Sb.g0;
import bc.AbstractC2904a;
import cc.AbstractC3096a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements n {
    public static k F() {
        return AbstractC2904a.m(C2217s.f15811a);
    }

    public static k G(Throwable th) {
        Lb.b.e(th, "exception is null");
        return H(Lb.a.f(th));
    }

    public static k H(Callable callable) {
        Lb.b.e(callable, "errorSupplier is null");
        return AbstractC2904a.m(new C2218t(callable));
    }

    public static k I0(long j10, TimeUnit timeUnit) {
        return J0(j10, timeUnit, AbstractC3096a.a());
    }

    public static k J0(long j10, TimeUnit timeUnit, q qVar) {
        Lb.b.e(timeUnit, "unit is null");
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.m(new e0(Math.max(j10, 0L), timeUnit, qVar));
    }

    public static k N0(n nVar) {
        Lb.b.e(nVar, "source is null");
        return nVar instanceof k ? AbstractC2904a.m((k) nVar) : AbstractC2904a.m(new C2224z(nVar));
    }

    public static k S(Object... objArr) {
        Lb.b.e(objArr, "items is null");
        return objArr.length == 0 ? F() : objArr.length == 1 ? Y(objArr[0]) : AbstractC2904a.m(new C2222x(objArr));
    }

    public static k T(Callable callable) {
        Lb.b.e(callable, "supplier is null");
        return AbstractC2904a.m(new CallableC2223y(callable));
    }

    public static k X(long j10, long j11, TimeUnit timeUnit, q qVar) {
        Lb.b.e(timeUnit, "unit is null");
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.m(new D(Math.max(0L, j10), Math.max(0L, j11), timeUnit, qVar));
    }

    public static k Y(Object obj) {
        Lb.b.e(obj, "item is null");
        return AbstractC2904a.m(new E(obj));
    }

    public static k a0(n nVar, n nVar2) {
        Lb.b.e(nVar, "source1 is null");
        Lb.b.e(nVar2, "source2 is null");
        return S(nVar, nVar2).O(Lb.a.e(), false, 2);
    }

    public static k b0(n nVar, n nVar2, n nVar3) {
        Lb.b.e(nVar, "source1 is null");
        Lb.b.e(nVar2, "source2 is null");
        Lb.b.e(nVar3, "source3 is null");
        return S(nVar, nVar2, nVar3).O(Lb.a.e(), false, 3);
    }

    public static k e0() {
        return AbstractC2904a.m(H.f15477a);
    }

    public static k g(Iterable iterable) {
        Lb.b.e(iterable, "sources is null");
        return AbstractC2904a.m(new C2201b(null, iterable));
    }

    public static int h() {
        return f.b();
    }

    public static k k(n... nVarArr) {
        return nVarArr.length == 0 ? F() : nVarArr.length == 1 ? N0(nVarArr[0]) : AbstractC2904a.m(new C2203d(S(nVarArr), Lb.a.e(), h(), Yb.e.BOUNDARY));
    }

    public static k m(m mVar) {
        Lb.b.e(mVar, "source is null");
        return AbstractC2904a.m(new C2206g(mVar));
    }

    public static k o(Callable callable) {
        Lb.b.e(callable, "supplier is null");
        return AbstractC2904a.m(new C2208i(callable));
    }

    public final k A(Jb.d dVar) {
        return y(dVar, Lb.a.f8702c);
    }

    public final k A0(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.m(new Rb.b(this, eVar, false));
    }

    public final k B(Jb.a aVar) {
        Lb.b.e(aVar, "onTerminate is null");
        return w(Lb.a.d(), Lb.a.a(aVar), aVar, Lb.a.f8702c);
    }

    public final k B0(long j10) {
        if (j10 >= 0) {
            return AbstractC2904a.m(new X(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final h C(long j10) {
        if (j10 >= 0) {
            return AbstractC2904a.l(new C2216q(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final k C0(long j10, TimeUnit timeUnit, q qVar) {
        return D0(J0(j10, timeUnit, qVar));
    }

    public final r D(long j10, Object obj) {
        if (j10 >= 0) {
            Lb.b.e(obj, "defaultItem is null");
            return AbstractC2904a.n(new Sb.r(this, j10, obj));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final k D0(n nVar) {
        Lb.b.e(nVar, "other is null");
        return AbstractC2904a.m(new Y(this, nVar));
    }

    public final r E(long j10) {
        if (j10 >= 0) {
            return AbstractC2904a.n(new Sb.r(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final k E0(Jb.g gVar) {
        Lb.b.e(gVar, "stopPredicate is null");
        return AbstractC2904a.m(new Z(this, gVar));
    }

    public final k F0(Jb.g gVar) {
        Lb.b.e(gVar, "predicate is null");
        return AbstractC2904a.m(new a0(this, gVar));
    }

    public final k G0(n nVar, Jb.e eVar) {
        Lb.b.e(nVar, "firstTimeoutIndicator is null");
        return H0(nVar, eVar, null);
    }

    public final k H0(n nVar, Jb.e eVar, n nVar2) {
        Lb.b.e(eVar, "itemTimeoutIndicator is null");
        return AbstractC2904a.m(new b0(this, nVar, eVar, nVar2));
    }

    public final k I(Jb.g gVar) {
        Lb.b.e(gVar, "predicate is null");
        return AbstractC2904a.m(new C2219u(this, gVar));
    }

    public final r J(Object obj) {
        return D(0L, obj);
    }

    public final h K() {
        return C(0L);
    }

    public final k K0(q qVar) {
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.m(new f0(this, qVar));
    }

    public final r L() {
        return E(0L);
    }

    public final k L0(n nVar) {
        return M0(nVar, h());
    }

    public final k M(Jb.e eVar) {
        return N(eVar, false);
    }

    public final k M0(n nVar, int i10) {
        Lb.b.e(nVar, "boundary is null");
        Lb.b.f(i10, "bufferSize");
        return AbstractC2904a.m(new g0(this, nVar, i10));
    }

    public final k N(Jb.e eVar, boolean z10) {
        return O(eVar, z10, Integer.MAX_VALUE);
    }

    public final k O(Jb.e eVar, boolean z10, int i10) {
        return P(eVar, z10, i10, h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k P(Jb.e eVar, boolean z10, int i10, int i11) {
        Lb.b.e(eVar, "mapper is null");
        Lb.b.f(i10, "maxConcurrency");
        Lb.b.f(i11, "bufferSize");
        if (!(this instanceof Mb.f)) {
            return AbstractC2904a.m(new C2220v(this, eVar, z10, i10, i11));
        }
        Object objCall = ((Mb.f) this).call();
        return objCall == null ? F() : T.a(objCall, eVar);
    }

    public final k Q(Jb.e eVar) {
        return R(eVar, false);
    }

    public final k R(Jb.e eVar, boolean z10) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.m(new C2221w(this, eVar, z10));
    }

    public final k U(Jb.e eVar) {
        return V(eVar, Lb.a.e(), false, h());
    }

    public final k V(Jb.e eVar, Jb.e eVar2, boolean z10, int i10) {
        Lb.b.e(eVar, "keySelector is null");
        Lb.b.e(eVar2, "valueSelector is null");
        Lb.b.f(i10, "bufferSize");
        return AbstractC2904a.m(new A(this, eVar, eVar2, i10, z10));
    }

    public final a W() {
        return AbstractC2904a.j(new C(this));
    }

    public final k Z(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.m(new F(this, eVar));
    }

    public final k c0(c cVar) {
        Lb.b.e(cVar, "other is null");
        return AbstractC2904a.m(new G(this, cVar));
    }

    public final k d0(n nVar) {
        Lb.b.e(nVar, "other is null");
        return a0(this, nVar);
    }

    @Override // Eb.n
    public final void f(p pVar) {
        Lb.b.e(pVar, "observer is null");
        try {
            p pVarV = AbstractC2904a.v(this, pVar);
            Lb.b.e(pVarV, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            v0(pVarV);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Ib.b.b(th);
            AbstractC2904a.q(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final k f0(q qVar) {
        return g0(qVar, false, h());
    }

    public final k g0(q qVar, boolean z10, int i10) {
        Lb.b.e(qVar, "scheduler is null");
        Lb.b.f(i10, "bufferSize");
        return AbstractC2904a.m(new I(this, qVar, z10, i10));
    }

    public final k h0(Jb.e eVar) {
        Lb.b.e(eVar, "valueSupplier is null");
        return AbstractC2904a.m(new J(this, eVar));
    }

    public final k i(Class cls) {
        Lb.b.e(cls, "clazz is null");
        return Z(Lb.a.c(cls));
    }

    public final k i0(Jb.e eVar) {
        Lb.b.e(eVar, "selector is null");
        return AbstractC2904a.m(new N(this, eVar));
    }

    public final k j(o oVar) {
        return N0(((o) Lb.b.e(oVar, "composer is null")).a(this));
    }

    public final Zb.a j0() {
        return K.T0(this);
    }

    public final k k0(Jb.e eVar) {
        Lb.b.e(eVar, "handler is null");
        return AbstractC2904a.m(new P(this, eVar));
    }

    public final r l() {
        return AbstractC2904a.n(new C2205f(this));
    }

    public final Zb.a l0() {
        return Q.V0(this);
    }

    public final Zb.a m0(int i10) {
        Lb.b.f(i10, "bufferSize");
        return Q.T0(this, i10);
    }

    public final k n(long j10, TimeUnit timeUnit, q qVar) {
        Lb.b.e(timeUnit, "unit is null");
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.m(new C2207h(this, j10, timeUnit, qVar));
    }

    public final k n0(long j10, Jb.g gVar) {
        if (j10 >= 0) {
            Lb.b.e(gVar, "predicate is null");
            return AbstractC2904a.m(new S(this, j10, gVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final k o0(Jb.g gVar) {
        return n0(Long.MAX_VALUE, gVar);
    }

    public final k p(long j10, TimeUnit timeUnit) {
        return r(j10, timeUnit, AbstractC3096a.a(), false);
    }

    public final k p0() {
        return j0().S0();
    }

    public final k q(long j10, TimeUnit timeUnit, q qVar) {
        return r(j10, timeUnit, qVar, false);
    }

    public final k q0(long j10) {
        return j10 <= 0 ? AbstractC2904a.m(this) : AbstractC2904a.m(new U(this, j10));
    }

    public final k r(long j10, TimeUnit timeUnit, q qVar, boolean z10) {
        Lb.b.e(timeUnit, "unit is null");
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.m(new C2209j(this, j10, timeUnit, qVar, z10));
    }

    public final k r0(Object obj) {
        Lb.b.e(obj, "item is null");
        return k(Y(obj), this);
    }

    public final k s(n nVar) {
        Lb.b.e(nVar, "other is null");
        return AbstractC2904a.m(new C2210k(this, nVar));
    }

    public final Hb.c s0(Jb.d dVar) {
        return u0(dVar, Lb.a.f8705f, Lb.a.f8702c, Lb.a.d());
    }

    public final k t() {
        return u(Lb.a.e());
    }

    public final Hb.c t0(Jb.d dVar, Jb.d dVar2) {
        return u0(dVar, dVar2, Lb.a.f8702c, Lb.a.d());
    }

    public final k u(Jb.e eVar) {
        Lb.b.e(eVar, "keySelector is null");
        return AbstractC2904a.m(new C2211l(this, eVar, Lb.b.d()));
    }

    public final Hb.c u0(Jb.d dVar, Jb.d dVar2, Jb.a aVar, Jb.d dVar3) {
        Lb.b.e(dVar, "onNext is null");
        Lb.b.e(dVar2, "onError is null");
        Lb.b.e(aVar, "onComplete is null");
        Lb.b.e(dVar3, "onSubscribe is null");
        Nb.h hVar = new Nb.h(dVar, dVar2, aVar, dVar3);
        f(hVar);
        return hVar;
    }

    public final k v(Jb.a aVar) {
        Lb.b.e(aVar, "onFinally is null");
        return AbstractC2904a.m(new C2212m(this, aVar));
    }

    public abstract void v0(p pVar);

    public final k w(Jb.d dVar, Jb.d dVar2, Jb.a aVar, Jb.a aVar2) {
        Lb.b.e(dVar, "onNext is null");
        Lb.b.e(dVar2, "onError is null");
        Lb.b.e(aVar, "onComplete is null");
        Lb.b.e(aVar2, "onAfterTerminate is null");
        return AbstractC2904a.m(new C2213n(this, dVar, dVar2, aVar, aVar2));
    }

    public final k w0(q qVar) {
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.m(new V(this, qVar));
    }

    public final k x(Jb.d dVar) {
        Jb.d dVarD = Lb.a.d();
        Jb.a aVar = Lb.a.f8702c;
        return w(dVarD, dVar, aVar, aVar);
    }

    public final p x0(p pVar) {
        f(pVar);
        return pVar;
    }

    public final k y(Jb.d dVar, Jb.a aVar) {
        Lb.b.e(dVar, "onSubscribe is null");
        Lb.b.e(aVar, "onDispose is null");
        return AbstractC2904a.m(new C2214o(this, dVar, aVar));
    }

    public final k y0(Jb.e eVar) {
        return z0(eVar, h());
    }

    public final k z(Jb.d dVar) {
        Jb.d dVarD = Lb.a.d();
        Jb.a aVar = Lb.a.f8702c;
        return w(dVar, dVarD, aVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k z0(Jb.e eVar, int i10) {
        Lb.b.e(eVar, "mapper is null");
        Lb.b.f(i10, "bufferSize");
        if (!(this instanceof Mb.f)) {
            return AbstractC2904a.m(new W(this, eVar, i10, false));
        }
        Object objCall = ((Mb.f) this).call();
        return objCall == null ? F() : T.a(objCall, eVar);
    }
}
