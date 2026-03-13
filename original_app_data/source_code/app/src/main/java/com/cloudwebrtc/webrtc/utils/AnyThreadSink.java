package com.cloudwebrtc.webrtc.utils;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class AnyThreadSink implements EventChannel.EventSink {
    private final EventChannel.EventSink eventSink;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public AnyThreadSink(EventChannel.EventSink eventSink) {
        this.eventSink = eventSink;
    }

    private void post(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void endOfStream() {
        final EventChannel.EventSink eventSink = this.eventSink;
        Objects.requireNonNull(eventSink);
        post(new Runnable() { // from class: com.cloudwebrtc.webrtc.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                eventSink.endOfStream();
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void error(final String str, final String str2, final Object obj) {
        post(new Runnable() { // from class: com.cloudwebrtc.webrtc.utils.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f28846a.eventSink.error(str, str2, obj);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void success(final Object obj) {
        post(new Runnable() { // from class: com.cloudwebrtc.webrtc.utils.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f28844a.eventSink.success(obj);
            }
        });
    }
}
