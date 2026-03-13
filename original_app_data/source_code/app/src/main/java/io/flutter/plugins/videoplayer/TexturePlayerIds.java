package io.flutter.plugins.videoplayer;

import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0017"}, d2 = {"Lio/flutter/plugins/videoplayer/TexturePlayerIds;", "", "playerId", "", "textureId", "<init>", "(JJ)V", "getPlayerId", "()J", "getTextureId", "toList", "", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TexturePlayerIds {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long playerId;
    private final long textureId;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/videoplayer/TexturePlayerIds$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/videoplayer/TexturePlayerIds;", "pigeonVar_list", "", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final TexturePlayerIds fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            return new TexturePlayerIds(jLongValue, ((Long) obj2).longValue());
        }

        private Companion() {
        }
    }

    public TexturePlayerIds(long j10, long j11) {
        this.playerId = j10;
        this.textureId = j11;
    }

    public static /* synthetic */ TexturePlayerIds copy$default(TexturePlayerIds texturePlayerIds, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = texturePlayerIds.playerId;
        }
        if ((i10 & 2) != 0) {
            j11 = texturePlayerIds.textureId;
        }
        return texturePlayerIds.copy(j10, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTextureId() {
        return this.textureId;
    }

    public final TexturePlayerIds copy(long playerId, long textureId) {
        return new TexturePlayerIds(playerId, textureId);
    }

    public boolean equals(Object other) {
        if (!(other instanceof TexturePlayerIds)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((TexturePlayerIds) other).toList());
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public final long getTextureId() {
        return this.textureId;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return C4206t.n(Long.valueOf(this.playerId), Long.valueOf(this.textureId));
    }

    public String toString() {
        return "TexturePlayerIds(playerId=" + this.playerId + ", textureId=" + this.textureId + ")";
    }
}
