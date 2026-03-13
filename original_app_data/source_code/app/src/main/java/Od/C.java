package Od;

import gc.AbstractC4191d;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C extends B {
    public static String A(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        return new String(bArr, C1823c.f12394b);
    }

    public static byte[] B(String str) {
        AbstractC4862t.e(str, "<this>");
        byte[] bytes = str.getBytes(C1823c.f12394b);
        AbstractC4862t.d(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean C(String str, String suffix, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : G(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean D(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C(str, str2, z10);
    }

    public static boolean E(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator F(S s10) {
        AbstractC4862t.e(s10, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC4862t.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean G(String str, int i10, String other, int i11, int i12, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String H(CharSequence charSequence, int i10) {
        AbstractC4862t.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC4862t.b(string);
        return string;
    }

    public static final String I(String str, char c10, char c11, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            AbstractC4862t.d(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (C1822b.d(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String J(String str, String oldValue, String newValue, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(oldValue, "oldValue");
        AbstractC4862t.e(newValue, "newValue");
        int i10 = 0;
        int iE0 = F.e0(str, oldValue, 0, z10);
        if (iE0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iE = Bc.k.e(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iE0);
            sb2.append(newValue);
            i10 = iE0 + length;
            if (iE0 >= str.length()) {
                break;
            }
            iE0 = F.e0(str, oldValue, iE0 + iE, z10);
        } while (iE0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String K(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return I(str, c10, c11, z10);
    }

    public static /* synthetic */ String L(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return J(str, str2, str3, z10);
    }

    public static boolean M(String str, String prefix, int i10, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : G(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean N(String str, String prefix, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : G(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean O(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return M(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean P(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(str, str2, z10);
    }

    public static String y(char[] cArr) {
        AbstractC4862t.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String z(char[] cArr, int i10, int i11) {
        AbstractC4862t.e(cArr, "<this>");
        AbstractC4191d.f35593a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }
}
