package Q7;

import Q7.C1921p;
import R7.AbstractC2088j;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import e8.C3962i;
import e8.y;
import f8.C3999b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Q7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1920o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f14132a = Z7.C.b(new C.b() { // from class: Q7.m
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return C3999b.c((C1917l) gVar);
        }
    }, C1917l.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P7.h f14133b = C2600j.e(c(), P7.a.class, y.c.SYMMETRIC, C3962i.W());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2595e f14134c = new InterfaceC2595e() { // from class: Q7.n
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return AbstractC1920o.b((C1921p) vVar, num);
        }
    };

    public static C1917l b(C1921p c1921p, Integer num) throws GeneralSecurityException {
        f(c1921p);
        return C1917l.e().e(c1921p).c(num).d(g8.b.b(c1921p.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static Map d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", k0.f14111c);
        C1921p.b bVarD = C1921p.b().b(16).c(16).d(16);
        C1921p.c cVar = C1921p.c.f14147d;
        map.put("AES128_EAX_RAW", bVarD.e(cVar).a());
        map.put("AES256_EAX", k0.f14112d);
        map.put("AES256_EAX_RAW", C1921p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        AbstractC2088j.h();
        Z7.u.b().c(f14132a);
        Z7.t.b().d(d());
        Z7.q.f().b(f14134c, C1921p.class);
        C2596f.d().g(f14133b, z10);
    }

    public static final void f(C1921p c1921p) throws GeneralSecurityException {
        if (c1921p.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
