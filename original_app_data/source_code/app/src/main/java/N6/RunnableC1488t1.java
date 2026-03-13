package N6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: N6.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1488t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f10472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1475s1 f10473b;

    public RunnableC1488t1(Future future, InterfaceC1475s1 interfaceC1475s1) {
        this.f10472a = future;
        this.f10473b = interfaceC1475s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA = J1.a((I1) this.f10472a);
        if (thA != null) {
            this.f10473b.b(thA);
            return;
        }
        try {
            Future future = this.f10472a;
            if (!future.isDone()) {
                throw new IllegalStateException(A.b("Future was expected to be done: %s", future));
            }
            boolean z10 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f10473b.a(obj);
        } catch (ExecutionException e10) {
            this.f10473b.b(e10.getCause());
        } catch (Throwable th2) {
            this.f10473b.b(th2);
        }
    }

    public final String toString() {
        C1512v c1512vA = AbstractC1525w.a(this);
        c1512vA.a(this.f10473b);
        return c1512vA.toString();
    }
}
