package io.flutter.plugins.videoplayer;

import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4205s;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.videoplayer.VideoPlayerInstanceApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lio/flutter/plugins/videoplayer/VideoPlayerInstanceApi;", "", "", "looping", "Lfc/H;", "setLooping", "(Z)V", "", "volume", "setVolume", "(D)V", "speed", "setPlaybackSpeed", "play", "()V", "pause", "", "position", "seekTo", "(J)V", "getCurrentPosition", "()J", "getBufferedPosition", "", "strategy", "setSeekToStrategy", "(Ljava/lang/String;)V", "playerId", "getSeekToStrategy", "(J)Ljava/lang/String;", "Companion", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface VideoPlayerInstanceApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/videoplayer/VideoPlayerInstanceApi$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/videoplayer/VideoPlayerInstanceApi;", "api", "", "messageChannelSuffix", "Lfc/H;", "setUp", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/videoplayer/VideoPlayerInstanceApi;Ljava/lang/String;)V", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lfc/k;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final InterfaceC4028k codec = C4029l.b(new InterfaceC6082a() { // from class: io.flutter.plugins.videoplayer.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return VideoPlayerInstanceApi.Companion.codec_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, VideoPlayerInstanceApi videoPlayerInstanceApi, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, videoPlayerInstanceApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$lambda$9(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            try {
                videoPlayerInstanceApi.pause();
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$lambda$11(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                videoPlayerInstanceApi.seekTo(((Long) obj2).longValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$14$lambda$13(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            try {
                listWrapError = C4205s.d(Long.valueOf(videoPlayerInstanceApi.getCurrentPosition()));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$16$lambda$15(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            try {
                listWrapError = C4205s.d(Long.valueOf(videoPlayerInstanceApi.getBufferedPosition()));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$18$lambda$17(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            try {
                videoPlayerInstanceApi.setSeekToStrategy((String) obj2);
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$lambda$1(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                videoPlayerInstanceApi.setLooping(((Boolean) obj2).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$20$lambda$19(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                listWrapError = C4205s.d(videoPlayerInstanceApi.getSeekToStrategy(((Long) obj2).longValue()));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$lambda$3(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Double");
            try {
                videoPlayerInstanceApi.setVolume(((Double) obj2).doubleValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$lambda$5(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Double");
            try {
                videoPlayerInstanceApi.setPlaybackSpeed(((Double) obj2).doubleValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$lambda$7(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            try {
                videoPlayerInstanceApi.play();
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) codec.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, VideoPlayerInstanceApi videoPlayerInstanceApi) {
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, videoPlayerInstanceApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final VideoPlayerInstanceApi api, String messageChannelSuffix) {
            String str;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            AbstractC4862t.e(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping" + str, getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$2$lambda$1(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume" + str, getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$4$lambda$3(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed" + str, getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$6$lambda$5(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play" + str, getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$8$lambda$7(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause" + str, getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$10$lambda$9(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo" + str, getCodec());
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$12$lambda$11(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getCurrentPosition" + str, getCodec());
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$14$lambda$13(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getBufferedPosition" + str, getCodec());
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$16$lambda$15(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setSeekToStrategy" + str, getCodec());
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.r
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$18$lambda$17(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getSeekToStrategy" + str, getCodec());
            if (api != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        VideoPlayerInstanceApi.Companion.setUp$lambda$20$lambda$19(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
        }
    }

    long getBufferedPosition();

    long getCurrentPosition();

    String getSeekToStrategy(long playerId);

    void pause();

    void play();

    void seekTo(long position);

    void setLooping(boolean looping);

    void setPlaybackSpeed(double speed);

    void setSeekToStrategy(String strategy);

    void setVolume(double volume);
}
