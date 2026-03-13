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
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P7.h f14010a = C2600j.e(d(), P7.a.class, y.c.SYMMETRIC, e8.G.U());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2595e f14011b = new InterfaceC2595e() { // from class: Q7.J
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return L.e((V) vVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.C f14012c = Z7.C.b(new C.b() { // from class: Q7.K
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return L.c((U) gVar);
        }
    }, U.class, P7.a.class);

    public static P7.a c(U u10) {
        String strD = u10.b().d();
        return R7.K.c(I.d(u10.b().c(), P7.s.a(strD).b(strD)), u10.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static U e(V v10, Integer num) {
        return U.e(v10, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        a0.h();
        Z7.q.f().b(f14011b, V.class);
        Z7.u.b().c(f14012c);
        C2596f.d().g(f14010a, z10);
    }
}
