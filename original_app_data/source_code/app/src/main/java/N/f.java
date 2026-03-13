package N;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ScheduledExecutorService f9502a;

    public static ScheduledExecutorService a() {
        if (f9502a != null) {
            return f9502a;
        }
        synchronized (f.class) {
            try {
                if (f9502a == null) {
                    f9502a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9502a;
    }
}
