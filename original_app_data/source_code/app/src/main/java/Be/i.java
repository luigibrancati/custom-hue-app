package Be;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f862b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        j b(SSLSocket sSLSocket);
    }

    public i(a socketAdapterFactory) {
        AbstractC4862t.e(socketAdapterFactory, "socketAdapterFactory");
        this.f861a = socketAdapterFactory;
    }

    @Override // Be.j
    public boolean a(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        return this.f861a.a(sslSocket);
    }

    @Override // Be.j
    public String b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        j jVarD = d(sslSocket);
        if (jVarD != null) {
            return jVarD.b(sslSocket);
        }
        return null;
    }

    @Override // Be.j
    public void c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        j jVarD = d(sslSocket);
        if (jVarD != null) {
            jVarD.c(sslSocket, str, protocols);
        }
    }

    public final synchronized j d(SSLSocket sSLSocket) {
        try {
            if (this.f862b == null && this.f861a.a(sSLSocket)) {
                this.f862b = this.f861a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f862b;
    }

    @Override // Be.j
    public boolean isSupported() {
        return true;
    }
}
