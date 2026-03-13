package io.flutter.plugins.webviewflutter;

import android.util.Log;
import fc.C4015H;
import fc.C4035r;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H&¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H&¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H&¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH&¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH&¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH&¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH&¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH&¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH&¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH&¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H&¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H&¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH&¢\u0006\u0004\bd\u0010eJ\r\u0010g\u001a\u00020f¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020f¢\u0006\u0004\bi\u0010hR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0017\u0010u\u001a\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR \u0010z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010y8F¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceRequest;", "getPigeonApiWebResourceRequest", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceRequest;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceResponse;", "getPigeonApiWebResourceResponse", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceResponse;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceError;", "getPigeonApiWebResourceError", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceError;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceErrorCompat;", "getPigeonApiWebResourceErrorCompat", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceErrorCompat;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewPoint;", "getPigeonApiWebViewPoint", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebViewPoint;", "Lio/flutter/plugins/webviewflutter/PigeonApiConsoleMessage;", "getPigeonApiConsoleMessage", "()Lio/flutter/plugins/webviewflutter/PigeonApiConsoleMessage;", "Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;", "getPigeonApiCookieManager", "()Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebView;", "getPigeonApiWebView", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebView;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "getPigeonApiWebSettings", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;", "getPigeonApiJavaScriptChannel", "()Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "getPigeonApiWebViewClient", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "Lio/flutter/plugins/webviewflutter/PigeonApiDownloadListener;", "getPigeonApiDownloadListener", "()Lio/flutter/plugins/webviewflutter/PigeonApiDownloadListener;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "getPigeonApiWebChromeClient", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "Lio/flutter/plugins/webviewflutter/PigeonApiFlutterAssetManager;", "getPigeonApiFlutterAssetManager", "()Lio/flutter/plugins/webviewflutter/PigeonApiFlutterAssetManager;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebStorage;", "getPigeonApiWebStorage", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebStorage;", "Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;", "getPigeonApiFileChooserParams", "()Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;", "Lio/flutter/plugins/webviewflutter/PigeonApiPermissionRequest;", "getPigeonApiPermissionRequest", "()Lio/flutter/plugins/webviewflutter/PigeonApiPermissionRequest;", "Lio/flutter/plugins/webviewflutter/PigeonApiCustomViewCallback;", "getPigeonApiCustomViewCallback", "()Lio/flutter/plugins/webviewflutter/PigeonApiCustomViewCallback;", "Lio/flutter/plugins/webviewflutter/PigeonApiView;", "getPigeonApiView", "()Lio/flutter/plugins/webviewflutter/PigeonApiView;", "Lio/flutter/plugins/webviewflutter/PigeonApiGeolocationPermissionsCallback;", "getPigeonApiGeolocationPermissionsCallback", "()Lio/flutter/plugins/webviewflutter/PigeonApiGeolocationPermissionsCallback;", "Lio/flutter/plugins/webviewflutter/PigeonApiHttpAuthHandler;", "getPigeonApiHttpAuthHandler", "()Lio/flutter/plugins/webviewflutter/PigeonApiHttpAuthHandler;", "Lio/flutter/plugins/webviewflutter/PigeonApiAndroidMessage;", "getPigeonApiAndroidMessage", "()Lio/flutter/plugins/webviewflutter/PigeonApiAndroidMessage;", "Lio/flutter/plugins/webviewflutter/PigeonApiClientCertRequest;", "getPigeonApiClientCertRequest", "()Lio/flutter/plugins/webviewflutter/PigeonApiClientCertRequest;", "Lio/flutter/plugins/webviewflutter/PigeonApiPrivateKey;", "getPigeonApiPrivateKey", "()Lio/flutter/plugins/webviewflutter/PigeonApiPrivateKey;", "Lio/flutter/plugins/webviewflutter/PigeonApiX509Certificate;", "getPigeonApiX509Certificate", "()Lio/flutter/plugins/webviewflutter/PigeonApiX509Certificate;", "Lio/flutter/plugins/webviewflutter/PigeonApiSslErrorHandler;", "getPigeonApiSslErrorHandler", "()Lio/flutter/plugins/webviewflutter/PigeonApiSslErrorHandler;", "Lio/flutter/plugins/webviewflutter/PigeonApiSslError;", "getPigeonApiSslError", "()Lio/flutter/plugins/webviewflutter/PigeonApiSslError;", "Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;", "getPigeonApiSslCertificateDName", "()Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;", "Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificate;", "getPigeonApiSslCertificate", "()Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificate;", "Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;", "getPigeonApiCertificate", "()Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebSettingsCompat;", "getPigeonApiWebSettingsCompat", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebSettingsCompat;", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewFeature;", "getPigeonApiWebViewFeature", "()Lio/flutter/plugins/webviewflutter/PigeonApiWebViewFeature;", "Lfc/H;", "setUp", "()V", "tearDown", "Lio/flutter/plugin/common/BinaryMessenger;", "getBinaryMessenger", "()Lio/flutter/plugin/common/BinaryMessenger;", "", "ignoreCallsToDart", "Z", "getIgnoreCallsToDart", "()Z", "setIgnoreCallsToDart", "(Z)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "instanceManager", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "getInstanceManager", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "Lio/flutter/plugin/common/MessageCodec;", "_codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AndroidWebkitLibraryPigeonProxyApiRegistrar {
    private MessageCodec<Object> _codec;
    private final BinaryMessenger binaryMessenger;
    private boolean ignoreCallsToDart;
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"io/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar$1", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "", "identifier", "Lfc/H;", "onFinalize", "(J)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 implements AndroidWebkitLibraryPigeonInstanceManager.PigeonFinalizationListener {
        final /* synthetic */ AndroidWebkitLibraryPigeonInstanceManagerApi $api;

        public AnonymousClass1(AndroidWebkitLibraryPigeonInstanceManagerApi androidWebkitLibraryPigeonInstanceManagerApi) {
            this.$api = androidWebkitLibraryPigeonInstanceManagerApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H onFinalize$lambda$0(long j10, C4035r c4035r) {
            if (C4035r.g(c4035r.j())) {
                Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j10);
            }
            return C4015H.f34254a;
        }

        @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager.PigeonFinalizationListener
        public void onFinalize(final long identifier) {
            this.$api.removeStrongReference(identifier, new vc.l() { // from class: io.flutter.plugins.webviewflutter.J
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiRegistrar.AnonymousClass1.onFinalize$lambda$0(identifier, (C4035r) obj);
                }
            });
        }
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar(BinaryMessenger binaryMessenger) {
        AbstractC4862t.e(binaryMessenger, "binaryMessenger");
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = AndroidWebkitLibraryPigeonInstanceManager.INSTANCE.create(new AnonymousClass1(new AndroidWebkitLibraryPigeonInstanceManagerApi(binaryMessenger)));
    }

    public final BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public final MessageCodec<Object> getCodec() {
        if (this._codec == null) {
            this._codec = new AndroidWebkitLibraryPigeonProxyApiBaseCodec(this);
        }
        MessageCodec<Object> messageCodec = this._codec;
        AbstractC4862t.b(messageCodec);
        return messageCodec;
    }

    public final boolean getIgnoreCallsToDart() {
        return this.ignoreCallsToDart;
    }

    public final AndroidWebkitLibraryPigeonInstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    public abstract PigeonApiAndroidMessage getPigeonApiAndroidMessage();

    public abstract PigeonApiCertificate getPigeonApiCertificate();

    public abstract PigeonApiClientCertRequest getPigeonApiClientCertRequest();

    public abstract PigeonApiConsoleMessage getPigeonApiConsoleMessage();

    public abstract PigeonApiCookieManager getPigeonApiCookieManager();

    public abstract PigeonApiCustomViewCallback getPigeonApiCustomViewCallback();

    public abstract PigeonApiDownloadListener getPigeonApiDownloadListener();

    public abstract PigeonApiFileChooserParams getPigeonApiFileChooserParams();

    public abstract PigeonApiFlutterAssetManager getPigeonApiFlutterAssetManager();

    public abstract PigeonApiGeolocationPermissionsCallback getPigeonApiGeolocationPermissionsCallback();

    public abstract PigeonApiHttpAuthHandler getPigeonApiHttpAuthHandler();

    public abstract PigeonApiJavaScriptChannel getPigeonApiJavaScriptChannel();

    public abstract PigeonApiPermissionRequest getPigeonApiPermissionRequest();

    public PigeonApiPrivateKey getPigeonApiPrivateKey() {
        return new PigeonApiPrivateKey(this);
    }

    public abstract PigeonApiSslCertificate getPigeonApiSslCertificate();

    public abstract PigeonApiSslCertificateDName getPigeonApiSslCertificateDName();

    public abstract PigeonApiSslError getPigeonApiSslError();

    public abstract PigeonApiSslErrorHandler getPigeonApiSslErrorHandler();

    public abstract PigeonApiView getPigeonApiView();

    public abstract PigeonApiWebChromeClient getPigeonApiWebChromeClient();

    public abstract PigeonApiWebResourceError getPigeonApiWebResourceError();

    public abstract PigeonApiWebResourceErrorCompat getPigeonApiWebResourceErrorCompat();

    public abstract PigeonApiWebResourceRequest getPigeonApiWebResourceRequest();

    public abstract PigeonApiWebResourceResponse getPigeonApiWebResourceResponse();

    public abstract PigeonApiWebSettings getPigeonApiWebSettings();

    public abstract PigeonApiWebSettingsCompat getPigeonApiWebSettingsCompat();

    public abstract PigeonApiWebStorage getPigeonApiWebStorage();

    public abstract PigeonApiWebView getPigeonApiWebView();

    public abstract PigeonApiWebViewClient getPigeonApiWebViewClient();

    public abstract PigeonApiWebViewFeature getPigeonApiWebViewFeature();

    public abstract PigeonApiWebViewPoint getPigeonApiWebViewPoint();

    public PigeonApiX509Certificate getPigeonApiX509Certificate() {
        return new PigeonApiX509Certificate(this);
    }

    public final void setIgnoreCallsToDart(boolean z10) {
        this.ignoreCallsToDart = z10;
    }

    public final void setUp() {
        AndroidWebkitLibraryPigeonInstanceManagerApi.INSTANCE.setUpMessageHandlers(this.binaryMessenger, this.instanceManager);
        PigeonApiCookieManager.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCookieManager());
        PigeonApiWebView.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebView());
        PigeonApiWebSettings.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebSettings());
        PigeonApiJavaScriptChannel.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiJavaScriptChannel());
        PigeonApiWebViewClient.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebViewClient());
        PigeonApiDownloadListener.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiDownloadListener());
        PigeonApiWebChromeClient.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebChromeClient());
        PigeonApiFlutterAssetManager.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiFlutterAssetManager());
        PigeonApiWebStorage.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebStorage());
        PigeonApiPermissionRequest.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiPermissionRequest());
        PigeonApiCustomViewCallback.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCustomViewCallback());
        PigeonApiView.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiView());
        PigeonApiGeolocationPermissionsCallback.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiGeolocationPermissionsCallback());
        PigeonApiHttpAuthHandler.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiHttpAuthHandler());
        PigeonApiAndroidMessage.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiAndroidMessage());
        PigeonApiClientCertRequest.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiClientCertRequest());
        PigeonApiSslErrorHandler.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslErrorHandler());
        PigeonApiSslError.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslError());
        PigeonApiSslCertificateDName.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslCertificateDName());
        PigeonApiSslCertificate.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslCertificate());
        PigeonApiCertificate.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCertificate());
        PigeonApiWebSettingsCompat.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebSettingsCompat());
        PigeonApiWebViewFeature.INSTANCE.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebViewFeature());
    }

    public final void tearDown() {
        AndroidWebkitLibraryPigeonInstanceManagerApi.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiCookieManager.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebView.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebSettings.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiJavaScriptChannel.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebViewClient.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiDownloadListener.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebChromeClient.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiFlutterAssetManager.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebStorage.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiPermissionRequest.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiCustomViewCallback.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiView.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiGeolocationPermissionsCallback.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiHttpAuthHandler.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiAndroidMessage.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiClientCertRequest.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslErrorHandler.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslError.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslCertificateDName.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslCertificate.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiCertificate.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebSettingsCompat.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebViewFeature.INSTANCE.setUpMessageHandlers(this.binaryMessenger, null);
    }
}
