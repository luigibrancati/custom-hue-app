package E;

import E.r;
import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f3011c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3012a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f3013b = c();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3014a = new AtomicInteger(0);

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: E.q
                @Override // java.lang.Runnable
                public final void run() {
                    r.a.a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f3014a.getAndIncrement())));
            return thread;
        }
    }

    public static ThreadPoolExecutor c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f3011c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: E.p
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                AbstractC0807p0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    public void d() {
        synchronized (this.f3012a) {
            try {
                if (!this.f3013b.isShutdown()) {
                    this.f3013b.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(L.H h10) {
        ThreadPoolExecutor threadPoolExecutor;
        X0.h.g(h10);
        synchronized (this.f3012a) {
            try {
                if (this.f3013b.isShutdown()) {
                    this.f3013b = c();
                }
                threadPoolExecutor = this.f3013b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, h10.d().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        X0.h.g(runnable);
        synchronized (this.f3012a) {
            this.f3013b.execute(runnable);
        }
    }
}
