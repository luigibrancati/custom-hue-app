package nd;

import Od.C;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: nd.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5175n {
    public static final String a(kd.d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        List listH = dVar.h();
        AbstractC4862t.d(listH, "pathSegments()");
        return c(listH);
    }

    public static final String b(kd.f fVar) {
        AbstractC4862t.e(fVar, "<this>");
        if (!e(fVar)) {
            String strB = fVar.b();
            AbstractC4862t.d(strB, "asString()");
            return strB;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB2 = fVar.b();
        AbstractC4862t.d(strB2, "asString()");
        sb2.append('`' + strB2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List pathSegments) {
        AbstractC4862t.e(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            kd.f fVar = (kd.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        AbstractC4862t.e(lowerRendered, "lowerRendered");
        AbstractC4862t.e(lowerPrefix, "lowerPrefix");
        AbstractC4862t.e(upperRendered, "upperRendered");
        AbstractC4862t.e(upperPrefix, "upperPrefix");
        AbstractC4862t.e(foldedPrefix, "foldedPrefix");
        if (C.P(lowerRendered, lowerPrefix, false, 2, null) && C.P(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            AbstractC4862t.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            AbstractC4862t.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String str = foldedPrefix + strSubstring;
            if (AbstractC4862t.a(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    public static final boolean e(kd.f fVar) {
        String strB = fVar.b();
        AbstractC4862t.d(strB, "asString()");
        if (AbstractC5170i.f40868a.contains(strB)) {
            return true;
        }
        for (int i10 = 0; i10 < strB.length(); i10++) {
            char cCharAt = strB.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(String lower, String upper) {
        AbstractC4862t.e(lower, "lower");
        AbstractC4862t.e(upper, "upper");
        if (AbstractC4862t.a(lower, C.L(upper, "?", "", false, 4, null))) {
            return true;
        }
        if (C.D(upper, "?", false, 2, null)) {
            if (AbstractC4862t.a(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(lower);
        sb2.append(")?");
        return AbstractC4862t.a(sb2.toString(), upper);
    }
}
