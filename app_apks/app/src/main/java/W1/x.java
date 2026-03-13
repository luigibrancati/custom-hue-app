package W1;

import G1.AbstractC0853a;
import W1.a;
import W1.w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17794a = Pattern.compile("([a-z])=\\s?((?:.|\f)+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f17795b = Pattern.compile("^([a-z])=$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17796c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::((?:.|\f)*))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f17797d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static void a(w.b bVar, a.b bVar2) throws D1.w {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw D1.w.c(null, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static W1.w b(java.lang.String r14) throws D1.w {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.x.b(java.lang.String):W1.w");
    }

    public static a.b c(String str) throws D1.w {
        Matcher matcher = f17797d.matcher(str);
        if (!matcher.matches()) {
            throw D1.w.c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new a.b((String) AbstractC0853a.e(matcher.group(1)), Integer.parseInt((String) AbstractC0853a.e(matcher.group(2))), (String) AbstractC0853a.e(matcher.group(3)), Integer.parseInt((String) AbstractC0853a.e(matcher.group(4))));
        } catch (NumberFormatException e10) {
            G1.t.i("SDPParser", "Malformed SDP media description line: " + str, e10);
            return null;
        }
    }
}
