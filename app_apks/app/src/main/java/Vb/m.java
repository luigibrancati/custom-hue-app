package Vb;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f17444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f17446c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f17447d = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(m.f17447d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    m.f17447d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean zB = b(true, "rx2.purge-enabled", true, true, bVar);
        f17444a = zB;
        f17445b = c(zB, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f17444a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static boolean b(boolean z10, String str, boolean z11, boolean z12, Jb.e eVar) {
        if (!z10) {
            return z12;
        }
        try {
            String str2 = (String) eVar.apply(str);
            if (str2 != null) {
                return "true".equals(str2);
            }
        } catch (Throwable unused) {
        }
        return z11;
    }

    public static int c(boolean z10, String str, int i10, int i11, Jb.e eVar) {
        if (!z10) {
            return i11;
        }
        try {
            String str2 = (String) eVar.apply(str);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
        } catch (Throwable unused) {
        }
        return i10;
    }

    public static void d() {
        f(f17444a);
    }

    public static void e(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f17447d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void f(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f17446c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new i("RxSchedulerPurge"));
            if (T1.e.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i10 = f17445b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
