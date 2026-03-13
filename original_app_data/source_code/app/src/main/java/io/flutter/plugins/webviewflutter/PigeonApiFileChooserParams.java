package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00062\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeonRegistrar", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "Landroid/webkit/WebChromeClient$FileChooserParams;", "pigeon_instance", "", "isCaptureEnabled", "(Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "", "", "acceptTypes", "(Landroid/webkit/WebChromeClient$FileChooserParams;)Ljava/util/List;", "Lio/flutter/plugins/webviewflutter/FileChooserMode;", "mode", "(Landroid/webkit/WebChromeClient$FileChooserParams;)Lio/flutter/plugins/webviewflutter/FileChooserMode;", "filenameHint", "(Landroid/webkit/WebChromeClient$FileChooserParams;)Ljava/lang/String;", "pigeon_instanceArg", "Lkotlin/Function1;", "Lfc/r;", "Lfc/H;", "callback", "pigeon_newInstance", "(Landroid/webkit/WebChromeClient$FileChooserParams;Lvc/l;)V", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PigeonApiFileChooserParams {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public PigeonApiFileChooserParams(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract List<String> acceptTypes(WebChromeClient.FileChooserParams pigeon_instance);

    public abstract String filenameHint(WebChromeClient.FileChooserParams pigeon_instance);

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract boolean isCaptureEnabled(WebChromeClient.FileChooserParams pigeon_instance);

    public abstract FileChooserMode mode(WebChromeClient.FileChooserParams pigeon_instance);

    public final void pigeon_newInstance(WebChromeClient.FileChooserParams pigeon_instanceArg, final vc.l callback) {
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
        boolean zIsCaptureEnabled = isCaptureEnabled(pigeon_instanceArg);
        final String str = "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance";
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(C4206t.n(Long.valueOf(jAddHostCreatedInstance), Boolean.valueOf(zIsCaptureEnabled), acceptTypes(pigeon_instanceArg), mode(pigeon_instanceArg), filenameHint(pigeon_instanceArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.j0
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                PigeonApiFileChooserParams.pigeon_newInstance$lambda$0(callback, str, obj);
            }
        });
    }
}
