package M1;

/* JADX INFO: renamed from: M1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1201d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1201d f9106d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9109c;

    /* JADX INFO: renamed from: M1.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9112c;

        public C1201d d() {
            if (this.f9110a || !(this.f9111b || this.f9112c)) {
                return new C1201d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f9110a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f9111b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f9112c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1201d.class == obj.getClass()) {
            C1201d c1201d = (C1201d) obj;
            if (this.f9107a == c1201d.f9107a && this.f9108b == c1201d.f9108b && this.f9109c == c1201d.f9109c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9107a ? 1 : 0) << 2) + ((this.f9108b ? 1 : 0) << 1) + (this.f9109c ? 1 : 0);
    }

    public C1201d(b bVar) {
        this.f9107a = bVar.f9110a;
        this.f9108b = bVar.f9111b;
        this.f9109c = bVar.f9112c;
    }
}
