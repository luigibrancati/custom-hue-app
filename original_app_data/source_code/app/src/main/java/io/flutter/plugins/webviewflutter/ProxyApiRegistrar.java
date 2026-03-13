package io.flutter.plugins.webviewflutter;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ProxyApiRegistrar extends AndroidWebkitLibraryPigeonProxyApiRegistrar {
    private Context context;
    private final FlutterAssetManager flutterAssetManager;

    public ProxyApiRegistrar(BinaryMessenger binaryMessenger, Context context, FlutterAssetManager flutterAssetManager) {
        super(binaryMessenger);
        this.context = context;
        this.flutterAssetManager = flutterAssetManager;
    }

    public IllegalArgumentException createUnknownEnumException(Object obj) {
        return new IllegalArgumentException(obj + " doesn't represent a native value.");
    }

    public String createUnsupportedVersionMessage(String str, String str2) {
        return str + " requires " + str2 + ".";
    }

    public Context getContext() {
        return this.context;
    }

    public FlutterAssetManager getFlutterAssetManager() {
        return this.flutterAssetManager;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiAndroidMessage getPigeonApiAndroidMessage() {
        return new MessageProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiCertificate getPigeonApiCertificate() {
        return new CertificateProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiClientCertRequest getPigeonApiClientCertRequest() {
        return new ClientCertRequestProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiConsoleMessage getPigeonApiConsoleMessage() {
        return new ConsoleMessageProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiCookieManager getPigeonApiCookieManager() {
        return new CookieManagerProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiCustomViewCallback getPigeonApiCustomViewCallback() {
        return new CustomViewCallbackProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiDownloadListener getPigeonApiDownloadListener() {
        return new DownloadListenerProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiFileChooserParams getPigeonApiFileChooserParams() {
        return new FileChooserParamsProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiFlutterAssetManager getPigeonApiFlutterAssetManager() {
        return new FlutterAssetManagerProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiGeolocationPermissionsCallback getPigeonApiGeolocationPermissionsCallback() {
        return new GeolocationPermissionsCallbackProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiHttpAuthHandler getPigeonApiHttpAuthHandler() {
        return new HttpAuthHandlerProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiJavaScriptChannel getPigeonApiJavaScriptChannel() {
        return new JavaScriptChannelProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiPermissionRequest getPigeonApiPermissionRequest() {
        return new PermissionRequestProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiSslCertificate getPigeonApiSslCertificate() {
        return new SslCertificateProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiSslCertificateDName getPigeonApiSslCertificateDName() {
        return new SslCertificateDNameProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiSslError getPigeonApiSslError() {
        return new SslErrorProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiSslErrorHandler getPigeonApiSslErrorHandler() {
        return new SslErrorHandlerProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiView getPigeonApiView() {
        return new ViewProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebChromeClient getPigeonApiWebChromeClient() {
        return new WebChromeClientProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebResourceError getPigeonApiWebResourceError() {
        return new WebResourceErrorProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebResourceErrorCompat getPigeonApiWebResourceErrorCompat() {
        return new WebResourceErrorCompatProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebResourceRequest getPigeonApiWebResourceRequest() {
        return new WebResourceRequestProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebResourceResponse getPigeonApiWebResourceResponse() {
        return new WebResourceResponseProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebSettings getPigeonApiWebSettings() {
        return new WebSettingsProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebSettingsCompat getPigeonApiWebSettingsCompat() {
        return new WebSettingsCompatProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebStorage getPigeonApiWebStorage() {
        return new WebStorageProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebView getPigeonApiWebView() {
        return new WebViewProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebViewClient getPigeonApiWebViewClient() {
        return new WebViewClientProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebViewFeature getPigeonApiWebViewFeature() {
        return new WebViewFeatureProxyApi(this);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar
    public PigeonApiWebViewPoint getPigeonApiWebViewPoint() {
        return new WebViewPointProxyApi(this);
    }

    public void logError(String str, Throwable th) {
        Log.e(str, th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public void runOnMainThread(Runnable runnable) {
        Context context = this.context;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public boolean sdkIsAtLeast(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
