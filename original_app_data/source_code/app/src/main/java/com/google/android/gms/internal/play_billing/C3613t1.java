package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3613t1 implements InterfaceFutureC3649z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3643y1 f30243b = new C3643y1(C3613t1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30244a;

    public C3613t1(Object obj) {
        this.f30244a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f30244a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC3649z1
    public final void j(Runnable runnable, Executor executor) {
        AbstractC3629w.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f30243b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public final String toString() {
        Object obj = this.f30244a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f30244a;
    }
}
