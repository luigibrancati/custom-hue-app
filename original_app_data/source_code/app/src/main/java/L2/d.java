package L2;

import F2.i;
import F2.k;
import F2.m;
import F2.s;
import G1.AbstractC0853a;
import G1.AbstractC0862j;
import G1.InterfaceC0864l;
import G1.M;
import G1.N;
import G1.t;
import android.text.Layout;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Geo;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8497b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8498c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8499d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f8500e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f8501f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f8502g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f8503h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f8504i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f8505a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f8506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8508c;

        public a(float f10, int i10, int i11) {
            this.f8506a = f10;
            this.f8507b = i10;
            this.f8508c = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8510b;

        public b(int i10, int i11) {
            this.f8509a = i10;
            this.f8510b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f8505a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(SentryLogEvent.JsonKeys.BODY) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(Geo.JsonKeys.REGION) || str.equals(ExternalParsersConfigReaderMetKeys.METADATA_TAG) || str.equals("image") || str.equals("data") || str.equals(Constants.INFORMATION);
    }

    public static Layout.Alignment f(String str) {
        String strE = J7.c.e(str);
        strE.getClass();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int g(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f8503h.matcher(attributeValue);
        if (!matcher.matches()) {
            t.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) AbstractC0853a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) AbstractC0853a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            AbstractC0853a.b(z10, "Invalid cell resolution " + i11 + StringUtils.SPACE + i12);
            return i12;
        } catch (NumberFormatException unused) {
            t.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    public static void h(String str, g gVar) throws m {
        Matcher matcher;
        String str2;
        String[] strArrH1 = M.h1(str, "\\s+");
        if (strArrH1.length == 1) {
            matcher = f8499d.matcher(str);
        } else {
            if (strArrH1.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + strArrH1.length + ".");
            }
            matcher = f8499d.matcher(strArrH1[1]);
            t.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) AbstractC0853a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) AbstractC0853a.e(matcher.group(1))));
    }

    public static a i(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", RRWebVideoEvent.JsonKeys.FRAME_RATE);
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            AbstractC0853a.b(M.h1(attributeValue2, StringUtils.SPACE).length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f8504i;
        int i11 = aVar.f8507b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f8508c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    public static Map j(XmlPullParser xmlPullParser, Map map, int i10, b bVar, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "style")) {
                String strA = N.a(xmlPullParser, "style");
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a((g) map.get(str));
                    }
                }
                String strH = gVarO.h();
                if (strH != null) {
                    map.put(strH, gVarO);
                }
            } else if (N.f(xmlPullParser, Geo.JsonKeys.REGION)) {
                e eVarM = m(xmlPullParser, i10, bVar, map);
                if (eVarM != null) {
                    map2.put(eVarM.f8511a, eVarM);
                }
            } else if (N.f(xmlPullParser, ExternalParsersConfigReaderMetKeys.METADATA_TAG)) {
                k(xmlPullParser, map3);
            }
        } while (!N.d(xmlPullParser, "head"));
        return map;
    }

    public static void k(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "image") && (strA = N.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!N.d(xmlPullParser, ExternalParsersConfigReaderMetKeys.METADATA_TAG));
    }

    public static c l(XmlPullParser xmlPullParser, c cVar, Map map, a aVar) throws m {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarO = o(xmlPullParser2, null);
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i10++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i11;
                    break;
                case "dur":
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (cVar != null) {
            long j10 = cVar.f8487d;
            if (j10 != -9223372036854775807L) {
                if (jQ != -9223372036854775807L) {
                    jQ += j10;
                }
                if (jQ2 != -9223372036854775807L) {
                    jQ2 += j10;
                }
            }
        }
        long j11 = jQ;
        if (jQ2 == -9223372036854775807L) {
            if (jQ3 != -9223372036854775807L) {
                jQ2 = j11 + jQ3;
            } else if (cVar != null) {
                long j12 = cVar.f8488e;
                if (j12 != -9223372036854775807L) {
                    jQ2 = j12;
                }
            }
        }
        return c.c(xmlPullParser.getName(), j11, jQ2, gVarO, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static L2.e m(org.xmlpull.v1.XmlPullParser r17, int r18, L2.d.b r19, java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.d.m(org.xmlpull.v1.XmlPullParser, int, L2.d$b, java.util.Map):L2.e");
    }

    public static float n(String str) {
        Matcher matcher = f8500e.matcher(str);
        if (!matcher.matches()) {
            t.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC0853a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            t.i("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    public static g o(XmlPullParser xmlPullParser, g gVar) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    gVar = d(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    gVar = d(gVar).y(attributeValue);
                    break;
                case "fontFamily":
                    gVar = d(gVar).A(attributeValue);
                    break;
                case "textAlign":
                    gVar = d(gVar).L(f(attributeValue));
                    break;
                case "origin":
                    gVar = d(gVar).H(attributeValue);
                    break;
                case "textDecoration":
                    String strE = J7.c.e(attributeValue);
                    strE.getClass();
                    switch (strE) {
                        case "nounderline":
                            gVar = d(gVar).O(false);
                            break;
                        case "underline":
                            gVar = d(gVar).O(true);
                            break;
                        case "nolinethrough":
                            gVar = d(gVar).F(false);
                            break;
                        case "linethrough":
                            gVar = d(gVar).F(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = d(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = d(gVar).D(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strE2 = J7.c.e(attributeValue);
                    strE2.getClass();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = d(gVar).J(2);
                            break;
                        case "container":
                            gVar = d(gVar).J(1);
                            break;
                        case "delimiter":
                            gVar = d(gVar).J(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = d(gVar).J(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = d(gVar);
                    try {
                        gVar.z(AbstractC0862j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        t.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = d(gVar).K(n(attributeValue));
                    break;
                case "textCombine":
                    String strE3 = J7.c.e(attributeValue);
                    strE3.getClass();
                    if (!strE3.equals("all")) {
                        if (strE3.equals(MeasurementUnit.NONE)) {
                            gVar = d(gVar).M(false);
                        }
                        break;
                    } else {
                        gVar = d(gVar).M(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                        break;
                    } catch (m unused2) {
                        t.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = d(gVar).N(L2.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strE4 = J7.c.e(attributeValue);
                    strE4.getClass();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = d(gVar).I(2);
                        }
                        break;
                    } else {
                        gVar = d(gVar).I(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = d(gVar);
                    try {
                        gVar.w(AbstractC0862j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        t.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = d(gVar).G(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    public static String[] p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : M.h1(strTrim, "\\s+");
    }

    public static long q(String str, a aVar) throws m {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f8497b.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) AbstractC0853a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) AbstractC0853a.e(matcher.group(2))) * 60) + Long.parseLong((String) AbstractC0853a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.f8506a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) aVar.f8507b)) / ((double) aVar.f8506a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f8498c.matcher(str);
        if (!matcher2.matches()) {
            throw new m("Malformed time expression: " + str);
        }
        d10 = Double.parseDouble((String) AbstractC0853a.e(matcher2.group(1)));
        String str2 = (String) AbstractC0853a.e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d11 = aVar.f8506a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = aVar.f8508c;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "ms":
                d11 = 1000.0d;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            default:
                return (long) (d10 * 1000000.0d);
        }
        d10 *= d12;
        return (long) (d10 * 1000000.0d);
    }

    public static b r(XmlPullParser xmlPullParser) {
        String strA = N.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f8502g.matcher(strA);
        if (!matcher.matches()) {
            t.h("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) AbstractC0853a.e(matcher.group(1))), Integer.parseInt((String) AbstractC0853a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            t.h("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // F2.s
    public k a(byte[] bArr, int i10, int i11) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f8505a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iG = 15;
            a aVarI = f8504i;
            b bVarR = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        }
                        a aVar = aVarI;
                        b bVar = bVarR;
                        int i13 = iG;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                j(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                try {
                                    c cVarL = l(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarL);
                                    if (cVar != null) {
                                        cVar.a(cVarL);
                                    }
                                } catch (m e10) {
                                    t.i("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iG = i13;
                            bVarR = bVar;
                            aVarI = aVar;
                        } else {
                            t.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iG = i13;
                        bVarR = bVar;
                        aVarI = aVar;
                    } else if (eventType == 4) {
                        ((c) AbstractC0853a.e(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((c) AbstractC0853a.e((c) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) AbstractC0853a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // F2.s
    public int b() {
        return 1;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        i.c(a(bArr, i10, i11), bVar, interfaceC0864l);
    }
}
