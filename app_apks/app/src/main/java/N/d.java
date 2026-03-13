package N;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f9495b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f9496a = Executors.newSingleThreadExecutor(new a());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor a() {
        if (f9495b != null) {
            return f9495b;
        }
        synchronized (d.class) {
            try {
                if (f9495b == null) {
                    f9495b = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9495b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f9496a.execute(runnable);
    }
}
