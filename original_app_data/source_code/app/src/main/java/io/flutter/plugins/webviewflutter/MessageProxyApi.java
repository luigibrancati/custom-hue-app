package io.flutter.plugins.webviewflutter;

import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MessageProxyApi extends PigeonApiAndroidMessage {
    public MessageProxyApi(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        super(androidWebkitLibraryPigeonProxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage
    public void sendToTarget(Message message) {
        message.sendToTarget();
    }
}
