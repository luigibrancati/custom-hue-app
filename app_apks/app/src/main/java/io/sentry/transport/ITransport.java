package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ITransport extends Closeable {
    void close(boolean z10);

    void flush(long j10);

    RateLimiter getRateLimiter();

    default boolean isHealthy() {
        return true;
    }

    default void send(SentryEnvelope sentryEnvelope) {
        send(sentryEnvelope, new Hint());
    }

    void send(SentryEnvelope sentryEnvelope, Hint hint);
}
