package Be;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0024a f841a = new C0024a(null);

    /* JADX INFO: renamed from: Be.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0024a {
        public /* synthetic */ C0024a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return Ae.h.f493a.h();
        }

        public C0024a() {
        }
    }

    @Override // Be.j
    public boolean a(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // Be.j
    public String b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : AbstractC4862t.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // Be.j
    public void c(SSLSocket sslSocket, String str, List protocols) throws IOException {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) Ae.h.f493a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // Be.j
    public boolean isSupported() {
        return f841a.b();
    }
}
