package qe;

import Od.C;
import Od.C1829i;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4862t;
import pe.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Od.o f43461a = new Od.o("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Od.o f43462b = new Od.o(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final boolean a(x xVar, Object obj) {
        AbstractC4862t.e(xVar, "<this>");
        return (obj instanceof x) && AbstractC4862t.a(((x) obj).a(), xVar.a());
    }

    public static final int b(x xVar) {
        AbstractC4862t.e(xVar, "<this>");
        return xVar.a().hashCode();
    }

    public static final x c(String str) {
        AbstractC4862t.e(str, "<this>");
        Od.k kVarB = m.B(f43461a, str, 0);
        if (kVarB == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        String str2 = (String) kVarB.b().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        AbstractC4862t.d(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) kVarB.b().get(2)).toLowerCase(locale);
        AbstractC4862t.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int iD = kVarB.c().d();
        while (true) {
            int i10 = iD + 1;
            if (i10 >= str.length()) {
                return new x(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            Od.k kVarB2 = m.B(f43462b, str, i10);
            if (kVarB2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i10);
                AbstractC4862t.d(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                sb2.append(str);
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            C1829i c1829i = kVarB2.d().get(1);
            String strA = c1829i != null ? c1829i.a() : null;
            if (strA == null) {
                iD = kVarB2.c().d();
            } else {
                C1829i c1829i2 = kVarB2.d().get(2);
                String strA2 = c1829i2 != null ? c1829i2.a() : null;
                if (strA2 == null) {
                    C1829i c1829i3 = kVarB2.d().get(3);
                    AbstractC4862t.b(c1829i3);
                    strA2 = c1829i3.a();
                } else if (C.P(strA2, "'", false, 2, null) && C.D(strA2, "'", false, 2, null) && strA2.length() > 2) {
                    strA2 = strA2.substring(1, strA2.length() - 1);
                    AbstractC4862t.d(strA2, "substring(...)");
                }
                arrayList.add(strA);
                arrayList.add(strA2);
                iD = kVarB2.c().d();
            }
        }
    }

    public static final x d(String str) {
        AbstractC4862t.e(str, "<this>");
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final String e(x xVar) {
        AbstractC4862t.e(xVar, "<this>");
        return xVar.a();
    }
}
