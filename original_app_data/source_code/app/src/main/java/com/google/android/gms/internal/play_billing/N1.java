package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N1 extends AbstractC3554j1 implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile AbstractRunnableC3637x1 f30068h;

    public N1(Callable callable) {
        this.f30068h = new M1(this, callable);
    }

    public static N1 C(Runnable runnable, Object obj) {
        return new N1(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3512c1
    public final String i() {
        AbstractRunnableC3637x1 abstractRunnableC3637x1 = this.f30068h;
        if (abstractRunnableC3637x1 == null) {
            return super.i();
        }
        return "task=[" + abstractRunnableC3637x1.toString() + "]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3512c1
    public final void o() {
        AbstractRunnableC3637x1 abstractRunnableC3637x1;
        if (s() && (abstractRunnableC3637x1 = this.f30068h) != null) {
            abstractRunnableC3637x1.e();
        }
        this.f30068h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC3637x1 abstractRunnableC3637x1 = this.f30068h;
        if (abstractRunnableC3637x1 != null) {
            abstractRunnableC3637x1.run();
        }
        this.f30068h = null;
    }
}
