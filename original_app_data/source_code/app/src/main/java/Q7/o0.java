package Q7;

import Z7.C;
import Z7.InterfaceC2595e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2595e f14135a = new InterfaceC2595e() { // from class: Q7.m0
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return o0.b((p0) vVar, num);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.C f14136b = Z7.C.b(new C.b() { // from class: Q7.n0
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return R7.M.c((l0) gVar);
        }
    }, l0.class, P7.a.class);

    public static l0 b(p0 p0Var, Integer num) {
        return l0.e(p0Var, g8.b.b(32), num);
    }

    public static Map c() {
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", k0.f14117i);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", k0.f14118j);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", k0.f14119k);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", k0.f14120l);
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) {
        R7.S.g();
        Z7.t.b().d(c());
        Z7.u.b().c(f14136b);
        Z7.q.f().b(f14135a, p0.class);
    }
}
