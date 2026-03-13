package io.flutter.plugins.webviewflutter;

import android.webkit.SslErrorHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class SslErrorHandlerProxyApi extends PigeonApiSslErrorHandler {
    public SslErrorHandlerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler
    public void cancel(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler
    public void proceed(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.proceed();
    }
}
