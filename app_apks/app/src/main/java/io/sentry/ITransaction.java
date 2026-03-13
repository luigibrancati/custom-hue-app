package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ITransaction extends ISpan {
    void finish(SpanStatus spanStatus, SentryDate sentryDate, boolean z10, Hint hint);

    void forceFinish(SpanStatus spanStatus, boolean z10, Hint hint);

    SentryId getEventId();

    ISpan getLatestActiveSpan();

    String getName();

    List<Span> getSpans();

    TransactionNameSource getTransactionNameSource();

    Boolean isProfileSampled();

    void scheduleFinish();

    void setName(String str);

    void setName(String str, TransactionNameSource transactionNameSource);

    ISpan startChild(String str, String str2, SentryDate sentryDate);
}
