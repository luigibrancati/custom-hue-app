package K1;

import G1.AbstractC0853a;
import a2.InterfaceC2611D;
import c2.C2938i;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f7070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f7072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7073d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7074e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7075f = false;

    public h1(e1 e1Var, e1 e1Var2, int i10) {
        this.f7070a = e1Var;
        this.f7071b = i10;
        this.f7072c = e1Var2;
    }

    public static D1.o[] i(d2.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        D1.o[] oVarArr = new D1.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = ((d2.r) AbstractC0853a.e(rVar)).e(i10);
        }
        return oVarArr;
    }

    public static boolean z(e1 e1Var) {
        return e1Var.getState() != 0;
    }

    public final boolean A() {
        return this.f7073d == 3;
    }

    public void B(a2.c0 c0Var, C1011n c1011n, long j10, boolean z10) {
        C(this.f7070a, c0Var, c1011n, j10, z10);
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            C(e1Var, c0Var, c1011n, j10, z10);
        }
    }

    public final void C(e1 e1Var, a2.c0 c0Var, C1011n c1011n, long j10, boolean z10) {
        if (z(e1Var)) {
            if (c0Var != e1Var.h()) {
                d(e1Var, c1011n);
            } else if (z10) {
                e1Var.M(j10);
            }
        }
    }

    public void D() {
        int i10 = this.f7073d;
        if (i10 == 3 || i10 == 4) {
            Z(i10 == 4);
            this.f7073d = this.f7073d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f7073d = 0;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            if (this.f7074e) {
                this.f7070a.reset();
                this.f7074e = false;
                return;
            }
            return;
        }
        if (this.f7075f) {
            ((e1) AbstractC0853a.e(this.f7072c)).reset();
            this.f7075f = false;
        }
    }

    public void F(d2.y yVar, d2.y yVar2, long j10) {
        int i10;
        boolean zC = yVar.c(this.f7071b);
        boolean zC2 = yVar2.c(this.f7071b);
        e1 e1Var = (this.f7072c == null || (i10 = this.f7073d) == 3 || (i10 == 0 && z(this.f7070a))) ? this.f7070a : (e1) AbstractC0853a.e(this.f7072c);
        if (!zC || e1Var.B()) {
            return;
        }
        boolean z10 = m() == -2;
        g1[] g1VarArr = yVar.f32980b;
        int i11 = this.f7071b;
        g1 g1Var = g1VarArr[i11];
        g1 g1Var2 = yVar2.f32980b[i11];
        if (!zC2 || !Objects.equals(g1Var2, g1Var) || z10 || u()) {
            P(e1Var, j10);
        }
    }

    public void G(H0 h02) {
        ((e1) AbstractC0853a.e(l(h02))).y();
    }

    public void H() {
        this.f7070a.release();
        this.f7074e = false;
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            e1Var.release();
            this.f7075f = false;
        }
    }

    public void I(long j10, long j11) {
        if (z(this.f7070a)) {
            this.f7070a.g(j10, j11);
        }
        e1 e1Var = this.f7072c;
        if (e1Var == null || !z(e1Var)) {
            return;
        }
        this.f7072c.g(j10, j11);
    }

    public int J(H0 h02, d2.y yVar, C1011n c1011n) {
        int iK = K(this.f7070a, h02, yVar, c1011n);
        return iK == 1 ? K(this.f7072c, h02, yVar, c1011n) : iK;
    }

    public final int K(e1 e1Var, H0 h02, d2.y yVar, C1011n c1011n) {
        if (e1Var == null || !z(e1Var) || ((e1Var == this.f7070a && w()) || (e1Var == this.f7072c && A()))) {
            return 1;
        }
        a2.c0 c0VarH = e1Var.h();
        a2.c0[] c0VarArr = h02.f6858c;
        int i10 = this.f7071b;
        boolean z10 = c0VarH != c0VarArr[i10];
        boolean zC = yVar.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!e1Var.B()) {
            e1Var.t(i(yVar.f32981c[this.f7071b]), (a2.c0) AbstractC0853a.e(h02.f6858c[this.f7071b]), h02.n(), h02.m(), h02.f6863h.f6874a);
            return 3;
        }
        if (!e1Var.b()) {
            return 0;
        }
        d(e1Var, c1011n);
        if (!zC || u()) {
            E(e1Var == this.f7070a);
        }
        return 1;
    }

    public void L() {
        if (!z(this.f7070a)) {
            E(true);
        }
        e1 e1Var = this.f7072c;
        if (e1Var == null || z(e1Var)) {
            return;
        }
        E(false);
    }

    public void M(H0 h02, long j10) {
        e1 e1VarL = l(h02);
        if (e1VarL != null) {
            e1VarL.M(j10);
        }
    }

    public void N(long j10) {
        int i10;
        if (z(this.f7070a) && (i10 = this.f7073d) != 4 && i10 != 2) {
            P(this.f7070a, j10);
        }
        e1 e1Var = this.f7072c;
        if (e1Var == null || !z(e1Var) || this.f7073d == 3) {
            return;
        }
        P(this.f7072c, j10);
    }

    public void O(H0 h02, long j10) {
        P((e1) AbstractC0853a.e(l(h02)), j10);
    }

    public final void P(e1 e1Var, long j10) {
        e1Var.n();
        if (e1Var instanceof C2938i) {
            ((C2938i) e1Var).H0(j10);
        }
    }

    public void Q(float f10, float f11) {
        this.f7070a.I(f10, f11);
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            e1Var.I(f10, f11);
        }
    }

    public void R(j1 j1Var) {
        this.f7070a.w(18, j1Var);
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            e1Var.w(18, j1Var);
        }
    }

    public void S(D1.D d10) {
        this.f7070a.O(d10);
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            e1Var.O(d10);
        }
    }

    public void T(g2.r rVar) {
        if (m() != 2) {
            return;
        }
        this.f7070a.w(7, rVar);
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            e1Var.w(7, rVar);
        }
    }

    public void U(Object obj) {
        if (m() != 2) {
            return;
        }
        int i10 = this.f7073d;
        if (i10 == 4 || i10 == 1) {
            ((e1) AbstractC0853a.e(this.f7072c)).w(1, obj);
        } else {
            this.f7070a.w(1, obj);
        }
    }

    public void V(float f10) {
        if (m() != 1) {
            return;
        }
        this.f7070a.w(2, Float.valueOf(f10));
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            e1Var.w(2, Float.valueOf(f10));
        }
    }

    public void W() {
        if (this.f7070a.getState() == 1 && this.f7073d != 4) {
            this.f7070a.start();
            return;
        }
        e1 e1Var = this.f7072c;
        if (e1Var == null || e1Var.getState() != 1 || this.f7073d == 3) {
            return;
        }
        this.f7072c.start();
    }

    public void X() {
        int i10;
        AbstractC0853a.g(!u());
        if (z(this.f7070a)) {
            i10 = 3;
        } else {
            e1 e1Var = this.f7072c;
            i10 = (e1Var == null || !z(e1Var)) ? 2 : 4;
        }
        this.f7073d = i10;
    }

    public void Y() {
        if (z(this.f7070a)) {
            g(this.f7070a);
        }
        e1 e1Var = this.f7072c;
        if (e1Var == null || !z(e1Var)) {
            return;
        }
        g(this.f7072c);
    }

    public final void Z(boolean z10) {
        if (z10) {
            ((e1) AbstractC0853a.e(this.f7072c)).w(17, this.f7070a);
        } else {
            this.f7070a.w(17, AbstractC0853a.e(this.f7072c));
        }
    }

    public boolean a(H0 h02) {
        e1 e1VarL = l(h02);
        return e1VarL == null || e1VarL.j() || e1VarL.isReady() || e1VarL.b();
    }

    public void b(C1011n c1011n) {
        d(this.f7070a, c1011n);
        e1 e1Var = this.f7072c;
        if (e1Var != null) {
            boolean z10 = z(e1Var) && this.f7073d != 3;
            d(this.f7072c, c1011n);
            E(false);
            if (z10) {
                Z(true);
            }
        }
        this.f7073d = 0;
    }

    public void c(C1011n c1011n) {
        if (u()) {
            int i10 = this.f7073d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 != 4 ? 0 : 1;
            d(z10 ? this.f7070a : (e1) AbstractC0853a.e(this.f7072c), c1011n);
            E(z10);
            this.f7073d = i11;
        }
    }

    public final void d(e1 e1Var, C1011n c1011n) {
        AbstractC0853a.g(this.f7070a == e1Var || this.f7072c == e1Var);
        if (z(e1Var)) {
            c1011n.a(e1Var);
            g(e1Var);
            e1Var.c();
        }
    }

    public void e(g1 g1Var, d2.r rVar, a2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, InterfaceC2611D.b bVar, C1011n c1011n) throws C1030x {
        D1.o[] oVarArrI = i(rVar);
        int i10 = this.f7073d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f7074e = true;
            this.f7070a.r(g1Var, oVarArrI, c0Var, j10, z10, z11, j11, j12, bVar);
            c1011n.b(this.f7070a);
        } else {
            this.f7075f = true;
            ((e1) AbstractC0853a.e(this.f7072c)).r(g1Var, oVarArrI, c0Var, j10, z10, z11, j11, j12, bVar);
            c1011n.b(this.f7072c);
        }
    }

    public void f() {
        if (z(this.f7070a)) {
            this.f7070a.m();
            return;
        }
        e1 e1Var = this.f7072c;
        if (e1Var == null || !z(e1Var)) {
            return;
        }
        this.f7072c.m();
    }

    public final void g(e1 e1Var) {
        if (e1Var.getState() == 2) {
            e1Var.stop();
        }
    }

    public int h() {
        boolean z10 = z(this.f7070a);
        e1 e1Var = this.f7072c;
        return (z10 ? 1 : 0) + ((e1Var == null || !z(e1Var)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long jE = z(this.f7070a) ? this.f7070a.E(j10, j11) : Long.MAX_VALUE;
        e1 e1Var = this.f7072c;
        return (e1Var == null || !z(e1Var)) ? jE : Math.min(jE, this.f7072c.E(j10, j11));
    }

    public long k(H0 h02) {
        e1 e1VarL = l(h02);
        Objects.requireNonNull(e1VarL);
        return e1VarL.L();
    }

    public final e1 l(H0 h02) {
        if (h02 != null && h02.f6858c[this.f7071b] != null) {
            if (this.f7070a.h() == h02.f6858c[this.f7071b]) {
                return this.f7070a;
            }
            e1 e1Var = this.f7072c;
            if (e1Var != null && e1Var.h() == h02.f6858c[this.f7071b]) {
                return this.f7072c;
            }
        }
        return null;
    }

    public int m() {
        return this.f7070a.f();
    }

    public void n(int i10, Object obj, H0 h02) {
        ((e1) AbstractC0853a.e(l(h02))).w(i10, obj);
    }

    public boolean o(H0 h02) {
        return p(h02, this.f7070a) && p(h02, this.f7072c);
    }

    public final boolean p(H0 h02, e1 e1Var) {
        if (e1Var == null) {
            return true;
        }
        a2.c0 c0Var = h02.f6858c[this.f7071b];
        if (e1Var.h() == null || (e1Var.h() == c0Var && (c0Var == null || e1Var.j() || q(e1Var, h02)))) {
            return true;
        }
        H0 h0K = h02.k();
        return h0K != null && h0K.f6858c[this.f7071b] == e1Var.h();
    }

    public final boolean q(e1 e1Var, H0 h02) {
        H0 h0K = h02.k();
        if (h02.f6863h.f6880g && h0K != null && h0K.f6861f) {
            return (e1Var instanceof C2938i) || (e1Var instanceof U1.c) || e1Var.L() >= h0K.n();
        }
        return false;
    }

    public boolean r(H0 h02) {
        return ((e1) AbstractC0853a.e(l(h02))).j();
    }

    public boolean s() {
        return this.f7072c != null;
    }

    public boolean t() {
        boolean zB = z(this.f7070a) ? this.f7070a.b() : true;
        e1 e1Var = this.f7072c;
        return (e1Var == null || !z(e1Var)) ? zB : this.f7072c.b() & zB;
    }

    public boolean u() {
        return w() || A();
    }

    public boolean v(H0 h02) {
        return (w() && l(h02) == this.f7070a) || (A() && l(h02) == this.f7072c);
    }

    public final boolean w() {
        int i10 = this.f7073d;
        return i10 == 2 || i10 == 4;
    }

    public boolean x(H0 h02) {
        return l(h02) != null;
    }

    public boolean y() {
        int i10 = this.f7073d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? z(this.f7070a) : z((e1) AbstractC0853a.e(this.f7072c));
    }
}
