package B7;

import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f705b;

    public S(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f705b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f705b;
    }
}
