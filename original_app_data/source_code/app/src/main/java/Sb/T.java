package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class T {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Mb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f15577b;

        public a(Eb.p pVar, Object obj) {
            this.f15576a = pVar;
            this.f15577b = obj;
        }

        @Override // Mb.h
        public void clear() {
            lazySet(3);
        }

        @Override // Hb.c
        public void dispose() {
            set(3);
        }

        @Override // Mb.h
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // Hb.c
        public boolean j() {
            return get() == 3;
        }

        @Override // Mb.h
        public boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // Mb.h
        public Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f15577b;
        }

        @Override // Mb.d
        public int q(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f15576a.c(this.f15577b);
                if (get() == 2) {
                    lazySet(3);
                    this.f15576a.a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Eb.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f15578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15579b;

        public b(Object obj, Jb.e eVar) {
            this.f15578a = obj;
            this.f15579b = eVar;
        }

        @Override // Eb.k
        public void v0(Eb.p pVar) {
            try {
                Eb.n nVar = (Eb.n) Lb.b.e(this.f15579b.apply(this.f15578a), "The mapper returned a null ObservableSource");
                if (!(nVar instanceof Callable)) {
                    nVar.f(pVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) nVar).call();
                    if (objCall == null) {
                        Kb.d.a(pVar);
                        return;
                    }
                    a aVar = new a(pVar, objCall);
                    pVar.b(aVar);
                    aVar.run();
                } catch (Throwable th) {
                    Ib.b.b(th);
                    Kb.d.p(th, pVar);
                }
            } catch (Throwable th2) {
                Kb.d.p(th2, pVar);
            }
        }
    }

    public static Eb.k a(Object obj, Jb.e eVar) {
        return AbstractC2904a.m(new b(obj, eVar));
    }

    public static boolean b(Eb.n nVar, Eb.p pVar, Jb.e eVar) {
        if (!(nVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) nVar).call();
            if (objCall == null) {
                Kb.d.a(pVar);
                return true;
            }
            try {
                Eb.n nVar2 = (Eb.n) Lb.b.e(eVar.apply(objCall), "The mapper returned a null ObservableSource");
                if (nVar2 instanceof Callable) {
                    try {
                        Object objCall2 = ((Callable) nVar2).call();
                        if (objCall2 == null) {
                            Kb.d.a(pVar);
                            return true;
                        }
                        a aVar = new a(pVar, objCall2);
                        pVar.b(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        Ib.b.b(th);
                        Kb.d.p(th, pVar);
                        return true;
                    }
                } else {
                    nVar2.f(pVar);
                }
                return true;
            } catch (Throwable th2) {
                Ib.b.b(th2);
                Kb.d.p(th2, pVar);
                return true;
            }
        } catch (Throwable th3) {
            Ib.b.b(th3);
            Kb.d.p(th3, pVar);
            return true;
        }
    }
}
