package Q7;

import Q7.u0;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import Z7.r;
import e8.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f14170a = Z7.C.b(new C.b() { // from class: Q7.r0
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return t0.b((q0) gVar);
        }
    }, q0.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P7.h f14171b = C2600j.e(d(), P7.a.class, y.c.SYMMETRIC, e8.N.U());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r.a f14172c = new C1913h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2595e f14173d = new InterfaceC2595e() { // from class: Q7.s0
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return t0.c((u0) vVar, num);
        }
    };

    public static P7.a b(q0 q0Var) {
        return R7.T.e() ? R7.T.c(q0Var) : f8.s.c(q0Var);
    }

    public static q0 c(u0 u0Var, Integer num) {
        return q0.e(u0Var.c(), g8.b.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static Map e() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", u0.b(u0.a.f14187b));
        map.put("XCHACHA20_POLY1305_RAW", u0.b(u0.a.f14189d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        R7.Y.g();
        Z7.u.b().c(f14170a);
        Z7.t.b().d(e());
        Z7.q.f().b(f14173d, u0.class);
        Z7.r.b().a(f14172c, u0.class);
        C2596f.d().g(f14171b, z10);
    }
}
