package io.flutter.plugins.webviewflutter;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4205s;
import gc.C4206t;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import w3.AbstractC6119a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b&\u0018\u0000 P2\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u001b\u0010\u001aJG\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b \u0010!JG\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b$\u0010%JG\u0010'\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020&2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b'\u0010(J?\u0010)\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b+\u0010\u001aJG\u0010-\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b-\u0010.JO\u00103\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b3\u00104JG\u00109\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b9\u0010:J?\u0010;\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b;\u0010\u001aJ?\u0010<\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b<\u0010\u001aJ?\u0010>\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020=2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b>\u0010?JQ\u0010B\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u00172\u0006\u0010A\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\bB\u0010CJG\u0010F\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u00100\u001a\u00020D2\u0006\u0010#\u001a\u00020E2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\bF\u0010GJG\u0010K\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00152\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\bK\u0010LR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeonRegistrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "Landroid/webkit/WebViewClient;", "pigeon_defaultConstructor", "()Landroid/webkit/WebViewClient;", "pigeon_instance", "", "value", "Lfc/H;", "setSynchronousReturnValueForShouldOverrideUrlLoading", "(Landroid/webkit/WebViewClient;Z)V", "pigeon_instanceArg", "Lkotlin/Function1;", "Lfc/r;", "callback", "pigeon_newInstance", "(Landroid/webkit/WebViewClient;Lvc/l;)V", "Landroid/webkit/WebView;", "webViewArg", "", "urlArg", "onPageStarted", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lvc/l;)V", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "requestArg", "Landroid/webkit/WebResourceResponse;", "responseArg", "onReceivedHttpError", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;Lvc/l;)V", "Landroid/webkit/WebResourceError;", "errorArg", "onReceivedRequestError", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;Lvc/l;)V", "Lw3/a;", "onReceivedRequestErrorCompat", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Lw3/a;Lvc/l;)V", "requestLoading", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Lvc/l;)V", "urlLoading", "isReloadArg", "doUpdateVisitedHistory", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;ZLvc/l;)V", "Landroid/webkit/HttpAuthHandler;", "handlerArg", "hostArg", "realmArg", "onReceivedHttpAuthRequest", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;Lvc/l;)V", "viewArg", "Landroid/os/Message;", "dontResendArg", "resendArg", "onFormResubmission", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;Lvc/l;)V", "onLoadResource", "onPageCommitVisible", "Landroid/webkit/ClientCertRequest;", "onReceivedClientCertRequest", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;Lvc/l;)V", "accountArg", "argsArg", "onReceivedLoginRequest", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/l;)V", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;Lvc/l;)V", "", "oldScaleArg", "newScaleArg", "onScaleChanged", "(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;DDLvc/l;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PigeonApiWebViewClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "api", "Lfc/H;", "setUpMessageHandlers", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebViewClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebViewClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
            WebViewClient webViewClient = (WebViewClient) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading(webViewClient, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiWebViewClient api) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.H2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.I2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebViewClient(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        AbstractC4862t.e(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doUpdateVisitedHistory$lambda$8(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFormResubmission$lambda$10(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoadResource$lambda$11(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageCommitVisible$lambda$12(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageFinished$lambda$2(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageStarted$lambda$1(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedClientCertRequest$lambda$13(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedHttpAuthRequest$lambda$9(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedHttpError$lambda$3(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedLoginRequest$lambda$14(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedRequestError$lambda$4(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedRequestErrorCompat$lambda$5(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedSslError$lambda$15(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScaleChanged$lambda$16(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pigeon_newInstance$lambda$0(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLoading$lambda$6(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void urlLoading$lambda$7(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        C4035r.a aVar3 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public final void doUpdateVisitedHistory(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, boolean isReloadArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg, Boolean.valueOf(isReloadArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.s2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.doUpdateVisitedHistory$lambda$8(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void onFormResubmission(WebViewClient pigeon_instanceArg, WebView viewArg, Message dontResendArg, Message resendArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(dontResendArg, "dontResendArg");
        AbstractC4862t.e(resendArg, "resendArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, dontResendArg, resendArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.D2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onFormResubmission$lambda$10(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onLoadResource(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.u2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onLoadResource$lambda$11(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onPageCommitVisible(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.z2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onPageCommitVisible$lambda$12(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onPageFinished(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.B2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onPageFinished$lambda$2(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onPageStarted(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.w2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onPageStarted$lambda$1(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedClientCertRequest(WebViewClient pigeon_instanceArg, WebView viewArg, ClientCertRequest requestArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(requestArg, "requestArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, requestArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.x2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedClientCertRequest$lambda$13(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedHttpAuthRequest(WebViewClient pigeon_instanceArg, WebView webViewArg, HttpAuthHandler handlerArg, String hostArg, String realmArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(handlerArg, "handlerArg");
        AbstractC4862t.e(hostArg, "hostArg");
        AbstractC4862t.e(realmArg, "realmArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, handlerArg, hostArg, realmArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.C2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedHttpAuthRequest$lambda$9(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedHttpError(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceResponse responseArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(requestArg, "requestArg");
        AbstractC4862t.e(responseArg, "responseArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, requestArg, responseArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.t2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedHttpError$lambda$3(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedLoginRequest(WebViewClient pigeon_instanceArg, WebView viewArg, String realmArg, String accountArg, String argsArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(realmArg, "realmArg");
        AbstractC4862t.e(argsArg, "argsArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, realmArg, accountArg, argsArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.v2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedLoginRequest$lambda$14(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedRequestError(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceError errorArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(requestArg, "requestArg");
        AbstractC4862t.e(errorArg, "errorArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, requestArg, errorArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.A2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedRequestError$lambda$4(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedRequestErrorCompat(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, AbstractC6119a errorArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(requestArg, "requestArg");
        AbstractC4862t.e(errorArg, "errorArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, requestArg, errorArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.q2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedRequestErrorCompat$lambda$5(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestErrorCompat` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onReceivedSslError(WebViewClient pigeon_instanceArg, WebView viewArg, SslErrorHandler handlerArg, SslError errorArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(handlerArg, "handlerArg");
        AbstractC4862t.e(errorArg, "errorArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, handlerArg, errorArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.F2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedSslError$lambda$15(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onScaleChanged(WebViewClient pigeon_instanceArg, WebView viewArg, double oldScaleArg, double newScaleArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, Double.valueOf(oldScaleArg), Double.valueOf(newScaleArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.G2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onScaleChanged$lambda$16(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public abstract WebViewClient pigeon_defaultConstructor();

    public final void pigeon_newInstance(WebViewClient pigeon_instanceArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(C4205s.d(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.E2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.pigeon_newInstance$lambda$0(callback, str, obj);
                }
            });
        }
    }

    public final void requestLoading(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(requestArg, "requestArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, requestArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.y2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.requestLoading$lambda$6(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public abstract void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient pigeon_instance, boolean value);

    public final void urlLoading(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.r2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.urlLoading$lambda$7(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.urlLoading` failed because native instance was not in the instance manager.", "")))));
        }
    }
}
