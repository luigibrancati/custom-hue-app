package a2;

import G1.AbstractC0853a;
import K1.C0;
import K1.F0;
import K1.k1;
import a2.C2620f;
import a2.InterfaceC2610C;

/* JADX INFO: renamed from: a2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2619e implements InterfaceC2610C, InterfaceC2610C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2610C f20740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2610C.a f20741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a[] f20742c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2620f.d f20746g;

    /* JADX INFO: renamed from: a2.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f20747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f20748b;

        public a(c0 c0Var) {
            this.f20747a = c0Var;
        }

        @Override // a2.c0
        public void a() {
            this.f20747a.a();
        }

        public void b() {
            this.f20748b = false;
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            if (C2619e.this.s()) {
                return -3;
            }
            if (this.f20748b) {
                fVar.B(4);
                return -4;
            }
            long jG = C2619e.this.g();
            int iF = this.f20747a.f(c02, fVar, i10);
            if (iF == -5) {
                D1.o oVar = (D1.o) AbstractC0853a.e(c02.f6835b);
                int i11 = oVar.f1783J;
                if (i11 != 0 || oVar.f1784K != 0) {
                    C2619e c2619e = C2619e.this;
                    if (c2619e.f20744e != 0) {
                        i11 = 0;
                    }
                    c02.f6835b = oVar.b().d0(i11).e0(c2619e.f20745f == Long.MIN_VALUE ? oVar.f1784K : 0).P();
                }
                return -5;
            }
            long j10 = C2619e.this.f20745f;
            if (j10 == Long.MIN_VALUE || ((iF != -4 || fVar.f5880f < j10) && !(iF == -3 && jG == Long.MIN_VALUE && !fVar.f5879e))) {
                return iF;
            }
            fVar.s();
            fVar.B(4);
            this.f20748b = true;
            return -4;
        }

        @Override // a2.c0
        public boolean isReady() {
            return !C2619e.this.s() && this.f20747a.isReady();
        }

        @Override // a2.c0
        public int n(long j10) {
            if (C2619e.this.s()) {
                return -3;
            }
            return this.f20747a.n(j10);
        }
    }

    public C2619e(InterfaceC2610C interfaceC2610C, boolean z10, long j10, long j11) {
        this.f20740a = interfaceC2610C;
        this.f20743d = z10 ? j10 : -9223372036854775807L;
        this.f20744e = j10;
        this.f20745f = j11;
    }

    public static long r(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    public static boolean w(long j10, long j11, d2.r[] rVarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (d2.r rVar : rVarArr) {
                if (rVar != null) {
                    D1.o oVarS = rVar.s();
                    if (!D1.v.a(oVarS.f1805o, oVarS.f1801k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final k1 a(long j10, k1 k1Var) {
        long jP = G1.M.p(k1Var.f7221a, 0L, j10 - this.f20744e);
        long j11 = k1Var.f7222b;
        long j12 = this.f20745f;
        long jP2 = G1.M.p(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jP == k1Var.f7221a && jP2 == k1Var.f7222b) ? k1Var : new k1(jP, jP2);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        long jB = this.f20740a.b();
        if (jB != Long.MIN_VALUE) {
            long j10 = this.f20745f;
            if (j10 == Long.MIN_VALUE || jB < j10) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        long j11 = this.f20744e;
        if (j10 == j11) {
            return j11;
        }
        return this.f20740a.c(j10, a(j10, k1Var));
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f20740a.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        return this.f20740a.e(f02);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        long jG = this.f20740a.g();
        if (jG != Long.MIN_VALUE) {
            long j10 = this.f20745f;
            if (j10 == Long.MIN_VALUE || jG < j10) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        this.f20740a.h(j10);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        this.f20743d = -9223372036854775807L;
        for (a aVar : this.f20742c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        return r(this.f20740a.i(j10), this.f20744e, this.f20745f);
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        if (s()) {
            long j10 = this.f20743d;
            this.f20743d = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j10;
        }
        long jK2 = this.f20740a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return r(jK2, this.f20744e, this.f20745f);
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        this.f20742c = new a[c0VarArr.length];
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0Var = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f20742c;
            a aVar = (a) c0VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                c0Var = aVar.f20747a;
            }
            c0VarArr2[i10] = c0Var;
            i10++;
        }
        long jL = this.f20740a.l(rVarArr, zArr, c0VarArr2, zArr2, j10);
        long jR = r(jL, j10, this.f20745f);
        this.f20743d = (s() && w(jL, j10, rVarArr)) ? jR : -9223372036854775807L;
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var2 = c0VarArr2[i11];
            if (c0Var2 == null) {
                this.f20742c[i11] = null;
            } else {
                a[] aVarArr2 = this.f20742c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f20747a != c0Var2) {
                    aVarArr2[i11] = new a(c0Var2);
                }
            }
            c0VarArr[i11] = this.f20742c[i11];
        }
        return jR;
    }

    @Override // a2.InterfaceC2610C
    public void m() throws C2620f.d {
        C2620f.d dVar = this.f20746g;
        if (dVar != null) {
            throw dVar;
        }
        this.f20740a.m();
    }

    @Override // a2.InterfaceC2610C.a
    public void n(InterfaceC2610C interfaceC2610C) {
        if (this.f20746g != null) {
            return;
        }
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20741b)).n(this);
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f20741b = aVar;
        this.f20740a.p(this, j10);
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return this.f20740a.q();
    }

    public boolean s() {
        return this.f20743d != -9223372036854775807L;
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC2610C interfaceC2610C) {
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20741b)).f(this);
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        this.f20740a.u(j10, z10);
    }

    public void v(C2620f.d dVar) {
        this.f20746g = dVar;
    }

    public void x(long j10, long j11) {
        this.f20744e = j10;
        this.f20745f = j11;
    }
}
