package L;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: L.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1119q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8163a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f8164b = new HashMap();

    public static D a(Object obj) {
        D d10;
        synchronized (f8163a) {
            d10 = (D) f8164b.get(obj);
        }
        return d10 == null ? D.f7888a : d10;
    }
}
