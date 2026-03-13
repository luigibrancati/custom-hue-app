package Ae;

import Fe.C0843e;
import gc.C4207u;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.y;
import pe.z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile h f494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f495c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final List b(List protocols) {
            AbstractC4862t.e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((z) obj) != z.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((z) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            AbstractC4862t.e(protocols, "protocols");
            C0843e c0843e = new C0843e();
            for (String str : b(protocols)) {
                c0843e.writeByte(str.length());
                c0843e.T(str);
            }
            return c0843e.H();
        }

        public final h d() {
            Be.c.f845a.b();
            h hVarA = Ae.a.f463e.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f466e.a();
            AbstractC4862t.b(hVarA2);
            return hVarA2;
        }

        public final h e() {
            g gVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f474e.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f471e.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.f490e.a()) != null) {
                return gVarA;
            }
            f fVarA = f.f487d.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f478i.a();
            return hVarA != null ? hVarA : new h();
        }

        public final h f() {
            return h() ? d() : e();
        }

        public final h g() {
            return h.f494b;
        }

        public final boolean h() {
            return AbstractC4862t.a("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            return AbstractC4862t.a("BC", Security.getProviders()[0].getName());
        }

        public final boolean j() {
            return AbstractC4862t.a("Conscrypt", Security.getProviders()[0].getName());
        }

        public final boolean k() {
            return AbstractC4862t.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f493a = aVar;
        f494b = aVar.f();
        f495c = Logger.getLogger(y.class.getName());
    }

    public static /* synthetic */ void l(h hVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        hVar.k(str, i10, th);
    }

    public void b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
    }

    public De.c c(X509TrustManager trustManager) {
        AbstractC4862t.e(trustManager, "trustManager");
        return new De.a(d(trustManager));
    }

    public De.e d(X509TrustManager trustManager) {
        AbstractC4862t.e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        AbstractC4862t.d(acceptedIssuers, "getAcceptedIssuers(...)");
        return new De.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC4862t.e(socket, "socket");
        AbstractC4862t.e(address, "address");
        socket.connect(address, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        AbstractC4862t.e(closer, "closer");
        if (f495c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        AbstractC4862t.e(hostname, "hostname");
        return true;
    }

    public void k(String message, int i10, Throwable th) {
        AbstractC4862t.e(message, "message");
        f495c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        AbstractC4862t.e(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC4862t.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        AbstractC4862t.e(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            AbstractC4862t.d(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC4862t.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC4862t.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC4862t.d(string, "toString(...)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC4862t.d(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
