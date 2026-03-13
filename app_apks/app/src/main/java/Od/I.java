package Od;

import fc.C4009B;
import fc.C4012E;
import fc.C4025h;
import fc.C4041x;
import fc.C4043z;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class I {
    public static final byte a(String str) {
        AbstractC4862t.e(str, "<this>");
        C4041x c4041xB = b(str);
        if (c4041xB != null) {
            return c4041xB.s();
        }
        B.t(str);
        throw new C4025h();
    }

    public static final C4041x b(String str) {
        AbstractC4862t.e(str, "<this>");
        return c(str, 10);
    }

    public static final C4041x c(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        C4043z c4043zF = f(str, i10);
        if (c4043zF == null) {
            return null;
        }
        int iS = c4043zF.s();
        if (Integer.compareUnsigned(iS, C4043z.b(255)) > 0) {
            return null;
        }
        return C4041x.a(C4041x.b((byte) iS));
    }

    public static final int d(String str) {
        AbstractC4862t.e(str, "<this>");
        C4043z c4043zE = e(str);
        if (c4043zE != null) {
            return c4043zE.s();
        }
        B.t(str);
        throw new C4025h();
    }

    public static final C4043z e(String str) {
        AbstractC4862t.e(str, "<this>");
        return f(str, 10);
    }

    public static final C4043z f(String str, int i10) {
        int i11;
        AbstractC4862t.e(str, "<this>");
        C1821a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4862t.f(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iB = C4043z.b(i10);
        int iDivideUnsigned = 119304647;
        while (i11 < length) {
            int iB2 = C1821a.b(str.charAt(i11), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iB);
                    if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iB3 = C4043z.b(i12 * iB);
            int iB4 = C4043z.b(C4043z.b(iB2) + iB3);
            if (Integer.compareUnsigned(iB4, iB3) < 0) {
                return null;
            }
            i11++;
            i12 = iB4;
        }
        return C4043z.a(i12);
    }

    public static final long g(String str) {
        AbstractC4862t.e(str, "<this>");
        C4009B c4009bH = h(str);
        if (c4009bH != null) {
            return c4009bH.s();
        }
        B.t(str);
        throw new C4025h();
    }

    public static final C4009B h(String str) {
        AbstractC4862t.e(str, "<this>");
        return i(str, 10);
    }

    public static final C4009B i(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        C1821a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4862t.f(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = C4009B.b(i10);
        long j10 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i11 < length) {
            int iB = C1821a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jB);
                    if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jB2 = C4009B.b(j10 * jB);
            long jB3 = C4009B.b(C4009B.b(((long) C4043z.b(iB)) & KeyboardMap.kValueMask) + jB2);
            if (Long.compareUnsigned(jB3, jB2) < 0) {
                return null;
            }
            i11++;
            j10 = jB3;
        }
        return C4009B.a(j10);
    }

    public static final short j(String str) {
        AbstractC4862t.e(str, "<this>");
        C4012E c4012eK = k(str);
        if (c4012eK != null) {
            return c4012eK.u();
        }
        B.t(str);
        throw new C4025h();
    }

    public static final C4012E k(String str) {
        AbstractC4862t.e(str, "<this>");
        return l(str, 10);
    }

    public static final C4012E l(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        C4043z c4043zF = f(str, i10);
        if (c4043zF == null) {
            return null;
        }
        int iS = c4043zF.s();
        if (Integer.compareUnsigned(iS, C4043z.b(65535)) > 0) {
            return null;
        }
        return C4012E.a(C4012E.b((short) iS));
    }
}
