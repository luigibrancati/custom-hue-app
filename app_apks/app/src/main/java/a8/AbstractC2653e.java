package a8;

import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import a8.C2654f;
import b8.AbstractC2897e;
import e8.C3954a;
import e8.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: a8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2653e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2595e f21124a = new InterfaceC2595e() { // from class: a8.b
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return AbstractC2653e.d((C2654f) vVar, num);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f21125b = C.b(new C.b() { // from class: a8.c
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return AbstractC2653e.e((C2649a) gVar);
        }
    }, C2649a.class, InterfaceC2655g.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f21126c = C.b(new C.b() { // from class: a8.d
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return AbstractC2653e.f((C2649a) gVar);
        }
    }, C2649a.class, P7.u.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P7.h f21127d = C2600j.e("type.googleapis.com/google.crypto.tink.AesCmacKey", P7.u.class, y.c.SYMMETRIC, C3954a.W());

    public static C2649a d(C2654f c2654f, Integer num) throws GeneralSecurityException {
        i(c2654f);
        return C2649a.e().e(c2654f).c(g8.b.b(c2654f.d())).d(num).a();
    }

    public static InterfaceC2655g e(C2649a c2649a) throws GeneralSecurityException {
        i(c2649a.b());
        return b8.h.a(c2649a);
    }

    public static P7.u f(C2649a c2649a) throws GeneralSecurityException {
        i(c2649a.b());
        return f8.o.c(c2649a);
    }

    public static Map g() {
        HashMap map = new HashMap();
        C2654f c2654f = y.f21190e;
        map.put("AES_CMAC", c2654f);
        map.put("AES256_CMAC", c2654f);
        map.put("AES256_CMAC_RAW", C2654f.b().b(32).c(16).d(C2654f.c.f21137e).a());
        return Collections.unmodifiableMap(map);
    }

    public static void h(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        AbstractC2897e.h();
        Z7.q.f().b(f21124a, C2654f.class);
        Z7.u.b().c(f21125b);
        Z7.u.b().c(f21126c);
        Z7.t.b().d(g());
        C2596f.d().g(f21127d, z10);
    }

    public static void i(C2654f c2654f) throws GeneralSecurityException {
        if (c2654f.d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
