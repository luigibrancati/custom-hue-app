package P;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12481d;

    public a(float f10, float f11, float f12, float f13) {
        this.f12478a = f10;
        this.f12479b = f11;
        this.f12480c = f12;
        this.f12481d = f13;
    }

    @Override // P.h, E.Y0
    public float a() {
        return this.f12479b;
    }

    @Override // P.h, E.Y0
    public float b() {
        return this.f12481d;
    }

    @Override // P.h, E.Y0
    public float c() {
        return this.f12480c;
    }

    @Override // P.h, E.Y0
    public float d() {
        return this.f12478a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f12478a) == Float.floatToIntBits(hVar.d()) && Float.floatToIntBits(this.f12479b) == Float.floatToIntBits(hVar.a()) && Float.floatToIntBits(this.f12480c) == Float.floatToIntBits(hVar.c()) && Float.floatToIntBits(this.f12481d) == Float.floatToIntBits(hVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f12481d) ^ ((((((Float.floatToIntBits(this.f12478a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f12479b)) * 1000003) ^ Float.floatToIntBits(this.f12480c)) * 1000003);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f12478a + ", maxZoomRatio=" + this.f12479b + ", minZoomRatio=" + this.f12480c + ", linearZoom=" + this.f12481d + "}";
    }
}
