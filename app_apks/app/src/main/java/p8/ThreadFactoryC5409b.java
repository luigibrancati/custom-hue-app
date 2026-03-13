package p8;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: p8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryC5409b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f42246e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f42247a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f42250d;

    public ThreadFactoryC5409b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f42248b = str;
        this.f42249c = i10;
        this.f42250d = threadPolicy;
    }

    public static /* synthetic */ void a(ThreadFactoryC5409b threadFactoryC5409b, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC5409b.f42249c);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC5409b.f42250d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f42246e.newThread(new Runnable() { // from class: p8.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC5409b.a(this.f42244a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f42248b, Long.valueOf(this.f42247a.getAndIncrement())));
        return threadNewThread;
    }
}
