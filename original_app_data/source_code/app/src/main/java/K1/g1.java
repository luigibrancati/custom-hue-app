package K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f7057c = new g1(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7059b;

    public g1(int i10, boolean z10) {
        this.f7058a = i10;
        this.f7059b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f7058a == g1Var.f7058a && this.f7059b == g1Var.f7059b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f7058a << 1) + (this.f7059b ? 1 : 0);
    }
}
