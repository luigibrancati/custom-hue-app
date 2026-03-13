package io.sentry;

import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpContinuousProfiler implements IContinuousProfiler {
    private static final NoOpContinuousProfiler instance = new NoOpContinuousProfiler();

    private NoOpContinuousProfiler() {
    }

    public static NoOpContinuousProfiler getInstance() {
        return instance;
    }

    @Override // io.sentry.IContinuousProfiler
    public SentryId getChunkId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IContinuousProfiler
    public SentryId getProfilerId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IContinuousProfiler
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.IContinuousProfiler
    public void reevaluateSampling() {
    }

    @Override // io.sentry.IContinuousProfiler
    public void close(boolean z10) {
    }

    @Override // io.sentry.IContinuousProfiler
    public void stopProfiler(ProfileLifecycle profileLifecycle) {
    }

    @Override // io.sentry.IContinuousProfiler
    public void startProfiler(ProfileLifecycle profileLifecycle, TracesSampler tracesSampler) {
    }
}
