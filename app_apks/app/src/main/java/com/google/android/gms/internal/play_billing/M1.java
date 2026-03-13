package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M1 extends AbstractRunnableC3637x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f30065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N1 f30066d;

    public M1(N1 n12, Callable callable) {
        this.f30066d = n12;
        callable.getClass();
        this.f30065c = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC3637x1
    public final Object a() {
        return this.f30065c.call();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC3637x1
    public final String b() {
        return this.f30065c.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC3637x1
    public final void c(Throwable th) {
        this.f30066d.q(th);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC3637x1
    public final void d(Object obj) {
        this.f30066d.p(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC3637x1
    public final boolean f() {
        return this.f30066d.isDone();
    }
}
