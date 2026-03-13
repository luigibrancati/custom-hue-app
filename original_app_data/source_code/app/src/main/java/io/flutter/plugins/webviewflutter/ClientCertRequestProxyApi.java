package io.flutter.plugins.webviewflutter;

import android.webkit.ClientCertRequest;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ClientCertRequestProxyApi extends PigeonApiClientCertRequest {
    public ClientCertRequestProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest
    public void cancel(ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest
    public void ignore(ClientCertRequest clientCertRequest) {
        clientCertRequest.ignore();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest
    public void proceed(ClientCertRequest clientCertRequest, PrivateKey privateKey, List<? extends X509Certificate> list) {
        clientCertRequest.proceed(privateKey, (X509Certificate[]) list.toArray(new X509Certificate[0]));
    }
}
