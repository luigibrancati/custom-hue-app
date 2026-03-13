package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebStorageProxyApi extends PigeonApiWebStorage {
    public WebStorageProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebStorage
    public void deleteAllData(WebStorage webStorage) {
        webStorage.deleteAllData();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebStorage
    public WebStorage instance() {
        return WebStorage.getInstance();
    }
}
