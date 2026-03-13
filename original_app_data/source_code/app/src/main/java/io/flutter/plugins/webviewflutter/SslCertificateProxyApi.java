package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class SslCertificateProxyApi extends PigeonApiSslCertificate {
    public SslCertificateProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    public SslCertificate.DName getIssuedBy(SslCertificate sslCertificate) {
        return sslCertificate.getIssuedBy();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    public SslCertificate.DName getIssuedTo(SslCertificate sslCertificate) {
        return sslCertificate.getIssuedTo();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    public Long getValidNotAfterMsSinceEpoch(SslCertificate sslCertificate) {
        Date validNotAfterDate = sslCertificate.getValidNotAfterDate();
        if (validNotAfterDate != null) {
            return Long.valueOf(validNotAfterDate.getTime());
        }
        return null;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    public Long getValidNotBeforeMsSinceEpoch(SslCertificate sslCertificate) {
        Date validNotBeforeDate = sslCertificate.getValidNotBeforeDate();
        if (validNotBeforeDate != null) {
            return Long.valueOf(validNotBeforeDate.getTime());
        }
        return null;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    public X509Certificate getX509Certificate(SslCertificate sslCertificate) {
        if (getPigeonRegistrar().sdkIsAtLeast(29)) {
            return sslCertificate.getX509Certificate();
        }
        Log.d("SslCertificateProxyApi", getPigeonRegistrar().createUnsupportedVersionMessage("SslCertificate.getX509Certificate", "Build.VERSION_CODES.Q"));
        return null;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
