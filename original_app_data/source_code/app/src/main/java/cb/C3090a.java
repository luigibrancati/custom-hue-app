package cb;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: cb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3090a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26463b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3090a() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public final float a() {
        return this.f26462a;
    }

    public final float b() {
        return this.f26463b;
    }

    public final float[] c() {
        return new float[]{this.f26462a, this.f26463b};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3090a)) {
            return false;
        }
        C3090a c3090a = (C3090a) obj;
        return Float.compare(this.f26462a, c3090a.f26462a) == 0 && Float.compare(this.f26463b, c3090a.f26463b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f26462a) * 31) + Float.hashCode(this.f26463b);
    }

    public String toString() {
        return "Float2(x=" + this.f26462a + ", y=" + this.f26463b + ')';
    }

    public C3090a(float f10, float f11) {
        this.f26462a = f10;
        this.f26463b = f11;
    }

    public /* synthetic */ C3090a(float f10, float f11, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
