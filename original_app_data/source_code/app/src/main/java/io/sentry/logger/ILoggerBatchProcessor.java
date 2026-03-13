package io.sentry.logger;

import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ILoggerBatchProcessor {
    void add(SentryLogEvent sentryLogEvent);

    void close(boolean z10);

    void flush(long j10);
}
