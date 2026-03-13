package V0;

import android.os.Handler;
import android.os.Process;
import io.sentry.ProfilingTraceData;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17236b;

        /* JADX INFO: renamed from: V0.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0219a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17237a;

            public C0219a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f17237a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f17237a);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f17235a = str;
            this.f17236b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0219a(runnable, this.f17235a, this.f17236b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f17238a;

        public b(Handler handler) {
            this.f17238a = (Handler) X0.h.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f17238a.post((Runnable) X0.h.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f17238a + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callable f17239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public X0.a f17240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f17241c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X0.a f17242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f17243b;

            public a(X0.a aVar, Object obj) {
                this.f17242a = aVar;
                this.f17243b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17242a.accept(this.f17243b);
            }
        }

        public c(Handler handler, Callable callable, X0.a aVar) {
            this.f17239a = callable;
            this.f17240b = aVar;
            this.f17241c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f17239a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f17241c.post(new a(this.f17240b, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new b(handler);
    }

    public static void c(Executor executor, Callable callable, X0.a aVar) {
        executor.execute(new c(V0.b.a(), callable, aVar));
    }

    public static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        }
    }
}
