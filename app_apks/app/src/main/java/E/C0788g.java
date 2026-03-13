package E;

import L.k1;
import android.graphics.Matrix;

/* JADX INFO: renamed from: E.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0788g extends AbstractC0801m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f2977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f2980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2981e;

    public C0788g(k1 k1Var, long j10, int i10, Matrix matrix, int i11) {
        if (k1Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f2977a = k1Var;
        this.f2978b = j10;
        this.f2979c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f2980d = matrix;
        this.f2981e = i11;
    }

    @Override // E.AbstractC0801m0, E.InterfaceC0787f0
    public int b() {
        return this.f2981e;
    }

    @Override // E.AbstractC0801m0, E.InterfaceC0787f0
    public k1 c() {
        return this.f2977a;
    }

    @Override // E.AbstractC0801m0, E.InterfaceC0787f0
    public int d() {
        return this.f2979c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0801m0) {
            AbstractC0801m0 abstractC0801m0 = (AbstractC0801m0) obj;
            if (this.f2977a.equals(abstractC0801m0.c()) && this.f2978b == abstractC0801m0.getTimestamp() && this.f2979c == abstractC0801m0.d() && this.f2980d.equals(abstractC0801m0.f()) && this.f2981e == abstractC0801m0.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.AbstractC0801m0
    public Matrix f() {
        return this.f2980d;
    }

    @Override // E.AbstractC0801m0, E.InterfaceC0787f0
    public long getTimestamp() {
        return this.f2978b;
    }

    public int hashCode() {
        int iHashCode = (this.f2977a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f2978b;
        return this.f2981e ^ ((((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f2979c) * 1000003) ^ this.f2980d.hashCode()) * 1000003);
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f2977a + ", timestamp=" + this.f2978b + ", rotationDegrees=" + this.f2979c + ", sensorToBufferTransformMatrix=" + this.f2980d + ", flashState=" + this.f2981e + "}";
    }
}
