package ve;

import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5464A;
import pe.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f46055a = new i();

    public final String a(C5464A request, Proxy.Type proxyType) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.i());
        sb2.append(' ');
        i iVar = f46055a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.k());
        } else {
            sb2.append(iVar.c(request.k()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final boolean b(C5464A c5464a, Proxy.Type type) {
        return !c5464a.h() && type == Proxy.Type.HTTP;
    }

    public final String c(v url) {
        AbstractC4862t.e(url, "url");
        String strC = url.c();
        String strE = url.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
