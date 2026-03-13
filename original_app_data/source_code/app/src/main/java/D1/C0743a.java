package D1;

import D1.r;
import G1.AbstractC0853a;
import G1.M;
import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: D1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0743a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0743a f1626g = new C0743a(null, new C0034a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0034a f1627h = new C0034a(0).h(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f1628i = M.z0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1629j = M.z0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1630k = M.z0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1631l = M.z0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0034a[] f1637f;

    /* JADX INFO: renamed from: D1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0034a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f1638l = M.z0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f1639m = M.z0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f1640n = M.z0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f1641o = M.z0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f1642p = M.z0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f1643q = M.z0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f1644r = M.z0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f1645s = M.z0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f1646t = M.z0(8);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f1647u = M.z0(9);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f1648v = M.z0(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f1652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final r[] f1653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f1654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f1655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f1656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f1657i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f1658j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f1659k;

        public C0034a(long j10) {
            this(j10, -1, -1, new int[0], new r[0], new long[0], 0L, false, new String[0], false);
        }

        public static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        public static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f1654f;
                if (i12 >= iArr.length || this.f1658j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean e() {
            if (this.f1650b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f1650b; i10++) {
                int i11 = this.f1654f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0034a.class == obj.getClass()) {
                C0034a c0034a = (C0034a) obj;
                if (this.f1649a == c0034a.f1649a && this.f1650b == c0034a.f1650b && this.f1651c == c0034a.f1651c && Arrays.equals(this.f1653e, c0034a.f1653e) && Arrays.equals(this.f1654f, c0034a.f1654f) && Arrays.equals(this.f1655g, c0034a.f1655g) && this.f1657i == c0034a.f1657i && this.f1658j == c0034a.f1658j && Arrays.equals(this.f1656h, c0034a.f1656h) && this.f1659k == c0034a.f1659k) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f1659k && this.f1649a == Long.MIN_VALUE && this.f1650b == -1;
        }

        public boolean g() {
            return this.f1650b == -1 || c() < this.f1650b;
        }

        public C0034a h(int i10) {
            int[] iArrB = b(this.f1654f, i10);
            long[] jArrA = a(this.f1655g, i10);
            return new C0034a(this.f1649a, i10, this.f1651c, iArrB, (r[]) Arrays.copyOf(this.f1653e, i10), jArrA, this.f1657i, this.f1658j, (String[]) Arrays.copyOf(this.f1656h, i10), this.f1659k);
        }

        public int hashCode() {
            int i10 = ((this.f1650b * 31) + this.f1651c) * 31;
            long j10 = this.f1649a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f1653e)) * 31) + Arrays.hashCode(this.f1654f)) * 31) + Arrays.hashCode(this.f1655g)) * 31;
            long j11 = this.f1657i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f1658j ? 1 : 0)) * 31) + Arrays.hashCode(this.f1656h)) * 31) + (this.f1659k ? 1 : 0);
        }

        public C0034a(long j10, int i10, int i11, int[] iArr, r[] rVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            AbstractC0853a.a(iArr.length == rVarArr.length);
            this.f1649a = j10;
            this.f1650b = i10;
            this.f1651c = i11;
            this.f1654f = iArr;
            this.f1653e = rVarArr;
            this.f1655g = jArr;
            this.f1657i = j11;
            this.f1658j = z10;
            this.f1652d = new Uri[rVarArr.length];
            while (true) {
                Uri[] uriArr = this.f1652d;
                if (i12 >= uriArr.length) {
                    this.f1656h = strArr;
                    this.f1659k = z11;
                    return;
                } else {
                    r rVar = rVarArr[i12];
                    uriArr[i12] = rVar == null ? null : ((r.h) AbstractC0853a.e(rVar.f1873b)).f1968a;
                    i12++;
                }
            }
        }
    }

    public C0743a(Object obj, C0034a[] c0034aArr, long j10, long j11, int i10) {
        this.f1632a = obj;
        this.f1634c = j10;
        this.f1635d = j11;
        this.f1633b = c0034aArr.length + i10;
        this.f1637f = c0034aArr;
        this.f1636e = i10;
    }

    public C0034a a(int i10) {
        int i11 = this.f1636e;
        return i10 < i11 ? f1627h : this.f1637f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f1636e;
            while (i10 < this.f1633b && ((a(i10).f1649a != Long.MIN_VALUE && a(i10).f1649a <= j10) || !a(i10).g())) {
                i10++;
            }
            if (i10 < this.f1633b && (j11 == -9223372036854775807L || a(i10).f1649a <= j11)) {
                return i10;
            }
        }
        return -1;
    }

    public int c(long j10, long j11) {
        C0743a c0743a;
        int i10 = this.f1633b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (true) {
            c0743a = this;
            if (i11 < 0) {
                break;
            }
            long j12 = j10;
            long j13 = j11;
            if (!c0743a.e(j12, j13, i11)) {
                break;
            }
            i11--;
            this = c0743a;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !c0743a.a(i11).e()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f1633b - 1 && a(i10).f();
    }

    public final boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        C0034a c0034aA = a(i10);
        long j12 = c0034aA.f1649a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || c0034aA.f() || j10 < j11 : j10 < j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0743a.class == obj.getClass()) {
            C0743a c0743a = (C0743a) obj;
            if (Objects.equals(this.f1632a, c0743a.f1632a) && this.f1633b == c0743a.f1633b && this.f1634c == c0743a.f1634c && this.f1635d == c0743a.f1635d && this.f1636e == c0743a.f1636e && Arrays.equals(this.f1637f, c0743a.f1637f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f1633b * 31;
        Object obj = this.f1632a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f1634c)) * 31) + ((int) this.f1635d)) * 31) + this.f1636e) * 31) + Arrays.hashCode(this.f1637f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f1632a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f1634c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f1637f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f1637f[i10].f1649a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f1637f[i10].f1654f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f1637f[i10].f1654f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f1637f[i10].f1655g[i11]);
                sb2.append(')');
                if (i11 < this.f1637f[i10].f1654f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f1637f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
