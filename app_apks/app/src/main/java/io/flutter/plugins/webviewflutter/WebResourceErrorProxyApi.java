package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceError;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebResourceErrorProxyApi extends PigeonApiWebResourceError {
    public WebResourceErrorProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceError
    public String description(WebResourceError webResourceError) {
        return webResourceError.getDescription().toString();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceError
    public long errorCode(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
