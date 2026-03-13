package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IClientReportRecorder {
    SentryEnvelope attachReportToEnvelope(SentryEnvelope sentryEnvelope);

    void recordLostEnvelope(DiscardReason discardReason, SentryEnvelope sentryEnvelope);

    void recordLostEnvelopeItem(DiscardReason discardReason, SentryEnvelopeItem sentryEnvelopeItem);

    void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory);

    void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory, long j10);
}
