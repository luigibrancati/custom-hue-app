package io.sentry;

import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IContinuousProfiler {
    void close(boolean z10);

    SentryId getChunkId();

    SentryId getProfilerId();

    boolean isRunning();

    void reevaluateSampling();

    void startProfiler(ProfileLifecycle profileLifecycle, TracesSampler tracesSampler);

    void stopProfiler(ProfileLifecycle profileLifecycle);
}
