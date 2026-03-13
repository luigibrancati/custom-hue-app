package io.sentry.flutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.Sentry;
import io.sentry.android.replay.Recorder;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.protocol.SentryId;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.I;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/sentry/flutter/SentryFlutterReplayRecorder;", "Lio/sentry/android/replay/Recorder;", "Lio/sentry/flutter/ReplayRecorderCallbacks;", "callbacks", "Lio/sentry/android/replay/ReplayIntegration;", "integration", "<init>", "(Lio/sentry/flutter/ReplayRecorderCallbacks;Lio/sentry/android/replay/ReplayIntegration;)V", "Lfc/H;", "start", "()V", "resume", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "reset", "pause", "stop", "close", "Lio/sentry/flutter/ReplayRecorderCallbacks;", "Lio/sentry/android/replay/ReplayIntegration;", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SentryFlutterReplayRecorder implements Recorder {
    private final ReplayRecorderCallbacks callbacks;
    private final ReplayIntegration integration;

    public SentryFlutterReplayRecorder(ReplayRecorderCallbacks callbacks, ReplayIntegration integration) {
        AbstractC4862t.e(callbacks, "callbacks");
        AbstractC4862t.e(integration, "integration");
        this.callbacks = callbacks;
        this.integration = integration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$3(SentryFlutterReplayRecorder sentryFlutterReplayRecorder, ScreenshotRecorderConfig screenshotRecorderConfig) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayConfigChanged(screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getFrameRate());
        } catch (Exception e10) {
            Log.w("Sentry", "Failed to propagate configuration change to Flutter", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$5(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayPaused();
        } catch (Exception e10) {
            Log.w("Sentry", "Failed to pause replay recorder", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$4(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayReset();
        } catch (Exception e10) {
            Log.w("Sentry", "Failed to reset replay recorder", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$2(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayResumed();
        } catch (Exception e10) {
            Log.w("Sentry", "Failed to resume replay recorder", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            String string = sentryFlutterReplayRecorder.integration.getReplayId().toString();
            AbstractC4862t.d(string, "toString(...)");
            final I i10 = new I();
            Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.flutter.h
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    SentryFlutterReplayRecorder.start$lambda$1$lambda$0(i10, iScope);
                }
            });
            sentryFlutterReplayRecorder.callbacks.replayStarted(string, i10.f39773a);
        } catch (Exception e10) {
            Log.w("Sentry", "Failed to start replay recorder", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(I i10, IScope scope) {
        AbstractC4862t.e(scope, "scope");
        i10.f39773a = AbstractC4862t.a(scope.getReplayId(), SentryId.EMPTY_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$6(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayStopped();
        } catch (Exception e10) {
            Log.w("Sentry", "Failed to stop replay recorder", e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stop();
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(final ScreenshotRecorderConfig config) {
        AbstractC4862t.e(config, "config");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.flutter.i
            @Override // java.lang.Runnable
            public final void run() {
                SentryFlutterReplayRecorder.onConfigurationChanged$lambda$3(this.f38742a, config);
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.flutter.d
            @Override // java.lang.Runnable
            public final void run() {
                SentryFlutterReplayRecorder.pause$lambda$5(this.f38737a);
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.flutter.g
            @Override // java.lang.Runnable
            public final void run() {
                SentryFlutterReplayRecorder.reset$lambda$4(this.f38740a);
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.flutter.f
            @Override // java.lang.Runnable
            public final void run() {
                SentryFlutterReplayRecorder.resume$lambda$2(this.f38739a);
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.flutter.c
            @Override // java.lang.Runnable
            public final void run() {
                SentryFlutterReplayRecorder.start$lambda$1(this.f38736a);
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.flutter.e
            @Override // java.lang.Runnable
            public final void run() {
                SentryFlutterReplayRecorder.stop$lambda$6(this.f38738a);
            }
        });
    }
}
