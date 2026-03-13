package io.sentry;

import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpReplayController implements ReplayController {
    private static final NoOpReplayController instance = new NoOpReplayController();

    private NoOpReplayController() {
    }

    public static NoOpReplayController getInstance() {
        return instance;
    }

    @Override // io.sentry.ReplayController
    public ReplayBreadcrumbConverter getBreadcrumbConverter() {
        return NoOpReplayBreadcrumbConverter.getInstance();
    }

    @Override // io.sentry.ReplayController
    public SentryId getReplayId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ReplayController
    public boolean isDebugMaskingOverlayEnabled() {
        return false;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return false;
    }

    @Override // io.sentry.IReplayApi
    public void disableDebugMaskingOverlay() {
    }

    @Override // io.sentry.IReplayApi
    public void enableDebugMaskingOverlay() {
    }

    @Override // io.sentry.ReplayController
    public void pause() {
    }

    @Override // io.sentry.ReplayController
    public void resume() {
    }

    @Override // io.sentry.ReplayController
    public void start() {
    }

    @Override // io.sentry.ReplayController
    public void stop() {
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(Boolean bool) {
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(ReplayBreadcrumbConverter replayBreadcrumbConverter) {
    }
}
