package N;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b f9482a;

    public static Executor a() {
        if (f9482a != null) {
            return f9482a;
        }
        synchronized (b.class) {
            try {
                if (f9482a == null) {
                    f9482a = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9482a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
