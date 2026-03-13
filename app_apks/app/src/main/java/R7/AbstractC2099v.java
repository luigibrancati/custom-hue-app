package R7;

import Q7.C1926v;
import Q7.C1930z;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.C3967n;
import e8.C3968o;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: R7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2099v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14906e;

    /* JADX INFO: renamed from: R7.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14907a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14907a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14907a[e8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14907a[e8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14907a[e8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f14902a = c4160aH;
        f14903b = Z7.A.a(new A.b() { // from class: R7.r
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return AbstractC2099v.j((C1930z) vVar);
            }
        }, C1930z.class, Z7.H.class);
        f14904c = Z7.z.a(new z.b() { // from class: R7.s
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return AbstractC2099v.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14905d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.t
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return AbstractC2099v.i((C1926v) gVar, xVar);
            }
        }, C1926v.class, Z7.G.class);
        f14906e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.u
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return AbstractC2099v.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static C1926v e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            C3967n c3967nT = C3967n.T(g10.g(), C3669p.b());
            if (c3967nT.R() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C1926v.e().e(C1930z.b().b(c3967nT.Q().size()).c(l(g10.e())).a()).d(g8.b.a(c3967nT.Q().y(), P7.x.b(xVar))).c(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static C1930z f(Z7.H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + h10.d().U());
        }
        try {
            C3968o c3968oT = C3968o.T(h10.d().V(), C3669p.b());
            if (c3968oT.R() == 0) {
                return C1930z.b().b(c3968oT.Q()).c(l(h10.d().T())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static void g() {
        h(Z7.x.c());
    }

    public static void h(Z7.x xVar) {
        xVar.m(f14903b);
        xVar.l(f14904c);
        xVar.k(f14905d);
        xVar.j(f14906e);
    }

    public static Z7.G i(C1926v c1926v, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C3967n) C3967n.S().t(AbstractC3661h.h(c1926v.f().d(P7.x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, k(c1926v.b().d()), c1926v.a());
    }

    public static Z7.H j(C1930z c1930z) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.AesGcmSivKey").v(((C3968o) C3968o.S().t(c1930z.c()).i()).toByteString()).t(k(c1930z.d())).i());
    }

    public static e8.I k(C1930z.c cVar) throws GeneralSecurityException {
        if (C1930z.c.f14206b.equals(cVar)) {
            return e8.I.TINK;
        }
        if (C1930z.c.f14207c.equals(cVar)) {
            return e8.I.CRUNCHY;
        }
        if (C1930z.c.f14208d.equals(cVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static C1930z.c l(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14907a[i10.ordinal()];
        if (i11 == 1) {
            return C1930z.c.f14206b;
        }
        if (i11 == 2 || i11 == 3) {
            return C1930z.c.f14207c;
        }
        if (i11 == 4) {
            return C1930z.c.f14208d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
