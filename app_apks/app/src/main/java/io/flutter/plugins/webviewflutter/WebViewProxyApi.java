package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import fc.C4015H;
import fc.C4035r;
import io.flutter.embedding.android.FlutterView;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewProxyApi extends PigeonApiWebView {
    public WebViewProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavaScriptChannel(WebView webView, JavaScriptChannel javaScriptChannel) {
        webView.addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public boolean canGoBack(WebView webView) {
        return webView.canGoBack();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public boolean canGoForward(WebView webView) {
        return webView.canGoForward();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void clearCache(WebView webView, boolean z10) {
        webView.clearCache(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void destroy(WebView webView) {
        webView.destroy();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void evaluateJavascript(WebView webView, String str, final vc.l lVar) {
        webView.evaluateJavascript(str, new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.B3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ResultCompat.success((String) obj, lVar);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public String getTitle(WebView webView) {
        return webView.getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public String getUrl(WebView webView) {
        return webView.getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void goBack(WebView webView) {
        webView.goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void goForward(WebView webView) {
        webView.goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void loadData(WebView webView, String str, String str2, String str3) {
        webView.loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void loadDataWithBaseUrl(WebView webView, String str, String str2, String str3, String str4, String str5) {
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void loadUrl(WebView webView, String str, Map<String, String> map) {
        webView.loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public WebView pigeon_defaultConstructor() {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) getPigeonRegistrar().getContext().getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        WebViewPlatformView webViewPlatformView = new WebViewPlatformView(this);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        return webViewPlatformView;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void postUrl(WebView webView, String str, byte[] bArr) {
        webView.postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void reload(WebView webView) {
        webView.reload();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void removeJavaScriptChannel(WebView webView, String str) {
        webView.removeJavascriptInterface(str);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void setBackgroundColor(WebView webView, long j10) {
        webView.setBackgroundColor((int) j10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void setDownloadListener(WebView webView, DownloadListener downloadListener) {
        webView.setDownloadListener(downloadListener);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void setWebChromeClient(WebView webView, WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl) {
        webView.setWebChromeClient(webChromeClientImpl);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void setWebContentsDebuggingEnabled(boolean z10) {
        WebView.setWebContentsDebuggingEnabled(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public void setWebViewClient(WebView webView, WebViewClient webViewClient) {
        webView.setWebViewClient(webViewClient);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public WebSettings settings(WebView webView) {
        return webView.getSettings();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebView
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @SuppressLint({"ViewConstructor"})
    public static class WebViewPlatformView extends WebView implements PlatformView {
        private final WebViewProxyApi api;
        private WebChromeClientProxyApi.SecureWebChromeClient currentWebChromeClient;
        private WebViewClient currentWebViewClient;

        public WebViewPlatformView(WebViewProxyApi webViewProxyApi) {
            super(webViewProxyApi.getPigeonRegistrar().getContext());
            this.api = webViewProxyApi;
            this.currentWebViewClient = new WebViewClient();
            this.currentWebChromeClient = new WebChromeClientProxyApi.SecureWebChromeClient();
            setWebViewClient(this.currentWebViewClient);
            setWebChromeClient(this.currentWebChromeClient);
        }

        public static /* synthetic */ C4015H a(C4035r c4035r) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScrollChanged$1(int i10, int i11, int i12, int i13) {
            this.api.onScrollChanged(this, i10, i11, i12, i13, new vc.l() { // from class: io.flutter.plugins.webviewflutter.D3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewProxyApi.WebViewPlatformView.a((C4035r) obj);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugins.webviewflutter.WebViewProxyApi$WebViewPlatformView] */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewParent] */
        /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewParent] */
        private FlutterView tryFindFlutterView() {
            while (this.getParent() != null) {
                this = this.getParent();
                if (this instanceof FlutterView) {
                    return (FlutterView) this;
                }
            }
            return null;
        }

        @Override // android.webkit.WebView
        public WebChromeClient getWebChromeClient() {
            return this.currentWebChromeClient;
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            FlutterView flutterViewTryFindFlutterView;
            super.onAttachedToWindow();
            if (!this.api.getPigeonRegistrar().sdkIsAtLeast(26) || (flutterViewTryFindFlutterView = tryFindFlutterView()) == null) {
                return;
            }
            flutterViewTryFindFlutterView.setImportantForAutofill(1);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(final int i10, final int i11, final int i12, final int i13) {
            super.onScrollChanged(i10, i11, i12, i13);
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.C3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38077a.lambda$onScrollChanged$1(i10, i11, i12, i13);
                }
            });
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof WebChromeClientProxyApi.SecureWebChromeClient)) {
                throw new AssertionError("Client must be a SecureWebChromeClient.");
            }
            WebChromeClientProxyApi.SecureWebChromeClient secureWebChromeClient = (WebChromeClientProxyApi.SecureWebChromeClient) webChromeClient;
            this.currentWebChromeClient = secureWebChromeClient;
            secureWebChromeClient.setWebViewClient(this.currentWebViewClient);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient = webViewClient;
            this.currentWebChromeClient.setWebViewClient(webViewClient);
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public View getView() {
            return this;
        }
    }
}
