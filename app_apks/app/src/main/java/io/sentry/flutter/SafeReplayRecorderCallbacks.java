package io.sentry.flutter;

import android.util.Log;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/sentry/flutter/SafeReplayRecorderCallbacks;", "Lio/sentry/flutter/ReplayRecorderCallbacks;", "delegate", "<init>", "(Lio/sentry/flutter/ReplayRecorderCallbacks;)V", "Lkotlin/Function0;", "Lfc/H;", "block", "guard", "(Lvc/a;)V", "", "replayId", "", "replayIsBuffering", "replayStarted", "(Ljava/lang/String;Z)V", "replayResumed", "()V", "replayPaused", "replayStopped", "replayReset", "", "width", "height", RRWebVideoEvent.JsonKeys.FRAME_RATE, "replayConfigChanged", "(III)V", "Lio/sentry/flutter/ReplayRecorderCallbacks;", "generationSnapshot", "I", "Companion", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SafeReplayRecorderCallbacks implements ReplayRecorderCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicInteger generationCounter = new AtomicInteger(0);
    private final ReplayRecorderCallbacks delegate;
    private final int generationSnapshot;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/sentry/flutter/SafeReplayRecorderCallbacks$Companion;", "", "<init>", "()V", "Lfc/H;", "bumpGeneration", "", "currentGeneration", "()I", "Ljava/util/concurrent/atomic/AtomicInteger;", "generationCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void bumpGeneration() {
            SafeReplayRecorderCallbacks.generationCounter.incrementAndGet();
        }

        public final int currentGeneration() {
            return SafeReplayRecorderCallbacks.generationCounter.get();
        }

        private Companion() {
        }
    }

    public SafeReplayRecorderCallbacks(ReplayRecorderCallbacks delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.delegate = delegate;
        this.generationSnapshot = INSTANCE.currentGeneration();
    }

    private final void guard(InterfaceC6082a block) {
        if (this.generationSnapshot != INSTANCE.currentGeneration()) {
            return;
        }
        try {
            block.invoke();
        } catch (Throwable th) {
            Log.w("Sentry", "Replay recorder callback failed", th);
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayConfigChanged(int width, int height, int frameRate) {
        if (this.generationSnapshot == INSTANCE.currentGeneration()) {
            try {
                this.delegate.replayConfigChanged(width, height, frameRate);
            } catch (Throwable th) {
                Log.w("Sentry", "Replay recorder callback failed", th);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayPaused() {
        if (this.generationSnapshot == INSTANCE.currentGeneration()) {
            try {
                this.delegate.replayPaused();
            } catch (Throwable th) {
                Log.w("Sentry", "Replay recorder callback failed", th);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayReset() {
        if (this.generationSnapshot == INSTANCE.currentGeneration()) {
            try {
                this.delegate.replayReset();
            } catch (Throwable th) {
                Log.w("Sentry", "Replay recorder callback failed", th);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayResumed() {
        if (this.generationSnapshot == INSTANCE.currentGeneration()) {
            try {
                this.delegate.replayResumed();
            } catch (Throwable th) {
                Log.w("Sentry", "Replay recorder callback failed", th);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayStarted(String replayId, boolean replayIsBuffering) {
        AbstractC4862t.e(replayId, "replayId");
        if (this.generationSnapshot == INSTANCE.currentGeneration()) {
            try {
                this.delegate.replayStarted(replayId, replayIsBuffering);
            } catch (Throwable th) {
                Log.w("Sentry", "Replay recorder callback failed", th);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayStopped() {
        if (this.generationSnapshot == INSTANCE.currentGeneration()) {
            try {
                this.delegate.replayStopped();
            } catch (Throwable th) {
                Log.w("Sentry", "Replay recorder callback failed", th);
            }
        }
    }
}
