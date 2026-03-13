package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    private NoOpTransport() {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.transport.ITransport
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z10) {
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j10) {
    }

    @Override // io.sentry.transport.ITransport
    public void send(SentryEnvelope sentryEnvelope, Hint hint) {
    }
}
