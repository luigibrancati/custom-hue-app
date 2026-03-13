package I1;

import D1.InterfaceC0749g;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface f extends InterfaceC0749g {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        f a();
    }

    void close();

    long f(j jVar);

    default Map g() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    void h(x xVar);
}
