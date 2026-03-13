package R7;

import Q7.C1911f;
import Q7.C1916k;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.C3957d;
import e8.C3958e;
import e8.C3959f;
import e8.C3960g;
import e8.C3961h;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: R7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2083e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14878e;

    /* JADX INFO: renamed from: R7.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14880b;

        static {
            int[] iArr = new int[e8.u.values().length];
            f14880b = iArr;
            try {
                iArr[e8.u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14880b[e8.u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14880b[e8.u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14880b[e8.u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14880b[e8.u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[e8.I.values().length];
            f14879a = iArr2;
            try {
                iArr2[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14879a[e8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14879a[e8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14879a[e8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f14874a = c4160aH;
        f14875b = Z7.A.a(new A.b() { // from class: R7.a
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return AbstractC2083e.k((C1916k) vVar);
            }
        }, C1916k.class, Z7.H.class);
        f14876c = Z7.z.a(new z.b() { // from class: R7.b
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return AbstractC2083e.g((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14877d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.c
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return AbstractC2083e.j((C1911f) gVar, xVar);
            }
        }, C1911f.class, Z7.G.class);
        f14878e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.d
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return AbstractC2083e.f((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static e8.x e(C1916k c1916k) {
        return (e8.x) e8.x.U().u(c1916k.g()).t(m(c1916k.d())).i();
    }

    public static C1911f f(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            C3957d c3957dV = C3957d.V(g10.g(), C3669p.b());
            if (c3957dV.T() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c3957dV.R().U() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (c3957dV.S().U() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return C1911f.e().f(C1916k.b().b(c3957dV.R().S().size()).d(c3957dV.S().S().size()).e(c3957dV.R().T().R()).f(c3957dV.S().T().T()).c(l(c3957dV.S().T().S())).g(o(g10.e())).a()).c(g8.b.a(c3957dV.R().S().y(), P7.x.b(xVar))).d(g8.b.a(c3957dV.S().S().y(), P7.x.b(xVar))).e(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static C1916k g(Z7.H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + h10.d().U());
        }
        try {
            C3958e c3958eU = C3958e.U(h10.d().V(), C3669p.b());
            if (c3958eU.S().U() == 0) {
                return C1916k.b().b(c3958eU.R().S()).d(c3958eU.S().S()).e(c3958eU.R().T().R()).f(c3958eU.S().T().T()).c(l(c3958eU.S().T().S())).g(o(h10.d().T())).a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static void h() {
        i(Z7.x.c());
    }

    public static void i(Z7.x xVar) {
        xVar.m(f14875b);
        xVar.l(f14876c);
        xVar.k(f14877d);
        xVar.j(f14878e);
    }

    public static Z7.G j(C1911f c1911f, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C3957d) C3957d.U().t((C3959f) C3959f.V().u((C3961h) C3961h.S().t(c1911f.b().f()).i()).t(AbstractC3661h.h(c1911f.f().d(P7.x.b(xVar)))).i()).u((e8.v) e8.v.V().u(e(c1911f.b())).t(AbstractC3661h.h(c1911f.g().d(P7.x.b(xVar)))).i()).i()).toByteString(), y.c.SYMMETRIC, n(c1911f.b().h()), c1911f.a());
    }

    public static Z7.H k(C1916k c1916k) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").v(((C3958e) C3958e.T().t((C3960g) C3960g.U().u((C3961h) C3961h.S().t(c1916k.f()).i()).t(c1916k.c()).i()).u((e8.w) e8.w.V().u(e(c1916k)).t(c1916k.e()).i()).i()).toByteString()).t(n(c1916k.h())).i());
    }

    public static C1916k.c l(e8.u uVar) throws GeneralSecurityException {
        int i10 = a.f14880b[uVar.ordinal()];
        if (i10 == 1) {
            return C1916k.c.f14099b;
        }
        if (i10 == 2) {
            return C1916k.c.f14100c;
        }
        if (i10 == 3) {
            return C1916k.c.f14101d;
        }
        if (i10 == 4) {
            return C1916k.c.f14102e;
        }
        if (i10 == 5) {
            return C1916k.c.f14103f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.getNumber());
    }

    public static e8.u m(C1916k.c cVar) throws GeneralSecurityException {
        if (C1916k.c.f14099b.equals(cVar)) {
            return e8.u.SHA1;
        }
        if (C1916k.c.f14100c.equals(cVar)) {
            return e8.u.SHA224;
        }
        if (C1916k.c.f14101d.equals(cVar)) {
            return e8.u.SHA256;
        }
        if (C1916k.c.f14102e.equals(cVar)) {
            return e8.u.SHA384;
        }
        if (C1916k.c.f14103f.equals(cVar)) {
            return e8.u.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    public static e8.I n(C1916k.d dVar) throws GeneralSecurityException {
        if (C1916k.d.f14105b.equals(dVar)) {
            return e8.I.TINK;
        }
        if (C1916k.d.f14106c.equals(dVar)) {
            return e8.I.CRUNCHY;
        }
        if (C1916k.d.f14107d.equals(dVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static C1916k.d o(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14879a[i10.ordinal()];
        if (i11 == 1) {
            return C1916k.d.f14105b;
        }
        if (i11 == 2 || i11 == 3) {
            return C1916k.d.f14106c;
        }
        if (i11 == 4) {
            return C1916k.d.f14107d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
