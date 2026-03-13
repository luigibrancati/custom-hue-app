package N;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f9498b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f9499a = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f9500a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f9500a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor a() {
        if (f9498b != null) {
            return f9498b;
        }
        synchronized (e.class) {
            try {
                if (f9498b == null) {
                    f9498b = new e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9498b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f9499a.execute(runnable);
    }
}
