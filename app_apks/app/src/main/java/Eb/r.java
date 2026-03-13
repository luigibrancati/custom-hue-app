package Eb;

import bc.AbstractC2904a;
import cc.AbstractC3096a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements v {
    public static r G(long j10, TimeUnit timeUnit) {
        return H(j10, timeUnit, AbstractC3096a.a());
    }

    public static r H(long j10, TimeUnit timeUnit, q qVar) {
        Lb.b.e(timeUnit, "unit is null");
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.n(new Tb.r(j10, timeUnit, qVar));
    }

    public static r K(f fVar) {
        return AbstractC2904a.n(new Pb.l(fVar, null));
    }

    public static r L(v vVar) {
        Lb.b.e(vVar, "source is null");
        return vVar instanceof r ? AbstractC2904a.n((r) vVar) : AbstractC2904a.n(new Tb.l(vVar));
    }

    public static r g(u uVar) {
        Lb.b.e(uVar, "source is null");
        return AbstractC2904a.n(new Tb.b(uVar));
    }

    public static r h(Callable callable) {
        Lb.b.e(callable, "singleSupplier is null");
        return AbstractC2904a.n(new Tb.c(callable));
    }

    public static r n(Throwable th) {
        Lb.b.e(th, "exception is null");
        return o(Lb.a.f(th));
    }

    public static r o(Callable callable) {
        Lb.b.e(callable, "errorSupplier is null");
        return AbstractC2904a.n(new Tb.i(callable));
    }

    public static r s(Callable callable) {
        Lb.b.e(callable, "callable is null");
        return AbstractC2904a.n(new Tb.k(callable));
    }

    public static r t(Object obj) {
        Lb.b.e(obj, "item is null");
        return AbstractC2904a.n(new Tb.n(obj));
    }

    public static f v(v vVar, v vVar2) {
        Lb.b.e(vVar, "source1 is null");
        Lb.b.e(vVar2, "source2 is null");
        return w(f.f(vVar, vVar2));
    }

    public static f w(Ze.a aVar) {
        Lb.b.e(aVar, "sources is null");
        return AbstractC2904a.k(new Pb.f(aVar, Tb.m.a(), false, Integer.MAX_VALUE, f.b()));
    }

    public final Hb.c A() {
        return B(Lb.a.d(), Lb.a.f8705f);
    }

    public final Hb.c B(Jb.d dVar, Jb.d dVar2) {
        Lb.b.e(dVar, "onSuccess is null");
        Lb.b.e(dVar2, "onError is null");
        Nb.e eVar = new Nb.e(dVar, dVar2);
        c(eVar);
        return eVar;
    }

    public abstract void C(t tVar);

    public final t D(t tVar) {
        c(tVar);
        return tVar;
    }

    public final r E(long j10, TimeUnit timeUnit, q qVar, v vVar) {
        Lb.b.e(vVar, "other is null");
        return F(j10, timeUnit, qVar, vVar);
    }

    public final r F(long j10, TimeUnit timeUnit, q qVar, v vVar) {
        Lb.b.e(timeUnit, "unit is null");
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.n(new Tb.q(this, j10, timeUnit, qVar, vVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f I() {
        return this instanceof Mb.a ? ((Mb.a) this).d() : AbstractC2904a.k(new Tb.s(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k J() {
        return this instanceof Mb.b ? ((Mb.b) this).a() : AbstractC2904a.m(new Tb.t(this));
    }

    @Override // Eb.v
    public final void c(t tVar) {
        Lb.b.e(tVar, "observer is null");
        t tVarW = AbstractC2904a.w(this, tVar);
        Lb.b.e(tVarW, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            C(tVarW);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Ib.b.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final r e() {
        return AbstractC2904a.n(new Tb.a(this));
    }

    public final r f(w wVar) {
        return L(((w) Lb.b.e(wVar, "transformer is null")).a(this));
    }

    public final r i(n nVar) {
        Lb.b.e(nVar, "other is null");
        return AbstractC2904a.n(new Tb.d(this, nVar));
    }

    public final r j(Jb.a aVar) {
        Lb.b.e(aVar, "onFinally is null");
        return AbstractC2904a.n(new Tb.e(this, aVar));
    }

    public final r k(Jb.d dVar) {
        Lb.b.e(dVar, "onError is null");
        return AbstractC2904a.n(new Tb.f(this, dVar));
    }

    public final r l(Jb.d dVar) {
        Lb.b.e(dVar, "onSubscribe is null");
        return AbstractC2904a.n(new Tb.g(this, dVar));
    }

    public final r m(Jb.d dVar) {
        Lb.b.e(dVar, "onSuccess is null");
        return AbstractC2904a.n(new Tb.h(this, dVar));
    }

    public final h p(Jb.g gVar) {
        Lb.b.e(gVar, "predicate is null");
        return AbstractC2904a.l(new Qb.c(this, gVar));
    }

    public final r q(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.n(new Tb.j(this, eVar));
    }

    public final k r(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.m(new Rb.d(this, eVar));
    }

    public final r u(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.n(new Tb.o(this, eVar));
    }

    public final f x(v vVar) {
        return v(this, vVar);
    }

    public final r y(q qVar) {
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.n(new Tb.p(this, qVar));
    }

    public final r z(long j10, Jb.g gVar) {
        return K(I().h(j10, gVar));
    }
}
