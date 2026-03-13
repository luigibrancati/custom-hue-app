package Od;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class B extends A {
    public static final Void t(String input) {
        AbstractC4862t.e(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer u(String str) {
        AbstractC4862t.e(str, "<this>");
        return v(str, 10);
    }

    public static final Integer v(String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        AbstractC4862t.e(str, "<this>");
        C1821a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (AbstractC4862t.f(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iB = C1821a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iB) {
                return null;
            }
            i13 = i12 - iB;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    public static Long w(String str) {
        AbstractC4862t.e(str, "<this>");
        return x(str, 10);
    }

    public static final Long x(String str, int i10) {
        boolean z10;
        AbstractC4862t.e(str, "<this>");
        C1821a.a(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (AbstractC4862t.f(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iB = C1821a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l10;
                }
                j12 = j10 / ((long) i10);
                if (j11 < j12) {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * ((long) i10);
            long j14 = iB;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
