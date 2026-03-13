package b8;

import P7.v;
import P7.x;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.C2593c;
import Z7.G;
import Z7.H;
import Z7.K;
import Z7.N;
import Z7.z;
import a8.n;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.I;
import e8.u;
import e8.w;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f25462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2593c f25463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2593c f25464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f25465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f25466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2598h f25467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2597g f25468g;

    static {
        C4160a c4160aH = N.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f25462a = c4160aH;
        f25463b = C2593c.a().a(I.RAW, n.d.f21172e).a(I.TINK, n.d.f21169b).a(I.LEGACY, n.d.f21171d).a(I.CRUNCHY, n.d.f21170c).b();
        f25464c = C2593c.a().a(u.SHA1, n.c.f21163b).a(u.SHA224, n.c.f21164c).a(u.SHA256, n.c.f21165d).a(u.SHA384, n.c.f21166e).a(u.SHA512, n.c.f21167f).b();
        f25465d = A.a(new A.b() { // from class: b8.j
            @Override // Z7.A.b
            public final K a(v vVar) {
                return n.k((a8.n) vVar);
            }
        }, a8.n.class, H.class);
        f25466e = z.a(new z.b() { // from class: b8.k
            @Override // Z7.z.b
            public final v a(K k10) {
                return n.g((H) k10);
            }
        }, c4160aH, H.class);
        f25467f = AbstractC2598h.a(new AbstractC2598h.b() { // from class: b8.l
            @Override // Z7.AbstractC2598h.b
            public final K a(P7.g gVar, x xVar) {
                return n.j((a8.i) gVar, xVar);
            }
        }, a8.i.class, G.class);
        f25468g = AbstractC2597g.a(new AbstractC2597g.b() { // from class: b8.m
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(K k10, x xVar) {
                return n.f((G) k10, xVar);
            }
        }, c4160aH, G.class);
    }

    public static e8.x e(a8.n nVar) {
        return (e8.x) e8.x.U().u(nVar.c()).t((u) f25464c.c(nVar.d())).i();
    }

    public static a8.i f(G g10, x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            e8.v vVarW = e8.v.W(g10.g(), C3669p.b());
            if (vVarW.U() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return a8.i.e().e(a8.n.b().c(vVarW.S().size()).d(vVarW.T().T()).b((n.c) f25464c.b(vVarW.T().S())).e((n.d) f25463b.b(g10.e())).a()).d(g8.b.a(vVarW.S().y(), x.b(xVar))).c(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static a8.n g(H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + h10.d().U());
        }
        try {
            w wVarW = w.W(h10.d().V(), C3669p.b());
            if (wVarW.U() == 0) {
                return a8.n.b().c(wVarW.S()).d(wVarW.T().T()).b((n.c) f25464c.b(wVarW.T().S())).e((n.d) f25463b.b(h10.d().T())).a();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + wVarW.U());
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static void h() {
        i(Z7.x.c());
    }

    public static void i(Z7.x xVar) {
        xVar.m(f25465d);
        xVar.l(f25466e);
        xVar.k(f25467f);
        xVar.j(f25468g);
    }

    public static G j(a8.i iVar, x xVar) {
        return G.b("type.googleapis.com/google.crypto.tink.HmacKey", ((e8.v) e8.v.V().u(e(iVar.b())).t(AbstractC3661h.h(iVar.f().d(x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, (I) f25463b.c(iVar.b().g()), iVar.a());
    }

    public static H k(a8.n nVar) {
        return H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.HmacKey").v(((w) w.V().u(e(nVar)).t(nVar.e()).i()).toByteString()).t((I) f25463b.c(nVar.g())).i());
    }
}
