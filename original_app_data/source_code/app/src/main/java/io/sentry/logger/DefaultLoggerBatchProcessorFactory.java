package io.sentry.logger;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DefaultLoggerBatchProcessorFactory implements ILoggerBatchProcessorFactory {
    @Override // io.sentry.logger.ILoggerBatchProcessorFactory
    public ILoggerBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient) {
        return new LoggerBatchProcessor(sentryOptions, sentryClient);
    }
}
