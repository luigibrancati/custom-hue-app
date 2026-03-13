package N6;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: N6.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1540x1 implements E1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D1 f10536b = new D1(C1540x1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10537a;

    public C1540x1(Object obj) {
        this.f10537a = obj;
    }

    @Override // N6.E1
    public final void a(Runnable runnable, Executor executor) {
        AbstractC1564z.c(executor, "Executor was null.");
        try {
            runnable.run();
        } catch (Exception e10) {
            f10536b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f10537a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f10537a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f10537a;
    }
}
