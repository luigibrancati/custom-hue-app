package b6;

import f6.AbstractC3996a;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorC2845n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25363a;

    /* JADX INFO: renamed from: b6.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f25364a;

        public a(Runnable runnable) {
            this.f25364a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f25364a.run();
            } catch (Exception e10) {
                AbstractC3996a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public ExecutorC2845n(Executor executor) {
        this.f25363a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25363a.execute(new a(runnable));
    }
}
