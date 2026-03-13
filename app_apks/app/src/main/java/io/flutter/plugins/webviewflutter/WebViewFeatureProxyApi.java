package io.flutter.plugins.webviewflutter;

import w3.AbstractC6123e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewFeatureProxyApi extends PigeonApiWebViewFeature {
    public WebViewFeatureProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewFeature
    public boolean isFeatureSupported(String str) {
        return AbstractC6123e.a(str);
    }
}
