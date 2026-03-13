package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class SslCertificateDNameProxyApi extends PigeonApiSslCertificateDName {
    public SslCertificateDNameProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificateDName
    public String getCName(SslCertificate.DName dName) {
        return dName.getCName();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificateDName
    public String getDName(SslCertificate.DName dName) {
        return dName.getDName();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificateDName
    public String getOName(SslCertificate.DName dName) {
        return dName.getOName();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificateDName
    public String getUName(SslCertificate.DName dName) {
        return dName.getUName();
    }
}
