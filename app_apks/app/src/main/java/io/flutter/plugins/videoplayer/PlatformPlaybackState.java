package io.flutter.plugins.videoplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/videoplayer/PlatformPlaybackState;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "IDLE", "BUFFERING", "READY", "ENDED", "UNKNOWN", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformPlaybackState {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ PlatformPlaybackState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int raw;
    public static final PlatformPlaybackState IDLE = new PlatformPlaybackState("IDLE", 0, 0);
    public static final PlatformPlaybackState BUFFERING = new PlatformPlaybackState("BUFFERING", 1, 1);
    public static final PlatformPlaybackState READY = new PlatformPlaybackState("READY", 2, 2);
    public static final PlatformPlaybackState ENDED = new PlatformPlaybackState("ENDED", 3, 3);
    public static final PlatformPlaybackState UNKNOWN = new PlatformPlaybackState("UNKNOWN", 4, 4);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/videoplayer/PlatformPlaybackState$Companion;", "", "<init>", "()V", "ofRaw", "Lio/flutter/plugins/videoplayer/PlatformPlaybackState;", "raw", "", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final PlatformPlaybackState ofRaw(int raw) {
            for (PlatformPlaybackState platformPlaybackState : PlatformPlaybackState.values()) {
                if (platformPlaybackState.getRaw() == raw) {
                    return platformPlaybackState;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformPlaybackState[] $values() {
        return new PlatformPlaybackState[]{IDLE, BUFFERING, READY, ENDED, UNKNOWN};
    }

    static {
        PlatformPlaybackState[] platformPlaybackStateArr$values = $values();
        $VALUES = platformPlaybackStateArr$values;
        $ENTRIES = AbstractC5277b.a(platformPlaybackStateArr$values);
        INSTANCE = new Companion(null);
    }

    private PlatformPlaybackState(String str, int i10, int i11) {
        this.raw = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static PlatformPlaybackState valueOf(String str) {
        return (PlatformPlaybackState) Enum.valueOf(PlatformPlaybackState.class, str);
    }

    public static PlatformPlaybackState[] values() {
        return (PlatformPlaybackState[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
