package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4205s;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import io.sentry.protocol.FeatureFlag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\fJ!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\fJ\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\fJ\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bH&¢\u0006\u0004\b\u001b\u0010\fJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b\u001d\u0010\fJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b\u001f\u0010\fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b \u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b!\u0010\fJ\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J/\u00100\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00062\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0.\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeonRegistrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "Landroid/webkit/WebSettings;", "pigeon_instance", "", FeatureFlag.JsonKeys.FLAG, "Lfc/H;", "setDomStorageEnabled", "(Landroid/webkit/WebSettings;Z)V", "setJavaScriptCanOpenWindowsAutomatically", "support", "setSupportMultipleWindows", "setJavaScriptEnabled", "", "userAgentString", "setUserAgentString", "(Landroid/webkit/WebSettings;Ljava/lang/String;)V", "require", "setMediaPlaybackRequiresUserGesture", "setSupportZoom", "overview", "setLoadWithOverviewMode", "use", "setUseWideViewPort", "enabled", "setDisplayZoomControls", "setBuiltInZoomControls", "setAllowFileAccess", "setAllowContentAccess", "setGeolocationEnabled", "", "textZoom", "setTextZoom", "(Landroid/webkit/WebSettings;J)V", "getUserAgentString", "(Landroid/webkit/WebSettings;)Ljava/lang/String;", "Lio/flutter/plugins/webviewflutter/MixedContentMode;", "mode", "setMixedContentMode", "(Landroid/webkit/WebSettings;Lio/flutter/plugins/webviewflutter/MixedContentMode;)V", "pigeon_instanceArg", "Lkotlin/Function1;", "Lfc/r;", "callback", "pigeon_newInstance", "(Landroid/webkit/WebSettings;Lvc/l;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PigeonApiWebSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "api", "Lfc/H;", "setUpMessageHandlers", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDomStorageEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setMediaPlaybackRequiresUserGesture(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$13$lambda$12(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportZoom(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$15$lambda$14(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setLoadWithOverviewMode(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$17$lambda$16(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setUseWideViewPort(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$19$lambda$18(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDisplayZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$21$lambda$20(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setBuiltInZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$23$lambda$22(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowFileAccess(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$25$lambda$24(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowContentAccess(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$27$lambda$26(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setGeolocationEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$29$lambda$28(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebSettings.setTextZoom(webSettings, ((Long) obj3).longValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptCanOpenWindowsAutomatically(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$31$lambda$30(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                listWrapError = C4205s.d(pigeonApiWebSettings.getUserAgentString((WebSettings) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$33$lambda$32(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
            try {
                pigeonApiWebSettings.setMixedContentMode(webSettings, (MixedContentMode) obj3);
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportMultipleWindows(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                pigeonApiWebSettings.setUserAgentString((WebSettings) obj2, (String) list.get(1));
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiWebSettings api) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.J1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.K1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.w1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.y1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.A1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.B1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.C1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.D1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.E1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.F1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.G1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.H1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.I1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebSettings(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        AbstractC4862t.e(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
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

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract String getUserAgentString(WebSettings pigeon_instance);

    public final void pigeon_newInstance(WebSettings pigeon_instanceArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(C4205s.d(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.t1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebSettings.pigeon_newInstance$lambda$0(callback, str, obj);
                }
            });
        }
    }

    public abstract void setAllowContentAccess(WebSettings pigeon_instance, boolean enabled);

    public abstract void setAllowFileAccess(WebSettings pigeon_instance, boolean enabled);

    public abstract void setBuiltInZoomControls(WebSettings pigeon_instance, boolean enabled);

    public abstract void setDisplayZoomControls(WebSettings pigeon_instance, boolean enabled);

    public abstract void setDomStorageEnabled(WebSettings pigeon_instance, boolean flag);

    public abstract void setGeolocationEnabled(WebSettings pigeon_instance, boolean enabled);

    public abstract void setJavaScriptCanOpenWindowsAutomatically(WebSettings pigeon_instance, boolean flag);

    public abstract void setJavaScriptEnabled(WebSettings pigeon_instance, boolean flag);

    public abstract void setLoadWithOverviewMode(WebSettings pigeon_instance, boolean overview);

    public abstract void setMediaPlaybackRequiresUserGesture(WebSettings pigeon_instance, boolean require);

    public abstract void setMixedContentMode(WebSettings pigeon_instance, MixedContentMode mode);

    public abstract void setSupportMultipleWindows(WebSettings pigeon_instance, boolean support);

    public abstract void setSupportZoom(WebSettings pigeon_instance, boolean support);

    public abstract void setTextZoom(WebSettings pigeon_instance, long textZoom);

    public abstract void setUseWideViewPort(WebSettings pigeon_instance, boolean use);

    public abstract void setUserAgentString(WebSettings pigeon_instance, String userAgentString);
}
