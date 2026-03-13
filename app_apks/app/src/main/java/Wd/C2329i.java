package Wd;

import Rd.AbstractC2117a0;
import Rd.AbstractC2135j0;
import Rd.C2142n;
import Rd.InterfaceC2138l;
import Rd.X0;
import fc.C4015H;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.InterfaceC5161e;

/* JADX INFO: renamed from: Wd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2329i extends AbstractC2117a0 implements InterfaceC5161e, InterfaceC4988e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17924h = AtomicReferenceFieldUpdater.newUpdater(C2329i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rd.I f17925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4988e f17926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f17927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17928g;

    public C2329i(Rd.I i10, InterfaceC4988e interfaceC4988e) {
        super(-1);
        this.f17925d = i10;
        this.f17926e = interfaceC4988e;
        this.f17927f = AbstractC2330j.f17929a;
        this.f17928g = L.g(getContext());
    }

    @Override // nc.InterfaceC5161e
    public InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.f17926e;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return this.f17926e.getContext();
    }

    @Override // Rd.AbstractC2117a0
    public Object i() {
        Object obj = this.f17927f;
        this.f17927f = AbstractC2330j.f17929a;
        return obj;
    }

    public final void j() {
        while (f17924h.get(this) == AbstractC2330j.f17930b) {
        }
    }

    public final C2142n k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17924h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f17924h.set(this, AbstractC2330j.f17930b);
                return null;
            }
            if (obj instanceof C2142n) {
                if (B0.b.a(f17924h, this, obj, AbstractC2330j.f17930b)) {
                    return (C2142n) obj;
                }
            } else if (obj != AbstractC2330j.f17930b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(InterfaceC4992i interfaceC4992i, Object obj) {
        this.f17927f = obj;
        this.f15160c = 1;
        this.f17925d.p0(interfaceC4992i, this);
    }

    public final C2142n n() {
        Object obj = f17924h.get(this);
        if (obj instanceof C2142n) {
            return (C2142n) obj;
        }
        return null;
    }

    public final boolean p() {
        return f17924h.get(this) != null;
    }

    public final boolean q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17924h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            E e10 = AbstractC2330j.f17930b;
            if (AbstractC4862t.a(obj, e10)) {
                if (B0.b.a(f17924h, this, e10, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (B0.b.a(f17924h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        C2142n c2142nN = n();
        if (c2142nN != null) {
            c2142nN.q();
        }
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        Object objB = Rd.C.b(obj);
        if (AbstractC2330j.d(this.f17925d, getContext())) {
            this.f17927f = objB;
            this.f15160c = 0;
            AbstractC2330j.c(this.f17925d, getContext(), this);
            return;
        }
        AbstractC2135j0 abstractC2135j0B = X0.f15153a.b();
        if (abstractC2135j0B.f1()) {
            this.f17927f = objB;
            this.f15160c = 0;
            abstractC2135j0B.W0(this);
            return;
        }
        abstractC2135j0B.d1(true);
        try {
            InterfaceC4992i context = getContext();
            Object objI = L.i(context, this.f17928g);
            try {
                this.f17926e.resumeWith(obj);
                C4015H c4015h = C4015H.f34254a;
                while (abstractC2135j0B.i1()) {
                }
            } finally {
                L.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(InterfaceC2138l interfaceC2138l) {
        E e10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17924h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e10 = AbstractC2330j.f17930b;
            if (obj != e10) {
                if (obj instanceof Throwable) {
                    if (B0.b.a(f17924h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!B0.b.a(f17924h, this, e10, interfaceC2138l));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f17925d + ", " + Rd.Q.c(this.f17926e) + ']';
    }

    @Override // Rd.AbstractC2117a0
    public InterfaceC4988e d() {
        return this;
    }
}
