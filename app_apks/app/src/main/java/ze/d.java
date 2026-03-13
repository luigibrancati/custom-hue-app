package ze;

import Bc.k;
import Fe.C0843e;
import Fe.C0846h;
import Od.C;
import Od.C1822b;
import Od.F;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f48902a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48903b = "xn--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0846h f48904c = C0846h.f4117d.d("xn--");

    public final int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = i12 + (i12 / i11);
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return i14 + ((i13 * 36) / (i13 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [char] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    public final List b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (C1822b.e(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    public final String c(String string) {
        AbstractC4862t.e(string, "string");
        int length = string.length();
        C0843e c0843e = new C0843e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iH0 = F.h0(str, '.', i10, false, 4, null);
            if (iH0 == -1) {
                iH0 = length;
            }
            if (!d(str, i10, iH0, c0843e)) {
                return null;
            }
            if (iH0 >= length) {
                break;
            }
            c0843e.writeByte(46);
            i10 = iH0 + 1;
            string = str;
        }
        return c0843e.p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(String str, int i10, int i11, C0843e c0843e) {
        int i12;
        int i13;
        int i14 = 1;
        if (!C.G(str, i10, f48903b, 0, 4, true)) {
            c0843e.W(str, i10, i11);
            return true;
        }
        int i15 = i10 + 4;
        ArrayList arrayList = new ArrayList();
        int iN0 = F.n0(str, '-', i11, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        boolean z10 = false;
        if (iN0 >= i15) {
            while (i15 < iN0) {
                int i16 = i15 + 1;
                char cCharAt = str.charAt(i15);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i15 = i16;
            }
            i15++;
        }
        int i17 = 128;
        int iA = 72;
        int i18 = 0;
        while (i15 < i11) {
            int i19 = i14;
            boolean z11 = z10;
            Bc.d dVarN = k.n(k.p(36, Integer.MAX_VALUE), 36);
            int iC = dVarN.c();
            int iD = dVarN.d();
            int iE = dVarN.e();
            if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
                i12 = i18;
                int i20 = i19;
                while (i15 != i11) {
                    int i21 = i15 + 1;
                    char cCharAt2 = str.charAt(i15);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i13 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i13 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return z11;
                        }
                        i13 = cCharAt2 - 22;
                    }
                    int i22 = i20;
                    int i23 = i13 * i22;
                    int i24 = i12;
                    if (i24 > Integer.MAX_VALUE - i23) {
                        return z11;
                    }
                    i12 = i24 + i23;
                    int i25 = iC <= iA ? i19 : iC >= iA + 26 ? 26 : iC - iA;
                    if (i13 >= i25) {
                        int i26 = 36 - i25;
                        if (i22 > Integer.MAX_VALUE / i26) {
                            return z11;
                        }
                        i20 = i22 * i26;
                        if (iC != iD) {
                            iC += iE;
                            i15 = i21;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i15 = i21;
                }
                return z11;
            }
            i12 = i18;
            iA = a(i12 - i18, arrayList.size() + 1, i18 == 0 ? i19 : z11);
            int size = i12 / (arrayList.size() + 1);
            if (i17 > Integer.MAX_VALUE - size) {
                return z11;
            }
            i17 += size;
            int size2 = i12 % (arrayList.size() + 1);
            if (i17 > 1114111) {
                return z11;
            }
            arrayList.add(size2, Integer.valueOf(i17));
            i18 = size2 + 1;
            z10 = z11;
            i14 = i19;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        boolean z12 = i14;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0843e.B(((Number) it.next()).intValue());
        }
        return z12;
    }

    public final String e(String string) {
        AbstractC4862t.e(string, "string");
        int length = string.length();
        C0843e c0843e = new C0843e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iH0 = F.h0(str, '.', i10, false, 4, null);
            if (iH0 == -1) {
                iH0 = length;
            }
            if (!f(str, i10, iH0, c0843e)) {
                return null;
            }
            if (iH0 >= length) {
                break;
            }
            c0843e.writeByte(46);
            i10 = iH0 + 1;
            string = str;
        }
        return c0843e.p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(String str, int i10, int i11, C0843e c0843e) {
        int i12;
        int i13;
        int i14;
        int i15 = 1;
        if (!h(str, i10, i11)) {
            c0843e.W(str, i10, i11);
            return true;
        }
        c0843e.U(f48904c);
        List listB = b(str, i10, i11);
        Iterator it = listB.iterator();
        int i16 = 0;
        while (true) {
            i12 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 128) {
                c0843e.writeByte(iIntValue);
                i16++;
            }
        }
        if (i16 > 0) {
            c0843e.writeByte(45);
        }
        int iA = 72;
        int i17 = 0;
        int i18 = i16;
        while (i18 < listB.size()) {
            Iterator it2 = listB.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i12) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i12) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i19 = (iIntValue4 - i12) * (i18 + 1);
            if (i17 > Integer.MAX_VALUE - i19) {
                return false;
            }
            int i20 = i17 + i19;
            Iterator it3 = listB.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = ((Number) it3.next()).intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i20 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i20++;
                } else if (iIntValue5 == iIntValue4) {
                    Bc.d dVarN = k.n(k.p(36, Integer.MAX_VALUE), 36);
                    int iC = dVarN.c();
                    int iD = dVarN.d();
                    int iE = dVarN.e();
                    if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
                        i14 = i20;
                        while (true) {
                            if (iC <= iA) {
                                i13 = i15;
                            } else {
                                i13 = i15;
                                i15 = iC >= iA + 26 ? 26 : iC - iA;
                            }
                            if (i14 < i15) {
                                break;
                            }
                            int i21 = i14 - i15;
                            int i22 = 36 - i15;
                            c0843e.writeByte(g(i15 + (i21 % i22)));
                            i14 = i21 / i22;
                            if (iC == iD) {
                                break;
                            }
                            iC += iE;
                            i15 = i13;
                        }
                    } else {
                        i13 = i15;
                        i14 = i20;
                    }
                    c0843e.writeByte(g(i14));
                    int i23 = i18 + 1;
                    iA = a(i20, i23, i18 == i16 ? i13 : false);
                    i18 = i23;
                    i20 = 0;
                    i15 = i13;
                }
            }
            i17 = i20 + 1;
            i12 = iIntValue4 + 1;
        }
        return i15;
    }

    public final int g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    public final boolean h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }
}
