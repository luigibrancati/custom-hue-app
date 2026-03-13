package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3590p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f30220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3584o1 f30221b;

    public RunnableC3590p1(Future future, InterfaceC3584o1 interfaceC3584o1) {
        this.f30220a = future;
        this.f30221b = interfaceC3584o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        Object obj2 = this.f30220a;
        if ((obj2 instanceof O1) && (thA = P1.a((O1) obj2)) != null) {
            this.f30221b.b(thA);
            return;
        }
        try {
            Future future = this.f30220a;
            if (!future.isDone()) {
                throw new IllegalStateException(AbstractC3635x.a("Future was expected to be done: %s", future));
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
            this.f30221b.a(obj);
        } catch (ExecutionException e10) {
            this.f30221b.b(e10.getCause());
        } catch (Throwable th2) {
            this.f30221b.b(th2);
        }
    }

    public final String toString() {
        C3605s c3605sA = AbstractC3617u.a(this);
        c3605sA.a(this.f30221b);
        return c3605sA.toString();
    }
}
