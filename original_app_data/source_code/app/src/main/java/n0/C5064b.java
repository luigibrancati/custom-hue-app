package n0;

/* JADX INFO: renamed from: n0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5064b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f40476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f40477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f40478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f40479d;

    public C5064b(float f10, float f11, float f12, float f13) {
        this.f40476a = f10;
        this.f40477b = f11;
        this.f40478c = f12;
        this.f40479d = f13;
    }

    public final float a() {
        return this.f40479d;
    }

    public final float b() {
        return this.f40476a;
    }

    public final float c() {
        return this.f40478c;
    }

    public final float d() {
        return this.f40477b;
    }

    public final boolean e() {
        return (this.f40476a >= this.f40478c) | (this.f40477b >= this.f40479d);
    }

    public final void f(float f10) {
        this.f40479d = f10;
    }

    public final void g(float f10) {
        this.f40476a = f10;
    }

    public final void h(float f10) {
        this.f40478c = f10;
    }

    public final void i(float f10) {
        this.f40477b = f10;
    }

    public String toString() {
        return "MutableRect(" + AbstractC5063a.a(this.f40476a, 1) + ", " + AbstractC5063a.a(this.f40477b, 1) + ", " + AbstractC5063a.a(this.f40478c, 1) + ", " + AbstractC5063a.a(this.f40479d, 1) + ')';
    }
}
