package Be;

import Be.i;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f859a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.a f860b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements i.a {
        @Override // Be.i.a
        public boolean a(SSLSocket sslSocket) {
            AbstractC4862t.e(sslSocket, "sslSocket");
            return Ae.d.f474e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // Be.i.a
        public j b(SSLSocket sslSocket) {
            AbstractC4862t.e(sslSocket, "sslSocket");
            return new h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final i.a a() {
            return h.f860b;
        }

        public b() {
        }
    }

    @Override // Be.j
    public boolean a(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // Be.j
    public String b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // Be.j
    public void c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Ae.h.f493a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // Be.j
    public boolean isSupported() {
        return Ae.d.f474e.c();
    }
}
