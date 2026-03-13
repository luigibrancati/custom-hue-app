package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.DateUtils;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvents;
import io.sentry.SentryMetricsEvents;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.SentryTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientReportRecorder implements IClientReportRecorder {
    private final SentryOptions options;
    private final IClientReportStorage storage = new AtomicClientReportStorage();

    public ClientReportRecorder(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private DataCategory categoryFromItemType(SentryItemType sentryItemType) {
        return SentryItemType.Event.equals(sentryItemType) ? DataCategory.Error : SentryItemType.Session.equals(sentryItemType) ? DataCategory.Session : SentryItemType.Transaction.equals(sentryItemType) ? DataCategory.Transaction : SentryItemType.UserFeedback.equals(sentryItemType) ? DataCategory.UserReport : SentryItemType.Feedback.equals(sentryItemType) ? DataCategory.Feedback : SentryItemType.Profile.equals(sentryItemType) ? DataCategory.Profile : SentryItemType.ProfileChunk.equals(sentryItemType) ? DataCategory.ProfileChunkUi : SentryItemType.Attachment.equals(sentryItemType) ? DataCategory.Attachment : SentryItemType.CheckIn.equals(sentryItemType) ? DataCategory.Monitor : SentryItemType.ReplayVideo.equals(sentryItemType) ? DataCategory.Replay : SentryItemType.Log.equals(sentryItemType) ? DataCategory.LogItem : SentryItemType.Span.equals(sentryItemType) ? DataCategory.Span : SentryItemType.TraceMetric.equals(sentryItemType) ? DataCategory.TraceMetric : DataCategory.Default;
    }

    private void executeOnDiscard(DiscardReason discardReason, DataCategory dataCategory, Long l10) {
        if (this.options.getOnDiscard() != null) {
            try {
                this.options.getOnDiscard().execute(discardReason, dataCategory, l10);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "The onDiscard callback threw an exception.", th);
            }
        }
    }

    private void recordLostEventInternal(String str, String str2, Long l10) {
        this.storage.addCount(new ClientReportKey(str, str2), l10);
    }

    private void restoreCountsFromClientReport(ClientReport clientReport) {
        if (clientReport == null) {
            return;
        }
        for (DiscardedEvent discardedEvent : clientReport.getDiscardedEvents()) {
            recordLostEventInternal(discardedEvent.getReason(), discardedEvent.getCategory(), discardedEvent.getQuantity());
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public SentryEnvelope attachReportToEnvelope(SentryEnvelope sentryEnvelope) {
        ClientReport clientReportResetCountsAndGenerateClientReport = resetCountsAndGenerateClientReport();
        if (clientReportResetCountsAndGenerateClientReport == null) {
            return sentryEnvelope;
        }
        try {
            this.options.getLogger().log(SentryLevel.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<SentryEnvelopeItem> it = sentryEnvelope.getItems().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(SentryEnvelopeItem.fromClientReport(this.options.getSerializer(), clientReportResetCountsAndGenerateClientReport));
            return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return sentryEnvelope;
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEnvelope(DiscardReason discardReason, SentryEnvelope sentryEnvelope) {
        if (sentryEnvelope == null) {
            return;
        }
        try {
            Iterator<SentryEnvelopeItem> it = sentryEnvelope.getItems().iterator();
            while (it.hasNext()) {
                recordLostEnvelopeItem(discardReason, it.next());
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEnvelopeItem(DiscardReason discardReason, SentryEnvelopeItem sentryEnvelopeItem) {
        if (sentryEnvelopeItem == null) {
            return;
        }
        try {
            SentryItemType type = sentryEnvelopeItem.getHeader().getType();
            if (SentryItemType.ClientReport.equals(type)) {
                try {
                    restoreCountsFromClientReport(sentryEnvelopeItem.getClientReport(this.options.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            DataCategory dataCategoryCategoryFromItemType = categoryFromItemType(type);
            if (dataCategoryCategoryFromItemType.equals(DataCategory.Transaction)) {
                SentryTransaction transaction = sentryEnvelopeItem.getTransaction(this.options.getSerializer());
                if (transaction != null) {
                    List<SentrySpan> spans = transaction.getSpans();
                    String reason = discardReason.getReason();
                    DataCategory dataCategory = DataCategory.Span;
                    recordLostEventInternal(reason, dataCategory.getCategory(), Long.valueOf(((long) spans.size()) + 1));
                    executeOnDiscard(discardReason, dataCategory, Long.valueOf(((long) spans.size()) + 1));
                }
                recordLostEventInternal(discardReason.getReason(), dataCategoryCategoryFromItemType.getCategory(), 1L);
                executeOnDiscard(discardReason, dataCategoryCategoryFromItemType, 1L);
                return;
            }
            if (dataCategoryCategoryFromItemType.equals(DataCategory.LogItem)) {
                SentryLogEvents logs = sentryEnvelopeItem.getLogs(this.options.getSerializer());
                if (logs == null) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                long size = logs.getItems().size();
                recordLostEventInternal(discardReason.getReason(), dataCategoryCategoryFromItemType.getCategory(), Long.valueOf(size));
                recordLostEventInternal(discardReason.getReason(), DataCategory.LogByte.getCategory(), Long.valueOf(sentryEnvelopeItem.getData().length));
                executeOnDiscard(discardReason, dataCategoryCategoryFromItemType, Long.valueOf(size));
                return;
            }
            if (!dataCategoryCategoryFromItemType.equals(DataCategory.TraceMetric)) {
                recordLostEventInternal(discardReason.getReason(), dataCategoryCategoryFromItemType.getCategory(), 1L);
                executeOnDiscard(discardReason, dataCategoryCategoryFromItemType, 1L);
                return;
            }
            SentryMetricsEvents metrics = sentryEnvelopeItem.getMetrics(this.options.getSerializer());
            if (metrics == null) {
                this.options.getLogger().log(SentryLevel.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            long size2 = metrics.getItems().size();
            recordLostEventInternal(discardReason.getReason(), dataCategoryCategoryFromItemType.getCategory(), Long.valueOf(size2));
            executeOnDiscard(discardReason, dataCategoryCategoryFromItemType, Long.valueOf(size2));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory) {
        recordLostEvent(discardReason, dataCategory, 1L);
    }

    public ClientReport resetCountsAndGenerateClientReport() {
        Date currentDateTime = DateUtils.getCurrentDateTime();
        List<DiscardedEvent> listResetCountsAndGet = this.storage.resetCountsAndGet();
        if (listResetCountsAndGet.isEmpty()) {
            return null;
        }
        return new ClientReport(currentDateTime, listResetCountsAndGet);
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory, long j10) {
        try {
            recordLostEventInternal(discardReason.getReason(), dataCategory.getCategory(), Long.valueOf(j10));
            executeOnDiscard(discardReason, dataCategory, Long.valueOf(j10));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }
}
