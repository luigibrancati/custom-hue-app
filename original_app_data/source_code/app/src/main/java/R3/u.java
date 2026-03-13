package R3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class u implements S3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f14546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f14547c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14545a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14548d = new Object();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f14549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f14550b;

        public a(u uVar, Runnable runnable) {
            this.f14549a = uVar;
            this.f14550b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14550b.run();
                synchronized (this.f14549a.f14548d) {
                    this.f14549a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f14549a.f14548d) {
                    this.f14549a.a();
                    throw th;
                }
            }
        }
    }

    public u(Executor executor) {
        this.f14546b = executor;
    }

    public void a() {
        Runnable runnable = (Runnable) this.f14545a.poll();
        this.f14547c = runnable;
        if (runnable != null) {
            this.f14546b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f14548d) {
            try {
                this.f14545a.add(new a(this, runnable));
                if (this.f14547c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
