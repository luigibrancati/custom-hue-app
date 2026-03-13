package io.sentry.metrics;

import io.sentry.SentryMetricsEvent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpMetricsBatchProcessor implements IMetricsBatchProcessor {
    private static final NoOpMetricsBatchProcessor instance = new NoOpMetricsBatchProcessor();

    private NoOpMetricsBatchProcessor() {
    }

    public static NoOpMetricsBatchProcessor getInstance() {
        return instance;
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void add(SentryMetricsEvent sentryMetricsEvent) {
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z10) {
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void flush(long j10) {
    }
}
