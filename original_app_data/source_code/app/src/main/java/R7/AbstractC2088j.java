package R7;

import Q7.C1917l;
import Q7.C1921p;
import Z7.A;
import Z7.AbstractC2597g;
import Z7.AbstractC2598h;
import Z7.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.C3962i;
import e8.C3963j;
import e8.C3964k;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: R7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2088j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f14881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.A f14882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z7.z f14883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2598h f14884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2597g f14885e;

    /* JADX INFO: renamed from: R7.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14886a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14886a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14886a[e8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14886a[e8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14886a[e8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4160a c4160aH = Z7.N.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f14881a = c4160aH;
        f14882b = Z7.A.a(new A.b() { // from class: R7.f
            @Override // Z7.A.b
            public final Z7.K a(P7.v vVar) {
                return AbstractC2088j.k((C1921p) vVar);
            }
        }, C1921p.class, Z7.H.class);
        f14883c = Z7.z.a(new z.b() { // from class: R7.g
            @Override // Z7.z.b
            public final P7.v a(Z7.K k10) {
                return AbstractC2088j.g((Z7.H) k10);
            }
        }, c4160aH, Z7.H.class);
        f14884d = AbstractC2598h.a(new AbstractC2598h.b() { // from class: R7.h
            @Override // Z7.AbstractC2598h.b
            public final Z7.K a(P7.g gVar, P7.x xVar) {
                return AbstractC2088j.j((C1917l) gVar, xVar);
            }
        }, C1917l.class, Z7.G.class);
        f14885e = AbstractC2597g.a(new AbstractC2597g.b() { // from class: R7.i
            @Override // Z7.AbstractC2597g.b
            public final P7.g a(Z7.K k10, P7.x xVar) {
                return AbstractC2088j.f((Z7.G) k10, xVar);
            }
        }, c4160aH, Z7.G.class);
    }

    public static C3964k e(C1921p c1921p) throws GeneralSecurityException {
        if (c1921p.e() == 16) {
            return (C3964k) C3964k.S().t(c1921p.c()).i();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c1921p.e())));
    }

    public static C1917l f(Z7.G g10, P7.x xVar) throws GeneralSecurityException {
        if (!g10.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            C3962i c3962iV = C3962i.V(g10.g(), C3669p.b());
            if (c3962iV.T() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C1917l.e().e(C1921p.b().c(c3962iV.R().size()).b(c3962iV.S().R()).d(16).e(m(g10.e())).a()).d(g8.b.a(c3962iV.R().y(), P7.x.b(xVar))).c(g10.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static C1921p g(Z7.H h10) throws GeneralSecurityException {
        if (h10.d().U().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C3963j c3963jU = C3963j.U(h10.d().V(), C3669p.b());
                return C1921p.b().c(c3963jU.R()).b(c3963jU.S().R()).d(16).e(m(h10.d().T())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + h10.d().U());
    }

    public static void h() {
        i(Z7.x.c());
    }

    public static void i(Z7.x xVar) {
        xVar.m(f14882b);
        xVar.l(f14883c);
        xVar.k(f14884d);
        xVar.j(f14885e);
    }

    public static Z7.G j(C1917l c1917l, P7.x xVar) {
        return Z7.G.b("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C3962i) C3962i.U().u(e(c1917l.b())).t(AbstractC3661h.h(c1917l.f().d(P7.x.b(xVar)))).i()).toByteString(), y.c.SYMMETRIC, l(c1917l.b().f()), c1917l.a());
    }

    public static Z7.H k(C1921p c1921p) {
        return Z7.H.c((C3950A) C3950A.W().u("type.googleapis.com/google.crypto.tink.AesEaxKey").v(((C3963j) C3963j.T().u(e(c1921p)).t(c1921p.d()).i()).toByteString()).t(l(c1921p.f())).i());
    }

    public static e8.I l(C1921p.c cVar) throws GeneralSecurityException {
        if (C1921p.c.f14145b.equals(cVar)) {
            return e8.I.TINK;
        }
        if (C1921p.c.f14146c.equals(cVar)) {
            return e8.I.CRUNCHY;
        }
        if (C1921p.c.f14147d.equals(cVar)) {
            return e8.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static C1921p.c m(e8.I i10) throws GeneralSecurityException {
        int i11 = a.f14886a[i10.ordinal()];
        if (i11 == 1) {
            return C1921p.c.f14145b;
        }
        if (i11 == 2 || i11 == 3) {
            return C1921p.c.f14146c;
        }
        if (i11 == 4) {
            return C1921p.c.f14147d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
