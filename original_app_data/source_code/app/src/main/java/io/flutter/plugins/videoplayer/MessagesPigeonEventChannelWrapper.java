package io.flutter.plugins.videoplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J'\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/flutter/plugins/videoplayer/MessagesPigeonEventChannelWrapper;", "T", "", "p0", "Lio/flutter/plugins/videoplayer/PigeonEventSink;", "sink", "Lfc/H;", "onListen", "(Ljava/lang/Object;Lio/flutter/plugins/videoplayer/PigeonEventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MessagesPigeonEventChannelWrapper<T> {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> void onCancel(MessagesPigeonEventChannelWrapper<T> messagesPigeonEventChannelWrapper, Object obj) {
            MessagesPigeonEventChannelWrapper.super.onCancel(obj);
        }

        @Deprecated
        public static <T> void onListen(MessagesPigeonEventChannelWrapper<T> messagesPigeonEventChannelWrapper, Object obj, PigeonEventSink<T> sink) {
            AbstractC4862t.e(sink, "sink");
            MessagesPigeonEventChannelWrapper.super.onListen(obj, sink);
        }
    }

    default void onListen(Object p02, PigeonEventSink<T> sink) {
        AbstractC4862t.e(sink, "sink");
    }

    default void onCancel(Object p02) {
    }
}
