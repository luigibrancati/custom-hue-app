package Be;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends De.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f842d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManager f843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f844c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final b a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            AbstractC4862t.e(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a() {
        }
    }

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC4862t.e(trustManager, "trustManager");
        AbstractC4862t.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f843b = trustManager;
        this.f844c = x509TrustManagerExtensions;
    }

    @Override // De.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        AbstractC4862t.e(chain, "chain");
        AbstractC4862t.e(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f844c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC4862t.d(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f843b == this.f843b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f843b);
    }
}
