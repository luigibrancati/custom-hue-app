package De;

import Fe.L;
import Od.C;
import Od.F;
import gc.C4179C;
import gc.C4206t;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC4862t;
import qe.f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2701a = new d();

    public final List a(X509Certificate certificate) {
        AbstractC4862t.e(certificate, "certificate");
        return C4179C.C0(c(certificate, 7), c(certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        AbstractC4862t.d(US, "US");
        String lowerCase = str.toLowerCase(US);
        AbstractC4862t.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final List c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C4206t.k();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC4862t.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C4206t.k();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) L.b(str, 0, 0, 3, null));
    }

    public final boolean e(String host, X509Certificate certificate) {
        AbstractC4862t.e(host, "host");
        AbstractC4862t.e(certificate, "certificate");
        return f.a(host) ? h(host, certificate) : g(host, certificate);
    }

    public final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !C.P(str, ".", false, 2, null) && !C.D(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !C.P(str2, ".", false, 2, null) && !C.D(str2, "..", false, 2, null)) {
            if (!C.D(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!C.D(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strB = b(str2);
            if (!F.V(strB, "*", false, 2, null)) {
                return AbstractC4862t.a(str3, strB);
            }
            if (!C.P(strB, "*.", false, 2, null) || F.h0(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || AbstractC4862t.a("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            AbstractC4862t.d(strSubstring, "substring(...)");
            if (!C.D(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || F.n0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if (listC != null && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f2701a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String strK = f.k(str);
        List listC = c(x509Certificate, 7);
        if (listC != null && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(strK, f.k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        AbstractC4862t.e(host, "host");
        AbstractC4862t.e(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC4862t.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
