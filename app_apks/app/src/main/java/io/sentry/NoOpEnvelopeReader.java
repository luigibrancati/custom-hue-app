package io.sentry;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpEnvelopeReader implements IEnvelopeReader {
    private static final NoOpEnvelopeReader instance = new NoOpEnvelopeReader();

    private NoOpEnvelopeReader() {
    }

    public static NoOpEnvelopeReader getInstance() {
        return instance;
    }

    @Override // io.sentry.IEnvelopeReader
    public SentryEnvelope read(InputStream inputStream) {
        return null;
    }
}
