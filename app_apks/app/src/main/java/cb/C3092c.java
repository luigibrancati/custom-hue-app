package cb;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3092c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26470d;

    public C3092c() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public final float a() {
        return this.f26470d;
    }

    public final float b() {
        return this.f26467a;
    }

    public final float c() {
        return this.f26468b;
    }

    public final float d() {
        return this.f26469c;
    }

    public final void e(float f10) {
        this.f26470d = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3092c)) {
            return false;
        }
        C3092c c3092c = (C3092c) obj;
        return Float.compare(this.f26467a, c3092c.f26467a) == 0 && Float.compare(this.f26468b, c3092c.f26468b) == 0 && Float.compare(this.f26469c, c3092c.f26469c) == 0 && Float.compare(this.f26470d, c3092c.f26470d) == 0;
    }

    public final void f(float f10) {
        this.f26467a = f10;
    }

    public final void g(float f10) {
        this.f26468b = f10;
    }

    public final void h(float f10) {
        this.f26469c = f10;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f26467a) * 31) + Float.hashCode(this.f26468b)) * 31) + Float.hashCode(this.f26469c)) * 31) + Float.hashCode(this.f26470d);
    }

    public final float[] i() {
        return new float[]{this.f26467a, this.f26468b, this.f26469c, this.f26470d};
    }

    public String toString() {
        return "Float4(x=" + this.f26467a + ", y=" + this.f26468b + ", z=" + this.f26469c + ", w=" + this.f26470d + ')';
    }

    public C3092c(float f10, float f11, float f12, float f13) {
        this.f26467a = f10;
        this.f26468b = f11;
        this.f26469c = f12;
        this.f26470d = f13;
    }

    public /* synthetic */ C3092c(float f10, float f11, float f12, float f13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3092c(C3091b v10, float f10) {
        this(v10.a(), v10.b(), v10.c(), f10);
        AbstractC4862t.e(v10, "v");
    }

    public /* synthetic */ C3092c(C3091b c3091b, float f10, int i10, AbstractC4854k abstractC4854k) {
        this(c3091b, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
