package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import w3.AbstractC6120b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebSettingsCompatProxyApi extends PigeonApiWebSettingsCompat {
    public WebSettingsCompatProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat
    @SuppressLint({"RequiresFeature"})
    public void setPaymentRequestEnabled(WebSettings webSettings, boolean z10) {
        AbstractC6120b.d(webSettings, z10);
    }
}
