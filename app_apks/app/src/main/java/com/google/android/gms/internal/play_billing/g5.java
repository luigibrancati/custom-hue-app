package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g5 implements InterfaceFutureC3649z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f30175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f30176b = new f5(this);

    public g5(d5 d5Var) {
        this.f30175a = new WeakReference(d5Var);
    }

    public final boolean c(Object obj) {
        return this.f30176b.e(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        d5 d5Var = (d5) this.f30175a.get();
        boolean zCancel = this.f30176b.cancel(z10);
        if (!zCancel || d5Var == null) {
            return zCancel;
        }
        d5Var.a();
        return true;
    }

    public final boolean d(Throwable th) {
        C3502a3 c3502a3 = new C3502a3(th);
        F1 f12 = c5.f30143f;
        c5 c5Var = this.f30176b;
        if (!f12.d(c5Var, null, c3502a3)) {
            return false;
        }
        c5.d(c5Var);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f30176b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f30176b.f30145a instanceof C3537g2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f30176b.isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC3649z1
    public final void j(Runnable runnable, Executor executor) {
        this.f30176b.j(runnable, executor);
    }

    public final String toString() {
        return this.f30176b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f30176b.get(j10, timeUnit);
    }
}
