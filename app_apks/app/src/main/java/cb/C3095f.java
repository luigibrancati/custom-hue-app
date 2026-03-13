package cb;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cb.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3095f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26476e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26480d;

    /* JADX INFO: renamed from: cb.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C3095f a(C3091b axis, float f10) {
            AbstractC4862t.e(axis, "axis");
            double d10 = f10 * 0.017453292f * 0.5f;
            float fSin = (float) Math.sin(d10);
            C3091b c3091bA = i.a(axis);
            return new C3095f(new C3091b(c3091bA.a() * fSin, c3091bA.b() * fSin, fSin * c3091bA.c()), (float) Math.cos(d10));
        }

        public a() {
        }
    }

    public C3095f() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public final float a() {
        return this.f26480d;
    }

    public final float b() {
        return this.f26477a;
    }

    public final float c() {
        return this.f26478b;
    }

    public final float d() {
        return this.f26479c;
    }

    public final float[] e() {
        return new float[]{this.f26477a, this.f26478b, this.f26479c, this.f26480d};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3095f)) {
            return false;
        }
        C3095f c3095f = (C3095f) obj;
        return Float.compare(this.f26477a, c3095f.f26477a) == 0 && Float.compare(this.f26478b, c3095f.f26478b) == 0 && Float.compare(this.f26479c, c3095f.f26479c) == 0 && Float.compare(this.f26480d, c3095f.f26480d) == 0;
    }

    public final C3095f f() {
        return new C3095f(-this.f26477a, -this.f26478b, -this.f26479c, -this.f26480d);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f26477a) * 31) + Float.hashCode(this.f26478b)) * 31) + Float.hashCode(this.f26479c)) * 31) + Float.hashCode(this.f26480d);
    }

    public String toString() {
        return "Quaternion(x=" + this.f26477a + ", y=" + this.f26478b + ", z=" + this.f26479c + ", w=" + this.f26480d + ')';
    }

    public C3095f(float f10, float f11, float f12, float f13) {
        this.f26477a = f10;
        this.f26478b = f11;
        this.f26479c = f12;
        this.f26480d = f13;
    }

    public /* synthetic */ C3095f(float f10, float f11, float f12, float f13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 1.0f : f13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3095f(C3091b v10, float f10) {
        this(v10.a(), v10.b(), v10.c(), f10);
        AbstractC4862t.e(v10, "v");
    }
}
