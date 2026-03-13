package io.sentry.util.runtime;

import io.sentry.util.runtime.IRuntimeManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NeutralRuntimeManager implements IRuntimeManager {
    @Override // io.sentry.util.runtime.IRuntimeManager
    public <T> T runWithRelaxedPolicy(IRuntimeManager.IRuntimeManagerCallback<T> iRuntimeManagerCallback) {
        return iRuntimeManagerCallback.run();
    }

    @Override // io.sentry.util.runtime.IRuntimeManager
    public void runWithRelaxedPolicy(Runnable runnable) {
        runnable.run();
    }
}
