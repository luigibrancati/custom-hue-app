package Rd;

import Rd.InterfaceC2166z0;
import Wd.C2336p;
import fc.C4015H;
import fc.C4022e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class F0 implements InterfaceC2166z0, InterfaceC2155u, O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15112a = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15113b = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends C2142n {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final F0 f15114i;

        public a(InterfaceC4988e interfaceC4988e, F0 f02) {
            super(interfaceC4988e, 1);
            this.f15114i = f02;
        }

        @Override // Rd.C2142n
        public String L() {
            return "AwaitContinuation";
        }

        @Override // Rd.C2142n
        public Throwable t(InterfaceC2166z0 interfaceC2166z0) {
            Throwable thF;
            Object objH0 = this.f15114i.h0();
            return (!(objH0 instanceof c) || (thF = ((c) objH0).f()) == null) ? objH0 instanceof A ? ((A) objH0).f15106a : interfaceC2166z0.h() : thF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends E0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F0 f15115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c f15116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C2153t f15117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f15118h;

        public b(F0 f02, c cVar, C2153t c2153t, Object obj) {
            this.f15115e = f02;
            this.f15116f = cVar;
            this.f15117g = c2153t;
            this.f15118h = obj;
        }

        @Override // Rd.E0
        public boolean v() {
            return false;
        }

        @Override // Rd.E0
        public void w(Throwable th) {
            this.f15115e.T(this.f15116f, this.f15117g, this.f15118h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC2158v0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f15119b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f15120c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f15121d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K0 f15122a;

        public c(K0 k02, boolean z10, Throwable th) {
            this.f15122a = k02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        @Override // Rd.InterfaceC2158v0
        public K0 a() {
            return this.f15122a;
        }

        public final void b(Throwable th) {
            Throwable thF = f();
            if (thF == null) {
                p(th);
                return;
            }
            if (th == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(th);
                return;
            }
            if (objE instanceof Throwable) {
                if (th == objE) {
                    return;
                }
                ArrayList arrayListD = d();
                arrayListD.add(objE);
                arrayListD.add(th);
                o(arrayListD);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // Rd.InterfaceC2158v0
        public boolean c() {
            return f() == null;
        }

        public final ArrayList d() {
            return new ArrayList(4);
        }

        public final Object e() {
            return f15121d.get(this);
        }

        public final Throwable f() {
            return (Throwable) f15120c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f15119b.get(this) == 1;
        }

        public final boolean l() {
            return e() == G0.f15132e;
        }

        public final List m(Throwable th) {
            ArrayList arrayListD;
            Object objE = e();
            if (objE == null) {
                arrayListD = d();
            } else if (objE instanceof Throwable) {
                ArrayList arrayListD2 = d();
                arrayListD2.add(objE);
                arrayListD = arrayListD2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListD = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListD.add(0, thF);
            }
            if (th != null && !AbstractC4862t.a(th, thF)) {
                arrayListD.add(th);
            }
            o(G0.f15132e);
            return arrayListD;
        }

        public final void n(boolean z10) {
            f15119b.set(this, z10 ? 1 : 0);
        }

        public final void o(Object obj) {
            f15121d.set(this, obj);
        }

        public final void p(Throwable th) {
            f15120c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + a() + ']';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.k implements vc.p {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f15123k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f15124l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f15125m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f15126n;

        public d(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Nd.j jVar, InterfaceC4988e interfaceC4988e) {
            return ((d) create(jVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            d dVar = F0.this.new d(interfaceC4988e);
            dVar.f15126n = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r6.a(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r4.a(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r5.f15125m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f15124l
                Wd.p r1 = (Wd.C2336p) r1
                java.lang.Object r3 = r5.f15123k
                Wd.o r3 = (Wd.C2335o) r3
                java.lang.Object r4 = r5.f15126n
                Nd.j r4 = (Nd.j) r4
                fc.AbstractC4036s.b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L26:
                fc.AbstractC4036s.b(r6)
                goto L86
            L2a:
                fc.AbstractC4036s.b(r6)
                java.lang.Object r6 = r5.f15126n
                Nd.j r6 = (Nd.j) r6
                Rd.F0 r1 = Rd.F0.this
                java.lang.Object r1 = r1.h0()
                boolean r4 = r1 instanceof Rd.C2153t
                if (r4 == 0) goto L48
                Rd.t r1 = (Rd.C2153t) r1
                Rd.u r1 = r1.f15206e
                r5.f15125m = r3
                java.lang.Object r5 = r6.a(r1, r5)
                if (r5 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof Rd.InterfaceC2158v0
                if (r3 == 0) goto L86
                Rd.v0 r1 = (Rd.InterfaceC2158v0) r1
                Rd.K0 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.AbstractC4862t.c(r3, r4)
                Wd.p r3 = (Wd.C2336p) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.AbstractC4862t.a(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof Rd.C2153t
                if (r6 == 0) goto L81
                r6 = r1
                Rd.t r6 = (Rd.C2153t) r6
                Rd.u r6 = r6.f15206e
                r5.f15126n = r4
                r5.f15123k = r3
                r5.f15124l = r1
                r5.f15125m = r2
                java.lang.Object r6 = r4.a(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                Wd.p r1 = r1.l()
                goto L63
            L86:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Rd.F0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public F0(boolean z10) {
        this._state$volatile = z10 ? G0.f15134g : G0.f15133f;
    }

    public static /* synthetic */ CancellationException I0(F0 f02, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return f02.H0(th, str);
    }

    public final void B0(C2133i0 c2133i0) {
        K0 k02 = new K0();
        Object c2156u0 = k02;
        if (!c2133i0.c()) {
            c2156u0 = new C2156u0(k02);
        }
        B0.b.a(f15112a, this, c2133i0, c2156u0);
    }

    public final void C0(E0 e02) {
        e02.f(new K0());
        B0.b.a(f15112a, this, e02, e02.l());
    }

    @Override // Rd.O0
    public CancellationException D() {
        Throwable thF;
        Object objH0 = h0();
        if (objH0 instanceof c) {
            thF = ((c) objH0).f();
        } else if (objH0 instanceof A) {
            thF = ((A) objH0).f15106a;
        } else {
            if (objH0 instanceof InterfaceC2158v0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objH0).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new A0("Parent job is " + G0(objH0), thF, this);
    }

    public final void D0(E0 e02) {
        Object objH0;
        do {
            objH0 = h0();
            if (!(objH0 instanceof E0)) {
                if (!(objH0 instanceof InterfaceC2158v0) || ((InterfaceC2158v0) objH0).a() == null) {
                    return;
                }
                e02.r();
                return;
            }
            if (objH0 != e02) {
                return;
            }
        } while (!B0.b.a(f15112a, this, objH0, G0.f15134g));
    }

    public final void E0(InterfaceC2151s interfaceC2151s) {
        f15113b.set(this, interfaceC2151s);
    }

    @Override // Rd.InterfaceC2166z0
    public final boolean F() {
        return !(h0() instanceof InterfaceC2158v0);
    }

    public final int F0(Object obj) {
        if (obj instanceof C2133i0) {
            if (((C2133i0) obj).c()) {
                return 0;
            }
            if (!B0.b.a(f15112a, this, obj, G0.f15134g)) {
                return -1;
            }
            A0();
            return 1;
        }
        if (!(obj instanceof C2156u0)) {
            return 0;
        }
        if (!B0.b.a(f15112a, this, obj, ((C2156u0) obj).a())) {
            return -1;
        }
        A0();
        return 1;
    }

    public final void G(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                C4022e.a(th, th2);
            }
        }
    }

    public final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC2158v0 ? ((InterfaceC2158v0) obj).c() ? "Active" : "New" : obj instanceof A ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public final CancellationException H0(Throwable th, String str) {
        CancellationException a02 = th instanceof CancellationException ? (CancellationException) th : null;
        if (a02 == null) {
            if (str == null) {
                str = Q();
            }
            a02 = new A0(str, th, this);
        }
        return a02;
    }

    public final Object I(InterfaceC4988e interfaceC4988e) throws Throwable {
        Object objH0;
        do {
            objH0 = h0();
            if (!(objH0 instanceof InterfaceC2158v0)) {
                if (objH0 instanceof A) {
                    throw ((A) objH0).f15106a;
                }
                return G0.h(objH0);
            }
        } while (F0(objH0) < 0);
        return J(interfaceC4988e);
    }

    public final Object J(InterfaceC4988e interfaceC4988e) {
        a aVar = new a(C5045b.c(interfaceC4988e), this);
        aVar.E();
        AbstractC2146p.a(aVar, D0.m(this, false, new P0(aVar), 1, null));
        Object objW = aVar.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW;
    }

    public final String J0() {
        return u0() + '{' + G0(h0()) + '}';
    }

    @Override // Rd.InterfaceC2166z0
    public final InterfaceC2151s K(InterfaceC2155u interfaceC2155u) {
        C2153t c2153t = new C2153t(interfaceC2155u);
        c2153t.x(this);
        while (true) {
            Object objH0 = h0();
            if (objH0 instanceof C2133i0) {
                C2133i0 c2133i0 = (C2133i0) objH0;
                if (!c2133i0.c()) {
                    B0(c2133i0);
                } else if (B0.b.a(f15112a, this, objH0, c2153t)) {
                    return c2153t;
                }
            } else {
                if (!(objH0 instanceof InterfaceC2158v0)) {
                    Object objH02 = h0();
                    A a10 = objH02 instanceof A ? (A) objH02 : null;
                    c2153t.w(a10 != null ? a10.f15106a : null);
                    return M0.f15143a;
                }
                K0 k0A = ((InterfaceC2158v0) objH0).a();
                if (k0A != null) {
                    if (!k0A.d(c2153t, 7)) {
                        boolean zD = k0A.d(c2153t, 3);
                        Object objH03 = h0();
                        if (objH03 instanceof c) {
                            thF = ((c) objH03).f();
                        } else {
                            A a11 = objH03 instanceof A ? (A) objH03 : null;
                            if (a11 != null) {
                                thF = a11.f15106a;
                            }
                        }
                        c2153t.w(thF);
                        if (!zD) {
                            return M0.f15143a;
                        }
                    }
                    return c2153t;
                }
                AbstractC4862t.c(objH0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                C0((E0) objH0);
            }
        }
    }

    public final boolean K0(InterfaceC2158v0 interfaceC2158v0, Object obj) throws Throwable {
        if (!B0.b.a(f15112a, this, interfaceC2158v0, G0.g(obj))) {
            return false;
        }
        y0(null);
        z0(obj);
        S(interfaceC2158v0, obj);
        return true;
    }

    public final boolean L(Throwable th) {
        return M(th);
    }

    public final boolean L0(InterfaceC2158v0 interfaceC2158v0, Throwable th) throws Throwable {
        K0 k0D0 = d0(interfaceC2158v0);
        if (k0D0 == null) {
            return false;
        }
        if (!B0.b.a(f15112a, this, interfaceC2158v0, new c(k0D0, false, th))) {
            return false;
        }
        w0(k0D0, th);
        return true;
    }

    public final boolean M(Object obj) throws Throwable {
        Object objR0 = G0.f15128a;
        if (c0() && (objR0 = O(obj)) == G0.f15129b) {
            return true;
        }
        if (objR0 == G0.f15128a) {
            objR0 = r0(obj);
        }
        if (objR0 == G0.f15128a || objR0 == G0.f15129b) {
            return true;
        }
        if (objR0 == G0.f15131d) {
            return false;
        }
        H(objR0);
        return true;
    }

    public final Object M0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC2158v0) ? G0.f15128a : ((!(obj instanceof C2133i0) && !(obj instanceof E0)) || (obj instanceof C2153t) || (obj2 instanceof A)) ? N0((InterfaceC2158v0) obj, obj2) : K0((InterfaceC2158v0) obj, obj2) ? obj2 : G0.f15130c;
    }

    public void N(Throwable th) throws Throwable {
        M(th);
    }

    public final Object N0(InterfaceC2158v0 interfaceC2158v0, Object obj) throws Throwable {
        K0 k0D0 = d0(interfaceC2158v0);
        if (k0D0 == null) {
            return G0.f15130c;
        }
        c cVar = interfaceC2158v0 instanceof c ? (c) interfaceC2158v0 : null;
        if (cVar == null) {
            cVar = new c(k0D0, false, null);
        }
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        synchronized (cVar) {
            if (cVar.k()) {
                return G0.f15128a;
            }
            cVar.n(true);
            if (cVar != interfaceC2158v0 && !B0.b.a(f15112a, this, interfaceC2158v0, cVar)) {
                return G0.f15130c;
            }
            boolean zJ = cVar.j();
            A a10 = obj instanceof A ? (A) obj : null;
            if (a10 != null) {
                cVar.b(a10.f15106a);
            }
            Throwable thF = zJ ? null : cVar.f();
            l10.f39776a = thF;
            C4015H c4015h = C4015H.f34254a;
            if (thF != null) {
                w0(k0D0, thF);
            }
            C2153t c2153tV0 = v0(k0D0);
            if (c2153tV0 != null && O0(cVar, c2153tV0, obj)) {
                return G0.f15129b;
            }
            k0D0.g(2);
            C2153t c2153tV02 = v0(k0D0);
            return (c2153tV02 == null || !O0(cVar, c2153tV02, obj)) ? V(cVar, obj) : G0.f15129b;
        }
    }

    public final Object O(Object obj) {
        Object objM0;
        do {
            Object objH0 = h0();
            if (!(objH0 instanceof InterfaceC2158v0) || ((objH0 instanceof c) && ((c) objH0).k())) {
                return G0.f15128a;
            }
            objM0 = M0(objH0, new A(U(obj), false, 2, null));
        } while (objM0 == G0.f15130c);
        return objM0;
    }

    public final boolean O0(c cVar, C2153t c2153t, Object obj) {
        while (C0.l(c2153t.f15206e, false, new b(this, cVar, c2153t, obj)) == M0.f15143a) {
            c2153t = v0(c2153t);
            if (c2153t == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(Throwable th) {
        if (o0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC2151s interfaceC2151sF0 = f0();
        return (interfaceC2151sF0 == null || interfaceC2151sF0 == M0.f15143a) ? z10 : interfaceC2151sF0.b(th) || z10;
    }

    public String Q() {
        return "Job was cancelled";
    }

    public boolean R(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return M(th) && b0();
    }

    public final void S(InterfaceC2158v0 interfaceC2158v0, Object obj) throws Throwable {
        InterfaceC2151s interfaceC2151sF0 = f0();
        if (interfaceC2151sF0 != null) {
            interfaceC2151sF0.dispose();
            E0(M0.f15143a);
        }
        A a10 = obj instanceof A ? (A) obj : null;
        Throwable th = a10 != null ? a10.f15106a : null;
        if (!(interfaceC2158v0 instanceof E0)) {
            K0 k0A = interfaceC2158v0.a();
            if (k0A != null) {
                x0(k0A, th);
                return;
            }
            return;
        }
        try {
            ((E0) interfaceC2158v0).w(th);
        } catch (Throwable th2) {
            l0(new B("Exception in completion handler " + interfaceC2158v0 + " for " + this, th2));
        }
    }

    public final void T(c cVar, C2153t c2153t, Object obj) {
        C2153t c2153tV0 = v0(c2153t);
        if (c2153tV0 == null || !O0(cVar, c2153tV0, obj)) {
            cVar.a().g(2);
            C2153t c2153tV02 = v0(c2153t);
            if (c2153tV02 == null || !O0(cVar, c2153tV02, obj)) {
                H(V(cVar, obj));
            }
        }
    }

    public final Throwable U(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new A0(Q(), null, this) : th;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((O0) obj).D();
    }

    public final Object V(c cVar, Object obj) throws Throwable {
        boolean zJ;
        Throwable thZ;
        A a10 = obj instanceof A ? (A) obj : null;
        Throwable th = a10 != null ? a10.f15106a : null;
        synchronized (cVar) {
            zJ = cVar.j();
            List listM = cVar.m(th);
            thZ = Z(cVar, listM);
            if (thZ != null) {
                G(thZ, listM);
            }
        }
        if (thZ != null && thZ != th) {
            obj = new A(thZ, false, 2, null);
        }
        if (thZ != null && (P(thZ) || k0(thZ))) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((A) obj).c();
        }
        if (!zJ) {
            y0(thZ);
        }
        z0(obj);
        B0.b.a(f15112a, this, cVar, G0.g(obj));
        S(cVar, obj);
        return obj;
    }

    public final Object W() throws Throwable {
        Object objH0 = h0();
        if (objH0 instanceof InterfaceC2158v0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objH0 instanceof A) {
            throw ((A) objH0).f15106a;
        }
        return G0.h(objH0);
    }

    public final Throwable X(Object obj) {
        A a10 = obj instanceof A ? (A) obj : null;
        if (a10 != null) {
            return a10.f15106a;
        }
        return null;
    }

    public final Throwable Z(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new A0(Q(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof Y0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof Y0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // Rd.InterfaceC2166z0
    public void a(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new A0(Q(), null, this);
        }
        N(cancellationException);
    }

    @Override // Rd.InterfaceC2166z0
    public final Object a0(InterfaceC4988e interfaceC4988e) {
        if (p0()) {
            Object objQ0 = q0(interfaceC4988e);
            return objQ0 == C5046c.f() ? objQ0 : C4015H.f34254a;
        }
        C0.k(interfaceC4988e.getContext());
        return C4015H.f34254a;
    }

    public boolean b0() {
        return true;
    }

    @Override // Rd.InterfaceC2166z0
    public boolean c() {
        Object objH0 = h0();
        return (objH0 instanceof InterfaceC2158v0) && ((InterfaceC2158v0) objH0).c();
    }

    public boolean c0() {
        return false;
    }

    @Override // Rd.InterfaceC2166z0
    public final InterfaceC2127f0 d(boolean z10, boolean z11, vc.l lVar) {
        return n0(z11, z10 ? new C2162x0(lVar) : new C2164y0(lVar));
    }

    public final K0 d0(InterfaceC2158v0 interfaceC2158v0) {
        K0 k0A = interfaceC2158v0.a();
        if (k0A != null) {
            return k0A;
        }
        if (interfaceC2158v0 instanceof C2133i0) {
            return new K0();
        }
        if (interfaceC2158v0 instanceof E0) {
            C0((E0) interfaceC2158v0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC2158v0).toString());
    }

    public InterfaceC2166z0 e0() {
        InterfaceC2151s interfaceC2151sF0 = f0();
        if (interfaceC2151sF0 != null) {
            return interfaceC2151sF0.getParent();
        }
        return null;
    }

    public final InterfaceC2151s f0() {
        return (InterfaceC2151s) f15113b.get(this);
    }

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, vc.p pVar) {
        return InterfaceC2166z0.a.b(this, obj, pVar);
    }

    @Override // Rd.InterfaceC2166z0
    public final Nd.h g() {
        return Nd.k.b(new d(null));
    }

    @Override // lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        return InterfaceC2166z0.a.c(this, cVar);
    }

    @Override // lc.InterfaceC4992i.b
    public final InterfaceC4992i.c getKey() {
        return InterfaceC2166z0.f15218M;
    }

    @Override // Rd.InterfaceC2166z0
    public final CancellationException h() {
        Object objH0 = h0();
        if (!(objH0 instanceof c)) {
            if (objH0 instanceof InterfaceC2158v0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objH0 instanceof A) {
                return I0(this, ((A) objH0).f15106a, null, 1, null);
            }
            return new A0(Q.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((c) objH0).f();
        if (thF != null) {
            CancellationException cancellationExceptionH0 = H0(thF, Q.a(this) + " is cancelling");
            if (cancellationExceptionH0 != null) {
                return cancellationExceptionH0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object h0() {
        return f15112a.get(this);
    }

    @Override // Rd.InterfaceC2166z0
    public final boolean isCancelled() {
        Object objH0 = h0();
        if (objH0 instanceof A) {
            return true;
        }
        return (objH0 instanceof c) && ((c) objH0).j();
    }

    @Override // Rd.InterfaceC2155u
    public final void k(O0 o02) throws Throwable {
        M(o02);
    }

    public boolean k0(Throwable th) {
        return false;
    }

    public final void m0(InterfaceC2166z0 interfaceC2166z0) {
        if (interfaceC2166z0 == null) {
            E0(M0.f15143a);
            return;
        }
        interfaceC2166z0.start();
        InterfaceC2151s interfaceC2151sK = interfaceC2166z0.K(this);
        E0(interfaceC2151sK);
        if (F()) {
            interfaceC2151sK.dispose();
            E0(M0.f15143a);
        }
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return InterfaceC2166z0.a.d(this, cVar);
    }

    public final InterfaceC2127f0 n0(boolean z10, E0 e02) {
        boolean z11;
        boolean zD;
        e02.x(this);
        while (true) {
            Object objH0 = h0();
            z11 = true;
            if (!(objH0 instanceof C2133i0)) {
                if (!(objH0 instanceof InterfaceC2158v0)) {
                    z11 = false;
                    break;
                }
                InterfaceC2158v0 interfaceC2158v0 = (InterfaceC2158v0) objH0;
                K0 k0A = interfaceC2158v0.a();
                if (k0A == null) {
                    AbstractC4862t.c(objH0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    C0((E0) objH0);
                } else {
                    if (e02.v()) {
                        c cVar = interfaceC2158v0 instanceof c ? (c) interfaceC2158v0 : null;
                        Throwable thF = cVar != null ? cVar.f() : null;
                        if (thF != null) {
                            if (z10) {
                                e02.w(thF);
                            }
                            return M0.f15143a;
                        }
                        zD = k0A.d(e02, 5);
                    } else {
                        zD = k0A.d(e02, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                C2133i0 c2133i0 = (C2133i0) objH0;
                if (!c2133i0.c()) {
                    B0(c2133i0);
                } else if (B0.b.a(f15112a, this, objH0, e02)) {
                    break;
                }
            }
        }
        if (z11) {
            return e02;
        }
        if (z10) {
            Object objH02 = h0();
            A a10 = objH02 instanceof A ? (A) objH02 : null;
            e02.w(a10 != null ? a10.f15106a : null);
        }
        return M0.f15143a;
    }

    public boolean o0() {
        return false;
    }

    public final boolean p0() {
        Object objH0;
        do {
            objH0 = h0();
            if (!(objH0 instanceof InterfaceC2158v0)) {
                return false;
            }
        } while (F0(objH0) < 0);
        return true;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return InterfaceC2166z0.a.e(this, interfaceC4992i);
    }

    public final Object q0(InterfaceC4988e interfaceC4988e) {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        AbstractC2146p.a(c2142n, D0.m(this, false, new Q0(c2142n), 1, null));
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    public final Object r0(Object obj) throws Throwable {
        Throwable thU = null;
        while (true) {
            Object objH0 = h0();
            if (objH0 instanceof c) {
                synchronized (objH0) {
                    if (((c) objH0).l()) {
                        return G0.f15131d;
                    }
                    boolean zJ = ((c) objH0).j();
                    if (obj != null || !zJ) {
                        if (thU == null) {
                            thU = U(obj);
                        }
                        ((c) objH0).b(thU);
                    }
                    Throwable thF = zJ ? null : ((c) objH0).f();
                    if (thF != null) {
                        w0(((c) objH0).a(), thF);
                    }
                    return G0.f15128a;
                }
            }
            if (!(objH0 instanceof InterfaceC2158v0)) {
                return G0.f15131d;
            }
            if (thU == null) {
                thU = U(obj);
            }
            InterfaceC2158v0 interfaceC2158v0 = (InterfaceC2158v0) objH0;
            if (!interfaceC2158v0.c()) {
                Object objM0 = M0(objH0, new A(thU, false, 2, null));
                if (objM0 == G0.f15128a) {
                    throw new IllegalStateException(("Cannot happen in " + objH0).toString());
                }
                if (objM0 != G0.f15130c) {
                    return objM0;
                }
            } else if (L0(interfaceC2158v0, thU)) {
                return G0.f15128a;
            }
        }
    }

    public final boolean s0(Object obj) {
        Object objM0;
        do {
            objM0 = M0(h0(), obj);
            if (objM0 == G0.f15128a) {
                return false;
            }
            if (objM0 == G0.f15129b) {
                return true;
            }
        } while (objM0 == G0.f15130c);
        H(objM0);
        return true;
    }

    @Override // Rd.InterfaceC2166z0
    public final boolean start() {
        int iF0;
        do {
            iF0 = F0(h0());
            if (iF0 == 0) {
                return false;
            }
        } while (iF0 != 1);
        return true;
    }

    public final Object t0(Object obj) {
        Object objM0;
        do {
            objM0 = M0(h0(), obj);
            if (objM0 == G0.f15128a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (objM0 == G0.f15130c);
        return objM0;
    }

    public String toString() {
        return J0() + '@' + Q.b(this);
    }

    @Override // Rd.InterfaceC2166z0
    public final InterfaceC2127f0 u(vc.l lVar) {
        return n0(true, new C2164y0(lVar));
    }

    public String u0() {
        return Q.a(this);
    }

    public final C2153t v0(C2336p c2336p) {
        while (c2336p.q()) {
            c2336p = c2336p.m();
        }
        while (true) {
            c2336p = c2336p.l();
            if (!c2336p.q()) {
                if (c2336p instanceof C2153t) {
                    return (C2153t) c2336p;
                }
                if (c2336p instanceof K0) {
                    return null;
                }
            }
        }
    }

    public final void w0(K0 k02, Throwable th) throws Throwable {
        y0(th);
        k02.g(4);
        Object objK = k02.k();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        B b10 = null;
        for (C2336p c2336pL = (C2336p) objK; !AbstractC4862t.a(c2336pL, k02); c2336pL = c2336pL.l()) {
            if ((c2336pL instanceof E0) && ((E0) c2336pL).v()) {
                try {
                    ((E0) c2336pL).w(th);
                } catch (Throwable th2) {
                    if (b10 != null) {
                        C4022e.a(b10, th2);
                    } else {
                        b10 = new B("Exception in completion handler " + c2336pL + " for " + this, th2);
                        C4015H c4015h = C4015H.f34254a;
                    }
                }
            }
        }
        if (b10 != null) {
            l0(b10);
        }
        P(th);
    }

    public final void x0(K0 k02, Throwable th) throws Throwable {
        k02.g(1);
        Object objK = k02.k();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        B b10 = null;
        for (C2336p c2336pL = (C2336p) objK; !AbstractC4862t.a(c2336pL, k02); c2336pL = c2336pL.l()) {
            if (c2336pL instanceof E0) {
                try {
                    ((E0) c2336pL).w(th);
                } catch (Throwable th2) {
                    if (b10 != null) {
                        C4022e.a(b10, th2);
                    } else {
                        b10 = new B("Exception in completion handler " + c2336pL + " for " + this, th2);
                        C4015H c4015h = C4015H.f34254a;
                    }
                }
            }
        }
        if (b10 != null) {
            l0(b10);
        }
    }

    public void A0() {
    }

    public void H(Object obj) {
    }

    public void l0(Throwable th) throws Throwable {
        throw th;
    }

    public void y0(Throwable th) {
    }

    public void z0(Object obj) {
    }
}
