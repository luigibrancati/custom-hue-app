package Eb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements j {
    public static h c(Throwable th) {
        Lb.b.e(th, "exception is null");
        return AbstractC2904a.l(new Qb.b(th));
    }

    @Override // Eb.j
    public final void b(i iVar) {
        Lb.b.e(iVar, "observer is null");
        i iVarU = AbstractC2904a.u(this, iVar);
        Lb.b.e(iVarU, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            f(iVarU);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Ib.b.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final h d(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.l(new Qb.d(this, eVar));
    }

    public final h e(Jb.e eVar) {
        Lb.b.e(eVar, "mapper is null");
        return AbstractC2904a.l(new Qb.e(this, eVar));
    }

    public abstract void f(i iVar);

    public final r g(v vVar) {
        Lb.b.e(vVar, "other is null");
        return AbstractC2904a.n(new Qb.f(this, vVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k h() {
        return this instanceof Mb.b ? ((Mb.b) this).a() : AbstractC2904a.m(new Qb.g(this));
    }
}
