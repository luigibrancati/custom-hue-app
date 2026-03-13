package io.sentry.util.runtime;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IRuntimeManager {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IRuntimeManagerCallback<T> {
        T run();
    }

    <T> T runWithRelaxedPolicy(IRuntimeManagerCallback<T> iRuntimeManagerCallback);

    void runWithRelaxedPolicy(Runnable runnable);
}
