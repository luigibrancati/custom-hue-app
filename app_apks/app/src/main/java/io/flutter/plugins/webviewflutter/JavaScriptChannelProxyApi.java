package io.flutter.plugins.webviewflutter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class JavaScriptChannelProxyApi extends PigeonApiJavaScriptChannel {
    public JavaScriptChannelProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel
    public JavaScriptChannel pigeon_defaultConstructor(String str) {
        return new JavaScriptChannel(str, this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
