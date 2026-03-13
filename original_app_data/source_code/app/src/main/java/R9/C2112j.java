package R9;

import M6.AbstractExecutorServiceC1229u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: R9.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2112j extends AbstractExecutorServiceC1229u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f14961b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f14962a;

    public C2112j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: R9.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: R9.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2112j.f(runnable);
                    }
                });
            }
        });
        this.f14962a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void f(Runnable runnable) {
        f14961b.set(new ArrayDeque());
        runnable.run();
    }

    public static void g(Deque deque, Runnable runnable) {
        AbstractC6056k.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // M6.Y
    public final /* synthetic */ Object a() {
        return this.f14962a;
    }

    @Override // M6.AbstractExecutorServiceC1229u
    public final ExecutorService c() {
        return this.f14962a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f14961b.get();
        if (deque == null || deque.size() > 1) {
            this.f14962a.execute(new Runnable() { // from class: R9.u
                @Override // java.lang.Runnable
                public final void run() {
                    C2112j.g((Deque) C2112j.f14961b.get(), runnable);
                }
            });
        } else {
            g(deque, runnable);
        }
    }
}
