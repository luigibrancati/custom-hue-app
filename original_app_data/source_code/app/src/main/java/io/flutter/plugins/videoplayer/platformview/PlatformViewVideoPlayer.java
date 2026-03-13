package io.flutter.plugins.videoplayer.platformview;

import D1.r;
import K1.InterfaceC1032y;
import android.content.Context;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.ExoPlayerUtils;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.view.TextureRegistry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewVideoPlayer extends VideoPlayer {
    public PlatformViewVideoPlayer(VideoPlayerCallbacks videoPlayerCallbacks, r rVar, VideoPlayerOptions videoPlayerOptions, VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, rVar, videoPlayerOptions, null, exoPlayerProvider);
    }

    public static PlatformViewVideoPlayer create(final Context context, VideoPlayerCallbacks videoPlayerCallbacks, final VideoAsset videoAsset, VideoPlayerOptions videoPlayerOptions) {
        return new PlatformViewVideoPlayer(videoPlayerCallbacks, videoAsset.getMediaItem(), videoPlayerOptions, new VideoPlayer.ExoPlayerProvider() { // from class: io.flutter.plugins.videoplayer.platformview.a
            @Override // io.flutter.plugins.videoplayer.VideoPlayer.ExoPlayerProvider
            public final InterfaceC1032y get() {
                Context context2 = context;
                return new InterfaceC1032y.b(context2).i(ExoPlayerUtils.createRenderersFactoryWithFallback(context2)).h(videoAsset.getMediaSourceFactory(context2)).g();
            }
        });
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public ExoPlayerEventListener createExoPlayerEventListener(InterfaceC1032y interfaceC1032y, TextureRegistry.SurfaceProducer surfaceProducer) {
        return new PlatformViewExoPlayerEventListener(interfaceC1032y, this.videoPlayerEvents);
    }
}
