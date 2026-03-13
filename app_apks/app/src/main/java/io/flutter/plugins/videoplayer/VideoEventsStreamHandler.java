package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/flutter/plugins/videoplayer/VideoEventsStreamHandler;", "Lio/flutter/plugins/videoplayer/MessagesPigeonEventChannelWrapper;", "Lio/flutter/plugins/videoplayer/PlatformVideoEvent;", "<init>", "()V", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VideoEventsStreamHandler implements MessagesPigeonEventChannelWrapper<PlatformVideoEvent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/flutter/plugins/videoplayer/VideoEventsStreamHandler$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Lio/flutter/plugins/videoplayer/VideoEventsStreamHandler;", "streamHandler", "", "instanceName", "Lfc/H;", "register", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/videoplayer/VideoEventsStreamHandler;Ljava/lang/String;)V", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ void register$default(Companion companion, BinaryMessenger binaryMessenger, VideoEventsStreamHandler videoEventsStreamHandler, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = "";
            }
            companion.register(binaryMessenger, videoEventsStreamHandler, str);
        }

        public final void register(BinaryMessenger messenger, VideoEventsStreamHandler streamHandler, String instanceName) {
            AbstractC4862t.e(messenger, "messenger");
            AbstractC4862t.e(streamHandler, "streamHandler");
            AbstractC4862t.e(instanceName, "instanceName");
            String str = "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents";
            if (instanceName.length() > 0) {
                str = "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents." + instanceName;
            }
            new EventChannel(messenger, str, MessagesKt.getMessagesPigeonMethodCodec()).setStreamHandler(new MessagesPigeonStreamHandler(streamHandler));
        }

        private Companion() {
        }
    }

    @Override // io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
    public void onCancel(Object obj) {
        super.onCancel(obj);
    }

    @Override // io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
    public void onListen(Object obj, PigeonEventSink<PlatformVideoEvent> pigeonEventSink) {
        super.onListen(obj, pigeonEventSink);
    }
}
