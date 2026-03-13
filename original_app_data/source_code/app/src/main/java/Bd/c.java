package Bd;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.l f812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Lock lock, Runnable checkCancelled, vc.l interruptedExceptionHandler) {
        super(lock);
        AbstractC4862t.e(lock, "lock");
        AbstractC4862t.e(checkCancelled, "checkCancelled");
        AbstractC4862t.e(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f811c = checkCancelled;
        this.f812d = interruptedExceptionHandler;
    }

    @Override // Bd.d, Bd.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f811c.run();
            } catch (InterruptedException e10) {
                this.f812d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable checkCancelled, vc.l interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        AbstractC4862t.e(checkCancelled, "checkCancelled");
        AbstractC4862t.e(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
