package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3578n1 extends AbstractFutureC3566l1 implements InterfaceFutureC3649z1 {
    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC3649z1
    public final void j(Runnable runnable, Executor executor) {
        s().j(runnable, executor);
    }

    public abstract InterfaceFutureC3649z1 s();
}
