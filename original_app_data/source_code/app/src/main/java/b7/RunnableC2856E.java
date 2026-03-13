package b7;

import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2856E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f25393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2857F f25394b;

    public RunnableC2856E(C2857F c2857f, Task task) {
        this.f25393a = task;
        Objects.requireNonNull(c2857f);
        this.f25394b = c2857f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskA = this.f25394b.d().a(this.f25393a.m());
            if (taskA == null) {
                this.f25394b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            C2857F c2857f = this.f25394b;
            Executor executor = AbstractC2879m.f25416b;
            taskA.i(executor, c2857f);
            taskA.f(executor, c2857f);
            taskA.a(executor, c2857f);
        } catch (C2876j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f25394b.c((Exception) e10.getCause());
            } else {
                this.f25394b.c(e10);
            }
        } catch (CancellationException unused) {
            this.f25394b.a();
        } catch (Exception e11) {
            this.f25394b.c(e11);
        }
    }
}
