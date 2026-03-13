package io.flutter.plugin.platform;

import android.content.Context;
import io.flutter.plugin.common.MessageCodec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    public PlatformViewFactory(MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    public abstract PlatformView create(Context context, int i10, Object obj);

    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
