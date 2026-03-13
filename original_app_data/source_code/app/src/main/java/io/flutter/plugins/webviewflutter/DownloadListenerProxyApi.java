package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import fc.C4015H;
import fc.C4035r;
import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DownloadListenerProxyApi extends PigeonApiDownloadListener {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerProxyApi api;

        public DownloadListenerImpl(DownloadListenerProxyApi downloadListenerProxyApi) {
            this.api = downloadListenerProxyApi;
        }

        public static /* synthetic */ C4015H a(C4035r c4035r) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStart$1(String str, String str2, String str3, String str4, long j10) {
            this.api.onDownloadStart(this, str, str2, str3, str4, j10, new vc.l() { // from class: io.flutter.plugins.webviewflutter.L
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return DownloadListenerProxyApi.DownloadListenerImpl.a((C4035r) obj);
                }
            });
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j10) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.M
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38126a.lambda$onDownloadStart$1(str, str2, str3, str4, j10);
                }
            });
        }
    }

    public DownloadListenerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    public DownloadListener pigeon_defaultConstructor() {
        return new DownloadListenerImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
