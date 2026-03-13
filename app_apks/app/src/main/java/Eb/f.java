package Eb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements Ze.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3378a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int b() {
        return f3378a;
    }

    public static f d() {
        return AbstractC2904a.k(Pb.d.f13231b);
    }

    public static f f(Object... objArr) {
        Lb.b.e(objArr, "items is null");
        return objArr.length == 0 ? d() : objArr.length == 1 ? g(objArr[0]) : AbstractC2904a.k(new Pb.g(objArr));
    }

    public static f g(Object obj) {
        Lb.b.e(obj, "item is null");
        return AbstractC2904a.k(new Pb.h(obj));
    }

    @Override // Ze.a
    public final void a(Ze.b bVar) {
        if (bVar instanceof g) {
            i((g) bVar);
        } else {
            Lb.b.e(bVar, "s is null");
            i(new Wb.a(bVar));
        }
    }

    public final r c(long j10) {
        if (j10 >= 0) {
            return AbstractC2904a.n(new Pb.c(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final r e() {
        return c(0L);
    }

    public final f h(long j10, Jb.g gVar) {
        if (j10 >= 0) {
            Lb.b.e(gVar, "predicate is null");
            return AbstractC2904a.k(new Pb.i(this, j10, gVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final void i(g gVar) {
        Lb.b.e(gVar, "s is null");
        try {
            Ze.b bVarX = AbstractC2904a.x(this, gVar);
            Lb.b.e(bVarX, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            j(bVarX);
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

    public abstract void j(Ze.b bVar);
}
