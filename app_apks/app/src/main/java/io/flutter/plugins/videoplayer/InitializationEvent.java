package io.flutter.plugins.videoplayer;

import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001e"}, d2 = {"Lio/flutter/plugins/videoplayer/InitializationEvent;", "Lio/flutter/plugins/videoplayer/PlatformVideoEvent;", "duration", "", "width", "height", "rotationCorrection", "<init>", "(JJJJ)V", "getDuration", "()J", "getWidth", "getHeight", "getRotationCorrection", "toList", "", "", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializationEvent extends PlatformVideoEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long duration;
    private final long height;
    private final long rotationCorrection;
    private final long width;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/videoplayer/InitializationEvent$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/videoplayer/InitializationEvent;", "pigeonVar_list", "", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InitializationEvent fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue2 = ((Long) obj2).longValue();
            Object obj3 = pigeonVar_list.get(2);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue3 = ((Long) obj3).longValue();
            Object obj4 = pigeonVar_list.get(3);
            AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Long");
            return new InitializationEvent(jLongValue, jLongValue2, jLongValue3, ((Long) obj4).longValue());
        }

        private Companion() {
        }
    }

    public InitializationEvent(long j10, long j11, long j12, long j13) {
        super(null);
        this.duration = j10;
        this.width = j11;
        this.height = j12;
        this.rotationCorrection = j13;
    }

    public static /* synthetic */ InitializationEvent copy$default(InitializationEvent initializationEvent, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = initializationEvent.duration;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = initializationEvent.width;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = initializationEvent.height;
        }
        return initializationEvent.copy(j14, j15, j12, (i10 & 8) != 0 ? initializationEvent.rotationCorrection : j13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRotationCorrection() {
        return this.rotationCorrection;
    }

    public final InitializationEvent copy(long duration, long width, long height, long rotationCorrection) {
        return new InitializationEvent(duration, width, height, rotationCorrection);
    }

    public boolean equals(Object other) {
        if (!(other instanceof InitializationEvent)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((InitializationEvent) other).toList());
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getRotationCorrection() {
        return this.rotationCorrection;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return C4206t.n(Long.valueOf(this.duration), Long.valueOf(this.width), Long.valueOf(this.height), Long.valueOf(this.rotationCorrection));
    }

    public String toString() {
        return "InitializationEvent(duration=" + this.duration + ", width=" + this.width + ", height=" + this.height + ", rotationCorrection=" + this.rotationCorrection + ")";
    }
}
