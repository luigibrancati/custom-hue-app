package K1;

import G1.AbstractC0853a;
import K1.Z0;
import L1.InterfaceC1137a;
import a2.C2608A;
import a2.C2609B;
import a2.C2638y;
import a2.C2639z;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import a2.e0;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L1.B0 f6962a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f6966e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1137a f6969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final G1.p f6970i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I1.x f6973l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2.e0 f6971j = new e0.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f6964c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6965d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6963b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f6967f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f6968g = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements a2.L, P1.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f6974a;

        public a(c cVar) {
            this.f6974a = cVar;
        }

        @Override // P1.t
        public void A(int i10, InterfaceC2611D.b bVar) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.Y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6959a;
                        Pair pair = pairX;
                        Z0.this.f6969h.A(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second);
                    }
                });
            }
        }

        @Override // P1.t
        public void B(int i10, InterfaceC2611D.b bVar) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.P0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6918a;
                        Pair pair = pairX;
                        Z0.this.f6969h.B(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second);
                    }
                });
            }
        }

        @Override // a2.L
        public void E(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.U0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6936a;
                        Pair pair = pairX;
                        Z0.this.f6969h.E(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, c2638y, c2609b);
                    }
                });
            }
        }

        @Override // a2.L
        public void F(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b, final IOException iOException, final boolean z10) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.X0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6951a;
                        Pair pair = pairX;
                        Z0.this.f6969h.F(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, c2638y, c2609b, iOException, z10);
                    }
                });
            }
        }

        @Override // a2.L
        public void H(int i10, InterfaceC2611D.b bVar, final C2609B c2609b) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.N0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6912a;
                        Pair pair = pairX;
                        Z0.this.f6969h.H(((Integer) pair.first).intValue(), (InterfaceC2611D.b) AbstractC0853a.e((InterfaceC2611D.b) pair.second), c2609b);
                    }
                });
            }
        }

        @Override // a2.L
        public void I(int i10, InterfaceC2611D.b bVar, final C2609B c2609b) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.S0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6929a;
                        Pair pair = pairX;
                        Z0.this.f6969h.I(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, c2609b);
                    }
                });
            }
        }

        @Override // P1.t
        public void J(int i10, InterfaceC2611D.b bVar) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.T0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6933a;
                        Pair pair = pairX;
                        Z0.this.f6969h.J(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second);
                    }
                });
            }
        }

        @Override // P1.t
        public void K(int i10, InterfaceC2611D.b bVar, final int i11) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.V0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6941a;
                        Pair pair = pairX;
                        Z0.this.f6969h.K(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // a2.L
        public void L(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.Q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6921a;
                        Pair pair = pairX;
                        Z0.this.f6969h.L(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, c2638y, c2609b);
                    }
                });
            }
        }

        public final Pair X(int i10, InterfaceC2611D.b bVar) {
            InterfaceC2611D.b bVar2 = null;
            if (bVar != null) {
                InterfaceC2611D.b bVarN = Z0.n(this.f6974a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(Z0.s(this.f6974a, i10)), bVar2);
        }

        @Override // P1.t
        public void u(int i10, InterfaceC2611D.b bVar, final Exception exc) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.R0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6925a;
                        Pair pair = pairX;
                        Z0.this.f6969h.u(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // a2.L
        public void v(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b, final int i11) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.W0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6945a;
                        Pair pair = pairX;
                        Z0.this.f6969h.v(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second, c2638y, c2609b, i11);
                    }
                });
            }
        }

        @Override // P1.t
        public void z(int i10, InterfaceC2611D.b bVar) {
            final Pair pairX = X(i10, bVar);
            if (pairX != null) {
                Z0.this.f6970i.i(new Runnable() { // from class: K1.O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z0.a aVar = this.f6915a;
                        Pair pair = pairX;
                        Z0.this.f6969h.z(((Integer) pair.first).intValue(), (InterfaceC2611D.b) pair.second);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2611D f6976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2611D.c f6977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f6978c;

        public b(InterfaceC2611D interfaceC2611D, InterfaceC2611D.c cVar, a aVar) {
            this.f6976a = interfaceC2611D;
            this.f6977b = cVar;
            this.f6978c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements L0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2608A f6979a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6983e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f6981c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f6980b = new Object();

        public c(InterfaceC2611D interfaceC2611D, boolean z10) {
            this.f6979a = new C2608A(interfaceC2611D, z10);
        }

        @Override // K1.L0
        public D1.D a() {
            return this.f6979a.Z();
        }

        public void b(int i10) {
            this.f6982d = i10;
            this.f6983e = false;
            this.f6981c.clear();
        }

        @Override // K1.L0
        public Object getUid() {
            return this.f6980b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void c();
    }

    public Z0(d dVar, InterfaceC1137a interfaceC1137a, G1.p pVar, L1.B0 b02) {
        this.f6962a = b02;
        this.f6966e = dVar;
        this.f6969h = interfaceC1137a;
        this.f6970i = pVar;
    }

    public static Object m(Object obj) {
        return AbstractC0984a.v(obj);
    }

    public static InterfaceC2611D.b n(c cVar, InterfaceC2611D.b bVar) {
        for (int i10 = 0; i10 < cVar.f6981c.size(); i10++) {
            if (((InterfaceC2611D.b) cVar.f6981c.get(i10)).f20525d == bVar.f20525d) {
                return bVar.a(p(cVar, bVar.f20522a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return AbstractC0984a.w(obj);
    }

    public static Object p(c cVar, Object obj) {
        return AbstractC0984a.y(cVar.f6980b, obj);
    }

    public static int s(c cVar, int i10) {
        return i10 + cVar.f6982d;
    }

    public final void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f6963b.remove(i12);
            this.f6965d.remove(cVar.f6980b);
            g(i12, -cVar.f6979a.Z().p());
            cVar.f6983e = true;
            if (this.f6972k) {
                u(cVar);
            }
        }
    }

    public D1.D B(List list, a2.e0 e0Var) {
        A(0, this.f6963b.size());
        return f(this.f6963b.size(), list, e0Var);
    }

    public D1.D C(a2.e0 e0Var) {
        int iR = r();
        if (e0Var.getLength() != iR) {
            e0Var = e0Var.e().g(0, iR);
        }
        this.f6971j = e0Var;
        return i();
    }

    public D1.D D(int i10, int i11, List list) {
        AbstractC0853a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        AbstractC0853a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f6963b.get(i12)).f6979a.b((D1.r) list.get(i12 - i10));
        }
        return i();
    }

    public D1.D f(int i10, List list, a2.e0 e0Var) {
        if (!list.isEmpty()) {
            this.f6971j = e0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f6963b.get(i11 - 1);
                    cVar.b(cVar2.f6982d + cVar2.f6979a.Z().p());
                } else {
                    cVar.b(0);
                }
                g(i11, cVar.f6979a.Z().p());
                this.f6963b.add(i11, cVar);
                this.f6965d.put(cVar.f6980b, cVar);
                if (this.f6972k) {
                    w(cVar);
                    if (this.f6964c.isEmpty()) {
                        this.f6968g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i10, int i11) {
        while (i10 < this.f6963b.size()) {
            ((c) this.f6963b.get(i10)).f6982d += i11;
            i10++;
        }
    }

    public InterfaceC2610C h(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        Object objO = o(bVar.f20522a);
        InterfaceC2611D.b bVarA = bVar.a(m(bVar.f20522a));
        c cVar = (c) AbstractC0853a.e((c) this.f6965d.get(objO));
        l(cVar);
        cVar.f6981c.add(bVarA);
        C2639z c2639zW = cVar.f6979a.k(bVarA, bVar2, j10);
        this.f6964c.put(c2639zW, cVar);
        k();
        return c2639zW;
    }

    public D1.D i() {
        if (this.f6963b.isEmpty()) {
            return D1.D.f1441a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f6963b.size(); i10++) {
            c cVar = (c) this.f6963b.get(i10);
            cVar.f6982d = iP;
            iP += cVar.f6979a.Z().p();
        }
        return new d1(this.f6963b, this.f6971j);
    }

    public final void j(c cVar) {
        b bVar = (b) this.f6967f.get(cVar);
        if (bVar != null) {
            bVar.f6976a.e(bVar.f6977b);
        }
    }

    public final void k() {
        Iterator it = this.f6968g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f6981c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f6968g.add(cVar);
        b bVar = (b) this.f6967f.get(cVar);
        if (bVar != null) {
            bVar.f6976a.j(bVar.f6977b);
        }
    }

    public a2.e0 q() {
        return this.f6971j;
    }

    public int r() {
        return this.f6963b.size();
    }

    public boolean t() {
        return this.f6972k;
    }

    public final void u(c cVar) {
        if (cVar.f6983e && cVar.f6981c.isEmpty()) {
            b bVar = (b) AbstractC0853a.e((b) this.f6967f.remove(cVar));
            bVar.f6976a.d(bVar.f6977b);
            bVar.f6976a.i(bVar.f6978c);
            bVar.f6976a.r(bVar.f6978c);
            this.f6968g.remove(cVar);
        }
    }

    public void v(I1.x xVar) {
        AbstractC0853a.g(!this.f6972k);
        this.f6973l = xVar;
        for (int i10 = 0; i10 < this.f6963b.size(); i10++) {
            c cVar = (c) this.f6963b.get(i10);
            w(cVar);
            this.f6968g.add(cVar);
        }
        this.f6972k = true;
    }

    public final void w(c cVar) {
        C2608A c2608a = cVar.f6979a;
        InterfaceC2611D.c cVar2 = new InterfaceC2611D.c() { // from class: K1.M0
            @Override // a2.InterfaceC2611D.c
            public final void a(InterfaceC2611D interfaceC2611D, D1.D d10) {
                this.f6909a.f6966e.c();
            }
        };
        a aVar = new a(cVar);
        this.f6967f.put(cVar, new b(c2608a, cVar2, aVar));
        c2608a.c(G1.M.B(), aVar);
        c2608a.l(G1.M.B(), aVar);
        c2608a.m(cVar2, this.f6973l, this.f6962a);
    }

    public void x() {
        for (b bVar : this.f6967f.values()) {
            try {
                bVar.f6976a.d(bVar.f6977b);
            } catch (RuntimeException e10) {
                G1.t.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f6976a.i(bVar.f6978c);
            bVar.f6976a.r(bVar.f6978c);
        }
        this.f6967f.clear();
        this.f6968g.clear();
        this.f6972k = false;
    }

    public void y(InterfaceC2610C interfaceC2610C) {
        c cVar = (c) AbstractC0853a.e((c) this.f6964c.remove(interfaceC2610C));
        cVar.f6979a.h(interfaceC2610C);
        cVar.f6981c.remove(((C2639z) interfaceC2610C).f20923a);
        if (!this.f6964c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public D1.D z(int i10, int i11, a2.e0 e0Var) {
        AbstractC0853a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f6971j = e0Var;
        A(i10, i11);
        return i();
    }
}
