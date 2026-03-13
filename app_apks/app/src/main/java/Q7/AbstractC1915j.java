package Q7;

import Q7.C1916k;
import R7.AbstractC2083e;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import Z7.r;
import e8.C3957d;
import e8.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Q7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1915j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f14082a = Z7.C.b(new C.b() { // from class: Q7.g
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return f8.h.c((C1911f) gVar);
        }
    }, C1911f.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P7.h f14083b = C2600j.e(b(), P7.a.class, y.c.SYMMETRIC, C3957d.W());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r.a f14084c = new C1913h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2595e f14085d = new InterfaceC2595e() { // from class: Q7.i
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return AbstractC1915j.a((C1916k) vVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.EnumC0207b f14086e = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static C1911f a(C1916k c1916k, Integer num) throws GeneralSecurityException {
        e(c1916k);
        return C1911f.e().f(c1916k).e(num).c(g8.b.b(c1916k.c())).d(g8.b.b(c1916k.e())).a();
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", k0.f14113e);
        C1916k.b bVarE = C1916k.b().b(16).d(32).f(16).e(16);
        C1916k.c cVar = C1916k.c.f14101d;
        C1916k.b bVarC = bVarE.c(cVar);
        C1916k.d dVar = C1916k.d.f14107d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarC.g(dVar).a());
        map.put("AES256_CTR_HMAC_SHA256", k0.f14114f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", C1916k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        b.EnumC0207b enumC0207b = f14086e;
        if (!enumC0207b.b()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC2083e.h();
        Z7.u.b().c(f14082a);
        Z7.t.b().d(c());
        Z7.r.b().a(f14084c, C1916k.class);
        Z7.q.f().b(f14085d, C1916k.class);
        C2596f.d().h(f14083b, enumC0207b, z10);
    }

    public static void e(C1916k c1916k) throws GeneralSecurityException {
        if (c1916k.c() != 16 && c1916k.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
