package N6;

import java.util.Iterator;

/* JADX INFO: renamed from: N6.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1552y0 {
    public static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
