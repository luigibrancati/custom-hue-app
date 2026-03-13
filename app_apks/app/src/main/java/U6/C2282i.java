package U6;

import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2282i extends C2279f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2276c f16683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16684f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2282i(C2276c c2276c, float f10) {
        C2276c c2276c2 = (C2276c) AbstractC6056k.m(c2276c, "bitmapDescriptor must not be null");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(c2276c2, f10);
        this.f16683e = c2276c;
        this.f16684f = f10;
    }

    @Override // U6.C2279f
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f16683e) + " refWidth=" + this.f16684f + "]";
    }
}
