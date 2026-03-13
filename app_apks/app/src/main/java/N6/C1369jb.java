package N6;

/* JADX INFO: renamed from: N6.jb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1369jb extends AbstractC1460qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10346d;

    public C1369jb(float f10, float f11, float f12, float f13, float f14) {
        this.f10343a = f10;
        this.f10344b = f11;
        this.f10345c = f12;
        this.f10346d = f13;
    }

    @Override // N6.AbstractC1460qb
    public final float a() {
        return 0.0f;
    }

    @Override // N6.AbstractC1460qb
    public final float b() {
        return this.f10345c;
    }

    @Override // N6.AbstractC1460qb
    public final float c() {
        return this.f10343a;
    }

    @Override // N6.AbstractC1460qb
    public final float d() {
        return this.f10346d;
    }

    @Override // N6.AbstractC1460qb
    public final float e() {
        return this.f10344b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1460qb) {
            AbstractC1460qb abstractC1460qb = (AbstractC1460qb) obj;
            if (Float.floatToIntBits(this.f10343a) == Float.floatToIntBits(abstractC1460qb.c()) && Float.floatToIntBits(this.f10344b) == Float.floatToIntBits(abstractC1460qb.e()) && Float.floatToIntBits(this.f10345c) == Float.floatToIntBits(abstractC1460qb.b()) && Float.floatToIntBits(this.f10346d) == Float.floatToIntBits(abstractC1460qb.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                abstractC1460qb.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((Float.floatToIntBits(this.f10343a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f10344b)) * 1000003) ^ Float.floatToIntBits(this.f10345c);
        return ((Float.floatToIntBits(this.f10346d) ^ (iFloatToIntBits * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f10343a + ", yMin=" + this.f10344b + ", xMax=" + this.f10345c + ", yMax=" + this.f10346d + ", confidenceScore=0.0}";
    }
}
