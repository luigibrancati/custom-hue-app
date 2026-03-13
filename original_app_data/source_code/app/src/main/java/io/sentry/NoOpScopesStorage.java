package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpScopesStorage implements IScopesStorage {
    private static final NoOpScopesStorage instance = new NoOpScopesStorage();

    private NoOpScopesStorage() {
    }

    public static NoOpScopesStorage getInstance() {
        return instance;
    }

    @Override // io.sentry.IScopesStorage
    public IScopes get() {
        return NoOpScopes.getInstance();
    }

    @Override // io.sentry.IScopesStorage
    public ISentryLifecycleToken set(IScopes iScopes) {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }
}
