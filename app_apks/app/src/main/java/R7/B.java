package R7;

import Q7.E;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14842e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14843a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14843a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14843a[e8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14843a[e8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14843a[e8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f14838a = c4160aH;
        f14839b = Z7.A.a(new A.b() { // from class: R7.x
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return B.j((Q7.E) vVar);
            }
        }, Q7.E.class, Z7.H.class);
        f14840c = Z7.z.a(new z.b() { // from class: R7.y
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return B.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14841d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.z
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return B.i((Q7.A) gVar, xVar);
            }
        }, Q7.A.class, Z7.G.class);
        f14842e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.A
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return B.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static Q7.A e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            e8.r rVarT = e8.r.T(g10.g(), C3669p.b());
            if (rVarT.R() == 0) {
                return Q7.A.e(l(g10.e()), g8.b.a(rVarT.Q().y(), P7.x.b(xVar)), g10.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static Q7.E f(Z7.H h10) throws GeneralSecurityException {
        if (h10.d().U().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                e8.s.Q(h10.d().V(), C3669p.b());
                return Q7.E.b(l(h10.d().T()));
            } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + h10.d().U());
    }

    public static void g() {
        h(Z7.x.c());
    }

    public static void h(Z7.x xVar) {
        xVar.m(f14839b);
        xVar.l(f14840c);
        xVar.k(f14841d);
        xVar.j(f14842e);
    }

    public static Z7.G i(Q7.A a10, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((e8.r) e8.r.S().t(AbstractC3661h.h(a10.f().d(P7.x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, k(a10.b().c()), a10.a());
    }

    public static Z7.H j(Q7.E e10) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").v(e8.s.P().toByteString()).t(k(e10.c())).i());
    }

    public static e8.I k(E.a aVar) throws GeneralSecurityException {
        if (E.a.f13998b.equals(aVar)) {
            return e8.I.TINK;
        }
        if (E.a.f13999c.equals(aVar)) {
            return e8.I.CRUNCHY;
        }
        if (E.a.f14000d.equals(aVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static E.a l(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14843a[i10.ordinal()];
        if (i11 == 1) {
            return E.a.f13998b;
        }
        if (i11 == 2 || i11 == 3) {
            return E.a.f13999c;
        }
        if (i11 == 4) {
            return E.a.f14000d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
