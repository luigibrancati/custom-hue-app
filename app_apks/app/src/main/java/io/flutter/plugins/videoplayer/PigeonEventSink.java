package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.EventChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/flutter/plugins/videoplayer/PigeonEventSink;", "T", "", "Lio/flutter/plugin/common/EventChannel$EventSink;", "sink", "<init>", "(Lio/flutter/plugin/common/EventChannel$EventSink;)V", "value", "Lfc/H;", "success", "(Ljava/lang/Object;)V", "", "errorCode", "errorMessage", "errorDetails", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "endOfStream", "()V", "Lio/flutter/plugin/common/EventChannel$EventSink;", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PigeonEventSink<T> {
    private final EventChannel.EventSink sink;

    public PigeonEventSink(EventChannel.EventSink sink) {
        AbstractC4862t.e(sink, "sink");
        this.sink = sink;
    }

    public final void endOfStream() {
        this.sink.endOfStream();
    }

    public final void error(String errorCode, String errorMessage, Object errorDetails) {
        AbstractC4862t.e(errorCode, "errorCode");
        this.sink.error(errorCode, errorMessage, errorDetails);
    }

    public final void success(T value) {
        this.sink.success(value);
    }
}
