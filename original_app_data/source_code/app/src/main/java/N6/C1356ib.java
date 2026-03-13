package N6;

/* JADX INFO: renamed from: N6.ib, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1356ib extends AbstractC1447pb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f10325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f10327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f10328m;

    public /* synthetic */ C1356ib(int i10, int i11, float f10, float f11, boolean z10, float f12, float f13, long j10, long j11, boolean z11, float f14, float f15, AbstractC1343hb abstractC1343hb) {
        this.f10317b = i10;
        this.f10318c = i11;
        this.f10319d = f10;
        this.f10320e = f11;
        this.f10321f = z10;
        this.f10322g = f12;
        this.f10323h = f13;
        this.f10324i = j10;
        this.f10325j = j11;
        this.f10326k = z11;
        this.f10327l = f14;
        this.f10328m = f15;
    }

    @Override // N6.AbstractC1447pb
    public final float a() {
        return this.f10323h;
    }

    @Override // N6.AbstractC1447pb
    public final float b() {
        return this.f10322g;
    }

    @Override // N6.AbstractC1447pb
    public final float c() {
        return this.f10320e;
    }

    @Override // N6.AbstractC1447pb
    public final float d() {
        return this.f10319d;
    }

    @Override // N6.AbstractC1447pb
    public final float e() {
        return this.f10327l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1447pb) {
            AbstractC1447pb abstractC1447pb = (AbstractC1447pb) obj;
            if (this.f10317b == abstractC1447pb.h() && this.f10318c == abstractC1447pb.g() && Float.floatToIntBits(this.f10319d) == Float.floatToIntBits(abstractC1447pb.d()) && Float.floatToIntBits(this.f10320e) == Float.floatToIntBits(abstractC1447pb.c()) && this.f10321f == abstractC1447pb.l() && Float.floatToIntBits(this.f10322g) == Float.floatToIntBits(abstractC1447pb.b()) && Float.floatToIntBits(this.f10323h) == Float.floatToIntBits(abstractC1447pb.a()) && this.f10324i == abstractC1447pb.j() && this.f10325j == abstractC1447pb.i() && this.f10326k == abstractC1447pb.k() && Float.floatToIntBits(this.f10327l) == Float.floatToIntBits(abstractC1447pb.e()) && Float.floatToIntBits(this.f10328m) == Float.floatToIntBits(abstractC1447pb.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // N6.AbstractC1447pb
    public final float f() {
        return this.f10328m;
    }

    @Override // N6.AbstractC1447pb
    public final int g() {
        return this.f10318c;
    }

    @Override // N6.AbstractC1447pb
    public final int h() {
        return this.f10317b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10328m) ^ ((((((((((((((((((((((this.f10317b ^ 1000003) * 1000003) ^ this.f10318c) * 1000003) ^ Float.floatToIntBits(this.f10319d)) * 1000003) ^ Float.floatToIntBits(this.f10320e)) * 1000003) ^ (true != this.f10321f ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f10322g)) * 1000003) ^ Float.floatToIntBits(this.f10323h)) * 1000003) ^ ((int) this.f10324i)) * 1000003) ^ ((int) this.f10325j)) * 1000003) ^ (true != this.f10326k ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f10327l)) * 1000003);
    }

    @Override // N6.AbstractC1447pb
    public final long i() {
        return this.f10325j;
    }

    @Override // N6.AbstractC1447pb
    public final long j() {
        return this.f10324i;
    }

    @Override // N6.AbstractC1447pb
    public final boolean k() {
        return this.f10326k;
    }

    @Override // N6.AbstractC1447pb
    public final boolean l() {
        return this.f10321f;
    }

    public final String toString() {
        return "AutoZoomOptions{recentFramesToCheck=" + this.f10317b + ", recentFramesContainingPredictedArea=" + this.f10318c + ", recentFramesIou=" + this.f10319d + ", maxCoverage=" + this.f10320e + ", useConfidenceScore=" + this.f10321f + ", lowerConfidenceScore=" + this.f10322g + ", higherConfidenceScore=" + this.f10323h + ", zoomIntervalInMillis=" + this.f10324i + ", resetIntervalInMillis=" + this.f10325j + ", enableZoomThreshold=" + this.f10326k + ", zoomInThreshold=" + this.f10327l + ", zoomOutThreshold=" + this.f10328m + "}";
    }
}
