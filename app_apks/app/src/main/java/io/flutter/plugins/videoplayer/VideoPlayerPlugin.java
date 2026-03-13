package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.util.LongSparseArray;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory;
import io.flutter.plugins.videoplayer.platformview.PlatformViewVideoPlayer;
import io.flutter.plugins.videoplayer.texture.TextureVideoPlayer;
import io.flutter.view.TextureRegistry;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class VideoPlayerPlugin implements FlutterPlugin, AndroidVideoPlayerApi {
    private static final String TAG = "VideoPlayerPlugin";
    private FlutterState flutterState;
    private final LongSparseArray<VideoPlayer> videoPlayers = new LongSparseArray<>();
    private final VideoPlayerOptions sharedOptions = new VideoPlayerOptions();
    private long nextPlayerIdentifier = 1;

    /* JADX INFO: renamed from: io.flutter.plugins.videoplayer.VideoPlayerPlugin$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat;

        static {
            int[] iArr = new int[PlatformVideoFormat.values().length];
            $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat = iArr;
            try {
                iArr[PlatformVideoFormat.SS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat[PlatformVideoFormat.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat[PlatformVideoFormat.HLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class FlutterState {
        final Context applicationContext;
        final BinaryMessenger binaryMessenger;
        final KeyForAssetFn keyForAsset;
        final KeyForAssetAndPackageName keyForAssetAndPackageName;
        final TextureRegistry textureRegistry;

        public FlutterState(Context context, BinaryMessenger binaryMessenger, KeyForAssetFn keyForAssetFn, KeyForAssetAndPackageName keyForAssetAndPackageName, TextureRegistry textureRegistry) {
            this.applicationContext = context;
            this.binaryMessenger = binaryMessenger;
            this.keyForAsset = keyForAssetFn;
            this.keyForAssetAndPackageName = keyForAssetAndPackageName;
            this.textureRegistry = textureRegistry;
        }

        public void startListening(VideoPlayerPlugin videoPlayerPlugin, BinaryMessenger binaryMessenger) {
            AndroidVideoPlayerApi.INSTANCE.setUp(binaryMessenger, videoPlayerPlugin);
        }

        public void stopListening(BinaryMessenger binaryMessenger) {
            AndroidVideoPlayerApi.INSTANCE.setUp(binaryMessenger, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface KeyForAssetAndPackageName {
        String get(String str, String str2);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface KeyForAssetFn {
        String get(String str);
    }

    private void disposeAllPlayers() {
        for (int i10 = 0; i10 < this.videoPlayers.size(); i10++) {
            this.videoPlayers.valueAt(i10).dispose();
        }
        this.videoPlayers.clear();
    }

    private VideoPlayer getPlayer(long j10) {
        VideoPlayer videoPlayer = this.videoPlayers.get(j10);
        if (videoPlayer != null) {
            return videoPlayer;
        }
        String str = "No player found with playerId <" + j10 + ">";
        if (this.videoPlayers.size() == 0) {
            str = str + " and no active players created by the plugin.";
        }
        throw new IllegalStateException(str);
    }

    private void registerPlayerInstance(VideoPlayer videoPlayer, long j10) {
        final BinaryMessenger binaryMessenger = this.flutterState.binaryMessenger;
        final String string = Long.toString(j10);
        VideoPlayerInstanceApi.INSTANCE.setUp(binaryMessenger, videoPlayer, string);
        videoPlayer.setDisposeHandler(new VideoPlayer.DisposeHandler() { // from class: io.flutter.plugins.videoplayer.s
            @Override // io.flutter.plugins.videoplayer.VideoPlayer.DisposeHandler
            public final void onDispose() {
                VideoPlayerInstanceApi.INSTANCE.setUp(binaryMessenger, null, string);
            }
        });
        this.videoPlayers.put(j10, videoPlayer);
    }

    private VideoAsset videoAssetWithOptions(CreationOptions creationOptions) {
        String uri = creationOptions.getUri();
        if (uri.startsWith("asset:")) {
            return VideoAsset.fromAssetUrl(uri);
        }
        if (uri.startsWith("rtsp:")) {
            return VideoAsset.fromRtspUrl(uri);
        }
        VideoAsset.StreamingFormat streamingFormat = VideoAsset.StreamingFormat.UNKNOWN;
        PlatformVideoFormat formatHint = creationOptions.getFormatHint();
        if (formatHint != null) {
            int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat[formatHint.ordinal()];
            if (i10 == 1) {
                streamingFormat = VideoAsset.StreamingFormat.SMOOTH;
            } else if (i10 == 2) {
                streamingFormat = VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE;
            } else if (i10 == 3) {
                streamingFormat = VideoAsset.StreamingFormat.HTTP_LIVE;
            }
        }
        return VideoAsset.fromRemoteUrl(uri, streamingFormat, creationOptions.getHttpHeaders(), creationOptions.getUserAgent());
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public long createForPlatformView(CreationOptions creationOptions) {
        VideoAsset videoAssetVideoAssetWithOptions = videoAssetWithOptions(creationOptions);
        long j10 = this.nextPlayerIdentifier;
        this.nextPlayerIdentifier = 1 + j10;
        String string = Long.toString(j10);
        FlutterState flutterState = this.flutterState;
        registerPlayerInstance(PlatformViewVideoPlayer.create(flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(flutterState.binaryMessenger, string), videoAssetVideoAssetWithOptions, this.sharedOptions), j10);
        return j10;
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public TexturePlayerIds createForTextureView(CreationOptions creationOptions) {
        VideoAsset videoAssetVideoAssetWithOptions = videoAssetWithOptions(creationOptions);
        long j10 = this.nextPlayerIdentifier;
        this.nextPlayerIdentifier = 1 + j10;
        String string = Long.toString(j10);
        TextureRegistry.SurfaceProducer surfaceProducerCreateSurfaceProducer = this.flutterState.textureRegistry.createSurfaceProducer();
        FlutterState flutterState = this.flutterState;
        registerPlayerInstance(TextureVideoPlayer.create(flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(flutterState.binaryMessenger, string), surfaceProducerCreateSurfaceProducer, videoAssetVideoAssetWithOptions, this.sharedOptions), j10);
        return new TexturePlayerIds(j10, surfaceProducerCreateSurfaceProducer.id());
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public void dispose(long j10) {
        getPlayer(j10).dispose();
        this.videoPlayers.remove(j10);
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public String getLookupKeyForAsset(String str, String str2) {
        return str2 == null ? this.flutterState.keyForAsset.get(str) : this.flutterState.keyForAssetAndPackageName.get(str, str2);
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public void initialize() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterInjector flutterInjectorInstance = FlutterInjector.instance();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        final FlutterLoader flutterLoader = flutterInjectorInstance.flutterLoader();
        Objects.requireNonNull(flutterLoader);
        KeyForAssetFn keyForAssetFn = new KeyForAssetFn() { // from class: io.flutter.plugins.videoplayer.t
            @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetFn
            public final String get(String str) {
                return flutterLoader.getLookupKeyForAsset(str);
            }
        };
        final FlutterLoader flutterLoader2 = flutterInjectorInstance.flutterLoader();
        Objects.requireNonNull(flutterLoader2);
        FlutterState flutterState = new FlutterState(applicationContext, binaryMessenger, keyForAssetFn, new KeyForAssetAndPackageName() { // from class: io.flutter.plugins.videoplayer.u
            @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetAndPackageName
            public final String get(String str, String str2) {
                return flutterLoader2.getLookupKeyForAsset(str, str2);
            }
        }, flutterPluginBinding.getTextureRegistry());
        this.flutterState = flutterState;
        flutterState.startListening(this, flutterPluginBinding.getBinaryMessenger());
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        final LongSparseArray<VideoPlayer> longSparseArray = this.videoPlayers;
        Objects.requireNonNull(longSparseArray);
        platformViewRegistry.registerViewFactory("plugins.flutter.dev/video_player_android", new PlatformVideoViewFactory(new PlatformVideoViewFactory.VideoPlayerProvider() { // from class: io.flutter.plugins.videoplayer.v
            @Override // io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory.VideoPlayerProvider
            public final VideoPlayer getVideoPlayer(Long l10) {
                return (VideoPlayer) longSparseArray.get(l10.longValue());
            }
        }));
    }

    public void onDestroy() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.flutterState == null) {
            Log.wtf(TAG, "Detached from the engine before registering to it.");
        }
        this.flutterState.stopListening(flutterPluginBinding.getBinaryMessenger());
        this.flutterState = null;
        onDestroy();
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public void setMixWithOthers(boolean z10) {
        this.sharedOptions.mixWithOthers = z10;
    }
}
