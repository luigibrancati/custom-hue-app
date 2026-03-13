package E;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f2784d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X0.d f2786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X0.d f2787c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f2788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public X0.d f2789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public X0.d f2790c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f2788a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.f2789b = X0.d.a(fValueOf2, fValueOf2);
            this.f2790c = X0.d.a(fValueOf, fValueOf);
        }

        public I a() {
            return new I(this.f2788a, this.f2789b, this.f2790c);
        }

        public b b(float f10) {
            this.f2788a = f10;
            return this;
        }

        public b c(float f10, float f11) {
            this.f2789b = X0.d.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }

        public b d(float f10, float f11) {
            this.f2790c = X0.d.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }
    }

    public float a() {
        return this.f2785a;
    }

    public X0.d b() {
        return this.f2786b;
    }

    public X0.d c() {
        return this.f2787c;
    }

    public I(float f10, X0.d dVar, X0.d dVar2) {
        this.f2785a = f10;
        this.f2786b = dVar;
        this.f2787c = dVar2;
    }
}
