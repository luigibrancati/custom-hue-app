package ve;

import Fe.v;
import gc.C4206t;
import io.sentry.util.HttpUtils;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.HttpHeaders;
import pe.B;
import pe.C;
import pe.C5464A;
import pe.D;
import pe.n;
import pe.o;
import pe.w;
import pe.x;
import qe.p;

/* JADX INFO: renamed from: ve.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6106a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f46035a;

    public C6106a(o cookieJar) {
        AbstractC4862t.e(cookieJar, "cookieJar");
        this.f46035a = cookieJar;
    }

    @Override // pe.w
    public C a(w.a chain) {
        D dB;
        AbstractC4862t.e(chain, "chain");
        C5464A c5464aD = chain.d();
        C5464A.a aVarJ = c5464aD.j();
        B bA = c5464aD.a();
        if (bA != null) {
            x xVarB = bA.b();
            if (xVarB != null) {
                aVarJ.l(HttpHeaders.CONTENT_TYPE, xVarB.toString());
            }
            long jA = bA.a();
            if (jA != -1) {
                aVarJ.l(HttpHeaders.CONTENT_LENGTH, String.valueOf(jA));
                aVarJ.o("Transfer-Encoding");
            } else {
                aVarJ.l("Transfer-Encoding", "chunked");
                aVarJ.o(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z10 = false;
        if (c5464aD.e("Host") == null) {
            aVarJ.l("Host", p.r(c5464aD.k(), false, 1, null));
        }
        if (c5464aD.e("Connection") == null) {
            aVarJ.l("Connection", "Keep-Alive");
        }
        if (c5464aD.e("Accept-Encoding") == null && c5464aD.e("Range") == null) {
            aVarJ.l("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listA = this.f46035a.a(c5464aD.k());
        if (!listA.isEmpty()) {
            aVarJ.l(HttpUtils.COOKIE_HEADER_NAME, b(listA));
        }
        if (c5464aD.e("User-Agent") == null) {
            aVarJ.l("User-Agent", "okhttp/5.0.0-alpha.14");
        }
        C5464A c5464aB = aVarJ.b();
        C cA = chain.a(c5464aB);
        e.f(this.f46035a, c5464aB.k(), cA.o());
        C.a aVarQ = cA.D().q(c5464aB);
        if (z10 && Od.C.E("gzip", C.m(cA, HttpHeaders.CONTENT_ENCODING, null, 2, null), true) && e.b(cA) && (dB = cA.b()) != null) {
            Fe.p pVar = new Fe.p(dB.c());
            aVarQ.j(cA.o().f().g(HttpHeaders.CONTENT_ENCODING).g(HttpHeaders.CONTENT_LENGTH).d());
            aVarQ.b(new h(C.m(cA, HttpHeaders.CONTENT_TYPE, null, 2, null), -1L, v.c(pVar)));
        }
        return aVarQ.c();
    }

    public final String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            n nVar = (n) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(nVar.e());
            sb2.append('=');
            sb2.append(nVar.g());
            i10 = i11;
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
