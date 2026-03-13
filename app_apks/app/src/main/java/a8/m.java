package a8;

import Q7.C1913h;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import Z7.r;
import a8.n;
import e8.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f21149a = C.b(new C.b() { // from class: a8.j
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return new b8.i((i) gVar);
        }
    }, i.class, InterfaceC2655g.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f21150b = C.b(new C.b() { // from class: a8.k
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return f8.o.d((i) gVar);
        }
    }, i.class, P7.u.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P7.h f21151c = C2600j.e("type.googleapis.com/google.crypto.tink.HmacKey", P7.u.class, y.c.SYMMETRIC, e8.v.X());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r.a f21152d = new C1913h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC2595e f21153e = new InterfaceC2595e() { // from class: a8.l
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return m.a((n) vVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b.EnumC0207b f21154f = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static i a(n nVar, Integer num) {
        return i.e().e(nVar).d(g8.b.b(nVar.e())).c(num).a();
    }

    public static Map b() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", y.f21186a);
        n.b bVarD = n.b().c(32).d(16);
        n.d dVar = n.d.f21172e;
        n.b bVarE = bVarD.e(dVar);
        n.c cVar = n.c.f21165d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarE.b(cVar).a());
        n.b bVarD2 = n.b().c(32).d(32);
        n.d dVar2 = n.d.f21169b;
        map.put("HMAC_SHA256_256BITTAG", bVarD2.e(dVar2).b(cVar).a());
        map.put("HMAC_SHA256_256BITTAG_RAW", n.b().c(32).d(32).e(dVar).b(cVar).a());
        n.b bVarE2 = n.b().c(64).d(16).e(dVar2);
        n.c cVar2 = n.c.f21167f;
        map.put("HMAC_SHA512_128BITTAG", bVarE2.b(cVar2).a());
        map.put("HMAC_SHA512_128BITTAG_RAW", n.b().c(64).d(16).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG", n.b().c(64).d(32).e(dVar2).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG_RAW", n.b().c(64).d(32).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_512BITTAG", y.f21189d);
        map.put("HMAC_SHA512_512BITTAG_RAW", n.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void c(boolean z10) throws GeneralSecurityException {
        b.EnumC0207b enumC0207b = f21154f;
        if (!enumC0207b.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        b8.n.h();
        Z7.u.b().c(f21149a);
        Z7.u.b().c(f21150b);
        Z7.t.b().d(b());
        Z7.q.f().b(f21153e, n.class);
        Z7.r.b().a(f21152d, n.class);
        C2596f.d().h(f21151c, enumC0207b, z10);
    }
}
