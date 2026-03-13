package o9;

/* JADX INFO: renamed from: o9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5237a implements I8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I8.a f41301a = new C5237a();

    /* JADX INFO: renamed from: o9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0549a implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0549a f41302a = new C0549a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f41303b = H8.d.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f41304c = H8.d.d("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f41305d = H8.d.d("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f41306e = H8.d.d("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f41307f = H8.d.d("templateVersion");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC5240d abstractC5240d, H8.f fVar) {
            fVar.e(f41303b, abstractC5240d.d());
            fVar.e(f41304c, abstractC5240d.f());
            fVar.e(f41305d, abstractC5240d.b());
            fVar.e(f41306e, abstractC5240d.c());
            fVar.b(f41307f, abstractC5240d.e());
        }
    }

    @Override // I8.a
    public void a(I8.b bVar) {
        C0549a c0549a = C0549a.f41302a;
        bVar.a(AbstractC5240d.class, c0549a);
        bVar.a(C5238b.class, c0549a);
    }
}
