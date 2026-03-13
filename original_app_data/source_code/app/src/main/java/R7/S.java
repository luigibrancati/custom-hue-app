package R7;

import Q7.l0;
import Q7.p0;
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
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14862e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14863a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14863a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14863a[e8.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f14858a = c4160aH;
        f14859b = Z7.A.a(new A.b() { // from class: R7.N
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return S.j((p0) vVar);
            }
        }, p0.class, Z7.H.class);
        f14860c = Z7.z.a(new z.b() { // from class: R7.O
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return S.f((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14861d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.P
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return S.i((l0) gVar, xVar);
            }
        }, l0.class, Z7.G.class);
        f14862e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.Q
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return S.e((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static l0 e(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            e8.K kV = e8.K.V(g10.g(), C3669p.b());
            if (kV.T() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (kV.R().size() == 32) {
                return l0.e(p0.b(l(g10.e()), kV.S().R()), g8.b.a(kV.R().y(), P7.x.b(xVar)), g10.c());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static p0 f(Z7.H h10) throws GeneralSecurityException {
        if (!h10.d().U().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + h10.d().U());
        }
        try {
            e8.L lT = e8.L.T(h10.d().V(), C3669p.b());
            if (lT.R() == 0) {
                return p0.b(l(h10.d().T()), lT.Q().R());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(Z7.x.c());
    }

    public static void h(Z7.x xVar) {
        xVar.m(f14859b);
        xVar.l(f14860c);
        xVar.k(f14861d);
        xVar.j(f14862e);
    }

    public static Z7.G i(l0 l0Var, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((e8.K) e8.K.U().t(AbstractC3661h.h(l0Var.f().d(P7.x.b(xVar)))).u((e8.M) e8.M.S().t(l0Var.b().c()).i()).i()).toByteString(), y.c.SYMMETRIC, k(l0Var.b().d()), l0Var.a());
    }

    public static Z7.H j(p0 p0Var) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.XAesGcmKey").v(((e8.L) e8.L.S().t((e8.M) e8.M.S().t(p0Var.c()).i()).i()).toByteString()).t(k(p0Var.d())).i());
    }

    public static e8.I k(p0.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, p0.a.f14151b)) {
            return e8.I.TINK;
        }
        if (Objects.equals(aVar, p0.a.f14152c)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static p0.a l(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14863a[i10.ordinal()];
        if (i11 == 1) {
            return p0.a.f14151b;
        }
        if (i11 == 2) {
            return p0.a.f14152c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
