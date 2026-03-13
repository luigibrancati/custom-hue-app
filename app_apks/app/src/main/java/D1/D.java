package D1;

import D1.C0743a;
import D1.r;
import G1.AbstractC0853a;
import G1.M;
import android.net.Uri;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f1441a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1442b = M.z0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1443c = M.z0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1444d = M.z0(2);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends D {
        @Override // D1.D
        public int b(Object obj) {
            return -1;
        }

        @Override // D1.D
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // D1.D
        public int i() {
            return 0;
        }

        @Override // D1.D
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // D1.D
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // D1.D
        public int p() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f1445h = M.z0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f1446i = M.z0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f1447j = M.z0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f1448k = M.z0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f1449l = M.z0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f1450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f1451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C0743a f1456g = C0743a.f1626g;

        public int a(int i10) {
            return this.f1456g.a(i10).f1650b;
        }

        public long b(int i10, int i11) {
            C0743a.C0034a c0034aA = this.f1456g.a(i10);
            if (c0034aA.f1650b != -1) {
                return c0034aA.f1655g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f1456g.f1633b;
        }

        public int d(long j10) {
            return this.f1456g.b(j10, this.f1453d);
        }

        public int e(long j10) {
            return this.f1456g.c(j10, this.f1453d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f1450a, bVar.f1450a) && Objects.equals(this.f1451b, bVar.f1451b) && this.f1452c == bVar.f1452c && this.f1453d == bVar.f1453d && this.f1454e == bVar.f1454e && this.f1455f == bVar.f1455f && Objects.equals(this.f1456g, bVar.f1456g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f1456g.a(i10).f1649a;
        }

        public long g() {
            return this.f1456g.f1634c;
        }

        public int h(int i10, int i11) {
            C0743a.C0034a c0034aA = this.f1456g.a(i10);
            if (c0034aA.f1650b != -1) {
                return c0034aA.f1654f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f1450a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f1451b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f1452c) * 31;
            long j10 = this.f1453d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f1454e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f1455f ? 1 : 0)) * 31) + this.f1456g.hashCode();
        }

        public long i(int i10) {
            return this.f1456g.a(i10).f1657i;
        }

        public long j() {
            return this.f1453d;
        }

        public int k(int i10) {
            return this.f1456g.a(i10).c();
        }

        public int l(int i10, int i11) {
            return this.f1456g.a(i10).d(i11);
        }

        public long m() {
            return M.o1(this.f1454e);
        }

        public long n() {
            return this.f1454e;
        }

        public int o() {
            return this.f1456g.f1636e;
        }

        public boolean p(int i10) {
            return !this.f1456g.a(i10).e();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f1456g.d(i10);
        }

        public boolean r(int i10) {
            return this.f1456g.a(i10).f1658j;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, C0743a.f1626g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, C0743a c0743a, boolean z10) {
            this.f1450a = obj;
            this.f1451b = obj2;
            this.f1452c = i10;
            this.f1453d = j10;
            this.f1454e = j11;
            this.f1456g = c0743a;
            this.f1455f = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f1474b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f1476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f1479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1480h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1481i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public r.g f1482j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f1483k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f1484l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f1485m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1486n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1487o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f1488p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f1463q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Object f1464r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final r f1465s = new r.c().c("androidx.media3.common.Timeline").g(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f1466t = M.z0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f1467u = M.z0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f1468v = M.z0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f1469w = M.z0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f1470x = M.z0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f1471y = M.z0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f1472z = M.z0(7);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final String f1457A = M.z0(8);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final String f1458B = M.z0(9);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final String f1459C = M.z0(10);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final String f1460D = M.z0(11);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final String f1461E = M.z0(12);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final String f1462F = M.z0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f1473a = f1463q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f1475c = f1465s;

        public long a() {
            return M.h0(this.f1479g);
        }

        public long b() {
            return M.o1(this.f1484l);
        }

        public long c() {
            return this.f1484l;
        }

        public long d() {
            return M.o1(this.f1485m);
        }

        public long e() {
            return this.f1488p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f1473a, cVar.f1473a) && Objects.equals(this.f1475c, cVar.f1475c) && Objects.equals(this.f1476d, cVar.f1476d) && Objects.equals(this.f1482j, cVar.f1482j) && this.f1477e == cVar.f1477e && this.f1478f == cVar.f1478f && this.f1479g == cVar.f1479g && this.f1480h == cVar.f1480h && this.f1481i == cVar.f1481i && this.f1483k == cVar.f1483k && this.f1484l == cVar.f1484l && this.f1485m == cVar.f1485m && this.f1486n == cVar.f1486n && this.f1487o == cVar.f1487o && this.f1488p == cVar.f1488p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f1482j != null;
        }

        public c g(Object obj, r rVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, r.g gVar, long j13, long j14, int i10, int i11, long j15) {
            r.h hVar;
            this.f1473a = obj;
            this.f1475c = rVar != null ? rVar : f1465s;
            this.f1474b = (rVar == null || (hVar = rVar.f1873b) == null) ? null : hVar.f1975h;
            this.f1476d = obj2;
            this.f1477e = j10;
            this.f1478f = j11;
            this.f1479g = j12;
            this.f1480h = z10;
            this.f1481i = z11;
            this.f1482j = gVar;
            this.f1484l = j13;
            this.f1485m = j14;
            this.f1486n = i10;
            this.f1487o = i11;
            this.f1488p = j15;
            this.f1483k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f1473a.hashCode()) * 31) + this.f1475c.hashCode()) * 31;
            Object obj = this.f1476d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            r.g gVar = this.f1482j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f1477e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f1478f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f1479g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f1480h ? 1 : 0)) * 31) + (this.f1481i ? 1 : 0)) * 31) + (this.f1483k ? 1 : 0)) * 31;
            long j13 = this.f1484l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f1485m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f1486n) * 31) + this.f1487o) * 31;
            long j15 = this.f1488p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f1452c;
        if (n(i12, cVar).f1487o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f1486n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (d10.p() != p() || d10.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(d10.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(d10.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != d10.a(true) || (iC = c(true)) != d10.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != d10.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i10, long j10) {
        return (Pair) AbstractC0853a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair k(c cVar, b bVar, int i10, long j10, long j11) {
        AbstractC0853a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f1486n;
        f(i11, bVar);
        while (i11 < cVar.f1487o && bVar.f1454e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f1454e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f1454e;
        long j12 = bVar.f1453d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(AbstractC0853a.e(bVar.f1451b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
