package z0;

/* JADX INFO: renamed from: z0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6490d implements InterfaceC6489c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f48682b;

    public C6490d(float f10, float f11) {
        this.f48681a = f10;
        this.f48682b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6490d)) {
            return false;
        }
        C6490d c6490d = (C6490d) obj;
        return Float.compare(this.f48681a, c6490d.f48681a) == 0 && Float.compare(this.f48682b, c6490d.f48682b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f48681a) * 31) + Float.hashCode(this.f48682b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f48681a + ", fontScale=" + this.f48682b + ')';
    }
}
