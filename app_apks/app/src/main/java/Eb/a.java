package Eb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements c {
    public static a f(Throwable th) {
        Lb.b.e(th, "error is null");
        return AbstractC2904a.j(new Ob.b(th));
    }

    public static a g(Jb.a aVar) {
        Lb.b.e(aVar, "run is null");
        return AbstractC2904a.j(new Ob.c(aVar));
    }

    public static NullPointerException n(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static a q(c cVar) {
        Lb.b.e(cVar, "source is null");
        return cVar instanceof a ? AbstractC2904a.j((a) cVar) : AbstractC2904a.j(new Ob.d(cVar));
    }

    @Override // Eb.c
    public final void b(b bVar) {
        Lb.b.e(bVar, "observer is null");
        try {
            b bVarT = AbstractC2904a.t(this, bVar);
            Lb.b.e(bVarT, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            m(bVarT);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Ib.b.b(th);
            AbstractC2904a.q(th);
            throw n(th);
        }
    }

    public final a c(c cVar) {
        Lb.b.e(cVar, "next is null");
        return AbstractC2904a.j(new Ob.a(this, cVar));
    }

    public final k d(n nVar) {
        Lb.b.e(nVar, "next is null");
        return AbstractC2904a.m(new Rb.a(this, nVar));
    }

    public final a e(d dVar) {
        return q(((d) Lb.b.e(dVar, "transformer is null")).a(this));
    }

    public final a h(q qVar) {
        Lb.b.e(qVar, "scheduler is null");
        return AbstractC2904a.j(new Ob.e(this, qVar));
    }

    public final a i() {
        return j(Lb.a.b());
    }

    public final a j(Jb.g gVar) {
        Lb.b.e(gVar, "predicate is null");
        return AbstractC2904a.j(new Ob.f(this, gVar));
    }

    public final a k(Jb.e eVar) {
        Lb.b.e(eVar, "errorMapper is null");
        return AbstractC2904a.j(new Ob.g(this, eVar));
    }

    public final Hb.c l(Jb.a aVar, Jb.d dVar) {
        Lb.b.e(dVar, "onError is null");
        Lb.b.e(aVar, "onComplete is null");
        Nb.d dVar2 = new Nb.d(dVar, aVar);
        b(dVar2);
        return dVar2;
    }

    public abstract void m(b bVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final k o() {
        return this instanceof Mb.b ? ((Mb.b) this).a() : AbstractC2904a.m(new Ob.h(this));
    }

    public final r p(Callable callable) {
        Lb.b.e(callable, "completionValueSupplier is null");
        return AbstractC2904a.n(new Ob.i(this, callable, null));
    }
}
