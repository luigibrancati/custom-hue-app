package F2;

import F2.s;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements s.a {
    @Override // F2.s.a
    public boolean a(D1.o oVar) {
        String str = oVar.f1805o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // F2.s.a
    public s b(D1.o oVar) {
        String str = oVar.f1805o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new H2.a(oVar.f1808r);
                case "application/pgs":
                    return new I2.a();
                case "application/x-mp4-vtt":
                    return new O2.a();
                case "text/vtt":
                    return new O2.g();
                case "application/x-quicktime-tx3g":
                    return new M2.a(oVar.f1808r);
                case "text/x-ssa":
                    return new J2.b(oVar.f1808r);
                case "application/vobsub":
                    return new N2.a(oVar.f1808r);
                case "application/x-subrip":
                    return new K2.a();
                case "application/ttml+xml":
                    return new L2.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // F2.s.a
    public int c(D1.o oVar) {
        String str = oVar.f1805o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
