package Pd;

import Od.C;
import Od.F;
import Od.H;
import Pd.a;
import kotlin.jvm.internal.AbstractC4862t;
import xc.C6361d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final long i(long j10, int i10) {
        return a.v((j10 << 1) + ((long) i10));
    }

    public static final long j(long j10) {
        return a.v((j10 << 1) + 1);
    }

    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(Bc.k.l(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    public static final long l(long j10) {
        return a.v(j10 << 1);
    }

    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0170a c0170a = a.f13294b;
        long jB = c0170a.b();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && F.L0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            d dVar = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!F.U("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    AbstractC4862t.c(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    AbstractC4862t.d(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    d dVarD = f.d(cCharAt5, z14);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iH0 = F.h0(strSubstring, '.', 0, false, 6, null);
                    if (dVarD != d.SECONDS || iH0 <= 0) {
                        z11 = z14;
                        jB = a.Q(jB, t(q(strSubstring), dVarD));
                    } else {
                        AbstractC4862t.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iH0);
                        AbstractC4862t.d(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jQ = a.Q(jB, t(q(strSubstring2), dVarD));
                        AbstractC4862t.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iH0);
                        AbstractC4862t.d(strSubstring3, "substring(...)");
                        jB = a.Q(jQ, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    z14 = z11;
                    dVar = dVarD;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z14 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (C.G(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0170a.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && H.k1(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z15 = true;
                } else {
                    i10 = length;
                }
                boolean z16 = false;
                d dVar2 = null;
                while (length2 < i10) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    AbstractC4862t.c(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    AbstractC4862t.d(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    AbstractC4862t.c(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    AbstractC4862t.d(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iH02 = F.h0(strSubstring4, '.', 0, false, 6, null);
                    if (iH02 > 0) {
                        AbstractC4862t.c(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iH02);
                        AbstractC4862t.d(strSubstring6, "substring(...)");
                        long jQ2 = a.Q(jB, t(Long.parseLong(strSubstring6), dVarE));
                        AbstractC4862t.c(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iH02);
                        AbstractC4862t.d(strSubstring7, "substring(...)");
                        jB = a.Q(jQ2, r(Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jB = a.Q(jB, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    dVar2 = dVarE;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? a.V(jB) : jB;
    }

    public static final long q(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !F.U("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!C.P(str, "+", false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(H.i1(str, 1));
    }

    public static final long r(double d10, d unit) {
        AbstractC4862t.e(unit, "unit");
        double dA = e.a(d10, unit, d.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jD = C6361d.d(dA);
        return (-4611686018426999999L > jD || jD >= 4611686018427000000L) ? k(C6361d.d(e.a(d10, unit, d.MILLISECONDS))) : l(jD);
    }

    public static final long s(int i10, d unit) {
        AbstractC4862t.e(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? l(e.c(i10, unit, d.NANOSECONDS)) : t(i10, unit);
    }

    public static final long t(long j10, d unit) {
        AbstractC4862t.e(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j10 || j10 > jC) ? j(Bc.k.l(e.b(j10, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(e.c(j10, unit, dVar));
    }
}
