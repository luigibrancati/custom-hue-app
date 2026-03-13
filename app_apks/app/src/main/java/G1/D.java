package G1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f4244c = new D(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f4245d = new D(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4247b;

    public D(int i10, int i11) {
        AbstractC0853a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f4246a = i10;
        this.f4247b = i11;
    }

    public int a() {
        return this.f4247b;
    }

    public int b() {
        return this.f4246a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            D d10 = (D) obj;
            if (this.f4246a == d10.f4246a && this.f4247b == d10.f4247b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f4247b;
        int i11 = this.f4246a;
        return ((i11 >>> 16) | (i11 << 16)) ^ i10;
    }

    public String toString() {
        return this.f4246a + "x" + this.f4247b;
    }
}
