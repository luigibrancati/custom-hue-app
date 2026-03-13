package O2;

import D1.w;
import G1.C;
import G1.M;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10909a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(C c10) {
        String strW;
        while (true) {
            String strW2 = c10.w();
            if (strW2 == null) {
                return null;
            }
            if (f10909a.matcher(strW2).matches()) {
                do {
                    strW = c10.w();
                    if (strW != null) {
                    }
                } while (!strW.isEmpty());
            } else {
                Matcher matcher = e.f10883a.matcher(strW2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(C c10) {
        String strW = c10.w();
        return strW != null && strW.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrI1 = M.i1(str, "\\.");
        long j10 = 0;
        for (String str2 : M.h1(strArrI1[0], TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrI1.length == 2) {
            String strTrim = strArrI1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void e(C c10) throws w {
        int iG = c10.g();
        if (b(c10)) {
            return;
        }
        c10.a0(iG);
        throw w.a("Expected WEBVTT. Got " + c10.w(), null);
    }
}
