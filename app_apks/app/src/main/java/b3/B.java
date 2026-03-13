package b3;

import fc.C4015H;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f25057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f25058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f25059d;

    public B(Executor executor) {
        AbstractC4862t.e(executor, "executor");
        this.f25056a = executor;
        this.f25057b = new ArrayDeque();
        this.f25059d = new Object();
    }

    public static final void c(Runnable runnable, B b10) {
        try {
            runnable.run();
        } finally {
            b10.d();
        }
    }

    public final void d() {
        synchronized (this.f25059d) {
            try {
                Object objPoll = this.f25057b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f25058c = runnable;
                if (objPoll != null) {
                    this.f25056a.execute(runnable);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        AbstractC4862t.e(command, "command");
        synchronized (this.f25059d) {
            try {
                this.f25057b.offer(new Runnable() { // from class: b3.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.c(command, this);
                    }
                });
                if (this.f25058c == null) {
                    d();
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
