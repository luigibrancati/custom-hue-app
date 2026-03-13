package io.sentry.exception;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeException extends Exception {
    private static final long serialVersionUID = -8307801916948173232L;

    public SentryEnvelopeException(String str) {
        super(str);
    }

    public SentryEnvelopeException(String str, Throwable th) {
        super(str, th);
    }
}
