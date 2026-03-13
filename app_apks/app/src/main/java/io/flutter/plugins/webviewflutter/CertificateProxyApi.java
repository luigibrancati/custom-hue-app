package io.flutter.plugins.webviewflutter;

import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class CertificateProxyApi extends PigeonApiCertificate {
    public CertificateProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCertificate
    public byte[] getEncoded(Certificate certificate) {
        try {
            return certificate.getEncoded();
        } catch (CertificateEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }
}
