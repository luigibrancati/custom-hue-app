package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import fc.C4015H;
import fc.C4035r;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewClientProxyApi extends PigeonApiWebViewClient {
    public WebViewClientProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public WebViewClient pigeon_defaultConstructor() {
        return new WebViewClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient webViewClient, boolean z10) {
        if (!(webViewClient instanceof WebViewClientImpl)) {
            throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
        }
        ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientImpl(WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        public static /* synthetic */ C4015H A(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H B(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H a(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H c(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H d(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H g(C4035r c4035r) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doUpdateVisitedHistory$11(WebView webView, String str, boolean z10) {
            this.api.doUpdateVisitedHistory(this, webView, str, z10, new vc.l() { // from class: io.flutter.plugins.webviewflutter.m3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.x((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFormResubmission$15(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new vc.l() { // from class: io.flutter.plugins.webviewflutter.Z2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.q((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadResource$17(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new vc.l() { // from class: io.flutter.plugins.webviewflutter.i3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.o((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageCommitVisible$19(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new vc.l() { // from class: io.flutter.plugins.webviewflutter.q3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.g((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new vc.l() { // from class: io.flutter.plugins.webviewflutter.z3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.A((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new vc.l() { // from class: io.flutter.plugins.webviewflutter.h3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.r((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedClientCertRequest$21(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new vc.l() { // from class: io.flutter.plugins.webviewflutter.w3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.w((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new vc.l() { // from class: io.flutter.plugins.webviewflutter.l3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.t((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$13(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new vc.l() { // from class: io.flutter.plugins.webviewflutter.b3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.c((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new vc.l() { // from class: io.flutter.plugins.webviewflutter.v3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.B((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedLoginRequest$23(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new vc.l() { // from class: io.flutter.plugins.webviewflutter.f3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.y((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedSslError$25(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new vc.l() { // from class: io.flutter.plugins.webviewflutter.x3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.p((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScaleChanged$27(WebView webView, float f10, float f11) {
            this.api.onScaleChanged(this, webView, f10, f11, new vc.l() { // from class: io.flutter.plugins.webviewflutter.r3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.d((C4035r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$9(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new vc.l() { // from class: io.flutter.plugins.webviewflutter.c3
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.a((C4035r) obj);
                }
            });
        }

        public static /* synthetic */ C4015H o(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H p(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H q(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H r(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H t(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H w(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H x(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H y(C4035r c4035r) {
            return null;
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z10) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.g3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38243a.lambda$doUpdateVisitedHistory$11(webView, str, z10);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.o3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38295a.lambda$onFormResubmission$15(webView, message, message2);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(final WebView webView, final String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.p3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38304a.lambda$onLoadResource$17(webView, str);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(final WebView webView, final String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.e3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38229a.lambda$onPageCommitVisible$19(webView, str);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(final WebView webView, final String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.a3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38203a.lambda$onPageFinished$3(webView, str);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(final WebView webView, final String str, Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.k3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38272a.lambda$onPageStarted$1(webView, str);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.n3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38287a.lambda$onReceivedClientCertRequest$21(webView, clientCertRequest);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.u3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38347a.lambda$onReceivedError$7(webView, webResourceRequest, webResourceError);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.y3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38372a.lambda$onReceivedHttpAuthRequest$13(webView, httpAuthHandler, str, str2);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.A3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38062a.lambda$onReceivedHttpError$5(webView, webResourceRequest, webResourceResponse);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(final WebView webView, final String str, final String str2, final String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.t3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38336a.lambda$onReceivedLoginRequest$23(webView, str, str2, str3);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.s3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38326a.lambda$onReceivedSslError$25(webView, sslErrorHandler, sslError);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(final WebView webView, final float f10, final float f11) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.j3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38263a.lambda$onScaleChanged$27(webView, f10, f11);
                }
            });
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z10) {
            this.returnValueForShouldOverrideUrlLoading = z10;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.d3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38221a.lambda$shouldOverrideUrlLoading$9(webView, webResourceRequest);
                }
            });
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }
    }
}
