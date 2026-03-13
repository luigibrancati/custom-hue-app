package V7;

import P7.v;
import Q7.C1913h;
import U7.b;
import V7.e;
import Z7.C;
import Z7.C2596f;
import Z7.C2600j;
import Z7.InterfaceC2595e;
import Z7.q;
import Z7.r;
import Z7.t;
import Z7.u;
import e8.p;
import e8.y;
import f8.C4001d;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f17278a = C.b(new C.b() { // from class: V7.b
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return d.b((a) gVar);
        }
    }, a.class, P7.e.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P7.h f17279b = C2600j.e(c(), P7.e.class, y.c.SYMMETRIC, p.U());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r.a f17280c = new C1913h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2595e f17281d = new InterfaceC2595e() { // from class: V7.c
        @Override // Z7.InterfaceC2595e
        public final P7.g a(v vVar, Integer num) {
            return d.e((e) vVar, num);
        }
    };

    public static P7.e b(a aVar) throws InvalidAlgorithmParameterException {
        g(aVar.b());
        return C4001d.c(aVar);
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public static Map d() {
        HashMap map = new HashMap();
        map.put("AES256_SIV", l.f17301a);
        map.put("AES256_SIV_RAW", e.b().b(64).c(e.c.f17288d).a());
        return Collections.unmodifiableMap(map);
    }

    public static a e(e eVar, Integer num) throws InvalidAlgorithmParameterException {
        g(eVar);
        return a.e().e(eVar).c(num).d(g8.b.b(eVar.c())).a();
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0207b.ALGORITHM_NOT_FIPS.b()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        W7.e.i();
        u.b().c(f17278a);
        t.b().d(d());
        r.b().a(f17280c, e.class);
        q.f().b(f17281d, e.class);
        C2596f.d().g(f17279b, z10);
    }

    public static void g(e eVar) throws InvalidAlgorithmParameterException {
        if (eVar.c() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + eVar.c() + ". Valid keys must have 64 bytes.");
    }
}
