package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H1 {
    public static A1 a(ExecutorService executorService) {
        return executorService instanceof A1 ? (A1) executorService : executorService instanceof ScheduledExecutorService ? new G1((ScheduledExecutorService) executorService) : new C1(executorService);
    }

    public static B1 b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof B1 ? (B1) scheduledExecutorService : new G1(scheduledExecutorService);
    }
}
