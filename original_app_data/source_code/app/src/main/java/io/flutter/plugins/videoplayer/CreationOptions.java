package io.flutter.plugins.videoplayer;

import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lio/flutter/plugins/videoplayer/CreationOptions;", "", "uri", "", "formatHint", "Lio/flutter/plugins/videoplayer/PlatformVideoFormat;", "httpHeaders", "", "userAgent", "<init>", "(Ljava/lang/String;Lio/flutter/plugins/videoplayer/PlatformVideoFormat;Ljava/util/Map;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getFormatHint", "()Lio/flutter/plugins/videoplayer/PlatformVideoFormat;", "getHttpHeaders", "()Ljava/util/Map;", "getUserAgent", "toList", "", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreationOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlatformVideoFormat formatHint;
    private final Map<String, String> httpHeaders;
    private final String uri;
    private final String userAgent;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/videoplayer/CreationOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/videoplayer/CreationOptions;", "pigeonVar_list", "", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final CreationOptions fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
            PlatformVideoFormat platformVideoFormat = (PlatformVideoFormat) pigeonVar_list.get(1);
            Object obj2 = pigeonVar_list.get(2);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            return new CreationOptions((String) obj, platformVideoFormat, (Map) obj2, (String) pigeonVar_list.get(3));
        }

        private Companion() {
        }
    }

    public CreationOptions(String uri, PlatformVideoFormat platformVideoFormat, Map<String, String> httpHeaders, String str) {
        AbstractC4862t.e(uri, "uri");
        AbstractC4862t.e(httpHeaders, "httpHeaders");
        this.uri = uri;
        this.formatHint = platformVideoFormat;
        this.httpHeaders = httpHeaders;
        this.userAgent = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreationOptions copy$default(CreationOptions creationOptions, String str, PlatformVideoFormat platformVideoFormat, Map map, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = creationOptions.uri;
        }
        if ((i10 & 2) != 0) {
            platformVideoFormat = creationOptions.formatHint;
        }
        if ((i10 & 4) != 0) {
            map = creationOptions.httpHeaders;
        }
        if ((i10 & 8) != 0) {
            str2 = creationOptions.userAgent;
        }
        return creationOptions.copy(str, platformVideoFormat, map, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PlatformVideoFormat getFormatHint() {
        return this.formatHint;
    }

    public final Map<String, String> component3() {
        return this.httpHeaders;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    public final CreationOptions copy(String uri, PlatformVideoFormat formatHint, Map<String, String> httpHeaders, String userAgent) {
        AbstractC4862t.e(uri, "uri");
        AbstractC4862t.e(httpHeaders, "httpHeaders");
        return new CreationOptions(uri, formatHint, httpHeaders, userAgent);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CreationOptions)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((CreationOptions) other).toList());
    }

    public final PlatformVideoFormat getFormatHint() {
        return this.formatHint;
    }

    public final Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return C4206t.n(this.uri, this.formatHint, this.httpHeaders, this.userAgent);
    }

    public String toString() {
        return "CreationOptions(uri=" + this.uri + ", formatHint=" + this.formatHint + ", httpHeaders=" + this.httpHeaders + ", userAgent=" + this.userAgent + ")";
    }

    public /* synthetic */ CreationOptions(String str, PlatformVideoFormat platformVideoFormat, Map map, String str2, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? null : platformVideoFormat, map, (i10 & 8) != 0 ? null : str2);
    }
}
