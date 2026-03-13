package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.cache.IEnvelopeCache;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpEnvelopeCache implements IEnvelopeCache {
    private static final NoOpEnvelopeCache instance = new NoOpEnvelopeCache();

    public static NoOpEnvelopeCache getInstance() {
        return instance;
    }

    @Override // java.lang.Iterable
    public Iterator<SentryEnvelope> iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public boolean storeEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return false;
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void discard(SentryEnvelope sentryEnvelope) {
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void store(SentryEnvelope sentryEnvelope, Hint hint) {
    }
}
