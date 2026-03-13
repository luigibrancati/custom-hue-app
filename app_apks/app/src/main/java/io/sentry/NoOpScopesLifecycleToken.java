package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpScopesLifecycleToken implements ISentryLifecycleToken {
    private static final NoOpScopesLifecycleToken instance = new NoOpScopesLifecycleToken();

    private NoOpScopesLifecycleToken() {
    }

    public static NoOpScopesLifecycleToken getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
    public void close() {
    }
}
