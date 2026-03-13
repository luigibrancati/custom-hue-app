package io.sentry;

import io.sentry.protocol.SentryTransaction;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface EventProcessor {
    default Long getOrder() {
        return null;
    }

    default SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        return sentryEvent;
    }

    default SentryLogEvent process(SentryLogEvent sentryLogEvent) {
        return sentryLogEvent;
    }

    default SentryMetricsEvent process(SentryMetricsEvent sentryMetricsEvent, Hint hint) {
        return sentryMetricsEvent;
    }

    default SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
        return sentryReplayEvent;
    }

    default SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }
}
