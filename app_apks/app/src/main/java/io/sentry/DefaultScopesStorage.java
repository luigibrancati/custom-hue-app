package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DefaultScopesStorage implements IScopesStorage {
    private static final ThreadLocal<IScopes> currentScopes = new ThreadLocal<>();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DefaultScopesLifecycleToken implements ISentryLifecycleToken {
        private final IScopes oldValue;

        public DefaultScopesLifecycleToken(IScopes iScopes) {
            this.oldValue = iScopes;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            DefaultScopesStorage.currentScopes.set(this.oldValue);
        }
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
        currentScopes.remove();
    }

    @Override // io.sentry.IScopesStorage
    public IScopes get() {
        return currentScopes.get();
    }

    @Override // io.sentry.IScopesStorage
    public ISentryLifecycleToken set(IScopes iScopes) {
        IScopes iScopes2 = get();
        currentScopes.set(iScopes);
        return new DefaultScopesLifecycleToken(iScopes2);
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }
}
