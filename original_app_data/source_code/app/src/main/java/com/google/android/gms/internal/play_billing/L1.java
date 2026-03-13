package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L1 extends AbstractC3554j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceFutureC3649z1 f30060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f30061i;

    public L1(InterfaceFutureC3649z1 interfaceFutureC3649z1) {
        this.f30060h = interfaceFutureC3649z1;
    }

    public static InterfaceFutureC3649z1 D(InterfaceFutureC3649z1 interfaceFutureC3649z1, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        L1 l12 = new L1(interfaceFutureC3649z1);
        I1 i12 = new I1(l12);
        l12.f30061i = scheduledExecutorService.schedule(i12, 28500L, timeUnit);
        interfaceFutureC3649z1.j(i12, EnumC3548i1.INSTANCE);
        return l12;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3512c1
    public final String i() {
        InterfaceFutureC3649z1 interfaceFutureC3649z1 = this.f30060h;
        ScheduledFuture scheduledFuture = this.f30061i;
        if (interfaceFutureC3649z1 == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC3649z1.toString() + "]";
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3512c1
    public final void o() {
        InterfaceFutureC3649z1 interfaceFutureC3649z1 = this.f30060h;
        if ((interfaceFutureC3649z1 != null) & isCancelled()) {
            interfaceFutureC3649z1.cancel(s());
        }
        ScheduledFuture scheduledFuture = this.f30061i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f30060h = null;
        this.f30061i = null;
    }
}
