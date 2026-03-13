package Q7;

import Q7.C1930z;
import R7.AbstractC2099v;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import Z7.r;
import e8.C3967n;
import e8.y;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Q7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1929y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f14198a = Z7.C.b(new C.b() { // from class: Q7.w
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return S7.b.e((C1926v) gVar);
        }
    }, C1926v.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2595e f14199b = new InterfaceC2595e() { // from class: Q7.x
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return AbstractC1929y.b((C1930z) vVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r.a f14200c = new C1913h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P7.h f14201d = C2600j.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", P7.a.class, y.c.SYMMETRIC, C3967n.U());

    public static C1926v b(C1930z c1930z, Integer num) {
        return C1926v.e().e(c1930z).c(num).d(g8.b.b(c1930z.c())).a();
    }

    public static Map c() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        C1930z.b bVarB = C1930z.b().b(16);
        C1930z.c cVar = C1930z.c.f14206b;
        map.put("AES128_GCM_SIV", bVarB.c(cVar).a());
        C1930z.b bVarB2 = C1930z.b().b(16);
        C1930z.c cVar2 = C1930z.c.f14208d;
        map.put("AES128_GCM_SIV_RAW", bVarB2.c(cVar2).a());
        map.put("AES256_GCM_SIV", C1930z.b().b(32).c(cVar).a());
        map.put("AES256_GCM_SIV_RAW", C1930z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        AbstractC2099v.g();
        Z7.t.b().d(c());
        Z7.r.b().a(f14200c, C1930z.class);
        Z7.q.f().b(f14199b, C1930z.class);
        Z7.u.b().c(f14198a);
        C2596f.d().g(f14201d, z10);
    }
}
