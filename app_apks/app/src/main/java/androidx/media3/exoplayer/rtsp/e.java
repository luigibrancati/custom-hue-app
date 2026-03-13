package androidx.media3.exoplayer.rtsp;

import G1.M;
import K7.A;
import K7.AbstractC1081v;
import K7.C1082w;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f23757b = new b().e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1082w f23758a;

    public static String c(String str) {
        return J7.c.a(str, "Accept") ? "Accept" : J7.c.a(str, "Allow") ? "Allow" : J7.c.a(str, "Authorization") ? "Authorization" : J7.c.a(str, "Bandwidth") ? "Bandwidth" : J7.c.a(str, "Blocksize") ? "Blocksize" : J7.c.a(str, "Cache-Control") ? "Cache-Control" : J7.c.a(str, "Connection") ? "Connection" : J7.c.a(str, "Content-Base") ? "Content-Base" : J7.c.a(str, HttpHeaders.CONTENT_ENCODING) ? HttpHeaders.CONTENT_ENCODING : J7.c.a(str, HttpHeaders.CONTENT_LANGUAGE) ? HttpHeaders.CONTENT_LANGUAGE : J7.c.a(str, HttpHeaders.CONTENT_LENGTH) ? HttpHeaders.CONTENT_LENGTH : J7.c.a(str, HttpHeaders.CONTENT_LOCATION) ? HttpHeaders.CONTENT_LOCATION : J7.c.a(str, HttpHeaders.CONTENT_TYPE) ? HttpHeaders.CONTENT_TYPE : J7.c.a(str, "CSeq") ? "CSeq" : J7.c.a(str, "Date") ? "Date" : J7.c.a(str, "Expires") ? "Expires" : J7.c.a(str, HttpHeaders.LOCATION) ? HttpHeaders.LOCATION : J7.c.a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : J7.c.a(str, "Proxy-Require") ? "Proxy-Require" : J7.c.a(str, "Public") ? "Public" : J7.c.a(str, "Range") ? "Range" : J7.c.a(str, "RTP-Info") ? "RTP-Info" : J7.c.a(str, "RTCP-Interval") ? "RTCP-Interval" : J7.c.a(str, "Scale") ? "Scale" : J7.c.a(str, "Session") ? "Session" : J7.c.a(str, "Speed") ? "Speed" : J7.c.a(str, "Supported") ? "Supported" : J7.c.a(str, "Timestamp") ? "Timestamp" : J7.c.a(str, "Transport") ? "Transport" : J7.c.a(str, "User-Agent") ? "User-Agent" : J7.c.a(str, "Via") ? "Via" : J7.c.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public C1082w b() {
        return this.f23758a;
    }

    public String d(String str) {
        AbstractC1081v abstractC1081vE = e(str);
        if (abstractC1081vE.isEmpty()) {
            return null;
        }
        return (String) A.d(abstractC1081vE);
    }

    public AbstractC1081v e(String str) {
        return this.f23758a.get(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f23758a.equals(((e) obj).f23758a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23758a.hashCode();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1082w.a f23759a;

        public b() {
            this.f23759a = new C1082w.a();
        }

        public b b(String str, String str2) {
            this.f23759a.f(e.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String[] strArrI1 = M.i1((String) list.get(i10), ":\\s?");
                if (strArrI1.length == 2) {
                    b(strArrI1[0], strArrI1[1]);
                }
            }
            return this;
        }

        public b d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        public e e() {
            return new e(this);
        }

        public b(String str, String str2, int i10) {
            this();
            b("User-Agent", str);
            b("CSeq", String.valueOf(i10));
            if (str2 != null) {
                b("Session", str2);
            }
        }
    }

    public e(b bVar) {
        this.f23758a = bVar.f23759a.e();
    }
}
