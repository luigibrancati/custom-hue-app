package R7;

import Q7.q0;
import Q7.u0;
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
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14872e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14873a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14873a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14873a[e8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14873a[e8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14873a[e8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f14868a = c4160aH;
        f14869b = Z7.A.a(new A.b() { // from class: R7.U
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return Y.j((u0) vVar);
            }
        }, u0.class, Z7.H.class);
        f14870c = Z7.z.a(new z.b() { // from class: R7.V
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return Y.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14871d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.W
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return Y.i((q0) gVar, xVar);
            }
        }, q0.class, Z7.G.class);
        f14872e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.X
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return Y.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static q0 e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            e8.N nT = e8.N.T(g10.g(), C3669p.b());
            if (nT.R() == 0) {
                return q0.e(l(g10.e()), g8.b.a(nT.Q().y(), P7.x.b(xVar)), g10.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static u0 f(Z7.H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + h10.d().U());
        }
        try {
            if (e8.O.R(h10.d().V(), C3669p.b()).Q() == 0) {
                return u0.b(l(h10.d().T()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    public static void g() {
        h(Z7.x.c());
    }

    public static void h(Z7.x xVar) {
        xVar.m(f14869b);
        xVar.l(f14870c);
        xVar.k(f14871d);
        xVar.j(f14872e);
    }

    public static Z7.G i(q0 q0Var, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((e8.N) e8.N.S().t(AbstractC3661h.h(q0Var.f().d(P7.x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, k(q0Var.b().c()), q0Var.a());
    }

    public static Z7.H j(u0 u0Var) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").v(e8.O.P().toByteString()).t(k(u0Var.c())).i());
    }

    public static e8.I k(u0.a aVar) throws GeneralSecurityException {
        if (u0.a.f14187b.equals(aVar)) {
            return e8.I.TINK;
        }
        if (u0.a.f14188c.equals(aVar)) {
            return e8.I.CRUNCHY;
        }
        if (u0.a.f14189d.equals(aVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static u0.a l(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14873a[i10.ordinal()];
        if (i11 == 1) {
            return u0.a.f14187b;
        }
        if (i11 == 2 || i11 == 3) {
            return u0.a.f14188c;
        }
        if (i11 == 4) {
            return u0.a.f14189d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
