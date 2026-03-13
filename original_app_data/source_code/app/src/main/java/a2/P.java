package a2;

import D1.D;
import D1.r;
import G1.AbstractC0853a;
import a2.InterfaceC2611D;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC2622h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final D1.r f20566w = new r.c().c("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC2611D[] f20569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f20570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D1.D[] f20571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f20572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC2624j f20573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f20574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K7.G f20575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long[][] f20577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f20578v;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC2636w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f20579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f20580g;

        public b(D1.D d10, Map map) {
            super(d10);
            int iP = d10.p();
            this.f20580g = new long[d10.p()];
            D.c cVar = new D.c();
            for (int i10 = 0; i10 < iP; i10++) {
                this.f20580g[i10] = d10.n(i10, cVar).f1485m;
            }
            int i11 = d10.i();
            this.f20579f = new long[i11];
            D.b bVar = new D.b();
            for (int i12 = 0; i12 < i11; i12++) {
                d10.g(i12, bVar, true);
                long jLongValue = ((Long) AbstractC0853a.e((Long) map.get(bVar.f1451b))).longValue();
                long[] jArr = this.f20579f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f1453d : jLongValue;
                jArr[i12] = jLongValue;
                long j10 = bVar.f1453d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f20580g;
                    int i13 = bVar.f1452c;
                    jArr2[i13] = jArr2[i13] - (j10 - jLongValue);
                }
            }
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f1453d = this.f20579f[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // a2.AbstractC2636w, D1.D
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public D1.D.c o(int r3, D1.D.c r4, long r5) {
            /*
                r2 = this;
                super.o(r3, r4, r5)
                long[] r2 = r2.f20580g
                r2 = r2[r3]
                r4.f1485m = r2
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r0 == 0) goto L1e
                long r0 = r4.f1484l
                int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r2 = java.lang.Math.min(r0, r2)
                goto L20
            L1e:
                long r2 = r4.f1484l
            L20:
                r4.f1484l = r2
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.P.b.o(int, D1.D$c, long):D1.D$c");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20581a;

        public c(int i10) {
            this.f20581a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2611D.b f20582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2610C f20583b;

        public d(InterfaceC2611D.b bVar, InterfaceC2610C interfaceC2610C) {
            this.f20582a = bVar;
            this.f20583b = interfaceC2610C;
        }
    }

    public P(InterfaceC2611D... interfaceC2611DArr) {
        this(false, interfaceC2611DArr);
    }

    @Override // a2.AbstractC2622h, a2.AbstractC2615a
    public void D(I1.x xVar) {
        super.D(xVar);
        for (int i10 = 0; i10 < this.f20569m.length; i10++) {
            L(Integer.valueOf(i10), this.f20569m[i10]);
        }
    }

    @Override // a2.AbstractC2622h, a2.AbstractC2615a
    public void F() {
        super.F();
        Arrays.fill(this.f20571o, (Object) null);
        this.f20576t = -1;
        this.f20578v = null;
        this.f20572p.clear();
        Collections.addAll(this.f20572p, this.f20569m);
    }

    public final void M() {
        D.b bVar = new D.b();
        for (int i10 = 0; i10 < this.f20576t; i10++) {
            long j10 = -this.f20571o[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                D1.D[] dArr = this.f20571o;
                if (i11 < dArr.length) {
                    this.f20577u[i10][i11] = j10 - (-dArr[i11].f(i10, bVar).n());
                    i11++;
                }
            }
        }
    }

    @Override // a2.AbstractC2622h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC2611D.b H(Integer num, InterfaceC2611D.b bVar) {
        List list = (List) this.f20570n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f20582a.equals(bVar)) {
                return ((d) ((List) this.f20570n.get(0)).get(i10)).f20582a;
            }
        }
        return null;
    }

    @Override // a2.AbstractC2622h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void K(Integer num, InterfaceC2611D interfaceC2611D, D1.D d10) {
        if (this.f20578v != null) {
            return;
        }
        if (this.f20576t == -1) {
            this.f20576t = d10.i();
        } else if (d10.i() != this.f20576t) {
            this.f20578v = new c(0);
            return;
        }
        if (this.f20577u.length == 0) {
            this.f20577u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f20576t, this.f20571o.length);
        }
        this.f20572p.remove(interfaceC2611D);
        this.f20571o[num.intValue()] = d10;
        if (this.f20572p.isEmpty()) {
            if (this.f20567k) {
                M();
            }
            D1.D bVar = this.f20571o[0];
            if (this.f20568l) {
                P();
                bVar = new b(bVar, this.f20574r);
            }
            E(bVar);
        }
    }

    public final void P() {
        D1.D[] dArr;
        D.b bVar = new D.b();
        for (int i10 = 0; i10 < this.f20576t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                dArr = this.f20571o;
                if (i11 >= dArr.length) {
                    break;
                }
                long j11 = dArr[i11].f(i10, bVar).j();
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + this.f20577u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object objM = dArr[0].m(i10);
            this.f20574r.put(objM, Long.valueOf(j10));
            Iterator it = this.f20575s.get(objM).iterator();
            while (it.hasNext()) {
                ((C2619e) it.next()).x(0L, j10);
            }
        }
    }

    @Override // a2.InterfaceC2611D
    public void b(D1.r rVar) {
        this.f20569m[0].b(rVar);
    }

    @Override // a2.InterfaceC2611D
    public D1.r f() {
        InterfaceC2611D[] interfaceC2611DArr = this.f20569m;
        return interfaceC2611DArr.length > 0 ? interfaceC2611DArr[0].f() : f20566w;
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        if (this.f20568l) {
            C2619e c2619e = (C2619e) interfaceC2610C;
            Iterator it = this.f20575s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C2619e) entry.getValue()).equals(c2619e)) {
                    this.f20575s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            interfaceC2610C = c2619e.f20740a;
        }
        O o10 = (O) interfaceC2610C;
        for (int i10 = 0; i10 < this.f20569m.length; i10++) {
            List list = (List) this.f20570n.get(i10);
            InterfaceC2610C interfaceC2610CR = o10.r(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((d) list.get(i11)).f20583b.equals(interfaceC2610CR)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f20569m[i10].h(o10.r(i10));
        }
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        int length = this.f20569m.length;
        InterfaceC2610C[] interfaceC2610CArr = new InterfaceC2610C[length];
        int iB = this.f20571o[0].b(bVar.f20522a);
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC2611D.b bVarA = bVar.a(this.f20571o[i10].m(iB));
            interfaceC2610CArr[i10] = this.f20569m[i10].k(bVarA, bVar2, j10 - this.f20577u[iB][i10]);
            ((List) this.f20570n.get(i10)).add(new d(bVarA, interfaceC2610CArr[i10]));
        }
        O o10 = new O(this.f20573q, this.f20577u[iB], interfaceC2610CArr);
        if (!this.f20568l) {
            return o10;
        }
        C2619e c2619e = new C2619e(o10, false, 0L, ((Long) AbstractC0853a.e((Long) this.f20574r.get(bVar.f20522a))).longValue());
        this.f20575s.put(bVar.f20522a, c2619e);
        return c2619e;
    }

    @Override // a2.AbstractC2622h, a2.InterfaceC2611D
    public void n() throws c {
        c cVar = this.f20578v;
        if (cVar != null) {
            throw cVar;
        }
        super.n();
    }

    public P(boolean z10, InterfaceC2611D... interfaceC2611DArr) {
        this(z10, false, interfaceC2611DArr);
    }

    public P(boolean z10, boolean z11, InterfaceC2611D... interfaceC2611DArr) {
        this(z10, z11, new C2625k(), interfaceC2611DArr);
    }

    public P(boolean z10, boolean z11, InterfaceC2624j interfaceC2624j, InterfaceC2611D... interfaceC2611DArr) {
        this.f20567k = z10;
        this.f20568l = z11;
        this.f20569m = interfaceC2611DArr;
        this.f20573q = interfaceC2624j;
        this.f20572p = new ArrayList(Arrays.asList(interfaceC2611DArr));
        this.f20576t = -1;
        this.f20570n = new ArrayList(interfaceC2611DArr.length);
        for (int i10 = 0; i10 < interfaceC2611DArr.length; i10++) {
            this.f20570n.add(new ArrayList());
        }
        this.f20571o = new D1.D[interfaceC2611DArr.length];
        this.f20577u = new long[0][];
        this.f20574r = new HashMap();
        this.f20575s = K7.H.a().a().e();
    }
}
