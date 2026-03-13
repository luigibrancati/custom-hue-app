package q2;

import D1.w;
import G1.N;
import G1.t;
import K7.AbstractC1081v;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q2.C5481c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f43103a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f43104b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f43105c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C5481c a(String str) {
        try {
            return b(str);
        } catch (w | NumberFormatException | XmlPullParserException unused) {
            t.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static C5481c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!N.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw w.a("Couldn't find xmp metadata", null);
        }
        AbstractC1081v abstractC1081vZ = AbstractC1081v.z();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (N.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                abstractC1081vZ = c(xmlPullParserNewPullParser);
            } else if (N.f(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC1081vZ = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (N.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC1081vZ = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!N.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC1081vZ.isEmpty()) {
            return null;
        }
        return new C5481c(jE, abstractC1081vZ);
    }

    public static AbstractC1081v c(XmlPullParser xmlPullParser) {
        for (String str : f43105c) {
            String strA = N.a(xmlPullParser, str);
            if (strA != null) {
                return AbstractC1081v.B(new C5481c.a("image/jpeg", "Primary", 0L, 0L), new C5481c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return AbstractC1081v.z();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f43103a) {
            String strA = N.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f43104b) {
            String strA = N.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    public static AbstractC1081v f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, str3)) {
                String strA = N.a(xmlPullParser, str2 + ":Mime");
                String strA2 = N.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = N.a(xmlPullParser, str2 + ":Length");
                String strA4 = N.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return AbstractC1081v.z();
                }
                aVarR.a(new C5481c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!N.d(xmlPullParser, str4));
        return aVarR.k();
    }
}
