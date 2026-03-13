package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CustomViewCallbackProxyApi extends PigeonApiCustomViewCallback {
    public CustomViewCallbackProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback
    public void onCustomViewHidden(WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
