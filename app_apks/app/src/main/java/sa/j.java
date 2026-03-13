package sa;

import java.util.concurrent.atomic.AtomicBoolean;
import ma.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f44434a = new AtomicBoolean(false);

    public synchronized void a() {
        while (!this.f44434a.get()) {
            try {
                wait();
            } catch (InterruptedException e10) {
                if (!this.f44434a.get()) {
                    q.r(e10, "Queue's awaitRelease() has been interrupted abruptly while it wasn't released by the release() method.", new Object[0]);
                }
            }
        }
    }

    @Override // sa.i
    public synchronized void release() {
        if (this.f44434a.compareAndSet(false, true)) {
            notify();
        }
    }
}
