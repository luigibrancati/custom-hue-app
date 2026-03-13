package a2;

import D1.o;
import G1.AbstractC0853a;
import K1.F0;
import K1.k1;
import a2.InterfaceC2610C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O implements InterfaceC2610C, InterfaceC2610C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2610C[] f20555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f20556b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2624j f20558d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC2610C.a f20561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n0 f20562h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f20564j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20559e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f20560f = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f20557c = new IdentityHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC2610C[] f20563i = new InterfaceC2610C[0];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends d2.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D1.E f20565b;

        public a(d2.r rVar, D1.E e10) {
            super(rVar);
            this.f20565b = e10;
        }

        @Override // d2.v
        public int d(D1.o oVar) {
            return v().l(this.f20565b.b(oVar));
        }

        @Override // d2.v
        public D1.o e(int i10) {
            return this.f20565b.a(v().f(i10));
        }

        @Override // d2.t
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f20565b.equals(((a) obj).f20565b);
            }
            return false;
        }

        @Override // d2.t
        public int hashCode() {
            return (super.hashCode() * 31) + this.f20565b.hashCode();
        }

        @Override // d2.v
        public D1.E n() {
            return this.f20565b;
        }

        @Override // d2.r
        public D1.o s() {
            return this.f20565b.a(v().r());
        }
    }

    public O(InterfaceC2624j interfaceC2624j, long[] jArr, InterfaceC2610C... interfaceC2610CArr) {
        this.f20558d = interfaceC2624j;
        this.f20555a = interfaceC2610CArr;
        this.f20564j = interfaceC2624j.empty();
        this.f20556b = new boolean[interfaceC2610CArr.length];
        for (int i10 = 0; i10 < interfaceC2610CArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f20556b[i10] = true;
                this.f20555a[i10] = new k0(interfaceC2610CArr[i10], j10);
            }
        }
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return this.f20564j.b();
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        InterfaceC2610C[] interfaceC2610CArr = this.f20563i;
        return (interfaceC2610CArr.length > 0 ? interfaceC2610CArr[0] : this.f20555a[0]).c(j10, k1Var);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f20564j.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        if (this.f20559e.isEmpty()) {
            return this.f20564j.e(f02);
        }
        int size = this.f20559e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC2610C) this.f20559e.get(i10)).e(f02);
        }
        return false;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return this.f20564j.g();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        this.f20564j.h(j10);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        long jI = this.f20563i[0].i(j10);
        int i10 = 1;
        while (true) {
            InterfaceC2610C[] interfaceC2610CArr = this.f20563i;
            if (i10 >= interfaceC2610CArr.length) {
                return jI;
            }
            if (interfaceC2610CArr[i10].i(jI) != jI) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        long j10 = -9223372036854775807L;
        for (InterfaceC2610C interfaceC2610C : this.f20563i) {
            long jK = interfaceC2610C.k();
            if (jK == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && interfaceC2610C.i(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (InterfaceC2610C interfaceC2610C2 : this.f20563i) {
                    if (interfaceC2610C2 == interfaceC2610C) {
                        break;
                    }
                    if (interfaceC2610C2.i(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jK;
            } else if (jK != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            c0 c0Var = c0VarArr[i11];
            Integer num = c0Var == null ? null : (Integer) this.f20557c.get(c0Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            d2.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.n().f1492b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f20557c.clear();
        int length = rVarArr.length;
        c0[] c0VarArr2 = new c0[length];
        c0[] c0VarArr3 = new c0[rVarArr.length];
        d2.r[] rVarArr2 = new d2.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f20555a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f20555a.length) {
            for (int i13 = i10; i13 < rVarArr.length; i13++) {
                c0VarArr3[i13] = iArr[i13] == i12 ? c0VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    d2.r rVar2 = (d2.r) AbstractC0853a.e(rVarArr[i13]);
                    rVarArr2[i13] = new a(rVar2, (D1.E) AbstractC0853a.e((D1.E) this.f20560f.get(rVar2.n())));
                } else {
                    rVarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jL = this.f20555a[i12].l(rVarArr2, zArr, c0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jL;
            } else if (jL != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    c0 c0Var2 = (c0) AbstractC0853a.e(c0VarArr3[i15]);
                    c0VarArr2[i15] = c0VarArr3[i15];
                    this.f20557c.put(c0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC0853a.g(c0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f20555a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c0VarArr2, i16, c0VarArr, i16, length);
        this.f20563i = (InterfaceC2610C[]) arrayList.toArray(new InterfaceC2610C[i16]);
        this.f20564j = this.f20558d.a(arrayList, K7.D.k(arrayList, new J7.f() { // from class: a2.N
            @Override // J7.f
            public final Object apply(Object obj) {
                return ((InterfaceC2610C) obj).q().c();
            }
        }));
        return j11;
    }

    @Override // a2.InterfaceC2610C
    public void m() {
        for (InterfaceC2610C interfaceC2610C : this.f20555a) {
            interfaceC2610C.m();
        }
    }

    @Override // a2.InterfaceC2610C.a
    public void n(InterfaceC2610C interfaceC2610C) {
        this.f20559e.remove(interfaceC2610C);
        if (!this.f20559e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (InterfaceC2610C interfaceC2610C2 : this.f20555a) {
            i10 += interfaceC2610C2.q().f20863a;
        }
        D1.E[] eArr = new D1.E[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            InterfaceC2610C[] interfaceC2610CArr = this.f20555a;
            if (i11 >= interfaceC2610CArr.length) {
                this.f20562h = new n0(eArr);
                ((InterfaceC2610C.a) AbstractC0853a.e(this.f20561g)).n(this);
                return;
            }
            n0 n0VarQ = interfaceC2610CArr[i11].q();
            int i13 = n0VarQ.f20863a;
            int i14 = 0;
            while (i14 < i13) {
                D1.E eB = n0VarQ.b(i14);
                D1.o[] oVarArr = new D1.o[eB.f1491a];
                for (int i15 = 0; i15 < eB.f1491a; i15++) {
                    D1.o oVarA = eB.a(i15);
                    o.b bVarB = oVarA.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    String str = oVarA.f1791a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    oVarArr[i15] = bVarB.j0(sb2.toString()).P();
                }
                D1.E e10 = new D1.E(i11 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + eB.f1492b, oVarArr);
                this.f20560f.put(e10, eB);
                eArr[i12] = e10;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f20561g = aVar;
        Collections.addAll(this.f20559e, this.f20555a);
        for (InterfaceC2610C interfaceC2610C : this.f20555a) {
            interfaceC2610C.p(this, j10);
        }
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return (n0) AbstractC0853a.e(this.f20562h);
    }

    public InterfaceC2610C r(int i10) {
        return this.f20556b[i10] ? ((k0) this.f20555a[i10]).a() : this.f20555a[i10];
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC2610C interfaceC2610C) {
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20561g)).f(this);
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        for (InterfaceC2610C interfaceC2610C : this.f20563i) {
            interfaceC2610C.u(j10, z10);
        }
    }
}
