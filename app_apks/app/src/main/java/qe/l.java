package qe;

import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.C5468d;
import pe.D;
import pe.u;
import pe.z;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final void a(String str, C c10) {
        if (c10 != null) {
            if (c10.C() != null) {
                throw new IllegalArgumentException((str + ".networkResponse != null").toString());
            }
            if (c10.d() != null) {
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            }
            if (c10.F() == null) {
                return;
            }
            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
        }
    }

    public static final C.a b(C.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        aVar.g().a(name, value);
        return aVar;
    }

    public static final C.a c(C.a aVar, D body) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(body, "body");
        aVar.s(body);
        return aVar;
    }

    public static final C.a d(C.a aVar, C c10) {
        AbstractC4862t.e(aVar, "<this>");
        a("cacheResponse", c10);
        aVar.t(c10);
        return aVar;
    }

    public static final void e(C c10) {
        AbstractC4862t.e(c10, "<this>");
        c10.b().close();
    }

    public static final C.a f(C.a aVar, int i10) {
        AbstractC4862t.e(aVar, "<this>");
        aVar.u(i10);
        return aVar;
    }

    public static final String g(C c10, String name, String str) {
        AbstractC4862t.e(c10, "<this>");
        AbstractC4862t.e(name, "name");
        String strC = c10.o().c(name);
        return strC == null ? str : strC;
    }

    public static final C.a h(C.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        aVar.g().h(name, value);
        return aVar;
    }

    public static final C.a i(C.a aVar, u headers) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(headers, "headers");
        aVar.v(headers.f());
        return aVar;
    }

    public static final C.a j(C.a aVar, String message) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(message, "message");
        aVar.w(message);
        return aVar;
    }

    public static final C.a k(C.a aVar, C c10) {
        AbstractC4862t.e(aVar, "<this>");
        a("networkResponse", c10);
        aVar.x(c10);
        return aVar;
    }

    public static final C.a l(C c10) {
        AbstractC4862t.e(c10, "<this>");
        return new C.a(c10);
    }

    public static final C.a m(C.a aVar, C c10) {
        AbstractC4862t.e(aVar, "<this>");
        aVar.y(c10);
        return aVar;
    }

    public static final C.a n(C.a aVar, z protocol) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(protocol, "protocol");
        aVar.z(protocol);
        return aVar;
    }

    public static final C.a o(C.a aVar, C5464A request) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(request, "request");
        aVar.A(request);
        return aVar;
    }

    public static final String p(C c10) {
        AbstractC4862t.e(c10, "<this>");
        return "Response{protocol=" + c10.G() + ", code=" + c10.g() + ", message=" + c10.u() + ", url=" + c10.K().k() + '}';
    }

    public static final C.a q(C.a aVar, InterfaceC6082a trailersFn) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(trailersFn, "trailersFn");
        aVar.B(trailersFn);
        return aVar;
    }

    public static final C5468d r(C c10) {
        AbstractC4862t.e(c10, "<this>");
        C5468d c5468dI = c10.i();
        if (c5468dI != null) {
            return c5468dI;
        }
        C5468d c5468dA = C5468d.f42647n.a(c10.o());
        c10.Y(c5468dA);
        return c5468dA;
    }

    public static final boolean s(C c10) {
        AbstractC4862t.e(c10, "<this>");
        int iG = c10.g();
        if (iG == 307 || iG == 308) {
            return true;
        }
        switch (iG) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public static final boolean t(C c10) {
        AbstractC4862t.e(c10, "<this>");
        int iG = c10.g();
        return 200 <= iG && iG < 300;
    }

    public static final C u(C c10) {
        AbstractC4862t.e(c10, "<this>");
        return c10.D().b(new C5519b(c10.b().b(), c10.b().a())).c();
    }
}
