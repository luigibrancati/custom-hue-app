package W1;

import G1.AbstractC0853a;
import K7.AbstractC1083x;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D1.o f17734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1083x f17735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17736e;

    public g(D1.o oVar, int i10, int i11, Map map, String str) {
        this.f17732a = i10;
        this.f17733b = i11;
        this.f17734c = oVar;
        this.f17735d = AbstractC1083x.c(map);
        this.f17736e = str;
    }

    public static String a(String str) {
        String strF = J7.c.f(str);
        strF.getClass();
        switch (strF) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                return "audio/mp4a-latm";
            case "L8":
            case "L16":
                return "audio/raw";
            case "AC3":
                return "audio/ac3";
            case "AMR":
                return "audio/3gpp";
            case "VP8":
                return "video/x-vnd.on2.vp8";
            case "VP9":
                return "video/x-vnd.on2.vp9";
            case "H264":
                return "video/avc";
            case "H265":
                return "video/hevc";
            case "OPUS":
                return "audio/opus";
            case "PCMA":
                return "audio/g711-alaw";
            case "PCMU":
                return "audio/g711-mlaw";
            case "AMR-WB":
                return "audio/amr-wb";
            case "MP4V-ES":
                return "video/mp4v-es";
            case "H263-1998":
            case "H263-2000":
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        AbstractC0853a.a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    public static boolean c(a aVar) {
        String strF = J7.c.f(aVar.f17676j.f17687b);
        strF.getClass();
        switch (strF) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "MP4A-LATM":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f17732a == gVar.f17732a && this.f17733b == gVar.f17733b && this.f17734c.equals(gVar.f17734c) && this.f17735d.equals(gVar.f17735d) && this.f17736e.equals(gVar.f17736e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((217 + this.f17732a) * 31) + this.f17733b) * 31) + this.f17734c.hashCode()) * 31) + this.f17735d.hashCode()) * 31) + this.f17736e.hashCode();
    }
}
