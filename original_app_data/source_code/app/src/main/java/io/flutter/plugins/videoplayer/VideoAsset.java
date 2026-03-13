package io.flutter.plugins.videoplayer;

import a2.InterfaceC2611D;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoAsset {
    protected final String assetUrl;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StreamingFormat {
        UNKNOWN,
        SMOOTH,
        DYNAMIC_ADAPTIVE,
        HTTP_LIVE
    }

    public VideoAsset(String str) {
        this.assetUrl = str;
    }

    public static VideoAsset fromAssetUrl(String str) {
        if (str.startsWith("asset:///")) {
            return new LocalVideoAsset(str);
        }
        throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
    }

    public static VideoAsset fromRemoteUrl(String str, StreamingFormat streamingFormat, Map<String, String> map, String str2) {
        return new HttpVideoAsset(str, streamingFormat, new HashMap(map), str2);
    }

    public static VideoAsset fromRtspUrl(String str) {
        if (str.startsWith("rtsp://")) {
            return new RtspVideoAsset(str);
        }
        throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
    }

    public abstract D1.r getMediaItem();

    public abstract InterfaceC2611D.a getMediaSourceFactory(Context context);
}
