package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D1 extends AbstractC3572m1 implements ScheduledFuture, InterfaceFutureC3649z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f30014b;

    public D1(InterfaceFutureC3649z1 interfaceFutureC3649z1, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC3649z1);
        this.f30014b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = q().cancel(z10);
        if (zCancel) {
            this.f30014b.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f30014b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f30014b.getDelay(timeUnit);
    }
}
