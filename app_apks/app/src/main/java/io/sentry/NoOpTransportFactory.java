package io.sentry;

import io.sentry.transport.ITransport;
import io.sentry.transport.NoOpTransport;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransportFactory implements ITransportFactory {
    private static final NoOpTransportFactory instance = new NoOpTransportFactory();

    private NoOpTransportFactory() {
    }

    public static NoOpTransportFactory getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransportFactory
    public ITransport create(SentryOptions sentryOptions, RequestDetails requestDetails) {
        return NoOpTransport.getInstance();
    }
}
