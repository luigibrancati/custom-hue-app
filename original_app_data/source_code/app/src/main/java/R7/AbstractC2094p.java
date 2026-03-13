package R7;

import Q7.C1922q;
import Q7.C1925u;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.C3965l;
import e8.C3966m;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: R7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2094p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14892e;

    /* JADX INFO: renamed from: R7.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14893a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14893a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14893a[e8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14893a[e8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14893a[e8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f14888a = c4160aH;
        f14889b = Z7.A.a(new A.b() { // from class: R7.l
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return AbstractC2094p.j((C1925u) vVar);
            }
        }, C1925u.class, Z7.H.class);
        f14890c = Z7.z.a(new z.b() { // from class: R7.m
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return AbstractC2094p.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14891d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.n
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return AbstractC2094p.i((C1922q) gVar, xVar);
            }
        }, C1922q.class, Z7.G.class);
        f14892e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.o
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return AbstractC2094p.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static C1922q e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            C3965l c3965lT = C3965l.T(g10.g(), C3669p.b());
            if (c3965lT.R() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C1922q.e().e(C1925u.b().c(c3965lT.Q().size()).b(12).d(16).e(l(g10.e())).a()).d(g8.b.a(c3965lT.Q().y(), P7.x.b(xVar))).c(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static C1925u f(Z7.H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + h10.d().U());
        }
        try {
            C3966m c3966mT = C3966m.T(h10.d().V(), C3669p.b());
            if (c3966mT.R() == 0) {
                return C1925u.b().c(c3966mT.Q()).b(12).d(16).e(l(h10.d().T())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(Z7.x.c());
    }

    public static void h(Z7.x xVar) {
        xVar.m(f14889b);
        xVar.l(f14890c);
        xVar.k(f14891d);
        xVar.j(f14892e);
    }

    public static Z7.G i(C1922q c1922q, P7.x xVar) throws GeneralSecurityException {
        m(c1922q.b());
        return Z7.G.b("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C3965l) C3965l.S().t(AbstractC3661h.h(c1922q.f().d(P7.x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, k(c1922q.b().f()), c1922q.a());
    }

    public static Z7.H j(C1925u c1925u) throws GeneralSecurityException {
        m(c1925u);
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.AesGcmKey").v(((C3966m) C3966m.S().t(c1925u.d()).i()).toByteString()).t(k(c1925u.f())).i());
    }

    public static e8.I k(C1925u.c cVar) throws GeneralSecurityException {
        if (C1925u.c.f14182b.equals(cVar)) {
            return e8.I.TINK;
        }
        if (C1925u.c.f14183c.equals(cVar)) {
            return e8.I.CRUNCHY;
        }
        if (C1925u.c.f14184d.equals(cVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static C1925u.c l(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14893a[i10.ordinal()];
        if (i11 == 1) {
            return C1925u.c.f14182b;
        }
        if (i11 == 2 || i11 == 3) {
            return C1925u.c.f14183c;
        }
        if (i11 == 4) {
            return C1925u.c.f14184d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }

    public static void m(C1925u c1925u) throws GeneralSecurityException {
        if (c1925u.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c1925u.e())));
        }
        if (c1925u.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(c1925u.c())));
        }
    }
}
