package N6;

import H8.d;

/* JADX INFO: renamed from: N6.z6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1571z6 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1571z6 f10568a = new C1571z6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f10569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f10570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f10571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f10572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H8.d f10573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f10574g;

    static {
        d.b bVarA = H8.d.a("appName");
        M1 m12 = new M1();
        m12.a(1);
        f10569b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("sessionId");
        M1 m13 = new M1();
        m13.a(2);
        f10570c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("startZoomLevel");
        M1 m14 = new M1();
        m14.a(3);
        f10571d = bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("endZoomLevel");
        M1 m15 = new M1();
        m15.a(4);
        f10572e = bVarA4.b(m15.b()).a();
        d.b bVarA5 = H8.d.a("durationMs");
        M1 m16 = new M1();
        m16.a(5);
        f10573f = bVarA5.b(m16.b()).a();
        d.b bVarA6 = H8.d.a("predictedArea");
        M1 m17 = new M1();
        m17.a(6);
        f10574g = bVarA6.b(m17.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        U9 u92 = (U9) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f10569b, u92.e());
        fVar.e(f10570c, u92.f());
        fVar.e(f10571d, u92.c());
        fVar.e(f10572e, u92.b());
        fVar.e(f10573f, u92.d());
        fVar.e(f10574g, u92.a());
    }
}
