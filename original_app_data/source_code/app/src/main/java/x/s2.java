package x;

import L.C1092d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class s2 implements E.Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f47131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f47133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f47134d;

    public s2(float f10, float f11) {
        this.f47132b = f10;
        this.f47133c = f11;
    }

    @Override // E.Y0
    public float a() {
        return this.f47132b;
    }

    @Override // E.Y0
    public float b() {
        return this.f47134d;
    }

    @Override // E.Y0
    public float c() {
        return this.f47133c;
    }

    @Override // E.Y0
    public float d() {
        return this.f47131a;
    }

    public void e(float f10) {
        if (f10 <= 1.0f && f10 >= 0.0f) {
            this.f47134d = f10;
            this.f47131a = C1092d.v(f10, this.f47133c, this.f47132b);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
    }

    public void f(float f10) {
        float f11 = this.f47132b;
        if (f10 <= f11) {
            float f12 = this.f47133c;
            if (f10 >= f12) {
                this.f47131a = f10;
                this.f47134d = C1092d.t(f10, f12, f11);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f47133c + " , " + this.f47132b + "]");
    }
}
