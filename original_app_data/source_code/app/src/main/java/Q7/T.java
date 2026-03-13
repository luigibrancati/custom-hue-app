package Q7;

import Q7.N;
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
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14025e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14026a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14026a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14026a[e8.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f14021a = c4160aH;
        f14022b = Z7.A.a(new A.b() { // from class: Q7.O
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return T.j((N) vVar);
            }
        }, N.class, Z7.H.class);
        f14023c = Z7.z.a(new z.b() { // from class: Q7.P
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return T.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14024d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: Q7.Q
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return T.i((M) gVar, xVar);
            }
        }, M.class, Z7.G.class);
        f14025e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: Q7.S
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return T.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static M e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            e8.E eT = e8.E.T(g10.g(), C3669p.b());
            if (eT.R() == 0) {
                return M.e(N.b(eT.Q().R(), l(g10.e())), g10.c());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + eT);
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    public static N f(Z7.H h10) throws GeneralSecurityException {
        if (h10.d().U().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return N.b(e8.F.T(h10.d().V(), C3669p.b()).R(), l(h10.d().T()));
            } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + h10.d().U());
    }

    public static void g() {
        h(Z7.x.c());
    }

    public static void h(Z7.x xVar) {
        xVar.m(f14022b);
        xVar.l(f14023c);
        xVar.k(f14024d);
        xVar.j(f14025e);
    }

    public static Z7.G i(M m10, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((e8.E) e8.E.S().t((e8.F) e8.F.S().t(m10.b().c()).i()).i()).toByteString(), y.c.REMOTE, k(m10.b().d()), m10.a());
    }

    public static Z7.H j(N n10) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.KmsAeadKey").v(((e8.F) e8.F.S().t(n10.c()).i()).toByteString()).t(k(n10.d())).i());
    }

    public static e8.I k(N.a aVar) throws GeneralSecurityException {
        if (N.a.f14018b.equals(aVar)) {
            return e8.I.TINK;
        }
        if (N.a.f14019c.equals(aVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static N.a l(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14026a[i10.ordinal()];
        if (i11 == 1) {
            return N.a.f14018b;
        }
        if (i11 == 2) {
            return N.a.f14019c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
