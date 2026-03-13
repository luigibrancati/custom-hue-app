package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import w3.AbstractC6119a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebResourceErrorCompatProxyApi extends PigeonApiWebResourceErrorCompat {
    public WebResourceErrorCompatProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceErrorCompat
    @SuppressLint({"RequiresFeature"})
    public String description(AbstractC6119a abstractC6119a) {
        return abstractC6119a.a().toString();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceErrorCompat
    @SuppressLint({"RequiresFeature"})
    public long errorCode(AbstractC6119a abstractC6119a) {
        return abstractC6119a.b();
    }
}
