package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class HttpAuthHandlerProxyApi extends PigeonApiHttpAuthHandler {
    public HttpAuthHandlerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler
    public void cancel(HttpAuthHandler httpAuthHandler) {
        httpAuthHandler.cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler
    public void proceed(HttpAuthHandler httpAuthHandler, String str, String str2) {
        httpAuthHandler.proceed(str, str2);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler
    public boolean useHttpAuthUsernamePassword(HttpAuthHandler httpAuthHandler) {
        return httpAuthHandler.useHttpAuthUsernamePassword();
    }
}
