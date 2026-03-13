package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.EventChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/flutter/plugins/videoplayer/MessagesPigeonStreamHandler;", "T", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lio/flutter/plugins/videoplayer/MessagesPigeonEventChannelWrapper;", "wrapper", "<init>", "(Lio/flutter/plugins/videoplayer/MessagesPigeonEventChannelWrapper;)V", "", "p0", "Lio/flutter/plugin/common/EventChannel$EventSink;", "sink", "Lfc/H;", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "Lio/flutter/plugins/videoplayer/MessagesPigeonEventChannelWrapper;", "getWrapper", "()Lio/flutter/plugins/videoplayer/MessagesPigeonEventChannelWrapper;", "Lio/flutter/plugins/videoplayer/PigeonEventSink;", "pigeonSink", "Lio/flutter/plugins/videoplayer/PigeonEventSink;", "getPigeonSink", "()Lio/flutter/plugins/videoplayer/PigeonEventSink;", "setPigeonSink", "(Lio/flutter/plugins/videoplayer/PigeonEventSink;)V", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class MessagesPigeonStreamHandler<T> implements EventChannel.StreamHandler {
    private PigeonEventSink<T> pigeonSink;
    private final MessagesPigeonEventChannelWrapper<T> wrapper;

    public MessagesPigeonStreamHandler(MessagesPigeonEventChannelWrapper<T> wrapper) {
        AbstractC4862t.e(wrapper, "wrapper");
        this.wrapper = wrapper;
    }

    public final PigeonEventSink<T> getPigeonSink() {
        return this.pigeonSink;
    }

    public final MessagesPigeonEventChannelWrapper<T> getWrapper() {
        return this.wrapper;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object p02) {
        this.pigeonSink = null;
        this.wrapper.onCancel(p02);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object p02, EventChannel.EventSink sink) {
        AbstractC4862t.e(sink, "sink");
        PigeonEventSink<T> pigeonEventSink = new PigeonEventSink<>(sink);
        this.pigeonSink = pigeonEventSink;
        MessagesPigeonEventChannelWrapper<T> messagesPigeonEventChannelWrapper = this.wrapper;
        AbstractC4862t.b(pigeonEventSink);
        messagesPigeonEventChannelWrapper.onListen(p02, pigeonEventSink);
    }

    public final void setPigeonSink(PigeonEventSink<T> pigeonEventSink) {
        this.pigeonSink = pigeonEventSink;
    }
}
