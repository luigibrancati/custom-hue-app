package R9;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14997b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14996a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f14998c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f14999d = new AtomicReference();

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f14996a) {
            try {
                if (this.f14997b) {
                    this.f14998c.add(new H(executor, runnable, null));
                } else {
                    this.f14997b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f14996a) {
            try {
                if (this.f14998c.isEmpty()) {
                    this.f14997b = false;
                } else {
                    H h10 = (H) this.f14998c.remove();
                    e(h10.f14946a, h10.f14947b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: R9.F
                @Override // java.lang.Runnable
                public final void run() {
                    J j10 = new J(this.f14944a, null);
                    try {
                        runnable.run();
                        j10.close();
                    } catch (Throwable th) {
                        try {
                            j10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }
}
