package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugins.videoplayer.AndroidVideoPlayerApi;
import io.flutter.plugins.videoplayer.PlatformVideoViewCreationParams;
import io.flutter.plugins.videoplayer.VideoPlayer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformVideoViewFactory extends PlatformViewFactory {
    private final VideoPlayerProvider videoPlayerProvider;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @FunctionalInterface
    public interface VideoPlayerProvider {
        VideoPlayer getVideoPlayer(Long l10);
    }

    public PlatformVideoViewFactory(VideoPlayerProvider videoPlayerProvider) {
        super(AndroidVideoPlayerApi.INSTANCE.getCodec());
        this.videoPlayerProvider = videoPlayerProvider;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        PlatformVideoViewCreationParams platformVideoViewCreationParams = (PlatformVideoViewCreationParams) obj;
        Objects.requireNonNull(platformVideoViewCreationParams);
        return new PlatformVideoView(context, this.videoPlayerProvider.getVideoPlayer(Long.valueOf(platformVideoViewCreationParams.getPlayerId())).getExoPlayer());
    }
}
