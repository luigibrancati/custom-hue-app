package O1;

import D1.AbstractC0747e;
import D1.C0753k;
import D1.o;
import D1.q;
import D1.v;
import D1.w;
import G1.AbstractC0853a;
import G1.J;
import G1.M;
import G1.N;
import G1.t;
import J7.r;
import K7.AbstractC1081v;
import K7.D;
import O1.k;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import e2.o;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import t2.C5828a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d extends DefaultHandler implements o.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10779b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f10780c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10781d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10782e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f10783f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f10784a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f10785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1081v f10786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f10787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f10789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f10790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f10791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f10792h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List f10793i;

        public a(D1.o oVar, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j10) {
            this.f10785a = oVar;
            this.f10786b = AbstractC1081v.v(list);
            this.f10787c = kVar;
            this.f10788d = str;
            this.f10789e = arrayList;
            this.f10790f = arrayList2;
            this.f10792h = list2;
            this.f10793i = list3;
            this.f10791g = j10;
        }
    }

    public d() {
        try {
            this.f10784a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static int D(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f10794a) && (str = eVar.f10795b) != null) {
                Matcher matcher = f10780c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                t.h("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f10795b);
            }
        }
        return -1;
    }

    public static int E(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f10794a) && (str = eVar.f10795b) != null) {
                Matcher matcher = f10781d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                t.h("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f10795b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : M.U0(attributeValue);
    }

    public static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strU0 = u0(xmlPullParser, "schemeIdUri", "");
        String strU02 = u0(xmlPullParser, "value", null);
        String strU03 = u0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!N.d(xmlPullParser, str));
        return new e(strU0, strU02, strU03);
    }

    public static int J(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int i10 = Integer.parseInt(attributeValue, 16);
        return (8388608 & i10) != 0 ? L(str) : K(i10);
    }

    public static int K(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = f10782e;
            if (i11 >= iArr.length) {
                break;
            }
            i12 += ((i10 >> i11) & 1) * iArr[i11];
            i11++;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public static int L(String str) {
        String[] strArrJ1 = M.j1(str);
        if (strArrJ1.length == 0) {
            return -1;
        }
        List listF = r.d('.').f(J7.c.e(strArrJ1[0].trim()));
        if (listF.size() != 4 || !((String) listF.get(0)).equals("ac-4")) {
            return -1;
        }
        String str2 = (String) listF.get(3);
        str2.getClass();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    public static int M(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strE = J7.c.e(attributeValue);
        strE.getClass();
        switch (strE) {
        }
        return -1;
    }

    public static int N(XmlPullParser xmlPullParser) {
        int iX = X(xmlPullParser, "value", -1);
        if (iX <= 0 || iX >= 33) {
            return -1;
        }
        return iX;
    }

    public static int O(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long P(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : M.V0(attributeValue);
    }

    public static String Q(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            String str = eVar.f10794a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f10795b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f10795b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float U(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    public static float V(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, RRWebVideoEvent.JsonKeys.FRAME_RATE);
        if (attributeValue != null) {
            Matcher matcher = f10779b.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i10 / Integer.parseInt(r2) : i10;
            }
        }
        return f10;
    }

    public static int X(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long Z(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (J7.c.a("http://dashif.org/guidelines/last-segment-number", eVar.f10794a)) {
                return Long.parseLong(eVar.f10795b);
            }
        }
        return -1L;
    }

    public static long a0(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    public static int c0(XmlPullParser xmlPullParser) {
        int iX = X(xmlPullParser, "value", -1);
        if (iX >= 0) {
            int[] iArr = f10783f;
            if (iX < iArr.length) {
                return iArr[iX];
            }
        }
        return -1;
    }

    public static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        AbstractC0853a.g(i10 == i11);
        return i10;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC0853a.g(str.equals(str2));
        return str;
    }

    public static void r(ArrayList arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            C0753k.b bVar = (C0753k.b) arrayList.get(i10);
            if (AbstractC0747e.f1686c.equals(bVar.f1729b) && (str = bVar.f1730c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C0753k.b bVar2 = (C0753k.b) arrayList.get(i11);
            if (AbstractC0747e.f1685b.equals(bVar2.f1729b) && bVar2.f1730c == null) {
                arrayList.set(i11, new C0753k.b(AbstractC0747e.f1686c, str, bVar2.f1731d, bVar2.f1732e));
            }
        }
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0753k.b bVar = (C0753k.b) arrayList.get(size);
            if (!bVar.c()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((C0753k.b) arrayList.get(i10)).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    public static long t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public static String u(String str, String str2) {
        if (v.o(str)) {
            return v.c(str2);
        }
        if (v.t(str)) {
            return v.n(str2);
        }
        if (v.s(str) || v.q(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = v.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    public static String u0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String v0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, str));
        return text;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (N.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (N.e(xmlPullParser)) {
                    i10++;
                } else if (N.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    public int A(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iN;
        String strU0 = u0(xmlPullParser, "schemeIdUri", null);
        strU0.getClass();
        iN = -1;
        switch (strU0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iN = N(xmlPullParser);
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                iN = J(xmlPullParser, str);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iN = X(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iN = M(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iN = c0(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iN = O(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!N.d(xmlPullParser, "AudioChannelConfiguration"));
        return iN;
    }

    public long B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List C(XmlPullParser xmlPullParser, List list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strV0 = v0(xmlPullParser, "BaseURL");
        if (J.c(strV0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strV0;
            }
            return D.j(new b(strV0, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            String strF = J.f(bVar.f10762a, strV0);
            String str = attributeValue3 == null ? strF : attributeValue3;
            if (z10) {
                i10 = bVar.f10764c;
                i11 = bVar.f10765d;
                str = bVar.f10763b;
            }
            arrayList.add(new b(strF, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair F(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair R(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "id", 0L);
        long jA02 = a0(xmlPullParser, "duration", -9223372036854775807L);
        long jA03 = a0(xmlPullParser, "presentationTime", 0L);
        long jA1 = M.a1(jA02, 1000L, j10);
        long jA12 = M.a1(jA03 - j11, 1000000L, j10);
        String strU0 = u0(xmlPullParser, "messageData", null);
        byte[] bArrS = S(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jA12);
        if (strU0 != null) {
            bArrS = M.u0(strU0);
        }
        return Pair.create(lValueOf, d(str, str2, jA0, jA1, bArrS));
    }

    public byte[] S(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!N.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public f T(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        d dVar;
        long j10;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String strU0 = u0(xmlPullParser, "schemeIdUri", "");
        String strU02 = u0(xmlPullParser, "value", "");
        long jA0 = a0(xmlPullParser, "timescale", 1L);
        long jA02 = a0(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Event")) {
                dVar = this;
                j10 = jA0;
                str = strU02;
                str2 = strU0;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(dVar.R(xmlPullParser2, str2, str, j10, jA02, byteArrayOutputStream));
            } else {
                dVar = this;
                j10 = jA0;
                str = strU02;
                str2 = strU0;
                xmlPullParser2 = xmlPullParser;
                w(xmlPullParser2);
            }
            if (N.d(xmlPullParser2, "EventStream")) {
                break;
            }
            this = dVar;
            xmlPullParser = xmlPullParser2;
            strU0 = str2;
            strU02 = str;
            jA0 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        C5828a[] c5828aArr = new C5828a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            c5828aArr[i10] = (C5828a) pair.second;
        }
        return dVar.e(str2, str, j10, jArr, c5828aArr);
    }

    public i W(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "sourceURL", "range");
    }

    public q Y(XmlPullParser xmlPullParser) {
        return new q(xmlPullParser.getAttributeValue(null, "lang"), v0(xmlPullParser, "Label"));
    }

    public final long b(List list, long j10, long j11, int i10, long j12) {
        int iL = i10 >= 0 ? i10 + 1 : (int) M.l(j12 - j10, j11);
        for (int i11 = 0; i11 < iL; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0 A[LOOP:0: B:24:0x00a5->B:81:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O1.c b0(org.xmlpull.v1.XmlPullParser r41, android.net.Uri r42) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.d.b0(org.xmlpull.v1.XmlPullParser, android.net.Uri):O1.c");
    }

    public O1.a c(long j10, int i10, List list, List list2, List list3, List list4) {
        return new O1.a(j10, i10, list, list2, list3, list4);
    }

    public C5828a d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new C5828a(str, str2, j11, j10, bArr);
    }

    public Pair d0(XmlPullParser xmlPullParser, List list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        long jB;
        k kVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j14;
        Object obj;
        long j15;
        XmlPullParser xmlPullParser2;
        long j16;
        long j17;
        k kVarO0;
        long j18;
        e eVar;
        long j19;
        k kVar2;
        ArrayList arrayList3;
        boolean z11;
        long j20;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List list2;
        ArrayList arrayList7;
        d dVar = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long jP = P(xmlPullParser3, "start", j10);
        long j21 = j12 != -9223372036854775807L ? j12 + jP : -9223372036854775807L;
        long jP2 = P(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList8 = new ArrayList();
        long j22 = -9223372036854775807L;
        ArrayList arrayList9 = new ArrayList();
        boolean z12 = false;
        e eVarI = null;
        long jB2 = j11;
        ArrayList arrayList10 = arrayList8;
        k kVar3 = null;
        long j23 = -9223372036854775807L;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (N.f(xmlPullParser3, "BaseURL")) {
                if (!z12) {
                    jB2 = dVar.B(xmlPullParser3, jB2);
                    z12 = true;
                }
                arrayList11.addAll(dVar.C(xmlPullParser3, list, z10));
                arrayList2 = arrayList10;
                j18 = jB2;
                arrayList = arrayList9;
                z11 = z12;
                j14 = j22;
                obj = null;
                j15 = jP2;
                arrayList7 = arrayList11;
                eVar = eVarI;
                xmlPullParser2 = xmlPullParser3;
                kVar2 = kVar3;
                j20 = j23;
                j17 = j21;
            } else {
                ArrayList arrayList12 = arrayList10;
                if (N.f(xmlPullParser3, "AdaptationSet")) {
                    if (arrayList11.isEmpty()) {
                        arrayList6 = arrayList11;
                        list2 = list;
                    } else {
                        ArrayList arrayList13 = arrayList11;
                        arrayList6 = arrayList13;
                        list2 = arrayList13;
                    }
                    ArrayList arrayList14 = arrayList9;
                    long j24 = jB2;
                    long j25 = j21;
                    long j26 = jP2;
                    O1.a aVarY = dVar.y(xmlPullParser3, list2, kVar3, j26, j24, j23, j25, j13, z10);
                    j21 = j25;
                    jB = j23;
                    arrayList12.add(aVarY);
                    kVar = kVar3;
                    j15 = j26;
                    arrayList = arrayList14;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j16 = j24;
                    arrayList2 = arrayList12;
                    j14 = -9223372036854775807L;
                    arrayList5 = arrayList6;
                } else {
                    ArrayList arrayList15 = arrayList11;
                    ArrayList arrayList16 = arrayList9;
                    long j27 = jB2;
                    jB = j23;
                    if (N.f(xmlPullParser3, "EventStream")) {
                        arrayList16.add(T(xmlPullParser));
                        kVar = kVar3;
                        j15 = jP2;
                        arrayList = arrayList16;
                        arrayList2 = arrayList12;
                        j14 = -9223372036854775807L;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j16 = j27;
                        arrayList5 = arrayList15;
                    } else {
                        if (N.f(xmlPullParser3, "SegmentBase")) {
                            kVarO0 = dVar.m0(xmlPullParser3, null);
                            j18 = j27;
                            obj = null;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j14 = -9223372036854775807L;
                            j17 = j21;
                            j15 = jP2;
                            eVar = eVarI;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (N.f(xmlPullParser3, "SegmentList")) {
                            long j28 = j21;
                            long j29 = jP2;
                            long jB3 = dVar.B(xmlPullParser3, -9223372036854775807L);
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j14 = -9223372036854775807L;
                            k.b bVarN0 = dVar.n0(xmlPullParser3, null, j28, j29, j27, jB3, j13);
                            j18 = j27;
                            obj = null;
                            j17 = j28;
                            j15 = j29;
                            eVar = eVarI;
                            xmlPullParser2 = xmlPullParser3;
                            j19 = jB3;
                            kVar2 = bVarN0;
                            arrayList3 = arrayList15;
                            z11 = z12;
                            j20 = j19;
                            arrayList7 = arrayList3;
                        } else {
                            kVar = kVar3;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j14 = -9223372036854775807L;
                            if (N.f(xmlPullParser3, "SegmentTemplate")) {
                                jB = dVar.B(xmlPullParser3, -9223372036854775807L);
                                obj = null;
                                kVarO0 = dVar.o0(xmlPullParser3, null, AbstractC1081v.z(), j21, jP2, j27, jB, j13);
                                j15 = jP2;
                                xmlPullParser2 = xmlPullParser3;
                                j17 = j21;
                                j18 = j27;
                                eVar = eVarI;
                            } else {
                                obj = null;
                                j15 = jP2;
                                xmlPullParser2 = xmlPullParser3;
                                j16 = j27;
                                j17 = j21;
                                if (N.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVarI = I(xmlPullParser2, "AssetIdentifier");
                                    arrayList4 = arrayList15;
                                } else {
                                    w(xmlPullParser2);
                                    arrayList4 = arrayList15;
                                }
                                j18 = j16;
                                eVar = eVarI;
                                j19 = jB;
                                kVar2 = kVar;
                                arrayList3 = arrayList4;
                                z11 = z12;
                                j20 = j19;
                                arrayList7 = arrayList3;
                            }
                        }
                        j19 = jB;
                        kVar2 = kVarO0;
                        arrayList3 = arrayList15;
                        z11 = z12;
                        j20 = j19;
                        arrayList7 = arrayList3;
                    }
                }
                j17 = j21;
                arrayList4 = arrayList5;
                j18 = j16;
                eVar = eVarI;
                j19 = jB;
                kVar2 = kVar;
                arrayList3 = arrayList4;
                z11 = z12;
                j20 = j19;
                arrayList7 = arrayList3;
            }
            if (N.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, jP, arrayList2, arrayList, eVar), Long.valueOf(j15));
            }
            dVar = this;
            xmlPullParser3 = xmlPullParser2;
            j21 = j17;
            kVar3 = kVar2;
            j23 = j20;
            arrayList11 = arrayList7;
            arrayList10 = arrayList2;
            eVarI = eVar;
            z12 = z11;
            jP2 = j15;
            j22 = j14;
            jB2 = j18;
            arrayList9 = arrayList;
        }
    }

    public f e(String str, String str2, long j10, long[] jArr, C5828a[] c5828aArr) {
        return new f(str, str2, j10, jArr, c5828aArr);
    }

    public String[] e0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public D1.o f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List list, List list2, String str4, String str5, String str6, List list3, List list4) {
        String str7 = str5;
        String str8 = str4;
        String strU = u(str2, str8);
        if ("audio/eac3".equals(strU)) {
            strU = Q(list4);
            if ("audio/eac3-joc".equals(strU)) {
                str8 = "ec+3";
            }
        }
        if (v.p(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            strU = "video/dolby-vision";
            str8 = str7;
        }
        int iS0 = s0(list);
        int iL0 = l0(list) | i0(list2) | k0(list3) | k0(list4);
        Pair pairW0 = w0(list3);
        o.b bVarN0 = new o.b().j0(str).W(str2).y0(strU).U(str8).t0(i14).A0(iS0).w0(iL0).n0(str3);
        int iE = -1;
        o.b bVarE0 = bVarN0.D0(pairW0 != null ? ((Integer) pairW0.first).intValue() : -1).E0(pairW0 != null ? ((Integer) pairW0.second).intValue() : -1);
        if (v.t(strU)) {
            bVarE0.F0(i10).h0(i11).f0(f10);
        } else if (v.o(strU)) {
            bVarE0.T(i12).z0(i13);
        } else if (v.s(strU)) {
            if ("application/cea-608".equals(strU)) {
                iE = D(list2);
            } else if ("application/cea-708".equals(strU)) {
                iE = E(list2);
            }
            bVarE0.Q(iE);
        } else if (v.q(strU)) {
            bVarE0.F0(i10).h0(i11);
        }
        return bVarE0.P();
    }

    public h f0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strU0 = u0(xmlPullParser, "moreInformationURL", null);
        String strU02 = u0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (N.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (N.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (N.d(xmlPullParser, "ProgramInformation")) {
                return new h(str2, str, str3, strU0, strU02);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    public c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    public i g0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j11 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
        } else {
            j10 = 0;
        }
        return i(attributeValue, j10, j11);
    }

    public g h(String str, long j10, List list, List list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x025f A[LOOP:0: B:3:0x007a->B:56:0x025f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0204 A[EDGE_INSN: B:57:0x0204->B:46:0x0204 BREAK  A[LOOP:0: B:3:0x007a->B:56:0x025f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O1.d.a h0(org.xmlpull.v1.XmlPullParser r35, java.util.List r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, int r42, float r43, int r44, int r45, java.lang.String r46, java.util.List r47, java.util.List r48, java.util.List r49, java.util.List r50, O1.k r51, long r52, long r54, long r56, long r58, long r60, boolean r62) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.d.h0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, O1.k, long, long, long, long, long, boolean):O1.d$a");
    }

    public i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    public int i0(List list) {
        int iX0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = (e) list.get(i11);
            if (J7.c.a("urn:mpeg:dash:role:2011", eVar.f10794a)) {
                iX0 = j0(eVar.f10795b);
            } else if (J7.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f10794a)) {
                iX0 = x0(eVar.f10795b);
            }
            i10 |= iX0;
        }
        return i10;
    }

    public j j(a aVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        o.b bVarB = aVar.f10785a.b();
        if (str == null || !list.isEmpty()) {
            bVarB.m0(list);
        } else {
            bVarB.l0(str);
        }
        String str3 = aVar.f10788d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = aVar.f10789e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            bVarB.c0(new C0753k(str2, arrayList3));
        }
        ArrayList arrayList4 = aVar.f10790f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f10791g, bVarB.P(), aVar.f10786b, aVar.f10787c, arrayList4, aVar.f10792h, aVar.f10793i, null);
    }

    public int j0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public k.b k(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, M.M0(j15), M.M0(j16));
    }

    public int k0(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (J7.c.a("http://dashif.org/guidelines/trickmode", ((e) list.get(i11)).f10794a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, M.M0(j16), M.M0(j17));
    }

    public int l0(List list) {
        int iJ0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (J7.c.a("urn:mpeg:dash:role:2011", eVar.f10794a)) {
                iJ0 |= j0(eVar.f10795b);
            }
        }
        return iJ0;
    }

    public k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    public k.e m0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "timescale", eVar != null ? eVar.f10831b : 1L);
        long jA02 = a0(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f10832c : 0L);
        long j10 = eVar != null ? eVar.f10845d : 0L;
        long j11 = eVar != null ? eVar.f10846e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
        }
        long j12 = j11;
        i iVarW = eVar != null ? eVar.f10830a : null;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
            i iVar = iVarW;
            if (N.d(xmlPullParser, "SegmentBase")) {
                return n(iVar, jA0, jA02, j10, j12);
            }
            iVarW = iVar;
        }
    }

    public k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    public k.b n0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long jA0 = a0(xmlPullParser, "timescale", bVar != null ? bVar.f10831b : 1L);
        long jA02 = a0(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f10832c : 0L);
        long jA03 = a0(xmlPullParser, "duration", bVar != null ? bVar.f10834e : -9223372036854775807L);
        long jA04 = a0(xmlPullParser, "startNumber", bVar != null ? bVar.f10833d : 1L);
        long jT = t(j12, j13);
        List arrayList = null;
        i iVarW = null;
        List listP0 = null;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
                j15 = jA0;
            } else if (N.f(xmlPullParser, "SegmentTimeline")) {
                j15 = jA0;
                listP0 = p0(xmlPullParser, j15, j11);
            } else {
                j15 = jA0;
                if (N.f(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(q0(xmlPullParser));
                } else {
                    w(xmlPullParser);
                }
            }
            if (N.d(xmlPullParser, "SegmentList")) {
                break;
            }
            jA0 = j15;
        }
        if (bVar != null) {
            if (iVarW == null) {
                iVarW = bVar.f10830a;
            }
            if (listP0 == null) {
                listP0 = bVar.f10835f;
            }
            if (arrayList == null) {
                arrayList = bVar.f10839j;
            }
        }
        return k(iVarW, j15, jA02, jA04, jA03, listP0, jT, arrayList, j14, j10);
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public k.c o0(XmlPullParser xmlPullParser, k.c cVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        d dVar = this;
        long jA0 = a0(xmlPullParser, "timescale", cVar != null ? cVar.f10831b : 1L);
        long jA02 = a0(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f10832c : 0L);
        long jA03 = a0(xmlPullParser, "duration", cVar != null ? cVar.f10834e : -9223372036854775807L);
        long jA04 = a0(xmlPullParser, "startNumber", cVar != null ? cVar.f10833d : 1L);
        long jZ = Z(list);
        long jT = t(j12, j13);
        n nVarY0 = dVar.y0(xmlPullParser, "media", cVar != null ? cVar.f10841k : null);
        n nVarY02 = dVar.y0(xmlPullParser, "initialization", cVar != null ? cVar.f10840j : null);
        i iVarW = null;
        List listP0 = null;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
                j15 = jA0;
            } else if (N.f(xmlPullParser, "SegmentTimeline")) {
                j15 = jA0;
                listP0 = dVar.p0(xmlPullParser, j15, j11);
            } else {
                j15 = jA0;
                w(xmlPullParser);
            }
            if (N.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dVar = this;
            jT = jT;
            jZ = jZ;
            jA04 = jA04;
            jA02 = jA02;
            jA0 = j15;
        }
        if (cVar != null) {
            if (iVarW == null) {
                iVarW = cVar.f10830a;
            }
            if (listP0 == null) {
                listP0 = cVar.f10835f;
            }
        }
        return l(iVarW, j15, jA02, jA04, jZ, jA03, listP0, jT, nVarY02, nVarY0, j14, j10);
    }

    public List p0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jA0 = -9223372036854775807L;
        boolean z10 = false;
        int iX = 0;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "S")) {
                long jA02 = a0(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    ArrayList arrayList2 = arrayList;
                    jB = b(arrayList2, jB, jA0, iX, jA02);
                    arrayList = arrayList2;
                }
                if (jA02 != -9223372036854775807L) {
                    jB = jA02;
                }
                jA0 = a0(xmlPullParser, "d", -9223372036854775807L);
                iX = X(xmlPullParser, "r", 0);
                z10 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, jB, jA0, iX, M.a1(j11, j10, 1000L));
        }
        return arrayList;
    }

    public i q0(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "media", "mediaRange");
    }

    public int r0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int s0(List list) {
        int iR0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (J7.c.a("urn:mpeg:dash:role:2011", eVar.f10794a)) {
                iR0 |= r0(eVar.f10795b);
            }
        }
        return iR0;
    }

    public l t0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jA0 = -9223372036854775807L;
        long jA02 = -9223372036854775807L;
        long jA03 = -9223372036854775807L;
        float fU = -3.4028235E38f;
        float fU2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Latency")) {
                jA0 = a0(xmlPullParser, "target", -9223372036854775807L);
                jA02 = a0(xmlPullParser, "min", -9223372036854775807L);
                jA03 = a0(xmlPullParser, "max", -9223372036854775807L);
            } else if (N.f(xmlPullParser, "PlaybackRate")) {
                fU = U(xmlPullParser, "min", -3.4028235E38f);
                fU2 = U(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = jA0;
            long j11 = jA02;
            long j12 = jA03;
            float f10 = fU;
            float f11 = fU2;
            if (N.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f10, f11);
            }
            jA0 = j10;
            jA02 = j11;
            jA03 = j12;
            fU = f10;
            fU2 = f11;
        }
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public Pair w0(List list) {
        String str;
        char c10 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if ((J7.c.a("http://dashif.org/thumbnail_tile", eVar.f10794a) || J7.c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f10794a)) && (str = eVar.f10795b) != null) {
                String[] strArrH1 = M.h1(str, "x");
                if (strArrH1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrH1[c10])), Integer.valueOf(Integer.parseInt(strArrH1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // e2.o.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws w {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f10784a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return b0(xmlPullParserNewPullParser, uri);
            }
            throw w.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw w.c(null, e10);
        }
    }

    public int x0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x03cb A[LOOP:0: B:3:0x00a2->B:75:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037b A[EDGE_INSN: B:76:0x037b->B:69:0x037b BREAK  A[LOOP:0: B:3:0x00a2->B:75:0x03cb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O1.a y(org.xmlpull.v1.XmlPullParser r46, java.util.List r47, O1.k r48, long r49, long r51, long r53, long r55, long r57, boolean r59) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, O1.k, long, long, long, long, long, boolean):O1.a");
    }

    public n y0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }

    public o z0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }
}
