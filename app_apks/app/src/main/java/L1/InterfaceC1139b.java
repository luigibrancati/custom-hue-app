package L1;

import D1.C0744b;
import D1.C0752j;
import D1.z;
import G1.AbstractC0853a;
import K1.C1003j;
import K1.C1005k;
import M1.s;
import a2.C2609B;
import a2.C2638y;
import a2.InterfaceC2611D;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: L1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1139b {

    /* JADX INFO: renamed from: L1.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D1.D f8307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC2611D.b f8309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f8310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final D1.D f8311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InterfaceC2611D.b f8313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f8314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f8315j;

        public a(long j10, D1.D d10, int i10, InterfaceC2611D.b bVar, long j11, D1.D d11, int i11, InterfaceC2611D.b bVar2, long j12, long j13) {
            this.f8306a = j10;
            this.f8307b = d10;
            this.f8308c = i10;
            this.f8309d = bVar;
            this.f8310e = j11;
            this.f8311f = d11;
            this.f8312g = i11;
            this.f8313h = bVar2;
            this.f8314i = j12;
            this.f8315j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8306a == aVar.f8306a && this.f8308c == aVar.f8308c && this.f8310e == aVar.f8310e && this.f8312g == aVar.f8312g && this.f8314i == aVar.f8314i && this.f8315j == aVar.f8315j && Objects.equals(this.f8307b, aVar.f8307b) && Objects.equals(this.f8309d, aVar.f8309d) && Objects.equals(this.f8311f, aVar.f8311f) && Objects.equals(this.f8313h, aVar.f8313h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f8306a), this.f8307b, Integer.valueOf(this.f8308c), this.f8309d, Long.valueOf(this.f8310e), this.f8311f, Integer.valueOf(this.f8312g), this.f8313h, Long.valueOf(this.f8314i), Long.valueOf(this.f8315j));
        }
    }

    /* JADX INFO: renamed from: L1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0128b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.m f8316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f8317b;

        public C0128b(D1.m mVar, SparseArray sparseArray) {
            this.f8316a = mVar;
            SparseArray sparseArray2 = new SparseArray(mVar.c());
            for (int i10 = 0; i10 < mVar.c(); i10++) {
                int iB = mVar.b(i10);
                sparseArray2.append(iB, (a) AbstractC0853a.e((a) sparseArray.get(iB)));
            }
            this.f8317b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f8316a.a(i10);
        }

        public int b(int i10) {
            return this.f8316a.b(i10);
        }

        public a c(int i10) {
            return (a) AbstractC0853a.e((a) this.f8317b.get(i10));
        }

        public int d() {
            return this.f8316a.c();
        }
    }

    void K(a aVar, C2609B c2609b);

    void R(a aVar, D1.x xVar);

    void W(a aVar, D1.K k10);

    void a(D1.z zVar, C0128b c0128b);

    void c(a aVar, int i10, long j10, long j11);

    void k0(a aVar, z.e eVar, z.e eVar2, int i10);

    void o(a aVar, C2638y c2638y, C2609B c2609b, IOException iOException, boolean z10);

    void s(a aVar, C1003j c1003j);

    default void F(a aVar) {
    }

    default void a0(a aVar) {
    }

    default void d0(a aVar) {
    }

    default void e0(a aVar) {
    }

    default void f0(a aVar) {
    }

    default void g0(a aVar) {
    }

    default void p0(a aVar) {
    }

    default void B(a aVar, Exception exc) {
    }

    default void C(a aVar, int i10) {
    }

    default void E(a aVar, String str) {
    }

    default void H(a aVar, int i10) {
    }

    default void I(a aVar, Exception exc) {
    }

    default void L(a aVar, Exception exc) {
    }

    default void M(a aVar, int i10) {
    }

    default void N(a aVar, float f10) {
    }

    default void O(a aVar, D1.y yVar) {
    }

    default void P(a aVar, long j10) {
    }

    default void Q(a aVar, int i10) {
    }

    default void U(a aVar, int i10) {
    }

    default void X(a aVar, C1003j c1003j) {
    }

    default void Y(a aVar, z.b bVar) {
    }

    default void Z(a aVar, D1.t tVar) {
    }

    default void f(a aVar, boolean z10) {
    }

    default void g(a aVar, C0744b c0744b) {
    }

    default void i(a aVar, C1003j c1003j) {
    }

    default void k(a aVar, boolean z10) {
    }

    default void l0(a aVar, int i10) {
    }

    default void m(a aVar, List list) {
    }

    default void n(a aVar, boolean z10) {
    }

    default void n0(a aVar, F1.c cVar) {
    }

    default void o0(a aVar, D1.u uVar) {
    }

    default void q(a aVar, C2609B c2609b) {
    }

    default void q0(a aVar, s.a aVar2) {
    }

    default void r(a aVar, Exception exc) {
    }

    default void r0(a aVar, C1003j c1003j) {
    }

    default void t(a aVar, boolean z10) {
    }

    default void t0(a aVar, D1.x xVar) {
    }

    default void u(a aVar, int i10) {
    }

    default void v(a aVar, D1.G g10) {
    }

    default void w(a aVar, String str) {
    }

    default void w0(a aVar, s.a aVar2) {
    }

    default void z(a aVar, C0752j c0752j) {
    }

    default void A(a aVar, C2638y c2638y, C2609B c2609b) {
    }

    default void G(a aVar, String str, long j10) {
    }

    default void V(a aVar, boolean z10, int i10) {
    }

    default void b0(a aVar, long j10, int i10) {
    }

    default void c0(a aVar, int i10, int i11) {
    }

    default void d(a aVar, D1.o oVar, C1005k c1005k) {
    }

    default void e(a aVar, C2638y c2638y, C2609B c2609b) {
    }

    default void h(a aVar, int i10, long j10) {
    }

    default void h0(a aVar, String str, long j10) {
    }

    default void i0(a aVar, C2638y c2638y, C2609B c2609b) {
    }

    default void j0(a aVar, int i10, boolean z10) {
    }

    default void l(a aVar, D1.r rVar, int i10) {
    }

    default void m0(a aVar, boolean z10, int i10) {
    }

    default void u0(a aVar, D1.o oVar, C1005k c1005k) {
    }

    default void y(a aVar, Object obj, long j10) {
    }

    default void J(a aVar, int i10, int i11, boolean z10) {
    }

    default void S(a aVar, C2638y c2638y, C2609B c2609b, int i10) {
    }

    default void p(a aVar, int i10, long j10, long j11) {
    }

    default void s0(a aVar, String str, long j10, long j11) {
    }

    default void x(a aVar, String str, long j10, long j11) {
    }

    default void j(a aVar, int i10, int i11, int i12, float f10) {
    }
}
