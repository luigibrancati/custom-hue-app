package io.flutter.plugins.videoplayer.texture;

import D1.r;
import K1.InterfaceC1032y;
import android.content.Context;
import android.view.Surface;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.ExoPlayerUtils;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.view.TextureRegistry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureVideoPlayer extends VideoPlayer implements TextureRegistry.SurfaceProducer.Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean needsSurface;

    public TextureVideoPlayer(VideoPlayerCallbacks videoPlayerCallbacks, TextureRegistry.SurfaceProducer surfaceProducer, r rVar, VideoPlayerOptions videoPlayerOptions, VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, rVar, videoPlayerOptions, surfaceProducer, exoPlayerProvider);
        this.needsSurface = true;
        surfaceProducer.setCallback(this);
        Surface surface = surfaceProducer.getSurface();
        this.exoPlayer.f0(surface);
        this.needsSurface = surface == null;
    }

    public static TextureVideoPlayer create(final Context context, VideoPlayerCallbacks videoPlayerCallbacks, TextureRegistry.SurfaceProducer surfaceProducer, final VideoAsset videoAsset, VideoPlayerOptions videoPlayerOptions) {
        return new TextureVideoPlayer(videoPlayerCallbacks, surfaceProducer, videoAsset.getMediaItem(), videoPlayerOptions, new VideoPlayer.ExoPlayerProvider() { // from class: io.flutter.plugins.videoplayer.texture.a
            @Override // io.flutter.plugins.videoplayer.VideoPlayer.ExoPlayerProvider
            public final InterfaceC1032y get() {
                Context context2 = context;
                return new InterfaceC1032y.b(context2).i(ExoPlayerUtils.createRenderersFactoryWithFallback(context2)).h(videoAsset.getMediaSourceFactory(context2)).g();
            }
        });
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public ExoPlayerEventListener createExoPlayerEventListener(InterfaceC1032y interfaceC1032y, TextureRegistry.SurfaceProducer surfaceProducer) {
        if (surfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new TextureExoPlayerEventListener(interfaceC1032y, this.videoPlayerEvents, surfaceProducer.handlesCropAndRotation());
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public void dispose() {
        super.dispose();
        this.surfaceProducer.release();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
        if (this.needsSurface) {
            this.exoPlayer.f0(this.surfaceProducer.getSurface());
            this.needsSurface = false;
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
        this.exoPlayer.f0(null);
        this.needsSurface = true;
    }
}
