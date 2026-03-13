package x;

import android.util.Range;
import x.T1;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6213d extends T1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range f46912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46913j;

    public C6213d(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        this.f46904a = i10;
        this.f46905b = z10;
        this.f46906c = i11;
        this.f46907d = z11;
        this.f46908e = z12;
        this.f46909f = z13;
        this.f46910g = z14;
        this.f46911h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f46912i = range;
        this.f46913j = z16;
    }

    @Override // x.T1.d
    public int a() {
        return this.f46904a;
    }

    @Override // x.T1.d
    public int b() {
        return this.f46906c;
    }

    @Override // x.T1.d
    public Range c() {
        return this.f46912i;
    }

    @Override // x.T1.d
    public boolean d() {
        return this.f46905b;
    }

    @Override // x.T1.d
    public boolean e() {
        return this.f46910g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T1.d) {
            T1.d dVar = (T1.d) obj;
            if (this.f46904a == dVar.a() && this.f46905b == dVar.d() && this.f46906c == dVar.b() && this.f46907d == dVar.g() && this.f46908e == dVar.i() && this.f46909f == dVar.f() && this.f46910g == dVar.e() && this.f46911h == dVar.k() && this.f46912i.equals(dVar.c()) && this.f46913j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // x.T1.d
    public boolean f() {
        return this.f46909f;
    }

    @Override // x.T1.d
    public boolean g() {
        return this.f46907d;
    }

    @Override // x.T1.d
    public boolean h() {
        return this.f46913j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f46904a ^ 1000003) * 1000003) ^ (this.f46905b ? 1231 : 1237)) * 1000003) ^ this.f46906c) * 1000003) ^ (this.f46907d ? 1231 : 1237)) * 1000003) ^ (this.f46908e ? 1231 : 1237)) * 1000003) ^ (this.f46909f ? 1231 : 1237)) * 1000003) ^ (this.f46910g ? 1231 : 1237)) * 1000003) ^ (this.f46911h ? 1231 : 1237)) * 1000003) ^ this.f46912i.hashCode()) * 1000003) ^ (this.f46913j ? 1231 : 1237);
    }

    @Override // x.T1.d
    public boolean i() {
        return this.f46908e;
    }

    @Override // x.T1.d
    public boolean k() {
        return this.f46911h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f46904a + ", hasVideoCapture=" + this.f46905b + ", getRequiredMaxBitDepth=" + this.f46906c + ", isPreviewStabilizationOn=" + this.f46907d + ", isUltraHdrOn=" + this.f46908e + ", isHighSpeedOn=" + this.f46909f + ", isFeatureComboInvocation=" + this.f46910g + ", requiresFeatureComboQuery=" + this.f46911h + ", getTargetFpsRange=" + this.f46912i + ", isStrictFpsRequired=" + this.f46913j + "}";
    }
}
