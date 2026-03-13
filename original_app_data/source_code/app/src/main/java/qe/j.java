package qe;

import fc.C4034q;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import pe.B;
import pe.C5464A;
import pe.C5468d;
import pe.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final C5464A.a a(C5464A.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        aVar.h().a(name, value);
        return aVar;
    }

    public static final C5464A.a b(C5464A.a aVar, C5468d cacheControl) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        return string.length() == 0 ? aVar.o("Cache-Control") : aVar.l("Cache-Control", string);
    }

    public static final C5464A.a c(C5464A.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        return aVar.n("GET", null);
    }

    public static final String d(C5464A c5464a, String name) {
        AbstractC4862t.e(c5464a, "<this>");
        AbstractC4862t.e(name, "name");
        return c5464a.g().c(name);
    }

    public static final C5464A.a e(C5464A.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        aVar.h().h(name, value);
        return aVar;
    }

    public static final List f(C5464A c5464a, String name) {
        AbstractC4862t.e(c5464a, "<this>");
        AbstractC4862t.e(name, "name");
        return c5464a.g().k(name);
    }

    public static final C5464A.a g(C5464A.a aVar, u headers) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(headers, "headers");
        aVar.q(headers.f());
        return aVar;
    }

    public static final C5464A.a h(C5464A.a aVar, String method, B b10) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (b10 == null) {
            if (ve.f.e(method)) {
                throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
            }
        } else if (!ve.f.b(method)) {
            throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
        }
        aVar.r(method);
        aVar.p(b10);
        return aVar;
    }

    public static final C5464A.a i(C5464A.a aVar, String name) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        aVar.h().g(name);
        return aVar;
    }

    public static final String j(C5464A c5464a) {
        AbstractC4862t.e(c5464a, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(c5464a.i());
        sb2.append(", url=");
        sb2.append(c5464a.k());
        if (c5464a.g().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : c5464a.g()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C4206t.u();
                }
                C4034q c4034q = (C4034q) obj;
                String str = (String) c4034q.a();
                String str2 = (String) c4034q.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (m.A(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!c5464a.d().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(c5464a.d());
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
