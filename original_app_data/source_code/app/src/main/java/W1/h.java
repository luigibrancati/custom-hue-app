package W1;

import G1.M;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static I1.j a(int i10) {
        return new I1.j(Uri.parse(M.G("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i10))));
    }
}
