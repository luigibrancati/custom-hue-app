package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import fc.C4015H;
import fc.C4035r;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebChromeClientProxyApi extends PigeonApiWebChromeClient {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SecureWebChromeClient extends WebChromeClient {
        WebViewClient webViewClient;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
        }

        public boolean onCreateWindow(final WebView webView, Message message, WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.SecureWebChromeClient.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(webViewClient);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private static final String TAG = "WebChromeClientImpl";
        private final WebChromeClientProxyApi api;
        private boolean returnValueForOnShowFileChooser = false;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;

        public WebChromeClientImpl(WebChromeClientProxyApi webChromeClientProxyApi) {
            this.api = webChromeClientProxyApi;
        }

        public static /* synthetic */ C4015H a(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H b(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H d(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H e(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H f(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H g(C4035r c4035r) {
            return null;
        }

        public static /* synthetic */ C4015H h(C4035r c4035r) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ C4015H lambda$onJsAlert$8(JsResult jsResult, ResultCompat resultCompat) {
            if (!resultCompat.getIsFailure()) {
                jsResult.confirm();
                return null;
            }
            ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
            Throwable exception = resultCompat.getException();
            Objects.requireNonNull(exception);
            pigeonRegistrar.logError(TAG, exception);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ C4015H lambda$onJsConfirm$9(JsResult jsResult, ResultCompat resultCompat) {
            if (!resultCompat.getIsFailure()) {
                if (Boolean.TRUE.equals(resultCompat.getOrNull())) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
                return null;
            }
            ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
            Throwable exception = resultCompat.getException();
            Objects.requireNonNull(exception);
            pigeonRegistrar.logError(TAG, exception);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ C4015H lambda$onJsPrompt$10(JsPromptResult jsPromptResult, ResultCompat resultCompat) {
            if (resultCompat.getIsFailure()) {
                ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
                Throwable exception = resultCompat.getException();
                Objects.requireNonNull(exception);
                pigeonRegistrar.logError(TAG, exception);
                return null;
            }
            String str = (String) resultCompat.getOrNull();
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ C4015H lambda$onShowFileChooser$5(boolean z10, ValueCallback valueCallback, ResultCompat resultCompat) {
            if (resultCompat.getIsFailure()) {
                ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
                Throwable exception = resultCompat.getException();
                Objects.requireNonNull(exception);
                pigeonRegistrar.logError(TAG, exception);
                return null;
            }
            List list = (List) resultCompat.getOrNull();
            Objects.requireNonNull(list);
            List list2 = list;
            if (z10) {
                Uri[] uriArr = new Uri[list2.size()];
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    uriArr[i10] = Uri.parse((String) list2.get(i10));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.api.onConsoleMessage(this, consoleMessage, new vc.l() { // from class: io.flutter.plugins.webviewflutter.R2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.b((C4035r) obj);
                }
            });
            return this.returnValueForOnConsoleMessage;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.api.onGeolocationPermissionsHidePrompt(this, new vc.l() { // from class: io.flutter.plugins.webviewflutter.P2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.g((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.api.onGeolocationPermissionsShowPrompt(this, str, callback, new vc.l() { // from class: io.flutter.plugins.webviewflutter.T2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.h((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.api.onHideCustomView(this, new vc.l() { // from class: io.flutter.plugins.webviewflutter.Y2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.f((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.api.onJsAlert(this, webView, str, str2, ResultCompat.asCompatCallback(new vc.l() { // from class: io.flutter.plugins.webviewflutter.U2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return this.f38172a.lambda$onJsAlert$8(jsResult, (ResultCompat) obj);
                }
            }));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.api.onJsConfirm(this, webView, str, str2, ResultCompat.asCompatCallback(new vc.l() { // from class: io.flutter.plugins.webviewflutter.O2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return this.f38145a.lambda$onJsConfirm$9(jsResult, (ResultCompat) obj);
                }
            }));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.api.onJsPrompt(this, webView, str, str2, str3, ResultCompat.asCompatCallback(new vc.l() { // from class: io.flutter.plugins.webviewflutter.Q2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return this.f38155a.lambda$onJsPrompt$10(jsPromptResult, (ResultCompat) obj);
                }
            }));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.api.onPermissionRequest(this, permissionRequest, new vc.l() { // from class: io.flutter.plugins.webviewflutter.W2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.e((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            this.api.onProgressChanged(this, webView, i10, new vc.l() { // from class: io.flutter.plugins.webviewflutter.V2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.a((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.api.onShowCustomView(this, view, customViewCallback, new vc.l() { // from class: io.flutter.plugins.webviewflutter.S2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.d((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z10 = this.returnValueForOnShowFileChooser;
            this.api.onShowFileChooser(this, webView, fileChooserParams, ResultCompat.asCompatCallback(new vc.l() { // from class: io.flutter.plugins.webviewflutter.X2
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return this.f38185a.lambda$onShowFileChooser$5(z10, valueCallback, (ResultCompat) obj);
                }
            }));
            return z10;
        }

        public void setReturnValueForOnConsoleMessage(boolean z10) {
            this.returnValueForOnConsoleMessage = z10;
        }

        public void setReturnValueForOnJsAlert(boolean z10) {
            this.returnValueForOnJsAlert = z10;
        }

        public void setReturnValueForOnJsConfirm(boolean z10) {
            this.returnValueForOnJsConfirm = z10;
        }

        public void setReturnValueForOnJsPrompt(boolean z10) {
            this.returnValueForOnJsPrompt = z10;
        }

        public void setReturnValueForOnShowFileChooser(boolean z10) {
            this.returnValueForOnShowFileChooser = z10;
        }
    }

    public WebChromeClientProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public WebChromeClientImpl pigeon_defaultConstructor() {
        return new WebChromeClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientImpl webChromeClientImpl, boolean z10) {
        webChromeClientImpl.setReturnValueForOnConsoleMessage(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsAlert(WebChromeClientImpl webChromeClientImpl, boolean z10) {
        webChromeClientImpl.setReturnValueForOnJsAlert(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsConfirm(WebChromeClientImpl webChromeClientImpl, boolean z10) {
        webChromeClientImpl.setReturnValueForOnJsConfirm(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsPrompt(WebChromeClientImpl webChromeClientImpl, boolean z10) {
        webChromeClientImpl.setReturnValueForOnJsPrompt(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientImpl webChromeClientImpl, boolean z10) {
        webChromeClientImpl.setReturnValueForOnShowFileChooser(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
