package M;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f8867a;

    public static Handler a() {
        if (f8867a != null) {
            return f8867a;
        }
        synchronized (m.class) {
            try {
                if (f8867a == null) {
                    f8867a = U0.g.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8867a;
    }
}
