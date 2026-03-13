package io.sentry.metrics;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpMetricsApi implements IMetricsApi {
    private static final NoOpMetricsApi instance = new NoOpMetricsApi();

    private NoOpMetricsApi() {
    }

    public static NoOpMetricsApi getInstance() {
        return instance;
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d10) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d10) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d10) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d10, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d10, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d10, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, String str2) {
    }
}
