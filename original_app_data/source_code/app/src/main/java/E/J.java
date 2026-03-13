package E;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f2793c = new J(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f2794d = new J(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J f2795e = new J(2, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J f2796f = new J(3, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final J f2797g = new J(4, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f2798h = new J(5, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J f2799i = new J(6, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f2800j = new J(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2802b;

    public J(int i10, int i11) {
        this.f2801a = i10;
        this.f2802b = i11;
    }

    public static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f2802b;
    }

    public int b() {
        return this.f2801a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j10 = (J) obj;
            if (this.f2801a == j10.b() && this.f2802b == j10.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f2802b ^ ((this.f2801a ^ 1000003) * 1000003);
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f2801a) + ", bitDepth=" + this.f2802b + "}";
    }
}
