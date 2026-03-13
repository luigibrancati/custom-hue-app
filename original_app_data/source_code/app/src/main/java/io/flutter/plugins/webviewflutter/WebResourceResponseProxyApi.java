package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceResponse;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebResourceResponseProxyApi extends PigeonApiWebResourceResponse {
    public WebResourceResponseProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceResponse
    public long statusCode(WebResourceResponse webResourceResponse) {
        return webResourceResponse.getStatusCode();
    }
}
