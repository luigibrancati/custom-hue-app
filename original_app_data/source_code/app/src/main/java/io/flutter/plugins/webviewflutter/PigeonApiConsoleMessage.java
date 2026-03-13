package io.flutter.plugins.webviewflutter;

import android.webkit.ConsoleMessage;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4206t;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00062\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiConsoleMessage;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeonRegistrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "Landroid/webkit/ConsoleMessage;", "pigeon_instance", "", "lineNumber", "(Landroid/webkit/ConsoleMessage;)J", "", "message", "(Landroid/webkit/ConsoleMessage;)Ljava/lang/String;", "Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel;", "level", "(Landroid/webkit/ConsoleMessage;)Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel;", "sourceId", "pigeon_instanceArg", "Lkotlin/Function1;", "Lfc/r;", "Lfc/H;", "callback", "pigeon_newInstance", "(Landroid/webkit/ConsoleMessage;Lvc/l;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PigeonApiConsoleMessage {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public PigeonApiConsoleMessage(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract ConsoleMessageLevel level(ConsoleMessage pigeon_instance);

    public abstract long lineNumber(ConsoleMessage pigeon_instance);

    public abstract String message(ConsoleMessage pigeon_instance);

    public final void pigeon_newInstance(ConsoleMessage pigeon_instanceArg, final vc.l callback) {
        AbstractC4862t.e(pigeon_instanceArg, "pigeon_instanceArg");
        AbstractC4862t.e(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C4035r.a aVar2 = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        long jAddHostCreatedInstance = getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg);
        long jLineNumber = lineNumber(pigeon_instanceArg);
        final String str = "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance";
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(C4206t.n(Long.valueOf(jAddHostCreatedInstance), Long.valueOf(jLineNumber), message(pigeon_instanceArg), level(pigeon_instanceArg), sourceId(pigeon_instanceArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.Y
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                PigeonApiConsoleMessage.pigeon_newInstance$lambda$0(callback, str, obj);
            }
        });
    }

    public abstract String sourceId(ConsoleMessage pigeon_instance);
}
