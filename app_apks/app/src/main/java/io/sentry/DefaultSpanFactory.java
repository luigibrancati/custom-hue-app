package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DefaultSpanFactory implements ISpanFactory {
    @Override // io.sentry.ISpanFactory
    public ISpan createSpan(IScopes iScopes, SpanOptions spanOptions, SpanContext spanContext, ISpan iSpan) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpanFactory
    public ITransaction createTransaction(TransactionContext transactionContext, IScopes iScopes, TransactionOptions transactionOptions, CompositePerformanceCollector compositePerformanceCollector) {
        return new SentryTracer(transactionContext, iScopes, transactionOptions, compositePerformanceCollector);
    }
}
