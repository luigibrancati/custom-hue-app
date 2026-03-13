package S3;

import Rd.I;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    Executor a();

    I b();

    a c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
