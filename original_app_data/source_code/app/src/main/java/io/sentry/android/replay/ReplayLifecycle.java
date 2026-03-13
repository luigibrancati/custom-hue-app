package io.sentry.android.replay;

import fc.C4032o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/ReplayLifecycle;", "", "()V", "currentState", "Lio/sentry/android/replay/ReplayState;", "getCurrentState$sentry_android_replay_release", "()Lio/sentry/android/replay/ReplayState;", "setCurrentState$sentry_android_replay_release", "(Lio/sentry/android/replay/ReplayState;)V", "isAllowed", "", "newState", "isTouchRecordingAllowed", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayLifecycle {
    public static final int $stable = 8;
    private volatile ReplayState currentState = ReplayState.INITIAL;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReplayState.values().length];
            try {
                iArr[ReplayState.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReplayState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReplayState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReplayState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReplayState.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReplayState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: getCurrentState$sentry_android_replay_release, reason: from getter */
    public final ReplayState getCurrentState() {
        return this.currentState;
    }

    public final boolean isAllowed(ReplayState newState) {
        AbstractC4862t.e(newState, "newState");
        switch (WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()]) {
            case 1:
                return newState == ReplayState.STARTED || newState == ReplayState.CLOSED;
            case 2:
                return newState == ReplayState.PAUSED || newState == ReplayState.STOPPED || newState == ReplayState.CLOSED;
            case 3:
                return newState == ReplayState.PAUSED || newState == ReplayState.STOPPED || newState == ReplayState.CLOSED;
            case 4:
                return newState == ReplayState.RESUMED || newState == ReplayState.STOPPED || newState == ReplayState.CLOSED;
            case 5:
                return newState == ReplayState.STARTED || newState == ReplayState.CLOSED;
            case 6:
                return false;
            default:
                throw new C4032o();
        }
    }

    public final boolean isTouchRecordingAllowed() {
        return this.currentState == ReplayState.STARTED || this.currentState == ReplayState.RESUMED;
    }

    public final void setCurrentState$sentry_android_replay_release(ReplayState replayState) {
        AbstractC4862t.e(replayState, "<set-?>");
        this.currentState = replayState;
    }
}
