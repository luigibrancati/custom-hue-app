package K1;

import G1.AbstractC0853a;
import a2.C2619e;
import a2.C2632s;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2610C f6856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c0[] f6858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I0 f6863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean[] f6865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f1[] f6866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d2.x f6867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z0 f6868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H0 f6869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a2.n0 f6870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d2.y f6871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6872q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        H0 a(I0 i02, long j10);
    }

    public H0(f1[] f1VarArr, long j10, d2.x xVar, e2.b bVar, Z0 z02, I0 i02, d2.y yVar, long j11) {
        this.f6866k = f1VarArr;
        this.f6872q = j10;
        this.f6867l = xVar;
        this.f6868m = z02;
        InterfaceC2611D.b bVar2 = i02.f6874a;
        this.f6857b = bVar2.f20522a;
        this.f6863h = i02;
        this.f6859d = j11;
        this.f6870o = a2.n0.f20861d;
        this.f6871p = yVar;
        this.f6858c = new a2.c0[f1VarArr.length];
        this.f6865j = new boolean[f1VarArr.length];
        this.f6856a = f(bVar2, z02, bVar, i02.f6875b, i02.f6877d, i02.f6879f);
    }

    public static InterfaceC2610C f(InterfaceC2611D.b bVar, Z0 z02, e2.b bVar2, long j10, long j11, boolean z10) {
        InterfaceC2610C interfaceC2610CH = z02.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new C2619e(interfaceC2610CH, !z10, 0L, j11) : interfaceC2610CH;
    }

    public static void y(Z0 z02, InterfaceC2610C interfaceC2610C) {
        try {
            if (interfaceC2610C instanceof C2619e) {
                z02.y(((C2619e) interfaceC2610C).f20740a);
            } else {
                z02.y(interfaceC2610C);
            }
        } catch (RuntimeException e10) {
            G1.t.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(H0 h02) {
        if (h02 == this.f6869n) {
            return;
        }
        g();
        this.f6869n = h02;
        i();
    }

    public void B(long j10) {
        this.f6872q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        InterfaceC2610C interfaceC2610C = this.f6856a;
        if (interfaceC2610C instanceof C2619e) {
            long j10 = this.f6863h.f6877d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C2619e) interfaceC2610C).x(0L, j10);
        }
    }

    public long a(d2.y yVar, long j10, boolean z10) {
        return b(yVar, j10, z10, new boolean[this.f6866k.length]);
    }

    public long b(d2.y yVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= yVar.f32979a) {
                break;
            }
            boolean[] zArr2 = this.f6865j;
            if (z10 || !yVar.b(this.f6871p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f6858c);
        g();
        this.f6871p = yVar;
        i();
        long jL = this.f6856a.l(yVar.f32981c, this.f6865j, this.f6858c, zArr, j10);
        c(this.f6858c);
        this.f6862g = false;
        int i11 = 0;
        while (true) {
            a2.c0[] c0VarArr = this.f6858c;
            if (i11 >= c0VarArr.length) {
                return jL;
            }
            if (c0VarArr[i11] != null) {
                AbstractC0853a.g(yVar.c(i11));
                if (this.f6866k[i11].f() != -2) {
                    this.f6862g = true;
                }
            } else {
                AbstractC0853a.g(yVar.f32981c[i11] == null);
            }
            i11++;
        }
    }

    public final void c(a2.c0[] c0VarArr) {
        int i10 = 0;
        while (true) {
            f1[] f1VarArr = this.f6866k;
            if (i10 >= f1VarArr.length) {
                return;
            }
            if (f1VarArr[i10].f() == -2 && this.f6871p.c(i10)) {
                c0VarArr[i10] = new C2632s();
            }
            i10++;
        }
    }

    public boolean d(I0 i02) {
        if (!K0.e(this.f6863h.f6878e, i02.f6878e)) {
            return false;
        }
        I0 i03 = this.f6863h;
        return i03.f6875b == i02.f6875b && i03.f6874a.equals(i02.f6874a);
    }

    public void e(F0 f02) {
        AbstractC0853a.g(u());
        this.f6856a.e(f02);
    }

    public final void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            d2.y yVar = this.f6871p;
            if (i10 >= yVar.f32979a) {
                return;
            }
            boolean zC = yVar.c(i10);
            d2.r rVar = this.f6871p.f32981c[i10];
            if (zC && rVar != null) {
                rVar.c();
            }
            i10++;
        }
    }

    public final void h(a2.c0[] c0VarArr) {
        int i10 = 0;
        while (true) {
            f1[] f1VarArr = this.f6866k;
            if (i10 >= f1VarArr.length) {
                return;
            }
            if (f1VarArr[i10].f() == -2) {
                c0VarArr[i10] = null;
            }
            i10++;
        }
    }

    public final void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            d2.y yVar = this.f6871p;
            if (i10 >= yVar.f32979a) {
                return;
            }
            boolean zC = yVar.c(i10);
            d2.r rVar = this.f6871p.f32981c[i10];
            if (zC && rVar != null) {
                rVar.p();
            }
            i10++;
        }
    }

    public long j() {
        if (!this.f6861f) {
            return this.f6863h.f6875b;
        }
        long jG = this.f6862g ? this.f6856a.g() : Long.MIN_VALUE;
        return jG == Long.MIN_VALUE ? this.f6863h.f6878e : jG;
    }

    public H0 k() {
        return this.f6869n;
    }

    public long l() {
        if (this.f6861f) {
            return this.f6856a.b();
        }
        return 0L;
    }

    public long m() {
        return this.f6872q;
    }

    public long n() {
        return this.f6863h.f6875b + this.f6872q;
    }

    public a2.n0 o() {
        return this.f6870o;
    }

    public d2.y p() {
        return this.f6871p;
    }

    public void q(float f10, D1.D d10, boolean z10) {
        this.f6861f = true;
        this.f6870o = this.f6856a.q();
        d2.y yVarZ = z(f10, d10, z10);
        I0 i02 = this.f6863h;
        long jMax = i02.f6875b;
        long j10 = i02.f6878e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(yVarZ, jMax, false);
        long j11 = this.f6872q;
        I0 i03 = this.f6863h;
        this.f6872q = j11 + (i03.f6875b - jA);
        this.f6863h = i03.b(jA);
    }

    public boolean r() {
        try {
            if (this.f6861f) {
                for (a2.c0 c0Var : this.f6858c) {
                    if (c0Var != null) {
                        c0Var.a();
                    }
                }
            } else {
                this.f6856a.m();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f6861f) {
            return !this.f6862g || this.f6856a.g() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f6861f) {
            return s() || j() - this.f6863h.f6875b >= this.f6859d;
        }
        return false;
    }

    public final boolean u() {
        return this.f6869n == null;
    }

    public void v(InterfaceC2610C.a aVar, long j10) {
        this.f6860e = true;
        this.f6856a.p(aVar, j10);
    }

    public void w(long j10) {
        AbstractC0853a.g(u());
        if (this.f6861f) {
            this.f6856a.h(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f6868m, this.f6856a);
    }

    public d2.y z(float f10, D1.D d10, boolean z10) {
        d2.y yVarJ = this.f6867l.j(this.f6866k, o(), this.f6863h.f6874a, d10);
        for (int i10 = 0; i10 < yVarJ.f32979a; i10++) {
            if (yVarJ.c(i10)) {
                if (yVarJ.f32981c[i10] == null && this.f6866k[i10].f() != -2) {
                    z = false;
                }
                AbstractC0853a.g(z);
            } else {
                AbstractC0853a.g(yVarJ.f32981c[i10] == null);
            }
        }
        for (d2.r rVar : yVarJ.f32981c) {
            if (rVar != null) {
                rVar.i(f10);
                rVar.o(z10);
            }
        }
        return yVarJ;
    }
}
