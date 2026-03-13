package L1;

import D1.C0744b;
import D1.C0752j;
import D1.D;
import D1.z;
import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import G1.s;
import K1.C1003j;
import K1.C1005k;
import K1.C1030x;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import L1.InterfaceC1139b;
import M1.s;
import a2.C2609B;
import a2.C2638y;
import a2.InterfaceC2611D;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r0 implements InterfaceC1137a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0860h f8385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.b f8386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D.c f8387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f8389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G1.s f8390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D1.z f8391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public G1.p f8392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8393i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D.b f8394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC1081v f8395b = AbstractC1081v.z();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC1083x f8396c = AbstractC1083x.j();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC2611D.b f8397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC2611D.b f8398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC2611D.b f8399f;

        public a(D.b bVar) {
            this.f8394a = bVar;
        }

        public static InterfaceC2611D.b c(D1.z zVar, AbstractC1081v abstractC1081v, InterfaceC2611D.b bVar, D.b bVar2) {
            D1.D dU0 = zVar.u0();
            int iW0 = zVar.w0();
            Object objM = dU0.q() ? null : dU0.m(iW0);
            int iD = (zVar.g0() || dU0.q()) ? -1 : dU0.f(iW0, bVar2).d(G1.M.M0(zVar.getCurrentPosition()) - bVar2.n());
            for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                InterfaceC2611D.b bVar3 = (InterfaceC2611D.b) abstractC1081v.get(i10);
                if (i(bVar3, objM, zVar.g0(), zVar.r0(), zVar.z0(), iD)) {
                    return bVar3;
                }
            }
            if (abstractC1081v.isEmpty() && bVar != null && i(bVar, objM, zVar.g0(), zVar.r0(), zVar.z0(), iD)) {
                return bVar;
            }
            return null;
        }

        public static boolean i(InterfaceC2611D.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f20522a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f20523b == i10 && bVar.f20524c == i11) {
                return true;
            }
            return !z10 && bVar.f20523b == -1 && bVar.f20526e == i12;
        }

        public final void b(AbstractC1083x.a aVar, InterfaceC2611D.b bVar, D1.D d10) {
            if (bVar == null) {
                return;
            }
            if (d10.b(bVar.f20522a) != -1) {
                aVar.f(bVar, d10);
                return;
            }
            D1.D d11 = (D1.D) this.f8396c.get(bVar);
            if (d11 != null) {
                aVar.f(bVar, d11);
            }
        }

        public InterfaceC2611D.b d() {
            return this.f8397d;
        }

        public InterfaceC2611D.b e() {
            if (this.f8395b.isEmpty()) {
                return null;
            }
            return (InterfaceC2611D.b) K7.A.d(this.f8395b);
        }

        public D1.D f(InterfaceC2611D.b bVar) {
            return (D1.D) this.f8396c.get(bVar);
        }

        public InterfaceC2611D.b g() {
            return this.f8398e;
        }

        public InterfaceC2611D.b h() {
            return this.f8399f;
        }

        public void j(D1.z zVar) {
            this.f8397d = c(zVar, this.f8395b, this.f8398e, this.f8394a);
        }

        public void k(List list, InterfaceC2611D.b bVar, D1.z zVar) {
            this.f8395b = AbstractC1081v.v(list);
            if (!list.isEmpty()) {
                this.f8398e = (InterfaceC2611D.b) list.get(0);
                this.f8399f = (InterfaceC2611D.b) AbstractC0853a.e(bVar);
            }
            if (this.f8397d == null) {
                this.f8397d = c(zVar, this.f8395b, this.f8398e, this.f8394a);
            }
            m(zVar.u0());
        }

        public void l(D1.z zVar) {
            this.f8397d = c(zVar, this.f8395b, this.f8398e, this.f8394a);
            m(zVar.u0());
        }

        public final void m(D1.D d10) {
            AbstractC1083x.a aVarA = AbstractC1083x.a();
            if (this.f8395b.isEmpty()) {
                b(aVarA, this.f8398e, d10);
                if (!Objects.equals(this.f8399f, this.f8398e)) {
                    b(aVarA, this.f8399f, d10);
                }
                if (!Objects.equals(this.f8397d, this.f8398e) && !Objects.equals(this.f8397d, this.f8399f)) {
                    b(aVarA, this.f8397d, d10);
                }
            } else {
                for (int i10 = 0; i10 < this.f8395b.size(); i10++) {
                    b(aVarA, (InterfaceC2611D.b) this.f8395b.get(i10), d10);
                }
                if (!this.f8395b.contains(this.f8397d)) {
                    b(aVarA, this.f8397d, d10);
                }
            }
            this.f8396c = aVarA.c();
        }
    }

    public r0(InterfaceC0860h interfaceC0860h) {
        this.f8385a = (InterfaceC0860h) AbstractC0853a.e(interfaceC0860h);
        this.f8390f = new G1.s(G1.M.Y(), interfaceC0860h, new s.b() { // from class: L1.r
            @Override // G1.s.b
            public final void a(Object obj, D1.m mVar) {
                r0.V0((InterfaceC1139b) obj, mVar);
            }
        });
        D.b bVar = new D.b();
        this.f8386b = bVar;
        this.f8387c = new D.c();
        this.f8388d = new a(bVar);
        this.f8389e = new SparseArray();
    }

    public static /* synthetic */ void O(InterfaceC1139b.a aVar, int i10, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.d0(aVar);
        interfaceC1139b.H(aVar, i10);
    }

    public static /* synthetic */ void Q(InterfaceC1139b.a aVar, String str, long j10, long j11, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.h0(aVar, str, j10);
        interfaceC1139b.s0(aVar, str, j11, j10);
    }

    public static /* synthetic */ void X(InterfaceC1139b.a aVar, D1.K k10, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.W(aVar, k10);
        interfaceC1139b.j(aVar, k10.f1622a, k10.f1623b, 0, k10.f1625d);
    }

    public static /* synthetic */ void Y(InterfaceC1139b.a aVar, C2638y c2638y, C2609B c2609b, int i10, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.e(aVar, c2638y, c2609b);
        interfaceC1139b.S(aVar, c2638y, c2609b, i10);
    }

    public static /* synthetic */ void i0(InterfaceC1139b.a aVar, String str, long j10, long j11, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.G(aVar, str, j10);
        interfaceC1139b.x(aVar, str, j11, j10);
    }

    public static /* synthetic */ void o0(InterfaceC1139b.a aVar, boolean z10, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.t(aVar, z10);
        interfaceC1139b.k(aVar, z10);
    }

    public static /* synthetic */ void x0(InterfaceC1139b.a aVar, int i10, z.e eVar, z.e eVar2, InterfaceC1139b interfaceC1139b) {
        interfaceC1139b.l0(aVar, i10);
        interfaceC1139b.k0(aVar, eVar, eVar2, i10);
    }

    @Override // P1.t
    public final void A(int i10, InterfaceC2611D.b bVar) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1026, new s.a() { // from class: L1.j0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).e0(aVarE1);
            }
        });
    }

    @Override // P1.t
    public final void B(int i10, InterfaceC2611D.b bVar) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1023, new s.a() { // from class: L1.l0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).p0(aVarE1);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public void C(final D1.z zVar, Looper looper) {
        AbstractC0853a.g(this.f8391g == null || this.f8388d.f8395b.isEmpty());
        this.f8391g = (D1.z) AbstractC0853a.e(zVar);
        this.f8392h = this.f8385a.e(looper, null);
        this.f8390f = this.f8390f.e(looper, new s.b() { // from class: L1.e
            @Override // G1.s.b
            public final void a(Object obj, D1.m mVar) {
                InterfaceC1139b interfaceC1139b = (InterfaceC1139b) obj;
                interfaceC1139b.a(zVar, new InterfaceC1139b.C0128b(mVar, this.f8330a.f8389e));
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void D(List list, InterfaceC2611D.b bVar) {
        this.f8388d.k(list, bVar, (D1.z) AbstractC0853a.e(this.f8391g));
    }

    @Override // a2.L
    public final void E(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1001, new s.a() { // from class: L1.W
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).i0(aVarE1, c2638y, c2609b);
            }
        });
    }

    @Override // a2.L
    public final void F(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b, final IOException iOException, final boolean z10) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1003, new s.a() { // from class: L1.K
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).o(aVarE1, c2638y, c2609b, iOException, z10);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public void G(final int i10, final int i11, final boolean z10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1033, new s.a() { // from class: L1.p
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).J(aVarG1, i10, i11, z10);
            }
        });
    }

    @Override // a2.L
    public final void H(int i10, InterfaceC2611D.b bVar, final C2609B c2609b) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1005, new s.a() { // from class: L1.e0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).q(aVarE1, c2609b);
            }
        });
    }

    @Override // a2.L
    public final void I(int i10, InterfaceC2611D.b bVar, final C2609B c2609b) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1004, new s.a() { // from class: L1.D
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).K(aVarE1, c2609b);
            }
        });
    }

    @Override // P1.t
    public final void J(int i10, InterfaceC2611D.b bVar) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1027, new s.a() { // from class: L1.f0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).g0(aVarE1);
            }
        });
    }

    @Override // P1.t
    public final void K(int i10, InterfaceC2611D.b bVar, final int i11) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1022, new s.a() { // from class: L1.S
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.O(aVarE1, i11, (InterfaceC1139b) obj);
            }
        });
    }

    @Override // a2.L
    public final void L(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1002, new s.a() { // from class: L1.P
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).A(aVarE1, c2638y, c2609b);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void a(final Exception exc) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1014, new s.a() { // from class: L1.h0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).L(aVarG1, exc);
            }
        });
    }

    public final InterfaceC1139b.a a1() {
        return c1(this.f8388d.d());
    }

    @Override // L1.InterfaceC1137a
    public void b(final s.a aVar) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1031, new s.a() { // from class: L1.Y
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).w0(aVarG1, aVar);
            }
        });
    }

    public final InterfaceC1139b.a b1(D1.D d10, int i10, InterfaceC2611D.b bVar) {
        InterfaceC2611D.b bVar2 = d10.q() ? null : bVar;
        long jC = this.f8385a.c();
        boolean z10 = d10.equals(this.f8391g.u0()) && i10 == this.f8391g.D0();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jB = this.f8391g.A0();
            } else if (!d10.q()) {
                jB = d10.n(i10, this.f8387c).b();
            }
        } else if (z10 && this.f8391g.r0() == bVar2.f20523b && this.f8391g.z0() == bVar2.f20524c) {
            jB = this.f8391g.getCurrentPosition();
        }
        return new InterfaceC1139b.a(jC, d10, i10, bVar2, jB, this.f8391g.u0(), this.f8391g.D0(), this.f8388d.d(), this.f8391g.getCurrentPosition(), this.f8391g.h0());
    }

    @Override // L1.InterfaceC1137a
    public void c(final s.a aVar) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1032, new s.a() { // from class: L1.m0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).q0(aVarG1, aVar);
            }
        });
    }

    public final InterfaceC1139b.a c1(InterfaceC2611D.b bVar) {
        AbstractC0853a.e(this.f8391g);
        D1.D dF = bVar == null ? null : this.f8388d.f(bVar);
        if (bVar != null && dF != null) {
            return b1(dF, dF.h(bVar.f20522a, this.f8386b).f1452c, bVar);
        }
        int iD0 = this.f8391g.D0();
        D1.D dU0 = this.f8391g.u0();
        if (iD0 >= dU0.p()) {
            dU0 = D1.D.f1441a;
        }
        return b1(dU0, iD0, null);
    }

    @Override // L1.InterfaceC1137a
    public final void d(final D1.o oVar, final C1005k c1005k) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1017, new s.a() { // from class: L1.X
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).u0(aVarG1, oVar, c1005k);
            }
        });
    }

    public final InterfaceC1139b.a d1() {
        return c1(this.f8388d.e());
    }

    @Override // L1.InterfaceC1137a
    public final void e(final String str) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1019, new s.a() { // from class: L1.l
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).w(aVarG1, str);
            }
        });
    }

    public final InterfaceC1139b.a e1(int i10, InterfaceC2611D.b bVar) {
        AbstractC0853a.e(this.f8391g);
        if (bVar != null) {
            return this.f8388d.f(bVar) != null ? c1(bVar) : b1(D1.D.f1441a, i10, bVar);
        }
        D1.D dU0 = this.f8391g.u0();
        if (i10 >= dU0.p()) {
            dU0 = D1.D.f1441a;
        }
        return b1(dU0, i10, null);
    }

    @Override // L1.InterfaceC1137a
    public final void f(final String str, final long j10, final long j11) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1016, new s.a() { // from class: L1.A
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.i0(aVarG1, str, j11, j10, (InterfaceC1139b) obj);
            }
        });
    }

    public final InterfaceC1139b.a f1() {
        return c1(this.f8388d.g());
    }

    @Override // L1.InterfaceC1137a
    public final void g(final D1.o oVar, final C1005k c1005k) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1009, new s.a() { // from class: L1.b0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).d(aVarG1, oVar, c1005k);
            }
        });
    }

    public final InterfaceC1139b.a g1() {
        return c1(this.f8388d.h());
    }

    @Override // L1.InterfaceC1137a
    public final void h(final String str) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1012, new s.a() { // from class: L1.g0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).E(aVarG1, str);
            }
        });
    }

    public final InterfaceC1139b.a h1(D1.x xVar) {
        InterfaceC2611D.b bVar;
        return (!(xVar instanceof C1030x) || (bVar = ((C1030x) xVar).f7350o) == null) ? a1() : c1(bVar);
    }

    @Override // L1.InterfaceC1137a
    public final void i(final String str, final long j10, final long j11) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1008, new s.a() { // from class: L1.j
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.Q(aVarG1, str, j11, j10, (InterfaceC1139b) obj);
            }
        });
    }

    public final void i1() {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 1028, new s.a() { // from class: L1.G
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).F(aVarA1);
            }
        });
        this.f8390f.i();
    }

    @Override // L1.InterfaceC1137a
    public final void j(final long j10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1010, new s.a() { // from class: L1.L
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).P(aVarG1, j10);
            }
        });
    }

    public final void j1(InterfaceC1139b.a aVar, int i10, s.a aVar2) {
        this.f8389e.put(i10, aVar);
        this.f8390f.j(i10, aVar2);
    }

    @Override // L1.InterfaceC1137a
    public final void k(final C1003j c1003j) {
        final InterfaceC1139b.a aVarF1 = f1();
        j1(aVarF1, 1020, new s.a() { // from class: L1.E
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).s(aVarF1, c1003j);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void l(final Exception exc) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1030, new s.a() { // from class: L1.d
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).I(aVarG1, exc);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void m(final int i10, final long j10) {
        final InterfaceC1139b.a aVarF1 = f1();
        j1(aVarF1, 1018, new s.a() { // from class: L1.M
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).h(aVarF1, i10, j10);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void n(final C1003j c1003j) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1007, new s.a() { // from class: L1.H
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).X(aVarG1, c1003j);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void o(final Object obj, final long j10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 26, new s.a() { // from class: L1.d0
            @Override // G1.s.a
            public final void invoke(Object obj2) {
                ((InterfaceC1139b) obj2).y(aVarG1, obj, j10);
            }
        });
    }

    @Override // D1.z.d
    public final void onAudioAttributesChanged(final C0744b c0744b) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 20, new s.a() { // from class: L1.g
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).g(aVarG1, c0744b);
            }
        });
    }

    @Override // D1.z.d
    public final void onAudioSessionIdChanged(final int i10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 21, new s.a() { // from class: L1.Z
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).M(aVarG1, i10);
            }
        });
    }

    @Override // D1.z.d
    public void onAvailableCommandsChanged(final z.b bVar) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 13, new s.a() { // from class: L1.n0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).Y(aVarA1, bVar);
            }
        });
    }

    @Override // D1.z.d
    public void onCues(final List list) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 27, new s.a() { // from class: L1.q
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).m(aVarA1, list);
            }
        });
    }

    @Override // D1.z.d
    public void onDeviceInfoChanged(final C0752j c0752j) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 29, new s.a() { // from class: L1.T
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).z(aVarA1, c0752j);
            }
        });
    }

    @Override // D1.z.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 30, new s.a() { // from class: L1.N
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).j0(aVarA1, i10, z10);
            }
        });
    }

    @Override // D1.z.d
    public final void onIsLoadingChanged(final boolean z10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 3, new s.a() { // from class: L1.V
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.o0(aVarA1, z10, (InterfaceC1139b) obj);
            }
        });
    }

    @Override // D1.z.d
    public void onIsPlayingChanged(final boolean z10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 7, new s.a() { // from class: L1.i
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).f(aVarA1, z10);
            }
        });
    }

    @Override // D1.z.d
    public final void onMediaItemTransition(final D1.r rVar, final int i10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 1, new s.a() { // from class: L1.p0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).l(aVarA1, rVar, i10);
            }
        });
    }

    @Override // D1.z.d
    public void onMediaMetadataChanged(final D1.t tVar) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 14, new s.a() { // from class: L1.J
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).Z(aVarA1, tVar);
            }
        });
    }

    @Override // D1.z.d
    public final void onMetadata(final D1.u uVar) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 28, new s.a() { // from class: L1.h
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).o0(aVarA1, uVar);
            }
        });
    }

    @Override // D1.z.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 5, new s.a() { // from class: L1.o
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).V(aVarA1, z10, i10);
            }
        });
    }

    @Override // D1.z.d
    public final void onPlaybackParametersChanged(final D1.y yVar) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 12, new s.a() { // from class: L1.c
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).O(aVarA1, yVar);
            }
        });
    }

    @Override // D1.z.d
    public final void onPlaybackStateChanged(final int i10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 4, new s.a() { // from class: L1.t
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).C(aVarA1, i10);
            }
        });
    }

    @Override // D1.z.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 6, new s.a() { // from class: L1.k
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).u(aVarA1, i10);
            }
        });
    }

    @Override // D1.z.d
    public final void onPlayerError(final D1.x xVar) {
        final InterfaceC1139b.a aVarH1 = h1(xVar);
        j1(aVarH1, 10, new s.a() { // from class: L1.s
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).R(aVarH1, xVar);
            }
        });
    }

    @Override // D1.z.d
    public void onPlayerErrorChanged(final D1.x xVar) {
        final InterfaceC1139b.a aVarH1 = h1(xVar);
        j1(aVarH1, 10, new s.a() { // from class: L1.m
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).t0(aVarH1, xVar);
            }
        });
    }

    @Override // D1.z.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, -1, new s.a() { // from class: L1.f
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).m0(aVarA1, z10, i10);
            }
        });
    }

    @Override // D1.z.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // D1.z.d
    public final void onRepeatModeChanged(final int i10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 8, new s.a() { // from class: L1.x
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).U(aVarA1, i10);
            }
        });
    }

    @Override // D1.z.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 23, new s.a() { // from class: L1.i0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).n(aVarG1, z10);
            }
        });
    }

    @Override // D1.z.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 24, new s.a() { // from class: L1.B
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).c0(aVarG1, i10, i11);
            }
        });
    }

    @Override // D1.z.d
    public final void onTimelineChanged(D1.D d10, final int i10) {
        this.f8388d.l((D1.z) AbstractC0853a.e(this.f8391g));
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 0, new s.a() { // from class: L1.o0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).Q(aVarA1, i10);
            }
        });
    }

    @Override // D1.z.d
    public void onTracksChanged(final D1.G g10) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 2, new s.a() { // from class: L1.n
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).v(aVarA1, g10);
            }
        });
    }

    @Override // D1.z.d
    public final void onVideoSizeChanged(final D1.K k10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 25, new s.a() { // from class: L1.a0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.X(aVarG1, k10, (InterfaceC1139b) obj);
            }
        });
    }

    @Override // D1.z.d
    public final void onVolumeChanged(final float f10) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 22, new s.a() { // from class: L1.q0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).N(aVarG1, f10);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void p(final Exception exc) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1029, new s.a() { // from class: L1.z
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).r(aVarG1, exc);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void q(final C1003j c1003j) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1015, new s.a() { // from class: L1.c0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).r0(aVarG1, c1003j);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void r(final int i10, final long j10, final long j11) {
        final InterfaceC1139b.a aVarG1 = g1();
        j1(aVarG1, 1011, new s.a() { // from class: L1.I
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).p(aVarG1, i10, j10, j11);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public void release() {
        ((G1.p) AbstractC0853a.i(this.f8392h)).i(new Runnable() { // from class: L1.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f8430a.i1();
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void s(final long j10, final int i10) {
        final InterfaceC1139b.a aVarF1 = f1();
        j1(aVarF1, 1021, new s.a() { // from class: L1.O
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).b0(aVarF1, j10, i10);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void t(final C1003j c1003j) {
        final InterfaceC1139b.a aVarF1 = f1();
        j1(aVarF1, 1013, new s.a() { // from class: L1.Q
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).i(aVarF1, c1003j);
            }
        });
    }

    @Override // P1.t
    public final void u(int i10, InterfaceC2611D.b bVar, final Exception exc) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, RecognitionOptions.UPC_E, new s.a() { // from class: L1.U
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).B(aVarE1, exc);
            }
        });
    }

    @Override // a2.L
    public final void v(int i10, InterfaceC2611D.b bVar, final C2638y c2638y, final C2609B c2609b, final int i11) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1000, new s.a() { // from class: L1.F
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.Y(aVarE1, c2638y, c2609b, i11, (InterfaceC1139b) obj);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public void w(InterfaceC1139b interfaceC1139b) {
        AbstractC0853a.e(interfaceC1139b);
        this.f8390f.c(interfaceC1139b);
    }

    @Override // e2.d.a
    public final void x(final int i10, final long j10, final long j11) {
        final InterfaceC1139b.a aVarD1 = d1();
        j1(aVarD1, 1006, new s.a() { // from class: L1.C
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).c(aVarD1, i10, j10, j11);
            }
        });
    }

    @Override // L1.InterfaceC1137a
    public final void y() {
        if (this.f8393i) {
            return;
        }
        final InterfaceC1139b.a aVarA1 = a1();
        this.f8393i = true;
        j1(aVarA1, -1, new s.a() { // from class: L1.u
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).a0(aVarA1);
            }
        });
    }

    @Override // P1.t
    public final void z(int i10, InterfaceC2611D.b bVar) {
        final InterfaceC1139b.a aVarE1 = e1(i10, bVar);
        j1(aVarE1, 1025, new s.a() { // from class: L1.k0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).f0(aVarE1);
            }
        });
    }

    @Override // D1.z.d
    public final void onPositionDiscontinuity(final z.e eVar, final z.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f8393i = false;
        }
        this.f8388d.j((D1.z) AbstractC0853a.e(this.f8391g));
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 11, new s.a() { // from class: L1.v
            @Override // G1.s.a
            public final void invoke(Object obj) {
                r0.x0(aVarA1, i10, eVar, eVar2, (InterfaceC1139b) obj);
            }
        });
    }

    @Override // D1.z.d
    public void onCues(final F1.c cVar) {
        final InterfaceC1139b.a aVarA1 = a1();
        j1(aVarA1, 27, new s.a() { // from class: L1.y
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((InterfaceC1139b) obj).n0(aVarA1, cVar);
            }
        });
    }

    @Override // D1.z.d
    public void onRenderedFirstFrame() {
    }

    @Override // D1.z.d
    public void onLoadingChanged(boolean z10) {
    }

    public static /* synthetic */ void V0(InterfaceC1139b interfaceC1139b, D1.m mVar) {
    }

    @Override // D1.z.d
    public void onEvents(D1.z zVar, z.c cVar) {
    }
}
