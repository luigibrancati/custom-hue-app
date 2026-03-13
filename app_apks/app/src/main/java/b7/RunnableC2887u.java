package b7;

import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2887u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f25433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2888v f25434b;

    public RunnableC2887u(C2888v c2888v, Task task) {
        this.f25433a = task;
        Objects.requireNonNull(c2888v);
        this.f25434b = c2888v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f25434b.d().a(this.f25433a);
            if (task == null) {
                this.f25434b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            C2888v c2888v = this.f25434b;
            Executor executor = AbstractC2879m.f25416b;
            task.i(executor, c2888v);
            task.f(executor, c2888v);
            task.a(executor, c2888v);
        } catch (C2876j e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.f25434b.e().v(e10);
                return;
            }
            C2888v c2888v2 = this.f25434b;
            c2888v2.e().v((Exception) e10.getCause());
        } catch (Exception e11) {
            this.f25434b.e().v(e11);
        }
    }
}
