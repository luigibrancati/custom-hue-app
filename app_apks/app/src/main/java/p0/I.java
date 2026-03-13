package p0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42058b;

    public I(float f10, float f11) {
        this.f42057a = f10;
        this.f42058b = f11;
    }

    public final float a() {
        return this.f42057a;
    }

    public final float b() {
        return this.f42058b;
    }

    public final float[] c() {
        float f10 = this.f42057a;
        float f11 = this.f42058b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return Float.compare(this.f42057a, i10.f42057a) == 0 && Float.compare(this.f42058b, i10.f42058b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f42057a) * 31) + Float.hashCode(this.f42058b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f42057a + ", y=" + this.f42058b + ')';
    }
}
