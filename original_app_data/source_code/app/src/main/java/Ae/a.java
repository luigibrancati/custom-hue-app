package Ae;

import Be.i;
import Be.j;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0014a f463e = new C0014a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f464f = h.f493a.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f465d;

    /* JADX INFO: renamed from: Ae.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0014a {
        public /* synthetic */ C0014a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f464f;
        }

        public C0014a() {
        }
    }

    public a() {
        List listP = C4206t.p(Be.a.f841a.a(), new i(Be.f.f849f.d()), new i(Be.h.f859a.a()), new i(Be.g.f857a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f465d = arrayList;
    }

    @Override // Ae.h
    public De.c c(X509TrustManager trustManager) {
        AbstractC4862t.e(trustManager, "trustManager");
        Be.b bVarA = Be.b.f842d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // Ae.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        Iterator it = this.f465d.iterator();
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
    public String h(SSLSocket sslSocket) {
        Object next;
        AbstractC4862t.e(sslSocket, "sslSocket");
        Iterator it = this.f465d.iterator();
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
    public Object i(String closer) {
        AbstractC4862t.e(closer, "closer");
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open(closer);
        return closeGuard;
    }

    @Override // Ae.h
    public boolean j(String hostname) {
        AbstractC4862t.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // Ae.h
    public void m(String message, Object obj) {
        AbstractC4862t.e(message, "message");
        AbstractC4862t.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
        ((CloseGuard) obj).warnIfOpen();
    }
}
