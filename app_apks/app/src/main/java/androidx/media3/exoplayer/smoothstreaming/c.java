package androidx.media3.exoplayer.smoothstreaming;

import D1.E;
import D1.o;
import G1.AbstractC0853a;
import I1.x;
import J7.f;
import K1.F0;
import K1.k1;
import K7.AbstractC1081v;
import K7.D;
import P1.t;
import P1.u;
import Z1.a;
import a2.InterfaceC2610C;
import a2.InterfaceC2624j;
import a2.L;
import a2.c0;
import a2.d0;
import a2.n0;
import androidx.media3.exoplayer.smoothstreaming.b;
import b2.C2798h;
import d2.r;
import e2.e;
import e2.k;
import e2.n;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC2610C, d0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f23880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f23881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f23882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f23883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t.a f23884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f23885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L.a f23886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2.b f23887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n0 f23888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2624j f23889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2610C.a f23890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Z1.a f23891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2798h[] f23892m = t(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d0 f23893n;

    public c(Z1.a aVar, b.a aVar2, x xVar, InterfaceC2624j interfaceC2624j, e eVar, u uVar, t.a aVar3, k kVar, L.a aVar4, n nVar, e2.b bVar) {
        this.f23891l = aVar;
        this.f23880a = aVar2;
        this.f23881b = xVar;
        this.f23882c = nVar;
        this.f23883d = uVar;
        this.f23884e = aVar3;
        this.f23885f = kVar;
        this.f23886g = aVar4;
        this.f23887h = bVar;
        this.f23889j = interfaceC2624j;
        this.f23888i = s(aVar, uVar, aVar2);
        this.f23893n = interfaceC2624j.empty();
    }

    public static n0 s(Z1.a aVar, u uVar, b.a aVar2) {
        E[] eArr = new E[aVar.f20150f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f20150f;
            if (i10 >= bVarArr.length) {
                return new n0(eArr);
            }
            o[] oVarArr = bVarArr[i10].f20165j;
            o[] oVarArr2 = new o[oVarArr.length];
            for (int i11 = 0; i11 < oVarArr.length; i11++) {
                o oVar = oVarArr[i11];
                oVarArr2[i11] = aVar2.d(oVar.b().X(uVar.b(oVar)).P());
            }
            eArr[i10] = new E(Integer.toString(i10), oVarArr2);
            i10++;
        }
    }

    private static C2798h[] t(int i10) {
        return new C2798h[i10];
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return this.f23893n.b();
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        for (C2798h c2798h : this.f23892m) {
            if (c2798h.f25005a == 2) {
                return c2798h.c(j10, k1Var);
            }
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f23893n.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        return this.f23893n.e(f02);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return this.f23893n.g();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        this.f23893n.h(j10);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) throws Throwable {
        for (C2798h c2798h : this.f23892m) {
            c2798h.V(j10);
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        return -9223372036854775807L;
    }

    @Override // a2.InterfaceC2610C
    public long l(r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        r rVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null) {
                C2798h c2798h = (C2798h) c0Var;
                if (rVarArr[i10] == null || !zArr[i10]) {
                    c2798h.S();
                    c0VarArr[i10] = null;
                } else {
                    ((b) c2798h.G()).b((r) AbstractC0853a.e(rVarArr[i10]));
                    arrayList.add(c2798h);
                }
            }
            if (c0VarArr[i10] == null && (rVar = rVarArr[i10]) != null) {
                C2798h c2798hR = r(rVar, j10);
                arrayList.add(c2798hR);
                c0VarArr[i10] = c2798hR;
                zArr2[i10] = true;
            }
        }
        C2798h[] c2798hArrT = t(arrayList.size());
        this.f23892m = c2798hArrT;
        arrayList.toArray(c2798hArrT);
        this.f23893n = this.f23889j.a(arrayList, D.k(arrayList, new f() { // from class: Y1.a
            @Override // J7.f
            public final Object apply(Object obj) {
                return AbstractC1081v.A(Integer.valueOf(((C2798h) obj).f25005a));
            }
        }));
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public void m() {
        this.f23882c.a();
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f23890k = aVar;
        aVar.n(this);
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return this.f23888i;
    }

    public final C2798h r(r rVar, long j10) {
        int iD = this.f23888i.d(rVar.n());
        return new C2798h(this.f23891l.f20150f[iD].f20156a, null, null, this.f23880a.c(this.f23882c, this.f23891l, iD, rVar, this.f23881b, null), this, this.f23887h, j10, this.f23883d, this.f23884e, this.f23885f, this.f23886g, false, null);
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        for (C2798h c2798h : this.f23892m) {
            c2798h.u(j10, z10);
        }
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(C2798h c2798h) {
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f23890k)).f(this);
    }

    public void w() {
        for (C2798h c2798h : this.f23892m) {
            c2798h.S();
        }
        this.f23890k = null;
    }

    public void x(Z1.a aVar) {
        this.f23891l = aVar;
        for (C2798h c2798h : this.f23892m) {
            ((b) c2798h.G()).h(aVar);
        }
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f23890k)).f(this);
    }
}
