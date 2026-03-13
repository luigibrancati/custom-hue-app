package a2;

import G1.AbstractC0853a;
import P1.t;
import a2.InterfaceC2611D;
import a2.L;
import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: a2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2622h extends AbstractC2615a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f20816h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f20817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public I1.x f20818j;

    /* JADX INFO: renamed from: a2.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements L, P1.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public L.a f20820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t.a f20821c;

        public a(Object obj) {
            this.f20820b = AbstractC2622h.this.y(null);
            this.f20821c = AbstractC2622h.this.v(null);
            this.f20819a = obj;
        }

        @Override // P1.t
        public void A(int i10, InterfaceC2611D.b bVar) {
            if (x(i10, bVar)) {
                this.f20821c.i();
            }
        }

        @Override // P1.t
        public void B(int i10, InterfaceC2611D.b bVar) {
            if (x(i10, bVar)) {
                this.f20821c.h();
            }
        }

        @Override // a2.L
        public void E(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b) {
            if (x(i10, bVar)) {
                this.f20820b.q(c2638y, M(c2609b, bVar));
            }
        }

        @Override // a2.L
        public void F(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b, IOException iOException, boolean z10) {
            if (x(i10, bVar)) {
                this.f20820b.t(c2638y, M(c2609b, bVar), iOException, z10);
            }
        }

        @Override // a2.L
        public void H(int i10, InterfaceC2611D.b bVar, C2609B c2609b) {
            if (x(i10, bVar)) {
                this.f20820b.z(M(c2609b, bVar));
            }
        }

        @Override // a2.L
        public void I(int i10, InterfaceC2611D.b bVar, C2609B c2609b) {
            if (x(i10, bVar)) {
                this.f20820b.k(M(c2609b, bVar));
            }
        }

        @Override // P1.t
        public void J(int i10, InterfaceC2611D.b bVar) {
            if (x(i10, bVar)) {
                this.f20821c.m();
            }
        }

        @Override // P1.t
        public void K(int i10, InterfaceC2611D.b bVar, int i11) {
            if (x(i10, bVar)) {
                this.f20821c.k(i11);
            }
        }

        @Override // a2.L
        public void L(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b) {
            if (x(i10, bVar)) {
                this.f20820b.n(c2638y, M(c2609b, bVar));
            }
        }

        public final C2609B M(C2609B c2609b, InterfaceC2611D.b bVar) {
            long jI = AbstractC2622h.this.I(this.f20819a, c2609b.f20519f, bVar);
            long jI2 = AbstractC2622h.this.I(this.f20819a, c2609b.f20520g, bVar);
            return (jI == c2609b.f20519f && jI2 == c2609b.f20520g) ? c2609b : new C2609B(c2609b.f20514a, c2609b.f20515b, c2609b.f20516c, c2609b.f20517d, c2609b.f20518e, jI, jI2);
        }

        @Override // P1.t
        public void u(int i10, InterfaceC2611D.b bVar, Exception exc) {
            if (x(i10, bVar)) {
                this.f20821c.l(exc);
            }
        }

        @Override // a2.L
        public void v(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b, int i11) {
            if (x(i10, bVar)) {
                this.f20820b.w(c2638y, M(c2609b, bVar), i11);
            }
        }

        public final boolean x(int i10, InterfaceC2611D.b bVar) {
            InterfaceC2611D.b bVarH;
            if (bVar != null) {
                bVarH = AbstractC2622h.this.H(this.f20819a, bVar);
                if (bVarH == null) {
                    return false;
                }
            } else {
                bVarH = null;
            }
            int iJ = AbstractC2622h.this.J(this.f20819a, i10);
            L.a aVar = this.f20820b;
            if (aVar.f20549a != iJ || !Objects.equals(aVar.f20550b, bVarH)) {
                this.f20820b = AbstractC2622h.this.x(iJ, bVarH);
            }
            t.a aVar2 = this.f20821c;
            if (aVar2.f12670a == iJ && Objects.equals(aVar2.f12671b, bVarH)) {
                return true;
            }
            this.f20821c = AbstractC2622h.this.u(iJ, bVarH);
            return true;
        }

        @Override // P1.t
        public void z(int i10, InterfaceC2611D.b bVar) {
            if (x(i10, bVar)) {
                this.f20821c.j();
            }
        }
    }

    /* JADX INFO: renamed from: a2.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2611D f20823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2611D.c f20824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f20825c;

        public b(InterfaceC2611D interfaceC2611D, InterfaceC2611D.c cVar, a aVar) {
            this.f20823a = interfaceC2611D;
            this.f20824b = cVar;
            this.f20825c = aVar;
        }
    }

    @Override // a2.AbstractC2615a
    public void A() {
        for (b bVar : this.f20816h.values()) {
            bVar.f20823a.j(bVar.f20824b);
        }
    }

    @Override // a2.AbstractC2615a
    public void D(I1.x xVar) {
        this.f20818j = xVar;
        this.f20817i = G1.M.z();
    }

    @Override // a2.AbstractC2615a
    public void F() {
        for (b bVar : this.f20816h.values()) {
            bVar.f20823a.d(bVar.f20824b);
            bVar.f20823a.i(bVar.f20825c);
            bVar.f20823a.r(bVar.f20825c);
        }
        this.f20816h.clear();
    }

    public abstract InterfaceC2611D.b H(Object obj, InterfaceC2611D.b bVar);

    public abstract void K(Object obj, InterfaceC2611D interfaceC2611D, D1.D d10);

    public final void L(final Object obj, InterfaceC2611D interfaceC2611D) {
        AbstractC0853a.a(!this.f20816h.containsKey(obj));
        InterfaceC2611D.c cVar = new InterfaceC2611D.c() { // from class: a2.g
            @Override // a2.InterfaceC2611D.c
            public final void a(InterfaceC2611D interfaceC2611D2, D1.D d10) {
                this.f20793a.K(obj, interfaceC2611D2, d10);
            }
        };
        a aVar = new a(obj);
        this.f20816h.put(obj, new b(interfaceC2611D, cVar, aVar));
        interfaceC2611D.c((Handler) AbstractC0853a.e(this.f20817i), aVar);
        interfaceC2611D.l((Handler) AbstractC0853a.e(this.f20817i), aVar);
        interfaceC2611D.m(cVar, this.f20818j, B());
        if (C()) {
            return;
        }
        interfaceC2611D.e(cVar);
    }

    @Override // a2.InterfaceC2611D
    public void n() {
        Iterator it = this.f20816h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f20823a.n();
        }
    }

    @Override // a2.AbstractC2615a
    public void z() {
        for (b bVar : this.f20816h.values()) {
            bVar.f20823a.e(bVar.f20824b);
        }
    }

    public int J(Object obj, int i10) {
        return i10;
    }

    public long I(Object obj, long j10, InterfaceC2611D.b bVar) {
        return j10;
    }
}
