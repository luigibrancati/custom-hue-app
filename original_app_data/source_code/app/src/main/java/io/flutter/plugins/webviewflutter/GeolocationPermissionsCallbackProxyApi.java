package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class GeolocationPermissionsCallbackProxyApi extends PigeonApiGeolocationPermissionsCallback {
    public GeolocationPermissionsCallbackProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback
    public void invoke(GeolocationPermissions.Callback callback, String str, boolean z10, boolean z11) {
        callback.invoke(str, z10, z11);
    }
}
