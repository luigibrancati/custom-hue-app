package ve;

import Od.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.HttpHeaders;
import pe.B;
import pe.C;
import pe.C5464A;
import pe.E;
import pe.v;
import pe.w;
import pe.y;
import qe.p;
import ue.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46056b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f46057a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public j(y client) {
        AbstractC4862t.e(client, "client");
        this.f46057a = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = qe.l.u(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r7 = r0.n(r6).c();
        r0 = r1.t();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r0.m() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r1.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r1.o(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0.d() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r1.o(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        qe.m.f(r7.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r8 > 20) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r11.a(r0).D().q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    @Override // pe.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pe.C a(pe.w.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.AbstractC4862t.e(r11, r0)
            ve.g r11 = (ve.g) r11
            pe.A r0 = r11.i()
            ue.k r1 = r11.e()
            java.util.List r2 = gc.C4206t.k()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.n(r0, r6, r11)
            boolean r6 = r1.c()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto Lac
            pe.C r6 = r11.a(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L93
            pe.C$a r6 = r6.D()     // Catch: java.lang.Throwable -> L35
            pe.C$a r0 = r6.q(r0)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L38
            pe.C r6 = qe.l.u(r7)     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r10 = move-exception
            goto Lb4
        L38:
            r6 = r4
        L39:
            pe.C$a r0 = r0.n(r6)     // Catch: java.lang.Throwable -> L35
            pe.C r7 = r0.c()     // Catch: java.lang.Throwable -> L35
            ue.e r0 = r1.t()     // Catch: java.lang.Throwable -> L35
            pe.A r6 = r10.c(r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r10 = r0.m()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L56
            r1.D()     // Catch: java.lang.Throwable -> L35
        L56:
            r1.o(r3)
            return r7
        L5a:
            pe.B r0 = r6.a()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L6a
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L6a
            r1.o(r3)
            return r7
        L6a:
            pe.D r0 = r7.b()     // Catch: java.lang.Throwable -> L35
            qe.m.f(r0)     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7c
            r1.o(r5)
            r0 = r6
            goto L18
        L7c:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r11.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Too many follow-up requests: "
            r11.append(r0)     // Catch: java.lang.Throwable -> L35
            r11.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L35
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        L93:
            r6 = move-exception
            boolean r9 = r6 instanceof xe.C6363a     // Catch: java.lang.Throwable -> L35
            r9 = r9 ^ r5
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto La7
            java.util.List r2 = gc.C4179C.D0(r2, r6)     // Catch: java.lang.Throwable -> L35
            r1.o(r5)
            r6 = r3
            goto L19
        La7:
            java.lang.Throwable r10 = qe.m.J(r6, r2)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        Lac:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "Canceled"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        Lb4:
            r1.o(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.j.a(pe.w$a):pe.C");
    }

    public final C5464A b(C c10, String str) {
        String strM;
        v vVarP;
        if (!this.f46057a.n() || (strM = C.m(c10, HttpHeaders.LOCATION, null, 2, null)) == null || (vVarP = c10.K().k().p(strM)) == null) {
            return null;
        }
        if (!AbstractC4862t.a(vVarP.q(), c10.K().k().q()) && !this.f46057a.o()) {
            return null;
        }
        C5464A.a aVarJ = c10.K().j();
        if (f.b(str)) {
            int iG = c10.g();
            f fVar = f.f46042a;
            boolean z10 = fVar.d(str) || iG == 308 || iG == 307;
            if (!fVar.c(str) || iG == 308 || iG == 307) {
                aVarJ.n(str, z10 ? c10.K().a() : null);
            } else {
                aVarJ.n("GET", null);
            }
            if (!z10) {
                aVarJ.o("Transfer-Encoding");
                aVarJ.o(HttpHeaders.CONTENT_LENGTH);
                aVarJ.o(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!p.e(c10.K().k(), vVarP)) {
            aVarJ.o("Authorization");
        }
        return aVarJ.s(vVarP).b();
    }

    public final C5464A c(C c10, ue.e eVar) throws ProtocolException {
        l lVarH;
        E eT = (eVar == null || (lVarH = eVar.h()) == null) ? null : lVarH.t();
        int iG = c10.g();
        String strI = c10.K().i();
        if (iG != 307 && iG != 308) {
            if (iG == 401) {
                return this.f46057a.e().a(eT, c10);
            }
            if (iG == 421) {
                B bA = c10.K().a();
                if ((bA != null && bA.d()) || eVar == null || !eVar.l()) {
                    return null;
                }
                eVar.h().s();
                return c10.K();
            }
            if (iG == 503) {
                C cF = c10.F();
                if ((cF == null || cF.g() != 503) && g(c10, Integer.MAX_VALUE) == 0) {
                    return c10.K();
                }
                return null;
            }
            if (iG == 407) {
                AbstractC4862t.b(eT);
                if (eT.b().type() == Proxy.Type.HTTP) {
                    return this.f46057a.v().a(eT, c10);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iG == 408) {
                if (!this.f46057a.x()) {
                    return null;
                }
                B bA2 = c10.K().a();
                if (bA2 != null && bA2.d()) {
                    return null;
                }
                C cF2 = c10.F();
                if ((cF2 == null || cF2.g() != 408) && g(c10, 0) <= 0) {
                    return c10.K();
                }
                return null;
            }
            switch (iG) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(c10, strI);
    }

    public final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean e(IOException iOException, ue.k kVar, C5464A c5464a, boolean z10) {
        if (this.f46057a.x()) {
            return !(z10 && f(iOException, c5464a)) && d(iOException, z10) && kVar.C();
        }
        return false;
    }

    public final boolean f(IOException iOException, C5464A c5464a) {
        B bA = c5464a.a();
        return (bA != null && bA.d()) || (iOException instanceof FileNotFoundException);
    }

    public final int g(C c10, int i10) {
        String strM = C.m(c10, "Retry-After", null, 2, null);
        if (strM == null) {
            return i10;
        }
        if (!new o("\\d+").i(strM)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM);
        AbstractC4862t.d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }
}
