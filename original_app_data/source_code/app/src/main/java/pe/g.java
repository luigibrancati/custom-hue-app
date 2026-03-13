package pe;

import Fe.C0846h;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f42671c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f42672d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f42673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final De.c f42674b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f42675a = new ArrayList();

        public final g a() {
            return new g(C4179C.Z0(this.f42675a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a(Certificate certificate) {
            AbstractC4862t.e(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).a();
        }

        public final C0846h b(X509Certificate x509Certificate) {
            AbstractC4862t.e(x509Certificate, "<this>");
            C0846h.a aVar = C0846h.f4117d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC4862t.d(encoded, "getEncoded(...)");
            return C0846h.a.f(aVar, encoded, 0, 0, 3, null).M();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f42677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f42678c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, String str) {
            super(0);
            this.f42677b = list;
            this.f42678c = str;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listA;
            De.c cVarD = g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f42677b, this.f42678c)) == null) {
                listA = this.f42677b;
            }
            ArrayList arrayList = new ArrayList(C4207u.v(listA, 10));
            for (Certificate certificate : listA) {
                AbstractC4862t.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(Set pins, De.c cVar) {
        AbstractC4862t.e(pins, "pins");
        this.f42673a = pins;
        this.f42674b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        AbstractC4862t.e(hostname, "hostname");
        AbstractC4862t.e(peerCertificates, "peerCertificates");
        b(hostname, new c(peerCertificates, hostname));
    }

    public final void b(String hostname, InterfaceC6082a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        AbstractC4862t.e(hostname, "hostname");
        AbstractC4862t.e(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.a.a(it.next());
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f42671c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.a.a(it2.next());
            sb2.append("\n    ");
            sb2.append((Object) null);
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        AbstractC4862t.e(hostname, "hostname");
        Set set = this.f42673a;
        List listK = C4206t.k();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listK;
        }
        android.support.v4.media.session.a.a(it.next());
        throw null;
    }

    public final De.c d() {
        return this.f42674b;
    }

    public final g e(De.c certificateChainCleaner) {
        AbstractC4862t.e(certificateChainCleaner, "certificateChainCleaner");
        return AbstractC4862t.a(this.f42674b, certificateChainCleaner) ? this : new g(this.f42673a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC4862t.a(gVar.f42673a, this.f42673a) && AbstractC4862t.a(gVar.f42674b, this.f42674b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f42673a.hashCode()) * 41;
        De.c cVar = this.f42674b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ g(Set set, De.c cVar, int i10, AbstractC4854k abstractC4854k) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
