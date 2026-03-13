package b8;

import P7.v;
import P7.x;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.G;
import Z7.H;
import Z7.K;
import Z7.N;
import Z7.z;
import a8.C2649a;
import a8.C2654f;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.C3954a;
import e8.C3955b;
import e8.C3956c;
import e8.I;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: b8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2897e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f25447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f25448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f25449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f25450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f25451e;

    /* JADX INFO: renamed from: b8.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25452a;

        static {
            int[] iArr = new int[I.values().length];
            f25452a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25452a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25452a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25452a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4160a c4160aH = N.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f25447a = c4160aH;
        f25448b = A.a(new A.b() { // from class: b8.a
            @Override // Z7.A.b
            public final K a(v vVar) {
                return AbstractC2897e.k((C2654f) vVar);
            }
        }, C2654f.class, H.class);
        f25449c = z.a(new z.b() { // from class: b8.b
            @Override // Z7.z.b
            public final v a(K k10) {
                return AbstractC2897e.g((H) k10);
            }
        }, c4160aH, H.class);
        f25450d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: b8.c
            @Override // Z7.AbstractC2598h.b
            public final K a(P7.g gVar, x xVar) {
                return AbstractC2897e.j((C2649a) gVar, xVar);
            }
        }, C2649a.class, G.class);
        f25451e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: b8.d
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(K k10, x xVar) {
                return AbstractC2897e.f((G) k10, xVar);
            }
        }, c4160aH, G.class);
    }

    public static C3956c e(C2654f c2654f) {
        return (C3956c) C3956c.S().t(c2654f.c()).i();
    }

    public static C2649a f(G g10, x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            C3954a c3954aV = C3954a.V(g10.g(), C3669p.b());
            if (c3954aV.T() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C2649a.e().e(C2654f.b().b(c3954aV.R().size()).c(c3954aV.S().R()).d(m(g10.e())).a()).c(g8.b.a(c3954aV.R().y(), x.b(xVar))).d(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static C2654f g(H h10) throws GeneralSecurityException {
        if (h10.d().U().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C3955b c3955bU = C3955b.U(h10.d().V(), C3669p.b());
                return C2654f.b().b(c3955bU.R()).c(c3955bU.S().R()).d(m(h10.d().T())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + h10.d().U());
    }

    public static void h() {
        i(Z7.x.c());
    }

    public static void i(Z7.x xVar) {
        xVar.m(f25448b);
        xVar.l(f25449c);
        xVar.k(f25450d);
        xVar.j(f25451e);
    }

    public static G j(C2649a c2649a, x xVar) {
        return G.b("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C3954a) C3954a.U().u(e(c2649a.b())).t(AbstractC3661h.h(c2649a.f().d(x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, l(c2649a.b().f()), c2649a.a());
    }

    public static H k(C2654f c2654f) {
        return H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.AesCmacKey").v(((C3955b) C3955b.T().u(e(c2654f)).t(c2654f.d()).i()).toByteString()).t(l(c2654f.f())).i());
    }

    public static I l(C2654f.c cVar) throws GeneralSecurityException {
        if (C2654f.c.f21134b.equals(cVar)) {
            return I.TINK;
        }
        if (C2654f.c.f21135c.equals(cVar)) {
            return I.CRUNCHY;
        }
        if (C2654f.c.f21137e.equals(cVar)) {
            return I.RAW;
        }
        if (C2654f.c.f21136d.equals(cVar)) {
            return I.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static C2654f.c m(I i10) throws GeneralSecurityException {
        int i11 = a.f25452a[i10.ordinal()];
        if (i11 == 1) {
            return C2654f.c.f21134b;
        }
        if (i11 == 2) {
            return C2654f.c.f21135c;
        }
        if (i11 == 3) {
            return C2654f.c.f21136d;
        }
        if (i11 == 4) {
            return C2654f.c.f21137e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
