package io.sentry.exception;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidSentryTraceHeaderException extends Exception {
    private static final long serialVersionUID = -8353316997083420940L;
    private final String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(String str) {
        this(str, null);
    }

    public String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }

    public InvalidSentryTraceHeaderException(String str, Throwable th) {
        super("sentry-trace header does not conform to expected format: " + str, th);
        this.sentryTraceHeader = str;
    }
}
