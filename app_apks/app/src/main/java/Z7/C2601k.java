package Z7;

import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Z7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2601k extends P7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f20370a;

    /* JADX INFO: renamed from: Z7.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20372b;

        static {
            int[] iArr = new int[y.c.values().length];
            f20372b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20372b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e8.I.values().length];
            f20371a = iArr2;
            try {
                iArr2[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20371a[e8.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20371a[e8.I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20371a[e8.I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: Z7.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends P7.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e8.I f20374b;

        public /* synthetic */ b(String str, e8.I i10, a aVar) {
            this(str, i10);
        }

        public static String b(e8.I i10) {
            int i11 = a.f20371a[i10.ordinal()];
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        }

        @Override // P7.v
        public boolean a() {
            return this.f20374b != e8.I.RAW;
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f20373a, b(this.f20374b));
        }

        public b(String str, e8.I i10) {
            this.f20373a = str;
            this.f20374b = i10;
        }
    }

    public C2601k(G g10, P7.x xVar) throws GeneralSecurityException {
        f(g10, xVar);
        this.f20370a = g10;
    }

    public static C4160a c(G g10) throws GeneralSecurityException {
        if (g10.e().equals(e8.I.RAW)) {
            return C4160a.a(new byte[0]);
        }
        if (g10.e().equals(e8.I.TINK)) {
            return y.b(g10.c().intValue());
        }
        if (g10.e().equals(e8.I.LEGACY) || g10.e().equals(e8.I.CRUNCHY)) {
            return y.a(g10.c().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public static void f(G g10, P7.x xVar) throws GeneralSecurityException {
        int i10 = a.f20372b[g10.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            P7.x.b(xVar);
        }
    }

    @Override // P7.g
    public Integer a() {
        return this.f20370a.c();
    }

    @Override // P7.g
    public P7.v b() {
        return new b(this.f20370a.f(), this.f20370a.e(), null);
    }

    public C4160a d() {
        return c(this.f20370a);
    }

    public G e(P7.x xVar) throws GeneralSecurityException {
        f(this.f20370a, xVar);
        return this.f20370a;
    }
}
