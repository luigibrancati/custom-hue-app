package Ae;

import Be.i;
import Be.j;
import Be.k;
import android.security.NetworkSecurityPolicy;
import gc.C4206t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f466e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f467f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f468d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f467f;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: Ae.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0015b implements De.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f470b;

        public C0015b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            AbstractC4862t.e(trustManager, "trustManager");
            AbstractC4862t.e(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f469a = trustManager;
            this.f470b = findByIssuerAndSignatureMethod;
        }

        @Override // De.e
        public X509Certificate a(X509Certificate cert) {
            AbstractC4862t.e(cert, "cert");
            try {
                Object objInvoke = this.f470b.invoke(this.f469a, cert);
                AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0015b)) {
                return false;
            }
            C0015b c0015b = (C0015b) obj;
            return AbstractC4862t.a(this.f469a, c0015b.f469a) && AbstractC4862t.a(this.f470b, c0015b.f470b);
        }

        public int hashCode() {
            return (this.f469a.hashCode() * 31) + this.f470b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f469a + ", findByIssuerAndSignatureMethod=" + this.f470b + ')';
        }
    }

    static {
        h.f493a.h();
        f467f = false;
    }

    public b() {
        List listP = C4206t.p(k.a.b(k.f863j, null, 1, null), new i(Be.f.f849f.d()), new i(Be.h.f859a.a()), new i(Be.g.f857a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f468d = arrayList;
    }

    @Override // Ae.h
    public De.c c(X509TrustManager trustManager) {
        AbstractC4862t.e(trustManager, "trustManager");
        Be.b bVarA = Be.b.f842d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // Ae.h
    public De.e d(X509TrustManager trustManager) {
        AbstractC4862t.e(trustManager, "trustManager");
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            AbstractC4862t.b(declaredMethod);
            return new C0015b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // Ae.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        Iterator it = this.f468d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((j) next).a(sslSocket)) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            jVar.c(sslSocket, str, protocols);
        }
    }

    @Override // Ae.h
    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC4862t.e(socket, "socket");
        AbstractC4862t.e(address, "address");
        socket.connect(address, i10);
    }

    @Override // Ae.h
    public String h(SSLSocket sslSocket) {
        Object next;
        AbstractC4862t.e(sslSocket, "sslSocket");
        Iterator it = this.f468d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((j) next).a(sslSocket)) {
                break;
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            return jVar.b(sslSocket);
        }
        return null;
    }

    @Override // Ae.h
    public boolean j(String hostname) {
        AbstractC4862t.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
