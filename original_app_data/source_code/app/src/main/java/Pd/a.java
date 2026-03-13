package Pd;

import Od.F;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0170a f13294b = new C0170a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13295c = v(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13296d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f13297e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13298a;

    /* JADX INFO: renamed from: Pd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0170a {
        public /* synthetic */ C0170a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return a.f13296d;
        }

        public final long b() {
            return a.f13295c;
        }

        public final long c(String value) {
            AbstractC4862t.e(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        public C0170a() {
        }
    }

    public /* synthetic */ a(long j10) {
        this.f13298a = j10;
    }

    public static final long A(long j10) {
        return T(j10, d.HOURS);
    }

    public static final long B(long j10) {
        return (L(j10) && K(j10)) ? I(j10) : T(j10, d.MILLISECONDS);
    }

    public static final long C(long j10) {
        return T(j10, d.MINUTES);
    }

    public static final long D(long j10) {
        return T(j10, d.SECONDS);
    }

    public static final int E(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (C(j10) % ((long) 60));
    }

    public static final int F(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (L(j10) ? c.n(I(j10) % ((long) 1000)) : I(j10) % ((long) 1000000000));
    }

    public static final int G(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (D(j10) % ((long) 60));
    }

    public static final d H(long j10) {
        return M(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    public static final long I(long j10) {
        return j10 >> 1;
    }

    public static int J(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean K(long j10) {
        return !N(j10);
    }

    public static final boolean L(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean M(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean N(long j10) {
        return j10 == f13296d || j10 == f13297e;
    }

    public static final boolean O(long j10) {
        return j10 < 0;
    }

    public static final boolean P(long j10) {
        return j10 > 0;
    }

    public static final long Q(long j10, long j11) {
        if (N(j10)) {
            if (K(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (N(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return L(j10) ? j(j10, I(j10), I(j11)) : j(j10, I(j11), I(j10));
        }
        long jI = I(j10) + I(j11);
        return M(j10) ? c.m(jI) : c.k(jI);
    }

    public static final double R(long j10, d unit) {
        AbstractC4862t.e(unit, "unit");
        if (j10 == f13296d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f13297e) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(I(j10), H(j10), unit);
    }

    public static final String S(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (O(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jX = x(j10);
        long jA = A(jX);
        int iE = E(jX);
        int iG = G(jX);
        int iF = F(jX);
        long j11 = N(j10) ? 9999999999999L : jA;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iG == 0 && iF == 0) ? false : true;
        if (iE != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iE);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            p(j10, sb2, iG, iF, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long T(long j10, d unit) {
        AbstractC4862t.e(unit, "unit");
        if (j10 == f13296d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f13297e) {
            return Long.MIN_VALUE;
        }
        return e.b(I(j10), H(j10), unit);
    }

    public static String U(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f13296d) {
            return "Infinity";
        }
        if (j10 == f13297e) {
            return "-Infinity";
        }
        boolean zO = O(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zO) {
            sb2.append('-');
        }
        long jX = x(j10);
        long jZ = z(jX);
        int iY = y(jX);
        int iE = E(jX);
        int iG = G(jX);
        int iF = F(jX);
        int i10 = 0;
        boolean z10 = jZ != 0;
        boolean z11 = iY != 0;
        boolean z12 = iE != 0;
        boolean z13 = (iG == 0 && iF == 0) ? false : true;
        if (z10) {
            sb2.append(jZ);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iY);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iE);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iG != 0 || z10 || z11 || z12) {
                p(j10, sb2, iG, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                p(j10, sb2, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                p(j10, sb2, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb2.append(iF);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zO && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long V(long j10) {
        return c.i(-I(j10), ((int) j10) & 1);
    }

    public static final long j(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.j(Bc.k.l(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    public static final void p(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strT0 = F.t0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strT0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strT0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strT0, 0, ((i13 + 3) / 3) * 3);
                AbstractC4862t.d(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strT0, 0, i15);
                AbstractC4862t.d(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a q(long j10) {
        return new a(j10);
    }

    public static int u(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC4862t.g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return O(j10) ? -i10 : i10;
    }

    public static long v(long j10) {
        if (!b.a()) {
            return j10;
        }
        if (M(j10)) {
            long jI = I(j10);
            if (-4611686018426999999L <= jI && jI < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(I(j10) + " ns is out of nanoseconds range");
        }
        long jI2 = I(j10);
        if (-4611686018427387903L > jI2 || jI2 >= 4611686018427387904L) {
            throw new AssertionError(I(j10) + " ms is out of milliseconds range");
        }
        long jI3 = I(j10);
        if (-4611686018426L > jI3 || jI3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(I(j10) + " ms is denormalized");
    }

    public static boolean w(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).W();
    }

    public static final long x(long j10) {
        return O(j10) ? V(j10) : j10;
    }

    public static final int y(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (A(j10) % ((long) 24));
    }

    public static final long z(long j10) {
        return T(j10, d.DAYS);
    }

    public final /* synthetic */ long W() {
        return this.f13298a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return s(((a) obj).W());
    }

    public boolean equals(Object obj) {
        return w(this.f13298a, obj);
    }

    public int hashCode() {
        return J(this.f13298a);
    }

    public int s(long j10) {
        return u(this.f13298a, j10);
    }

    public String toString() {
        return U(this.f13298a);
    }
}
