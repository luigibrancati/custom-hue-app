package w8;

/* JADX INFO: renamed from: w8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6164a implements I8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I8.a f46323a = new C6164a();

    /* JADX INFO: renamed from: w8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0635a implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0635a f46324a = new C0635a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f46325b = H8.d.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f46326c = H8.d.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f46327d = H8.d.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f46328e = H8.d.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f46329f = H8.d.d("templateVersion");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, H8.f fVar) {
            fVar.e(f46325b, jVar.e());
            fVar.e(f46326c, jVar.c());
            fVar.e(f46327d, jVar.d());
            fVar.e(f46328e, jVar.g());
            fVar.b(f46329f, jVar.f());
        }
    }

    @Override // I8.a
    public void a(I8.b bVar) {
        C0635a c0635a = C0635a.f46324a;
        bVar.a(j.class, c0635a);
        bVar.a(C6165b.class, c0635a);
    }
}
