package q;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: q.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5474d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42970a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f42971b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f42972c;

    /* JADX INFO: renamed from: q.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f42973a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f42973a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: q.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler d(Looper looper) {
        return b.a(looper);
    }

    @Override // q.e
    public void a(Runnable runnable) {
        this.f42971b.execute(runnable);
    }

    @Override // q.e
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // q.e
    public void c(Runnable runnable) {
        if (this.f42972c == null) {
            synchronized (this.f42970a) {
                try {
                    if (this.f42972c == null) {
                        this.f42972c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f42972c.post(runnable);
    }
}
