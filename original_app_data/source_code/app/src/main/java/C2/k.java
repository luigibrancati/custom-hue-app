package C2;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static String a(D1.o oVar) {
        String str = oVar.f1805o;
        return D1.v.t(str) ? "video/mp4" : D1.v.o(str) ? "audio/mp4" : D1.v.q(str) ? Objects.equals(str, "image/heic") ? "image/heif" : Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4" : "application/mp4";
    }

    public static String b(List list) {
        Iterator it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((w) it.next()).f1090a.f1061g.f1805o;
            if (D1.v.t(str2)) {
                return "video/mp4";
            }
            if (D1.v.o(str2)) {
                z10 = true;
            } else if (D1.v.q(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
