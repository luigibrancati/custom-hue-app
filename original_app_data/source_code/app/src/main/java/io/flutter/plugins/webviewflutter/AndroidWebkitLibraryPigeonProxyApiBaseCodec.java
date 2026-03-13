package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import fc.C4015H;
import fc.C4035r;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import w3.AbstractC6119a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "registrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "(BLjava/nio/ByteBuffer;)Ljava/lang/Object;", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Lfc/H;", "writeValue", "(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class AndroidWebkitLibraryPigeonProxyApiBaseCodec extends AndroidWebkitLibraryPigeonCodec {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar registrar;

    public AndroidWebkitLibraryPigeonProxyApiBaseCodec(AndroidWebkitLibraryPigeonProxyApiRegistrar registrar) {
        AbstractC4862t.e(registrar, "registrar");
        this.registrar = registrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$0(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebResourceRequest", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$1(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebResourceResponse", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$10(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebViewClient", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$11(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("DownloadListener", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$12(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebChromeClient", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$13(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("FlutterAssetManager", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$14(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebStorage", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$15(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("FileChooserParams", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$16(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("PermissionRequest", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$17(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("CustomViewCallback", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$18(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("View", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$19(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("GeolocationPermissionsCallback", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$2(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebResourceError", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$20(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("HttpAuthHandler", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$21(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("AndroidMessage", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$22(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("ClientCertRequest", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$23(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("PrivateKey", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$24(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("X509Certificate", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$25(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("SslErrorHandler", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$26(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("SslError", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$27(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("SslCertificateDName", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$28(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("SslCertificate", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$29(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("Certificate", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$3(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebResourceErrorCompat", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    private static final C4015H writeValue$lambda$30(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebSettingsCompat", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    private static final C4015H writeValue$lambda$31(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebViewFeature", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$4(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebViewPoint", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$5(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("ConsoleMessage", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$6(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("CookieManager", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$7(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebView", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$8(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("WebSettings", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H writeValue$lambda$9(Object obj, C4035r c4035r) {
        if (C4035r.g(c4035r.j())) {
            writeValue$logNewInstanceFailure("JavaScriptChannel", obj, C4035r.e(c4035r.j()));
        }
        return C4015H.f34254a;
    }

    private static final void writeValue$logNewInstanceFailure(String str, Object obj, Throwable th) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th);
    }

    public final AndroidWebkitLibraryPigeonProxyApiRegistrar getRegistrar() {
        return this.registrar;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        if (type != -128) {
            return super.readValueOfType(type, buffer);
        }
        Object value = readValue(buffer);
        AbstractC4862t.c(value, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) value).longValue();
        Object androidWebkitLibraryPigeonInstanceManager = this.registrar.getInstanceManager().getInstance(jLongValue);
        if (androidWebkitLibraryPigeonInstanceManager == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return androidWebkitLibraryPigeonInstanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, final Object value) {
        AbstractC4862t.e(stream, "stream");
        if ((value instanceof Boolean) || (value instanceof byte[]) || (value instanceof Double) || (value instanceof double[]) || (value instanceof float[]) || (value instanceof Integer) || (value instanceof int[]) || (value instanceof List) || (value instanceof Long) || (value instanceof long[]) || (value instanceof Map) || (value instanceof String) || (value instanceof FileChooserMode) || (value instanceof ConsoleMessageLevel) || (value instanceof OverScrollMode) || (value instanceof SslErrorType) || (value instanceof MixedContentMode) || value == null) {
            super.writeValue(stream, value);
            return;
        }
        if (value instanceof WebResourceRequest) {
            this.registrar.getPigeonApiWebResourceRequest().pigeon_newInstance((WebResourceRequest) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.f
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebResourceResponse) {
            this.registrar.getPigeonApiWebResourceResponse().pigeon_newInstance((WebResourceResponse) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.h
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebResourceError) {
            this.registrar.getPigeonApiWebResourceError().pigeon_newInstance((WebResourceError) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.t
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(value, (C4035r) obj);
                }
            });
        } else if (value instanceof AbstractC6119a) {
            this.registrar.getPigeonApiWebResourceErrorCompat().pigeon_newInstance((AbstractC6119a) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.u
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebViewPoint) {
            this.registrar.getPigeonApiWebViewPoint().pigeon_newInstance((WebViewPoint) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.v
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(value, (C4035r) obj);
                }
            });
        } else if (value instanceof ConsoleMessage) {
            this.registrar.getPigeonApiConsoleMessage().pigeon_newInstance((ConsoleMessage) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(value, (C4035r) obj);
                }
            });
        } else if (value instanceof CookieManager) {
            this.registrar.getPigeonApiCookieManager().pigeon_newInstance((CookieManager) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.x
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebView) {
            this.registrar.getPigeonApiWebView().pigeon_newInstance((WebView) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.y
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebSettings) {
            this.registrar.getPigeonApiWebSettings().pigeon_newInstance((WebSettings) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.z
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(value, (C4035r) obj);
                }
            });
        } else if (value instanceof JavaScriptChannel) {
            this.registrar.getPigeonApiJavaScriptChannel().pigeon_newInstance((JavaScriptChannel) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.A
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebViewClient) {
            this.registrar.getPigeonApiWebViewClient().pigeon_newInstance((WebViewClient) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.q
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(value, (C4035r) obj);
                }
            });
        } else if (value instanceof DownloadListener) {
            this.registrar.getPigeonApiDownloadListener().pigeon_newInstance((DownloadListener) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.B
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebChromeClientProxyApi.WebChromeClientImpl) {
            this.registrar.getPigeonApiWebChromeClient().pigeon_newInstance((WebChromeClientProxyApi.WebChromeClientImpl) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.C
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(value, (C4035r) obj);
                }
            });
        } else if (value instanceof FlutterAssetManager) {
            this.registrar.getPigeonApiFlutterAssetManager().pigeon_newInstance((FlutterAssetManager) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.D
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebStorage) {
            this.registrar.getPigeonApiWebStorage().pigeon_newInstance((WebStorage) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.E
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebChromeClient.FileChooserParams) {
            this.registrar.getPigeonApiFileChooserParams().pigeon_newInstance((WebChromeClient.FileChooserParams) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.F
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(value, (C4035r) obj);
                }
            });
        } else if (value instanceof PermissionRequest) {
            this.registrar.getPigeonApiPermissionRequest().pigeon_newInstance((PermissionRequest) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.G
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(value, (C4035r) obj);
                }
            });
        } else if (value instanceof WebChromeClient.CustomViewCallback) {
            this.registrar.getPigeonApiCustomViewCallback().pigeon_newInstance((WebChromeClient.CustomViewCallback) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.H
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$17(value, (C4035r) obj);
                }
            });
        } else if (value instanceof View) {
            this.registrar.getPigeonApiView().pigeon_newInstance((View) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.I
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$18(value, (C4035r) obj);
                }
            });
        } else if (value instanceof GeolocationPermissions.Callback) {
            this.registrar.getPigeonApiGeolocationPermissionsCallback().pigeon_newInstance((GeolocationPermissions.Callback) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.g
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(value, (C4035r) obj);
                }
            });
        } else if (value instanceof HttpAuthHandler) {
            this.registrar.getPigeonApiHttpAuthHandler().pigeon_newInstance((HttpAuthHandler) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.i
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(value, (C4035r) obj);
                }
            });
        } else if (value instanceof Message) {
            this.registrar.getPigeonApiAndroidMessage().pigeon_newInstance((Message) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.j
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(value, (C4035r) obj);
                }
            });
        } else if (value instanceof ClientCertRequest) {
            this.registrar.getPigeonApiClientCertRequest().pigeon_newInstance((ClientCertRequest) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.k
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(value, (C4035r) obj);
                }
            });
        } else if (value instanceof PrivateKey) {
            this.registrar.getPigeonApiPrivateKey().pigeon_newInstance((PrivateKey) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.l
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(value, (C4035r) obj);
                }
            });
        } else if (value instanceof X509Certificate) {
            this.registrar.getPigeonApiX509Certificate().pigeon_newInstance((X509Certificate) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.m
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(value, (C4035r) obj);
                }
            });
        } else if (value instanceof SslErrorHandler) {
            this.registrar.getPigeonApiSslErrorHandler().pigeon_newInstance((SslErrorHandler) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.n
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(value, (C4035r) obj);
                }
            });
        } else if (value instanceof SslError) {
            this.registrar.getPigeonApiSslError().pigeon_newInstance((SslError) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(value, (C4035r) obj);
                }
            });
        } else if (value instanceof SslCertificate.DName) {
            this.registrar.getPigeonApiSslCertificateDName().pigeon_newInstance((SslCertificate.DName) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.p
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(value, (C4035r) obj);
                }
            });
        } else if (value instanceof SslCertificate) {
            this.registrar.getPigeonApiSslCertificate().pigeon_newInstance((SslCertificate) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.r
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(value, (C4035r) obj);
                }
            });
        } else if (value instanceof Certificate) {
            this.registrar.getPigeonApiCertificate().pigeon_newInstance((Certificate) value, new vc.l() { // from class: io.flutter.plugins.webviewflutter.s
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(value, (C4035r) obj);
                }
            });
        }
        if (this.registrar.getInstanceManager().containsInstance(value)) {
            stream.write(128);
            writeValue(stream, this.registrar.getInstanceManager().getIdentifierForStrongReference(value));
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + value + "' of type '" + value.getClass().getName() + "'");
    }
}
