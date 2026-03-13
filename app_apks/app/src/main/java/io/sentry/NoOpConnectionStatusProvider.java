package io.sentry;

import io.sentry.IConnectionStatusProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpConnectionStatusProvider implements IConnectionStatusProvider {
    @Override // io.sentry.IConnectionStatusProvider
    public boolean addConnectionStatusObserver(IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        return false;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public IConnectionStatusProvider.ConnectionStatus getConnectionStatus() {
        return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public String getConnectionType() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void removeConnectionStatusObserver(IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
    }
}
