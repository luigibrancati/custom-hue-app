package io.sentry;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransactionProfiler implements ITransactionProfiler {
    private static final NoOpTransactionProfiler instance = new NoOpTransactionProfiler();

    private NoOpTransactionProfiler() {
    }

    public static NoOpTransactionProfiler getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.ITransactionProfiler
    public ProfilingTraceData onTransactionFinish(ITransaction iTransaction, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        return null;
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(ITransaction iTransaction) {
    }
}
