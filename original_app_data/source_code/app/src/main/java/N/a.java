package N;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Executor a() {
        return b.a();
    }

    public static Executor b() {
        return d.a();
    }

    public static Executor c() {
        return e.a();
    }

    public static ScheduledExecutorService d() {
        return f.a();
    }

    public static ScheduledExecutorService e(Handler handler) {
        return new c(handler);
    }

    public static Executor f(Executor executor) {
        return new g(executor);
    }
}
