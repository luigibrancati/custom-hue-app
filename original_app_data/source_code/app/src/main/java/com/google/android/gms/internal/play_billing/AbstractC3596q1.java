package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3596q1 extends AbstractC3607s1 {
    public static InterfaceFutureC3649z1 a(Object obj) {
        return new C3613t1(obj);
    }

    public static InterfaceFutureC3649z1 b(InterfaceFutureC3649z1 interfaceFutureC3649z1, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC3649z1.isDone() ? interfaceFutureC3649z1 : L1.D(interfaceFutureC3649z1, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(InterfaceFutureC3649z1 interfaceFutureC3649z1, InterfaceC3584o1 interfaceC3584o1, Executor executor) {
        interfaceFutureC3649z1.j(new RunnableC3590p1(interfaceFutureC3649z1, interfaceC3584o1), executor);
    }
}
