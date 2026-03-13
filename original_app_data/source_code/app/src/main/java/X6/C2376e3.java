package X6;

import android.os.Process;
import io.sentry.TransactionOptions;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2376e3 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f18803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2384f3 f18805d;

    public C2376e3(C2384f3 c2384f3, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c2384f3);
        this.f18805d = c2384f3;
        this.f18804c = false;
        AbstractC6056k.l(str);
        AbstractC6056k.l(blockingQueue);
        this.f18802a = new Object();
        this.f18803b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f18802a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        C2384f3 c2384f3 = this.f18805d;
        synchronized (c2384f3.B()) {
            try {
                if (!this.f18804c) {
                    c2384f3.C().release();
                    c2384f3.B().notifyAll();
                    if (this == c2384f3.x()) {
                        c2384f3.y(null);
                    } else if (this == c2384f3.z()) {
                        c2384f3.A(null);
                    } else {
                        c2384f3.f18400a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f18804c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f18805d.f18400a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f18805d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f18803b;
                C2368d3 c2368d3 = (C2368d3) blockingQueue.poll();
                if (c2368d3 != null) {
                    Process.setThreadPriority(true != c2368d3.f18776b ? 10 : threadPriority);
                    c2368d3.run();
                } else {
                    Object obj = this.f18802a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f18805d.D();
                            try {
                                obj.wait(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f18805d.B()) {
                        if (this.f18803b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
