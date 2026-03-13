package a2;

import G1.AbstractC0853a;
import K1.C0;
import K1.F0;
import K1.k1;
import a2.InterfaceC2610C;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements InterfaceC2610C, InterfaceC2610C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2610C f20849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2610C.a f20851c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f20852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20853b;

        public a(c0 c0Var, long j10) {
            this.f20852a = c0Var;
            this.f20853b = j10;
        }

        @Override // a2.c0
        public void a() {
            this.f20852a.a();
        }

        public c0 b() {
            return this.f20852a;
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            int iF = this.f20852a.f(c02, fVar, i10);
            if (iF == -4) {
                fVar.f5880f += this.f20853b;
            }
            return iF;
        }

        @Override // a2.c0
        public boolean isReady() {
            return this.f20852a.isReady();
        }

        @Override // a2.c0
        public int n(long j10) {
            return this.f20852a.n(j10 - this.f20853b);
        }
    }

    public k0(InterfaceC2610C interfaceC2610C, long j10) {
        this.f20849a = interfaceC2610C;
        this.f20850b = j10;
    }

    public InterfaceC2610C a() {
        return this.f20849a;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        long jB = this.f20849a.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB + this.f20850b;
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        return this.f20849a.c(j10 - this.f20850b, k1Var) + this.f20850b;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f20849a.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        return this.f20849a.e(f02.a().f(f02.f6848a - this.f20850b).d());
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        long jG = this.f20849a.g();
        if (jG == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jG + this.f20850b;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        this.f20849a.h(j10 - this.f20850b);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        return this.f20849a.i(j10 - this.f20850b) + this.f20850b;
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        long jK = this.f20849a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.f20850b;
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0VarB = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a aVar = (a) c0VarArr[i10];
            if (aVar != null) {
                c0VarB = aVar.b();
            }
            c0VarArr2[i10] = c0VarB;
            i10++;
        }
        long jL = this.f20849a.l(rVarArr, zArr, c0VarArr2, zArr2, j10 - this.f20850b);
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var = c0VarArr2[i11];
            if (c0Var == null) {
                c0VarArr[i11] = null;
            } else {
                c0 c0Var2 = c0VarArr[i11];
                if (c0Var2 == null || ((a) c0Var2).b() != c0Var) {
                    c0VarArr[i11] = new a(c0Var, this.f20850b);
                }
            }
        }
        return jL + this.f20850b;
    }

    @Override // a2.InterfaceC2610C
    public void m() {
        this.f20849a.m();
    }

    @Override // a2.InterfaceC2610C.a
    public void n(InterfaceC2610C interfaceC2610C) {
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20851c)).n(this);
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f20851c = aVar;
        this.f20849a.p(this, j10 - this.f20850b);
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return this.f20849a.q();
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC2610C interfaceC2610C) {
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20851c)).f(this);
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        this.f20849a.u(j10 - this.f20850b, z10);
    }
}
