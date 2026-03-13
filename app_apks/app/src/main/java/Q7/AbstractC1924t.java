package Q7;

import Q7.C1925u;
import R7.AbstractC2094p;
import U7.b;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import Z7.r;
import e8.C3965l;
import e8.y;
import f8.C4000c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Q7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1924t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z7.C f14165a = Z7.C.b(new C.b() { // from class: Q7.r
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return C4000c.c((C1922q) gVar);
        }
    }, C1922q.class, P7.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P7.h f14166b = C2600j.e(c(), P7.a.class, y.c.SYMMETRIC, C3965l.U());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r.a f14167c = new C1913h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2595e f14168d = new InterfaceC2595e() { // from class: Q7.s
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return AbstractC1924t.b((C1925u) vVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.EnumC0207b f14169e = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static C1922q b(C1925u c1925u, Integer num) throws GeneralSecurityException {
        f(c1925u);
        return C1922q.e().e(c1925u).c(num).d(g8.b.b(c1925u.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static Map d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", k0.f14109a);
        C1925u.b bVarD = C1925u.b().b(12).c(16).d(16);
        C1925u.c cVar = C1925u.c.f14184d;
        map.put("AES128_GCM_RAW", bVarD.e(cVar).a());
        map.put("AES256_GCM", k0.f14110b);
        map.put("AES256_GCM_RAW", C1925u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        b.EnumC0207b enumC0207b = f14169e;
        if (!enumC0207b.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC2094p.g();
        Z7.u.b().c(f14165a);
        Z7.t.b().d(d());
        Z7.r.b().a(f14167c, C1925u.class);
        Z7.q.f().b(f14168d, C1925u.class);
        C2596f.d().h(f14166b, enumC0207b, z10);
    }

    public static final void f(C1925u c1925u) throws GeneralSecurityException {
        if (c1925u.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
