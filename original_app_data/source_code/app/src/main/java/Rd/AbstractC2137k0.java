package Rd;

import Rd.W;
import fc.C4015H;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2137k0 extends AbstractC2139l0 implements W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15184e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2137k0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15185f = AtomicReferenceFieldUpdater.newUpdater(AbstractC2137k0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15186g = AtomicIntegerFieldUpdater.newUpdater(AbstractC2137k0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: Rd.k0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2138l f15187c;

        public a(long j10, InterfaceC2138l interfaceC2138l) {
            super(j10);
            this.f15187c = interfaceC2138l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15187c.e(AbstractC2137k0.this, C4015H.f34254a);
        }

        @Override // Rd.AbstractC2137k0.c
        public String toString() {
            return super.toString() + this.f15187c;
        }
    }

    /* JADX INFO: renamed from: Rd.k0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f15189c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f15189c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15189c.run();
        }

        @Override // Rd.AbstractC2137k0.c
        public String toString() {
            return super.toString() + this.f15189c;
        }
    }

    /* JADX INFO: renamed from: Rd.k0$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c implements Runnable, Comparable, InterfaceC2127f0, Wd.Q {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15191b = -1;

        public c(long j10) {
            this.f15190a = j10;
        }

        @Override // Wd.Q
        public void a(Wd.P p10) {
            if (this._heap == AbstractC2143n0.f15199a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = p10;
        }

        @Override // Rd.InterfaceC2127f0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC2143n0.f15199a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC2143n0.f15199a;
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Wd.Q
        public Wd.P getHeap() {
            Object obj = this._heap;
            if (obj instanceof Wd.P) {
                return (Wd.P) obj;
            }
            return null;
        }

        @Override // Wd.Q
        public int getIndex() {
            return this.f15191b;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f15190a - cVar.f15190a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int p(long j10, d dVar, AbstractC2137k0 abstractC2137k0) {
            synchronized (this) {
                if (this._heap == AbstractC2143n0.f15199a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC2137k0.F()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f15192c = j10;
                        } else {
                            long j11 = cVar.f15190a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f15192c > 0) {
                                dVar.f15192c = j10;
                            }
                        }
                        long j12 = this.f15190a;
                        long j13 = dVar.f15192c;
                        if (j12 - j13 < 0) {
                            this.f15190a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean q(long j10) {
            return j10 - this.f15190a >= 0;
        }

        @Override // Wd.Q
        public void setIndex(int i10) {
            this.f15191b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15190a + ']';
        }
    }

    /* JADX INFO: renamed from: Rd.k0$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends Wd.P {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15192c;

        public d(long j10) {
            this.f15192c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F() {
        return f15186g.get(this) == 1;
    }

    public final int A1(long j10, c cVar) {
        if (F()) {
            return 1;
        }
        d dVar = (d) f15185f.get(this);
        if (dVar == null) {
            B0.b.a(f15185f, this, null, new d(j10));
            Object obj = f15185f.get(this);
            AbstractC4862t.b(obj);
            dVar = (d) obj;
        }
        return cVar.p(j10, dVar, this);
    }

    public final InterfaceC2127f0 B1(long j10, Runnable runnable) {
        long jC = AbstractC2143n0.c(j10);
        if (jC >= 4611686018427387903L) {
            return M0.f15143a;
        }
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        long jA = abstractC2118b != null ? abstractC2118b.a() : System.nanoTime();
        b bVar = new b(jC + jA, runnable);
        z1(jA, bVar);
        return bVar;
    }

    public final void C1(boolean z10) {
        f15186g.set(this, z10 ? 1 : 0);
    }

    public final boolean D1(c cVar) {
        d dVar = (d) f15185f.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    @Override // Rd.W
    public void G(long j10, InterfaceC2138l interfaceC2138l) {
        long jC = AbstractC2143n0.c(j10);
        if (jC < 4611686018427387903L) {
            AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
            long jA = abstractC2118b != null ? abstractC2118b.a() : System.nanoTime();
            a aVar = new a(jC + jA, interfaceC2138l);
            z1(jA, aVar);
            AbstractC2146p.a(interfaceC2138l, aVar);
        }
    }

    public InterfaceC2127f0 H(long j10, Runnable runnable, InterfaceC4992i interfaceC4992i) {
        return W.a.a(this, j10, runnable, interfaceC4992i);
    }

    @Override // Rd.AbstractC2135j0
    public long c1() {
        c cVar;
        if (super.c1() == 0) {
            return 0L;
        }
        Object obj = f15184e.get(this);
        if (obj != null) {
            if (!(obj instanceof Wd.r)) {
                return obj == AbstractC2143n0.f15200b ? Long.MAX_VALUE : 0L;
            }
            if (!((Wd.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f15185f.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f15190a;
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        return Bc.k.f(j10 - (abstractC2118b != null ? abstractC2118b.a() : System.nanoTime()), 0L);
    }

    @Override // Rd.AbstractC2135j0
    public long h1() {
        if (i1()) {
            return 0L;
        }
        r1();
        Runnable runnableP1 = p1();
        if (runnableP1 == null) {
            return c1();
        }
        runnableP1.run();
        return 0L;
    }

    @Override // Rd.I
    public final void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        q1(runnable);
    }

    public final void o1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15184e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (B0.b.a(f15184e, this, null, AbstractC2143n0.f15200b)) {
                    return;
                }
            } else if (obj instanceof Wd.r) {
                ((Wd.r) obj).d();
                return;
            } else {
                if (obj == AbstractC2143n0.f15200b) {
                    return;
                }
                Wd.r rVar = new Wd.r(8, true);
                AbstractC4862t.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (B0.b.a(f15184e, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable p1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15184e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof Wd.r) {
                AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Wd.r rVar = (Wd.r) obj;
                Object objM = rVar.m();
                if (objM != Wd.r.f17948h) {
                    return (Runnable) objM;
                }
                B0.b.a(f15184e, this, obj, rVar.l());
            } else {
                if (obj == AbstractC2143n0.f15200b) {
                    return null;
                }
                if (B0.b.a(f15184e, this, obj, null)) {
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void q1(Runnable runnable) {
        r1();
        if (s1(runnable)) {
            m1();
        } else {
            S.f15149h.q1(runnable);
        }
    }

    public final void r1() {
        Wd.Q qI;
        d dVar = (d) f15185f.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        long jA = abstractC2118b != null ? abstractC2118b.a() : System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Wd.Q qB = dVar.b();
                    if (qB != null) {
                        c cVar = (c) qB;
                        qI = cVar.q(jA) ? s1(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) qI) != null);
    }

    public final boolean s1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15184e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (F()) {
                return false;
            }
            if (obj == null) {
                if (B0.b.a(f15184e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof Wd.r) {
                AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Wd.r rVar = (Wd.r) obj;
                int iA = rVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    B0.b.a(f15184e, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC2143n0.f15200b) {
                    return false;
                }
                Wd.r rVar2 = new Wd.r(8, true);
                AbstractC4862t.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (B0.b.a(f15184e, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // Rd.AbstractC2135j0
    public void shutdown() {
        X0.f15153a.c();
        C1(true);
        o1();
        while (h1() <= 0) {
        }
        x1();
    }

    public boolean w1() {
        if (!g1()) {
            return false;
        }
        d dVar = (d) f15185f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f15184e.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof Wd.r ? ((Wd.r) obj).j() : obj == AbstractC2143n0.f15200b;
    }

    public final void x1() {
        c cVar;
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        long jA = abstractC2118b != null ? abstractC2118b.a() : System.nanoTime();
        while (true) {
            d dVar = (d) f15185f.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                l1(jA, cVar);
            }
        }
    }

    public final void y1() {
        f15184e.set(this, null);
        f15185f.set(this, null);
    }

    public final void z1(long j10, c cVar) {
        int iA1 = A1(j10, cVar);
        if (iA1 == 0) {
            if (D1(cVar)) {
                m1();
            }
        } else if (iA1 == 1) {
            l1(j10, cVar);
        } else if (iA1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }
}
