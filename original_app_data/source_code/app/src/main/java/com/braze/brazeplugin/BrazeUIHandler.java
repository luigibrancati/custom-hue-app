package com.braze.brazeplugin;

import fc.AbstractC4040w;
import gc.Q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/braze/brazeplugin/BrazeUIHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "Lfc/H;", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "", "height", "", "identifier", "sendResizeEvent", "(DLjava/lang/String;)V", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "braze_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazeUIHandler implements EventChannel.StreamHandler {
    private EventChannel.EventSink eventSink;

    public BrazeUIHandler(BinaryMessenger binaryMessenger) {
        AbstractC4862t.e(binaryMessenger, "binaryMessenger");
        new EventChannel(binaryMessenger, "braze_banner_view_channel").setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object arguments) {
        this.eventSink = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arguments, EventChannel.EventSink events) {
        AbstractC4862t.e(events, "events");
        this.eventSink = events;
    }

    public final void sendResizeEvent(double height, String identifier) {
        AbstractC4862t.e(identifier, "identifier");
        Map mapL = Q.l(AbstractC4040w.a("height", Double.valueOf(height)), AbstractC4040w.a("containerId", identifier));
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.success(mapL);
        }
    }
}
