package R1;

import C2.p;
import D1.AbstractC0747e;
import D1.C0753k;
import D1.v;
import D1.w;
import G1.AbstractC0853a;
import G1.M;
import R1.f;
import R1.h;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e2.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f14496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f14455c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f14456d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f14457e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f14458f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f14459g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f14460h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f14461i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f14462j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f14463k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f14465l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f14467m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f14469n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f14471o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f14473p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f14475q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f14477r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f14479s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f14481t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f14483u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f14485v = c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f14487w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f14489x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f14491y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f14493z = c("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pattern f14423A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Pattern f14425B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Pattern f14427C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Pattern f14429D = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Pattern f14431E = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Pattern f14433F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Pattern f14435G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Pattern f14437H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Pattern f14439I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Pattern f14441J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Pattern f14445P = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Pattern f14446Q = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Pattern f14447R = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Pattern f14448S = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Pattern f14449T = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Pattern f14450V = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Pattern f14451W = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Pattern f14452X = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Pattern f14453Y = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Pattern f14454Z = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Pattern f14464k0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Pattern f14466l0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Pattern f14468m0 = c("AUTOSELECT");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Pattern f14470n0 = c("DEFAULT");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Pattern f14472o0 = c("FORCED");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Pattern f14474p0 = c("INDEPENDENT");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Pattern f14476q0 = c("GAP");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Pattern f14478r0 = c("PRECISE");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f14480s0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f14482t0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f14484u0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f14486v0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f14488w0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Pattern f14490x0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Pattern f14492y0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final Pattern f14494z0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final Pattern f14424A0 = c("END-ON-NEXT");

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final Pattern f14426B0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final Pattern f14428C0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final Pattern f14430D0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final Pattern f14432E0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final Pattern f14434F0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final Pattern f14436G0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final Pattern f14438H0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final Pattern f14440I0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final Pattern f14442J0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final Pattern f14443K0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final Pattern f14444L0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends IOException {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f14497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue f14498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14499c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f14498b = queue;
            this.f14497a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f14499c != null) {
                return true;
            }
            if (!this.f14498b.isEmpty()) {
                this.f14499c = (String) AbstractC0853a.e((String) this.f14498b.poll());
                return true;
            }
            do {
                String line = this.f14497a.readLine();
                this.f14499c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f14499c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f14499c;
            this.f14499c = null;
            return str;
        }
    }

    public j() {
        this(h.f14399n, null);
    }

    public static f.h A(String str) {
        double dT = t(str, f14483u, -9.223372036854776E18d);
        long j10 = dT == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT * 1000000.0d);
        boolean zS = s(str, f14485v, false);
        double dT2 = t(str, f14489x, -9.223372036854776E18d);
        long j11 = dT2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT2 * 1000000.0d);
        double dT3 = t(str, f14491y, -9.223372036854776E18d);
        return new f.h(j10, zS, j11, dT3 != -9.223372036854776E18d ? (long) (dT3 * 1000000.0d) : -9223372036854775807L, s(str, f14493z, false));
    }

    public static String B(String str, Pattern pattern, Map map) throws w {
        String strX = x(str, pattern, map);
        if (strX != null) {
            return strX;
        }
        throw w.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static long C(String str, Pattern pattern) {
        return new BigDecimal(B(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String D(String str, Map map) {
        Matcher matcher = f14443K0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int E(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !M.F0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iE = E(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iE != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iE = bufferedReader.read();
        }
        return M.F0(E(bufferedReader, false, iE));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static C0753k d(String str, C0753k.b[] bVarArr) {
        C0753k.b[] bVarArr2 = new C0753k.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b(null);
        }
        return new C0753k(str, bVarArr2);
    }

    public static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    public static h.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            if (str.equals(bVar.f14417d)) {
                return bVar;
            }
        }
        return null;
    }

    public static h.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            if (str.equals(bVar.f14418e)) {
                return bVar;
            }
        }
        return null;
    }

    public static h.b h(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            if (str.equals(bVar.f14416c)) {
                return bVar;
            }
        }
        return null;
    }

    public static boolean i(String str, String str2, String str3, String str4) {
        if (!v.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    public static f.b k(String str, String str2, Map map) {
        String str3 = str2 + "=";
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new f.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    public static double l(String str, Pattern pattern) {
        return Double.parseDouble(B(str, pattern, Collections.EMPTY_MAP));
    }

    public static C0753k.b m(String str, String str2, Map map) throws w {
        String strW = w(str, f14447R, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strB = B(str, f14448S, map);
            return new C0753k.b(AbstractC0747e.f1687d, "video/mp4", Base64.decode(strB.substring(strB.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C0753k.b(AbstractC0747e.f1687d, "hls", M.u0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strW)) {
            return null;
        }
        String strB2 = B(str, f14448S, map);
        byte[] bArrDecode = Base64.decode(strB2.substring(strB2.indexOf(44)), 0);
        UUID uuid = AbstractC0747e.f1688e;
        return new C0753k.b(uuid, "video/mp4", p.a(uuid, bArrDecode));
    }

    public static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int o(String str, Pattern pattern) {
        return Integer.parseInt(B(str, pattern, Collections.EMPTY_MAP));
    }

    public static long p(String str, Pattern pattern) {
        return Long.parseLong(B(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x068d, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0691, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x069f, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ac, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x081d, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0822, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0832, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0841, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x084e, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x085b, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0868, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0875, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0883, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0890, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0331 A[PHI: r14
      0x0331: PHI (r14v9 java.lang.String) = (r14v7 java.lang.String), (r14v2 java.lang.String) binds: [B:119:0x0340, B:113:0x0324] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x068f A[PHI: r33
      0x068f: PHI (r33v15 int) = (r33v11 int), (r33v12 int), (r33v13 int), (r33v16 int) binds: [B:247:0x06b4, B:243:0x06a7, B:239:0x0699, B:236:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x081f A[PHI: r66
      0x081f: PHI (r66v13 java.util.ArrayList) = 
      (r66v3 java.util.ArrayList)
      (r66v4 java.util.ArrayList)
      (r66v5 java.util.ArrayList)
      (r66v6 java.util.ArrayList)
      (r66v7 java.util.ArrayList)
      (r66v8 java.util.ArrayList)
      (r66v9 java.util.ArrayList)
      (r66v10 java.util.ArrayList)
      (r66v11 java.util.ArrayList)
      (r66v14 java.util.ArrayList)
     binds: [B:355:0x0898, B:351:0x088b, B:347:0x087d, B:343:0x0870, B:339:0x0863, B:335:0x0856, B:331:0x0849, B:327:0x083a, B:323:0x082a, B:320:0x081d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r1v25, types: [R1.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v37, types: [R1.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v38, types: [R1.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v39, types: [R1.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v20 */
    /* JADX WARN: Type inference failed for: r34v22 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v30 */
    /* JADX WARN: Type inference failed for: r34v31 */
    /* JADX WARN: Type inference failed for: r34v32 */
    /* JADX WARN: Type inference failed for: r34v33 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v38 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r54v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r55v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v15 */
    /* JADX WARN: Type inference failed for: r56v9 */
    /* JADX WARN: Type inference failed for: r60v0 */
    /* JADX WARN: Type inference failed for: r60v1 */
    /* JADX WARN: Type inference failed for: r60v10 */
    /* JADX WARN: Type inference failed for: r60v16 */
    /* JADX WARN: Type inference failed for: r60v18 */
    /* JADX WARN: Type inference failed for: r60v2 */
    /* JADX WARN: Type inference failed for: r60v21 */
    /* JADX WARN: Type inference failed for: r60v26 */
    /* JADX WARN: Type inference failed for: r60v27 */
    /* JADX WARN: Type inference failed for: r60v28 */
    /* JADX WARN: Type inference failed for: r60v29 */
    /* JADX WARN: Type inference failed for: r60v3 */
    /* JADX WARN: Type inference failed for: r60v30 */
    /* JADX WARN: Type inference failed for: r60v31 */
    /* JADX WARN: Type inference failed for: r60v32 */
    /* JADX WARN: Type inference failed for: r60v4 */
    /* JADX WARN: Type inference failed for: r60v5 */
    /* JADX WARN: Type inference failed for: r60v6 */
    /* JADX WARN: Type inference failed for: r60v7 */
    /* JADX WARN: Type inference failed for: r60v8 */
    /* JADX WARN: Type inference failed for: r60v9 */
    /* JADX WARN: Type inference failed for: r64v1 */
    /* JADX WARN: Type inference failed for: r64v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r64v3 */
    /* JADX WARN: Type inference failed for: r64v4 */
    /* JADX WARN: Type inference failed for: r64v5 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r7v31, types: [R1.f$c$a] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R1.f q(R1.h r91, R1.f r92, R1.j.b r93, java.lang.String r94) throws D1.w, R1.j.a {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.j.q(R1.h, R1.f, R1.j$b, java.lang.String):R1.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R1.h r(R1.j.b r36, java.lang.String r37) throws D1.w {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.j.r(R1.j$b, java.lang.String):R1.h");
    }

    public static boolean s(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    public static double t(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC0853a.e(matcher.group(1))) : d10;
    }

    public static int u(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC0853a.e(matcher.group(1))) : i10;
    }

    public static long v(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC0853a.e(matcher.group(1))) : j10;
    }

    public static String w(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC0853a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    public static String x(String str, Pattern pattern, Map map) {
        return w(str, pattern, null, map);
    }

    public static int y(String str, Map map) {
        String strX = x(str, f14464k0, map);
        if (TextUtils.isEmpty(strX)) {
            return 0;
        }
        String[] strArrH1 = M.h1(strX, ",");
        int i10 = M.r(strArrH1, "public.accessibility.describes-video") ? 512 : 0;
        if (M.r(strArrH1, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= RecognitionOptions.AZTEC;
        }
        if (M.r(strArrH1, "public.accessibility.describes-music-and-sound")) {
            i10 |= RecognitionOptions.UPC_E;
        }
        return M.r(strArrH1, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int z(String str) {
        boolean zS = s(str, f14470n0, false);
        ?? r02 = zS;
        if (s(str, f14472o0, false)) {
            r02 = (zS ? 1 : 0) | 2;
        }
        return s(str, f14468m0, false) ? r02 | 4 : r02;
    }

    @Override // e2.o.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public i a(Uri uri, InputStream inputStream) throws w {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw w.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    M.m(bufferedReader);
                    throw w.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return r(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return q(this.f14495a, this.f14496b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            M.m(bufferedReader);
        }
    }

    public j(h hVar, f fVar) {
        this.f14495a = hVar;
        this.f14496b = fVar;
    }
}
