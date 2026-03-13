package Z1;

import C2.p;
import C2.u;
import D1.C0753k;
import D1.w;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import G1.M;
import Z1.a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import e2.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f20172a;

    /* JADX INFO: renamed from: Z1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0259b extends w {
        public C0259b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public UUID f20178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f20179g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static u[] q(byte[] bArr) {
            return new u[]{new u(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // Z1.b.a
        public Object b() {
            UUID uuid = this.f20178f;
            return new a.C0258a(uuid, p.a(uuid, this.f20179g), q(this.f20179g));
        }

        @Override // Z1.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // Z1.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f20177e = false;
            }
        }

        @Override // Z1.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f20177e = true;
                this.f20178f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // Z1.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f20177e) {
                this.f20179g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public D1.o f20180e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrR = M.R(str);
                byte[][] bArrE = AbstractC0861i.E(bArrR);
                if (bArrE == null) {
                    arrayList.add(bArrR);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrE);
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // Z1.b.a
        public Object b() {
            return this.f20180e;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
        @Override // Z1.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void n(org.xmlpull.v1.XmlPullParser r9) throws D1.w {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Z1.b.d.n(org.xmlpull.v1.XmlPullParser):void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f20181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f20184h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f20185i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f20186j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20187k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20188l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a.C0258a f20189m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f20187k = -1;
            this.f20189m = null;
            this.f20181e = new LinkedList();
        }

        @Override // Z1.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f20181e.add((a.b) obj);
            } else if (obj instanceof a.C0258a) {
                AbstractC0853a.g(this.f20189m == null);
                this.f20189m = (a.C0258a) obj;
            }
        }

        @Override // Z1.b.a
        public Object b() {
            int size = this.f20181e.size();
            a.b[] bVarArr = new a.b[size];
            this.f20181e.toArray(bVarArr);
            if (this.f20189m != null) {
                a.C0258a c0258a = this.f20189m;
                C0753k c0753k = new C0753k(new C0753k.b(c0258a.f20153a, "video/mp4", c0258a.f20154b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f20156a;
                    if (i11 == 2 || i11 == 1) {
                        D1.o[] oVarArr = bVar.f20165j;
                        for (int i12 = 0; i12 < oVarArr.length; i12++) {
                            oVarArr[i12] = oVarArr[i12].b().c0(c0753k).P();
                        }
                    }
                }
            }
            return new Z1.a(this.f20182f, this.f20183g, this.f20184h, this.f20185i, this.f20186j, this.f20187k, this.f20188l, this.f20189m, bVarArr);
        }

        @Override // Z1.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f20182f = k(xmlPullParser, "MajorVersion");
            this.f20183g = k(xmlPullParser, "MinorVersion");
            this.f20184h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f20185i = l(xmlPullParser, "Duration");
            this.f20186j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f20187k = i(xmlPullParser, "LookaheadCount", -1);
            this.f20188l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f20184h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f20190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f20191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f20193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f20194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f20195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f20196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20197l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f20198m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20199n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f20200o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f20201p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ArrayList f20202q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f20203r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f20190e = str;
            this.f20191f = new LinkedList();
        }

        @Override // Z1.b.a
        public void a(Object obj) {
            if (obj instanceof D1.o) {
                this.f20191f.add((D1.o) obj);
            }
        }

        @Override // Z1.b.a
        public Object b() {
            D1.o[] oVarArr = new D1.o[this.f20191f.size()];
            this.f20191f.toArray(oVarArr);
            return new a.b(this.f20190e, this.f20196k, this.f20192g, this.f20193h, this.f20194i, this.f20195j, this.f20197l, this.f20198m, this.f20199n, this.f20200o, this.f20201p, oVarArr, this.f20202q, this.f20203r);
        }

        @Override // Z1.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // Z1.b.a
        public void n(XmlPullParser xmlPullParser) throws w {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws w {
            int iS = s(xmlPullParser);
            this.f20192g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.f20192g == 3) {
                this.f20193h = m(xmlPullParser, "Subtype");
            } else {
                this.f20193h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f20193h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f20195j = attributeValue;
            p("Name", attributeValue);
            this.f20196k = m(xmlPullParser, "Url");
            this.f20197l = i(xmlPullParser, "MaxWidth", -1);
            this.f20198m = i(xmlPullParser, "MaxHeight", -1);
            this.f20199n = i(xmlPullParser, "DisplayWidth", -1);
            this.f20200o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f20201p = attributeValue2;
            p("Language", attributeValue2);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f20194i = jI;
            if (jI == -1) {
                this.f20194i = ((Long) c("TimeScale")).longValue();
            }
            this.f20202q = new ArrayList();
        }

        public final void r(XmlPullParser xmlPullParser) throws w {
            int size = this.f20202q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f20203r == -1) {
                        throw w.c("Unable to infer start time", null);
                    }
                    j10 = this.f20203r + ((Long) this.f20202q.get(size - 1)).longValue();
                }
            }
            this.f20202q.add(Long.valueOf(j10));
            this.f20203r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f20203r == -9223372036854775807L) {
                throw w.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f20202q.add(Long.valueOf((this.f20203r * j12) + j10));
                i10++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws w {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0259b("Type");
            }
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw w.c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public b() {
        try {
            this.f20172a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // e2.o.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Z1.a a(Uri uri, InputStream inputStream) throws w {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f20172a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (Z1.a) new e(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            throw w.c(null, e10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f20175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f20176d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f20175c = aVar;
            this.f20173a = str;
            this.f20174b = str2;
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f20176d.size(); i10++) {
                Pair pair = (Pair) this.f20176d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f20175c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f20174b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f20173a);
                            if (aVarE == null) {
                                i10 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i10) throws w {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw w.c(null, e10);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j10) throws w {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw w.c(null, e10);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws w {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0259b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw w.c(null, e10);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws w {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0259b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw w.c(null, e10);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws C0259b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0259b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public final void p(String str, Object obj) {
            this.f20176d.add(Pair.create(str, obj));
        }

        public void a(Object obj) {
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public void o(XmlPullParser xmlPullParser) {
        }
    }
}
