package Q7;

import Q7.E;
import R7.C2100w;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import e8.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f13994a = Z7.C.b(new C.b() { // from class: Q7.B
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return D.b((A) gVar);
        }
    }, A.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2595e f13995b = new InterfaceC2595e() { // from class: Q7.C
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return D.c((E) vVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P7.h f13996c = C2600j.e(d(), P7.a.class, y.c.SYMMETRIC, e8.r.U());

    public static P7.a b(A a10) {
        return C2100w.f() ? C2100w.c(a10) : f8.g.c(a10);
    }

    public static A c(E e10, Integer num) {
        return A.e(e10.c(), g8.b.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static Map e() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", E.b(E.a.f13998b));
        map.put("CHACHA20_POLY1305_RAW", E.b(E.a.f14000d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        R7.B.g();
        Z7.u.b().c(f13994a);
        Z7.q.f().b(f13995b, E.class);
        Z7.t.b().d(e());
        C2596f.d().g(f13996c, z10);
    }
}
