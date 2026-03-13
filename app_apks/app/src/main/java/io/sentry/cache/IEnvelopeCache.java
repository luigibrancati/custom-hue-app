package io.sentry.cache;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IEnvelopeCache extends Iterable<SentryEnvelope> {
    void discard(SentryEnvelope sentryEnvelope);

    @Deprecated
    default void store(SentryEnvelope sentryEnvelope) {
        storeEnvelope(sentryEnvelope, new Hint());
    }

    @Deprecated
    void store(SentryEnvelope sentryEnvelope, Hint hint);

    default boolean storeEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        store(sentryEnvelope, hint);
        return true;
    }
}
