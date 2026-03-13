package io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CookieManagerProxyApi extends PigeonApiCookieManager {
    public CookieManagerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public CookieManager instance() {
        return CookieManager.getInstance();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public void removeAllCookies(CookieManager cookieManager, final vc.l lVar) {
        cookieManager.removeAllCookies(new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.K
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ResultCompat.success((Boolean) obj, lVar);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public void setAcceptThirdPartyCookies(CookieManager cookieManager, WebView webView, boolean z10) {
        cookieManager.setAcceptThirdPartyCookies(webView, z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public void setCookie(CookieManager cookieManager, String str, String str2) {
        cookieManager.setCookie(str, str2);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
