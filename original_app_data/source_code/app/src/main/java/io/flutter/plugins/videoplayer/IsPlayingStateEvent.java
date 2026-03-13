package io.flutter.plugins.videoplayer;

import gc.C4205s;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/videoplayer/IsPlayingStateEvent;", "Lio/flutter/plugins/videoplayer/PlatformVideoEvent;", "isPlaying", "", "<init>", "(Z)V", "()Z", "toList", "", "", "equals", Request.JsonKeys.OTHER, "hashCode", "", "component1", "copy", "toString", "", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IsPlayingStateEvent extends PlatformVideoEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isPlaying;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/videoplayer/IsPlayingStateEvent$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/videoplayer/IsPlayingStateEvent;", "pigeonVar_list", "", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final IsPlayingStateEvent fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new IsPlayingStateEvent(((Boolean) obj).booleanValue());
        }

        private Companion() {
        }
    }

    public IsPlayingStateEvent(boolean z10) {
        super(null);
        this.isPlaying = z10;
    }

    public static /* synthetic */ IsPlayingStateEvent copy$default(IsPlayingStateEvent isPlayingStateEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = isPlayingStateEvent.isPlaying;
        }
        return isPlayingStateEvent.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final IsPlayingStateEvent copy(boolean isPlaying) {
        return new IsPlayingStateEvent(isPlaying);
    }

    public boolean equals(Object other) {
        if (!(other instanceof IsPlayingStateEvent)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((IsPlayingStateEvent) other).toList());
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final List<Object> toList() {
        return C4205s.d(Boolean.valueOf(this.isPlaying));
    }

    public String toString() {
        return "IsPlayingStateEvent(isPlaying=" + this.isPlaying + ")";
    }
}
