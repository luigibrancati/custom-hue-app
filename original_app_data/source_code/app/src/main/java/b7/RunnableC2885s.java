package b7;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: b7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2885s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f25428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2886t f25429b;

    public RunnableC2885s(C2886t c2886t, Task task) {
        this.f25428a = task;
        Objects.requireNonNull(c2886t);
        this.f25429b = c2886t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.f25428a;
        if (task.o()) {
            this.f25429b.c().x();
            return;
        }
        try {
            this.f25429b.c().t(this.f25429b.a().a(task));
        } catch (C2876j e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.f25429b.c().v(e10);
                return;
            }
            C2886t c2886t = this.f25429b;
            c2886t.c().v((Exception) e10.getCause());
        } catch (Exception e11) {
            this.f25429b.c().v(e11);
        }
    }
}
