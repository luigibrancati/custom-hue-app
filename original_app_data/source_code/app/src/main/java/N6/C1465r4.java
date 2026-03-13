package N6;

import H8.d;

/* JADX INFO: renamed from: N6.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1465r4 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1465r4 f10437a = new C1465r4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f10438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f10439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f10440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f10441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H8.d f10442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f10443g;

    static {
        d.b bVarA = H8.d.a("maxMs");
        M1 m12 = new M1();
        m12.a(1);
        f10438b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("minMs");
        M1 m13 = new M1();
        m13.a(2);
        f10439c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("avgMs");
        M1 m14 = new M1();
        m14.a(3);
        f10440d = bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("firstQuartileMs");
        M1 m15 = new M1();
        m15.a(4);
        f10441e = bVarA4.b(m15.b()).a();
        d.b bVarA5 = H8.d.a("medianMs");
        M1 m16 = new M1();
        m16.a(5);
        f10442f = bVarA5.b(m16.b()).a();
        d.b bVarA6 = H8.d.a("thirdQuartileMs");
        M1 m17 = new M1();
        m17.a(6);
        f10443g = bVarA6.b(m17.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A7 a72 = (A7) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f10438b, a72.c());
        fVar.e(f10439c, a72.e());
        fVar.e(f10440d, a72.a());
        fVar.e(f10441e, a72.b());
        fVar.e(f10442f, a72.d());
        fVar.e(f10443g, a72.f());
    }
}
