package io.flutter.plugins.videoplayer;

import D1.r;
import a2.InterfaceC2611D;
import android.content.Context;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class RtspVideoAsset extends VideoAsset {
    public RtspVideoAsset(String str) {
        super(str);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public D1.r getMediaItem() {
        return new r.c().h(this.assetUrl).a();
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public InterfaceC2611D.a getMediaSourceFactory(Context context) {
        return new RtspMediaSource.Factory();
    }
}
