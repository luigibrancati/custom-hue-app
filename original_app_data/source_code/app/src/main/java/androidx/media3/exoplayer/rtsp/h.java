package androidx.media3.exoplayer.rtsp;

import D1.w;
import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1081v;
import K7.C1082w;
import K7.Y;
import W1.s;
import W1.t;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.e;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f23816a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f23817b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f23818c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f23819d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f23820e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f23821f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f23822g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f23823h = new String(new byte[]{13, 10});

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23825b;

        public a(String str, String str2) {
            this.f23824a = str;
            this.f23825b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f23827b;

        public b(String str, long j10) {
            this.f23826a = str;
            this.f23827b = j10;
        }
    }

    public static void a(boolean z10, String str) throws w {
        if (!z10) {
            throw w.c(str, null);
        }
    }

    public static byte[] b(List list) {
        return J7.g.g(f23823h).d(list).getBytes(g.f23797g);
    }

    public static String c(int i10) {
        if (i10 == 200) {
            return "OK";
        }
        if (i10 == 461) {
            return "Unsupported Transport";
        }
        if (i10 == 500) {
            return "Internal Server Error";
        }
        if (i10 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i10 == 301) {
            return "Move Permanently";
        }
        if (i10 == 302) {
            return "Move Temporarily";
        }
        if (i10 == 400) {
            return "Bad Request";
        }
        if (i10 == 401) {
            return "Unauthorized";
        }
        if (i10 == 404) {
            return "Not Found";
        }
        if (i10 == 405) {
            return "Method Not Allowed";
        }
        switch (i10) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(g.f23797g);
    }

    public static boolean e(List list) {
        return f23817b.matcher((CharSequence) list.get(0)).matches();
    }

    public static boolean f(String str) {
        return f23816a.matcher(str).matches() || f23817b.matcher(str).matches();
    }

    public static long g(String str) {
        try {
            Matcher matcher = f23818c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) AbstractC0853a.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e10) {
            throw w.c(str, e10);
        }
    }

    public static int h(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw w.c(str, e10);
        }
    }

    public static int i(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static AbstractC1081v j(String str) {
        if (str == null) {
            return AbstractC1081v.z();
        }
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        for (String str2 : M.h1(str, ",\\s?")) {
            int i10 = i(str2);
            if (i10 != 0) {
                aVar.a(Integer.valueOf(i10));
            }
        }
        return aVar.k();
    }

    public static s k(List list) {
        Matcher matcher = f23816a.matcher((CharSequence) list.get(0));
        AbstractC0853a.a(matcher.matches());
        int i10 = i((String) AbstractC0853a.e(matcher.group(1)));
        Uri uri = Uri.parse((String) AbstractC0853a.e(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        AbstractC0853a.a(iIndexOf > 0);
        return new s(uri, i10, new e.b().c(list.subList(1, iIndexOf)).e(), J7.g.g(f23823h).d(list.subList(iIndexOf + 1, list.size())));
    }

    public static t l(List list) {
        Matcher matcher = f23817b.matcher((CharSequence) list.get(0));
        AbstractC0853a.a(matcher.matches());
        int i10 = Integer.parseInt((String) AbstractC0853a.e(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        AbstractC0853a.a(iIndexOf > 0);
        return new t(i10, new e.b().c(list.subList(1, iIndexOf)).e(), J7.g.g(f23823h).d(list.subList(iIndexOf + 1, list.size())));
    }

    public static b m(String str) throws w {
        long j10;
        Matcher matcher = f23819d.matcher(str);
        if (!matcher.matches()) {
            throw w.c(str, null);
        }
        String str2 = (String) AbstractC0853a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e10) {
                throw w.c(str, e10);
            }
        } else {
            j10 = 60000;
        }
        return new b(str2, j10);
    }

    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            return null;
        }
        String[] strArrI1 = M.i1(userInfo, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        return new a(strArrI1[0], strArrI1[1]);
    }

    public static c o(String str) throws w {
        Matcher matcher = f23820e.matcher(str);
        if (matcher.find()) {
            return new c(2, (String) AbstractC0853a.e(matcher.group(1)), (String) AbstractC0853a.e(matcher.group(3)), J7.s.c(matcher.group(4)));
        }
        Matcher matcher2 = f23821f.matcher(str);
        if (matcher2.matches()) {
            return new c(1, (String) AbstractC0853a.e(matcher2.group(1)), "", "");
        }
        throw w.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) AbstractC0853a.e(uri.getEncodedAuthority());
        AbstractC0853a.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(M.h1(str, "@")[1]).build();
    }

    public static AbstractC1081v q(s sVar) {
        AbstractC0853a.a(sVar.f17758c.d("CSeq") != null);
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        aVar.a(M.G("%s %s %s", t(sVar.f17757b), sVar.f17756a, "RTSP/1.0"));
        C1082w c1082wB = sVar.f17758c.b();
        Y it = c1082wB.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1081v abstractC1081v = c1082wB.get(str);
            for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                aVar.a(M.G("%s: %s", str, abstractC1081v.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(sVar.f17759d);
        return aVar.k();
    }

    public static AbstractC1081v r(t tVar) {
        AbstractC0853a.a(tVar.f17761b.d("CSeq") != null);
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        aVar.a(M.G("%s %s %s", "RTSP/1.0", Integer.valueOf(tVar.f17760a), c(tVar.f17760a)));
        C1082w c1082wB = tVar.f17761b.b();
        Y it = c1082wB.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1081v abstractC1081v = c1082wB.get(str);
            for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                aVar.a(M.G("%s: %s", str, abstractC1081v.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(tVar.f17762c);
        return aVar.k();
    }

    public static String[] s(String str) {
        String str2 = f23823h;
        if (!str.contains(str2)) {
            str2 = f23822g;
        }
        return M.h1(str, str2);
    }

    public static String t(int i10) {
        switch (i10) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
