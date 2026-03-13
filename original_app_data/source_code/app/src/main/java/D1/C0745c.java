package D1;

/* JADX INFO: renamed from: D1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0745c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1682b;

    public C0745c(int i10, float f10) {
        this.f1681a = i10;
        this.f1682b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0745c.class == obj.getClass()) {
            C0745c c0745c = (C0745c) obj;
            if (this.f1681a == c0745c.f1681a && Float.compare(c0745c.f1682b, this.f1682b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f1681a) * 31) + Float.floatToIntBits(this.f1682b);
    }
}
