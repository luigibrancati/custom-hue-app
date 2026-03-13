package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L1 f30043a;

    public I1(L1 l12) {
        this.f30043a = l12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC3649z1 interfaceFutureC3649z1;
        L1 l12 = this.f30043a;
        if (l12 == null || (interfaceFutureC3649z1 = l12.f30060h) == null) {
            return;
        }
        this.f30043a = null;
        if (interfaceFutureC3649z1.isDone()) {
            l12.r(interfaceFutureC3649z1);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = l12.f30061i;
            l12.f30061i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    l12.q(new J1(str, null));
                    throw th;
                }
            }
            l12.q(new J1(str + ": " + interfaceFutureC3649z1.toString(), null));
        } finally {
            interfaceFutureC3649z1.cancel(true);
        }
    }
}
