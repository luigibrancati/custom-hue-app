package pe;

import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4206t;
import gc.C4207u;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f42862e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f42863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f42864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f42866d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: pe.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0572a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f42867a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0572a(List list) {
                super(0);
                this.f42867a = list;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f42867a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f42868a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f42868a = list;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f42868a;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final t a(SSLSession sSLSession) throws IOException {
            List listK;
            AbstractC4862t.e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (AbstractC4862t.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : AbstractC4862t.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.f42735b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (AbstractC4862t.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            F fA = F.Companion.a(protocol);
            try {
                listK = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = C4206t.k();
            }
            return new t(fA, iVarB, c(sSLSession.getLocalCertificates()), new b(listK));
        }

        public final t b(F tlsVersion, i cipherSuite, List peerCertificates, List localCertificates) {
            AbstractC4862t.e(tlsVersion, "tlsVersion");
            AbstractC4862t.e(cipherSuite, "cipherSuite");
            AbstractC4862t.e(peerCertificates, "peerCertificates");
            AbstractC4862t.e(localCertificates, "localCertificates");
            return new t(tlsVersion, cipherSuite, qe.p.s(localCertificates), new C0572a(qe.p.s(peerCertificates)));
        }

        public final List c(Certificate[] certificateArr) {
            return certificateArr != null ? qe.p.j(Arrays.copyOf(certificateArr, certificateArr.length)) : C4206t.k();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f42869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6082a interfaceC6082a) {
            super(0);
            this.f42869a = interfaceC6082a;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f42869a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C4206t.k();
            }
        }
    }

    public t(F tlsVersion, i cipherSuite, List localCertificates, InterfaceC6082a peerCertificatesFn) {
        AbstractC4862t.e(tlsVersion, "tlsVersion");
        AbstractC4862t.e(cipherSuite, "cipherSuite");
        AbstractC4862t.e(localCertificates, "localCertificates");
        AbstractC4862t.e(peerCertificatesFn, "peerCertificatesFn");
        this.f42863a = tlsVersion;
        this.f42864b = cipherSuite;
        this.f42865c = localCertificates;
        this.f42866d = C4029l.b(new b(peerCertificatesFn));
    }

    public final i a() {
        return this.f42864b;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC4862t.d(type, "getType(...)");
        return type;
    }

    public final List c() {
        return this.f42865c;
    }

    public final List d() {
        return (List) this.f42866d.getValue();
    }

    public final F e() {
        return this.f42863a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f42863a == this.f42863a && AbstractC4862t.a(tVar.f42864b, this.f42864b) && AbstractC4862t.a(tVar.d(), d()) && AbstractC4862t.a(tVar.f42865c, this.f42865c);
    }

    public int hashCode() {
        return ((((((527 + this.f42863a.hashCode()) * 31) + this.f42864b.hashCode()) * 31) + d().hashCode()) * 31) + this.f42865c.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f42863a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f42864b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List list = this.f42865c;
        ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
