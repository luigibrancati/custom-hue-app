package io.flutter.plugins.webviewflutter;

import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4205s;
import gc.C4206t;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeonRegistrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "", "channelName", "Lio/flutter/plugins/webviewflutter/JavaScriptChannel;", "pigeon_defaultConstructor", "(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/JavaScriptChannel;", "pigeon_instanceArg", "Lkotlin/Function1;", "Lfc/r;", "Lfc/H;", "callback", "pigeon_newInstance", "(Lio/flutter/plugins/webviewflutter/JavaScriptChannel;Lvc/l;)V", "messageArg", "postMessage", "(Lio/flutter/plugins/webviewflutter/JavaScriptChannel;Ljava/lang/String;Lvc/l;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PigeonApiJavaScriptChannel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;", "api", "Lfc/H;", "setUpMessageHandlers", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiJavaScriptChannel pigeonApiJavaScriptChannel, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj2).longValue();
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiJavaScriptChannel.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiJavaScriptChannel.pigeon_defaultConstructor((String) obj3), jLongValue);
                listWrapError = C4205s.d(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiJavaScriptChannel api) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers$lambda$1$lambda$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        private Companion() {
        }
    }

    public PigeonApiJavaScriptChannel(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        AbstractC4862t.e(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postMessage$lambda$0(vc.l lVar, String str, Object obj) {
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

    public abstract JavaScriptChannel pigeon_defaultConstructor(String channelName);

    public final void pigeon_newInstance(JavaScriptChannel pigeon_instanceArg, vc.l callback) {
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
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", "")))));
        }
    }

    public final void postMessage(JavaScriptChannel pigeon_instanceArg, String messageArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(messageArg, "messageArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            final String str = "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", getPigeonRegistrar().getCodec()).send(C4206t.n(pigeon_instanceArg, messageArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.u0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiJavaScriptChannel.postMessage$lambda$0(callback, str, obj);
                }
            });
        } else {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "")))));
        }
    }
}
