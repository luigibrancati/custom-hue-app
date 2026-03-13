package Be;

import Be.i;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f857a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.a f858b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements i.a {
        @Override // Be.i.a
        public boolean a(SSLSocket sslSocket) {
            AbstractC4862t.e(sslSocket, "sslSocket");
            Ae.c.f471e.b();
            return false;
        }

        @Override // Be.i.a
        public j b(SSLSocket sslSocket) {
            AbstractC4862t.e(sslSocket, "sslSocket");
            return new g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final i.a a() {
            return g.f858b;
        }

        public b() {
        }
    }

    @Override // Be.j
    public boolean a(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        return false;
    }

    @Override // Be.j
    public String b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC4862t.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Be.j
    public void c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Ae.h.f493a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // Be.j
    public boolean isSupported() {
        return Ae.c.f471e.b();
    }
}
