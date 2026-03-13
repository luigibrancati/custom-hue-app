package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFutureC3566l1 extends Y implements Future {
    @Override // java.util.concurrent.Future
    public final Object get() {
        return q().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return q().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return q().isDone();
    }

    public abstract Future q();

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return q().get(j10, timeUnit);
    }
}
