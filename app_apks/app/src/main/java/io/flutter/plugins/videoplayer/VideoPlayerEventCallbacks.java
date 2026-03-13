package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class VideoPlayerEventCallbacks implements VideoPlayerCallbacks {
    private final QueuingEventSink eventSink;

    private VideoPlayerEventCallbacks(QueuingEventSink queuingEventSink) {
        this.eventSink = queuingEventSink;
    }

    public static VideoPlayerEventCallbacks bindTo(BinaryMessenger binaryMessenger, String str) {
        final QueuingEventSink queuingEventSink = new QueuingEventSink();
        VideoEventsStreamHandler.INSTANCE.register(binaryMessenger, new VideoEventsStreamHandler() { // from class: io.flutter.plugins.videoplayer.VideoPlayerEventCallbacks.1
            @Override // io.flutter.plugins.videoplayer.VideoEventsStreamHandler, io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
            public void onCancel(Object obj) {
                queuingEventSink.setDelegate(null);
            }

            @Override // io.flutter.plugins.videoplayer.VideoEventsStreamHandler, io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
            public void onListen(Object obj, PigeonEventSink<PlatformVideoEvent> pigeonEventSink) {
                queuingEventSink.setDelegate(pigeonEventSink);
            }
        }, str);
        return withSink(queuingEventSink);
    }

    public static VideoPlayerEventCallbacks withSink(QueuingEventSink queuingEventSink) {
        return new VideoPlayerEventCallbacks(queuingEventSink);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onError(String str, String str2, Object obj) {
        this.eventSink.error(str, str2, obj);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onInitialized(int i10, int i11, long j10, int i12) {
        this.eventSink.success(new InitializationEvent(j10, i10, i11, i12));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onIsPlayingStateUpdate(boolean z10) {
        this.eventSink.success(new IsPlayingStateEvent(z10));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onPlaybackStateChanged(PlatformPlaybackState platformPlaybackState) {
        this.eventSink.success(new PlaybackStateChangeEvent(platformPlaybackState));
    }
}
