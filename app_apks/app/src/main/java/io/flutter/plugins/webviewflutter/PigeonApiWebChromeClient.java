package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4205s;
import gc.C4206t;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u000eJ/\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010#\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b#\u0010$J7\u0010'\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b'\u0010(J?\u0010-\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b-\u0010.J/\u0010/\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b/\u0010\u0018J?\u00102\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00100\u001a\u00020\"2\u0006\u0010,\u001a\u0002012\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b2\u00103J/\u00104\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b4\u0010\u0018J7\u00107\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00109\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b:\u0010;JG\u0010<\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00109\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b<\u0010;JQ\u0010>\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00109\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"2\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeonRegistrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;", "pigeon_defaultConstructor", "()Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;", "pigeon_instance", "", "value", "Lfc/H;", "setSynchronousReturnValueForOnShowFileChooser", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Z)V", "setSynchronousReturnValueForOnConsoleMessage", "setSynchronousReturnValueForOnJsAlert", "setSynchronousReturnValueForOnJsConfirm", "setSynchronousReturnValueForOnJsPrompt", "pigeon_instanceArg", "Lkotlin/Function1;", "Lfc/r;", "callback", "pigeon_newInstance", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Lvc/l;)V", "Landroid/webkit/WebView;", "webViewArg", "", "progressArg", "onProgressChanged", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;JLvc/l;)V", "Landroid/webkit/WebChromeClient$FileChooserParams;", "paramsArg", "", "", "onShowFileChooser", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Landroid/webkit/WebChromeClient$FileChooserParams;Lvc/l;)V", "Landroid/webkit/PermissionRequest;", "requestArg", "onPermissionRequest", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/PermissionRequest;Lvc/l;)V", "Landroid/view/View;", "viewArg", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "callbackArg", "onShowCustomView", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;Lvc/l;)V", "onHideCustomView", "originArg", "Landroid/webkit/GeolocationPermissions$Callback;", "onGeolocationPermissionsShowPrompt", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;Lvc/l;)V", "onGeolocationPermissionsHidePrompt", "Landroid/webkit/ConsoleMessage;", "messageArg", "onConsoleMessage", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/ConsoleMessage;Lvc/l;)V", "urlArg", "onJsAlert", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lvc/l;)V", "onJsConfirm", "defaultValueArg", "onJsPrompt", "(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/l;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PigeonApiWebChromeClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "api", "Lfc/H;", "setUpMessageHandlers", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebChromeClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebChromeClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsPrompt(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnShowFileChooser(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnConsoleMessage(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsAlert(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsConfirm(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiWebChromeClient api) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.j1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.l1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.m1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.n1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebChromeClient(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        AbstractC4862t.e(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConsoleMessage$lambda$7(vc.l lVar, String str, Object obj) {
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
    public static final void onGeolocationPermissionsHidePrompt$lambda$6(vc.l lVar, String str, Object obj) {
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
    public static final void onGeolocationPermissionsShowPrompt$lambda$5(vc.l lVar, String str, Object obj) {
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
    public static final void onHideCustomView$lambda$4(vc.l lVar, String str, Object obj) {
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
    public static final void onJsAlert$lambda$8(vc.l lVar, String str, Object obj) {
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
    public static final void onJsConfirm$lambda$9(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            C4035r.a aVar3 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("null-error", "Flutter api returned null value for non-null return value.", "")))));
            return;
        }
        Object obj4 = list.get(0);
        AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj4;
        bool.booleanValue();
        lVar.invoke(C4035r.a(C4035r.b(bool)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsPrompt$lambda$10(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            lVar.invoke(C4035r.a(C4035r.b((String) list.get(0))));
            return;
        }
        C4035r.a aVar2 = C4035r.f34274b;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionRequest$lambda$2(vc.l lVar, String str, Object obj) {
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
    public static final void onProgressChanged$lambda$0(vc.l lVar, String str, Object obj) {
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
    public static final void onShowCustomView$lambda$3(vc.l lVar, String str, Object obj) {
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
    public static final void onShowFileChooser$lambda$1(vc.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            C4035r.a aVar2 = C4035r.f34274b;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            C4035r.a aVar3 = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("null-error", "Flutter api returned null value for non-null return value.", "")))));
        } else {
            Object obj4 = list.get(0);
            AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            lVar.invoke(C4035r.a(C4035r.b((List) obj4)));
        }
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void onConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, ConsoleMessage messageArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(messageArg, "messageArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, messageArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.f1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onConsoleMessage$lambda$7(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onGeolocationPermissionsHidePrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", getPigeonRegistrar().getCodec()).send(C4205s.d(pigeon_instanceArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.i1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onGeolocationPermissionsHidePrompt$lambda$6(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onGeolocationPermissionsShowPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, String originArg, GeolocationPermissions.Callback callbackArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(originArg, "originArg");
        AbstractC4862t.e(callbackArg, "callbackArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, originArg, callbackArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.g1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onGeolocationPermissionsShowPrompt$lambda$5(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onHideCustomView(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", getPigeonRegistrar().getCodec()).send(C4205s.d(pigeon_instanceArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.Y0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onHideCustomView$lambda$4(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onJsAlert(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(messageArg, "messageArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg, messageArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.b1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onJsAlert$lambda$8(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(messageArg, "messageArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg, messageArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.h1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onJsConfirm$lambda$9(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(urlArg, "urlArg");
        AbstractC4862t.e(messageArg, "messageArg");
        AbstractC4862t.e(defaultValueArg, "defaultValueArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, urlArg, messageArg, defaultValueArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.a1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onJsPrompt$lambda$10(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onPermissionRequest(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, PermissionRequest requestArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(requestArg, "requestArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, requestArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.d1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onPermissionRequest$lambda$2(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onProgressChanged(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, long progressArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, Long.valueOf(progressArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.Z0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onProgressChanged$lambda$0(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onShowCustomView(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, View viewArg, WebChromeClient.CustomViewCallback callbackArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(viewArg, "viewArg");
        AbstractC4862t.e(callbackArg, "callbackArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, viewArg, callbackArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.e1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onShowCustomView$lambda$3(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void onShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, WebChromeClient.FileChooserParams paramsArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(webViewArg, "webViewArg");
        AbstractC4862t.e(paramsArg, "paramsArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, webViewArg, paramsArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.c1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebChromeClient.onShowFileChooser$lambda$1(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public abstract WebChromeClientProxyApi.WebChromeClientImpl pigeon_defaultConstructor();

    public final void pigeon_newInstance(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        } else {
            C4035r.a aVar3 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", "")))));
        }
    }

    public abstract void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instance, boolean value);

    public abstract void setSynchronousReturnValueForOnJsAlert(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instance, boolean value);

    public abstract void setSynchronousReturnValueForOnJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instance, boolean value);

    public abstract void setSynchronousReturnValueForOnJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instance, boolean value);

    public abstract void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instance, boolean value);
}
