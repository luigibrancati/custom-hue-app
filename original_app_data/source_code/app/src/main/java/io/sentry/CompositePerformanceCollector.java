package io.sentry;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface CompositePerformanceCollector {
    void close();

    void onSpanFinished(ISpan iSpan);

    void onSpanStarted(ISpan iSpan);

    void start(ITransaction iTransaction);

    void start(String str);

    List<PerformanceCollectionData> stop(ITransaction iTransaction);

    List<PerformanceCollectionData> stop(String str);
}
