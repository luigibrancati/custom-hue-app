package Od;

import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class v extends r {
    public static final vc.l e(final String str) {
        return str.length() == 0 ? new vc.l() { // from class: Od.s
            @Override // vc.l
            public final Object invoke(Object obj) {
                return v.f((String) obj);
            }
        } : new vc.l() { // from class: Od.t
            @Override // vc.l
            public final Object invoke(Object obj) {
                return v.g(str, (String) obj);
            }
        };
    }

    public static final String f(String line) {
        AbstractC4862t.e(line, "line");
        return line;
    }

    public static final String g(String str, String line) {
        AbstractC4862t.e(line, "line");
        return str + line;
    }

    public static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!C1821a.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String i(String str, final String indent) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(indent, "indent");
        return Nd.t.G(Nd.t.I(F.q0(str), new vc.l() { // from class: Od.u
            @Override // vc.l
            public final Object invoke(Object obj) {
                return v.k(indent, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    public static final String k(String str, String it) {
        AbstractC4862t.e(it, "it");
        if (F.k0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    public static final String l(String str, String newIndent) {
        String str2;
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(newIndent, "newIndent");
        List listR0 = F.r0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR0) {
            if (!F.k0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) C4179C.x0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listR0.size());
        vc.l lVarE = e(newIndent);
        int iM = C4206t.m(listR0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listR0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iM) && F.k0(str3)) {
                str3 = null;
            } else {
                String strI1 = H.i1(str3, iIntValue);
                if (strI1 != null && (str2 = (String) lVarE.invoke(strI1)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) C4179C.n0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String m(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(newIndent, "newIndent");
        AbstractC4862t.e(marginPrefix, "marginPrefix");
        if (F.k0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listR0 = F.r0(str);
        int length = str.length() + (newIndent.length() * listR0.size());
        vc.l lVarE = e(newIndent);
        int iM = C4206t.m(listR0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listR0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM) && F.k0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!C1821a.c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (C.O(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        AbstractC4862t.c(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        AbstractC4862t.d(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) lVarE.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) C4179C.n0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String n(String str) {
        AbstractC4862t.e(str, "<this>");
        return l(str, "");
    }

    public static final String o(String str, String marginPrefix) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(marginPrefix, "marginPrefix");
        return m(str, "", marginPrefix);
    }

    public static /* synthetic */ String p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return o(str, str2);
    }
}
