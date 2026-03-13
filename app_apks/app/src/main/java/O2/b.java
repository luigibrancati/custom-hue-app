package O2;

import G1.AbstractC0853a;
import G1.AbstractC0862j;
import G1.C;
import G1.M;
import G1.t;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f10859c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10860d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f10861a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f10862b = new StringBuilder();

    public static boolean b(C c10) {
        int iG = c10.g();
        int iJ = c10.j();
        byte[] bArrF = c10.f();
        if (iG + 2 > iJ) {
            return false;
        }
        int i10 = iG + 1;
        if (bArrF[iG] != 47) {
            return false;
        }
        int i11 = iG + 2;
        if (bArrF[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iJ) {
                c10.b0(iJ - c10.g());
                return true;
            }
            if (((char) bArrF[i11]) == '*' && ((char) bArrF[i12]) == '/') {
                i11 += 2;
                iJ = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public static boolean c(C c10) {
        char cK = k(c10, c10.g());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        c10.b0(1);
        return true;
    }

    public static void e(String str, c cVar) {
        Matcher matcher = f10860d.matcher(J7.c.e(str));
        if (!matcher.matches()) {
            t.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC0853a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) AbstractC0853a.e(matcher.group(1))));
    }

    public static String f(C c10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iG = c10.g();
        int iJ = c10.j();
        while (iG < iJ && !z10) {
            char c11 = (char) c10.f()[iG];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z10 = true;
            } else {
                iG++;
                sb2.append(c11);
            }
        }
        c10.b0(iG - c10.g());
        return sb2.toString();
    }

    public static String g(C c10, StringBuilder sb2) {
        n(c10);
        if (c10.a() == 0) {
            return null;
        }
        String strF = f(c10, sb2);
        if (!strF.isEmpty()) {
            return strF;
        }
        return "" + ((char) c10.L());
    }

    public static String h(C c10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iG = c10.g();
            String strG = g(c10, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                c10.a0(iG);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    public static String i(C c10, StringBuilder sb2) {
        n(c10);
        if (c10.a() < 5 || !"::cue".equals(c10.I(5))) {
            return null;
        }
        int iG = c10.g();
        String strG = g(c10, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            c10.a0(iG);
            return "";
        }
        String strL = "(".equals(strG) ? l(c10) : null;
        if (")".equals(g(c10, sb2))) {
            return strL;
        }
        return null;
    }

    public static void j(C c10, c cVar, StringBuilder sb2) {
        n(c10);
        String strF = f(c10, sb2);
        if (!strF.isEmpty() && TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(g(c10, sb2))) {
            n(c10);
            String strH = h(c10, sb2);
            if (strH == null || strH.isEmpty()) {
                return;
            }
            int iG = c10.g();
            String strG = g(c10, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    c10.a0(iG);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(AbstractC0862j.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(AbstractC0862j.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    public static char k(C c10, int i10) {
        return (char) c10.f()[i10];
    }

    public static String l(C c10) {
        int iG = c10.g();
        int iJ = c10.j();
        boolean z10 = false;
        while (iG < iJ && !z10) {
            int i10 = iG + 1;
            z10 = ((char) c10.f()[iG]) == ')';
            iG = i10;
        }
        return c10.I((iG - 1) - c10.g()).trim();
    }

    public static void m(C c10) {
        while (!TextUtils.isEmpty(c10.w())) {
        }
    }

    public static void n(C c10) {
        while (true) {
            for (boolean z10 = true; c10.a() > 0 && z10; z10 = false) {
                if (c(c10) || b(c10)) {
                    break;
                }
            }
            return;
        }
    }

    public final void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f10859c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) AbstractC0853a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrH1 = M.h1(str, "\\.");
        String str2 = strArrH1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrH1.length > 1) {
            cVar.w((String[]) M.T0(strArrH1, 1, strArrH1.length));
        }
    }

    public List d(C c10) {
        this.f10862b.setLength(0);
        int iG = c10.g();
        m(c10);
        this.f10861a.Y(c10.f(), c10.g());
        this.f10861a.a0(iG);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f10861a, this.f10862b);
            if (strI == null || !"{".equals(g(this.f10861a, this.f10862b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iG2 = this.f10861a.g();
                String strG = g(this.f10861a, this.f10862b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f10861a.a0(iG2);
                    j(this.f10861a, cVar, this.f10862b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
