package io.sentry.android.core;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.metrics.IMetricsBatchProcessor;
import io.sentry.metrics.IMetricsBatchProcessorFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidMetricsBatchProcessorFactory implements IMetricsBatchProcessorFactory {
    @Override // io.sentry.metrics.IMetricsBatchProcessorFactory
    public IMetricsBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient) {
        return new AndroidMetricsBatchProcessor(sentryOptions, sentryClient);
    }
}
