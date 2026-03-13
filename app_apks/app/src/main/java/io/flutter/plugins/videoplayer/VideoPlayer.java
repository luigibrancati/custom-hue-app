package io.flutter.plugins.videoplayer;

import D1.C0744b;
import D1.y;
import K1.InterfaceC1032y;
import K1.k1;
import io.flutter.view.TextureRegistry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoPlayer implements VideoPlayerInstanceApi {
    private static final String SEEK_PARAMETERS_CLOSEST_SYNC = "closestSync";
    private static final String SEEK_PARAMETERS_EXACT = "exact";
    private static final String SEEK_PARAMETERS_NEXT_SYNC = "nextSync";
    private static final String SEEK_PARAMETERS_PREVIOUS_SYNC = "previousSync";
    private DisposeHandler disposeHandler;
    protected InterfaceC1032y exoPlayer;
    protected final TextureRegistry.SurfaceProducer surfaceProducer;
    protected final VideoPlayerCallbacks videoPlayerEvents;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DisposeHandler {
        void onDispose();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ExoPlayerProvider {
        InterfaceC1032y get();
    }

    public VideoPlayer(VideoPlayerCallbacks videoPlayerCallbacks, D1.r rVar, VideoPlayerOptions videoPlayerOptions, TextureRegistry.SurfaceProducer surfaceProducer, ExoPlayerProvider exoPlayerProvider) {
        this.videoPlayerEvents = videoPlayerCallbacks;
        this.surfaceProducer = surfaceProducer;
        InterfaceC1032y interfaceC1032y = exoPlayerProvider.get();
        this.exoPlayer = interfaceC1032y;
        interfaceC1032y.C0(rVar);
        this.exoPlayer.u();
        InterfaceC1032y interfaceC1032y2 = this.exoPlayer;
        interfaceC1032y2.l0(createExoPlayerEventListener(interfaceC1032y2, surfaceProducer));
        setAudioAttributes(this.exoPlayer, videoPlayerOptions.mixWithOthers);
    }

    private static void setAudioAttributes(InterfaceC1032y interfaceC1032y, boolean z10) {
        interfaceC1032y.o0(new C0744b.e().b(3).a(), !z10);
    }

    public abstract ExoPlayerEventListener createExoPlayerEventListener(InterfaceC1032y interfaceC1032y, TextureRegistry.SurfaceProducer surfaceProducer);

    public void dispose() {
        DisposeHandler disposeHandler = this.disposeHandler;
        if (disposeHandler != null) {
            disposeHandler.onDispose();
        }
        this.exoPlayer.release();
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public long getBufferedPosition() {
        return this.exoPlayer.getBufferedPosition();
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public long getCurrentPosition() {
        return this.exoPlayer.getCurrentPosition();
    }

    public InterfaceC1032y getExoPlayer() {
        return this.exoPlayer;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public String getSeekToStrategy(long j10) {
        k1 k1VarB = this.exoPlayer.b();
        return k1.f7216c.equals(k1VarB) ? SEEK_PARAMETERS_EXACT : k1.f7218e.equals(k1VarB) ? SEEK_PARAMETERS_PREVIOUS_SYNC : k1.f7219f.equals(k1VarB) ? SEEK_PARAMETERS_NEXT_SYNC : k1.f7217d.equals(k1VarB) ? SEEK_PARAMETERS_CLOSEST_SYNC : SEEK_PARAMETERS_EXACT;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void pause() {
        this.exoPlayer.pause();
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void play() {
        this.exoPlayer.play();
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void seekTo(long j10) {
        this.exoPlayer.seekTo(j10);
    }

    public void setDisposeHandler(DisposeHandler disposeHandler) {
        this.disposeHandler = disposeHandler;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setLooping(boolean z10) {
        this.exoPlayer.d0(z10 ? 2 : 0);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setPlaybackSpeed(double d10) {
        this.exoPlayer.d(new y((float) d10));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setSeekToStrategy(String str) {
        k1 k1Var;
        str.getClass();
        switch (str) {
            case "previousSync":
                k1Var = k1.f7218e;
                break;
            case "closestSync":
                k1Var = k1.f7217d;
                break;
            case "nextSync":
                k1Var = k1.f7219f;
                break;
            default:
                k1Var = k1.f7216c;
                break;
        }
        this.exoPlayer.c(k1Var);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setVolume(double d10) {
        this.exoPlayer.v((float) Math.max(0.0d, Math.min(1.0d, d10)));
    }
}
