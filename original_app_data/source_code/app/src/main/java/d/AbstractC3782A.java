package d;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: d.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3782A {
    public static /* synthetic */ void a(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
        } else if (obj instanceof ExecutorService) {
            AbstractC3783B.a((ExecutorService) obj);
        } else {
            AbstractC3784C.a(obj);
        }
    }
}
