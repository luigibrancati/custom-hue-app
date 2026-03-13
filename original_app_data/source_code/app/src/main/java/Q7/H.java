package Q7;

import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import e8.y;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f14002a = Z7.C.b(new C.b() { // from class: Q7.F
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return H.c((M) gVar);
        }
    }, M.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P7.h f14003b = C2600j.e(d(), P7.a.class, y.c.REMOTE, e8.E.U());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2595e f14004c = new InterfaceC2595e() { // from class: Q7.G
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return H.e((N) vVar, num);
        }
    };

    public static P7.a c(M m10) {
        return R7.K.c(P7.s.a(m10.b().c()).b(m10.b().c()), m10.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static M e(N n10, Integer num) {
        return M.e(n10, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        T.g();
        Z7.u.b().c(f14002a);
        Z7.q.f().b(f14004c, N.class);
        C2596f.d().g(f14003b, z10);
    }
}
