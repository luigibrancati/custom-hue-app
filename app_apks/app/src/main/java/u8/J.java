package u8;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f45276b;

        /* JADX INFO: renamed from: u8.J$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0618a extends AbstractRunnableC5987d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f45277a;

            public C0618a(Runnable runnable) {
                this.f45277a = runnable;
            }

            @Override // u8.AbstractRunnableC5987d
            public void a() {
                this.f45277a.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f45275a = str;
            this.f45276b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0618a(runnable));
            threadNewThread.setName(this.f45275a + this.f45276b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractRunnableC5987d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f45280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f45281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f45282d;

        public b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f45279a = str;
            this.f45280b = executorService;
            this.f45281c = j10;
            this.f45282d = timeUnit;
        }

        @Override // u8.AbstractRunnableC5987d
        public void a() {
            try {
                r8.g.f().b("Executing shutdown hook for " + this.f45279a);
                this.f45280b.shutdown();
                if (this.f45280b.awaitTermination(this.f45281c, this.f45282d)) {
                    return;
                }
                r8.g.f().b(this.f45279a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f45280b.shutdownNow();
            } catch (InterruptedException unused) {
                r8.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f45279a));
                this.f45280b.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
