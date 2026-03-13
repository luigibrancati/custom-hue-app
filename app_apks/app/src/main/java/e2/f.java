package e2;

import G1.J;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J7.g f33583a = J7.g.g(",");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public abstract f a();

        public abstract a b(long j10);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static Uri b(Uri uri) {
        return uri.getQueryParameter("CMCD") != null ? J.e(uri, "CMCD") : uri;
    }

    public abstract I1.j a(I1.j jVar);
}
