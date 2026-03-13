package Ae;

import Od.B;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f487d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f489f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f488e;
        }

        public a() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numU = property != null ? B.u(property) : null;
        f489f = numU;
        boolean z10 = false;
        if (numU == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numU.intValue() >= 9) {
            z10 = true;
        }
        f488e = z10;
    }

    @Override // Ae.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) h.f493a.b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // Ae.h
    public String h(SSLSocket sslSocket) {
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

    @Override // Ae.h
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = f489f;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            AbstractC4862t.d(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        AbstractC4862t.b(sSLContext);
        return sSLContext;
    }
}
