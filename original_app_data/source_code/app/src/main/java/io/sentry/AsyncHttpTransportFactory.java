package io.sentry;

import io.sentry.transport.AsyncHttpTransport;
import io.sentry.transport.ITransport;
import io.sentry.transport.RateLimiter;
import io.sentry.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AsyncHttpTransportFactory implements ITransportFactory {
    @Override // io.sentry.ITransportFactory
    public ITransport create(SentryOptions sentryOptions, RequestDetails requestDetails) {
        Objects.requireNonNull(sentryOptions, "options is required");
        Objects.requireNonNull(requestDetails, "requestDetails is required");
        return new AsyncHttpTransport(sentryOptions, new RateLimiter(sentryOptions), sentryOptions.getTransportGate(), requestDetails);
    }
}
