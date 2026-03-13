package com.cloudwebrtc.webrtc.utils;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class AnyThreadResult implements MethodChannel.Result {
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final MethodChannel.Result result;

    public AnyThreadResult(MethodChannel.Result result) {
        this.result = result;
    }

    private void post(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(final String str, final String str2, final Object obj) {
        post(new Runnable() { // from class: com.cloudwebrtc.webrtc.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f28839a.result.error(str, str2, obj);
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        MethodChannel.Result result = this.result;
        Objects.requireNonNull(result);
        post(new a(result));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(final Object obj) {
        post(new Runnable() { // from class: com.cloudwebrtc.webrtc.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f28837a.result.success(obj);
            }
        });
    }
}
