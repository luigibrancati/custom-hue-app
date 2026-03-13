package io.sentry.android.replay;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayState;", "", "(Ljava/lang/String;I)V", "INITIAL", "STARTED", "RESUMED", "PAUSED", "STOPPED", "CLOSED", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayState {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ ReplayState[] $VALUES;
    public static final ReplayState INITIAL = new ReplayState("INITIAL", 0);
    public static final ReplayState STARTED = new ReplayState("STARTED", 1);
    public static final ReplayState RESUMED = new ReplayState("RESUMED", 2);
    public static final ReplayState PAUSED = new ReplayState("PAUSED", 3);
    public static final ReplayState STOPPED = new ReplayState("STOPPED", 4);
    public static final ReplayState CLOSED = new ReplayState("CLOSED", 5);

    private static final /* synthetic */ ReplayState[] $values() {
        return new ReplayState[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        ReplayState[] replayStateArr$values = $values();
        $VALUES = replayStateArr$values;
        $ENTRIES = AbstractC5277b.a(replayStateArr$values);
    }

    private ReplayState(String str, int i10) {
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static ReplayState valueOf(String str) {
        return (ReplayState) Enum.valueOf(ReplayState.class, str);
    }

    public static ReplayState[] values() {
        return (ReplayState[]) $VALUES.clone();
    }
}
