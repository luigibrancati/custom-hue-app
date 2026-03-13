package Q7;

import Q7.V;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14063e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14064a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14064a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14064a[e8.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f14059a = c4160aH;
        f14060b = Z7.A.a(new A.b() { // from class: Q7.W
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return a0.k((V) vVar);
            }
        }, V.class, Z7.H.class);
        f14061c = Z7.z.a(new z.b() { // from class: Q7.X
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return a0.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14062d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: Q7.Y
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return a0.j((U) gVar, xVar);
            }
        }, U.class, Z7.G.class);
        f14063e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: Q7.Z
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return a0.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static U e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            e8.G gT = e8.G.T(g10.g(), C3669p.b());
            if (gT.R() == 0) {
                return U.e(g(gT.Q(), g10.e()), g10.c());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + gT);
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    public static V f(Z7.H h10) throws GeneralSecurityException {
        if (h10.d().U().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return g(e8.H.V(h10.d().V(), C3669p.b()), h10.d().T());
            } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + h10.d().U());
    }

    public static V g(e8.H h10, e8.I i10) throws GeneralSecurityException {
        V.c cVar;
        P7.v vVarA = P7.y.a(((C3950A) C3950A.W().u(h10.S().U()).v(h10.S().V()).t(e8.I.RAW).i()).g());
        if (vVarA instanceof C1925u) {
            cVar = V.c.f14038b;
        } else if (vVarA instanceof E) {
            cVar = V.c.f14040d;
        } else if (vVarA instanceof u0) {
            cVar = V.c.f14039c;
        } else if (vVarA instanceof C1916k) {
            cVar = V.c.f14041e;
        } else if (vVarA instanceof C1921p) {
            cVar = V.c.f14042f;
        } else {
            if (!(vVarA instanceof C1930z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + vVarA);
            }
            cVar = V.c.f14043g;
        }
        return V.b().f(n(i10)).e(h10.T()).c((AbstractC1908c) vVarA).d(cVar).a();
    }

    public static void h() {
        i(Z7.x.c());
    }

    public static void i(Z7.x xVar) {
        xVar.m(f14060b);
        xVar.l(f14061c);
        xVar.k(f14062d);
        xVar.j(f14063e);
    }

    public static Z7.G j(U u10, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((e8.G) e8.G.S().t(l(u10.b())).i()).toByteString(), y.c.REMOTE, m(u10.b().e()), u10.a());
    }

    public static Z7.H k(V v10) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").v(l(v10).toByteString()).t(m(v10.e())).i());
    }

    public static e8.H l(V v10) throws GeneralSecurityException {
        try {
            return (e8.H) e8.H.U().u(v10.d()).t(C3950A.Y(P7.y.b(v10.c()), C3669p.b())).i();
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static e8.I m(V.d dVar) throws GeneralSecurityException {
        if (V.d.f14045b.equals(dVar)) {
            return e8.I.TINK;
        }
        if (V.d.f14046c.equals(dVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static V.d n(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14064a[i10.ordinal()];
        if (i11 == 1) {
            return V.d.f14045b;
        }
        if (i11 == 2) {
            return V.d.f14046c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
