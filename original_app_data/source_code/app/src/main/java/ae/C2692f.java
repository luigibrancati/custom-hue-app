package ae;

import Rd.AbstractC2146p;
import Rd.C2142n;
import Rd.I;
import Rd.InterfaceC2138l;
import Rd.Q;
import Rd.e1;
import Wd.B;
import ae.C2692f;
import fc.C4015H;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import vc.q;

/* JADX INFO: renamed from: ae.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C2692f extends j implements InterfaceC2687a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21234i = AtomicReferenceFieldUpdater.newUpdater(C2692f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f21235h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: ae.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements InterfaceC2138l, e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2142n f21236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f21237b;

        public a(C2142n c2142n, Object obj) {
            this.f21236a = c2142n;
            this.f21237b = obj;
        }

        public static final C4015H g(C2692f c2692f, a aVar, Throwable th) {
            c2692f.h(aVar.f21237b);
            return C4015H.f34254a;
        }

        public static final C4015H j(C2692f c2692f, a aVar, Throwable th, C4015H c4015h, InterfaceC4992i interfaceC4992i) {
            C2692f.z().set(c2692f, aVar.f21237b);
            c2692f.h(aVar.f21237b);
            return C4015H.f34254a;
        }

        @Override // Rd.InterfaceC2138l
        public void A(Object obj) {
            this.f21236a.A(obj);
        }

        @Override // Rd.InterfaceC2138l
        public void b(vc.l lVar) {
            this.f21236a.b(lVar);
        }

        @Override // Rd.e1
        public void c(B b10, int i10) {
            this.f21236a.c(b10, i10);
        }

        @Override // Rd.InterfaceC2138l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void y(C4015H c4015h, q qVar) {
            C2692f.z().set(C2692f.this, this.f21237b);
            C2142n c2142n = this.f21236a;
            final C2692f c2692f = C2692f.this;
            c2142n.P(c4015h, new vc.l() { // from class: ae.e
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C2692f.a.g(c2692f, this, (Throwable) obj);
                }
            });
        }

        @Override // lc.InterfaceC4988e
        public InterfaceC4992i getContext() {
            return this.f21236a.getContext();
        }

        @Override // Rd.InterfaceC2138l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(I i10, C4015H c4015h) {
            this.f21236a.e(i10, c4015h);
        }

        @Override // Rd.InterfaceC2138l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object v(C4015H c4015h, Object obj, q qVar) {
            final C2692f c2692f = C2692f.this;
            Object objV = this.f21236a.v(c4015h, obj, new q() { // from class: ae.d
                @Override // vc.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return C2692f.a.j(c2692f, this, (Throwable) obj2, (C4015H) obj3, (InterfaceC4992i) obj4);
                }
            });
            if (objV != null) {
                C2692f.z().set(C2692f.this, this.f21237b);
            }
            return objV;
        }

        @Override // Rd.InterfaceC2138l
        public boolean l(Throwable th) {
            return this.f21236a.l(th);
        }

        @Override // lc.InterfaceC4988e
        public void resumeWith(Object obj) {
            this.f21236a.resumeWith(obj);
        }
    }

    public C2692f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : AbstractC2693g.f21239a;
        this.f21235h = new q() { // from class: ae.b
            @Override // vc.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C2692f c2692f = this.f21227a;
                android.support.v4.media.session.a.a(obj);
                return C2692f.D(c2692f, null, obj2, obj3);
            }
        };
    }

    public static /* synthetic */ Object B(C2692f c2692f, Object obj, InterfaceC4988e interfaceC4988e) {
        if (c2692f.f(obj)) {
            return C4015H.f34254a;
        }
        Object objC = c2692f.C(obj, interfaceC4988e);
        return objC == C5046c.f() ? objC : C4015H.f34254a;
    }

    public static final q D(final C2692f c2692f, Zd.a aVar, final Object obj, Object obj2) {
        return new q() { // from class: ae.c
            @Override // vc.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return C2692f.E(this.f21228a, obj, (Throwable) obj3, obj4, (InterfaceC4992i) obj5);
            }
        };
    }

    public static final C4015H E(C2692f c2692f, Object obj, Throwable th, Object obj2, InterfaceC4992i interfaceC4992i) {
        c2692f.h(obj);
        return C4015H.f34254a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f21234i;
    }

    public final int A(Object obj) {
        while (g()) {
            Object obj2 = f21234i.get(this);
            if (obj2 != AbstractC2693g.f21239a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object C(Object obj, InterfaceC4988e interfaceC4988e) {
        C2142n c2142nB = AbstractC2146p.b(C5045b.c(interfaceC4988e));
        try {
            j(new a(c2142nB, obj));
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

    public final int F(Object obj) {
        while (!c()) {
            if (obj == null) {
                return 1;
            }
            int iA = A(obj);
            if (iA == 1) {
                return 2;
            }
            if (iA == 2) {
                return 1;
            }
        }
        f21234i.set(this, obj);
        return 0;
    }

    @Override // ae.InterfaceC2687a
    public Object a(Object obj, InterfaceC4988e interfaceC4988e) {
        return B(this, obj, interfaceC4988e);
    }

    @Override // ae.InterfaceC2687a
    public boolean f(Object obj) {
        int iF = F(obj);
        if (iF == 0) {
            return true;
        }
        if (iF == 1) {
            return false;
        }
        if (iF != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // ae.InterfaceC2687a
    public boolean g() {
        return b() == 0;
    }

    @Override // ae.InterfaceC2687a
    public void h(Object obj) {
        while (g()) {
            Object obj2 = f21234i.get(this);
            if (obj2 != AbstractC2693g.f21239a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (B0.b.a(f21234i, this, obj2, AbstractC2693g.f21239a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + Q.b(this) + "[isLocked=" + g() + ",owner=" + f21234i.get(this) + ']';
    }
}
