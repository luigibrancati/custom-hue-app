package io.sentry.metrics;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IMetricsApi {
    void count(String str);

    void count(String str, Double d10);

    void count(String str, Double d10, String str2);

    void count(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters);

    void count(String str, String str2);

    void distribution(String str, Double d10);

    void distribution(String str, Double d10, String str2);

    void distribution(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters);

    void gauge(String str, Double d10);

    void gauge(String str, Double d10, String str2);

    void gauge(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters);
}
