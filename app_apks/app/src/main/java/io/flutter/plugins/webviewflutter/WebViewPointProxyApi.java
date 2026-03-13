package io.flutter.plugins.webviewflutter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewPointProxyApi extends PigeonApiWebViewPoint {
    public WebViewPointProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewPoint
    public long x(WebViewPoint webViewPoint) {
        return webViewPoint.getX();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewPoint
    public long y(WebViewPoint webViewPoint) {
        return webViewPoint.getY();
    }
}
