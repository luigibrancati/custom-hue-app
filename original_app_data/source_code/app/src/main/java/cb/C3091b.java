package cb;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3091b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26466c;

    public C3091b() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float a() {
        return this.f26464a;
    }

    public final float b() {
        return this.f26465b;
    }

    public final float c() {
        return this.f26466c;
    }

    public final float[] d() {
        return new float[]{this.f26464a, this.f26465b, this.f26466c};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3091b)) {
            return false;
        }
        C3091b c3091b = (C3091b) obj;
        return Float.compare(this.f26464a, c3091b.f26464a) == 0 && Float.compare(this.f26465b, c3091b.f26465b) == 0 && Float.compare(this.f26466c, c3091b.f26466c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f26464a) * 31) + Float.hashCode(this.f26465b)) * 31) + Float.hashCode(this.f26466c);
    }

    public String toString() {
        return "Float3(x=" + this.f26464a + ", y=" + this.f26465b + ", z=" + this.f26466c + ')';
    }

    public C3091b(float f10, float f11, float f12) {
        this.f26464a = f10;
        this.f26465b = f11;
        this.f26466c = f12;
    }

    public /* synthetic */ C3091b(float f10, float f11, float f12, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12);
    }

    public C3091b(float f10) {
        this(f10, f10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3091b(C3091b v10) {
        this(v10.f26464a, v10.f26465b, v10.f26466c);
        AbstractC4862t.e(v10, "v");
    }
}
