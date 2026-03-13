package Od;

import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.C4202o;
import gc.C4204q;
import gc.C4205s;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class F extends C {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Nd.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f12392a;

        public a(CharSequence charSequence) {
            this.f12392a = charSequence;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return new C1828h(this.f12392a);
        }
    }

    public static final boolean A0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C1822b.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String B0(String str, CharSequence prefix) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(prefix, "prefix");
        if (!M0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C0(String str, CharSequence suffix) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(suffix, "suffix");
        if (!Z(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void D0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List E0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return G0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableV = Nd.t.v(w0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C4207u.v(iterableV, 10));
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            arrayList.add(N0(charSequence, (Bc.f) it.next()));
        }
        return arrayList;
    }

    public static final List F0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return G0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableV = Nd.t.v(x0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C4207u.v(iterableV, 10));
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            arrayList.add(N0(charSequence, (Bc.f) it.next()));
        }
        return arrayList;
    }

    public static final List G0(CharSequence charSequence, String str, boolean z10, int i10) {
        D0(i10);
        int length = 0;
        int iE0 = e0(charSequence, str, 0, z10);
        if (iE0 == -1 || i10 == 1) {
            return C4205s.d(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? Bc.k.h(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iE0).toString());
            length = str.length() + iE0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iE0 = e0(charSequence, str, length, z10);
        } while (iE0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List H0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return E0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List I0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return F0(charSequence, strArr, z10, i10);
    }

    public static final boolean J0(CharSequence charSequence, char c10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        return charSequence.length() > 0 && C1822b.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean K0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? C.P((String) charSequence, (String) prefix, false, 2, null) : A0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean L0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean M0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return K0(charSequence, charSequence2, z10);
    }

    public static final String N0(CharSequence charSequence, Bc.f range) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(range, "range");
        return charSequence.subSequence(range.n().intValue(), range.l().intValue() + 1).toString();
    }

    public static String O0(String str, char c10, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, c10, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iH0 + 1, str.length());
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(delimiter, "delimiter");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, delimiter, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iI0 + delimiter.length(), str.length());
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String Q0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return O0(str, c10, str2);
    }

    public static /* synthetic */ String R0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return P0(str, str2, str3);
    }

    public static final boolean S(CharSequence charSequence, char c10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        return h0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static String S0(String str, char c10, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, c10, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iN0 + 1, str.length());
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean T(CharSequence charSequence, CharSequence other, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(other, "other");
        return other instanceof String ? i0(charSequence, (String) other, 0, z10, 2, null) >= 0 : g0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static String T0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(delimiter, "delimiter");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = o0(str, delimiter, 0, false, 6, null);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iO0 + delimiter.length(), str.length());
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean U(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S(charSequence, c10, z10);
    }

    public static /* synthetic */ String U0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return S0(str, c10, str2);
    }

    public static /* synthetic */ boolean V(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return T(charSequence, charSequence2, z10);
    }

    public static final String V0(String str, char c10, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, c10, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iH0);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean W(CharSequence charSequence, char c10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        return charSequence.length() > 0 && C1822b.d(charSequence.charAt(c0(charSequence)), c10, z10);
    }

    public static final String W0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(delimiter, "delimiter");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, delimiter, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iI0);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean X(CharSequence charSequence, CharSequence suffix, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? C.D((String) charSequence, (String) suffix, false, 2, null) : A0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ String X0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return V0(str, c10, str2);
    }

    public static /* synthetic */ boolean Y(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return W(charSequence, c10, z10);
    }

    public static /* synthetic */ String Y0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return W0(str, str2, str3);
    }

    public static /* synthetic */ boolean Z(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return X(charSequence, charSequence2, z10);
    }

    public static final String Z0(String str, char c10, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, c10, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iN0);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final C4034q a0(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) C4179C.E0(collection);
            int iI0 = !z11 ? i0(charSequence, str, i10, false, 4, null) : o0(charSequence, str, i10, false, 4, null);
            if (iI0 < 0) {
                return null;
            }
            return AbstractC4040w.a(Integer.valueOf(iI0), str);
        }
        CharSequence charSequence3 = charSequence;
        Bc.d fVar = !z11 ? new Bc.f(Bc.k.e(i10, 0), charSequence3.length()) : Bc.k.m(Bc.k.h(i10, c0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iC = fVar.c();
            int iD = fVar.d();
            int iE = fVar.e();
            if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
                int i11 = iC;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (C.G(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iD) {
                            break;
                        }
                        i11 += iE;
                        z10 = z12;
                    } else {
                        return AbstractC4040w.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iC2 = fVar.c();
            int iD2 = fVar.d();
            int iE2 = fVar.e();
            if ((iE2 > 0 && iC2 <= iD2) || (iE2 < 0 && iD2 <= iC2)) {
                int i12 = iC2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (A0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iD2) {
                            break;
                        }
                        i12 += iE2;
                        charSequence3 = charSequence2;
                    } else {
                        return AbstractC4040w.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static String a1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(delimiter, "delimiter");
        AbstractC4862t.e(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = o0(str, delimiter, 0, false, 6, null);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iO0);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Bc.f b0(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        return new Bc.f(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String b1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Z0(str, c10, str2);
    }

    public static int c0(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String c1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return a1(str, str2, str3);
    }

    public static final int d0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? j0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static Boolean d1(String str) {
        AbstractC4862t.e(str, "<this>");
        if (AbstractC4862t.a(str, "true")) {
            return Boolean.TRUE;
        }
        if (AbstractC4862t.a(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int e0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? g0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static CharSequence e1(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = C1821a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int f0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        Bc.d fVar = !z11 ? new Bc.f(Bc.k.e(i10, 0), Bc.k.h(i11, charSequence.length())) : Bc.k.m(Bc.k.h(i10, c0(charSequence)), Bc.k.e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iC = fVar.c();
            int iD = fVar.d();
            int iE = fVar.e();
            if ((iE <= 0 || iC > iD) && (iE >= 0 || iD > iC)) {
                return -1;
            }
            int i12 = iC;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (C.G(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iD) {
                    return -1;
                }
                i12 += iE;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iC2 = fVar.c();
            int iD2 = fVar.d();
            int iE2 = fVar.e();
            if ((iE2 <= 0 || iC2 > iD2) && (iE2 >= 0 || iD2 > iC2)) {
                return -1;
            }
            int i13 = iC2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (A0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iD2) {
                    return -1;
                }
                i13 += iE2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static String f1(String str, char... chars) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM = C4204q.M(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM) {
                    break;
                }
                length--;
            } else if (zM) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int g0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return f0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static String g1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!C4204q.M(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ int h0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return d0(charSequence, c10, i10, z10);
    }

    public static String h1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(chars, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!C4204q.M(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ int i0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, str, i10, z10);
    }

    public static final int j0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C4204q.x0(chars), i10);
        }
        int iE = Bc.k.e(i10, 0);
        int iC0 = c0(charSequence);
        if (iE > iC0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iE);
            for (char c10 : chars) {
                if (C1822b.d(c10, cCharAt, z10)) {
                    return iE;
                }
            }
            if (iE == iC0) {
                return -1;
            }
            iE++;
        }
    }

    public static boolean k0(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!C1821a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int l0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? p0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int m0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? f0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int n0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = c0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return l0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int o0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = c0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m0(charSequence, str, i10, z10);
    }

    public static final int p0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC4862t.e(charSequence, "<this>");
        AbstractC4862t.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C4204q.x0(chars), i10);
        }
        for (int iH = Bc.k.h(i10, c0(charSequence)); -1 < iH; iH--) {
            char cCharAt = charSequence.charAt(iH);
            for (char c10 : chars) {
                if (C1822b.d(c10, cCharAt, z10)) {
                    return iH;
                }
            }
        }
        return -1;
    }

    public static final Nd.h q0(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        return new a(charSequence);
    }

    public static List r0(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        return Nd.t.O(q0(charSequence));
    }

    public static final CharSequence s0(CharSequence charSequence, int i10, char c10) {
        AbstractC4862t.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String t0(String str, int i10, char c10) {
        AbstractC4862t.e(str, "<this>");
        return s0(str, i10, c10).toString();
    }

    public static final Nd.h u0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        D0(i11);
        return new C1824d(charSequence, i10, i11, new vc.p() { // from class: Od.E
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return F.y0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static final Nd.h v0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        D0(i11);
        final List listH = C4202o.h(strArr);
        return new C1824d(charSequence, i10, i11, new vc.p() { // from class: Od.D
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return F.z0(listH, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ Nd.h w0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return u0(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ Nd.h x0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return v0(charSequence, strArr, i10, z10, i11);
    }

    public static final C4034q y0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC4862t.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iJ0 = j0(DelimitedRangesSequence, cArr, i10, z10);
        if (iJ0 < 0) {
            return null;
        }
        return AbstractC4040w.a(Integer.valueOf(iJ0), 1);
    }

    public static final C4034q z0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC4862t.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        C4034q c4034qA0 = a0(DelimitedRangesSequence, list, i10, z10, false);
        if (c4034qA0 != null) {
            return AbstractC4040w.a(c4034qA0.e(), Integer.valueOf(((String) c4034qA0.f()).length()));
        }
        return null;
    }
}
