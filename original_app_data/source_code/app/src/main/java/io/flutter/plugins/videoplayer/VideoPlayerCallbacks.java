package io.flutter.plugins.videoplayer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface VideoPlayerCallbacks {
    void onError(String str, String str2, Object obj);

    void onInitialized(int i10, int i11, long j10, int i12);

    void onIsPlayingStateUpdate(boolean z10);

    void onPlaybackStateChanged(PlatformPlaybackState platformPlaybackState);
}
