package io.sentry;

import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ReplayController extends IReplayApi {
    void captureReplay(Boolean bool);

    ReplayBreadcrumbConverter getBreadcrumbConverter();

    SentryId getReplayId();

    boolean isDebugMaskingOverlayEnabled();

    boolean isRecording();

    void pause();

    void resume();

    void setBreadcrumbConverter(ReplayBreadcrumbConverter replayBreadcrumbConverter);

    void start();

    void stop();
}
