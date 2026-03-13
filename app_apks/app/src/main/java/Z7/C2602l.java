package Z7;

import java.util.Objects;

/* JADX INFO: renamed from: Z7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2602l extends P7.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f20375a;

    /* JADX INFO: renamed from: Z7.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20376a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f20376a = iArr;
            try {
                iArr[e8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20376a[e8.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20376a[e8.I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20376a[e8.I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2602l(H h10) {
        this.f20375a = h10;
    }

    private static String c(e8.I i10) {
        int i11 = a.f20376a[i10.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
    }

    @Override // P7.v
    public boolean a() {
        return this.f20375a.d().T() != e8.I.RAW;
    }

    public H b() {
        return this.f20375a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2602l)) {
            return false;
        }
        H h10 = ((C2602l) obj).f20375a;
        return this.f20375a.d().T().equals(h10.d().T()) && this.f20375a.d().U().equals(h10.d().U()) && this.f20375a.d().V().equals(h10.d().V());
    }

    public int hashCode() {
        return Objects.hash(this.f20375a.d(), this.f20375a.a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f20375a.d().U(), c(this.f20375a.d().T()));
    }
}
