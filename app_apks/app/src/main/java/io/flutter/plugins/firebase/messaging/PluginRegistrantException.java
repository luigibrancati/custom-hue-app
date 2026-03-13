package io.flutter.plugins.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PluginRegistrantException extends RuntimeException {
    public PluginRegistrantException() {
        super("PluginRegistrantCallback is not set. Did you forget to call FlutterFirebaseMessagingBackgroundService.setPluginRegistrant? See the documentation for instructions.");
    }
}
