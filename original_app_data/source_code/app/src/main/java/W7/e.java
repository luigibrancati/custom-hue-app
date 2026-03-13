package W7;

import P7.g;
import P7.v;
import P7.x;
import V7.e;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.G;
import Z7.H;
import Z7.K;
import Z7.N;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.I;
import e8.p;
import e8.q;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f17839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f17840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f17841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f17842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f17843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f17844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f17845g;

    static {
        C4160a c4160aH = N.h("type.googleapis.com/google.crypto.tink.AesSivKey");
        f17839a = c4160aH;
        f17840b = A.a(new A.b() { // from class: W7.a
            @Override // Z7.A.b
            public final K a(v vVar) {
                return e.l((V7.e) vVar);
            }
        }, V7.e.class, H.class);
        f17841c = z.a(new z.b() { // from class: W7.b
            @Override // Z7.z.b
            public final v a(K k10) {
                return e.h((H) k10);
            }
        }, c4160aH, H.class);
        f17842d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: W7.c
            @Override // Z7.AbstractC2598h.b
            public final K a(g gVar, x xVar) {
                return e.k((V7.a) gVar, xVar);
            }
        }, V7.a.class, G.class);
        f17843e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: W7.d
            @Override // Z7.AbstractC2597g.b
            public final g a(K k10, x xVar) {
                return e.g((G) k10, xVar);
            }
        }, c4160aH, G.class);
        f17844f = f();
        f17845g = e();
    }

    public static Map e() {
        EnumMap enumMap = new EnumMap(I.class);
        enumMap.put(I.RAW, e.c.f17288d);
        enumMap.put(I.TINK, e.c.f17286b);
        I i10 = I.CRUNCHY;
        e.c cVar = e.c.f17287c;
        enumMap.put(i10, cVar);
        enumMap.put(I.LEGACY, cVar);
        return Collections.unmodifiableMap(enumMap);
    }

    public static Map f() {
        HashMap map = new HashMap();
        map.put(e.c.f17288d, I.RAW);
        map.put(e.c.f17286b, I.TINK);
        map.put(e.c.f17287c, I.CRUNCHY);
        return Collections.unmodifiableMap(map);
    }

    public static V7.a g(G g10, x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            p pVarT = p.T(g10.g(), C3669p.b());
            if (pVarT.R() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return V7.a.e().e(V7.e.b().b(pVarT.Q().size()).c(n(g10.e())).a()).d(g8.b.a(pVarT.Q().y(), x.b(xVar))).c(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    public static V7.e h(H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + h10.d().U());
        }
        try {
            q qVarT = q.T(h10.d().V(), C3669p.b());
            if (qVarT.R() == 0) {
                return V7.e.b().b(qVarT.Q()).c(n(h10.d().T())).a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
        }
    }

    public static void i() {
        j(Z7.x.c());
    }

    public static void j(Z7.x xVar) {
        xVar.m(f17840b);
        xVar.l(f17841c);
        xVar.k(f17842d);
        xVar.j(f17843e);
    }

    public static G k(V7.a aVar, x xVar) {
        return G.b("type.googleapis.com/google.crypto.tink.AesSivKey", ((p) p.S().t(AbstractC3661h.h(aVar.f().d(x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, m(aVar.b().d()), aVar.a());
    }

    public static H l(V7.e eVar) {
        return H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.AesSivKey").v(((q) q.S().t(eVar.c()).i()).toByteString()).t(m(eVar.d())).i());
    }

    public static I m(e.c cVar) throws GeneralSecurityException {
        Map map = f17844f;
        if (map.containsKey(cVar)) {
            return (I) map.get(cVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static e.c n(I i10) throws GeneralSecurityException {
        Map map = f17845g;
        if (map.containsKey(i10)) {
            return (e.c) map.get(i10);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
