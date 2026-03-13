package io.sentry;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpCompositePerformanceCollector implements CompositePerformanceCollector {
    private static final NoOpCompositePerformanceCollector instance = new NoOpCompositePerformanceCollector();

    private NoOpCompositePerformanceCollector() {
    }

    public static NoOpCompositePerformanceCollector getInstance() {
        return instance;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(ITransaction iTransaction) {
    }

    @Override // io.sentry.CompositePerformanceCollector
    public List<PerformanceCollectionData> stop(ITransaction iTransaction) {
        return null;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(String str) {
    }

    @Override // io.sentry.CompositePerformanceCollector
    public List<PerformanceCollectionData> stop(String str) {
        return null;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void close() {
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanFinished(ISpan iSpan) {
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanStarted(ISpan iSpan) {
    }
}
