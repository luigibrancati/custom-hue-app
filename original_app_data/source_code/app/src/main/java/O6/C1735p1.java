package O6;

import H8.d;

/* JADX INFO: renamed from: O6.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1735p1 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1735p1 f11803a = new C1735p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f11804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f11805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f11806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f11807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H8.d f11808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f11809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H8.d f11810h;

    static {
        d.b bVarA = H8.d.a("durationMs");
        C1663f c1663f = new C1663f();
        c1663f.a(1);
        f11804b = bVarA.b(c1663f.b()).a();
        d.b bVarA2 = H8.d.a("imageSource");
        C1663f c1663f2 = new C1663f();
        c1663f2.a(2);
        f11805c = bVarA2.b(c1663f2.b()).a();
        d.b bVarA3 = H8.d.a("imageFormat");
        C1663f c1663f3 = new C1663f();
        c1663f3.a(3);
        f11806d = bVarA3.b(c1663f3.b()).a();
        d.b bVarA4 = H8.d.a("imageByteSize");
        C1663f c1663f4 = new C1663f();
        c1663f4.a(4);
        f11807e = bVarA4.b(c1663f4.b()).a();
        d.b bVarA5 = H8.d.a("imageWidth");
        C1663f c1663f5 = new C1663f();
        c1663f5.a(5);
        f11808f = bVarA5.b(c1663f5.b()).a();
        d.b bVarA6 = H8.d.a("imageHeight");
        C1663f c1663f6 = new C1663f();
        c1663f6.a(6);
        f11809g = bVarA6.b(c1663f6.b()).a();
        d.b bVarA7 = H8.d.a("rotationDegrees");
        C1663f c1663f7 = new C1663f();
        c1663f7.a(7);
        f11810h = bVarA7.b(c1663f7.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A3 a32 = (A3) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f11804b, a32.g());
        fVar.e(f11805c, a32.b());
        fVar.e(f11806d, a32.a());
        fVar.e(f11807e, a32.c());
        fVar.e(f11808f, a32.e());
        fVar.e(f11809g, a32.d());
        fVar.e(f11810h, a32.f());
    }
}
