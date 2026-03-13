package X1;

import G1.AbstractC0853a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public k a(W1.g gVar) {
        String str = (String) AbstractC0853a.e(gVar.f17734c.f1805o);
        str.getClass();
        switch (str) {
            case "video/3gpp":
                return new e(gVar);
            case "video/hevc":
                return new g(gVar);
            case "audio/amr-wb":
            case "audio/3gpp":
                return new d(gVar);
            case "audio/mp4a-latm":
                return gVar.f17736e.equals("MP4A-LATM") ? new h(gVar) : new b(gVar);
            case "audio/ac3":
                return new c(gVar);
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return new l(gVar);
            case "video/mp4v-es":
                return new i(gVar);
            case "video/avc":
                return new f(gVar);
            case "audio/opus":
                return new j(gVar);
            case "video/x-vnd.on2.vp8":
                return new n(gVar);
            case "video/x-vnd.on2.vp9":
                return new o(gVar);
            default:
                return null;
        }
    }
}
