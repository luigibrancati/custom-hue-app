package Rd;

import Rd.InterfaceC2136k;
import Wd.C2329i;
import fc.C4015H;
import fc.C4025h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.InterfaceC5161e;

/* JADX INFO: renamed from: Rd.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C2142n extends AbstractC2117a0 implements InterfaceC2138l, InterfaceC5161e, e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15194f = AtomicIntegerFieldUpdater.newUpdater(C2142n.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15195g = AtomicReferenceFieldUpdater.newUpdater(C2142n.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15196h = AtomicReferenceFieldUpdater.newUpdater(C2142n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4988e f15197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4992i f15198e;

    public C2142n(InterfaceC4988e interfaceC4988e, int i10) {
        super(i10);
        this.f15197d = interfaceC4988e;
        this.f15198e = interfaceC4988e.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2122d.f15165a;
    }

    public static final C4015H Q(vc.l lVar, Throwable th, Object obj, InterfaceC4992i interfaceC4992i) {
        lVar.invoke(th);
        return C4015H.f34254a;
    }

    public static /* synthetic */ void S(C2142n c2142n, Object obj, int i10, vc.q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        c2142n.R(obj, i10, qVar);
    }

    @Override // Rd.InterfaceC2138l
    public void A(Object obj) {
        s(this.f15160c);
    }

    public void E() {
        InterfaceC2127f0 interfaceC2127f0F = F();
        if (interfaceC2127f0F != null && I()) {
            interfaceC2127f0F.dispose();
            f15196h.set(this, M0.f15143a);
        }
    }

    public final InterfaceC2127f0 F() {
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) getContext().get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 == null) {
            return null;
        }
        InterfaceC2127f0 interfaceC2127f0M = D0.m(interfaceC2166z0, false, new r(this), 1, null);
        B0.b.a(f15196h, this, null, interfaceC2127f0M);
        return interfaceC2127f0M;
    }

    public final void G(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15195g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C2122d) {
                if (B0.b.a(f15195g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC2136k) || (obj2 instanceof Wd.B)) {
                K(obj, obj2);
            } else {
                if (obj2 instanceof A) {
                    A a10 = (A) obj2;
                    if (!a10.c()) {
                        K(obj, obj2);
                    }
                    if (obj2 instanceof C2148q) {
                        Throwable th = a10.f15106a;
                        if (obj instanceof InterfaceC2136k) {
                            m((InterfaceC2136k) obj, th);
                            return;
                        } else {
                            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((Wd.B) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof C2165z) {
                    C2165z c2165z = (C2165z) obj2;
                    if (c2165z.f15214b != null) {
                        K(obj, obj2);
                    }
                    if (obj instanceof Wd.B) {
                        return;
                    }
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC2136k interfaceC2136k = (InterfaceC2136k) obj;
                    if (c2165z.c()) {
                        m(interfaceC2136k, c2165z.f15217e);
                        return;
                    } else {
                        if (B0.b.a(f15195g, this, obj2, C2165z.b(c2165z, null, interfaceC2136k, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Wd.B) {
                        return;
                    }
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (B0.b.a(f15195g, this, obj2, new C2165z(obj2, (InterfaceC2136k) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void H(InterfaceC2136k interfaceC2136k) {
        G(interfaceC2136k);
    }

    public boolean I() {
        return !(x() instanceof N0);
    }

    public final boolean J() {
        if (!AbstractC2119b0.c(this.f15160c)) {
            return false;
        }
        InterfaceC4988e interfaceC4988e = this.f15197d;
        AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2329i) interfaceC4988e).p();
    }

    public final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable th) {
        if (p(th)) {
            return;
        }
        l(th);
        r();
    }

    public final void N() {
        Throwable thS;
        InterfaceC4988e interfaceC4988e = this.f15197d;
        C2329i c2329i = interfaceC4988e instanceof C2329i ? (C2329i) interfaceC4988e : null;
        if (c2329i == null || (thS = c2329i.s(this)) == null) {
            return;
        }
        q();
        l(thS);
    }

    public final boolean O() {
        Object obj = f15195g.get(this);
        if ((obj instanceof C2165z) && ((C2165z) obj).f15216d != null) {
            q();
            return false;
        }
        f15194f.set(this, 536870911);
        f15195g.set(this, C2122d.f15165a);
        return true;
    }

    public void P(Object obj, final vc.l lVar) {
        R(obj, this.f15160c, lVar != null ? new vc.q() { // from class: Rd.m
            @Override // vc.q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return C2142n.Q(lVar, (Throwable) obj2, obj3, (InterfaceC4992i) obj4);
            }
        } : null);
    }

    public final void R(Object obj, int i10, vc.q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15195g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof N0)) {
                C2142n c2142n = this;
                Object obj3 = obj;
                vc.q qVar2 = qVar;
                if (obj2 instanceof C2148q) {
                    C2148q c2148q = (C2148q) obj2;
                    if (c2148q.e()) {
                        if (qVar2 != null) {
                            c2142n.n(qVar2, c2148q.f15106a, obj3);
                            return;
                        }
                        return;
                    }
                }
                c2142n.k(obj3);
                throw new C4025h();
            }
            C2142n c2142n2 = this;
            Object obj4 = obj;
            int i11 = i10;
            vc.q qVar3 = qVar;
            if (B0.b.a(f15195g, c2142n2, obj2, c2142n2.T((N0) obj2, obj4, i11, qVar3, null))) {
                c2142n2.r();
                c2142n2.s(i11);
                return;
            } else {
                this = c2142n2;
                obj = obj4;
                i10 = i11;
                qVar = qVar3;
            }
        }
    }

    public final Object T(N0 n02, Object obj, int i10, vc.q qVar, Object obj2) {
        if (obj instanceof A) {
            return obj;
        }
        if ((AbstractC2119b0.b(i10) || obj2 != null) && !(qVar == null && !(n02 instanceof InterfaceC2136k) && obj2 == null)) {
            return new C2165z(obj, n02 instanceof InterfaceC2136k ? (InterfaceC2136k) n02 : null, qVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean U() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15194f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f15194f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    public final Wd.E V(Object obj, Object obj2, vc.q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15195g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof N0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C2165z) && obj4 != null && ((C2165z) obj3).f15216d == obj4) {
                    return AbstractC2144o.f15201a;
                }
                return null;
            }
            C2142n c2142n = this;
            Object obj5 = obj;
            Object obj6 = obj2;
            vc.q qVar2 = qVar;
            if (B0.b.a(f15195g, c2142n, obj3, c2142n.T((N0) obj3, obj5, this.f15160c, qVar2, obj6))) {
                c2142n.r();
                return AbstractC2144o.f15201a;
            }
            this = c2142n;
            obj = obj5;
            qVar = qVar2;
            obj2 = obj6;
        }
    }

    public final boolean W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15194f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f15194f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // Rd.AbstractC2117a0
    public void a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15195g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof N0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof A) {
                return;
            }
            if (obj2 instanceof C2165z) {
                C2165z c2165z = (C2165z) obj2;
                if (c2165z.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (B0.b.a(f15195g, this, obj2, C2165z.b(c2165z, null, null, null, null, th3, 15, null))) {
                    c2165z.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (B0.b.a(f15195g, this, obj2, new C2165z(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // Rd.InterfaceC2138l
    public void b(vc.l lVar) {
        AbstractC2146p.c(this, new InterfaceC2136k.a(lVar));
    }

    @Override // Rd.e1
    public void c(Wd.B b10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15194f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        G(b10);
    }

    @Override // Rd.AbstractC2117a0
    public final InterfaceC4988e d() {
        return this.f15197d;
    }

    @Override // Rd.InterfaceC2138l
    public void e(I i10, Object obj) {
        InterfaceC4988e interfaceC4988e = this.f15197d;
        C2329i c2329i = interfaceC4988e instanceof C2329i ? (C2329i) interfaceC4988e : null;
        S(this, obj, (c2329i != null ? c2329i.f17925d : null) == i10 ? 4 : this.f15160c, null, 4, null);
    }

    @Override // Rd.AbstractC2117a0
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // Rd.AbstractC2117a0
    public Object g(Object obj) {
        return obj instanceof C2165z ? ((C2165z) obj).f15213a : obj;
    }

    @Override // nc.InterfaceC5161e
    public InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.f15197d;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return this.f15198e;
    }

    @Override // Rd.AbstractC2117a0
    public Object i() {
        return x();
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // Rd.InterfaceC2138l
    public boolean l(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15195g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof N0)) {
                return false;
            }
        } while (!B0.b.a(f15195g, this, obj, new C2148q(this, th, (obj instanceof InterfaceC2136k) || (obj instanceof Wd.B))));
        N0 n02 = (N0) obj;
        if (n02 instanceof InterfaceC2136k) {
            m((InterfaceC2136k) obj, th);
        } else if (n02 instanceof Wd.B) {
            o((Wd.B) obj, th);
        }
        r();
        s(this.f15160c);
        return true;
    }

    public final void m(InterfaceC2136k interfaceC2136k, Throwable th) {
        try {
            interfaceC2136k.a(th);
        } catch (Throwable th2) {
            K.a(getContext(), new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(vc.q qVar, Throwable th, Object obj) {
        try {
            qVar.invoke(th, obj, getContext());
        } catch (Throwable th2) {
            K.a(getContext(), new B("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(Wd.B b10, Throwable th) {
        int i10 = f15194f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            b10.s(i10, th, getContext());
        } catch (Throwable th2) {
            K.a(getContext(), new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean p(Throwable th) {
        if (!J()) {
            return false;
        }
        InterfaceC4988e interfaceC4988e = this.f15197d;
        AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2329i) interfaceC4988e).q(th);
    }

    public final void q() {
        InterfaceC2127f0 interfaceC2127f0U = u();
        if (interfaceC2127f0U == null) {
            return;
        }
        interfaceC2127f0U.dispose();
        f15196h.set(this, M0.f15143a);
    }

    public final void r() {
        if (J()) {
            return;
        }
        q();
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        S(this, C.c(obj, this), this.f15160c, null, 4, null);
    }

    public final void s(int i10) {
        if (U()) {
            return;
        }
        AbstractC2119b0.a(this, i10);
    }

    public Throwable t(InterfaceC2166z0 interfaceC2166z0) {
        return interfaceC2166z0.h();
    }

    public String toString() {
        return L() + '(' + Q.c(this.f15197d) + "){" + z() + "}@" + Q.b(this);
    }

    public final InterfaceC2127f0 u() {
        return (InterfaceC2127f0) f15196h.get(this);
    }

    @Override // Rd.InterfaceC2138l
    public Object v(Object obj, Object obj2, vc.q qVar) {
        return V(obj, obj2, qVar);
    }

    public final Object w() {
        InterfaceC2166z0 interfaceC2166z0;
        boolean zJ = J();
        if (W()) {
            if (u() == null) {
                F();
            }
            if (zJ) {
                N();
            }
            return C5046c.f();
        }
        if (zJ) {
            N();
        }
        Object objX = x();
        if (objX instanceof A) {
            throw ((A) objX).f15106a;
        }
        if (!AbstractC2119b0.b(this.f15160c) || (interfaceC2166z0 = (InterfaceC2166z0) getContext().get(InterfaceC2166z0.f15218M)) == null || interfaceC2166z0.c()) {
            return g(objX);
        }
        CancellationException cancellationExceptionH = interfaceC2166z0.h();
        a(objX, cancellationExceptionH);
        throw cancellationExceptionH;
    }

    public final Object x() {
        return f15195g.get(this);
    }

    @Override // Rd.InterfaceC2138l
    public void y(Object obj, vc.q qVar) {
        R(obj, this.f15160c, qVar);
    }

    public final String z() {
        Object objX = x();
        return objX instanceof N0 ? "Active" : objX instanceof C2148q ? "Cancelled" : "Completed";
    }
}
