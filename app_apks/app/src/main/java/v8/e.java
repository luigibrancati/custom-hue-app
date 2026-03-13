package v8;

import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f45896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45897b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f45898c = Tasks.e(null);

    public e(ExecutorService executorService) {
        this.f45896a = executorService;
    }

    public static /* synthetic */ Task a(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.e(null);
    }

    public static /* synthetic */ Task c(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public ExecutorService d() {
        return this.f45896a;
    }

    public Task e(final Runnable runnable) {
        Task taskK;
        synchronized (this.f45897b) {
            taskK = this.f45898c.k(this.f45896a, new InterfaceC2869c() { // from class: v8.d
                @Override // b7.InterfaceC2869c
                public final Object a(Task task) {
                    return e.a(runnable, task);
                }
            });
            this.f45898c = taskK;
        }
        return taskK;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f45896a.execute(runnable);
    }

    public Task f(final Callable callable) {
        Task taskK;
        synchronized (this.f45897b) {
            taskK = this.f45898c.k(this.f45896a, new InterfaceC2869c() { // from class: v8.c
                @Override // b7.InterfaceC2869c
                public final Object a(Task task) {
                    return e.c(callable, task);
                }
            });
            this.f45898c = taskK;
        }
        return taskK;
    }
}
