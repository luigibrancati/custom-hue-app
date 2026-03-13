package d2;

import D1.E;
import G1.InterfaceC0860h;
import G1.M;
import K7.A;
import K7.AbstractC1081v;
import K7.C;
import K7.H;
import d2.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C3807a extends AbstractC3809c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2.d f32790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f32791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f32792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f32793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f32794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f32795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f32796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f32797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1081v f32798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0860h f32799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f32800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32801t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f32803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b2.m f32804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f32805x;

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0394a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f32806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32807b;

        public C0394a(long j10, long j11) {
            this.f32806a = j10;
            this.f32807b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0394a)) {
                return false;
            }
            C0394a c0394a = (C0394a) obj;
            return this.f32806a == c0394a.f32806a && this.f32807b == c0394a.f32807b;
        }

        public int hashCode() {
            return (((int) this.f32806a) * 31) + ((int) this.f32807b);
        }
    }

    /* JADX INFO: renamed from: d2.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f32810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f32811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f32813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f32814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InterfaceC0860h f32815h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // d2.r.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final d2.r[] a(d2.r.a[] r10, e2.d r11, a2.InterfaceC2611D.b r12, D1.D r13) {
            /*
                r9 = this;
                K7.v r12 = d2.C3807a.w(r10)
                int r13 = r10.length
                d2.r[] r13 = new d2.r[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L44
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.f32964b
                int r3 = r5.length
                if (r3 != 0) goto L18
            L15:
                r3 = r9
                r7 = r11
                goto L3f
            L18:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L2c
                d2.s r3 = new d2.s
                D1.E r4 = r2.f32963a
                r5 = r5[r0]
                int r2 = r2.f32965c
                r3.<init>(r4, r5, r2)
                r7 = r3
                r3 = r9
                r9 = r7
                r7 = r11
                goto L3d
            L2c:
                D1.E r4 = r2.f32963a
                int r6 = r2.f32965c
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                K7.v r8 = (K7.AbstractC1081v) r8
                r3 = r9
                r7 = r11
                d2.a r9 = r3.b(r4, r5, r6, r7, r8)
            L3d:
                r13[r1] = r9
            L3f:
                int r1 = r1 + 1
                r9 = r3
                r11 = r7
                goto L9
            L44:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.C3807a.b.a(d2.r$a[], e2.d, a2.D$b, D1.D):d2.r[]");
        }

        public C3807a b(E e10, int[] iArr, int i10, e2.d dVar, AbstractC1081v abstractC1081v) {
            return new C3807a(e10, iArr, i10, dVar, this.f32808a, this.f32809b, this.f32810c, this.f32811d, this.f32812e, this.f32813f, this.f32814g, abstractC1081v, this.f32815h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC0860h.f4292a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC0860h interfaceC0860h) {
            this.f32808a = i10;
            this.f32809b = i11;
            this.f32810c = i12;
            this.f32811d = i13;
            this.f32812e = i14;
            this.f32813f = f10;
            this.f32814g = f11;
            this.f32815h = interfaceC0860h;
        }
    }

    public C3807a(E e10, int[] iArr, int i10, e2.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, InterfaceC0860h interfaceC0860h) {
        long j13;
        super(e10, iArr, i10);
        if (j12 < j10) {
            G1.t.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f32790i = dVar;
        this.f32791j = j10 * 1000;
        this.f32792k = j11 * 1000;
        this.f32793l = j13 * 1000;
        this.f32794m = i11;
        this.f32795n = i12;
        this.f32796o = f10;
        this.f32797p = f11;
        this.f32798q = AbstractC1081v.v(list);
        this.f32799r = interfaceC0860h;
        this.f32800s = 1.0f;
        this.f32802u = 0;
        this.f32803v = -9223372036854775807L;
        this.f32805x = -2147483647L;
    }

    public static AbstractC1081v A(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f32964b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC1081v.a aVarR = AbstractC1081v.r();
                aVarR.a(new C0394a(0L, 0L));
                arrayList.add(aVarR);
            }
        }
        long[][] jArrF = F(aVarArr);
        int[] iArr = new int[jArrF.length];
        long[] jArr = new long[jArrF.length];
        for (int i10 = 0; i10 < jArrF.length; i10++) {
            long[] jArr2 = jArrF[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        x(arrayList, jArr);
        AbstractC1081v abstractC1081vG = G(jArrF);
        for (int i11 = 0; i11 < abstractC1081vG.size(); i11++) {
            int iIntValue = ((Integer) abstractC1081vG.get(i11)).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrF[iIntValue][i12];
            x(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        x(arrayList, jArr);
        AbstractC1081v.a aVarR2 = AbstractC1081v.r();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            AbstractC1081v.a aVar2 = (AbstractC1081v.a) arrayList.get(i14);
            aVarR2.a(aVar2 == null ? AbstractC1081v.z() : aVar2.k());
        }
        return aVarR2.k();
    }

    public static long[][] F(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f32964b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f32964b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f32963a.a(iArr[i11]).f1800j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    public static AbstractC1081v G(long[][] jArr) {
        C cE = H.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    cE.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC1081v.v(cE.values());
    }

    public static void x(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC1081v.a aVar = (AbstractC1081v.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0394a(j10, jArr[i10]));
            }
        }
    }

    public final long B(long j10) {
        long jH = H(j10);
        if (this.f32798q.isEmpty()) {
            return jH;
        }
        int i10 = 1;
        while (i10 < this.f32798q.size() - 1 && ((C0394a) this.f32798q.get(i10)).f32806a < jH) {
            i10++;
        }
        C0394a c0394a = (C0394a) this.f32798q.get(i10 - 1);
        C0394a c0394a2 = (C0394a) this.f32798q.get(i10);
        long j11 = c0394a.f32806a;
        float f10 = (jH - j11) / (c0394a2.f32806a - j11);
        return c0394a.f32807b + ((long) (f10 * (c0394a2.f32807b - r0)));
    }

    public final long C(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        b2.m mVar = (b2.m) A.d(list);
        long j10 = mVar.f25000g;
        if (j10 != -9223372036854775807L) {
            long j11 = mVar.f25001h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
        }
        return -9223372036854775807L;
    }

    public long D() {
        return this.f32793l;
    }

    public final long E(b2.n[] nVarArr, List list) {
        int i10 = this.f32801t;
        if (i10 < nVarArr.length && nVarArr[i10].next()) {
            b2.n nVar = nVarArr[this.f32801t];
            return nVar.b() - nVar.a();
        }
        for (b2.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.b() - nVar2.a();
            }
        }
        return C(list);
    }

    public final long H(long j10) {
        long jF = this.f32790i.f();
        this.f32805x = jF;
        long j11 = (long) (jF * this.f32796o);
        long jA = this.f32790i.a();
        if (jA == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f32800s);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f32800s) - jA, 0.0f)) / f10);
    }

    public final long I(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f32791j;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f32797p), this.f32791j);
    }

    public boolean J(long j10, List list) {
        long j11 = this.f32803v;
        if (j11 == -9223372036854775807L || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((b2.m) A.d(list)).equals(this.f32804w)) ? false : true;
    }

    @Override // d2.r
    public int b() {
        return this.f32801t;
    }

    @Override // d2.AbstractC3809c, d2.r
    public void c() {
        this.f32804w = null;
    }

    @Override // d2.r
    public void g(long j10, long j11, long j12, List list, b2.n[] nVarArr) {
        long jC = this.f32799r.c();
        long jE = E(nVarArr, list);
        int i10 = this.f32802u;
        if (i10 == 0) {
            this.f32802u = 1;
            this.f32801t = z(jC, jE);
            return;
        }
        int i11 = this.f32801t;
        int iD = list.isEmpty() ? -1 : d(((b2.m) A.d(list)).f24997d);
        if (iD != -1) {
            i10 = ((b2.m) A.d(list)).f24998e;
            i11 = iD;
        }
        int iZ = z(jC, jE);
        if (iZ != i11 && !a(i11, jC)) {
            D1.o oVarE = e(i11);
            D1.o oVarE2 = e(iZ);
            long jI = I(j12, jE);
            int i12 = oVarE2.f1800j;
            int i13 = oVarE.f1800j;
            if ((i12 > i13 && j11 < jI) || (i12 < i13 && j11 >= this.f32792k)) {
                iZ = i11;
            }
        }
        if (iZ != i11) {
            i10 = 3;
        }
        this.f32802u = i10;
        this.f32801t = iZ;
    }

    @Override // d2.AbstractC3809c, d2.r
    public void i(float f10) {
        this.f32800s = f10;
    }

    @Override // d2.r
    public Object j() {
        return null;
    }

    @Override // d2.AbstractC3809c, d2.r
    public void p() {
        this.f32803v = -9223372036854775807L;
        this.f32804w = null;
    }

    @Override // d2.AbstractC3809c, d2.r
    public int q(long j10, List list) {
        int i10;
        int i11;
        long jC = this.f32799r.c();
        if (!J(jC, list)) {
            return list.size();
        }
        this.f32803v = jC;
        this.f32804w = list.isEmpty() ? null : (b2.m) A.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM0 = M.m0(((b2.m) list.get(size - 1)).f25000g - j10, this.f32800s);
        long jD = D();
        if (jM0 >= jD) {
            D1.o oVarE = e(z(jC, C(list)));
            for (int i12 = 0; i12 < size; i12++) {
                b2.m mVar = (b2.m) list.get(i12);
                D1.o oVar = mVar.f24997d;
                if (M.m0(mVar.f25000g - j10, this.f32800s) >= jD && oVar.f1800j < oVarE.f1800j && (i10 = oVar.f1813w) != -1 && i10 <= this.f32795n && (i11 = oVar.f1812v) != -1 && i11 <= this.f32794m && i10 < oVarE.f1813w) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // d2.r
    public int t() {
        return this.f32802u;
    }

    public boolean y(D1.o oVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    public final int z(long j10, long j11) {
        long jB = B(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32817b; i11++) {
            if (j10 == Long.MIN_VALUE || !a(i11, j10)) {
                D1.o oVarE = e(i11);
                if (y(oVarE, oVarE.f1800j, jB)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
