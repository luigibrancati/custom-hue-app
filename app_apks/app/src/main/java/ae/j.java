package ae;

import Rd.AbstractC2146p;
import Rd.C2142n;
import Rd.InterfaceC2138l;
import Rd.e1;
import Wd.AbstractC2322b;
import Wd.B;
import Wd.C;
import fc.C4015H;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import vc.p;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21242c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21243d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21244e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21245f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21246g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f21248b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4860q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21249a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m i(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).longValue(), (m) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b extends AbstractC4860q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21250a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m i(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).longValue(), (m) obj2);
        }
    }

    public j(int i10, int i11) {
        this.f21247a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.f21248b = new q() { // from class: ae.i
            @Override // vc.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return j.t(this.f21241a, (Throwable) obj, (C4015H) obj2, (InterfaceC4992i) obj3);
            }
        };
    }

    public static final C4015H t(j jVar, Throwable th, C4015H c4015h, InterfaceC4992i interfaceC4992i) {
        jVar.release();
        return C4015H.f34254a;
    }

    public final int b() {
        return Math.max(f21246g.get(this), 0);
    }

    public final boolean c() {
        while (true) {
            int i10 = f21246g.get(this);
            if (i10 > this.f21247a) {
                m();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f21246g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final Object d(InterfaceC4988e interfaceC4988e) {
        if (n() > 0) {
            return C4015H.f34254a;
        }
        Object objK = k(interfaceC4988e);
        return objK == C5046c.f() ? objK : C4015H.f34254a;
    }

    public final void j(InterfaceC2138l interfaceC2138l) {
        while (n() <= 0) {
            AbstractC4862t.c(interfaceC2138l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (l((e1) interfaceC2138l)) {
                return;
            }
        }
        interfaceC2138l.y(C4015H.f34254a, this.f21248b);
    }

    public final Object k(InterfaceC4988e interfaceC4988e) {
        C2142n c2142nB = AbstractC2146p.b(C5045b.c(interfaceC4988e));
        try {
            if (!l(c2142nB)) {
                j(c2142nB);
            }
            Object objW = c2142nB.w();
            if (objW == C5046c.f()) {
                nc.h.c(interfaceC4988e);
            }
            return objW == C5046c.f() ? objW : C4015H.f34254a;
        } catch (Throwable th) {
            c2142nB.N();
            throw th;
        }
    }

    public final boolean l(e1 e1Var) {
        Object objC;
        m mVar = (m) f21244e.get(this);
        long andIncrement = f21245f.getAndIncrement(this);
        a aVar = a.f21249a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21244e;
        long j10 = andIncrement / ((long) l.f21256f);
        loop0: while (true) {
            objC = AbstractC2322b.c(mVar, j10, aVar);
            if (!C.c(objC)) {
                B b10 = C.b(objC);
                while (true) {
                    B b11 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b11.f17897c >= b10.f17897c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (B0.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                        if (b11.p()) {
                            b11.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) C.b(objC);
        int i10 = (int) (andIncrement % ((long) l.f21256f));
        if (Td.l.a(mVar2.v(), i10, null, e1Var)) {
            e1Var.c(mVar2, i10);
            return true;
        }
        if (!Td.l.a(mVar2.v(), i10, l.f21252b, l.f21253c)) {
            return false;
        }
        if (e1Var instanceof InterfaceC2138l) {
            AbstractC4862t.c(e1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC2138l) e1Var).y(C4015H.f34254a, this.f21248b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + e1Var).toString());
    }

    public final void m() {
        int i10;
        do {
            i10 = f21246g.get(this);
            if (i10 <= this.f21247a) {
                return;
            }
        } while (!f21246g.compareAndSet(this, i10, this.f21247a));
    }

    public final int n() {
        int andDecrement;
        do {
            andDecrement = f21246g.getAndDecrement(this);
        } while (andDecrement > this.f21247a);
        return andDecrement;
    }

    public final void release() {
        do {
            int andIncrement = f21246g.getAndIncrement(this);
            if (andIncrement >= this.f21247a) {
                m();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f21247a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final boolean u(Object obj) {
        if (!(obj instanceof InterfaceC2138l)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC2138l interfaceC2138l = (InterfaceC2138l) obj;
        Object objV = interfaceC2138l.v(C4015H.f34254a, null, this.f21248b);
        if (objV == null) {
            return false;
        }
        interfaceC2138l.A(objV);
        return true;
    }

    public final boolean v() {
        Object objC;
        m mVar = (m) f21242c.get(this);
        long andIncrement = f21243d.getAndIncrement(this);
        long j10 = andIncrement / ((long) l.f21256f);
        b bVar = b.f21250a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21242c;
        loop0: while (true) {
            objC = AbstractC2322b.c(mVar, j10, bVar);
            if (C.c(objC)) {
                break;
            }
            B b10 = C.b(objC);
            while (true) {
                B b11 = (B) atomicReferenceFieldUpdater.get(this);
                if (b11.f17897c >= b10.f17897c) {
                    break loop0;
                }
                if (!b10.u()) {
                    break;
                }
                if (B0.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                    if (b11.p()) {
                        b11.n();
                    }
                } else if (b10.p()) {
                    b10.n();
                }
            }
        }
        m mVar2 = (m) C.b(objC);
        mVar2.c();
        if (mVar2.f17897c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) l.f21256f));
        Object andSet = mVar2.v().getAndSet(i10, l.f21252b);
        if (andSet != null) {
            if (andSet == l.f21255e) {
                return false;
            }
            return u(andSet);
        }
        int i11 = l.f21251a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (mVar2.v().get(i10) == l.f21253c) {
                return true;
            }
        }
        return !Td.l.a(mVar2.v(), i10, l.f21252b, l.f21254d);
    }
}
