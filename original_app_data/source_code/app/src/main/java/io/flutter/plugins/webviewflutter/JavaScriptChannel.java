package io.flutter.plugins.webviewflutter;

import android.webkit.JavascriptInterface;
import fc.C4015H;
import fc.C4035r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class JavaScriptChannel {
    private final JavaScriptChannelProxyApi api;
    final String javaScriptChannelName;

    public JavaScriptChannel(String str, JavaScriptChannelProxyApi javaScriptChannelProxyApi) {
        this.javaScriptChannelName = str;
        this.api = javaScriptChannelProxyApi;
    }

    public static /* synthetic */ C4015H b(C4035r c4035r) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessage$1(String str) {
        this.api.postMessage(this, str, new vc.l() { // from class: io.flutter.plugins.webviewflutter.N
            @Override // vc.l
            public final Object invoke(Object obj) {
                return JavaScriptChannel.b((C4035r) obj);
            }
        });
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.O
            @Override // java.lang.Runnable
            public final void run() {
                this.f38140a.lambda$postMessage$1(str);
            }
        });
    }
}
