package X0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17992b;

    public i(float f10, float f11) {
        this.f17991a = h.c(f10, "width");
        this.f17992b = h.c(f11, "height");
    }

    public float a() {
        return this.f17992b;
    }

    public float b() {
        return this.f17991a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f17991a == this.f17991a && iVar.f17992b == this.f17992b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f17992b) ^ Float.floatToIntBits(this.f17991a);
    }

    public String toString() {
        return this.f17991a + "x" + this.f17992b;
    }
}
