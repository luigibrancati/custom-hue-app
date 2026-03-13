package N6;

import H8.d;

/* JADX INFO: renamed from: N6.x4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1543x4 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1543x4 f10539a = new C1543x4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f10540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f10541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f10542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f10543e;

    static {
        d.b bVarA = H8.d.a("imageFormat");
        M1 m12 = new M1();
        m12.a(1);
        f10540b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("originalImageSize");
        M1 m13 = new M1();
        m13.a(2);
        f10541c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("compressedImageSize");
        M1 m14 = new M1();
        m14.a(3);
        f10542d = bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("isOdmlImage");
        M1 m15 = new M1();
        m15.a(4);
        f10543e = bVarA4.b(m15.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        H7 h72 = (H7) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f10540b, h72.a());
        fVar.e(f10541c, h72.b());
        fVar.e(f10542d, null);
        fVar.e(f10543e, null);
    }
}
