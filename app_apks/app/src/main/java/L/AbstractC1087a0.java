package L;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1087a0 {
    public static AbstractC1087a0 a(Executor executor, Handler handler) {
        return new C1100h(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
